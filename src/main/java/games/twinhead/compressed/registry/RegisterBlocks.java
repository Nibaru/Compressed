package games.twinhead.compressed.registry;

import games.twinhead.compressed.Compressed;
import games.twinhead.compressed.CompressedBlockItem;
import games.twinhead.compressed.CompressedBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;
import java.util.HashMap;

public class RegisterBlocks {
    public static final String[] colorNames = new String[]{"white", "yellow", "black", "red", "purple", "pink", "orange", "magenta", "lime", "light_gray", "light_blue", "green", "gray", "cyan", "brown", "blue"};

    public static HashMap<String, Block> compressedLeaves = new HashMap<>();

    private static Block registerBlock(String name, AbstractBlock block, int burnTime) {
        Block b = (Block) block;
        Registry.register(Registry.BLOCK, new Identifier(Compressed.MOD_ID, name),(Block) block);
        Item.Settings settings = new Item.Settings().group(Compressed.COMPRESSED_GROUP);
        BlockItem item = new CompressedBlockItem((Block) block, settings, name, burnTime);
        if(burnTime > 0)
            FuelRegistry.INSTANCE.add(item, burnTime);

        RegisterItems.registerItem(name, item);

        if(name.contains("leaves"))
            compressedLeaves.put(name, (Block) block);
        return (Block) block;
    }

    private static void registerCompressedBlocks(){
        registerBlock("charcoal_block", new Block(FabricBlockSettings.copyOf(Blocks.COAL_BLOCK)), 16000);

        for (CompressedBlocks block : CompressedBlocks.values()) {
            for (int i = 0; i < block.getCompression(); i++) {
                if(block.isColorBlock()){
                    for (int j = 0; j < colorNames.length; j++)
                        registerBlock(colorNames[j] +"_"+ block.getName(i+1), block.getColorBlock(), block.getBurnTime());
                }else{
                    if(i>4){
                        registerBlock(block.getName(i+1), block.getWitherProofBlock(), block.getBurnTime());
                    } else {
                        registerBlock(block.getName(i+1), block.getBlock(), block.getBurnTime());
                    }
                }
            }
        }
    }
    public static void register(){
        registerCompressedBlocks();

   }
}
