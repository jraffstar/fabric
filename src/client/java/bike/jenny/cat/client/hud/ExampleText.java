package bike.jenny.cat.client.hud;

import net.minecraft.client.MinecraftClient;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;

public class ExampleText {
    public static void initialize() {
        HudRenderCallback.EVENT.register((drawContext, tickDelta) -> {

            MinecraftClient client = MinecraftClient.getInstance();

            drawContext.drawText(client.textRenderer, "Hello, World!", 2, 2, 0xFFFFFFFF, true);

        });
    }
}
