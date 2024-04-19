
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kaczka.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class KaczkaModTabs {
	public static CreativeModeTab TAB_KACZKA;
	public static CreativeModeTab TAB_FARMAZONY;
	public static CreativeModeTab TAB_CHEMIAKRAFT;
	public static CreativeModeTab TAB_ORESWIRAZ;
	public static CreativeModeTab TAB_DUSTY;
	public static CreativeModeTab TAB_STRUCTURES;

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
		TAB_FARMAZONY = new CreativeModeTab("tabfarmazony") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(KaczkaModItems.FIREWORKS.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_CHEMIAKRAFT = new CreativeModeTab("tabchemiakraft") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.EXPERIENCE_BOTTLE);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_ORESWIRAZ = new CreativeModeTab("taboreswiraz") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(KaczkaModItems.TORETZAN.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_DUSTY = new CreativeModeTab("tabdusty") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(KaczkaModBlocks.DUSTYGRASS.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_STRUCTURES = new CreativeModeTab("tabstructures") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.BIRCH_LOG);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
