package games.twinhead.compressed;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public enum CompressedBlocks {
    ACACIA_LOG(4, Blocks.ACACIA_LOG, 300),
    AMETHYST_BLOCK(4, Blocks.AMETHYST_BLOCK),
    ANDESITE(4, Blocks.ANDESITE),
    BASALT(4, Blocks.BASALT),
    BIRCH_LOG(4, Blocks.BIRCH_LOG, 300),
    BLACKSTONE(4, Blocks.BLACKSTONE),
    BLUE_ICE(4, Blocks.BLUE_ICE),
    BONE_BLOCK(4, Blocks.BONE_BLOCK),
    BRICKS(4, Blocks.BRICKS),
    CALCITE(4, Blocks.CALCITE),
    CHARCOAL_BLOCK(4, Blocks.COAL_BLOCK, 16000),
    CLAY(4, Blocks.CLAY),
    COAL_BLOCK(4, Blocks.COAL_BLOCK, 16000),
    COARSE_DIRT(4, Blocks.COARSE_DIRT),
    COBBLED_DEEPSLATE(4, Blocks.COBBLED_DEEPSLATE),
    COBBLESTONE(9, Blocks.COBBLESTONE),
    COPPER_BLOCK(4, Blocks.COPPER_BLOCK),
    CRIMSON_NYLIUM(4, Blocks.CRIMSON_NYLIUM),
    CRIMSON_STEM(4, Blocks.CRIMSON_STEM),
    DARK_OAK_LOG(4, Blocks.DARK_OAK_LOG, 300),
    DARK_PRISMARINE(4, Blocks.DARK_PRISMARINE),
    DEEPSLATE(4, Blocks.DEEPSLATE),
    DIAMOND_BLOCK(4, Blocks.DIAMOND_BLOCK),
    DIORITE(4, Blocks.DIORITE),
    DIRT(4, Blocks.DIRT),
    DRIED_KELP_BLOCK(4, Blocks.DRIED_KELP_BLOCK, 4000),
    DRIPSTONE_BLOCK(4, Blocks.DRIPSTONE_BLOCK),
    EMERALD_BLOCK(4, Blocks.EMERALD_BLOCK),
    END_STONE(4, Blocks.END_STONE),
    GLOWSTONE(4, Blocks.GLOWSTONE),
    GOLD_BLOCK(4, Blocks.GOLD_BLOCK),
    GRANITE(4, Blocks.GRANITE),
    GRASS_BLOCK(4, Blocks.GRASS_BLOCK),
    GRAVEL(4, Blocks.GRAVEL),
    HAY_BLOCK(4, Blocks.HAY_BLOCK),
    HONEY_BLOCK(4, Blocks.HONEY_BLOCK),
    HONEYCOMB_BLOCK(4, Blocks.HONEYCOMB_BLOCK),
    IRON_BLOCK(4, Blocks.IRON_BLOCK),
    JUNGLE_LOG(4, Blocks.JUNGLE_LOG, 300),
    LAPIS_BLOCK(4, Blocks.LAPIS_BLOCK),
    MAGMA_BLOCK(4, Blocks.MAGMA_BLOCK),
    MELON(4, Blocks.MELON),
    MOSS_BLOCK(4, Blocks.MOSS_BLOCK),
    MOSSY_COBBLESTONE(4, Blocks.MOSSY_COBBLESTONE),
    MYCELIUM(4, Blocks.MYCELIUM),
    NETHER_BRICKS(4, Blocks.NETHER_BRICKS),
    NETHERITE_BLOCK(4, Blocks.NETHERITE_BLOCK),
    NETHER_WART_BLOCK(4, Blocks.NETHER_WART_BLOCK),
    NETHERRACK(4, Blocks.NETHERRACK),
    OAK_LOG(4, Blocks.OAK_LOG, 300),
    OBSIDIAN(4, Blocks.OBSIDIAN),
    OXIDIZED_COPPER(4, Blocks.OXIDIZED_COPPER),
    PODZOL(4, Blocks.PODZOL),
    PRISMARINE(4, Blocks.PRISMARINE),
    PUMPKIN(4, Blocks.PUMPKIN),
    QUARTZ_BLOCK(4, Blocks.QUARTZ_BLOCK),
    RAW_COPPER_BLOCK(4, Blocks.RAW_COPPER_BLOCK),
    RAW_GOLD_BLOCK(4, Blocks.RAW_GOLD_BLOCK),
    RAW_IRON_BLOCK(4, Blocks.RAW_IRON_BLOCK),
    RED_SAND(4, Blocks.RED_SAND),
    RED_SANDSTONE(4, Blocks.RED_SANDSTONE),
    REDSTONE_BLOCK(4, Blocks.REDSTONE_BLOCK),
    ROOTED_DIRT(4, Blocks.ROOTED_DIRT),
    SAND(4, Blocks.SAND),
    SANDSTONE(4, Blocks.SANDSTONE),
    SEA_LANTERN(4, Blocks.SEA_LANTERN),
    SHROOMLIGHT(4, Blocks.SHROOMLIGHT),
    SLIME_BLOCK(4, Blocks.SLIME_BLOCK),
    SNOW_BLOCK(4, Blocks.SNOW_BLOCK),
    SOUL_SAND(4, Blocks.SOUL_SAND),
    SOUL_SOIL(4, Blocks.SOUL_SOIL),
    SPRUCE_LOG(4, Blocks.SPRUCE_LOG),
    STONE_BRICKS(4, Blocks.STONE_BRICKS),
    STONE(4, Blocks.STONE),
    TUFF(4, Blocks.TUFF),
    WARPED_NYLIUM(4, Blocks.WARPED_NYLIUM),
    WARPED_STEM(4, Blocks.WARPED_STEM),
    WARPED_WART_BLOCK(4, Blocks.WARPED_WART_BLOCK),
    TERRACOTTA_PLAIN(4, Blocks.TERRACOTTA),
    TERRACOTTA(4, Blocks.TERRACOTTA, true),
    WOOL(4, Blocks.WHITE_WOOL, true),
    CONCRETE(4, Blocks.WHITE_CONCRETE, true),
    CONCRETE_POWDER(4, Blocks.WHITE_CONCRETE_POWDER, true),
    COAL_ORE(4, Blocks.COAL_ORE),
    IRON_ORE(4, Blocks.IRON_ORE),
    COPPER_ORE(4, Blocks.COPPER_ORE),
    GOLD_ORE(4, Blocks.GOLD_ORE),
    DIAMOND_ORE(4, Blocks.DIAMOND_ORE),
    LAPIS_ORE(4, Blocks.LAPIS_ORE),
    REDSTONE_ORE(4, Blocks.REDSTONE_ORE),
    DEEPSLATE_COAL_ORE(4, Blocks.DEEPSLATE_COAL_ORE),
    DEEPSLATE_IRON_ORE(4, Blocks.DEEPSLATE_IRON_ORE),
    DEEPSLATE_COPPER_ORE(4, Blocks.DEEPSLATE_COPPER_ORE),
    DEEPSLATE_GOLD_ORE(4, Blocks.DEEPSLATE_GOLD_ORE),
    DEEPSLATE_DIAMOND_ORE(4, Blocks.DEEPSLATE_DIAMOND_ORE),
    DEEPSLATE_LAPIS_ORE(4, Blocks.DEEPSLATE_LAPIS_ORE),
    DEEPSLATE_REDSTONE_ORE(4, Blocks.DEEPSLATE_REDSTONE_ORE),
    NETHER_QUARTZ_ORE(4, Blocks.NETHER_QUARTZ_ORE),
    NETHER_GOLD_ORE(4, Blocks.NETHER_GOLD_ORE),
    ACACIA_LEAVES(4, Blocks.ACACIA_LEAVES),
    BIRCH_LEAVES(4, Blocks.BIRCH_LEAVES),
    JUNGLE_LEAVES(4, Blocks.JUNGLE_LEAVES),
    DARK_OAK_LEAVES(4, Blocks.DARK_OAK_LEAVES),
    OAK_LEAVES(4, Blocks.OAK_LEAVES),
    SPRUCE_LEAVES(4, Blocks.SPRUCE_LEAVES),
    SCULK(4, Blocks.SCULK),
    MANGROVE_LOG(4, Blocks.MANGROVE_LOG, 300),
    MANGROVE_LEAVES(4, Blocks.MANGROVE_LEAVES),
    MANGROVE_ROOTS(4, Blocks.MANGROVE_ROOTS),
    MUD(4, Blocks.MUD),
    MUD_BRICKS(4, Blocks.MUD_BRICKS),
    PACKED_MUD(4, Blocks.PACKED_MUD),
    GLASS(4, Blocks.GLASS)
    ;




    private final int compression;
    private final Block block;
    private int burnTime;
    private boolean colorBlock;

    CompressedBlocks(int compression, Block block){
        this.compression = compression;
        this.block = block;
    }

    CompressedBlocks(int compression, Block block, int burnTime){
        this.compression = compression;
        this.block = block;
        this.burnTime = burnTime;
    }

    CompressedBlocks(int compression, Block block, boolean colorBlock){
        this.compression = compression;
        this.block = block;
        this.colorBlock = colorBlock;
    }

    public int getCompression(){
        return this.compression;
    }

    public Block getCopyBlock() {
        return block;
    }

    public int getBurnTime() {
        return burnTime;
    }

    public int getBurnTime(int compression) {
        return (int) ((Math.pow(9, compression)) * getBurnTime());
    }

    public boolean isColorBlock() {
        return colorBlock;
    }

    public Block getBlock() {
        return switch (this){
            case ACACIA_LOG,
                    BIRCH_LOG,
                    CRIMSON_STEM,
                    DARK_OAK_LOG,
                    JUNGLE_LOG,
                    OAK_LOG,
                    SPRUCE_LOG,
                    BONE_BLOCK,
                    WARPED_STEM,
                    BASALT,
                    MANGROVE_LOG-> new PillarBlock(FabricBlockSettings.copy(this.getCopyBlock()));
            case SAND, GRAVEL, RED_SAND -> new FallingBlock(FabricBlockSettings.copy(this.getCopyBlock()));
            case HAY_BLOCK -> new HayBlock(FabricBlockSettings.copy(this.getCopyBlock()));
            case HONEY_BLOCK -> new HoneyBlock(FabricBlockSettings.copy(this.getCopyBlock()));
            case SLIME_BLOCK -> new SlimeBlock(FabricBlockSettings.copy(this.getCopyBlock()));
            case MAGMA_BLOCK -> new MagmaBlock(FabricBlockSettings.copy(this.getCopyBlock()));
            case REDSTONE_BLOCK -> new RedstoneBlock(FabricBlockSettings.copy(this.getCopyBlock()));
            case REDSTONE_ORE, DEEPSLATE_REDSTONE_ORE -> new RedstoneOreBlock(FabricBlockSettings.copy(this.getCopyBlock()));
            case ACACIA_LEAVES,
                    BIRCH_LEAVES,
                    DARK_OAK_LEAVES,
                    OAK_LEAVES,
                    SPRUCE_LEAVES,
                    MANGROVE_LEAVES -> new LeavesBlock(FabricBlockSettings.copy(this.getCopyBlock()).nonOpaque());
            case GLASS -> new GlassBlock(FabricBlockSettings.copy(this.getCopyBlock()).nonOpaque());
            default -> new Block(FabricBlockSettings.copy(this.getCopyBlock()));
        };
    }

    public Block getWitherProofBlock(){
        return new Block(FabricBlockSettings.copy(this.getCopyBlock()).strength(2, 5000));
    }
    public Block getColorBlock(){
        return switch(this){
            case CONCRETE_POWDER -> new FallingBlock(FabricBlockSettings.copy(this.getCopyBlock()));
            default -> new Block(FabricBlockSettings.copy(this.getCopyBlock()));
        };
    }

    public Item getItem(int compression){
        Item.Settings settings = new Item.Settings().group(Compressed.COMPRESSED_GROUP);
        return new BlockItem(this.getBlock(), settings);
    }

    public String getName(int compression){
        if(this.equals(TERRACOTTA_PLAIN))
            return "terracotta" + "_" + Compressed.intToRoman(compression);

        return this.toString().toLowerCase() + "_" + Compressed.intToRoman(compression);
    }
}
