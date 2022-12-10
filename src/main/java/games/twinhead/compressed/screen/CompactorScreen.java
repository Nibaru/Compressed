package games.twinhead.compressed.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import games.twinhead.compressed.Compressed;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class CompactorScreen extends HandledScreen<CompactorScreenHandler> {
    private static final Identifier TEXTURE =
            new Identifier(Compressed.MOD_ID, "textures/gui/container/compactor.png");

    public CompactorScreen(CompactorScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    protected void init() {
        super.init();
        titleX = (backgroundWidth - textRenderer.getWidth(title)) / 2;
    }

    @Override
    protected void drawBackground(MatrixStack matrices, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;
        drawTexture(matrices, x, y, 0, 0, backgroundWidth, backgroundHeight);

        renderProgressArrow(matrices, x, y);
        renderCraftingGrid(matrices, x, y);
    }

    private void renderProgressArrow(MatrixStack matrices, int x, int y) {
        if(handler.isCrafting()){
            drawTexture(matrices, x + 92, y + 34, 176, 14, handler.getScaledProgress(), 17);
        }

    }

    private void renderCraftingGrid(MatrixStack matrices, int x, int y){
        ItemStack stack = handler.getSlot(0).getStack();
        matrices.translate(0.0F, 0.0F, 32.0F);
        RenderSystem.applyModelViewMatrix();
//        this.setZOffset(200);
//        this.itemRenderer.zOffset = 200.0F;
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (stack.getCount() > count)
                    this.itemRenderer.renderGuiItemIcon(stack, x + 8 + (18 * j), y + 17 + (18 * i));
                count++;
            }
        }


        //this.itemRenderer.renderGuiItemOverlay(this.textRenderer, stack, x, y - 8, String.valueOf(1));
//        this.setZOffset(0);
//        this.itemRenderer.zOffset = 0.0F;
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        renderBackground(matrices);
        super.render(matrices, mouseX, mouseY, delta);

        drawMouseoverTooltip(matrices, mouseX, mouseY);
    }
}

