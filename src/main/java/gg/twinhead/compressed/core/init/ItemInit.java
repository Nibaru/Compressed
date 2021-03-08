package gg.twinhead.compressed.core.init;

import net.minecraft.item.BlockItem;
import gg.twinhead.compressed.common.items.FuelItem;
import net.minecraftforge.fml.RegistryObject;
import gg.twinhead.compressed.Compressed;
import net.minecraft.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> FUELITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Compressed.MOD_ID);

    public static final RegistryObject<BlockItem> CHARCOAL_BLOCK = FUELITEMS.register("charcoal_block", () ->
            new FuelItem(BlockInit.CHARCOAL_BLOCK.get(), new Item.Properties().group(Compressed.COMPRESSED_GROUP), 16000));
    public static final RegistryObject<BlockItem> CHARCOAL_BLOCK_I = FUELITEMS.register("charcoal_block_i", () ->
            new FuelItem(BlockInit.CHARCOAL_BLOCK_I.get(), new Item.Properties().group(Compressed.COMPRESSED_GROUP), 144000));
    public static final RegistryObject<BlockItem> CHARCOAL_BLOCK_II = FUELITEMS.register("charcoal_block_ii", () ->
            new FuelItem(BlockInit.CHARCOAL_BLOCK_II.get(), new Item.Properties().group(Compressed.COMPRESSED_GROUP), 1296000));
    public static final RegistryObject<BlockItem> CHARCOAL_BLOCK_III = FUELITEMS.register("charcoal_block_iii", () ->
            new FuelItem(BlockInit.CHARCOAL_BLOCK_III.get(), new Item.Properties().group(Compressed.COMPRESSED_GROUP), 11664000));
    public static final RegistryObject<BlockItem> CHARCOAL_BLOCK_IV = FUELITEMS.register("charcoal_block_iv", () ->
            new FuelItem(BlockInit.CHARCOAL_BLOCK_IV.get(), new Item.Properties().group(Compressed.COMPRESSED_GROUP), 104976000));

    public static final RegistryObject<BlockItem> COAL_BLOCK_I = FUELITEMS.register("coal_block_i", () ->
            new FuelItem(BlockInit.COAL_BLOCK_I.get(), new Item.Properties().group(Compressed.COMPRESSED_GROUP), 144000));
    public static final RegistryObject<BlockItem> COAL_BLOCK_II = FUELITEMS.register("coal_block_ii", () ->
            new FuelItem(BlockInit.COAL_BLOCK_II.get(), new Item.Properties().group(Compressed.COMPRESSED_GROUP), 1296000));
    public static final RegistryObject<BlockItem> COAL_BLOCK_III = FUELITEMS.register("coal_block_iii", () ->
            new FuelItem(BlockInit.COAL_BLOCK_III.get(), new Item.Properties().group(Compressed.COMPRESSED_GROUP), 11664000));
    public static final RegistryObject<BlockItem> COAL_BLOCK_IV = FUELITEMS.register("coal_block_iv", () ->
            new FuelItem(BlockInit.COAL_BLOCK_IV.get(), new Item.Properties().group(Compressed.COMPRESSED_GROUP), 104976000));
}
