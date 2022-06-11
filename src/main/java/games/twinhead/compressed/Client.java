package games.twinhead.compressed;

import games.twinhead.compressed.registry.RegisterBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.client.color.item.ItemColorProvider;
import net.minecraft.client.render.RenderLayer;

import java.util.Map;

public class Client implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		Colors();
		GlassTransparency();
	}

	private void Colors(){
		for(Map.Entry entry: RegisterBlocks.compressedLeaves.entrySet()){
			ItemColorProvider itemColor = null;
			BlockColorProvider blockColor = null;

			if(entry.getKey().toString().contains("acacia")){
				itemColor = (state, view) -> 0xaea42a;
				blockColor = (state, view, pos, tintIndex) -> 0xaea42a;
			} else if(entry.getKey().toString().contains("oak")){
				itemColor = (state, view) -> 0x59ae30;
				blockColor = (state, view, pos, tintIndex) -> 0x59ae30;
			} else if(entry.getKey().toString().contains("jungle")){
				itemColor = (state, view) -> 0x30bb0b;
				blockColor = (state, view, pos, tintIndex) -> 0x30bb0b;
			} else if(entry.getKey().toString().contains("dark_oak")){
				itemColor = (state, view) -> 0x59AE30;
				blockColor = (state, view, pos, tintIndex) -> 0x59AE30;
			} else if(entry.getKey().toString().contains("spruce")){
				itemColor = (state, view) -> 0x619961;
				blockColor = (state, view, pos, tintIndex) -> 0x619961;
			} else if(entry.getKey().toString().contains("birch")){
				itemColor = (state, view) -> 0x80A755;
				blockColor = (state, view, pos, tintIndex) -> 0x80A755;
			} else if(entry.getKey().toString().contains("mangrove")){
				itemColor = (state, view) -> 0x8db127;
				blockColor = (state, view, pos, tintIndex) -> 0x8db127;
			}

			ColorProviderRegistry.BLOCK.register(blockColor, (Block) entry.getValue());
			ColorProviderRegistry.ITEM.register(itemColor, ((Block) entry.getValue()).asItem());
		}
	}

	private void GlassTransparency(){
		for (Map.Entry entry: RegisterBlocks.compressedGlass.entrySet()) {
			BlockRenderLayerMap.INSTANCE.putBlock((Block) entry.getValue(), RenderLayer.getTranslucent());
		}

	}
}
