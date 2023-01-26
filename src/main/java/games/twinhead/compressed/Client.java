package games.twinhead.compressed;

import games.twinhead.compressed.block.CompressedBlocks;
import games.twinhead.compressed.screen.CompactorScreen;
import games.twinhead.compressed.screen.ModScreenHandlers;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.client.color.item.ItemColorProvider;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.client.color.world.GrassColors;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class Client{


	public static void onInitializeClient(final FMLClientSetupEvent event) {
		HandledScreens.register(ModScreenHandlers.COMPACTOR_SCREEN_HANDLER.get(), CompactorScreen::new);
	}

	@SubscribeEvent
	public static void registerBlockColors(RegisterColorHandlersEvent.Block event){

		for (CompressedBlocks compressedBlock: CompressedBlocks.values()) {
			BlockColorProvider blockColor = null;
			switch (compressedBlock){
				case OAK_LEAVES,
						JUNGLE_LEAVES,
						ACACIA_LEAVES,
						DARK_OAK_LEAVES,
						MANGROVE_LEAVES
						-> blockColor = ((state, world, pos, tintIndex) ->
							world != null && pos != null ? BiomeColors.getFoliageColor(world, pos) : FoliageColors.getDefaultColor());
				case SPRUCE_LEAVES -> blockColor =(state, world, pos, tintIndex) -> FoliageColors.getSpruceColor();
				case BIRCH_LEAVES -> blockColor =(state, world, pos, tintIndex) -> FoliageColors.getBirchColor();
				case GRASS_BLOCK -> blockColor = (state, world, pos, tintIndex) -> world != null && pos != null ? BiomeColors.getGrassColor(world, pos) : GrassColors.getColor(0.5, 1.0);

			}

			for (int i = 0; i < compressedBlock.getCompression(); i++) {
				if(blockColor != null)
					event.register(blockColor, compressedBlock.getBlock(i+1).get());
			}

		}
	}

	@SubscribeEvent
	public static void registerItemColors(RegisterColorHandlersEvent.Item event){
		for (CompressedBlocks compressedBlock: CompressedBlocks.values()) {
			ItemColorProvider itemColor = null;

			switch (compressedBlock){
				case OAK_LEAVES,
						JUNGLE_LEAVES,
						ACACIA_LEAVES,
						DARK_OAK_LEAVES,
						MANGROVE_LEAVES
						-> itemColor = (stack, tintIndex) -> FoliageColors.getDefaultColor();
				case SPRUCE_LEAVES -> itemColor = (stack, tintIndex) -> FoliageColors.getSpruceColor();
				case BIRCH_LEAVES -> itemColor = (stack, tintIndex) -> FoliageColors.getBirchColor();
				case GRASS_BLOCK -> itemColor = (stack, tintIndex) -> GrassColors.getColor(0.5, 1.0);
			}

			for (int i = 0; i < compressedBlock.getCompression(); i++) {
				if(itemColor != null)
					event.register(itemColor, compressedBlock.getBlock(i+1).get().asItem());
			}

		}
	}
}
