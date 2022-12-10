package games.twinhead.compressed.block.entity;

import games.twinhead.compressed.Compressed;
import games.twinhead.compressed.registry.RegisterBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {

    public static BlockEntityType<CompactorBlockEntity> COMPACTOR;

    public static void registerBlockEntities() {
        COMPACTOR = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(Compressed.MOD_ID, "compactor"),
                FabricBlockEntityTypeBuilder.create(CompactorBlockEntity::new,
                        RegisterBlocks.compressedBlocks.get("compactor")).build(null));
    }
}
