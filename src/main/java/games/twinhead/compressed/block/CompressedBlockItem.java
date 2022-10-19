package games.twinhead.compressed.block;

import net.minecraft.block.Block;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.Arrays;
import java.util.List;

public class CompressedBlockItem extends BlockItem {

    private final int burnTime;
    private final String name;


    public CompressedBlockItem(Block block, Settings settings, String name, int burnTime) {
        super(block, settings);
        this.burnTime = burnTime;
        this.name = name;
    }


    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        if(!Screen.hasShiftDown()){
            tooltip.add(Text.translatable("tooltip.compressed.shift"));
        } else {
            tooltip.add(Text.translatable("tooltip.compressed.stack", String.format("%.0f", getNumberOfBlocks(itemStack)) , getFormattedName()));
            if(burnTime > 0)
                tooltip.add(Text.translatable("tooltip.compressed.fuel", burnTime));
            if(getCompression() > 4) //todo find out how to check if the block is in the tag wither_immune
                tooltip.add(Text.translatable("tooltip.compressed.witherproof"));
        }
    }

    public int getCompression(){
        String[] parts = name.split("_");
        return switch (parts[parts.length-1]){
            case "i" -> 1;
            case "ii" -> 2;
            case "iii" -> 3;
            case "iv" -> 4;
            case "v" -> 5;
            case "vi" -> 6;
            case "vii" -> 7;
            case "viii" -> 8;
            case "ix" -> 9;
            case "x" -> 10;
            default ->  0;
        };
    }

    public int getCompressedBurnTime(){
        return (9*getCompression())*burnTime;
    }

    public String getFormattedName(){
        String[] parts = name.split("_");

        StringBuilder finalName = new StringBuilder();
        for(String s: Arrays.copyOf(parts, parts.length-1)){
            finalName.append(s.substring(0, 1).toUpperCase()).append(s.substring(1).toLowerCase()).append(" ");
        }

        return finalName.toString();
    }

    public double getNumberOfBlocks(ItemStack itemStack){
        return ((Math.pow(9, getCompression())) * itemStack.getCount());
    }


}
