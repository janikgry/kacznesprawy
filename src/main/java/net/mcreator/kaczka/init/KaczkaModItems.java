
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kaczka.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.kaczka.item.VoidMessengerItem;
import net.mcreator.kaczka.item.ToretzanItem;
import net.mcreator.kaczka.item.SapphireItem;
import net.mcreator.kaczka.item.RubyneckleItem;
import net.mcreator.kaczka.item.RubyItem;
import net.mcreator.kaczka.item.PreludeItem;
import net.mcreator.kaczka.item.PreludeBlueItem;
import net.mcreator.kaczka.item.PowertokenItem;
import net.mcreator.kaczka.item.JadeitegemItem;
import net.mcreator.kaczka.item.JadeitechiselItem;
import net.mcreator.kaczka.item.GildedclaypieceItem;
import net.mcreator.kaczka.item.ForavaraItem;
import net.mcreator.kaczka.item.FireworksItem;
import net.mcreator.kaczka.item.EnderiteshardItem;
import net.mcreator.kaczka.item.DustydimensionItem;
import net.mcreator.kaczka.item.DustierdiemsionItem;
import net.mcreator.kaczka.item.DustItem;
import net.mcreator.kaczka.item.DepthItem;
import net.mcreator.kaczka.item.DeepShardItem;
import net.mcreator.kaczka.item.DeepIronItem;
import net.mcreator.kaczka.item.DeepIronBladeItem;
import net.mcreator.kaczka.item.CesiumampuleItem;
import net.mcreator.kaczka.KaczkaMod;

public class KaczkaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, KaczkaMod.MODID);
	public static final RegistryObject<Item> GILDEDCLAY = block(KaczkaModBlocks.GILDEDCLAY, KaczkaModTabs.TAB_FARMAZONY);
	public static final RegistryObject<Item> GILDEDCLAYPIECE = REGISTRY.register("gildedclaypiece", () -> new GildedclaypieceItem());
	public static final RegistryObject<Item> GOLDENBRICKS = block(KaczkaModBlocks.GOLDENBRICKS, KaczkaModTabs.TAB_FARMAZONY);
	public static final RegistryObject<Item> NETHERDIAMONDORE = block(KaczkaModBlocks.NETHERDIAMONDORE, KaczkaModTabs.TAB_FARMAZONY);
	public static final RegistryObject<Item> FIREWORKS = REGISTRY.register("fireworks", () -> new FireworksItem());
	public static final RegistryObject<Item> RUBY = REGISTRY.register("ruby", () -> new RubyItem());
	public static final RegistryObject<Item> RUBYORE = block(KaczkaModBlocks.RUBYORE, KaczkaModTabs.TAB_FARMAZONY);
	public static final RegistryObject<Item> RUBYPRISMARINE = block(KaczkaModBlocks.RUBYPRISMARINE, KaczkaModTabs.TAB_FARMAZONY);
	public static final RegistryObject<Item> RUBYBLOCK = block(KaczkaModBlocks.RUBYBLOCK, KaczkaModTabs.TAB_FARMAZONY);
	public static final RegistryObject<Item> RUBYPRISMARINESTAIRS = block(KaczkaModBlocks.RUBYPRISMARINESTAIRS, KaczkaModTabs.TAB_FARMAZONY);
	public static final RegistryObject<Item> RUBYPRISMARINESLAB = block(KaczkaModBlocks.RUBYPRISMARINESLAB, KaczkaModTabs.TAB_FARMAZONY);
	public static final RegistryObject<Item> GOLDENBRICKSTAIRS = block(KaczkaModBlocks.GOLDENBRICKSTAIRS, KaczkaModTabs.TAB_FARMAZONY);
	public static final RegistryObject<Item> GOLDENBRICKSLAB = block(KaczkaModBlocks.GOLDENBRICKSLAB, KaczkaModTabs.TAB_FARMAZONY);
	public static final RegistryObject<Item> RUBYLANTERN = block(KaczkaModBlocks.RUBYLANTERN, KaczkaModTabs.TAB_FARMAZONY);
	public static final RegistryObject<Item> CESIUMAMPULE = REGISTRY.register("cesiumampule", () -> new CesiumampuleItem());
	public static final RegistryObject<Item> RUBYNECKLE_CHESTPLATE = REGISTRY.register("rubyneckle_chestplate",
			() -> new RubyneckleItem.Chestplate());
	public static final RegistryObject<Item> RUBYFLOWER = block(KaczkaModBlocks.RUBYFLOWER, KaczkaModTabs.TAB_FARMAZONY);
	public static final RegistryObject<Item> RUBYCRYSTAL = block(KaczkaModBlocks.RUBYCRYSTAL, KaczkaModTabs.TAB_FARMAZONY);
	public static final RegistryObject<Item> JADEITEGRAVELORE = block(KaczkaModBlocks.JADEITEGRAVELORE, KaczkaModTabs.TAB_FARMAZONY);
	public static final RegistryObject<Item> JADEITEBLOCK = block(KaczkaModBlocks.JADEITEBLOCK, KaczkaModTabs.TAB_FARMAZONY);
	public static final RegistryObject<Item> DEEPSTONE = block(KaczkaModBlocks.DEEPSTONE, KaczkaModTabs.TAB_ORESWIRAZ);
	public static final RegistryObject<Item> DEEP_SHARD = REGISTRY.register("deep_shard", () -> new DeepShardItem());
	public static final RegistryObject<Item> DEEP_IRON = REGISTRY.register("deep_iron", () -> new DeepIronItem());
	public static final RegistryObject<Item> DEEP_IRON_BLOCK = block(KaczkaModBlocks.DEEP_IRON_BLOCK, KaczkaModTabs.TAB_ORESWIRAZ);
	public static final RegistryObject<Item> DEEP_IRON_BLADE = REGISTRY.register("deep_iron_blade", () -> new DeepIronBladeItem());
	public static final RegistryObject<Item> DUST = REGISTRY.register("dust", () -> new DustItem());
	public static final RegistryObject<Item> DUSTYOBSIDIAN = block(KaczkaModBlocks.DUSTYOBSIDIAN, KaczkaModTabs.TAB_DUSTY);
	public static final RegistryObject<Item> DEPTH = REGISTRY.register("depth", () -> new DepthItem());
	public static final RegistryObject<Item> BLOCK_OF_DEPTH = block(KaczkaModBlocks.BLOCK_OF_DEPTH, KaczkaModTabs.TAB_ORESWIRAZ);
	public static final RegistryObject<Item> DEEP_SHARD_BLOCK = block(KaczkaModBlocks.DEEP_SHARD_BLOCK, KaczkaModTabs.TAB_ORESWIRAZ);
	public static final RegistryObject<Item> DEPTH_EXTRACTOR = block(KaczkaModBlocks.DEPTH_EXTRACTOR, KaczkaModTabs.TAB_ORESWIRAZ);
	public static final RegistryObject<Item> DUSTYDIRT = block(KaczkaModBlocks.DUSTYDIRT, KaczkaModTabs.TAB_DUSTY);
	public static final RegistryObject<Item> DUSTYGRASS = block(KaczkaModBlocks.DUSTYGRASS, KaczkaModTabs.TAB_DUSTY);
	public static final RegistryObject<Item> TORETZAN_ORE = block(KaczkaModBlocks.TORETZAN_ORE, KaczkaModTabs.TAB_ORESWIRAZ);
	public static final RegistryObject<Item> TORETZAN = REGISTRY.register("toretzan", () -> new ToretzanItem());
	public static final RegistryObject<Item> FORAVARA_ORE = block(KaczkaModBlocks.FORAVARA_ORE, KaczkaModTabs.TAB_ORESWIRAZ);
	public static final RegistryObject<Item> FORAVARA = REGISTRY.register("foravara", () -> new ForavaraItem());
	public static final RegistryObject<Item> DUSTYPLANKS = block(KaczkaModBlocks.DUSTYPLANKS, KaczkaModTabs.TAB_DUSTY);
	public static final RegistryObject<Item> DUSTYLOG = block(KaczkaModBlocks.DUSTYLOG, KaczkaModTabs.TAB_DUSTY);
	public static final RegistryObject<Item> DUSTYLEAVES = block(KaczkaModBlocks.DUSTYLEAVES, KaczkaModTabs.TAB_DUSTY);
	public static final RegistryObject<Item> DUSTYDIMENSION = REGISTRY.register("dustydimension", () -> new DustydimensionItem());
	public static final RegistryObject<Item> DUSTYSTAIRS = block(KaczkaModBlocks.DUSTYSTAIRS, KaczkaModTabs.TAB_DUSTY);
	public static final RegistryObject<Item> DUSTYSLAB = block(KaczkaModBlocks.DUSTYSLAB, KaczkaModTabs.TAB_DUSTY);
	public static final RegistryObject<Item> DUSTYSAPLING = block(KaczkaModBlocks.DUSTYSAPLING, KaczkaModTabs.TAB_DUSTY);
	public static final RegistryObject<Item> DUSTYCRAFTINGTABLE = block(KaczkaModBlocks.DUSTYCRAFTINGTABLE, KaczkaModTabs.TAB_DUSTY);
	public static final RegistryObject<Item> DUSTYSTONE = block(KaczkaModBlocks.DUSTYSTONE, KaczkaModTabs.TAB_DUSTY);
	public static final RegistryObject<Item> DUSTYCOBBLESTONE = block(KaczkaModBlocks.DUSTYCOBBLESTONE, KaczkaModTabs.TAB_DUSTY);
	public static final RegistryObject<Item> DUSTYMOSS = block(KaczkaModBlocks.DUSTYMOSS, KaczkaModTabs.TAB_DUSTY);
	public static final RegistryObject<Item> DUSTYNETHERRACK = block(KaczkaModBlocks.DUSTYNETHERRACK, KaczkaModTabs.TAB_DUSTY);
	public static final RegistryObject<Item> DUSTYGLOWSTONE = block(KaczkaModBlocks.DUSTYGLOWSTONE, KaczkaModTabs.TAB_DUSTY);
	public static final RegistryObject<Item> DUSTYRUBYORE = block(KaczkaModBlocks.DUSTYRUBYORE, KaczkaModTabs.TAB_DUSTY);
	public static final RegistryObject<Item> CRYINGGLOWSTONE = block(KaczkaModBlocks.CRYINGGLOWSTONE, KaczkaModTabs.TAB_FARMAZONY);
	public static final RegistryObject<Item> THE = block(KaczkaModBlocks.THE, KaczkaModTabs.TAB_DUSTY);
	public static final RegistryObject<Item> DUSTYHOUSESPAWN = block(KaczkaModBlocks.DUSTYHOUSESPAWN, KaczkaModTabs.TAB_STRUCTURES);
	public static final RegistryObject<Item> SAPPHIREORE = block(KaczkaModBlocks.SAPPHIREORE, KaczkaModTabs.TAB_FARMAZONY);
	public static final RegistryObject<Item> SAPPHIRE = REGISTRY.register("sapphire", () -> new SapphireItem());
	public static final RegistryObject<Item> SAPPHIREBLOCK = block(KaczkaModBlocks.SAPPHIREBLOCK, KaczkaModTabs.TAB_FARMAZONY);
	public static final RegistryObject<Item> DUSTIERDIEMSION = REGISTRY.register("dustierdiemsion", () -> new DustierdiemsionItem());
	public static final RegistryObject<Item> DUSTYCRYINGOBSIDIAN = block(KaczkaModBlocks.DUSTYCRYINGOBSIDIAN, KaczkaModTabs.TAB_DUSTY);
	public static final RegistryObject<Item> DUSTYCRYINGGLOWSTONE = block(KaczkaModBlocks.DUSTYCRYINGGLOWSTONE, KaczkaModTabs.TAB_DUSTY);
	public static final RegistryObject<Item> DUSTYPORTALSPAWN = block(KaczkaModBlocks.DUSTYPORTALSPAWN, KaczkaModTabs.TAB_STRUCTURES);
	public static final RegistryObject<Item> AETHERPORTALSPAWN = block(KaczkaModBlocks.AETHERPORTALSPAWN, KaczkaModTabs.TAB_STRUCTURES);
	public static final RegistryObject<Item> DUSTYAETHERPORTALPAWN = block(KaczkaModBlocks.DUSTYAETHERPORTALPAWN, KaczkaModTabs.TAB_KACZKA);
	public static final RegistryObject<Item> GLOWINGOBSIDIAN = block(KaczkaModBlocks.GLOWINGOBSIDIAN, KaczkaModTabs.TAB_DUSTY);
	public static final RegistryObject<Item> NETHERREACTOR = block(KaczkaModBlocks.NETHERREACTOR, KaczkaModTabs.TAB_DUSTY);
	public static final RegistryObject<Item> NETHERREACTORSPAWNER = block(KaczkaModBlocks.NETHERREACTORSPAWNER, KaczkaModTabs.TAB_STRUCTURES);
	public static final RegistryObject<Item> ENDERITEORE = block(KaczkaModBlocks.ENDERITEORE, KaczkaModTabs.TAB_FARMAZONY);
	public static final RegistryObject<Item> ENDERITESHARD = REGISTRY.register("enderiteshard", () -> new EnderiteshardItem());
	public static final RegistryObject<Item> PRELUDE = REGISTRY.register("prelude", () -> new PreludeItem());
	public static final RegistryObject<Item> PRELUDE_BLUE = REGISTRY.register("prelude_blue", () -> new PreludeBlueItem());
	public static final RegistryObject<Item> TSAVORITE = block(KaczkaModBlocks.TSAVORITE, KaczkaModTabs.TAB_FARMAZONY);
	public static final RegistryObject<Item> JADEITECHISEL = REGISTRY.register("jadeitechisel", () -> new JadeitechiselItem());
	public static final RegistryObject<Item> JADEITEGEM = REGISTRY.register("jadeitegem", () -> new JadeitegemItem());
	public static final RegistryObject<Item> JADEITEGEMBLOCK = block(KaczkaModBlocks.JADEITEGEMBLOCK, KaczkaModTabs.TAB_FARMAZONY);
	public static final RegistryObject<Item> JADEITEGEMORE = block(KaczkaModBlocks.JADEITEGEMORE, KaczkaModTabs.TAB_FARMAZONY);
	public static final RegistryObject<Item> VOID_MESSENGER = REGISTRY.register("void_messenger", () -> new VoidMessengerItem());
	public static final RegistryObject<Item> POWERTOKEN = REGISTRY.register("powertoken", () -> new PowertokenItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
