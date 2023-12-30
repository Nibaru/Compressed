package games.twinhead.compressed.datagenerator;

import games.twinhead.compressed.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class TagGenerator extends FabricTagProvider.BlockTagProvider {

    public TagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
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
