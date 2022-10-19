package games.twinhead.compressed.datagen;

import games.twinhead.compressed.Compressed;
import games.twinhead.compressed.block.CompressedBlocks;
import games.twinhead.compressed.registry.RegisterBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class LangDatagen extends FabricLanguageProvider {

    protected LangDatagen(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(Compressed.COMPRESSED_GROUP, "Compressed Blocks");
        translationBuilder.add(RegisterBlocks.compressedBlocks.get("charcoal_block"), "Charcoal Block");
        translationBuilder.add("tooltip.compressed.fuel", "Burns for %d ticks");
        translationBuilder.add("tooltip.compressed.shift", "\u00a77Hold\u00a77 \u00a7eShift");
        translationBuilder.add("tooltip.compressed.stack", "%d %din this stack.");
        translationBuilder.add("tooltip.compressed.witherproof", "Witherproof");

        for (CompressedBlocks block: CompressedBlocks.values()) {
            for (int i = 0; i < block.getCompression(); i++) {
                translationBuilder.add(block.getBlock(i+1), formatName(block, i+1));
            }
        }
    }

    public String formatName(CompressedBlocks block, int compression){
        String[] parts = block.getName(compression).split("_");
        StringBuilder stringBuilder = new StringBuilder();
        for (String s: parts) {
            if(!s.contains("block"))
                stringBuilder.append(s.substring(0, 1).toUpperCase()).append(s.substring(1).toLowerCase()).append(" ");
        }
        stringBuilder.replace(stringBuilder.length() - Compressed.intToRoman(compression).length()- 1, stringBuilder.length() - 1, Compressed.intToRoman(compression).toUpperCase());
        return stringBuilder.substring(0, stringBuilder.length()-1);
    }
}
