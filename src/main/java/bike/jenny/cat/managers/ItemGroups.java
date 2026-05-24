package bike.jenny.cat.managers;

import bike.jenny.cat.Cat;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ItemGroups {
    public static final ItemGroup MAXWELL_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            new Identifier(Cat.MOD_ID, "maxwell_group"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.MAXWELL))
                    .displayName(Text.translatable("itemGroup.cat.maxwell_group"))
                    .entries((displayContext, entries) -> {
                        // Items
                        entries.add(ModItems.MAXWELL);
                        entries.add(ModItems.MAXWELL_SWORD);

                        // Blocks
                        entries.add(ModBlocks.MAXWELL_BLOCK);
                    })
                            .build()
    );
    public static void initialize() {}
}
