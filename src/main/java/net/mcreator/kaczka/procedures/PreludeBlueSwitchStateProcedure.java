package net.mcreator.kaczka.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.kaczka.init.KaczkaModItems;

public class PreludeBlueSwitchStateProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (!entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:prelude_blue_mob")))) {
			if (sourceentity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(KaczkaModItems.PRELUDE.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			entity.hurt(DamageSource.GENERIC, 20);
			if (sourceentity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(KaczkaModItems.PRELUDE_BLUE.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
						_player.inventoryMenu.getCraftSlots());
			}
		}
	}
}
