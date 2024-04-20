
package net.mcreator.kaczka.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.kaczka.init.KaczkaModTabs;
import net.mcreator.kaczka.init.KaczkaModFluids;

public class NitrogenItem extends BucketItem {
	public NitrogenItem() {
		super(KaczkaModFluids.NITROGEN,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(KaczkaModTabs.TAB_CHEMIAKRAFT));
	}
}
