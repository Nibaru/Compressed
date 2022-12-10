package games.twinhead.compressed.datagen;

import games.twinhead.compressed.Compressed;
import games.twinhead.compressed.block.CompressedBlocks;
import games.twinhead.compressed.registry.RegisterBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.*;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class TagGenerator extends FabricTagProvider<Block> {



    public TagGenerator(FabricDataOutput data, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(data, RegistryKeys.BLOCK, registriesFuture);
    }



    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        TagKey<Block> commonStorage = TagKey.of(RegistryKeys.BLOCK, new Identifier("c", "storage_blocks"));

        for (CompressedBlocks block: CompressedBlocks.values()) {
            for (int i = 0; i < block.getCompression(); i++) {
                getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier(Compressed.MOD_ID, block.toString().toLowerCase()))).add(block.getBlock(i + 1));
                if (i > 4) getOrCreateTagBuilder(BlockTags.WITHER_IMMUNE).add(block.getBlock(i + 1));
            }
            if(block.getTooltag() != null) getOrCreateTagBuilder(block.getTooltag()).addTag(TagKey.of(RegistryKeys.BLOCK, new Identifier(Compressed.MOD_ID, block.toString().toLowerCase())));
            getOrCreateTagBuilder(commonStorage).addTag(TagKey.of(RegistryKeys.BLOCK, new Identifier(Compressed.MOD_ID, block.toString().toLowerCase())));
        }


        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(RegisterBlocks.compressedBlocks.get("charcoal_block"));
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(RegisterBlocks.compressedBlocks.get("compactor"));

        getOrCreateTagBuilder(BlockTags.SOUL_SPEED_BLOCKS).addTag(TagKey.of(RegistryKeys.BLOCK, new Identifier(Compressed.MOD_ID, "soul_sand")));
        getOrCreateTagBuilder(BlockTags.SOUL_FIRE_BASE_BLOCKS).addTag(TagKey.of(RegistryKeys.BLOCK, new Identifier(Compressed.MOD_ID, "soul_sand")));
        getOrCreateTagBuilder(BlockTags.SOUL_SPEED_BLOCKS).addTag(TagKey.of(RegistryKeys.BLOCK, new Identifier(Compressed.MOD_ID, "soul_soil")));
        getOrCreateTagBuilder(BlockTags.SOUL_FIRE_BASE_BLOCKS).addTag(TagKey.of(RegistryKeys.BLOCK, new Identifier(Compressed.MOD_ID, "soul_soil")));
        getOrCreateTagBuilder(BlockTags.SAND).addTag(TagKey.of(RegistryKeys.BLOCK, new Identifier(Compressed.MOD_ID, "sand")));
        getOrCreateTagBuilder(BlockTags.SAND).addTag(TagKey.of(RegistryKeys.BLOCK, new Identifier(Compressed.MOD_ID, "red_sand")));
        getOrCreateTagBuilder(BlockTags.CRYSTAL_SOUND_BLOCKS).addTag(TagKey.of(RegistryKeys.BLOCK, new Identifier(Compressed.MOD_ID, "amethyst_block")));

        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS).addTag(TagKey.of(RegistryKeys.BLOCK, new Identifier(Compressed.MOD_ID, "iron_block")));
        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS).addTag(TagKey.of(RegistryKeys.BLOCK, new Identifier(Compressed.MOD_ID, "gold_block")));
        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS).addTag(TagKey.of(RegistryKeys.BLOCK, new Identifier(Compressed.MOD_ID, "diamond_block")));
        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS).addTag(TagKey.of(RegistryKeys.BLOCK, new Identifier(Compressed.MOD_ID, "emerald_block")));
        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS).addTag(TagKey.of(RegistryKeys.BLOCK, new Identifier(Compressed.MOD_ID, "netherite_block")));

    }
}

