
package net.mcreator.yourlordsdampfpunk.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.AxeItem;

import net.mcreator.yourlordsdampfpunk.init.YourLordsDampfpunkModItems;

public class SteelAxeItem extends AxeItem {
	public SteelAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 400;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 7f;
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
		}, 1, -3.1f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
