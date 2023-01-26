package games.twinhead.compressed;

import games.twinhead.compressed.block.entity.ModBlockEntities;
import games.twinhead.compressed.registry.CreativeTab;
import games.twinhead.compressed.registry.RegisterBlocks;
import games.twinhead.compressed.screen.ModScreenHandlers;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod(Compressed.MOD_ID)
public class Compressed {

	public static final String MOD_ID = "compressed";

//	public static final ItemGroup COMPRESSED_GROUP = FabricItemGroup.builder(
//			new Identifier(MOD_ID, "compressed_blocks"))
//			.icon(() -> new ItemStack(CompressedBlocks.COBBLESTONE.getBlock(2)))
//			.build();

	public Compressed() {
		IEventBus MOD_BUS = FMLJavaModLoadingContext.get().getModEventBus();



		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerAllScreenHandlers();
		RegisterBlocks.registerBlocks(MOD_BUS);
		MOD_BUS.addListener(Client::onInitializeClient);
		MOD_BUS.addListener(CreativeTab::registerTab);
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


//
//	@SubscribeEvent
//	public void register(RegisterEvent event) {
//		event.register(ForgeRegistries.Keys.BLOCKS,
//				helper -> {
//					RegisterBlocks.compressedBlocks..getEntries().stream().map(RegistryObject::get)
//							.forEach(block -> {
//								Item.Settings properties = new Item.Settings();
//								BlockItem blockItem = new BlockItem(block, properties);
//								String[] nameParts = block.getTranslationKey().toLowerCase().split("\\.");
//								helper.register(new Identifier(MOD_ID, nameParts[nameParts.length-1]),blockItem);
//							});
//				}
//		);
//	}
}
