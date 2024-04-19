
package net.mcreator.kaczka.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.kaczka.procedures.DeepIronBladeLivingEntityIsHitWithItemProcedure;
import net.mcreator.kaczka.init.KaczkaModTabs;

public class DeepIronBladeItem extends Item {
	public DeepIronBladeItem() {
		super(new Item.Properties().tab(KaczkaModTabs.TAB_ORESWIRAZ).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		DeepIronBladeLivingEntityIsHitWithItemProcedure.execute(entity);
		return retval;
	}
}
