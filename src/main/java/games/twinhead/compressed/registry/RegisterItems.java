package games.twinhead.compressed.registry;

import games.twinhead.compressed.Compressed;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.ArrayList;

public class RegisterItems {
    public static final ArrayList<Item> MOD_BLOCKS = new ArrayList<>();
    public static final ArrayList<Item> MOD_ITEMS = new ArrayList<>();

    public static void register() {}

    public static void registerItem(String name, Item item) {
        if (item instanceof BlockItem) {
            Registry.register(Registries.ITEM, new Identifier(Compressed.MOD_ID, name), item);
            MOD_BLOCKS.add(item);
            ItemGroupEvents.modifyEntriesEvent(Compressed.COMPRESSED_GROUP).register(entries -> entries.add(item));
        }
    }
}
