package gg.twinhead.compressed;

import gg.twinhead.compressed.core.init.BlockInit;
import gg.twinhead.compressed.core.init.ItemInit;
import net.minecraft.item.*;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Compressed.MOD_ID)
public class Compressed
{
    public static final String MOD_ID = "compressed";
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();
    public static final ItemGroup COMPRESSED_GROUP = new CompressedGroup();

    public Compressed() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        bus.addListener(this::setup);

        ItemInit.FUELITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        BlockInit.FUELBLOCKS.register(bus);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }

    public static class CompressedGroup extends ItemGroup {

        public CompressedGroup() {
            super("compressed");
        }

        @Override
        public ItemStack createIcon() {
            return Items.COBBLESTONE.getDefaultInstance();
        }
    }
}
