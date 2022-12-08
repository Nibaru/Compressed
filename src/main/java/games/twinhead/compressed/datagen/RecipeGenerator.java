package games.twinhead.compressed.datagen;

import games.twinhead.compressed.block.CompressedBlocks;
import games.twinhead.compressed.registry.RegisterBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class RecipeGenerator extends FabricRecipeProvider {
    public RecipeGenerator(FabricDataOutput data) {
        super(data);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Items.CHARCOAL, RecipeCategory.BUILDING_BLOCKS, RegisterBlocks.compressedBlocks.get("charcoal_block").asItem());
        for (CompressedBlocks block: CompressedBlocks.values()) {
            offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, block.getCopyBlock(), RecipeCategory.BUILDING_BLOCKS, block.getBlock(1), block.toString().toLowerCase() + "_pack", block.toString().toLowerCase(), block.getName(1) + "_unpack", block.toString().toLowerCase());
            for (int i = 0; i < block.getCompression() - 1; i++) {
                offerReversibleCompactingRecipes(exporter,  RecipeCategory.BUILDING_BLOCKS, block.getBlock(i +1),  RecipeCategory.BUILDING_BLOCKS, block.getBlock(i + 2), block.getName(i + 1) + "_pack", block.toString().toLowerCase(), block.getName(i + 2) + "_unpack", block.toString().toLowerCase());

            }
        }
    }
}
