package games.twinhead.compressed.screen;

import games.twinhead.compressed.Compressed;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static ScreenHandlerType<CompactorScreenHandler> COMPACTOR_SCREEN_HANDLER;

    public static void registerAllScreenHandlers() {
        COMPACTOR_SCREEN_HANDLER = new ScreenHandlerType<>(CompactorScreenHandler::new);

        Registry.register(Registries.SCREEN_HANDLER,new Identifier(Compressed.MOD_ID, "compactor_screen_handler"), COMPACTOR_SCREEN_HANDLER);


    }
}
