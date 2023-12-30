package games.twinhead.compressed.datagenerator;

import games.twinhead.compressed.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;

import java.util.function.Consumer;

public class RecipeGenerator extends FabricRecipeProvider {


    public RecipeGenerator(FabricDataGenerator output) {
        super(output);
    }

    @Override
    public void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
        for (ModBlocks block: ModBlocks.values()) {
            offerReversibleCompactingRecipes(exporter, block.getParentBlock(), block.get(1), block.toString().toLowerCase() + "_pack", null, block.name(1) + "_unpack", null);
            for (int i = 0; i < block.getMaxCompression() - 1; i++) {
                offerReversibleCompactingRecipes(exporter, block.get(i +1), block.get(i + 2), block.name(i + 1) + "_pack", block.toString().toLowerCase(), block.name(i + 2) + "_unpack", block.toString().toLowerCase());
            }
        }
    }
}
