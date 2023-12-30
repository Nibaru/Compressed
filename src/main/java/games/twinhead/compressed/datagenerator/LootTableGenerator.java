package games.twinhead.compressed.datagenerator;

import games.twinhead.compressed.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;


public class LootTableGenerator extends FabricBlockLootTableProvider {

    protected LootTableGenerator(FabricDataGenerator dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateBlockLootTables() {
        for (ModBlocks block: ModBlocks.values()) {
            for (int i = 0; i < block.getMaxCompression(); i++) {
                addDrop(block.get(i+1), block.get(i+1));
            }
        }
    }
}
