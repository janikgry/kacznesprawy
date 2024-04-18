
package net.mcreator.kaczka.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.kaczka.procedures.PreludeBlueSwitchStateProcedure;
import net.mcreator.kaczka.init.KaczkaModTabs;

public class PreludeBlueItem extends Item {
	public PreludeBlueItem() {
		super(new Item.Properties().tab(KaczkaModTabs.TAB_KACZKA).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		PreludeBlueSwitchStateProcedure.execute(entity, sourceentity);
		return retval;
	}
}
