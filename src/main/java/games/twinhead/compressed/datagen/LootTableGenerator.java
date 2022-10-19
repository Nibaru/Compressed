package games.twinhead.compressed.datagen;

import games.twinhead.compressed.Compressed;
import games.twinhead.compressed.block.CompressedBlocks;
import games.twinhead.compressed.registry.RegisterBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.minecraft.data.server.BlockLootTableGenerator;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;

public class LootTableGenerator extends SimpleFabricLootTableProvider {


    public LootTableGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator, LootContextTypes.BLOCK);
    }

    @Override
    public void accept(BiConsumer<Identifier, LootTable.Builder> identifierBuilderBiConsumer) {

        identifierBuilderBiConsumer.accept(new Identifier(Compressed.MOD_ID, "blocks/charcoal_block"), BlockLootTableGenerator.drops(RegisterBlocks.compressedBlocks.get("charcoal_block")));

        for (CompressedBlocks block: CompressedBlocks.values()) {
            for (int i = 0; i < block.getCompression(); i++) {
                identifierBuilderBiConsumer.accept(new Identifier(Compressed.MOD_ID, "blocks/" + block.getName(i+1)), BlockLootTableGenerator.drops(block.getBlock(i+1)));

            }

        }
    }
}
