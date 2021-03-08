package gg.twinhead.compressed.core.init;

import gg.twinhead.compressed.Compressed;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Compressed.MOD_ID);



    //START OF COBBLESTONES
    public static final RegistryObject<Block> COMPRESSED_COBBLESTONE_I = BLOCKS.register("compressed_cobblestone_i", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(3, 10)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> COMPRESSED_COBBLESTONE_II = BLOCKS.register("compressed_cobblestone_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5, 25)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> COMPRESSED_COBBLESTONE_III = BLOCKS.register("compressed_cobblestone_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(7, 50)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> COMPRESSED_COBBLESTONE_VI = BLOCKS.register("compressed_cobblestone_iv", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(10, 1000)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));
    //End of Cobblestones

    //START OF STONES
    public static final RegistryObject<Block> COMPRESSED_STONE_I = BLOCKS.register("compressed_stone_i", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(3, 10)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> COMPRESSED_STONE_II = BLOCKS.register("compressed_stone_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5, 25)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> COMPRESSED_STONE_III = BLOCKS.register("compressed_stone_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(7, 50)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> COMPRESSED_STONE_VI = BLOCKS.register("compressed_stone_iv", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(8, 50)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));
    //End of stones

    //START OF Granites
    public static final RegistryObject<Block> COMPRESSED_GRANITE_I = BLOCKS.register("compressed_granite_i", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(3, 10)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> COMPRESSED_GRANITE_II = BLOCKS.register("compressed_granite_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5, 25)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> COMPRESSED_GRANITE_III = BLOCKS.register("compressed_granite_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(7, 50)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> COMPRESSED_GRANITE_VI = BLOCKS.register("compressed_granite_iv", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(8, 50)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));
    //End of Granite

    //START OF diorite
    public static final RegistryObject<Block> COMPRESSED_DIORITE_I = BLOCKS.register("compressed_diorite_i", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(3, 10)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> COMPRESSED_DIORITE_II = BLOCKS.register("compressed_diorite_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5, 25)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> COMPRESSED_DIORITE_III = BLOCKS.register("compressed_diorite_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(7, 50)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> COMPRESSED_DIORITE_VI = BLOCKS.register("compressed_diorite_iv", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(8, 50)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));
    //End of diorite

    //START OF Andesite
    public static final RegistryObject<Block> COMPRESSED_ANDESITE_I = BLOCKS.register("compressed_andesite_i", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(3, 10)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> COMPRESSED_ANDESITE_II = BLOCKS.register("compressed_andesite_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5, 25)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> COMPRESSED_ANDESITE_III = BLOCKS.register("compressed_andesite_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(7, 50)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> COMPRESSED_ANDESITE_VI = BLOCKS.register("compressed_andesite_iv", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(8, 50)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));
    //End of andesite

    //Start of Dirts
    public static final RegistryObject<Block> COMPRESSED_DIRT_I = BLOCKS.register("compressed_dirt_i", () ->
            new Block(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(1, 3)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.GROUND)));

    public static final RegistryObject<Block> COMPRESSED_DIRT_II = BLOCKS.register("compressed_dirt_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(2, 9)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.GROUND)));

    public static final RegistryObject<Block> COMPRESSED_DIRT_III = BLOCKS.register("compressed_dirt_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(3, 15)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.GROUND)));

    public static final RegistryObject<Block> COMPRESSED_DIRT_IV = BLOCKS.register("compressed_dirt_iv", () ->
            new Block(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(7, 35)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.GROUND)));
    //End of Dirts

    //Start of Gravels
    public static final RegistryObject<Block> COMPRESSED_GRAVEL_I = BLOCKS.register("compressed_gravel_i", () ->
            new FallingBlock(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(1, 3)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.GROUND)));

    public static final RegistryObject<Block> COMPRESSED_GRAVEL_II = BLOCKS.register("compressed_gravel_ii", () ->
            new FallingBlock(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(2, 9)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.GROUND)));

    public static final RegistryObject<Block> COMPRESSED_GRAVEL_III = BLOCKS.register("compressed_gravel_iii", () ->
            new FallingBlock(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(3, 15)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.GROUND)));

    public static final RegistryObject<Block> COMPRESSED_GRAVEL_IV = BLOCKS.register("compressed_gravel_iv", () ->
            new FallingBlock(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(7, 35)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.GROUND)));
    //End of Gravels

    //Start of Sands
    public static final RegistryObject<Block> COMPRESSED_SAND_I = BLOCKS.register("compressed_sand_i", () ->
            new FallingBlock(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(1, 3)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.SAND)));

    public static final RegistryObject<Block> COMPRESSED_SAND_II = BLOCKS.register("compressed_sand_ii", () ->
            new FallingBlock(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(2, 9)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.SAND)));

    public static final RegistryObject<Block> COMPRESSED_SAND_III = BLOCKS.register("compressed_sand_iii", () ->
            new FallingBlock(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(3, 15)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.SAND)));

    public static final RegistryObject<Block> COMPRESSED_SAND_IV = BLOCKS.register("compressed_sand_iv", () ->
            new FallingBlock(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(7, 35)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.SAND)));
    //End of Sands

    //Start of Red Sands
    public static final RegistryObject<Block> COMPRESSED_RED_SAND_I = BLOCKS.register("compressed_red_sand_i", () ->
            new FallingBlock(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(1, 3)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.SAND)));

    public static final RegistryObject<Block> COMPRESSED_RED_SAND_II = BLOCKS.register("compressed_red_sand_ii", () ->
            new FallingBlock(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(2, 9)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.SAND)));

    public static final RegistryObject<Block> COMPRESSED_RED_SAND_III = BLOCKS.register("compressed_red_sand_iii", () ->
            new FallingBlock(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(3, 15)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.SAND)));

    public static final RegistryObject<Block> COMPRESSED_RED_SAND_IV = BLOCKS.register("compressed_red_sand_iv", () ->
            new FallingBlock(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(7, 35)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.SAND)));
    //End of Red Sand



    //START OF Netherrack
    public static final RegistryObject<Block> COMPRESSED_NETHERRACK_I = BLOCKS.register("compressed_netherrack_i", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(1, 10)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .setRequiresTool()
                    .sound(SoundType.NETHERRACK)));

    public static final RegistryObject<Block> COMPRESSED_NETHERRACK_II = BLOCKS.register("compressed_netherrack_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5, 25)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .setRequiresTool()
                    .sound(SoundType.NETHERRACK)));

    public static final RegistryObject<Block> COMPRESSED_NETHERRACK_III = BLOCKS.register("compressed_netherrack_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(7, 50)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .setRequiresTool()
                    .sound(SoundType.NETHERRACK)));

    public static final RegistryObject<Block> COMPRESSED_NETHERRACK_VI = BLOCKS.register("compressed_netherrack_iv", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(8, 50)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .setRequiresTool()
                    .sound(SoundType.NETHERRACK)));
    //End of Netherrack

    //Start of Dirts
    public static final RegistryObject<Block> COMPRESSED_SOUL_SAND_I = BLOCKS.register("compressed_soul_sand_i", () ->
            new Block(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(1, 3)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.SOUL_SAND)));

    public static final RegistryObject<Block> COMPRESSED_SOUL_SAND_II = BLOCKS.register("compressed_soul_sand_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(2, 9)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.SOUL_SAND)));

    public static final RegistryObject<Block> COMPRESSED_SOUL_SAND_III = BLOCKS.register("compressed_soul_sand_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(3, 15)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.SOUL_SAND)));

    public static final RegistryObject<Block> COMPRESSED_SOUL_SAND_IV = BLOCKS.register("compressed_soul_sand_iv", () ->
            new Block(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(7, 35)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.SOUL_SAND)));
    //End of Dirts

    //START OF End Stone
    public static final RegistryObject<Block> COMPRESSED_END_STONE_I = BLOCKS.register("compressed_end_stone_i", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(4, 10)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .setRequiresTool()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> COMPRESSED_END_STONE_II = BLOCKS.register("compressed_end_stone_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5, 25)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .setRequiresTool()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> COMPRESSED_END_STONE_III = BLOCKS.register("compressed_end_stone_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(7, 50)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .setRequiresTool()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> COMPRESSED_END_STONE_VI = BLOCKS.register("compressed_end_stone_iv", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(10, 50)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .setRequiresTool()
                    .sound(SoundType.STONE)));
    //End of End stone

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // METAL BLOCKS
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //START OF COAL BLOCK
    public static final RegistryObject<Block> COMPRESSED_COAL_BLOCK_I = BLOCKS.register("compressed_coal_block_i", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(6, 10)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> COMPRESSED_COAL_BLOCK_II = BLOCKS.register("compressed_coal_block_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(7, 15)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> COMPRESSED_COAL_BLOCK_III = BLOCKS.register("compressed_coal_block_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(8, 20)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> COMPRESSED_COAL_BLOCK_VI = BLOCKS.register("compressed_coal_block_iv", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(9, 25)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));
    //End of COAL BLOCK

    //START OF Diamond BLOCK
    public static final RegistryObject<Block> COMPRESSED_DIAMOND_BLOCK_I = BLOCKS.register("compressed_diamond_block_i", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(6, 10)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> COMPRESSED_DIAMOND_BLOCK_II = BLOCKS.register("compressed_diamond_block_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(7, 15)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> COMPRESSED_DIAMOND_BLOCK_III = BLOCKS.register("compressed_diamond_block_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(8, 20)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> COMPRESSED_DIAMOND_BLOCK_VI = BLOCKS.register("compressed_diamond_block_iv", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(9, 25)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.METAL)));
    //End of diamond BLOCK

    //START OF EMERALD BLOCK
    public static final RegistryObject<Block> COMPRESSED_EMERALD_BLOCK_I = BLOCKS.register("compressed_emerald_block_i", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(6, 10)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> COMPRESSED_EMERALD_BLOCK_II = BLOCKS.register("compressed_emerald_block_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(7, 15)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> COMPRESSED_EMERALD_BLOCK_III = BLOCKS.register("compressed_emerald_block_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(8, 20)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> COMPRESSED_EMERALD_BLOCK_VI = BLOCKS.register("compressed_emerald_block_iv", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(9, 25)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.METAL)));
    //End of EMERALD BLOCK

    //START OF GOLD BLOCK
    public static final RegistryObject<Block> COMPRESSED_GOLD_BLOCK_I = BLOCKS.register("compressed_gold_block_i", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(6, 10)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> COMPRESSED_GOLD_BLOCK_II = BLOCKS.register("compressed_gold_block_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(7, 15)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> COMPRESSED_GOLDBLOCK_III = BLOCKS.register("compressed_gold_block_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(8, 20)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> COMPRESSED_GOLD_BLOCK_VI = BLOCKS.register("compressed_gold_block_iv", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(9, 25)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.METAL)));
    //End of GOLD Block

    //START OF IRON BLOCK
    public static final RegistryObject<Block> COMPRESSED_IRON_BLOCK_I = BLOCKS.register("compressed_iron_block_i", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(6, 10)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> COMPRESSED_IRON_BLOCK_II = BLOCKS.register("compressed_iron_block_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(7, 15)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> COMPRESSED_IRON_BLOCK_III = BLOCKS.register("compressed_iron_block_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(8, 20)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> COMPRESSED_IRON_BLOCK_VI = BLOCKS.register("compressed_iron_block_iv", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(9, 25)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.METAL)));
    //End of Iron Block

    //START OF LAPIS BLOCK
    public static final RegistryObject<Block> COMPRESSED_LAPIS_BLOCK_I = BLOCKS.register("compressed_lapis_block_i", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(6, 10)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> COMPRESSED_LAPIS_BLOCK_II = BLOCKS.register("compressed_lapis_block_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(7, 15)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> COMPRESSED_LAPIS_BLOCK_III = BLOCKS.register("compressed_lapis_block_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(8, 20)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> COMPRESSED_LAPIS_BLOCK_VI = BLOCKS.register("compressed_lapis_block_iv", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(9, 25)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));
    //End of LAPIS BLOCK

    //START OF_NETHERITE BLOCK
    public static final RegistryObject<Block> COMPRESSED_NETHERITE_BLOCK_I = BLOCKS.register("compressed_netherite_block_i", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(6, 10)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.NETHERITE)));

    public static final RegistryObject<Block> COMPRESSED_NETHERITE_BLOCK_II = BLOCKS.register("compressed_netherite_block_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(7, 15)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.NETHERITE)));

    public static final RegistryObject<Block> COMPRESSED_NETHERITE_BLOCK_III = BLOCKS.register("compressed_netherite_block_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(8, 20)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.NETHERITE)));

    public static final RegistryObject<Block> COMPRESSED_NETHERITE_BLOCK_VI = BLOCKS.register("compressed_netherite_block_iv", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(9, 25)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.NETHERITE)));
    //End of NETHERITE Block

    //START OF REDSTONE BLOCK
    public static final RegistryObject<Block> COMPRESSED_REDSTONE_BLOCK_I = BLOCKS.register("compressed_redstone_block_i", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(6, 10)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> COMPRESSED_REDSTONE_BLOCK_II = BLOCKS.register("compressed_redstone_block_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(7, 15)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> COMPRESSED_REDSTONE_BLOCK_III = BLOCKS.register("compressed_redstone_block_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(8, 20)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> COMPRESSED_REDSTONE_BLOCK_VI = BLOCKS.register("compressed_redstone_block_iv", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(9, 25)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));
    //End of REDSTONE BLOCK
}
