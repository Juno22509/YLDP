
package net.mcreator.yourlordsdampfpunk.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

import net.mcreator.yourlordsdampfpunk.init.YourLordsDampfpunkModFluids;

public class SoulBloodItem extends BucketItem {
	public SoulBloodItem() {
		super(YourLordsDampfpunkModFluids.SOUL_BLOOD, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(CreativeModeTab.TAB_MISC));
	}
}
