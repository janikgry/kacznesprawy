
package net.mcreator.kaczka.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.kaczka.init.KaczkaModTabs;

public class JadeitegemItem extends Item {
	public JadeitegemItem() {
		super(new Item.Properties().tab(KaczkaModTabs.TAB_FARMAZONY).stacksTo(64).rarity(Rarity.COMMON));
	}
}
