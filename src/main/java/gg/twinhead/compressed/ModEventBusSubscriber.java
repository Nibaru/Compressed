package gg.twinhead.compressed;

import gg.twinhead.compressed.common.items.FuelItem;
import gg.twinhead.compressed.common.blocks.CompressedBlock;
import gg.twinhead.compressed.core.init.BlockInit;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;


@Mod.EventBusSubscriber(modid = Compressed.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusSubscriber {

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();
        BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get)
                .forEach(block -> {
                  Item.Properties properties = new Item.Properties().group(Compressed.COMPRESSED_GROUP);
                  CompressedBlock blockItem;
                  if(block.getRegistryName().toString().contains("netherite")){
                    properties.isImmuneToFire();
                    blockItem = new CompressedBlock(block, properties);
                    blockItem.setRegistryName(block.getRegistryName());
                    registry.register(blockItem);
                  }else {
                    blockItem = new CompressedBlock(block, properties);
                    blockItem.setRegistryName(block.getRegistryName());
                    registry.register(blockItem);
                  }

                });
    }
}
