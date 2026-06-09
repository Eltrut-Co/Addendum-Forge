package co.eltrut.addendum.core.registry;

import co.eltrut.addendum.core.Addendum;
import co.eltrut.differentiate.common.repo.VariantBlocksRepo;
import co.eltrut.differentiate.core.event.LoadEvent;
import co.eltrut.differentiate.core.registrator.BlockHelper;
import co.eltrut.differentiate.core.util.BlockUtil;
import co.eltrut.differentiate.core.util.CompatUtil;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.List;
import java.util.Map;

@EventBusSubscriber(modid = Addendum.MOD_ID)
public class AddendumBlocks {
	@SubscribeEvent
	public static void load(LoadEvent event) {}

	public static final BlockHelper HELPER = Addendum.REGISTRATOR.getHelper(Registries.BLOCK);

	// Vanilla
	public static final VariantBlocksRepo END_STONE = HELPER.createBlockVariants(Blocks.END_STONE, CreativeModeTabs.BUILDING_BLOCKS);
	public static final VariantBlocksRepo POLISHED_END_STONE = HELPER.createFollowBlockWithVariants("polished_end_stone", () -> new Block(Block.Properties.ofFullCopy(Blocks.END_STONE)), Block.Properties.ofFullCopy(Blocks.END_STONE), CreativeModeTabs.BUILDING_BLOCKS, Blocks.END_STONE, Addendum.MOD_ID, "end_stone_wall");
	public static final VariantBlocksRepo CHORUSY_END_STONE_BRICKS = HELPER.createFollowBlockWithVariants("chorusy_end_stone_bricks", Block.Properties.ofFullCopy(Blocks.END_STONE_BRICKS), CreativeModeTabs.BUILDING_BLOCKS, Blocks.END_STONE_BRICKS, Blocks.END_STONE_BRICK_WALL);

	public static final VariantBlocksRepo PURPUR_BRICKS = HELPER.createFollowBlockWithVariants("purpur_bricks", BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK), CreativeModeTabs.BUILDING_BLOCKS, Blocks.PURPUR_BLOCK, Blocks.PURPUR_SLAB);
	public static final DeferredBlock<Block> CHISELED_PURPUR_BRICKS = HELPER.createFollowBlock("chiseled_purpur_bricks", () -> new Block(Block.Properties.ofFullCopy(Blocks.PURPUR_BLOCK)), CreativeModeTabs.BUILDING_BLOCKS, Addendum.MOD_ID, "purpur_brick_wall");
	public static final DeferredBlock<Block> POPPED_CHORUS_FRUIT_BLOCK = HELPER.createBlock("popped_chorus_fruit_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.MAGENTA_WOOL)), CreativeModeTabs.NATURAL_BLOCKS);

	public static final DeferredBlock<Block> SHULKER_BLOCK = HELPER.createBlock("shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.SHULKER_BOX).pushReaction(PushReaction.NORMAL)), CreativeModeTabs.BUILDING_BLOCKS);
	public static final DeferredBlock<Block> SHULKER_SWIRL = HELPER.createBlock("shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.SHULKER_BOX).pushReaction(PushReaction.BLOCK)), CreativeModeTabs.BUILDING_BLOCKS);

	public static final DeferredBlock<Block> WHITE_SHULKER_BLOCK = HELPER.createBlock("white_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.WHITE_SHULKER_BOX).pushReaction(PushReaction.NORMAL)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> ORANGE_SHULKER_BLOCK = HELPER.createBlock("orange_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.ORANGE_SHULKER_BOX).pushReaction(PushReaction.NORMAL)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> MAGENTA_SHULKER_BLOCK = HELPER.createBlock("magenta_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.MAGENTA_SHULKER_BOX).pushReaction(PushReaction.NORMAL)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> LIGHT_BLUE_SHULKER_BLOCK = HELPER.createBlock("light_blue_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.LIGHT_BLUE_SHULKER_BOX).pushReaction(PushReaction.NORMAL)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> YELLOW_SHULKER_BLOCK = HELPER.createBlock("yellow_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.YELLOW_SHULKER_BOX).pushReaction(PushReaction.NORMAL)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> LIME_SHULKER_BLOCK = HELPER.createBlock("lime_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.LIME_SHULKER_BOX).pushReaction(PushReaction.NORMAL)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> PINK_SHULKER_BLOCK = HELPER.createBlock("pink_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.PINK_SHULKER_BOX).pushReaction(PushReaction.NORMAL)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> GRAY_SHULKER_BLOCK = HELPER.createBlock("gray_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.GRAY_SHULKER_BOX).pushReaction(PushReaction.NORMAL)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> LIGHT_GRAY_SHULKER_BLOCK = HELPER.createBlock("light_gray_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.LIGHT_GRAY_SHULKER_BOX).pushReaction(PushReaction.NORMAL)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> CYAN_SHULKER_BLOCK = HELPER.createBlock("cyan_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.CYAN_SHULKER_BOX).pushReaction(PushReaction.NORMAL)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> PURPLE_SHULKER_BLOCK = HELPER.createBlock("purple_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.PURPLE_SHULKER_BOX).pushReaction(PushReaction.NORMAL)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> BLUE_SHULKER_BLOCK = HELPER.createBlock("blue_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.BLUE_SHULKER_BOX).pushReaction(PushReaction.NORMAL)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> BROWN_SHULKER_BLOCK = HELPER.createBlock("brown_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.BROWN_SHULKER_BOX).pushReaction(PushReaction.NORMAL)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> GREEN_SHULKER_BLOCK = HELPER.createBlock("green_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.GREEN_SHULKER_BOX).pushReaction(PushReaction.NORMAL)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> RED_SHULKER_BLOCK = HELPER.createBlock("red_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.RED_SHULKER_BOX).pushReaction(PushReaction.NORMAL)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> BLACK_SHULKER_BLOCK = HELPER.createBlock("black_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.BLACK_SHULKER_BOX).pushReaction(PushReaction.NORMAL)), CreativeModeTabs.COLORED_BLOCKS);

	public static final DeferredBlock<Block> WHITE_SHULKER_SWIRL = HELPER.createBlock("white_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.WHITE_SHULKER_BOX).pushReaction(PushReaction.BLOCK)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> ORANGE_SHULKER_SWIRL = HELPER.createBlock("orange_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.ORANGE_SHULKER_BOX).pushReaction(PushReaction.BLOCK)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> MAGENTA_SHULKER_SWIRL = HELPER.createBlock("magenta_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.MAGENTA_SHULKER_BOX).pushReaction(PushReaction.BLOCK)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> LIGHT_BLUE_SHULKER_SWIRL = HELPER.createBlock("light_blue_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.LIGHT_BLUE_SHULKER_BOX).pushReaction(PushReaction.BLOCK)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> YELLOW_SHULKER_SWIRL = HELPER.createBlock("yellow_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.YELLOW_SHULKER_BOX).pushReaction(PushReaction.BLOCK)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> LIME_SHULKER_SWIRL = HELPER.createBlock("lime_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.LIME_SHULKER_BOX).pushReaction(PushReaction.BLOCK)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> PINK_SHULKER_SWIRL = HELPER.createBlock("pink_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.PINK_SHULKER_BOX).pushReaction(PushReaction.BLOCK)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> GRAY_SHULKER_SWIRL = HELPER.createBlock("gray_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.GRAY_SHULKER_BOX).pushReaction(PushReaction.BLOCK)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> LIGHT_GRAY_SHULKER_SWIRL = HELPER.createBlock("light_gray_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.LIGHT_GRAY_SHULKER_BOX).pushReaction(PushReaction.BLOCK)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> CYAN_SHULKER_SWIRL = HELPER.createBlock("cyan_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.CYAN_SHULKER_BOX).pushReaction(PushReaction.BLOCK)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> PURPLE_SHULKER_SWIRL = HELPER.createBlock("purple_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.PURPLE_SHULKER_BOX).pushReaction(PushReaction.BLOCK)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> BLUE_SHULKER_SWIRL = HELPER.createBlock("blue_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.BLUE_SHULKER_BOX).pushReaction(PushReaction.BLOCK)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> BROWN_SHULKER_SWIRL = HELPER.createBlock("brown_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.BROWN_SHULKER_BOX).pushReaction(PushReaction.BLOCK)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> GREEN_SHULKER_SWIRL = HELPER.createBlock("green_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.GREEN_SHULKER_BOX).pushReaction(PushReaction.BLOCK)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> RED_SHULKER_SWIRL = HELPER.createBlock("red_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.RED_SHULKER_BOX).pushReaction(PushReaction.BLOCK)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> BLACK_SHULKER_SWIRL = HELPER.createBlock("black_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.BLACK_SHULKER_BOX).pushReaction(PushReaction.BLOCK)), CreativeModeTabs.COLORED_BLOCKS);

	// Compat
	public static final Map<String, MapColor> MAP_COLORS = Map.ofEntries(
			Map.entry("maroon", MapColor.CRIMSON_HYPHAE),
			Map.entry("rose", MapColor.TERRACOTTA_MAGENTA),
			Map.entry("coral", MapColor.RAW_IRON),
			Map.entry("indigo", MapColor.TERRACOTTA_BLUE),
			Map.entry("navy", MapColor.COLOR_CYAN),
			Map.entry("slate", MapColor.WARPED_NYLIUM),
			Map.entry("olive", MapColor.TERRACOTTA_LIGHT_GREEN),
			Map.entry("amber", MapColor.WOOD),
			Map.entry("beige", MapColor.SAND),
			Map.entry("teal", MapColor.TERRACOTTA_CYAN),
			Map.entry("mint", MapColor.WARPED_WART_BLOCK),
			Map.entry("aqua", MapColor.DIAMOND),
			Map.entry("verdant", MapColor.TERRACOTTA_GREEN),
			Map.entry("forest", MapColor.EMERALD),
			Map.entry("ginger", MapColor.TERRACOTTA_ORANGE),
			Map.entry("tan", MapColor.DIRT)
	);

	public static final VariantBlocksRepo MIDORI_BRICKS = HELPER.createBlockWithVariants("midori_bricks", BlockUtil.QuarkProperties.MIDORI, CreativeModeTabs.BUILDING_BLOCKS, Blocks.PURPUR_BLOCK, CompatUtil.Mods.QUARK);
	public static final DeferredBlock<Block> CHISELED_MIDORI_BRICKS = HELPER.createBlock("chiseled_midori_bricks", () -> new Block(BlockUtil.QuarkProperties.MIDORI), CreativeModeTabs.BUILDING_BLOCKS, CompatUtil.Mods.QUARK);
	public static final DeferredBlock<Block> MOSS_PASTE_BLOCK = HELPER.createBlock("moss_paste_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.LIME_WOOL)), CreativeModeTabs.COLORED_BLOCKS, CompatUtil.Mods.QUARK);

	public static final DeferredBlock<Block> POLISHED_END_STONE_PRESSURE_PLATE = HELPER.createFollowBlock("polished_end_stone_pressure_plate", () -> new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)
			.forceSolidOn()
			.noCollission()
			.strength(0.5F)
			.pushReaction(PushReaction.DESTROY)), CreativeModeTabs.BUILDING_BLOCKS, POLISHED_END_STONE.getWallBlock(), CompatUtil.Mods.LEPTON);
	public static final DeferredBlock<Block> POLISHED_END_STONE_BUTTON = HELPER.createFollowBlock("polished_end_stone_button", () -> new ButtonBlock(BlockSetType.STONE, 20, BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)
			.noCollission()
			.strength(0.5F)
			.pushReaction(PushReaction.DESTROY)), CreativeModeTabs.BUILDING_BLOCKS, POLISHED_END_STONE.getWallBlock(), CompatUtil.Mods.LEPTON);

	public static final DeferredBlock<Block> AMBER_SHULKER_BLOCK = HELPER.createBlock("amber_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.SHULKER_BOX).pushReaction(PushReaction.NORMAL).mapColor(MAP_COLORS.get("amber"))), CreativeModeTabs.COLORED_BLOCKS, CompatUtil.Mods.DYE_DEPOT);
	public static final DeferredBlock<Block> AQUA_SHULKER_BLOCK = HELPER.createBlock("aqua_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.SHULKER_BOX).pushReaction(PushReaction.NORMAL).mapColor(MAP_COLORS.get("aqua"))), CreativeModeTabs.COLORED_BLOCKS, CompatUtil.Mods.DYE_DEPOT);
	public static final DeferredBlock<Block> BEIGE_SHULKER_BLOCK = HELPER.createBlock("beige_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.SHULKER_BOX).pushReaction(PushReaction.NORMAL).mapColor(MAP_COLORS.get("beige"))), CreativeModeTabs.COLORED_BLOCKS, CompatUtil.Mods.DYE_DEPOT);
	public static final DeferredBlock<Block> CORAL_SHULKER_BLOCK = HELPER.createBlock("coral_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.SHULKER_BOX).pushReaction(PushReaction.NORMAL).mapColor(MAP_COLORS.get("coral"))), CreativeModeTabs.COLORED_BLOCKS, CompatUtil.Mods.DYE_DEPOT);
	public static final DeferredBlock<Block> FOREST_SHULKER_BLOCK = HELPER.createBlock("forest_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.SHULKER_BOX).pushReaction(PushReaction.NORMAL).mapColor(MAP_COLORS.get("forest"))), CreativeModeTabs.COLORED_BLOCKS, CompatUtil.Mods.DYE_DEPOT);
	public static final DeferredBlock<Block> GINGER_SHULKER_BLOCK = HELPER.createBlock("ginger_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.SHULKER_BOX).pushReaction(PushReaction.NORMAL).mapColor(MAP_COLORS.get("ginger"))), CreativeModeTabs.COLORED_BLOCKS, CompatUtil.Mods.DYE_DEPOT);
	public static final DeferredBlock<Block> INDIGO_SHULKER_BLOCK = HELPER.createBlock("indigo_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.SHULKER_BOX).pushReaction(PushReaction.NORMAL).mapColor(MAP_COLORS.get("indigo"))), CreativeModeTabs.COLORED_BLOCKS, CompatUtil.Mods.DYE_DEPOT);
	public static final DeferredBlock<Block> MAROON_SHULKER_BLOCK = HELPER.createBlock("maroon_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.SHULKER_BOX).pushReaction(PushReaction.NORMAL).mapColor(MAP_COLORS.get("maroon"))), CreativeModeTabs.COLORED_BLOCKS, CompatUtil.Mods.DYE_DEPOT);
	public static final DeferredBlock<Block> MINT_SHULKER_BLOCK = HELPER.createBlock("mint_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.SHULKER_BOX).pushReaction(PushReaction.NORMAL).mapColor(MAP_COLORS.get("mint"))), CreativeModeTabs.COLORED_BLOCKS, CompatUtil.Mods.DYE_DEPOT);
	public static final DeferredBlock<Block> NAVY_SHULKER_BLOCK = HELPER.createBlock("navy_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.SHULKER_BOX).pushReaction(PushReaction.NORMAL).mapColor(MAP_COLORS.get("navy"))), CreativeModeTabs.COLORED_BLOCKS, CompatUtil.Mods.DYE_DEPOT);
	public static final DeferredBlock<Block> OLIVE_SHULKER_BLOCK = HELPER.createBlock("olive_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.SHULKER_BOX).pushReaction(PushReaction.NORMAL).mapColor(MAP_COLORS.get("olive"))), CreativeModeTabs.COLORED_BLOCKS, CompatUtil.Mods.DYE_DEPOT);
	public static final DeferredBlock<Block> ROSE_SHULKER_BLOCK = HELPER.createBlock("rose_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.SHULKER_BOX).pushReaction(PushReaction.NORMAL).mapColor(MAP_COLORS.get("rose"))), CreativeModeTabs.COLORED_BLOCKS, CompatUtil.Mods.DYE_DEPOT);
	public static final DeferredBlock<Block> SLATE_SHULKER_BLOCK = HELPER.createBlock("slate_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.SHULKER_BOX).pushReaction(PushReaction.NORMAL).mapColor(MAP_COLORS.get("slate"))), CreativeModeTabs.COLORED_BLOCKS, CompatUtil.Mods.DYE_DEPOT);
	public static final DeferredBlock<Block> TAN_SHULKER_BLOCK = HELPER.createBlock("tan_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.SHULKER_BOX).pushReaction(PushReaction.NORMAL).mapColor(MAP_COLORS.get("tan"))), CreativeModeTabs.COLORED_BLOCKS, CompatUtil.Mods.DYE_DEPOT);
	public static final DeferredBlock<Block> TEAL_SHULKER_BLOCK = HELPER.createBlock("teal_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.SHULKER_BOX).pushReaction(PushReaction.NORMAL).mapColor(MAP_COLORS.get("teal"))), CreativeModeTabs.COLORED_BLOCKS, CompatUtil.Mods.DYE_DEPOT);
	public static final DeferredBlock<Block> VERDANT_SHULKER_BLOCK = HELPER.createBlock("verdant_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.SHULKER_BOX).pushReaction(PushReaction.NORMAL).mapColor(MAP_COLORS.get("verdant"))), CreativeModeTabs.COLORED_BLOCKS, CompatUtil.Mods.DYE_DEPOT);

	public static final DeferredBlock<Block> AMBER_SHULKER_SWIRL = HELPER.createBlock("amber_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.SHULKER_BOX).pushReaction(PushReaction.BLOCK).mapColor(MAP_COLORS.get("amber"))), CreativeModeTabs.COLORED_BLOCKS, CompatUtil.Mods.DYE_DEPOT);
	public static final DeferredBlock<Block> AQUA_SHULKER_SWIRL = HELPER.createBlock("aqua_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.SHULKER_BOX).pushReaction(PushReaction.BLOCK).mapColor(MAP_COLORS.get("aqua"))), CreativeModeTabs.COLORED_BLOCKS, CompatUtil.Mods.DYE_DEPOT);
	public static final DeferredBlock<Block> BEIGE_SHULKER_SWIRL = HELPER.createBlock("beige_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.SHULKER_BOX).pushReaction(PushReaction.BLOCK).mapColor(MAP_COLORS.get("beige"))), CreativeModeTabs.COLORED_BLOCKS, CompatUtil.Mods.DYE_DEPOT);
	public static final DeferredBlock<Block> CORAL_SHULKER_SWIRL = HELPER.createBlock("coral_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.SHULKER_BOX).pushReaction(PushReaction.BLOCK).mapColor(MAP_COLORS.get("coral"))), CreativeModeTabs.COLORED_BLOCKS, CompatUtil.Mods.DYE_DEPOT);
	public static final DeferredBlock<Block> FOREST_SHULKER_SWIRL = HELPER.createBlock("forest_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.SHULKER_BOX).pushReaction(PushReaction.BLOCK).mapColor(MAP_COLORS.get("forest"))), CreativeModeTabs.COLORED_BLOCKS, CompatUtil.Mods.DYE_DEPOT);
	public static final DeferredBlock<Block> GINGER_SHULKER_SWIRL = HELPER.createBlock("ginger_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.SHULKER_BOX).pushReaction(PushReaction.BLOCK).mapColor(MAP_COLORS.get("ginger"))), CreativeModeTabs.COLORED_BLOCKS, CompatUtil.Mods.DYE_DEPOT);
	public static final DeferredBlock<Block> INDIGO_SHULKER_SWIRL = HELPER.createBlock("indigo_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.SHULKER_BOX).pushReaction(PushReaction.BLOCK).mapColor(MAP_COLORS.get("indigo"))), CreativeModeTabs.COLORED_BLOCKS, CompatUtil.Mods.DYE_DEPOT);
	public static final DeferredBlock<Block> MAROON_SHULKER_SWIRL = HELPER.createBlock("maroon_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.SHULKER_BOX).pushReaction(PushReaction.BLOCK).mapColor(MAP_COLORS.get("maroon"))), CreativeModeTabs.COLORED_BLOCKS, CompatUtil.Mods.DYE_DEPOT);
	public static final DeferredBlock<Block> MINT_SHULKER_SWIRL = HELPER.createBlock("mint_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.SHULKER_BOX).pushReaction(PushReaction.BLOCK).mapColor(MAP_COLORS.get("mint"))), CreativeModeTabs.COLORED_BLOCKS, CompatUtil.Mods.DYE_DEPOT);
	public static final DeferredBlock<Block> NAVY_SHULKER_SWIRL = HELPER.createBlock("navy_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.SHULKER_BOX).pushReaction(PushReaction.BLOCK).mapColor(MAP_COLORS.get("navy"))), CreativeModeTabs.COLORED_BLOCKS, CompatUtil.Mods.DYE_DEPOT);
	public static final DeferredBlock<Block> OLIVE_SHULKER_SWIRL = HELPER.createBlock("olive_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.SHULKER_BOX).pushReaction(PushReaction.BLOCK).mapColor(MAP_COLORS.get("olive"))), CreativeModeTabs.COLORED_BLOCKS, CompatUtil.Mods.DYE_DEPOT);
	public static final DeferredBlock<Block> ROSE_SHULKER_SWIRL = HELPER.createBlock("rose_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.SHULKER_BOX).pushReaction(PushReaction.BLOCK).mapColor(MAP_COLORS.get("rose"))), CreativeModeTabs.COLORED_BLOCKS, CompatUtil.Mods.DYE_DEPOT);
	public static final DeferredBlock<Block> SLATE_SHULKER_SWIRL = HELPER.createBlock("slate_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.SHULKER_BOX).pushReaction(PushReaction.BLOCK).mapColor(MAP_COLORS.get("slate"))), CreativeModeTabs.COLORED_BLOCKS, CompatUtil.Mods.DYE_DEPOT);
	public static final DeferredBlock<Block> TAN_SHULKER_SWIRL = HELPER.createBlock("tan_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.SHULKER_BOX).pushReaction(PushReaction.BLOCK).mapColor(MAP_COLORS.get("tan"))), CreativeModeTabs.COLORED_BLOCKS, CompatUtil.Mods.DYE_DEPOT);
	public static final DeferredBlock<Block> TEAL_SHULKER_SWIRL = HELPER.createBlock("teal_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.SHULKER_BOX).pushReaction(PushReaction.BLOCK).mapColor(MAP_COLORS.get("teal"))), CreativeModeTabs.COLORED_BLOCKS, CompatUtil.Mods.DYE_DEPOT);
	public static final DeferredBlock<Block> VERDANT_SHULKER_SWIRL = HELPER.createBlock("verdant_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.SHULKER_BOX).pushReaction(PushReaction.BLOCK).mapColor(MAP_COLORS.get("verdant"))), CreativeModeTabs.COLORED_BLOCKS, CompatUtil.Mods.DYE_DEPOT);

	public static final List<DeferredBlock<Block>> DYE_DEPOT_BLOCKS = List.of(AMBER_SHULKER_BLOCK, AQUA_SHULKER_BLOCK, BEIGE_SHULKER_BLOCK, CORAL_SHULKER_BLOCK, FOREST_SHULKER_BLOCK, GINGER_SHULKER_BLOCK,
			INDIGO_SHULKER_BLOCK, MAROON_SHULKER_BLOCK, MINT_SHULKER_BLOCK, NAVY_SHULKER_BLOCK, OLIVE_SHULKER_BLOCK, ROSE_SHULKER_BLOCK, SLATE_SHULKER_BLOCK, TAN_SHULKER_BLOCK, TEAL_SHULKER_BLOCK, VERDANT_SHULKER_BLOCK);

	public static final List<DeferredBlock<Block>> DYE_DEPOT_SWIRLS = List.of(AMBER_SHULKER_SWIRL, AQUA_SHULKER_SWIRL, BEIGE_SHULKER_SWIRL, CORAL_SHULKER_SWIRL, FOREST_SHULKER_SWIRL, GINGER_SHULKER_SWIRL,
			INDIGO_SHULKER_SWIRL, MAROON_SHULKER_SWIRL, MINT_SHULKER_SWIRL, NAVY_SHULKER_SWIRL, OLIVE_SHULKER_SWIRL, ROSE_SHULKER_SWIRL, SLATE_SHULKER_SWIRL, TAN_SHULKER_SWIRL, TEAL_SHULKER_SWIRL, VERDANT_SHULKER_SWIRL);

}
