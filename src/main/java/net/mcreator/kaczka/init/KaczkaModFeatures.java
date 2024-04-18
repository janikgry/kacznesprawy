
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kaczka.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.kaczka.world.features.plants.RubyflowerFeature;
import net.mcreator.kaczka.world.features.ores.ToretzanOreFeature;
import net.mcreator.kaczka.world.features.ores.RubyoreFeature;
import net.mcreator.kaczka.world.features.ores.NetherdiamondoreFeature;
import net.mcreator.kaczka.world.features.ores.JadeitegraveloreFeature;
import net.mcreator.kaczka.world.features.ores.GildedclayFeature;
import net.mcreator.kaczka.world.features.ores.ForavaraOreFeature;
import net.mcreator.kaczka.world.features.ores.DustyrubyoreFeature;
import net.mcreator.kaczka.world.features.DustytreeFeature;
import net.mcreator.kaczka.world.features.DustyruinednetherportalFeature;
import net.mcreator.kaczka.world.features.DustyhouseFeature;
import net.mcreator.kaczka.world.features.DustyaetherportalFeature;
import net.mcreator.kaczka.world.features.AetherportalruinedFeature;
import net.mcreator.kaczka.KaczkaMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class KaczkaModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, KaczkaMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> GILDEDCLAY = register("gildedclay", GildedclayFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, GildedclayFeature.GENERATE_BIOMES, GildedclayFeature::placedFeature));
	public static final RegistryObject<Feature<?>> NETHERDIAMONDORE = register("netherdiamondore", NetherdiamondoreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, NetherdiamondoreFeature.GENERATE_BIOMES,
					NetherdiamondoreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RUBYORE = register("rubyore", RubyoreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, RubyoreFeature.GENERATE_BIOMES, RubyoreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RUBYFLOWER = register("rubyflower", RubyflowerFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, RubyflowerFeature.GENERATE_BIOMES, RubyflowerFeature::placedFeature));
	public static final RegistryObject<Feature<?>> JADEITEGRAVELORE = register("jadeitegravelore", JadeitegraveloreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, JadeitegraveloreFeature.GENERATE_BIOMES,
					JadeitegraveloreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> TORETZAN_ORE = register("toretzan_ore", ToretzanOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, ToretzanOreFeature.GENERATE_BIOMES, ToretzanOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> FORAVARA_ORE = register("foravara_ore", ForavaraOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, ForavaraOreFeature.GENERATE_BIOMES, ForavaraOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DUSTYTREE = register("dustytree", DustytreeFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, DustytreeFeature.GENERATE_BIOMES, DustytreeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DUSTYHOUSE = register("dustyhouse", DustyhouseFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, DustyhouseFeature.GENERATE_BIOMES, DustyhouseFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DUSTYRUBYORE = register("dustyrubyore", DustyrubyoreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, DustyrubyoreFeature.GENERATE_BIOMES, DustyrubyoreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> AETHERPORTALRUINED = register("aetherportalruined", AetherportalruinedFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, AetherportalruinedFeature.GENERATE_BIOMES,
					AetherportalruinedFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DUSTYRUINEDNETHERPORTAL = register("dustyruinednetherportal",
			DustyruinednetherportalFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
					DustyruinednetherportalFeature.GENERATE_BIOMES, DustyruinednetherportalFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DUSTYAETHERPORTAL = register("dustyaetherportal", DustyaetherportalFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, DustyaetherportalFeature.GENERATE_BIOMES,
					DustyaetherportalFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
