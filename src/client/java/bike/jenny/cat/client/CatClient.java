package bike.jenny.cat.client;

import bike.jenny.cat.client.hud.ExampleText;
import net.fabricmc.api.ClientModInitializer;

public class CatClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ExampleText.initialize();

    }
}
