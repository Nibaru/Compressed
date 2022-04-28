package games.twinhead.compressed.registry;

import games.twinhead.compressed.Compressed;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;

public class RegisterItems {
    //private static final List<String> ITEMS = new ArrayList<String>();
    public static final ArrayList<Item> MOD_BLOCKS = new ArrayList<>();
    public static final ArrayList<Item> MOD_ITEMS = new ArrayList<>();

    public static void register() {}

    public static void registerItem(String name, Item item) {
        if (item instanceof BlockItem) {
            Registry.register(Registry.ITEM, new Identifier(Compressed.MOD_ID, name), item);
            MOD_BLOCKS.add(item);
        }
    }
}
