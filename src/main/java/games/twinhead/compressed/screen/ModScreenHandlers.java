package games.twinhead.compressed.screen;

import games.twinhead.compressed.Compressed;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModScreenHandlers {


    private static final DeferredRegister<ScreenHandlerType<?>> SCREEN_HANDLERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, Compressed.MOD_ID);

    public static final RegistryObject<ScreenHandlerType<CompactorScreenHandler>> COMPACTOR_SCREEN_HANDLER = SCREEN_HANDLERS.register("compactor_screen_handler", () -> IForgeMenuType.create(CompactorScreenHandler::new));


    public static void registerAllScreenHandlers() {
        SCREEN_HANDLERS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
