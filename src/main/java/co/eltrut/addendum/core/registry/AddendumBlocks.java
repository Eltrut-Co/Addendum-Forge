package co.eltrut.addendum.core.registry;

import co.eltrut.addendum.core.Addendum;
import co.eltrut.differentiate.common.repo.VariantBlocksRepo;
import co.eltrut.differentiate.core.event.LoadEvent;
import co.eltrut.differentiate.core.registrator.BlockHelper;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.registries.DeferredBlock;

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
	public static final DeferredBlock<Block> POPPED_CHORUS_FRUIT_BLOCK = HELPER.createFollowBlock("popped_chorus_fruit_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.MAGENTA_WOOL)), CreativeModeTabs.NATURAL_BLOCKS, Addendum.MOD_ID, "chiseled_purpur_bricks");

	public static final DeferredBlock<Block> SHULKER_BLOCK = HELPER.createBlock("shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.SHULKER_BOX)), CreativeModeTabs.BUILDING_BLOCKS);
	public static final DeferredBlock<Block> SHULKER_SWIRL = HELPER.createBlock("shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.SHULKER_BOX)), CreativeModeTabs.BUILDING_BLOCKS);

	public static final DeferredBlock<Block> WHITE_SHULKER_BLOCK = HELPER.createBlock("white_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.WHITE_SHULKER_BOX)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> ORANGE_SHULKER_BLOCK = HELPER.createBlock("orange_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.ORANGE_SHULKER_BOX)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> MAGENTA_SHULKER_BLOCK = HELPER.createBlock("magenta_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.MAGENTA_SHULKER_BOX)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> LIGHT_BLUE_SHULKER_BLOCK = HELPER.createBlock("light_blue_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.LIGHT_BLUE_SHULKER_BOX)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> YELLOW_SHULKER_BLOCK = HELPER.createBlock("yellow_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.YELLOW_SHULKER_BOX)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> LIME_SHULKER_BLOCK = HELPER.createBlock("lime_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.LIME_SHULKER_BOX)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> PINK_SHULKER_BLOCK = HELPER.createBlock("pink_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.PINK_SHULKER_BOX)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> GRAY_SHULKER_BLOCK = HELPER.createBlock("gray_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.GRAY_SHULKER_BOX)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> LIGHT_GRAY_SHULKER_BLOCK = HELPER.createBlock("light_gray_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.LIGHT_GRAY_SHULKER_BOX)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> CYAN_SHULKER_BLOCK = HELPER.createBlock("cyan_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.CYAN_SHULKER_BOX)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> PURPLE_SHULKER_BLOCK = HELPER.createBlock("purple_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.PURPLE_SHULKER_BOX)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> BLUE_SHULKER_BLOCK = HELPER.createBlock("blue_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.BLUE_SHULKER_BOX)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> BROWN_SHULKER_BLOCK = HELPER.createBlock("brown_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.BROWN_SHULKER_BOX)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> GREEN_SHULKER_BLOCK = HELPER.createBlock("green_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.GREEN_SHULKER_BOX)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> RED_SHULKER_BLOCK = HELPER.createBlock("red_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.RED_SHULKER_BOX)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> BLACK_SHULKER_BLOCK = HELPER.createBlock("black_shulker_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.BLACK_SHULKER_BOX)), CreativeModeTabs.COLORED_BLOCKS);

	public static final DeferredBlock<Block> GRAY_SHULKER_SWIRL = HELPER.createBlock("gray_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.GRAY_SHULKER_BOX)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> WHITE_SHULKER_SWIRL = HELPER.createBlock("white_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.WHITE_SHULKER_BOX)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> ORANGE_SHULKER_SWIRL = HELPER.createBlock("orange_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.ORANGE_SHULKER_BOX)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> MAGENTA_SHULKER_SWIRL = HELPER.createBlock("magenta_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.MAGENTA_SHULKER_BOX)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> LIGHT_BLUE_SHULKER_SWIRL = HELPER.createBlock("light_blue_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.LIGHT_BLUE_SHULKER_BOX)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> YELLOW_SHULKER_SWIRL = HELPER.createBlock("yellow_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.YELLOW_SHULKER_BOX)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> LIME_SHULKER_SWIRL = HELPER.createBlock("lime_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.LIME_SHULKER_BOX)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> PINK_SHULKER_SWIRL = HELPER.createBlock("pink_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.PINK_SHULKER_BOX)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> LIGHT_GRAY_SHULKER_SWIRL = HELPER.createBlock("light_gray_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.LIGHT_GRAY_SHULKER_BOX)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> CYAN_SHULKER_SWIRL = HELPER.createBlock("cyan_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.CYAN_SHULKER_BOX)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> PURPLE_SHULKER_SWIRL = HELPER.createBlock("purple_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.PURPLE_SHULKER_BOX)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> BLUE_SHULKER_SWIRL = HELPER.createBlock("blue_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.BLUE_SHULKER_BOX)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> BROWN_SHULKER_SWIRL = HELPER.createBlock("brown_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.BROWN_SHULKER_BOX)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> GREEN_SHULKER_SWIRL = HELPER.createBlock("green_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.GREEN_SHULKER_BOX)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> RED_SHULKER_SWIRL = HELPER.createBlock("red_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.RED_SHULKER_BOX)), CreativeModeTabs.COLORED_BLOCKS);
	public static final DeferredBlock<Block> BLACK_SHULKER_SWIRL = HELPER.createBlock("black_shulker_swirl", () -> new Block(Block.Properties.ofFullCopy(Blocks.BLACK_SHULKER_BOX)), CreativeModeTabs.COLORED_BLOCKS);

	// Compat
//	public static final VariantBlocksRepo MIDORI_BRICKS = HELPER.createBlockWithVariants("midori_bricks", BlockUtil.QuarkProperties.MIDORI, CreativeModeTab.TAB_BUILDING_BLOCKS, Mods.QUARK);
//	public static final DeferredBlock<Block> CHISELED_MIDORI_BRICKS = HELPER.createBlock("chiseled_midori_bricks", () -> new Block(BlockUtil.QuarkProperties.MIDORI), CreativeModeTab.TAB_BUILDING_BLOCKS, Mods.QUARK);
//	public static final DeferredBlock<Block> MOSS_PASTE_BLOCK = HELPER.createBlock("moss_paste_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.LIME_WOOL)), CreativeModeTabs.COLORED_BLOCKS, Mods.QUARK);
//	
}
