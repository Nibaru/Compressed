package games.twinhead.compressed.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class CompressedDatagen implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModelGenerator::new);
        pack.addProvider(LootTableGenerator::new);
        pack.addProvider(LangDatagen::new);
        pack.addProvider(RecipeGenerator::new);
        pack.addProvider(TagGenerator::new);
    }
}
