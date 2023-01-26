package games.twinhead.compressed.registry;

import games.twinhead.compressed.Compressed;
import games.twinhead.compressed.block.CompressedBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;


public class CreativeTab {

    public static final ItemGroup ITEM_GROUP = new ItemGroup(Compressed.MOD_ID + ".creative_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(CompressedBlocks.COBBLESTONE.getBlock(4).get());
        }
    };
}
