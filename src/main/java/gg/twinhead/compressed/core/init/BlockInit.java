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
    public static final DeferredRegister<Block> FUELBLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Compressed.MOD_ID);


    //START OF BLACKSTONES
    public static final RegistryObject<Block> COBBLESTONE_I = BLOCKS.register("cobblestone_i", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(3, 10)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> COBBLESTONE_II = BLOCKS.register("cobblestone_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5, 25)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> COBBLESTONE_III = BLOCKS.register("cobblestone_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(7, 50)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> COBBLESTONE_VI = BLOCKS.register("cobblestone_iv", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(10, 1000)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));
    //End of Cobblestones

    //START OF STONES
    public static final RegistryObject<Block> STONE_I = BLOCKS.register("stone_i", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(3, 10)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> STONE_II = BLOCKS.register("stone_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5, 25)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> STONE_III = BLOCKS.register("stone_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(7, 50)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> STONE_VI = BLOCKS.register("stone_iv", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(8, 50)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));
    //End of stones

    //START OF Granites
    public static final RegistryObject<Block> GRANITE_I = BLOCKS.register("granite_i", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(3, 10)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> GRANITE_II = BLOCKS.register("granite_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5, 25)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> GRANITE_III = BLOCKS.register("granite_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(7, 50)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> GRANITE_VI = BLOCKS.register("granite_iv", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(8, 50)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));
    //End of Granite

    //START OF diorite
    public static final RegistryObject<Block> DIORITE_I = BLOCKS.register("diorite_i", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(3, 10)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> DIORITE_II = BLOCKS.register("diorite_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5, 25)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> DIORITE_III = BLOCKS.register("diorite_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(7, 50)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> DIORITE_VI = BLOCKS.register("diorite_iv", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(8, 50)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));
    //End of diorite

    //START OF Andesite
    public static final RegistryObject<Block> ANDESITE_I = BLOCKS.register("andesite_i", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(3, 10)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> ANDESITE_II = BLOCKS.register("andesite_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5, 25)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> ANDESITE_III = BLOCKS.register("andesite_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(7, 50)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> ANDESITE_VI = BLOCKS.register("andesite_iv", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(8, 50)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));
    //End of andesite

    //Start of Dirts
    public static final RegistryObject<Block> DIRT_I = BLOCKS.register("dirt_i", () ->
            new Block(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(1, 3)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.GROUND)));

    public static final RegistryObject<Block> DIRT_II = BLOCKS.register("dirt_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(2, 9)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.GROUND)));

    public static final RegistryObject<Block> DIRT_III = BLOCKS.register("dirt_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(3, 15)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.GROUND)));

    public static final RegistryObject<Block> DIRT_IV = BLOCKS.register("dirt_iv", () ->
            new Block(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(7, 35)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.GROUND)));
    //End of Dirts

    //Start of GRASS
    public static final RegistryObject<Block> GRASS_BLOCK_I = BLOCKS.register("grass_block_i", () ->
            new Block(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(1, 3)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.PLANT)));

    public static final RegistryObject<Block> GRASS_BLOCK_II = BLOCKS.register("grass_block_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(2, 9)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.PLANT)));

    public static final RegistryObject<Block> GRASS_BLOCK_III = BLOCKS.register("grass_block_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(3, 15)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.PLANT)));

    public static final RegistryObject<Block> GRASS_BLOCK_IV = BLOCKS.register("grass_block_iv", () ->
            new Block(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(7, 35)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.PLANT)));
    //End of GRASS

    //Start of PODZOL
    public static final RegistryObject<Block> PODZOL_I = BLOCKS.register("podzol_i", () ->
            new Block(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(1, 3)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.PLANT)));

    public static final RegistryObject<Block> PODZOL_II = BLOCKS.register("podzol_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(2, 9)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.PLANT)));

    public static final RegistryObject<Block> PODZOL_III = BLOCKS.register("podzol_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(3, 15)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.PLANT)));

    public static final RegistryObject<Block> PODZOL_IV = BLOCKS.register("podzol_iv", () ->
            new Block(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(7, 35)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.PLANT)));
    //End of PODZOL

    //Start of Gravels
    public static final RegistryObject<Block> GRAVEL_I = BLOCKS.register("gravel_i", () ->
            new FallingBlock(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(1, 3)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.GROUND)));

    public static final RegistryObject<Block> GRAVEL_II = BLOCKS.register("gravel_ii", () ->
            new FallingBlock(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(2, 9)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.GROUND)));

    public static final RegistryObject<Block> GRAVEL_III = BLOCKS.register("gravel_iii", () ->
            new FallingBlock(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(3, 15)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.GROUND)));

    public static final RegistryObject<Block> GRAVEL_IV = BLOCKS.register("gravel_iv", () ->
            new FallingBlock(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(7, 35)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.GROUND)));
    //End of Gravels

    //Start of Sands
    public static final RegistryObject<Block> SAND_I = BLOCKS.register("sand_i", () ->
            new FallingBlock(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(1, 3)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.SAND)));

    public static final RegistryObject<Block> SAND_II = BLOCKS.register("sand_ii", () ->
            new FallingBlock(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(2, 9)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.SAND)));

    public static final RegistryObject<Block> SAND_III = BLOCKS.register("sand_iii", () ->
            new FallingBlock(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(3, 15)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.SAND)));

    public static final RegistryObject<Block> SAND_IV = BLOCKS.register("sand_iv", () ->
            new FallingBlock(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(7, 35)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.SAND)));
    //End of Sands

    //START OF SANDSTONE
    public static final RegistryObject<Block> SANDSTONE_I = BLOCKS.register("sandstone_i", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(3, 12)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> SANDSTONE_II = BLOCKS.register("sandstone_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(4, 24)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> SANDSTONE_III = BLOCKS.register("sandstone_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5, 48)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> SANDSTONE_VI = BLOCKS.register("sandstone_iv", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(6, 96)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));
    //End of SANDSTONE

    //Start of Red Sands
    public static final RegistryObject<Block> RED_SAND_I = BLOCKS.register("red_sand_i", () ->
            new FallingBlock(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(1, 3)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.SAND)));

    public static final RegistryObject<Block> RED_SAND_II = BLOCKS.register("red_sand_ii", () ->
            new FallingBlock(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(2, 9)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.SAND)));

    public static final RegistryObject<Block> RED_SAND_III = BLOCKS.register("red_sand_iii", () ->
            new FallingBlock(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(3, 15)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.SAND)));

    public static final RegistryObject<Block> RED_SAND_IV = BLOCKS.register("red_sand_iv", () ->
            new FallingBlock(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(7, 35)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.SAND)));
    //End of Red Sand

    //START OF SANDSTONE
    public static final RegistryObject<Block> RED_SANDSTONE_I = BLOCKS.register("red_sandstone_i", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(3, 12)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> RED_SANDSTONE_II = BLOCKS.register("red_sandstone_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(4, 24)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> RED_SANDSTONE_III = BLOCKS.register("red_sandstone_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5, 48)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> RED_SANDSTONE_VI = BLOCKS.register("red_sandstone_iv", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(6, 96)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));
    //End of SANDSTONE

    //START OF Netherrack
    public static final RegistryObject<Block> NETHERRACK_I = BLOCKS.register("netherrack_i", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(1, 10)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .setRequiresTool()
                    .sound(SoundType.NETHERRACK)));

    public static final RegistryObject<Block> NETHERRACK_II = BLOCKS.register("netherrack_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5, 25)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .setRequiresTool()
                    .sound(SoundType.NETHERRACK)));

    public static final RegistryObject<Block> NETHERRACK_III = BLOCKS.register("netherrack_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(7, 50)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .setRequiresTool()
                    .sound(SoundType.NETHERRACK)));

    public static final RegistryObject<Block> NETHERRACK_VI = BLOCKS.register("netherrack_iv", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(8, 50)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .setRequiresTool()
                    .sound(SoundType.NETHERRACK)));
    //End of Netherrack

    //START OF BLACKSTONES
    public static final RegistryObject<Block> BLACKSTONE_I = BLOCKS.register("blackstone_i", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(3, 10)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> BLACKSTONE_II = BLOCKS.register("blackstone_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5, 25)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> BLACKSTONE_III = BLOCKS.register("blackstone_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(7, 50)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> BLACKSTONE_VI = BLOCKS.register("blackstone_iv", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(10, 1000)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));
    //End of BLACKSTONES

    //START OF BASALTS
    public static final RegistryObject<Block> BASALT_I = BLOCKS.register("basalt_i", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(3, 10)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.BASALT)));

    public static final RegistryObject<Block> BASALT_II = BLOCKS.register("basalt_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5, 25)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.BASALT)));

    public static final RegistryObject<Block> BASALT_III = BLOCKS.register("basalt_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(7, 50)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.BASALT)));

    public static final RegistryObject<Block> BASALT_VI = BLOCKS.register("basalt_iv", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(10, 1000)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.BASALT)));
    //End of BASALTS

    //Start of SOULSAND
    public static final RegistryObject<Block> SOUL_SAND_I = BLOCKS.register("soul_sand_i", () ->
            new Block(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(1, 3)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.SOUL_SAND)));

    public static final RegistryObject<Block> SOUL_SAND_II = BLOCKS.register("soul_sand_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(2, 9)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.SOUL_SAND)));

    public static final RegistryObject<Block> SOUL_SAND_III = BLOCKS.register("soul_sand_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(3, 15)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.SOUL_SAND)));

    public static final RegistryObject<Block> SOUL_SAND_IV = BLOCKS.register("soul_sand_iv", () ->
            new Block(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(7, 35)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.SOUL_SAND)));
    //End of SOULSAND

    //Start of SOULSOIL
    public static final RegistryObject<Block> SOUL_SOIL_I = BLOCKS.register("soul_soil_i", () ->
            new Block(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(1, 3)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.SOUL_SOIL)));

    public static final RegistryObject<Block> SOUL_SOIL_II = BLOCKS.register("soul_soil_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(2, 9)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.SOUL_SOIL)));

    public static final RegistryObject<Block> SOUL_SOIL_III = BLOCKS.register("soul_soil_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(3, 15)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.SOUL_SOIL)));

    public static final RegistryObject<Block> SOUL_SOIL_IV = BLOCKS.register("soul_soil_iv", () ->
            new Block(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(7, 35)
                    .harvestTool(ToolType.SHOVEL)
                    .sound(SoundType.SOUL_SOIL)));
    //End of SOULSOIL

    //START OF End Stone
    public static final RegistryObject<Block> END_STONE_I = BLOCKS.register("end_stone_i", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(4, 10)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .setRequiresTool()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> END_STONE_II = BLOCKS.register("end_stone_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5, 25)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .setRequiresTool()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> END_STONE_III = BLOCKS.register("end_stone_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(7, 50)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .setRequiresTool()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> END_STONE_VI = BLOCKS.register("end_stone_iv", () ->
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

    //START OF Diamond BLOCK
    public static final RegistryObject<Block> DIAMOND_BLOCK_I = BLOCKS.register("diamond_block_i", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(6, 10)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> DIAMOND_BLOCK_II = BLOCKS.register("diamond_block_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(7, 15)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> DIAMOND_BLOCK_III = BLOCKS.register("diamond_block_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(8, 20)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> DIAMOND_BLOCK_VI = BLOCKS.register("diamond_block_iv", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(9, 25)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.METAL)));
    //End of diamond BLOCK

    //START OF EMERALD BLOCK
    public static final RegistryObject<Block> EMERALD_BLOCK_I = BLOCKS.register("emerald_block_i", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(6, 10)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> EMERALD_BLOCK_II = BLOCKS.register("emerald_block_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(7, 15)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> EMERALD_BLOCK_III = BLOCKS.register("emerald_block_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(8, 20)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> EMERALD_BLOCK_VI = BLOCKS.register("emerald_block_iv", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(9, 25)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.METAL)));
    //End of EMERALD BLOCK

    //START OF GOLD BLOCK
    public static final RegistryObject<Block> GOLD_BLOCK_I = BLOCKS.register("gold_block_i", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(6, 10)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> GOLD_BLOCK_II = BLOCKS.register("gold_block_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(7, 15)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> GOLDBLOCK_III = BLOCKS.register("gold_block_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(8, 20)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> GOLD_BLOCK_VI = BLOCKS.register("gold_block_iv", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(9, 25)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.METAL)));
    //End of GOLD Block

    //START OF IRON BLOCK
    public static final RegistryObject<Block> IRON_BLOCK_I = BLOCKS.register("iron_block_i", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(6, 10)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> IRON_BLOCK_II = BLOCKS.register("iron_block_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(7, 15)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> IRON_BLOCK_III = BLOCKS.register("iron_block_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(8, 20)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> IRON_BLOCK_VI = BLOCKS.register("iron_block_iv", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(9, 25)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.METAL)));
    //End of Iron Block

    //START OF LAPIS BLOCK
    public static final RegistryObject<Block> LAPIS_BLOCK_I = BLOCKS.register("lapis_block_i", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(6, 10)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> LAPIS_BLOCK_II = BLOCKS.register("lapis_block_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(7, 15)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> LAPIS_BLOCK_III = BLOCKS.register("lapis_block_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(8, 20)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> LAPIS_BLOCK_VI = BLOCKS.register("lapis_block_iv", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(9, 25)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));
    //End of LAPIS BLOCK

    //START OF_NETHERITE BLOCK
    public static final RegistryObject<Block> NETHERITE_BLOCK_I = BLOCKS.register("netherite_block_i", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(6, 10)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.NETHERITE)));

    public static final RegistryObject<Block> NETHERITE_BLOCK_II = BLOCKS.register("netherite_block_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(7, 15)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.NETHERITE)));

    public static final RegistryObject<Block> NETHERITE_BLOCK_III = BLOCKS.register("netherite_block_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(8, 20)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.NETHERITE)));

    public static final RegistryObject<Block> NETHERITE_BLOCK_VI = BLOCKS.register("netherite_block_iv", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(9, 25)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.NETHERITE)));
    //End of NETHERITE Block

    //START OF REDSTONE BLOCK
    public static final RegistryObject<Block> REDSTONE_BLOCK_I = BLOCKS.register("redstone_block_i", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(6, 10)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> REDSTONE_BLOCK_II = BLOCKS.register("redstone_block_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(7, 15)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> REDSTONE_BLOCK_III = BLOCKS.register("redstone_block_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(8, 20)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> REDSTONE_BLOCK_VI = BLOCKS.register("redstone_block_iv", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(9, 25)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));
    //End of REDSTONE BLOCK


    //Start of SNOW BLOCK
    public static final RegistryObject<Block> SNOW_BLOCK_I = BLOCKS.register("snow_block_i", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(0.8f, 0.8f).harvestTool(ToolType.SHOVEL).harvestLevel(0).sound(SoundType.SNOW)));
    public static final RegistryObject<Block> SNOW_BLOCK_II = BLOCKS.register("snow_block_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 1.5f).harvestTool(ToolType.SHOVEL).harvestLevel(0).sound(SoundType.SNOW)));
    public static final RegistryObject<Block> SNOW_BLOCK_III = BLOCKS.register("snow_block_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3f, 3f).harvestTool(ToolType.SHOVEL).harvestLevel(0).sound(SoundType.SNOW)));
    public static final RegistryObject<Block> SNOW_BLOCK_IV = BLOCKS.register("snow_block_iv", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(4f, 4f).harvestTool(ToolType.SHOVEL).harvestLevel(0).sound(SoundType.SNOW)));

    //Start of CHARCOAL BLOCK
    public static final RegistryObject<Block> CHARCOAL_BLOCK = FUELBLOCKS.register("charcoal_block", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(5, 6).harvestTool(ToolType.PICKAXE).harvestLevel(0).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHARCOAL_BLOCK_I = FUELBLOCKS.register("charcoal_block_i", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(6, 12).harvestTool(ToolType.PICKAXE).harvestLevel(0).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHARCOAL_BLOCK_II = FUELBLOCKS.register("charcoal_block_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(7, 24).harvestTool(ToolType.PICKAXE).harvestLevel(0).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHARCOAL_BLOCK_III = FUELBLOCKS.register("charcoal_block_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(8, 48).harvestTool(ToolType.PICKAXE).harvestLevel(0).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHARCOAL_BLOCK_IV = FUELBLOCKS.register("charcoal_block_iv", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(9, 96).harvestTool(ToolType.PICKAXE).harvestLevel(0).sound(SoundType.STONE)));

    //START OF COAL BLOCK
    public static final RegistryObject<Block> COAL_BLOCK_I = FUELBLOCKS.register("coal_block_i", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(6, 10)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> COAL_BLOCK_II = FUELBLOCKS.register("coal_block_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(7, 15)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> COAL_BLOCK_III = FUELBLOCKS.register("coal_block_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(8, 20)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> COAL_BLOCK_IV = FUELBLOCKS.register("coal_block_iv", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(9, 25)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(0)
                    .sound(SoundType.STONE)));

    //Start of HAY BLOCK
    public static final RegistryObject<Block> HAY_BLOCK_I = BLOCKS.register("hay_block_i", () ->
            new Block(AbstractBlock.Properties.create(Material.PLANTS)
                    .hardnessAndResistance(1, 3)
                    .harvestTool(ToolType.HOE)
                    .sound(SoundType.PLANT)));

    public static final RegistryObject<Block> HAY_BLOCK_II = BLOCKS.register("hay_block_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.PLANTS)
                    .hardnessAndResistance(2, 9)
                    .harvestTool(ToolType.HOE)
                    .sound(SoundType.PLANT)));

    public static final RegistryObject<Block> HAY_BLOCK_III = BLOCKS.register("hay_block_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.PLANTS)
                    .hardnessAndResistance(3, 15)
                    .harvestTool(ToolType.HOE)
                    .sound(SoundType.PLANT)));

    public static final RegistryObject<Block> HAY_BLOCK_IV = BLOCKS.register("hay_block_iv", () ->
            new Block(AbstractBlock.Properties.create(Material.PLANTS)
                    .hardnessAndResistance(7, 35)
                    .harvestTool(ToolType.HOE)
                    .sound(SoundType.PLANT)));
    //End of HAY BLOCK

    //Start of PUMPKIN
    public static final RegistryObject<Block> PUMPKIN_I = BLOCKS.register("pumpkin_i", () ->
            new Block(AbstractBlock.Properties.create(Material.PLANTS)
                    .hardnessAndResistance(1, 3)
                    .harvestTool(ToolType.AXE)
                    .sound(SoundType.WOOD)));

    public static final RegistryObject<Block> PUMPKIN_II = BLOCKS.register("pumpkin_ii", () ->
            new Block(AbstractBlock.Properties.create(Material.PLANTS)
                    .hardnessAndResistance(2, 9)
                    .harvestTool(ToolType.AXE)
                    .sound(SoundType.WOOD)));

    public static final RegistryObject<Block> PUMPKIN_III = BLOCKS.register("pumpkin_iii", () ->
            new Block(AbstractBlock.Properties.create(Material.PLANTS)
                    .hardnessAndResistance(3, 15)
                    .harvestTool(ToolType.AXE)
                    .sound(SoundType.WOOD)));

    public static final RegistryObject<Block> PUMPKIN_IV = BLOCKS.register("pumpkin_iv", () ->
            new Block(AbstractBlock.Properties.create(Material.PLANTS)
                    .hardnessAndResistance(7, 35)
                    .harvestTool(ToolType.AXE)
                    .sound(SoundType.WOOD)));
    //End of PUMPKIN


        //Start of MELON
        public static final RegistryObject<Block> MELON_I = BLOCKS.register("melon_i", () ->
                new Block(AbstractBlock.Properties.create(Material.PLANTS)
                        .hardnessAndResistance(1, 3)
                        .harvestTool(ToolType.AXE)
                        .sound(SoundType.WOOD)));

        public static final RegistryObject<Block> MELON_II = BLOCKS.register("melon_ii", () ->
                new Block(AbstractBlock.Properties.create(Material.PLANTS)
                        .hardnessAndResistance(2, 9)
                        .harvestTool(ToolType.AXE)
                        .sound(SoundType.WOOD)));

        public static final RegistryObject<Block> MELON_III = BLOCKS.register("melon_iii", () ->
                new Block(AbstractBlock.Properties.create(Material.PLANTS)
                        .hardnessAndResistance(3, 15)
                        .harvestTool(ToolType.AXE)
                        .sound(SoundType.WOOD)));

        public static final RegistryObject<Block> MELON_IV = BLOCKS.register("melon_iv", () ->
                new Block(AbstractBlock.Properties.create(Material.PLANTS)
                        .hardnessAndResistance(7, 35)
                        .harvestTool(ToolType.AXE)
                        .sound(SoundType.WOOD)));
        //End of MELON

}
