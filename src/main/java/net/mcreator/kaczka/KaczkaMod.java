/*
 *    MCreator note:
 *
 *    If you lock base mod element files, you can edit this file and it won't get overwritten.
 *    If you change your modid or package, you need to apply these changes to this file MANUALLY.
 *
 *    Settings in @Mod annotation WON'T be changed in case of the base mod element
 *    files lock too, so you need to set them manually here in such case.
 *
 *    If you do not lock base mod element files in Workspace settings, this file
 *    will be REGENERATED on each build.
 *
 */
package net.mcreator.kaczka;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;

import net.mcreator.kaczka.init.KaczkaModTabs;
import net.mcreator.kaczka.init.KaczkaModParticleTypes;
import net.mcreator.kaczka.init.KaczkaModItems;
import net.mcreator.kaczka.init.KaczkaModFluids;
import net.mcreator.kaczka.init.KaczkaModFeatures;
import net.mcreator.kaczka.init.KaczkaModEntities;
import net.mcreator.kaczka.init.KaczkaModBlocks;
import net.mcreator.kaczka.init.KaczkaModBiomes;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;

@Mod("kaczka")
public class KaczkaMod {
	public static final Logger LOGGER = LogManager.getLogger(KaczkaMod.class);
	public static final String MODID = "kaczka";
	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION,
			PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	private static int messageID = 0;

	public KaczkaMod() {
		KaczkaModTabs.load();
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		KaczkaModBlocks.REGISTRY.register(bus);
		KaczkaModItems.REGISTRY.register(bus);
		KaczkaModEntities.REGISTRY.register(bus);

		KaczkaModFeatures.REGISTRY.register(bus);
		KaczkaModFluids.REGISTRY.register(bus);

		KaczkaModBiomes.REGISTRY.register(bus);
		KaczkaModParticleTypes.REGISTRY.register(bus);
	}

	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder,
			BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}
}
