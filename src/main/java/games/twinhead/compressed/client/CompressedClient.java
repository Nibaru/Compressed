package games.twinhead.compressed.client;

import games.twinhead.compressed.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.client.color.item.ItemColorProvider;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.client.color.world.GrassColors;
import net.minecraft.client.render.RenderLayer;

public class CompressedClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        Colors();
        for (ModBlocks block: ModBlocks.values()) {
            for (int i = 0; i < block.getMaxCompression(); i++) {
                BlockRenderLayerMap.INSTANCE.putBlock(block.get(i + 1), RenderLayer.getTranslucent());
            }
        }
    }



    private void Colors(){
        for (ModBlocks compressedBlock: ModBlocks.values()) {
            switch (compressedBlock){
                case OAK_LEAVES,
                JUNGLE_LEAVES,
                ACACIA_LEAVES,
                DARK_OAK_LEAVES,
                MANGROVE_LEAVES -> registerColor(compressedBlock, (state, world, pos, tintIndex) -> world != null && pos != null ? BiomeColors.getFoliageColor(world, pos) : FoliageColors.getDefaultColor(), (stack, tintIndex) -> FoliageColors.getDefaultColor());
                case SPRUCE_LEAVES -> registerColor(compressedBlock, (state, world, pos, tintIndex) -> FoliageColors.getSpruceColor(), (stack, tintIndex) -> FoliageColors.getSpruceColor());
                case BIRCH_LEAVES -> registerColor(compressedBlock, (state, world, pos, tintIndex) -> FoliageColors.getBirchColor(), (stack, tintIndex) -> FoliageColors.getBirchColor());
                case GRASS_BLOCK -> registerColor(compressedBlock, (state, world, pos, tintIndex) -> world != null && pos != null ? BiomeColors.getGrassColor(world, pos) : GrassColors.getColor(0.5, 1.0), (stack, tintIndex) -> GrassColors.getColor(0.5, 1.0));
            }
        }
    }

    private void registerColor(ModBlocks block, BlockColorProvider blockColor, ItemColorProvider itemColor){
        for (int i = 0; i < block.getMaxCompression(); i++) {
            ColorProviderRegistry.BLOCK.register(blockColor, block.get(i+1));
            ColorProviderRegistry.ITEM.register(itemColor, block.get(i+1).asItem());
        }
    }
}
