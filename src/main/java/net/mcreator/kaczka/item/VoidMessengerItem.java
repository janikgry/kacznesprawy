
package net.mcreator.kaczka.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.kaczka.procedures.VoidMessengerLivingEntityIsHitWithItemProcedure;
import net.mcreator.kaczka.init.KaczkaModTabs;

import java.util.List;

public class VoidMessengerItem extends Item {
	public VoidMessengerItem() {
		super(new Item.Properties().tab(KaczkaModTabs.TAB_ORESWIRAZ).stacksTo(16).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("One-time use:"));
		list.add(new TextComponent("deal 5 VOID damage to enemy on hit"));
		list.add(new TextComponent("give one POWERTOKEN to user."));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		VoidMessengerLivingEntityIsHitWithItemProcedure.execute(entity);
		return retval;
	}
}
