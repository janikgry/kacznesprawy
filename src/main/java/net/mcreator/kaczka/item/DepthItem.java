
package net.mcreator.kaczka.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.kaczka.init.KaczkaModTabs;

public class DepthItem extends Item {
	public DepthItem() {
		super(new Item.Properties().tab(KaczkaModTabs.TAB_ORESWIRAZ).stacksTo(64).rarity(Rarity.COMMON));
	}
}
