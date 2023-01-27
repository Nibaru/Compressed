package games.twinhead.compressed.datagen;

import games.twinhead.compressed.Compressed;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Compressed.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Datagen {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(new ModRecipeProvider(generator));
//        generator.addProvider(true, new ModLootTableProvider(generator));
//        generator.addProvider(true, new ModBlocksStateProvider(generator, existingFileHelper));
//        generator.addProvider(true, new ModItemModelProvider(generator, existingFileHelper));
    }
}
