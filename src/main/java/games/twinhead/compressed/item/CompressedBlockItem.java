package games.twinhead.compressed.item;

import games.twinhead.compressed.Compressed;
import net.minecraft.block.Block;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

import java.text.DecimalFormat;
import java.util.List;

public class CompressedBlockItem extends BlockItem {

    private final Item parent;
    private final int compression;

    public CompressedBlockItem(Block block, Item parent, int compression, Settings settings) {
        super(block, settings);
        this.parent = parent;
        this.compression = compression;
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        if(Screen.hasShiftDown()){
            DecimalFormat df = new DecimalFormat("#");
            df.setGroupingSize(3);
            df.setGroupingUsed(true);
            tooltip.add(Text.of("§7 x" + df.format(getNumberOfBlocks(itemStack))));
        }
    }

    public Text getName(ItemStack stack) {
        if (stack.hasCustomName()) return stack.getName();
        return new TranslatableText(parent.getTranslationKey()).append(" " + Compressed.intToRoman(compression).toUpperCase());
    }

    private double getNumberOfBlocks(ItemStack itemStack){
        return ((Math.pow(9, compression)) * itemStack.getCount());
    }


}
