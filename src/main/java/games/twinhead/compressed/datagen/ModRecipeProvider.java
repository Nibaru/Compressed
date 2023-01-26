package games.twinhead.compressed.datagen;

import games.twinhead.compressed.block.CompressedBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.server.RecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void generate(Consumer<RecipeJsonProvider> exporter) {


        for (CompressedBlocks block: CompressedBlocks.values()) {

            RecipeProvider.offerReversibleCompactingRecipes(exporter, block.getCopyBlock(),   block.getBlock(1).get(), block.toString().toLowerCase() + "_pack", block.toString().toLowerCase(), block.getName(1) + "_unpack", block.toString().toLowerCase());
            for (int i = 0; i < block.getCompression() - 1; i++) {
                RecipeProvider.offerReversibleCompactingRecipes(exporter,  block.getBlock(i +1).get(),  block.getBlock(i + 2).get(), block.getName(i + 1) + "_pack", block.toString().toLowerCase(), block.getName(i + 2) + "_unpack", block.toString().toLowerCase());

            }
        }
    }
}
