
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kaczka.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.client.Minecraft;

import net.mcreator.kaczka.client.particle.SapphireparticleParticle;
import net.mcreator.kaczka.client.particle.RubycaveparticleParticle;
import net.mcreator.kaczka.client.particle.JadeiteparticleParticle;
import net.mcreator.kaczka.client.particle.DustparticleParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class KaczkaModParticles {
	@SubscribeEvent
	public static void registerParticles(ParticleFactoryRegisterEvent event) {
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) KaczkaModParticleTypes.RUBYCAVEPARTICLE.get(),
				RubycaveparticleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) KaczkaModParticleTypes.JADEITEPARTICLE.get(),
				JadeiteparticleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) KaczkaModParticleTypes.DUSTPARTICLE.get(),
				DustparticleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) KaczkaModParticleTypes.SAPPHIREPARTICLE.get(),
				SapphireparticleParticle::provider);
	}
}
