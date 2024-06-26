
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kaczka.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.server.ServerAboutToStartEvent;

import net.minecraft.world.level.levelgen.placement.CaveSurface;
import net.minecraft.world.level.levelgen.WorldGenSettings;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.MultiNoiseBiomeSource;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.server.MinecraftServer;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import net.mcreator.kaczka.world.biome.Wastelands2Biome;
import net.mcreator.kaczka.world.biome.SapphirecaveBiome;
import net.mcreator.kaczka.world.biome.RubycaveBiome;
import net.mcreator.kaczka.world.biome.JadeitecaveBiome;
import net.mcreator.kaczka.world.biome.EmeraldcaveBiome;
import net.mcreator.kaczka.world.biome.DustywoodsBiome;
import net.mcreator.kaczka.world.biome.DustywastelandsBiome;
import net.mcreator.kaczka.world.biome.DustyplainsBiome;
import net.mcreator.kaczka.KaczkaMod;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;

import com.mojang.datafixers.util.Pair;

@Mod.EventBusSubscriber
public class KaczkaModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, KaczkaMod.MODID);
	public static final RegistryObject<Biome> RUBYCAVE = REGISTRY.register("rubycave", () -> RubycaveBiome.createBiome());
	public static final RegistryObject<Biome> DUSTYPLAINS = REGISTRY.register("dustyplains", () -> DustyplainsBiome.createBiome());
	public static final RegistryObject<Biome> DUSTYWOODS = REGISTRY.register("dustywoods", () -> DustywoodsBiome.createBiome());
	public static final RegistryObject<Biome> DUSTYWASTELANDS = REGISTRY.register("dustywastelands", () -> DustywastelandsBiome.createBiome());
	public static final RegistryObject<Biome> WASTELANDS_2 = REGISTRY.register("wastelands_2", () -> Wastelands2Biome.createBiome());
	public static final RegistryObject<Biome> SAPPHIRECAVE = REGISTRY.register("sapphirecave", () -> SapphirecaveBiome.createBiome());
	public static final RegistryObject<Biome> EMERALDCAVE = REGISTRY.register("emeraldcave", () -> EmeraldcaveBiome.createBiome());
	public static final RegistryObject<Biome> JADEITECAVE = REGISTRY.register("jadeitecave", () -> JadeitecaveBiome.createBiome());

	@SubscribeEvent
	public static void onServerAboutToStart(ServerAboutToStartEvent event) {
		MinecraftServer server = event.getServer();
		Registry<DimensionType> dimensionTypeRegistry = server.registryAccess().registryOrThrow(Registry.DIMENSION_TYPE_REGISTRY);
		Registry<Biome> biomeRegistry = server.registryAccess().registryOrThrow(Registry.BIOME_REGISTRY);
		WorldGenSettings worldGenSettings = server.getWorldData().worldGenSettings();
		for (Map.Entry<ResourceKey<LevelStem>, LevelStem> entry : worldGenSettings.dimensions().entrySet()) {
			DimensionType dimensionType = entry.getValue().typeHolder().value();
			if (dimensionType == dimensionTypeRegistry.getOrThrow(DimensionType.OVERWORLD_LOCATION)) {
				ChunkGenerator chunkGenerator = entry.getValue().generator();
				// Inject biomes to biome source
				if (chunkGenerator.getBiomeSource() instanceof MultiNoiseBiomeSource noiseSource) {
					List<Pair<Climate.ParameterPoint, Holder<Biome>>> parameters = new ArrayList<>(noiseSource.parameters.values());
					parameters.add(new Pair<>(RubycaveBiome.PARAMETER_POINT_UNDERGROUND,
							biomeRegistry.getOrCreateHolder(ResourceKey.create(Registry.BIOME_REGISTRY, RUBYCAVE.getId()))));
					parameters.add(new Pair<>(SapphirecaveBiome.PARAMETER_POINT_UNDERGROUND,
							biomeRegistry.getOrCreateHolder(ResourceKey.create(Registry.BIOME_REGISTRY, SAPPHIRECAVE.getId()))));
					parameters.add(new Pair<>(EmeraldcaveBiome.PARAMETER_POINT_UNDERGROUND,
							biomeRegistry.getOrCreateHolder(ResourceKey.create(Registry.BIOME_REGISTRY, EMERALDCAVE.getId()))));
					parameters.add(new Pair<>(JadeitecaveBiome.PARAMETER_POINT_UNDERGROUND,
							biomeRegistry.getOrCreateHolder(ResourceKey.create(Registry.BIOME_REGISTRY, JADEITECAVE.getId()))));

					MultiNoiseBiomeSource moddedNoiseSource = new MultiNoiseBiomeSource(new Climate.ParameterList<>(parameters), noiseSource.preset);
					chunkGenerator.biomeSource = moddedNoiseSource;
					chunkGenerator.runtimeBiomeSource = moddedNoiseSource;
				}
				// Inject surface rules
				if (chunkGenerator instanceof NoiseBasedChunkGenerator noiseGenerator) {
					NoiseGeneratorSettings noiseGeneratorSettings = noiseGenerator.settings.value();
					SurfaceRules.RuleSource currentRuleSource = noiseGeneratorSettings.surfaceRule();
					if (currentRuleSource instanceof SurfaceRules.SequenceRuleSource sequenceRuleSource) {
						List<SurfaceRules.RuleSource> surfaceRules = new ArrayList<>(sequenceRuleSource.sequence());
						surfaceRules.add(1, anySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, RUBYCAVE.getId()),
								Blocks.STONE.defaultBlockState(), Blocks.STONE.defaultBlockState(), Blocks.STONE.defaultBlockState()));
						surfaceRules.add(1, anySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, SAPPHIRECAVE.getId()),
								Blocks.STONE.defaultBlockState(), Blocks.STONE.defaultBlockState(), Blocks.STONE.defaultBlockState()));
						surfaceRules.add(1, anySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, EMERALDCAVE.getId()),
								Blocks.STONE.defaultBlockState(), Blocks.STONE.defaultBlockState(), Blocks.STONE.defaultBlockState()));
						surfaceRules.add(1, anySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, JADEITECAVE.getId()),
								Blocks.STONE.defaultBlockState(), Blocks.STONE.defaultBlockState(), Blocks.STONE.defaultBlockState()));
						NoiseGeneratorSettings moddedNoiseGeneratorSettings = new NoiseGeneratorSettings(noiseGeneratorSettings.noiseSettings(),
								noiseGeneratorSettings.defaultBlock(), noiseGeneratorSettings.defaultFluid(), noiseGeneratorSettings.noiseRouter(),
								SurfaceRules.sequence(surfaceRules.toArray(i -> new SurfaceRules.RuleSource[i])), noiseGeneratorSettings.seaLevel(),
								noiseGeneratorSettings.disableMobGeneration(), noiseGeneratorSettings.aquifersEnabled(),
								noiseGeneratorSettings.oreVeinsEnabled(), noiseGeneratorSettings.useLegacyRandomSource());
						noiseGenerator.settings = new Holder.Direct(moddedNoiseGeneratorSettings);
					}
				}
			}

		}
	}

	private static SurfaceRules.RuleSource anySurfaceRule(ResourceKey<Biome> biomeKey, BlockState groundBlock, BlockState undergroundBlock,
			BlockState underwaterBlock) {
		return SurfaceRules.ifTrue(SurfaceRules.isBiome(biomeKey),
				SurfaceRules.sequence(
						SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, false, 0, CaveSurface.FLOOR),
								SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.waterBlockCheck(-1, 0), SurfaceRules.state(groundBlock)),
										SurfaceRules.state(underwaterBlock))),
						SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, true, 0, CaveSurface.FLOOR), SurfaceRules.state(undergroundBlock))));
	}
}
