package games.twinhead.compressed.registry;

import games.twinhead.compressed.block.ModBlocks;
import games.twinhead.compressed.item.CompressedBlockItem;
import net.minecraft.block.*;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.HashMap;

public class BlockRegistry {

    public static final HashMap<Identifier, Block> MOD_BLOCKS = new HashMap<>();

    public static void register() {
        for (ModBlocks modBlock : ModBlocks.values()) {
            for (int i = 0; i < modBlock.getMaxCompression(); i++) {
                registerBlock(modBlock, i + 1);
                registerBlockItem(modBlock, i + 1);
            }
        }
    }

    public static void registerBlockItem(ModBlocks modBlock, int compression) {
        Registry.register(Registry.ITEM, modBlock.id(compression), new CompressedBlockItem(modBlock.get(compression), modBlock.getParentBlock().asItem(), compression, new Item.Settings()));
    }

    public static void registerBlock(ModBlocks modBlock, int compression) {
        MOD_BLOCKS.put(modBlock.id(compression), Registry.register(Registry.BLOCK, modBlock.id(compression), getBlock(modBlock, compression)));
    }

    private static Block getBlock(ModBlocks modBlock, int compression) {
        return switch (modBlock.getModelType()) {
            case PILLAR, PILLAR_ROTATED, LOG -> new PillarBlock(modBlock.getSettings(compression));
            case FALLING -> new FallingBlock(modBlock.getSettings(compression));
            case HAY -> new HayBlock(modBlock.getSettings(compression));
            case HONEY -> new HoneyBlock(modBlock.getSettings(compression));
            case SLIME -> new SlimeBlock(modBlock.getSettings(compression));
            case MAGMA -> new MagmaBlock(modBlock.getSettings(compression));
            case REDSTONE -> new RedstoneBlock(modBlock.getSettings(compression));
            case REDSTONE_ORE -> new RedstoneOreBlock(modBlock.getSettings(compression));
            case TRANSLUCENT -> new GlassBlock(modBlock.getSettings(compression));
            default -> new Block(modBlock.getSettings(compression));
        };
    }
}
