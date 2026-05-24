package bike.jenny.cat.managers;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import bike.jenny.cat.Cat;

public class ModItems {
    public static final FoodComponent MAXWELL_FOOD_COMPONENT = new FoodComponent.Builder()
            .alwaysEdible()
            .snack()
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 6 * 20, 1), 1.0f)
            .build();

    public static final Item MAXWELL = register(
     new Item(new FabricItemSettings().food(MAXWELL_FOOD_COMPONENT)),
     "maxwell"
    );

    public static Item register(Item item, String id) {
        // Create item identifier
        Identifier itemID = new Identifier(Cat.MOD_ID, id);

        // Register item
        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);

        // Return item
        return registeredItem;
    }

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((entries) -> entries.add(ModItems.MAXWELL));
    }
}
