package games.twinhead.compressed;

import games.twinhead.compressed.block.CompressedBlocks;
import games.twinhead.compressed.screen.CompactorScreen;
import games.twinhead.compressed.screen.ModScreenHandlers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.client.color.item.ItemColorProvider;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.client.color.world.GrassColors;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;

public class Client implements ClientModInitializer {
	@Override
	public void onInitializeClient() {

		if(!FabricLoader.getInstance().isModLoaded("sodium"))
			Colors();
		GlassTransparency();

		HandledScreens.register(ModScreenHandlers.COMPACTOR_SCREEN_HANDLER, CompactorScreen::new);

	}

	private void Colors(){
		for (CompressedBlocks compressedBlock: CompressedBlocks.values()) {
			ItemColorProvider itemColor = null;
			BlockColorProvider blockColor = null;

			switch (compressedBlock){
				case OAK_LEAVES,
						JUNGLE_LEAVES,
						ACACIA_LEAVES,
						DARK_OAK_LEAVES,
						MANGROVE_LEAVES
								-> {
					blockColor = ((state, world, pos, tintIndex) ->
							world != null && pos != null ? BiomeColors.getFoliageColor(world, pos) : FoliageColors.getDefaultColor());
					itemColor = (stack, tintIndex) -> FoliageColors.getDefaultColor();

				}
				case SPRUCE_LEAVES -> {
					blockColor =(state, world, pos, tintIndex) -> FoliageColors.getSpruceColor();
					itemColor = (stack, tintIndex) -> FoliageColors.getSpruceColor();
				}
				case BIRCH_LEAVES -> {
					blockColor =(state, world, pos, tintIndex) -> FoliageColors.getBirchColor();
					itemColor = (stack, tintIndex) -> FoliageColors.getSpruceColor();
				}
				case GRASS_BLOCK -> {
					blockColor = (state, world, pos, tintIndex) -> world != null && pos != null ? BiomeColors.getGrassColor(world, pos) : GrassColors.getColor(0.5, 1.0);
					itemColor = (stack, tintIndex) -> GrassColors.getColor(0.5, 1.0);
				}
			}

			for (int i = 0; i < compressedBlock.getCompression(); i++) {
					ColorProviderRegistry.BLOCK.register(blockColor, compressedBlock.getBlock(i+1));
					ColorProviderRegistry.ITEM.register(itemColor, compressedBlock.getBlock(i+1).asItem());
			}

		}



	}

	private void GlassTransparency(){
		for (CompressedBlocks compressedBlock: CompressedBlocks.values()) {
			for (int i = 0; i < compressedBlock.getCompression(); i++) {
				BlockRenderLayerMap.INSTANCE.putBlock(compressedBlock.getBlock(i + 1), RenderLayer.getTranslucent());
			}
		}

	}
}
