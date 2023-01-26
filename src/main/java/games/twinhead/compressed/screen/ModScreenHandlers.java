package games.twinhead.compressed.screen;

import games.twinhead.compressed.Compressed;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModScreenHandlers {


    private static final DeferredRegister<ScreenHandlerType<?>> SCREEN_HANDLERS = DeferredRegister.create(ForgeRegistries.MENU_TYPES, Compressed.MOD_ID);

    //public static ScreenHandlerType<CompactorScreenHandler> COMPACTOR_SCREEN_HANDLER;

    public static final RegistryObject<ScreenHandlerType<CompactorScreenHandler>> COMPACTOR_SCREEN_HANDLER = SCREEN_HANDLERS.register("compactor_screen_handler", () -> IForgeMenuType.create(CompactorScreenHandler::new));


    public static void registerAllScreenHandlers() {
        SCREEN_HANDLERS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
