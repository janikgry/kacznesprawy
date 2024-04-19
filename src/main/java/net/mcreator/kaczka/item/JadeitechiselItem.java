
package net.mcreator.kaczka.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.kaczka.init.KaczkaModTabs;
import net.mcreator.kaczka.init.KaczkaModItems;

import java.util.List;

public class JadeitechiselItem extends PickaxeItem {
	public JadeitechiselItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return 4.5f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(KaczkaModItems.JADEITEGEM.get()));
			}
		}, 1, -3f, new Item.Properties().tab(KaczkaModTabs.TAB_FARMAZONY));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("It helps you brake blocks you otherwise dont wanna break"));
	}
}
