package bike.jenny.cat.managers;

import bike.jenny.cat.Cat;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModBlocks {
    public static final Block MAXWELL_BLOCK = register(
            new Block(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.GRASS)), "maxwell_block", true
            );

    public static Block register(Block block, String name, boolean shouldRegisterItem) {
        // Register block + associated item
        Identifier id = new Identifier(Cat.MOD_ID, name);

        // For if you don't want to register the item and just register the block
        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }

        return Registry.register(Registries.BLOCK, id, block);
    }
    public static void initialize() {}
}
