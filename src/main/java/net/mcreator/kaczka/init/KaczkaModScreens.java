
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kaczka.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.kaczka.client.gui.DustycraftingScreen;
import net.mcreator.kaczka.client.gui.DepthExtractorInterfaceScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class KaczkaModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(KaczkaModMenus.DEPTH_EXTRACTOR_INTERFACE, DepthExtractorInterfaceScreen::new);
			MenuScreens.register(KaczkaModMenus.DUSTYCRAFTING, DustycraftingScreen::new);
		});
	}
}
