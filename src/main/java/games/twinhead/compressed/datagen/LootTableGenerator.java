package games.twinhead.compressed.datagen;

import games.twinhead.compressed.Compressed;
import games.twinhead.compressed.block.CompressedBlocks;
import games.twinhead.compressed.registry.RegisterBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.loot.LootTable;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;

public class LootTableGenerator extends FabricBlockLootTableProvider {


    public LootTableGenerator(FabricDataOutput data) {
        super(data);
    }

    @Override
    public void generate() {

    }

    @Override
    public void accept(BiConsumer<Identifier, LootTable.Builder> identifierBuilderBiConsumer) {
        identifierBuilderBiConsumer.accept(new Identifier(Compressed.MOD_ID, "blocks/charcoal_block"), this.drops(RegisterBlocks.compressedBlocks.get("charcoal_block")));
        identifierBuilderBiConsumer.accept(new Identifier(Compressed.MOD_ID, "blocks/compactor"), this.drops(RegisterBlocks.compressedBlocks.get("compactor")));

        for (CompressedBlocks block: CompressedBlocks.values()) {
            for (int i = 0; i < block.getCompression(); i++) {
                identifierBuilderBiConsumer.accept(new Identifier(Compressed.MOD_ID, "blocks/" + block.getName(i+1)), this.drops(block.getBlock(i+1)));

            }

        }
    }
}
