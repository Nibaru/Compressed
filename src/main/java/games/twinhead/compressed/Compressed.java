package games.twinhead.compressed;

import games.twinhead.compressed.registry.BlockRegistry;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public class Compressed implements ModInitializer {

    public static final String MOD_ID = "compressed";

    @Override
    public void onInitialize() {
        BlockRegistry.register();
    }

    public static Identifier id(String name) {
        return new Identifier(MOD_ID, name);
    }

    public static Identifier idPrefix(String name, String prefix){
        return new Identifier(MOD_ID, prefix + name);
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
