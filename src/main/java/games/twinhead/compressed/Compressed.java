package games.twinhead.compressed;

import games.twinhead.compressed.block.CompressedBlocks;
import games.twinhead.compressed.block.entity.ModBlockEntities;
import games.twinhead.compressed.recipe.ModRecipes;
import games.twinhead.compressed.registry.RegisterBlocks;
import games.twinhead.compressed.registry.RegisterItems;
import games.twinhead.compressed.screen.ModScreenHandlers;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Compressed implements ModInitializer {

	public static final String MOD_ID = "compressed";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final ItemGroup COMPRESSED_GROUP = FabricItemGroup.builder(
			new Identifier(MOD_ID, "compressed_blocks"))
			.icon(() -> new ItemStack(CompressedBlocks.COBBLESTONE.getBlock(2)))
			.build();

	@Override
	public void onInitialize() {
		RegisterBlocks.register();
		RegisterItems.register();
		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerAllScreenHandlers();
		ModRecipes.registerRecipes();
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
