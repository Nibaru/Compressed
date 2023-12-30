package games.twinhead.compressed.datagenerator;

import games.twinhead.compressed.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class RecipeGenerator extends FabricRecipeProvider {


    public RecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        for (ModBlocks block: ModBlocks.values()) {
            offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, block.getParentBlock(), RecipeCategory.BUILDING_BLOCKS, block.get(1), block.toString().toLowerCase() + "_pack", block.toString().toLowerCase(), block.name(1) + "_unpack", block.toString().toLowerCase());
            for (int i = 0; i < block.getMaxCompression() - 1; i++) {
                offerReversibleCompactingRecipes(exporter,  RecipeCategory.BUILDING_BLOCKS, block.get(i +1),  RecipeCategory.BUILDING_BLOCKS, block.get(i + 2), block.name(i + 1) + "_pack", block.toString().toLowerCase(), block.name(i + 2) + "_unpack", block.toString().toLowerCase());
            }
        }
    }
}
