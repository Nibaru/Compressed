package games.twinhead.compressed.datagen;

import games.twinhead.compressed.Compressed;
import games.twinhead.compressed.block.CompressedBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.tag.BlockTags;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class TagGenerator extends FabricTagProvider<Block> {


    /**
     * Construct a new {@link FabricTagProvider} with the default computed path.
     *
     * <p>Common implementations of this class are provided. For example @see BlockTagProvider
     *
     * @param dataGenerator T    The backing registry for the Tag type.
     */
    public TagGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator, Registry.BLOCK);
    }

    @Override
    protected void generateTags() {
        TagKey<Block> commonStorage = TagKey.of(Registry.BLOCK_KEY, new Identifier("c", "storage_blocks"));

        for (CompressedBlocks block: CompressedBlocks.values()) {
            for (int i = 0; i < block.getCompression(); i++) {
                getOrCreateTagBuilder(TagKey.of(Registry.BLOCK_KEY, new Identifier(Compressed.MOD_ID, block.toString().toLowerCase()))).add(block.getBlock(i + 1));
                if (i > 4) getOrCreateTagBuilder(BlockTags.WITHER_IMMUNE).add(block.getBlock(i + 1));
            }
            if(block.getTooltag() != null) getOrCreateTagBuilder(block.getTooltag()).addTag(TagKey.of(Registry.BLOCK_KEY, new Identifier(Compressed.MOD_ID, block.toString().toLowerCase())));
            getOrCreateTagBuilder(commonStorage).addTag(TagKey.of(Registry.BLOCK_KEY, new Identifier(Compressed.MOD_ID, block.toString().toLowerCase())));
        }


        getOrCreateTagBuilder(BlockTags.SOUL_SPEED_BLOCKS).addTag(TagKey.of(Registry.BLOCK_KEY, new Identifier(Compressed.MOD_ID, "soul_sand")));
        getOrCreateTagBuilder(BlockTags.SOUL_FIRE_BASE_BLOCKS).addTag(TagKey.of(Registry.BLOCK_KEY, new Identifier(Compressed.MOD_ID, "soul_sand")));
        getOrCreateTagBuilder(BlockTags.SOUL_SPEED_BLOCKS).addTag(TagKey.of(Registry.BLOCK_KEY, new Identifier(Compressed.MOD_ID, "soul_soil")));
        getOrCreateTagBuilder(BlockTags.SOUL_FIRE_BASE_BLOCKS).addTag(TagKey.of(Registry.BLOCK_KEY, new Identifier(Compressed.MOD_ID, "soul_soil")));
        getOrCreateTagBuilder(BlockTags.SAND).addTag(TagKey.of(Registry.BLOCK_KEY, new Identifier(Compressed.MOD_ID, "sand")));
        getOrCreateTagBuilder(BlockTags.SAND).addTag(TagKey.of(Registry.BLOCK_KEY, new Identifier(Compressed.MOD_ID, "red_sand")));
        getOrCreateTagBuilder(BlockTags.CRYSTAL_SOUND_BLOCKS).addTag(TagKey.of(Registry.BLOCK_KEY, new Identifier(Compressed.MOD_ID, "amethyst_block")));

        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS).addTag(TagKey.of(Registry.BLOCK_KEY, new Identifier(Compressed.MOD_ID, "iron_block")));
        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS).addTag(TagKey.of(Registry.BLOCK_KEY, new Identifier(Compressed.MOD_ID, "gold_block")));
        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS).addTag(TagKey.of(Registry.BLOCK_KEY, new Identifier(Compressed.MOD_ID, "diamond_block")));
        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS).addTag(TagKey.of(Registry.BLOCK_KEY, new Identifier(Compressed.MOD_ID, "emerald_block")));
        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS).addTag(TagKey.of(Registry.BLOCK_KEY, new Identifier(Compressed.MOD_ID, "netherite_block")));

    }


}

