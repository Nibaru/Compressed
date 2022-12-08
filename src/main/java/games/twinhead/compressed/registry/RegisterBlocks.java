package games.twinhead.compressed.registry;

import games.twinhead.compressed.Compressed;
import games.twinhead.compressed.block.CompactorBlock;
import games.twinhead.compressed.block.CompressedBlockItem;
import games.twinhead.compressed.block.CompressedBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.*;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.HashMap;

public class RegisterBlocks {
    public static HashMap<String, Block> compressedBlocks = new HashMap<>();

    private static void registerBlock(String name, Block block, int burnTime) {

        Registry.register(Registries.BLOCK, new Identifier(Compressed.MOD_ID, name), block);

        compressedBlocks.put(name, block);

        Item item = new CompressedBlockItem(block, new Item.Settings(), name, burnTime);

        if(burnTime > 0)
            FuelRegistry.INSTANCE.add(item, burnTime);

        RegisterItems.registerItem(name, item);
    }

    public static void registerBlocks(){
        registerBlock("compactor", new CompactorBlock(FabricBlockSettings.copyOf(Blocks.DISPENSER)), 0);
        registerBlock("charcoal_block", new Block(FabricBlockSettings.copyOf(Blocks.COAL_BLOCK)), 16000);

        for (CompressedBlocks compressedBlock : CompressedBlocks.values()) {
            for (int i = 0; i < compressedBlock.getCompression(); i++) {
                Block block = switch (compressedBlock){
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
                            MANGROVE_LOG -> new PillarBlock(FabricBlockSettings.copyOf(compressedBlock.getCopyBlock()).luminance((j) -> compressedBlock.getLuminance()));
                    case SAND, GRAVEL, RED_SAND -> new FallingBlock(FabricBlockSettings.copyOf(compressedBlock.getCopyBlock()).luminance((j) -> compressedBlock.getLuminance()));
                    case HAY_BLOCK -> new HayBlock(FabricBlockSettings.copyOf(compressedBlock.getCopyBlock()).luminance((j) -> compressedBlock.getLuminance()));
                    case HONEY_BLOCK -> new HoneyBlock(FabricBlockSettings.copyOf(compressedBlock.getCopyBlock()).luminance((j) -> compressedBlock.getLuminance()));
                    case SLIME_BLOCK -> new SlimeBlock(FabricBlockSettings.copyOf(compressedBlock.getCopyBlock()).luminance((j) -> compressedBlock.getLuminance()));
                    case MAGMA_BLOCK -> new MagmaBlock(FabricBlockSettings.copyOf(compressedBlock.getCopyBlock()).luminance((j) -> compressedBlock.getLuminance()));
                    case REDSTONE_BLOCK -> new RedstoneBlock(FabricBlockSettings.copyOf(compressedBlock.getCopyBlock()).luminance((j) -> compressedBlock.getLuminance()));
                    case REDSTONE_ORE, DEEPSLATE_REDSTONE_ORE -> new RedstoneOreBlock(FabricBlockSettings.copyOf(compressedBlock.getCopyBlock()).luminance((j) -> compressedBlock.getLuminance()));
                    case GLASS,
                        WHITE_STAINED_GLASS,
                        YELLOW_STAINED_GLASS,
                        BLACK_STAINED_GLASS,
                        RED_STAINED_GLASS,
                        PURPLE_STAINED_GLASS,
                        PINK_STAINED_GLASS,
                        ORANGE_STAINED_GLASS,
                        MAGENTA_STAINED_GLASS,
                        LIME_STAINED_GLASS,
                        LIGHT_GRAY_STAINED_GLASS,
                        LIGHT_BLUE_STAINED_GLASS,
                        GREEN_STAINED_GLASS,
                        GRAY_STAINED_GLASS,
                        CYAN_STAINED_GLASS,
                        BROWN_STAINED_GLASS,
                        BLUE_STAINED_GLASS
                            -> new GlassBlock(FabricBlockSettings.copyOf(compressedBlock.getCopyBlock()).luminance((j) -> compressedBlock.getLuminance()));
                    default -> new Block(FabricBlockSettings.copyOf(compressedBlock.getCopyBlock()).luminance((j) -> compressedBlock.getLuminance()));
                };
                registerBlock(compressedBlock.getName(i+1), block, (9 * (i+1)) * compressedBlock.getBurnTime(i));

            }

        }
    }



    public static void register(){
        registerBlocks();

    }
}
