package games.twinhead.compressed.datagenerator;

import games.twinhead.compressed.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.registry.Registry;

public class TagGenerator extends FabricTagProvider<Block> {

    public TagGenerator(FabricDataGenerator output) {
        super(output, Registry.BLOCK, "compressed");
    }

    @Override
    protected void generateTags() {
        for (ModBlocks block: ModBlocks.values()) {
            for (int i = 0; i < block.getMaxCompression(); i++) {
                for (int j = 0; j < block.getBlockTags().length; j++) {
                    getOrCreateTagBuilder(block.getBlockTags()[j]).add(block.get(i + 1));
                }
            }
            if (block.getMaxCompression() > 4)
                getOrCreateTagBuilder(BlockTags.WITHER_IMMUNE).add(block.get(block.getMaxCompression()));
        }

    }
}
