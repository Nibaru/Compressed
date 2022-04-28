package games.twinhead.compressed;

import games.twinhead.compressed.registry.RegisterBlocks;
import games.twinhead.compressed.registry.RegisterItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.client.color.item.ItemColorProvider;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Map;

import static net.minecraft.block.Blocks.COBBLESTONE;

public class Compressed implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "compressed";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final ItemGroup COMPRESSED_GROUP = FabricItemGroupBuilder.build(
			new Identifier(MOD_ID, "blocks"),
			() -> new ItemStack(COBBLESTONE));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		RegisterBlocks.register();
		RegisterItems.register();
		Colors();
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
			}

			ColorProviderRegistry.BLOCK.register(blockColor, (Block) entry.getValue());
			ColorProviderRegistry.ITEM.register(itemColor, ((Block) entry.getValue()).asItem());
		}
	}
	public static String intToRoman(int number){
		return switch (number){
			case 1 -> "i";
			case 2 -> "ii";
			case 3 -> "iii";
			case 4 -> "iv";
			case 5 -> "v";
			case 6 -> "vi";
			case 7 -> "vii";
			case 8 -> "viii";
			case 9 -> "ix";
			case 10 -> "x";
			default -> "0";
		};
	}
}
