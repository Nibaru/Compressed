package games.twinhead.compressed.block.entity;

import games.twinhead.compressed.screen.CompactorScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.CraftingInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.recipe.CraftingRecipe;
import net.minecraft.recipe.RecipeType;
import net.minecraft.screen.*;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class CompactorBlockEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(2, ItemStack.EMPTY);

    protected final PropertyDelegate propertyDelegate;
    private int progress = 0;
    private int maxProgress = 72;

    public CompactorBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.COMPACTOR.get(), pos, state);
        this.propertyDelegate = new PropertyDelegate() {
            public int get(int index) {
                return switch (index) {
                    case 0 -> CompactorBlockEntity.this.progress;
                    case 1 -> CompactorBlockEntity.this.maxProgress;
                    default -> 0;
                };
            }

            public void set(int index, int value) {
                switch (index) {
                    case 0 -> CompactorBlockEntity.this.progress = value;
                    case 1 -> CompactorBlockEntity.this.maxProgress = value;
                }
            }

            public int size() {
                return 2;
            }
        };
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }

    @Override
    public Text getDisplayName() {
        return new LiteralText("Compactor");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new CompactorScreenHandler(syncId, inv, this, this.propertyDelegate);
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, inventory);
        nbt.putInt("compactor.progress", progress);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        Inventories.readNbt(nbt, inventory);
        super.readNbt(nbt);
        progress = nbt.getInt("compactor.progress");
    }

    private void resetProgress() {
        this.progress = 0;
    }

    public static void tick(World world, BlockPos blockPos, BlockState state, CompactorBlockEntity entity) {
        if(world.isClient()) {
            return;
        }

        if(hasRecipe(entity)) {
            entity.progress++;
            markDirty(world, blockPos, state);
            if(entity.progress >= entity.maxProgress) {
                craftItem(entity);
            }
        } else {
            entity.resetProgress();
            markDirty(world, blockPos, state);
        }
    }

    private static void craftItem(CompactorBlockEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.inventory.size());
        for (int i = 0; i < entity.inventory.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        if(hasRecipe(entity)) {
            entity.setStack(1, new ItemStack(getCraftingOutput(entity, entity.getStack(0).getItem()), entity.getStack(1).getCount() + 1));

            if(entity.getStack(0).getCount() <= 9){
                entity.setStack(0, new ItemStack(Items.AIR));
            } else {
                entity.removeStack(0, 9);
            }

            entity.resetProgress();
        }
    }

    private static boolean hasRecipe(CompactorBlockEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for (int i = 0; i < entity.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        return inventory.getStack(0).getCount() >= 9 && itemHasCompactingRecipe(entity, entity.getStack(0).getItem()) && canInsertAmountIntoOutputSlot(inventory)
                && canInsertItemIntoOutputSlot(inventory, getCraftingOutput(entity, entity.getStack(0).getItem()));
    }

    private static boolean itemHasCompactingRecipe(CompactorBlockEntity entity, Item item){
        CraftingInventory ci = new CraftingInventory(new ScreenHandler((ScreenHandlerType)null, -1) {
            public ItemStack transferSlot(PlayerEntity player, int slot) {
                return ItemStack.EMPTY;
            }
            public boolean canUse(PlayerEntity player) {
                return false;
            }
        }, 3, 3);

        for (int i = 0; i < 9; i++) {
            ci.setStack(i, new ItemStack(item, 1));
        }

        Optional<CraftingRecipe> match = entity.getWorld().getRecipeManager().getFirstMatch(RecipeType.CRAFTING, ci, entity.getWorld());

        return !match.isEmpty();
    }

    private static Item getCraftingOutput(CompactorBlockEntity entity, Item item){
        CraftingInventory ci = new CraftingInventory(new ScreenHandler((ScreenHandlerType)null, -1) {
            public ItemStack transferSlot(PlayerEntity player, int slot) {
                return ItemStack.EMPTY;
            }
            public boolean canUse(PlayerEntity player) {
                return false;
            }
        }, 3, 3);

        for (int i = 0; i < 9; i++) {
            ci.setStack(i, new ItemStack(item, 1));
        }

        Optional<CraftingRecipe> match = entity.getWorld().getRecipeManager().getFirstMatch(RecipeType.CRAFTING, ci, entity.getWorld());
        return match.get().getOutput().getItem();
    }

    private static boolean canInsertItemIntoOutputSlot(SimpleInventory inventory, Item output) {
        return inventory.getStack(1).getItem() == output || inventory.getStack(1).isEmpty();
    }

    private static boolean canInsertAmountIntoOutputSlot(SimpleInventory inventory) {
        return inventory.getStack(1).getMaxCount() > inventory.getStack(1).getCount();
    }

    @Override
    public boolean canExtract(int slot, ItemStack stack, Direction side) {
        return slot == 1;
    }

    @Override
    public boolean canInsert(int slot, ItemStack stack, @Nullable Direction side) {
        CraftingInventory ci = new CraftingInventory(new ScreenHandler((ScreenHandlerType)null, -1) {
            public ItemStack transferSlot(PlayerEntity player, int slot) {
                return ItemStack.EMPTY;
            }
            public boolean canUse(PlayerEntity player) {
                return false;
            }
        }, 3, 3);

        for (int i = 0; i < 9; i++) {
            ci.setStack(i, new ItemStack(stack.getItem(), 1));
        }

        Optional<CraftingRecipe> match = this.getWorld().getRecipeManager().getFirstMatch(RecipeType.CRAFTING, ci, this.getWorld());

        return slot == 0 && !match.isEmpty();
    }
}
