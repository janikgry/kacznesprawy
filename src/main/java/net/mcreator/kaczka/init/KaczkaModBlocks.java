
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kaczka.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.kaczka.block.ToretzanOreBlock;
import net.mcreator.kaczka.block.TheBlock;
import net.mcreator.kaczka.block.SapphireoreBlock;
import net.mcreator.kaczka.block.SapphireblockBlock;
import net.mcreator.kaczka.block.RubyprismarinestairsBlock;
import net.mcreator.kaczka.block.RubyprismarineslabBlock;
import net.mcreator.kaczka.block.RubyprismarineBlock;
import net.mcreator.kaczka.block.RubyoreBlock;
import net.mcreator.kaczka.block.RubylanternBlock;
import net.mcreator.kaczka.block.RubyflowerBlock;
import net.mcreator.kaczka.block.RubycrystalBlock;
import net.mcreator.kaczka.block.RubyblockBlock;
import net.mcreator.kaczka.block.NetherreactorspawnerBlock;
import net.mcreator.kaczka.block.NetherreactorBlock;
import net.mcreator.kaczka.block.NetherdiamondoreBlock;
import net.mcreator.kaczka.block.JadeitegraveloreBlock;
import net.mcreator.kaczka.block.JadeiteblockBlock;
import net.mcreator.kaczka.block.GoldenbrickstairsBlock;
import net.mcreator.kaczka.block.GoldenbrickslabBlock;
import net.mcreator.kaczka.block.GoldenbricksBlock;
import net.mcreator.kaczka.block.GlowingobsidianBlock;
import net.mcreator.kaczka.block.GildedclayBlock;
import net.mcreator.kaczka.block.ForavaraOreBlock;
import net.mcreator.kaczka.block.EnderiteoreBlock;
import net.mcreator.kaczka.block.DustystoneBlock;
import net.mcreator.kaczka.block.DustystairsBlock;
import net.mcreator.kaczka.block.DustyslabBlock;
import net.mcreator.kaczka.block.DustysaplingBlock;
import net.mcreator.kaczka.block.DustyrubyoreBlock;
import net.mcreator.kaczka.block.DustyportalspawnBlock;
import net.mcreator.kaczka.block.DustyplanksBlock;
import net.mcreator.kaczka.block.DustyobsidianBlock;
import net.mcreator.kaczka.block.DustynetherrackBlock;
import net.mcreator.kaczka.block.DustymossBlock;
import net.mcreator.kaczka.block.DustylogBlock;
import net.mcreator.kaczka.block.DustyleavesBlock;
import net.mcreator.kaczka.block.DustyhousespawnBlock;
import net.mcreator.kaczka.block.DustygrassBlock;
import net.mcreator.kaczka.block.DustyglowstoneBlock;
import net.mcreator.kaczka.block.DustydirtBlock;
import net.mcreator.kaczka.block.DustydimensionPortalBlock;
import net.mcreator.kaczka.block.DustycryingobsidianBlock;
import net.mcreator.kaczka.block.DustycryingglowstoneBlock;
import net.mcreator.kaczka.block.DustycraftingtableBlock;
import net.mcreator.kaczka.block.DustycobblestoneBlock;
import net.mcreator.kaczka.block.DustyaetherportalpawnBlock;
import net.mcreator.kaczka.block.DustierdiemsionPortalBlock;
import net.mcreator.kaczka.block.DepthExtractorBlock;
import net.mcreator.kaczka.block.DeepstoneBlock;
import net.mcreator.kaczka.block.DeepShardBlockBlock;
import net.mcreator.kaczka.block.DeepIronBlockBlock;
import net.mcreator.kaczka.block.CryingglowstoneBlock;
import net.mcreator.kaczka.block.BlockOfDepthBlock;
import net.mcreator.kaczka.block.AetherportalspawnBlock;
import net.mcreator.kaczka.KaczkaMod;

public class KaczkaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, KaczkaMod.MODID);
	public static final RegistryObject<Block> GILDEDCLAY = REGISTRY.register("gildedclay", () -> new GildedclayBlock());
	public static final RegistryObject<Block> GOLDENBRICKS = REGISTRY.register("goldenbricks", () -> new GoldenbricksBlock());
	public static final RegistryObject<Block> NETHERDIAMONDORE = REGISTRY.register("netherdiamondore", () -> new NetherdiamondoreBlock());
	public static final RegistryObject<Block> RUBYORE = REGISTRY.register("rubyore", () -> new RubyoreBlock());
	public static final RegistryObject<Block> RUBYPRISMARINE = REGISTRY.register("rubyprismarine", () -> new RubyprismarineBlock());
	public static final RegistryObject<Block> RUBYBLOCK = REGISTRY.register("rubyblock", () -> new RubyblockBlock());
	public static final RegistryObject<Block> RUBYPRISMARINESTAIRS = REGISTRY.register("rubyprismarinestairs", () -> new RubyprismarinestairsBlock());
	public static final RegistryObject<Block> RUBYPRISMARINESLAB = REGISTRY.register("rubyprismarineslab", () -> new RubyprismarineslabBlock());
	public static final RegistryObject<Block> GOLDENBRICKSTAIRS = REGISTRY.register("goldenbrickstairs", () -> new GoldenbrickstairsBlock());
	public static final RegistryObject<Block> GOLDENBRICKSLAB = REGISTRY.register("goldenbrickslab", () -> new GoldenbrickslabBlock());
	public static final RegistryObject<Block> RUBYLANTERN = REGISTRY.register("rubylantern", () -> new RubylanternBlock());
	public static final RegistryObject<Block> RUBYFLOWER = REGISTRY.register("rubyflower", () -> new RubyflowerBlock());
	public static final RegistryObject<Block> RUBYCRYSTAL = REGISTRY.register("rubycrystal", () -> new RubycrystalBlock());
	public static final RegistryObject<Block> JADEITEGRAVELORE = REGISTRY.register("jadeitegravelore", () -> new JadeitegraveloreBlock());
	public static final RegistryObject<Block> JADEITEBLOCK = REGISTRY.register("jadeiteblock", () -> new JadeiteblockBlock());
	public static final RegistryObject<Block> DEEPSTONE = REGISTRY.register("deepstone", () -> new DeepstoneBlock());
	public static final RegistryObject<Block> DEEP_IRON_BLOCK = REGISTRY.register("deep_iron_block", () -> new DeepIronBlockBlock());
	public static final RegistryObject<Block> DUSTYOBSIDIAN = REGISTRY.register("dustyobsidian", () -> new DustyobsidianBlock());
	public static final RegistryObject<Block> BLOCK_OF_DEPTH = REGISTRY.register("block_of_depth", () -> new BlockOfDepthBlock());
	public static final RegistryObject<Block> DEEP_SHARD_BLOCK = REGISTRY.register("deep_shard_block", () -> new DeepShardBlockBlock());
	public static final RegistryObject<Block> DEPTH_EXTRACTOR = REGISTRY.register("depth_extractor", () -> new DepthExtractorBlock());
	public static final RegistryObject<Block> DUSTYDIRT = REGISTRY.register("dustydirt", () -> new DustydirtBlock());
	public static final RegistryObject<Block> DUSTYGRASS = REGISTRY.register("dustygrass", () -> new DustygrassBlock());
	public static final RegistryObject<Block> TORETZAN_ORE = REGISTRY.register("toretzan_ore", () -> new ToretzanOreBlock());
	public static final RegistryObject<Block> FORAVARA_ORE = REGISTRY.register("foravara_ore", () -> new ForavaraOreBlock());
	public static final RegistryObject<Block> DUSTYPLANKS = REGISTRY.register("dustyplanks", () -> new DustyplanksBlock());
	public static final RegistryObject<Block> DUSTYLOG = REGISTRY.register("dustylog", () -> new DustylogBlock());
	public static final RegistryObject<Block> DUSTYLEAVES = REGISTRY.register("dustyleaves", () -> new DustyleavesBlock());
	public static final RegistryObject<Block> DUSTYDIMENSION_PORTAL = REGISTRY.register("dustydimension_portal",
			() -> new DustydimensionPortalBlock());
	public static final RegistryObject<Block> DUSTYSTAIRS = REGISTRY.register("dustystairs", () -> new DustystairsBlock());
	public static final RegistryObject<Block> DUSTYSLAB = REGISTRY.register("dustyslab", () -> new DustyslabBlock());
	public static final RegistryObject<Block> DUSTYSAPLING = REGISTRY.register("dustysapling", () -> new DustysaplingBlock());
	public static final RegistryObject<Block> DUSTYCRAFTINGTABLE = REGISTRY.register("dustycraftingtable", () -> new DustycraftingtableBlock());
	public static final RegistryObject<Block> DUSTYSTONE = REGISTRY.register("dustystone", () -> new DustystoneBlock());
	public static final RegistryObject<Block> DUSTYCOBBLESTONE = REGISTRY.register("dustycobblestone", () -> new DustycobblestoneBlock());
	public static final RegistryObject<Block> DUSTYMOSS = REGISTRY.register("dustymoss", () -> new DustymossBlock());
	public static final RegistryObject<Block> DUSTYNETHERRACK = REGISTRY.register("dustynetherrack", () -> new DustynetherrackBlock());
	public static final RegistryObject<Block> DUSTYGLOWSTONE = REGISTRY.register("dustyglowstone", () -> new DustyglowstoneBlock());
	public static final RegistryObject<Block> DUSTYRUBYORE = REGISTRY.register("dustyrubyore", () -> new DustyrubyoreBlock());
	public static final RegistryObject<Block> CRYINGGLOWSTONE = REGISTRY.register("cryingglowstone", () -> new CryingglowstoneBlock());
	public static final RegistryObject<Block> THE = REGISTRY.register("the", () -> new TheBlock());
	public static final RegistryObject<Block> DUSTYHOUSESPAWN = REGISTRY.register("dustyhousespawn", () -> new DustyhousespawnBlock());
	public static final RegistryObject<Block> SAPPHIREORE = REGISTRY.register("sapphireore", () -> new SapphireoreBlock());
	public static final RegistryObject<Block> SAPPHIREBLOCK = REGISTRY.register("sapphireblock", () -> new SapphireblockBlock());
	public static final RegistryObject<Block> DUSTIERDIEMSION_PORTAL = REGISTRY.register("dustierdiemsion_portal",
			() -> new DustierdiemsionPortalBlock());
	public static final RegistryObject<Block> DUSTYCRYINGOBSIDIAN = REGISTRY.register("dustycryingobsidian", () -> new DustycryingobsidianBlock());
	public static final RegistryObject<Block> DUSTYCRYINGGLOWSTONE = REGISTRY.register("dustycryingglowstone", () -> new DustycryingglowstoneBlock());
	public static final RegistryObject<Block> DUSTYPORTALSPAWN = REGISTRY.register("dustyportalspawn", () -> new DustyportalspawnBlock());
	public static final RegistryObject<Block> AETHERPORTALSPAWN = REGISTRY.register("aetherportalspawn", () -> new AetherportalspawnBlock());
	public static final RegistryObject<Block> DUSTYAETHERPORTALPAWN = REGISTRY.register("dustyaetherportalpawn",
			() -> new DustyaetherportalpawnBlock());
	public static final RegistryObject<Block> GLOWINGOBSIDIAN = REGISTRY.register("glowingobsidian", () -> new GlowingobsidianBlock());
	public static final RegistryObject<Block> NETHERREACTOR = REGISTRY.register("netherreactor", () -> new NetherreactorBlock());
	public static final RegistryObject<Block> NETHERREACTORSPAWNER = REGISTRY.register("netherreactorspawner", () -> new NetherreactorspawnerBlock());
	public static final RegistryObject<Block> ENDERITEORE = REGISTRY.register("enderiteore", () -> new EnderiteoreBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			RubyflowerBlock.registerRenderLayer();
			DustyleavesBlock.registerRenderLayer();
			DustydimensionPortalBlock.registerRenderLayer();
			DustysaplingBlock.registerRenderLayer();
			DustierdiemsionPortalBlock.registerRenderLayer();
		}
	}
}
