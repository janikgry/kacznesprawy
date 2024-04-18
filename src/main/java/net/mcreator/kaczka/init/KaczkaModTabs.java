
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kaczka.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class KaczkaModTabs {
	public static CreativeModeTab TAB_KACZKA;

	public static void load() {
		TAB_KACZKA = new CreativeModeTab("tabkaczka") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(KaczkaModBlocks.GILDEDCLAY.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
