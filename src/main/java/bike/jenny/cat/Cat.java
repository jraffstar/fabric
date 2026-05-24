package bike.jenny.cat;

import bike.jenny.cat.managers.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Cat implements ModInitializer {
    public static final String MOD_ID = "cat";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        LOGGER.info("Hello, World!");
        ModItems.initialize();
    }
}
