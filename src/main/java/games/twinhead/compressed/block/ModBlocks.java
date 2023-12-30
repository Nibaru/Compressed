package games.twinhead.compressed.block;

import games.twinhead.compressed.Compressed;
import games.twinhead.compressed.registry.BlockRegistry;
import games.twinhead.compressed.util.ModModelType;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public enum ModBlocks {

    AMETHYST_BLOCK(Blocks.AMETHYST_BLOCK, BlockTags.PICKAXE_MINEABLE, BlockTags.CRYSTAL_SOUND_BLOCKS),
    ANDESITE(9, Blocks.ANDESITE, BlockTags.PICKAXE_MINEABLE),
    BASALT(Blocks.BASALT, ModModelType.PILLAR_ROTATED, BlockTags.PICKAXE_MINEABLE),
    BLACKSTONE(Blocks.BLACKSTONE, BlockTags.PICKAXE_MINEABLE),
    BLUE_ICE(Blocks.BLUE_ICE, BlockTags.PICKAXE_MINEABLE),
    BONE_BLOCK(Blocks.BONE_BLOCK, ModModelType.PILLAR_ROTATED, BlockTags.PICKAXE_MINEABLE),
    BRICKS(Blocks.BRICKS, BlockTags.PICKAXE_MINEABLE),
    CALCITE(Blocks.CALCITE, BlockTags.PICKAXE_MINEABLE),
    CLAY(Blocks.CLAY, BlockTags.SHOVEL_MINEABLE),
    COAL_BLOCK(Blocks.COAL_BLOCK, BlockTags.PICKAXE_MINEABLE),
    COARSE_DIRT(Blocks.COARSE_DIRT, BlockTags.SHOVEL_MINEABLE),
    COBBLED_DEEPSLATE(9, Blocks.COBBLED_DEEPSLATE, BlockTags.PICKAXE_MINEABLE),
    COBBLESTONE(9, Blocks.COBBLESTONE, BlockTags.PICKAXE_MINEABLE),
    COPPER_BLOCK(Blocks.COPPER_BLOCK, BlockTags.PICKAXE_MINEABLE),
    CRIMSON_STEM(Blocks.CRIMSON_STEM, BlockTags.PICKAXE_MINEABLE),
    DARK_PRISMARINE(Blocks.DARK_PRISMARINE, BlockTags.PICKAXE_MINEABLE),
    DEEPSLATE(Blocks.DEEPSLATE, BlockTags.PICKAXE_MINEABLE),
    DIORITE(9, Blocks.DIORITE, BlockTags.PICKAXE_MINEABLE),
    DIRT(9, Blocks.DIRT, BlockTags.SHOVEL_MINEABLE),
    DRIPSTONE_BLOCK(Blocks.DRIPSTONE_BLOCK, BlockTags.PICKAXE_MINEABLE),
    END_STONE(Blocks.END_STONE, BlockTags.PICKAXE_MINEABLE),
    GLOWSTONE(Blocks.GLOWSTONE),
    GRANITE(9, Blocks.GRANITE, BlockTags.PICKAXE_MINEABLE),
    GRAVEL(Blocks.GRAVEL, ModModelType.FALLING, BlockTags.SHOVEL_MINEABLE),
    HAY_BLOCK(Blocks.HAY_BLOCK, ModModelType.HAY, BlockTags.HOE_MINEABLE),
    HONEY_BLOCK(Blocks.HONEY_BLOCK),
    HONEYCOMB_BLOCK(Blocks.HONEYCOMB_BLOCK),
    LAPIS_BLOCK(Blocks.LAPIS_BLOCK, BlockTags.PICKAXE_MINEABLE),
    MAGMA_BLOCK(Blocks.MAGMA_BLOCK, ModModelType.MAGMA, BlockTags.PICKAXE_MINEABLE),
    MELON(Blocks.MELON, ModModelType.PILLAR, BlockTags.AXE_MINEABLE),
    MOSS_BLOCK(Blocks.MOSS_BLOCK, BlockTags.HOE_MINEABLE),
    MOSSY_COBBLESTONE(Blocks.MOSSY_COBBLESTONE, BlockTags.PICKAXE_MINEABLE),
    MYCELIUM(Blocks.MYCELIUM, ModModelType.GRASS, BlockTags.SHOVEL_MINEABLE),
    NETHER_BRICKS(Blocks.NETHER_BRICKS, BlockTags.PICKAXE_MINEABLE),
    NETHER_WART_BLOCK(Blocks.NETHER_WART_BLOCK, BlockTags.HOE_MINEABLE),
    NETHERRACK(Blocks.NETHERRACK, BlockTags.PICKAXE_MINEABLE),
    OBSIDIAN(Blocks.OBSIDIAN, BlockTags.PICKAXE_MINEABLE),
    OXIDIZED_COPPER(Blocks.OXIDIZED_COPPER, BlockTags.PICKAXE_MINEABLE),
    PODZOL(Blocks.PODZOL, ModModelType.GRASS, BlockTags.AXE_MINEABLE),
    PRISMARINE(Blocks.PRISMARINE, BlockTags.PICKAXE_MINEABLE),
    PUMPKIN(Blocks.PUMPKIN, ModModelType.PILLAR, BlockTags.AXE_MINEABLE),
    QUARTZ_BLOCK(Blocks.QUARTZ_BLOCK, BlockTags.PICKAXE_MINEABLE),
    RAW_COPPER_BLOCK(Blocks.RAW_COPPER_BLOCK, BlockTags.PICKAXE_MINEABLE),
    RAW_GOLD_BLOCK(Blocks.RAW_GOLD_BLOCK, BlockTags.PICKAXE_MINEABLE),
    RAW_IRON_BLOCK(Blocks.RAW_IRON_BLOCK, BlockTags.PICKAXE_MINEABLE),
    RED_SAND(Blocks.RED_SAND, ModModelType.FALLING, BlockTags.SHOVEL_MINEABLE),
    RED_SANDSTONE(Blocks.RED_SANDSTONE, ModModelType.PILLAR, BlockTags.PICKAXE_MINEABLE),
    REDSTONE_BLOCK(Blocks.REDSTONE_BLOCK, BlockTags.PICKAXE_MINEABLE),
    ROOTED_DIRT(Blocks.ROOTED_DIRT, BlockTags.SHOVEL_MINEABLE),
    SAND(Blocks.SAND, ModModelType.FALLING, BlockTags.SHOVEL_MINEABLE),
    SANDSTONE(Blocks.SANDSTONE, ModModelType.PILLAR, BlockTags.PICKAXE_MINEABLE),
    SEA_LANTERN(Blocks.SEA_LANTERN),
    SHROOMLIGHT(Blocks.SHROOMLIGHT, BlockTags.HOE_MINEABLE),
    SLIME_BLOCK(Blocks.SLIME_BLOCK, ModModelType.SLIME),
    SNOW_BLOCK(Blocks.SNOW_BLOCK, BlockTags.SHOVEL_MINEABLE),
    SOUL_SAND(Blocks.SOUL_SAND, BlockTags.SHOVEL_MINEABLE, BlockTags.SOUL_SPEED_BLOCKS, BlockTags.SOUL_FIRE_BASE_BLOCKS),
    SOUL_SOIL(Blocks.SOUL_SOIL, BlockTags.SHOVEL_MINEABLE, BlockTags.SOUL_SPEED_BLOCKS, BlockTags.SOUL_FIRE_BASE_BLOCKS),
    STONE_BRICKS(Blocks.STONE_BRICKS, BlockTags.PICKAXE_MINEABLE),
    STONE(Blocks.STONE, BlockTags.PICKAXE_MINEABLE),
    TUFF(Blocks.TUFF, BlockTags.PICKAXE_MINEABLE),
    WARPED_STEM(Blocks.WARPED_STEM, ModModelType.LOG, BlockTags.AXE_MINEABLE),
    WARPED_WART_BLOCK(Blocks.WARPED_WART_BLOCK, BlockTags.HOE_MINEABLE),
    GRASS_BLOCK(Blocks.GRASS_BLOCK, ModModelType.GRASS, BlockTags.SHOVEL_MINEABLE),
    CRIMSON_NYLIUM(Blocks.CRIMSON_NYLIUM, ModModelType.TRANSLUCENT, BlockTags.PICKAXE_MINEABLE),
    WARPED_NYLIUM(Blocks.WARPED_NYLIUM, ModModelType.TRANSLUCENT, BlockTags.PICKAXE_MINEABLE),

    DRIED_KELP_BLOCK(Blocks.DRIED_KELP_BLOCK, ModModelType.PILLAR, BlockTags.HOE_MINEABLE),

    EMERALD_BLOCK(Blocks.EMERALD_BLOCK, BlockTags.PICKAXE_MINEABLE, BlockTags.BEACON_BASE_BLOCKS),
    IRON_BLOCK(Blocks.IRON_BLOCK, BlockTags.PICKAXE_MINEABLE, BlockTags.BEACON_BASE_BLOCKS),
    DIAMOND_BLOCK(Blocks.DIAMOND_BLOCK, BlockTags.PICKAXE_MINEABLE, BlockTags.BEACON_BASE_BLOCKS),
    GOLD_BLOCK(Blocks.GOLD_BLOCK, BlockTags.PICKAXE_MINEABLE, BlockTags.BEACON_BASE_BLOCKS),
    NETHERITE_BLOCK(Blocks.NETHERITE_BLOCK, BlockTags.PICKAXE_MINEABLE, BlockTags.BEACON_BASE_BLOCKS),


    COAL_ORE(Blocks.COAL_ORE, BlockTags.PICKAXE_MINEABLE),
    IRON_ORE(Blocks.IRON_ORE, BlockTags.PICKAXE_MINEABLE),
    COPPER_ORE(Blocks.COPPER_ORE, BlockTags.PICKAXE_MINEABLE),
    GOLD_ORE(Blocks.GOLD_ORE, BlockTags.PICKAXE_MINEABLE),
    DIAMOND_ORE(Blocks.DIAMOND_ORE, BlockTags.PICKAXE_MINEABLE),
    LAPIS_ORE(Blocks.LAPIS_ORE, BlockTags.PICKAXE_MINEABLE),
    EMERALD_ORE(Blocks.EMERALD_ORE, BlockTags.PICKAXE_MINEABLE),
    REDSTONE_ORE(Blocks.REDSTONE_ORE, BlockTags.PICKAXE_MINEABLE),
    DEEPSLATE_COAL_ORE(Blocks.DEEPSLATE_COAL_ORE, BlockTags.PICKAXE_MINEABLE),
    DEEPSLATE_IRON_ORE(Blocks.DEEPSLATE_IRON_ORE, BlockTags.PICKAXE_MINEABLE),
    DEEPSLATE_COPPER_ORE(Blocks.DEEPSLATE_COPPER_ORE, BlockTags.PICKAXE_MINEABLE),
    DEEPSLATE_GOLD_ORE(Blocks.DEEPSLATE_GOLD_ORE, BlockTags.PICKAXE_MINEABLE),
    DEEPSLATE_DIAMOND_ORE(Blocks.DEEPSLATE_DIAMOND_ORE, BlockTags.PICKAXE_MINEABLE),
    DEEPSLATE_LAPIS_ORE(Blocks.DEEPSLATE_LAPIS_ORE, BlockTags.PICKAXE_MINEABLE),
    DEEPSLATE_REDSTONE_ORE(Blocks.DEEPSLATE_REDSTONE_ORE, BlockTags.PICKAXE_MINEABLE),
    DEEPSLATE_EMERALD_ORE(Blocks.DEEPSLATE_EMERALD_ORE, BlockTags.PICKAXE_MINEABLE),
    NETHER_QUARTZ_ORE(Blocks.NETHER_QUARTZ_ORE, BlockTags.PICKAXE_MINEABLE),
    NETHER_GOLD_ORE(Blocks.NETHER_GOLD_ORE, BlockTags.PICKAXE_MINEABLE),

    ACACIA_LOG(Blocks.ACACIA_LOG, ModModelType.LOG, BlockTags.AXE_MINEABLE),
    BIRCH_LOG(Blocks.BIRCH_LOG, ModModelType.LOG, BlockTags.AXE_MINEABLE),
    JUNGLE_LOG(Blocks.JUNGLE_LOG, ModModelType.LOG, BlockTags.AXE_MINEABLE),
    DARK_OAK_LOG(Blocks.DARK_OAK_LOG, ModModelType.LOG, BlockTags.AXE_MINEABLE),
    OAK_LOG(Blocks.OAK_LOG, ModModelType.LOG, BlockTags.AXE_MINEABLE),
    SPRUCE_LOG(Blocks.SPRUCE_LOG, ModModelType.LOG, BlockTags.AXE_MINEABLE),
    CHERRY_LOG(Blocks.CHERRY_LOG, ModModelType.LOG, BlockTags.AXE_MINEABLE),
    MANGROVE_LOG(Blocks.MANGROVE_LOG, ModModelType.LOG, BlockTags.AXE_MINEABLE),

    ACACIA_LEAVES(Blocks.ACACIA_LEAVES, ModModelType.LEAVES, BlockTags.HOE_MINEABLE),
    BIRCH_LEAVES(Blocks.BIRCH_LEAVES, ModModelType.LEAVES, BlockTags.HOE_MINEABLE),
    JUNGLE_LEAVES(Blocks.JUNGLE_LEAVES, ModModelType.LEAVES, BlockTags.HOE_MINEABLE),
    DARK_OAK_LEAVES(Blocks.DARK_OAK_LEAVES, ModModelType.LEAVES, BlockTags.HOE_MINEABLE),
    OAK_LEAVES(Blocks.OAK_LEAVES, ModModelType.LEAVES, BlockTags.HOE_MINEABLE),
    SPRUCE_LEAVES(Blocks.SPRUCE_LEAVES, ModModelType.LEAVES, BlockTags.HOE_MINEABLE),
    AZALEA_LEAVES(Blocks.AZALEA_LEAVES, ModModelType.LEAVES, BlockTags.HOE_MINEABLE),
    FLOWERING_AZALEA_LEAVES(Blocks.FLOWERING_AZALEA_LEAVES,ModModelType.LEAVES, BlockTags.HOE_MINEABLE),
    CHERRY_LEAVES(Blocks.CHERRY_LEAVES, ModModelType.LEAVES, BlockTags.HOE_MINEABLE),
    MANGROVE_LEAVES(Blocks.MANGROVE_LEAVES, ModModelType.LEAVES, BlockTags.HOE_MINEABLE),


    SCULK(Blocks.SCULK, BlockTags.HOE_MINEABLE),
    MANGROVE_ROOTS(Blocks.MANGROVE_ROOTS, ModModelType.ROOTS, BlockTags.AXE_MINEABLE),
    MUD(Blocks.MUD, BlockTags.SHOVEL_MINEABLE),
    MUD_BRICKS(Blocks.MUD_BRICKS, BlockTags.PICKAXE_MINEABLE),
    PACKED_MUD(Blocks.PACKED_MUD, BlockTags.PICKAXE_MINEABLE),

    GLASS(Blocks.GLASS, ModModelType.TRANSLUCENT),

    WHITE_STAINED_GLASS(Blocks.WHITE_STAINED_GLASS, ModModelType.TRANSLUCENT),
    YELLOW_STAINED_GLASS(Blocks.YELLOW_STAINED_GLASS, ModModelType.TRANSLUCENT),
    BLACK_STAINED_GLASS (Blocks.BLACK_STAINED_GLASS, ModModelType.TRANSLUCENT),
    RED_STAINED_GLASS(Blocks.RED_STAINED_GLASS, ModModelType.TRANSLUCENT),
    PURPLE_STAINED_GLASS(Blocks.PURPLE_STAINED_GLASS, ModModelType.TRANSLUCENT),
    PINK_STAINED_GLASS(Blocks.PINK_STAINED_GLASS, ModModelType.TRANSLUCENT),
    ORANGE_STAINED_GLASS(Blocks.ORANGE_STAINED_GLASS, ModModelType.TRANSLUCENT),
    MAGENTA_STAINED_GLASS(Blocks.MAGENTA_STAINED_GLASS, ModModelType.TRANSLUCENT),
    LIME_STAINED_GLASS(Blocks.LIME_STAINED_GLASS, ModModelType.TRANSLUCENT),
    LIGHT_GRAY_STAINED_GLASS(Blocks.LIGHT_GRAY_STAINED_GLASS, ModModelType.TRANSLUCENT),
    LIGHT_BLUE_STAINED_GLASS(Blocks.LIGHT_BLUE_STAINED_GLASS, ModModelType.TRANSLUCENT),
    GREEN_STAINED_GLASS(Blocks.GREEN_STAINED_GLASS, ModModelType.TRANSLUCENT),
    GRAY_STAINED_GLASS(Blocks.GRAY_STAINED_GLASS, ModModelType.TRANSLUCENT),
    CYAN_STAINED_GLASS(Blocks.CYAN_STAINED_GLASS, ModModelType.TRANSLUCENT),
    BROWN_STAINED_GLASS(Blocks.BROWN_STAINED_GLASS, ModModelType.TRANSLUCENT),
    BLUE_STAINED_GLASS(Blocks.BLUE_STAINED_GLASS, ModModelType.TRANSLUCENT),

    TERRACOTTA(Blocks.TERRACOTTA, BlockTags.PICKAXE_MINEABLE),

    WHITE_TERRACOTTA(Blocks.WHITE_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    YELLOW_TERRACOTTA(Blocks.YELLOW_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    BLACK_TERRACOTTA (Blocks.BLACK_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    RED_TERRACOTTA(Blocks.RED_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    PURPLE_TERRACOTTA(Blocks.PURPLE_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    PINK_TERRACOTTA(Blocks.PINK_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    ORANGE_TERRACOTTA(Blocks.ORANGE_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    MAGENTA_TERRACOTTA(Blocks.MAGENTA_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    LIME_TERRACOTTA(Blocks.LIME_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    LIGHT_GRAY_TERRACOTTA(Blocks.LIGHT_GRAY_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    LIGHT_BLUE_TERRACOTTA(Blocks.LIGHT_BLUE_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    GREEN_TERRACOTTA(Blocks.GREEN_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    GRAY_TERRACOTTA(Blocks.GRAY_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    CYAN_TERRACOTTA(Blocks.CYAN_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    BROWN_TERRACOTTA(Blocks.BROWN_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),
    BLUE_TERRACOTTA(Blocks.BLUE_TERRACOTTA, BlockTags.PICKAXE_MINEABLE),

    WHITE_CONCRETE(Blocks.WHITE_CONCRETE, BlockTags.PICKAXE_MINEABLE),
    YELLOW_CONCRETE(Blocks.YELLOW_CONCRETE, BlockTags.PICKAXE_MINEABLE),
    BLACK_CONCRETE (Blocks.BLACK_CONCRETE, BlockTags.PICKAXE_MINEABLE),
    RED_CONCRETE(Blocks.RED_CONCRETE, BlockTags.PICKAXE_MINEABLE),
    PURPLE_CONCRETE(Blocks.PURPLE_CONCRETE, BlockTags.PICKAXE_MINEABLE),
    PINK_CONCRETE(Blocks.PINK_CONCRETE, BlockTags.PICKAXE_MINEABLE),
    ORANGE_CONCRETE(Blocks.ORANGE_CONCRETE, BlockTags.PICKAXE_MINEABLE),
    MAGENTA_CONCRETE(Blocks.MAGENTA_CONCRETE, BlockTags.PICKAXE_MINEABLE),
    LIME_CONCRETE(Blocks.LIME_CONCRETE, BlockTags.PICKAXE_MINEABLE),
    LIGHT_GRAY_CONCRETE(Blocks.LIGHT_GRAY_CONCRETE, BlockTags.PICKAXE_MINEABLE),
    LIGHT_BLUE_CONCRETE(Blocks.LIGHT_BLUE_CONCRETE, BlockTags.PICKAXE_MINEABLE),
    GREEN_CONCRETE(Blocks.GREEN_CONCRETE, BlockTags.PICKAXE_MINEABLE),
    GRAY_CONCRETE(Blocks.GRAY_CONCRETE, BlockTags.PICKAXE_MINEABLE),
    CYAN_CONCRETE(Blocks.CYAN_CONCRETE, BlockTags.PICKAXE_MINEABLE),
    BROWN_CONCRETE(Blocks.BROWN_CONCRETE, BlockTags.PICKAXE_MINEABLE),
    BLUE_CONCRETE(Blocks.BLUE_CONCRETE, BlockTags.PICKAXE_MINEABLE),

    WHITE_CONCRETE_POWDER(Blocks.WHITE_CONCRETE_POWDER, ModModelType.FALLING, BlockTags.SHOVEL_MINEABLE),
    YELLOW_CONCRETE_POWDER(Blocks.YELLOW_CONCRETE_POWDER, ModModelType.FALLING, BlockTags.SHOVEL_MINEABLE),
    BLACK_CONCRETE_POWDER (Blocks.BLACK_CONCRETE_POWDER, ModModelType.FALLING, BlockTags.SHOVEL_MINEABLE),
    RED_CONCRETE_POWDER(Blocks.RED_CONCRETE_POWDER, ModModelType.FALLING, BlockTags.SHOVEL_MINEABLE),
    PURPLE_CONCRETE_POWDER(Blocks.PURPLE_CONCRETE_POWDER, ModModelType.FALLING, BlockTags.SHOVEL_MINEABLE),
    PINK_CONCRETE_POWDER(Blocks.PINK_CONCRETE_POWDER, ModModelType.FALLING, BlockTags.SHOVEL_MINEABLE),
    ORANGE_CONCRETE_POWDER(Blocks.ORANGE_CONCRETE_POWDER, ModModelType.FALLING, BlockTags.SHOVEL_MINEABLE),
    MAGENTA_CONCRETE_POWDER(Blocks.MAGENTA_CONCRETE_POWDER, ModModelType.FALLING, BlockTags.SHOVEL_MINEABLE),
    LIME_CONCRETE_POWDER(Blocks.LIME_CONCRETE_POWDER, ModModelType.FALLING, BlockTags.SHOVEL_MINEABLE),
    LIGHT_GRAY_CONCRETE_POWDER(Blocks.LIGHT_GRAY_CONCRETE_POWDER, ModModelType.FALLING, BlockTags.SHOVEL_MINEABLE),
    LIGHT_BLUE_CONCRETE_POWDER(Blocks.LIGHT_BLUE_CONCRETE_POWDER, ModModelType.FALLING, BlockTags.SHOVEL_MINEABLE),
    GREEN_CONCRETE_POWDER(Blocks.GREEN_CONCRETE_POWDER, ModModelType.FALLING, BlockTags.SHOVEL_MINEABLE),
    GRAY_CONCRETE_POWDER(Blocks.GRAY_CONCRETE_POWDER, ModModelType.FALLING, BlockTags.SHOVEL_MINEABLE),
    CYAN_CONCRETE_POWDER(Blocks.CYAN_CONCRETE_POWDER, ModModelType.FALLING, BlockTags.SHOVEL_MINEABLE),
    BROWN_CONCRETE_POWDER(Blocks.BROWN_CONCRETE_POWDER, ModModelType.FALLING, BlockTags.SHOVEL_MINEABLE),
    BLUE_CONCRETE_POWDER(Blocks.BLUE_CONCRETE_POWDER, ModModelType.FALLING, BlockTags.SHOVEL_MINEABLE),

    WHITE_WOOL(Blocks.WHITE_WOOL, BlockTags.WOOL),
    YELLOW_WOOL(Blocks.YELLOW_WOOL, BlockTags.WOOL),
    BLACK_WOOL (Blocks.BLACK_WOOL, BlockTags.WOOL),
    RED_WOOL(Blocks.RED_WOOL, BlockTags.WOOL),
    PURPLE_WOOL(Blocks.PURPLE_WOOL, BlockTags.WOOL),
    PINK_WOOL(Blocks.PINK_WOOL, BlockTags.WOOL),
    ORANGE_WOOL(Blocks.ORANGE_WOOL, BlockTags.WOOL),
    MAGENTA_WOOL(Blocks.MAGENTA_WOOL, BlockTags.WOOL),
    LIME_WOOL(Blocks.LIME_WOOL, BlockTags.WOOL),
    LIGHT_GRAY_WOOL(Blocks.LIGHT_GRAY_WOOL, BlockTags.WOOL),
    LIGHT_BLUE_WOOL(Blocks.LIGHT_BLUE_WOOL, BlockTags.WOOL),
    GREEN_WOOL(Blocks.GREEN_WOOL, BlockTags.WOOL),
    GRAY_WOOL(Blocks.GRAY_WOOL, BlockTags.WOOL),
    CYAN_WOOL(Blocks.CYAN_WOOL, BlockTags.WOOL),
    BROWN_WOOL(Blocks.BROWN_WOOL, BlockTags.WOOL),
    BLUE_WOOL(Blocks.BLUE_WOOL, BlockTags.WOOL),
    ;


    private final int compression;
    private final Block parentBlock;
    private final TagKey<Block>[] blockTags;
    private final ModModelType modelType;

    @SafeVarargs
    ModBlocks(Block parent, TagKey<Block>... blockTags) {
        this(4, parent, blockTags);
    }

    @SafeVarargs
    ModBlocks(int maxCompression, Block parent, TagKey<Block>... blockTags) {
        this.compression = maxCompression;
        this.parentBlock = parent;
        this.blockTags = blockTags;
        this.modelType = ModModelType.BLOCK;
    }

    @SafeVarargs
    ModBlocks(Block parent, ModModelType modelType, TagKey<Block>... blockTags) {
        this(4, parent, modelType, blockTags);
    }

    @SafeVarargs
    ModBlocks(int maxCompression, Block parent, ModModelType modelType, TagKey<Block>... blockTags) {
        this.compression = maxCompression;
        this.parentBlock = parent;
        this.blockTags = blockTags;
        this.modelType = modelType;
    }

    public Identifier id(int compression) {
        return Compressed.id(this.toString().toLowerCase() + "_" + Compressed.intToRoman(compression));
    }

    public Identifier idPrefix(int compression, String prefix) {
        return Compressed.idPrefix(this.toString().toLowerCase() + "_" + Compressed.intToRoman(compression), prefix);
    }

    public Block get(int compression){
        return BlockRegistry.MOD_BLOCKS.get(id(compression));
    }

    public Block getParentBlock() {
        return parentBlock;
    }

    public AbstractBlock.Settings getSettings(int compression){
        Block block = this.parentBlock;
        AbstractBlock.Settings settings = AbstractBlock.Settings.create()
                .sounds(block.getDefaultState().getSoundGroup())
                .luminance((view) -> block.getDefaultState().getLuminance())
                .mapColor(block.getDefaultMapColor())
                .hardness(block.getHardness() + (0.2f * (compression + 1)))
                .resistance(block.getBlastResistance())
                .slipperiness(block.getSlipperiness())
                .nonOpaque()
                ;

        if (block.getDefaultState().isToolRequired()){
            settings = settings.requiresTool();
        }

        if (block.getDefaultState().hasRandomTicks()){
            settings = settings.ticksRandomly();
        }

        return settings;
    }



    public ModModelType getModelType() {
        return modelType;
    }

    public int getMaxCompression() {
        return compression;
    }

    public String name(int compression) {
        return this.toString().toLowerCase() + "_" + Compressed.intToRoman(compression);
    }

    public TagKey<Block>[] getBlockTags() {
        return blockTags;
    }
}
