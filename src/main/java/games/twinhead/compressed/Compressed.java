package games.twinhead.compressed;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public class Compressed implements ModInitializer {

    public static final String MOD_ID = "compressed";

    @Override
    public void onInitialize() {

    }

    public static Identifier id(String name) {
        return new Identifier(MOD_ID, name);
    }
}
