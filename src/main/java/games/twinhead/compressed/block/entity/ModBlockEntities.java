package games.twinhead.compressed.block.entity;

import games.twinhead.compressed.Compressed;
import games.twinhead.compressed.registry.RegisterBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {

    private static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Compressed.MOD_ID);

    public static RegistryObject<BlockEntityType<CompactorBlockEntity>> COMPACTOR =
            BLOCK_ENTITIES.register("compactor", () ->  BlockEntityType.Builder.create(CompactorBlockEntity::new, RegisterBlocks.COMPACTOR.get()).build(null));


    public static void registerBlockEntities() {
        BLOCK_ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
