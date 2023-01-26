package games.twinhead.compressed;

import games.twinhead.compressed.block.entity.ModBlockEntities;
import games.twinhead.compressed.registry.RegisterBlocks;
import games.twinhead.compressed.screen.ModScreenHandlers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Compressed.MOD_ID)
public class Compressed {

	public static final String MOD_ID = "compressed";

	public Compressed() {
		IEventBus MOD_BUS = FMLJavaModLoadingContext.get().getModEventBus();

		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerAllScreenHandlers();
		RegisterBlocks.registerBlocks(MOD_BUS);
		MOD_BUS.addListener(Client::onInitializeClient);
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
