package games.twinhead.compressed.datagen;

import games.twinhead.compressed.block.CompressedBlocks;
import games.twinhead.compressed.registry.RegisterBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.RecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.Items;

import java.util.function.Consumer;

public class RecipeGenerator extends FabricRecipeProvider {
    public RecipeGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }



    @Override
    protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
        RecipeProvider.offerReversibleCompactingRecipes(exporter, Items.CHARCOAL, RegisterBlocks.compressedBlocks.get("charcoal_block"));
        for (CompressedBlocks block: CompressedBlocks.values()) {
            RecipeProvider.offerReversibleCompactingRecipes(exporter, block.getCopyBlock(), block.getBlock(1), block.toString().toLowerCase() + "_pack", block.toString().toLowerCase(), block.getName(1) + "_unpack", block.toString().toLowerCase());
            for (int i = 0; i < block.getCompression() - 1; i++) {
                RecipeProvider.offerReversibleCompactingRecipes(exporter, block.getBlock(i +1), block.getBlock(i + 2), block.getName(i + 1) + "_pack", block.toString().toLowerCase(), block.getName(i + 2) + "_unpack", block.toString().toLowerCase());

            }
        }
    }
}
