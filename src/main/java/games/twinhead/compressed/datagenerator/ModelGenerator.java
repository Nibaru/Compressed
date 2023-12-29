package games.twinhead.compressed.datagenerator;

import games.twinhead.compressed.Compressed;
import games.twinhead.compressed.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModelGenerator extends FabricModelProvider {

    public ModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        for (ModBlocks modBlock : ModBlocks.values()) {
            for (int i = 0; i < modBlock.getMaxCompression(); i++) {
                generateBlockStateModel(blockStateModelGenerator, modBlock, i + 1);
            }
        }
    }

    void generateBlockStateModel(BlockStateModelGenerator blockStateModelGenerator, ModBlocks modBlock, int compression) {
        switch (modBlock.getModelType()){
            case PILLAR -> registerColumn(blockStateModelGenerator, modBlock, compression);
            case PILLAR_ROTATED, HAY  -> registerAxisRotated(blockStateModelGenerator, modBlock, compression);
            case GRASS -> registerGrass(blockStateModelGenerator, modBlock, compression);
            case LOG -> registerLog(blockStateModelGenerator, modBlock, compression);
            case ROOTS -> registerRoots(blockStateModelGenerator, modBlock, compression);
            case LEAVES -> registerCubeAll(blockStateModelGenerator, modBlock, compression, "compressed_leaves");
            default -> registerCubeAll(blockStateModelGenerator, modBlock, compression, "compressed_cube_all");
        }
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }

    public void registerCubeAll(BlockStateModelGenerator blockStateModelGenerator, ModBlocks block, int compression, String modelName){
        TextureMap textureMap = TextureMap.all(block.getParentBlock());
        textureMap.put(TextureKey.LAYER0, new Identifier(Compressed.MOD_ID, "block/compressed_" + Compressed.intToRoman(compression)));

        switch (block){
            case MAGMA_BLOCK -> textureMap.put(TextureKey.ALL, new Identifier("minecraft", "block/magma"));
            case SNOW_BLOCK -> textureMap.put(TextureKey.ALL, new Identifier("minecraft", "block/snow"));
            case QUARTZ_BLOCK -> textureMap.put(TextureKey.ALL, new Identifier("minecraft", "block/quartz_block_side"));
            case HONEY_BLOCK -> textureMap.put(TextureKey.ALL, new Identifier("minecraft", "block/honey_block_bottom"));
        }

        Identifier model = new Model(Optional.of(new Identifier(Compressed.MOD_ID, "block/" + modelName)), Optional.empty(), TextureKey.ALL, TextureKey.LAYER0)
                .upload(block.idPrefix(compression, "block/"), textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(block.get(compression), model));
    }

    public void registerRoots(BlockStateModelGenerator blockStateModelGenerator, ModBlocks block, int compression){
        TextureMap textureMap = TextureMap.sideAndTop(block.getParentBlock());
        textureMap.put(TextureKey.LAYER0, new Identifier(Compressed.MOD_ID, "block/compressed_" + Compressed.intToRoman(compression)));

        Identifier identifier = new Model(Optional.of(new Identifier(Compressed.MOD_ID, "block/compressed_roots")), Optional.empty(), TextureKey.LAYER0, TextureKey.SIDE, TextureKey.TOP)
                .upload(block.get(compression), textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(block.get(compression), identifier));
    }

    public void registerGrass(BlockStateModelGenerator blockStateModelGenerator, ModBlocks block, int compression){
        TextureMap textureMap = TextureMap.sideTopBottom(block.getParentBlock());
        textureMap.put(TextureKey.LAYER0, new Identifier(Compressed.MOD_ID, "block/compressed_" + Compressed.intToRoman(compression)));
        textureMap.put(TextureKey.BOTTOM, new Identifier("minecraft", "block/dirt"));

        if (block == ModBlocks.GRASS_BLOCK) {
            textureMap.put(TextureKey.EDGE, new Identifier("minecraft", "block/grass_block_side_overlay"));
        } else {
            textureMap.put(TextureKey.EDGE, textureMap.getTexture(TextureKey.SIDE));
        }

        if (block == ModBlocks.CRIMSON_NYLIUM || block == ModBlocks.WARPED_NYLIUM) {
            textureMap.put(TextureKey.BOTTOM, new Identifier("minecraft", "block/netherrack"));
            textureMap.put(TextureKey.TOP, new Identifier("minecraft", "block/"+block.toString().toLowerCase()));
        }


        Identifier identifier = new Model(Optional.of(new Identifier(Compressed.MOD_ID, "block/compressed_grass")), Optional.empty(), TextureKey.LAYER0, TextureKey.SIDE, TextureKey.TOP, TextureKey.BOTTOM, TextureKey.EDGE)
                .upload(block.get(compression), textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(block.get(compression), identifier));
    }

    public void registerLog(BlockStateModelGenerator blockStateModelGenerator, ModBlocks block, int compression){
        TextureMap textureMap = TextureMap.sideEnd(block.getParentBlock());
        textureMap.put(TextureKey.LAYER0, new Identifier(Compressed.MOD_ID, "block/compressed_" + Compressed.intToRoman(compression)));
        textureMap.put(TextureKey.SIDE, new Identifier("minecraft", "block/" + block.toString().toLowerCase()));
        Identifier identifier = new Model(Optional.of(new Identifier(Compressed.MOD_ID, "block/compressed_cube_column")), Optional.empty(), TextureKey.LAYER0, TextureKey.SIDE, TextureKey.END)
                .upload(block.get(compression), textureMap, blockStateModelGenerator.modelCollector);
        Identifier identifier2 = new Model(Optional.of(new Identifier(Compressed.MOD_ID, "block/compressed_cube_column_horizontal")), Optional.of("_horizontal"), TextureKey.LAYER0, TextureKey.SIDE, TextureKey.END)
                .upload(block.get(compression), textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createAxisRotatedBlockState(block.get(compression), identifier, identifier2));
    }

    public void registerAxisRotated(BlockStateModelGenerator blockStateModelGenerator, ModBlocks block, int compression){
        TextureMap textureMap = TextureMap.sideEnd(block.getParentBlock());
        textureMap.put(TextureKey.LAYER0, new Identifier(Compressed.MOD_ID, "block/compressed_" + Compressed.intToRoman(compression)));
        Identifier identifier = new Model(Optional.of(new Identifier(Compressed.MOD_ID, "block/compressed_cube_column")), Optional.empty(), TextureKey.LAYER0, TextureKey.SIDE, TextureKey.END)
                .upload(block.get(compression), textureMap, blockStateModelGenerator.modelCollector);
        Identifier identifier2 = new Model(Optional.of(new Identifier(Compressed.MOD_ID, "block/compressed_cube_column_horizontal")), Optional.of("_horizontal"), TextureKey.LAYER0, TextureKey.SIDE, TextureKey.END)
                .upload(block.get(compression), textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createAxisRotatedBlockState(block.get(compression), identifier, identifier2));
    }

    public void registerColumn(BlockStateModelGenerator blockStateModelGenerator, ModBlocks block, int compression){
        TextureMap textureMap = TextureMap.sideEnd(block.getParentBlock());
        textureMap.put(TextureKey.LAYER0, new Identifier(Compressed.MOD_ID, "block/compressed_" + Compressed.intToRoman(compression)));

        switch (block){
            case DRIED_KELP_BLOCK -> {
                textureMap.put(TextureKey.END, new Identifier("minecraft", "block/dried_kelp_top"));
                textureMap.put(TextureKey.SIDE, new Identifier("minecraft", "block/dried_kelp_side"));
            }
            case SANDSTONE -> {
                textureMap.put(TextureKey.END, new Identifier("minecraft", "block/sandstone_top"));
                textureMap.put(TextureKey.SIDE, new Identifier("minecraft", "block/sandstone"));
            }
            case RED_SANDSTONE -> {
                textureMap.put(TextureKey.END, new Identifier("minecraft", "block/red_sandstone_top"));
                textureMap.put(TextureKey.SIDE, new Identifier("minecraft", "block/red_sandstone"));
            }
        }
        Identifier identifier = new Model(Optional.of(new Identifier(Compressed.MOD_ID, "block/compressed_cube_column")), Optional.empty(), TextureKey.LAYER0, TextureKey.SIDE, TextureKey.END)
                .upload(block.get(compression), textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(block.get(compression), identifier));
    }
}
