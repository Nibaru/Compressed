package gg.twinhead.compressed.core.init;

import gg.twinhead.compressed.Compressed;
import gg.twinhead.compressed.common.blocks.CompressedBlock;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Compressed.MOD_ID);

/*
    public static final RegistryObject<BlockItem> COMPRESSED_COBBLESTONE_I = ITEMS.register("compressed_cobblestone_i", () ->
            new CompressedBlock(BlockInit.COMPRESSED_COBBLESTONE_I.get(), new Item.Properties().group(Compressed.COMPRESSED_GROUP)));
*/
}
