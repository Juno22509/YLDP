
package net.mcreator.yourlordsdampfpunk.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.yourlordsdampfpunk.init.YourLordsDampfpunkModItems;

public class SteelPickaxeItem extends PickaxeItem {
	public SteelPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 400;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(YourLordsDampfpunkModItems.STEEL_INGOT.get()));
			}
		}, 1, -2.7999999999999998f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
