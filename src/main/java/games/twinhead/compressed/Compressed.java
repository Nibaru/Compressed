package games.twinhead.compressed;

import games.twinhead.compressed.registry.RegisterBlocks;
import games.twinhead.compressed.registry.RegisterItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.minecraft.block.Blocks.COBBLESTONE;

public class Compressed implements ModInitializer {

	public static final String MOD_ID = "compressed";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final ItemGroup COMPRESSED_GROUP = FabricItemGroupBuilder.build(
			new Identifier(MOD_ID, "blocks"),
			() -> new ItemStack(COBBLESTONE));

	@Override
	public void onInitialize() {
		RegisterBlocks.register();
		RegisterItems.register();
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
