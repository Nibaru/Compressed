package games.twinhead.compressed.registry;

import games.twinhead.compressed.Compressed;
import games.twinhead.compressed.block.CompactorBlock;
import games.twinhead.compressed.block.CompressedBlockItem;
import games.twinhead.compressed.block.CompressedBlocks;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;
import java.util.function.Supplier;

public class RegisterBlocks {
    public static HashMap<String, RegistryObject<Block>> compressedBlocks = new HashMap<>();


    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Compressed.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Compressed.MOD_ID);


    public static final RegistryObject<Block> COMPACTOR = BLOCKS.register("compactor", () -> new CompactorBlock(AbstractBlock.Settings.copy(Blocks.DISPENSER)));
    public static final RegistryObject<Block> CHARCOAL_BLOCK = BLOCKS.register("charcoal_block", () -> new Block(AbstractBlock.Settings.copy(Blocks.COAL_BLOCK)));

    public static final RegistryObject<Item> COMPACTOR_ITEM = ITEMS.register("compactor", () -> new CompressedBlockItem(COMPACTOR.get(), new Item.Settings(), "compactor", 0));
    public static final RegistryObject<Item> CHARCOAL_BLOCK_ITEM = ITEMS.register("charcoal_block", () -> new CompressedBlockItem(CHARCOAL_BLOCK.get(), new Item.Settings(), "charcoal_block", 16000));


//    private static void registerBlock(String name, Block block, int burnTime) {
//
//        Registry.register(Registries.BLOCK, new Identifier(Compressed.MOD_ID, name), block);
//
//        compressedBlocks.put(name, block);
//
//        Item item = new CompressedBlockItem(block, new Item.Settings(), name, burnTime);
//
//        //if(burnTime > 0)
//            //FuelRegistry.INSTANCE.add(item, burnTime);
//
//        RegisterItems.registerItem(name, item);
//    }



    public static void registerBlocks(IEventBus MOD_BUS){

        for(CompressedBlocks block: CompressedBlocks.values()){
            for(int i=0; i<block.getCompression();i++){
                String name = block.getName(i+1);
                RegistryObject<Block> blockSupplier = BLOCKS.register(name,() -> getBlock(block));
                compressedBlocks.put(name, blockSupplier);
                ITEMS.register(name, () -> new CompressedBlockItem(blockSupplier.get(), new Item.Settings(), name, block.getBurnTime()));
            }
        }

        BLOCKS.register(MOD_BUS);
        ITEMS.register(MOD_BUS);
    }

    public static Block getBlock(CompressedBlocks block){
        return switch (block){
            case ACACIA_LOG,
                    BIRCH_LOG,
                    CRIMSON_STEM,
                    DARK_OAK_LOG,
                    JUNGLE_LOG,
                    OAK_LOG,
                    SPRUCE_LOG,
                    BONE_BLOCK,
                    WARPED_STEM,
                    BASALT,
                    MANGROVE_LOG -> new PillarBlock(getSettingsFromBlock(block.getCopyBlock()));
            case SAND, GRAVEL, RED_SAND -> new FallingBlock(getSettingsFromBlock(block.getCopyBlock()));
            case HAY_BLOCK -> new HayBlock(getSettingsFromBlock(block.getCopyBlock()));
            case HONEY_BLOCK -> new HoneyBlock(getSettingsFromBlock(block.getCopyBlock()));
            case SLIME_BLOCK -> new SlimeBlock(getSettingsFromBlock(block.getCopyBlock()));
            case MAGMA_BLOCK -> new MagmaBlock(getSettingsFromBlock(block.getCopyBlock()));
            case REDSTONE_BLOCK -> new RedstoneBlock(getSettingsFromBlock(block.getCopyBlock()));
            case REDSTONE_ORE, DEEPSLATE_REDSTONE_ORE -> new RedstoneOreBlock(getSettingsFromBlock(block.getCopyBlock()));
            case GLASS,
                    WHITE_STAINED_GLASS,
                    YELLOW_STAINED_GLASS,
                    BLACK_STAINED_GLASS,
                    RED_STAINED_GLASS,
                    PURPLE_STAINED_GLASS,
                    PINK_STAINED_GLASS,
                    ORANGE_STAINED_GLASS,
                    MAGENTA_STAINED_GLASS,
                    LIME_STAINED_GLASS,
                    LIGHT_GRAY_STAINED_GLASS,
                    LIGHT_BLUE_STAINED_GLASS,
                    GREEN_STAINED_GLASS,
                    GRAY_STAINED_GLASS,
                    CYAN_STAINED_GLASS,
                    BROWN_STAINED_GLASS,
                    BLUE_STAINED_GLASS
                    -> new GlassBlock(getSettingsFromBlock(block.getCopyBlock()));
            default -> new Block(getSettingsFromBlock(block.getCopyBlock()));
        };
    }

    public static AbstractBlock.Settings getSettingsFromBlock(Block block){

        AbstractBlock.Settings settings = AbstractBlock.Settings.of(block.getDefaultState().getMaterial())
                .sounds(block.getDefaultState().getSoundGroup())
                .luminance((view) -> block.getDefaultState().getLuminance())
                .mapColor(block.getDefaultMapColor())
                .hardness(block.getHardness())
                .resistance(block.getBlastResistance())
                .velocityMultiplier(block.getVelocityMultiplier())
                .slipperiness(block.getSlipperiness())

                ;


        if (!block.getDefaultState().isOpaque()){
            settings = settings.nonOpaque();
        }
        if (block.getDefaultState().isToolRequired()){
            settings = settings.requiresTool();
        }

        if (block.getDefaultState().hasRandomTicks()){
            settings = settings.ticksRandomly();
        }

        return settings;


    }
}
