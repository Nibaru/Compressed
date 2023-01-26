package games.twinhead.compressed.registry;

import games.twinhead.compressed.Compressed;
import games.twinhead.compressed.block.CompressedBlocks;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;



public class CreativeTab {

    public static void registerTab(CreativeModeTabEvent.Register event) {
        event.registerCreativeModeTab(new Identifier(Compressed.MOD_ID, "creative_tab"), builder ->
                // Set name of tab to display
                builder.displayName(Text.translatable("itemGroup." + Compressed.MOD_ID + ".creative_tab"))
                        // Set icon of creative tab
                        .icon(() -> new ItemStack(CompressedBlocks.COBBLESTONE.getBlock(4).get()))
                        // Add default items to tab
                        .entries((enabledFlags, populator, hasPermissions) -> RegisterBlocks.ITEMS.getEntries().stream().map(RegistryObject::get).forEach(populator::add)));
    }
}
