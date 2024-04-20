
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kaczka.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.kaczka.fluid.NitrogenFluid;
import net.mcreator.kaczka.KaczkaMod;

public class KaczkaModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, KaczkaMod.MODID);
	public static final RegistryObject<Fluid> NITROGEN = REGISTRY.register("nitrogen", () -> new NitrogenFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_NITROGEN = REGISTRY.register("flowing_nitrogen", () -> new NitrogenFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(NITROGEN.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_NITROGEN.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}
