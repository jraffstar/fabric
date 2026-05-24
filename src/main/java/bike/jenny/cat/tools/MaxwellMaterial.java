package bike.jenny.cat.tools;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class MaxwellMaterial  implements ToolMaterial {
    @Override
    public int getDurability() {
        return 500;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 20;
    }

    @Override
    public float getAttackDamage() {
        return 1337;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 0;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }


    public static final MaxwellMaterial INSTANCE = new MaxwellMaterial();
}
