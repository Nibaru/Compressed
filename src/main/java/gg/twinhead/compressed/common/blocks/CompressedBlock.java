package gg.twinhead.compressed.common.blocks;


import java.util.Arrays;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.util.InputMappings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import org.lwjgl.glfw.GLFW;

import javax.annotation.Nullable;
import java.util.List;

public class CompressedBlock extends BlockItem {
    public String blockName;
    public int blockSize;
    private String[] parts, output, blockArrayName;
    public CompressedBlock(Block block, Properties properties){
        super(block, properties);

        output = block.getRegistryName().toString().split(":");
        String name = output[1];
        parts = name.split("_");

        if(parts[parts.length-1].equals("i")){
            blockSize = (int)Math.pow(9, 1);
            properties.rarity(Rarity.COMMON);
        } else if(parts[parts.length-1].equals("ii")){
            blockSize = (int)Math.pow(9, 2);
            properties.rarity(Rarity.COMMON);
        } else if(parts[parts.length-1].equals("iii")){
            blockSize = (int)Math.pow(9, 3);
            properties.rarity(Rarity.UNCOMMON);
        } else if(parts[parts.length-1].equals("iv")){
            blockSize = (int)Math.pow(9, 4);
            properties.rarity(Rarity.RARE);
        } else if(parts[parts.length-1].equals("v")){
            blockSize = (int)Math.pow(9, 5);
            properties.rarity(Rarity.EPIC);
        } else{
            blockSize = 1;
            properties.rarity(Rarity.COMMON);
        }

        blockArrayName = Arrays.copyOf(parts, parts.length-1);
        blockName = String.join(" ", blockArrayName);
        blockName = String.join("Compressed ", parts[0].substring(0, 1).toUpperCase() + parts[0].substring(1));

    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        if(InputMappings.isKeyDown(Minecraft.getInstance().getMainWindow().getHandle(), GLFW.GLFW_KEY_LEFT_SHIFT)){
            tooltip.add(new StringTextComponent("\u00A77" + blockSize + " " + blockName));
        } else {
            tooltip.add(new StringTextComponent("\u00A77" +"Hold " + "\u00A7a" + "Shift" + "\u00A77" + " for info."));
        }

    }
}
