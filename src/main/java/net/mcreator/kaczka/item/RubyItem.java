
package net.mcreator.kaczka.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.kaczka.init.KaczkaModTabs;

public class RubyItem extends Item {
	public RubyItem() {
		super(new Item.Properties().tab(KaczkaModTabs.TAB_KACZKA).stacksTo(64).rarity(Rarity.RARE));
	}
}
