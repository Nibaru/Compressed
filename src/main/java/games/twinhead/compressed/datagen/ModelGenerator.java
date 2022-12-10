package games.twinhead.compressed.datagen;

import games.twinhead.compressed.Compressed;
import games.twinhead.compressed.block.CompressedBlocks;
import games.twinhead.compressed.registry.RegisterBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModelGenerator extends FabricModelProvider {
    public ModelGenerator(FabricDataOutput data) {
        super(data);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerSimpleCubeAll(RegisterBlocks.compressedBlocks.get("charcoal_block"));
        blockStateModelGenerator.registerSimpleCubeAll(RegisterBlocks.compressedBlocks.get("compactor"));

        for (CompressedBlocks block: CompressedBlocks.values()) {
            for (int i = 0; i < block.getCompression(); i++) {
                switch (block){
                    case OAK_LOG,
                            ACACIA_LOG,
                            BIRCH_LOG,
                            DARK_OAK_LOG,
                            JUNGLE_LOG,
                            MANGROVE_LOG,
                            SPRUCE_LOG ->
                        registerLog(blockStateModelGenerator, block, i+1);
                    case OAK_LEAVES,
                            ACACIA_LEAVES,
                            BIRCH_LEAVES,
                            DARK_OAK_LEAVES,
                            JUNGLE_LEAVES,
                            MANGROVE_LEAVES,
                            SPRUCE_LEAVES ->
                        registerLeaves(blockStateModelGenerator, block, i+1);
                    case BASALT,
                            BONE_BLOCK,
                            HAY_BLOCK
                            -> registerAxisRotated(blockStateModelGenerator, block, i+1);
                    case MELON,
                        PUMPKIN,
                        DRIED_KELP_BLOCK -> registerColumn(blockStateModelGenerator, block, i+1);
                    case GRASS_BLOCK,
                            MYCELIUM,
                            PODZOL,
                            WARPED_NYLIUM,
                            CRIMSON_NYLIUM ->
                            registerGrass(blockStateModelGenerator, block, i+1);
                    case MANGROVE_ROOTS -> registerRoots(blockStateModelGenerator, block, i+1);
                default -> registerCubeAll(blockStateModelGenerator, block, i+1);
            }
            }
        }
    }






    public void registerRoots(BlockStateModelGenerator blockStateModelGenerator, CompressedBlocks block, int compression){
        TextureMap textureMap = TextureMap.sideAndTop(block.getCopyBlock());
        textureMap.put(TextureKey.LAYER0, new Identifier(Compressed.MOD_ID, "block/compressed_" + Compressed.intToRoman(compression)));

        Identifier identifier = new Model(Optional.of(new Identifier(Compressed.MOD_ID, "block/compressed_roots")), Optional.empty(), TextureKey.LAYER0, TextureKey.SIDE, TextureKey.TOP)
                .upload(block.getBlock(compression), textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(block.getBlock(compression), identifier));
    }

    public void registerGrass(BlockStateModelGenerator blockStateModelGenerator, CompressedBlocks block, int compression){
        TextureMap textureMap = TextureMap.sideTopBottom(block.getCopyBlock());
        textureMap.put(TextureKey.LAYER0, new Identifier(Compressed.MOD_ID, "block/compressed_" + Compressed.intToRoman(compression)));
        textureMap.put(TextureKey.BOTTOM, new Identifier("minecraft", "block/dirt"));

        if (block == CompressedBlocks.GRASS_BLOCK) {
            textureMap.put(TextureKey.EDGE, new Identifier("minecraft", "block/grass_block_side_overlay"));
        } else {
            textureMap.put(TextureKey.EDGE, textureMap.getTexture(TextureKey.SIDE));
        }

        if (block == CompressedBlocks.CRIMSON_NYLIUM || block == CompressedBlocks.WARPED_NYLIUM) {
            textureMap.put(TextureKey.BOTTOM, new Identifier("minecraft", "block/netherrack"));
            textureMap.put(TextureKey.TOP, new Identifier("minecraft", "block/"+block.toString().toLowerCase()));
        }


        Identifier identifier = new Model(Optional.of(new Identifier(Compressed.MOD_ID, "block/compressed_grass")), Optional.empty(), TextureKey.LAYER0, TextureKey.SIDE, TextureKey.TOP, TextureKey.BOTTOM, TextureKey.EDGE)
                .upload(block.getBlock(compression), textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(block.getBlock(compression), identifier));
    }


    public void registerColumn(BlockStateModelGenerator blockStateModelGenerator, CompressedBlocks block, int compression){
        TextureMap textureMap = TextureMap.sideEnd(block.getCopyBlock());
        textureMap.put(TextureKey.LAYER0, new Identifier(Compressed.MOD_ID, "block/compressed_" + Compressed.intToRoman(compression)));

        switch (block){
            case DRIED_KELP_BLOCK -> {
                textureMap.put(TextureKey.END, new Identifier("minecraft", "block/dried_kelp_top"));
                textureMap.put(TextureKey.SIDE, new Identifier("minecraft", "block/dried_kelp_side"));
            }
        }
        Identifier identifier = new Model(Optional.of(new Identifier(Compressed.MOD_ID, "block/compressed_cube_column")), Optional.empty(), TextureKey.LAYER0, TextureKey.SIDE, TextureKey.END)
                .upload(block.getBlock(compression), textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(block.getBlock(compression), identifier));
    }

    public void registerAxisRotated(BlockStateModelGenerator blockStateModelGenerator, CompressedBlocks block, int compression){
        TextureMap textureMap = TextureMap.sideEnd(block.getCopyBlock());
        textureMap.put(TextureKey.LAYER0, new Identifier(Compressed.MOD_ID, "block/compressed_" + Compressed.intToRoman(compression)));
        Identifier identifier = new Model(Optional.of(new Identifier(Compressed.MOD_ID, "block/compressed_cube_column")), Optional.empty(), TextureKey.LAYER0, TextureKey.SIDE, TextureKey.END)
                .upload(block.getBlock(compression), textureMap, blockStateModelGenerator.modelCollector);
        Identifier identifier2 = new Model(Optional.of(new Identifier(Compressed.MOD_ID, "block/compressed_cube_column_horizontal")), Optional.of("_horizontal"), TextureKey.LAYER0, TextureKey.SIDE, TextureKey.END)
                .upload(block.getBlock(compression), textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createAxisRotatedBlockState(block.getBlock(compression), identifier, identifier2));
    }

    public void registerLog(BlockStateModelGenerator blockStateModelGenerator, CompressedBlocks block, int compression){
        TextureMap textureMap = TextureMap.sideEnd(block.getCopyBlock());
        textureMap.put(TextureKey.LAYER0, new Identifier(Compressed.MOD_ID, "block/compressed_" + Compressed.intToRoman(compression)));
        textureMap.put(TextureKey.SIDE, new Identifier("minecraft", "block/" + block.toString().toLowerCase()));
        Identifier identifier = new Model(Optional.of(new Identifier(Compressed.MOD_ID, "block/compressed_cube_column")), Optional.empty(), TextureKey.LAYER0, TextureKey.SIDE, TextureKey.END)
                .upload(block.getBlock(compression), textureMap, blockStateModelGenerator.modelCollector);
        Identifier identifier2 = new Model(Optional.of(new Identifier(Compressed.MOD_ID, "block/compressed_cube_column_horizontal")), Optional.of("_horizontal"), TextureKey.LAYER0, TextureKey.SIDE, TextureKey.END)
                .upload(block.getBlock(compression), textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createAxisRotatedBlockState(block.getBlock(compression), identifier, identifier2));
    }

    public void registerLeaves(BlockStateModelGenerator blockStateModelGenerator, CompressedBlocks block, int compression){
        TextureMap textureMap = TextureMap.all(block.getCopyBlock());
        textureMap.put(TextureKey.LAYER0, new Identifier(Compressed.MOD_ID, "block/compressed_" + Compressed.intToRoman(compression)));

        Identifier model = new Model(Optional.of(new Identifier(Compressed.MOD_ID, "block/compressed_leaves")), Optional.empty(), TextureKey.ALL, TextureKey.LAYER0)
                .upload(new Identifier(Compressed.MOD_ID, "block/"+ block.getName(compression)), textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(block.getBlock(compression), model));

    }

    public void registerCubeAll(BlockStateModelGenerator blockStateModelGenerator, CompressedBlocks block, int compression){
        TextureMap textureMap = TextureMap.all(block.getCopyBlock());
        textureMap.put(TextureKey.LAYER0, new Identifier(Compressed.MOD_ID, "block/compressed_" + Compressed.intToRoman(compression)));

        switch (block){
            case MAGMA_BLOCK -> textureMap.put(TextureKey.ALL, new Identifier("minecraft", "block/magma"));
            case SNOW_BLOCK -> textureMap.put(TextureKey.ALL, new Identifier("minecraft", "block/snow"));
            case QUARTZ_BLOCK -> textureMap.put(TextureKey.ALL, new Identifier("minecraft", "block/quartz_block_side"));
            case HONEY_BLOCK -> textureMap.put(TextureKey.ALL, new Identifier("minecraft", "block/honey_block_bottom"));

        }

        Identifier model = new Model(Optional.of(new Identifier(Compressed.MOD_ID, "block/compressed_cube_all")), Optional.empty(), TextureKey.ALL, TextureKey.LAYER0)
                .upload(new Identifier(Compressed.MOD_ID, "block/"+ block.getName(compression)), textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(block.getBlock(compression), model));

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
