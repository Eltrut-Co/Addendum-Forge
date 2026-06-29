package co.eltrut.addendum.core.registry;

import co.eltrut.addendum.common.block.*;
import co.eltrut.addendum.core.Addendum;
import co.eltrut.differentiate.common.repo.VariantBlocksRepo;
import co.eltrut.differentiate.core.event.LoadEvent;
import co.eltrut.differentiate.core.registrator.BlockHelper;
import co.eltrut.differentiate.core.util.BlockUtil;
import co.eltrut.differentiate.core.util.CompatUtil;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.function.ToIntFunction;

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

	public static final DeferredHolder<Block, Block> DRAGON_FIRE = HELPER.getDeferredRegister().register("dragon_fire", () -> new DragonFireBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).replaceable().noCollission().instabreak().lightLevel(state -> 10).sound(SoundType.WOOL).pushReaction(PushReaction.DESTROY)));
	public static final DeferredBlock<Block> DRAGON_CAMPFIRE = HELPER.createFollowBlock("dragon_campfire", () -> new DragonCampfireBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PODZOL).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).lightLevel(litBlockEmission()).noOcclusion().ignitedByLava()), CreativeModeTabs.FUNCTIONAL_BLOCKS, Blocks.SOUL_CAMPFIRE);
	public static final DeferredBlock<Block> DRAGON_LANTERN = HELPER.createFollowBlock("dragon_lantern", () -> new LanternBlock(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).forceSolidOn().requiresCorrectToolForDrops().strength(3.5F).sound(SoundType.LANTERN).lightLevel((p_187431_) -> 10).noOcclusion().pushReaction(PushReaction.DESTROY)), CreativeModeTabs.FUNCTIONAL_BLOCKS, Blocks.SOUL_LANTERN);
	public static final DeferredHolder<Block, Block> DRAGON_TORCH = HELPER.getDeferredRegister().register("dragon_torch", () -> new DragonTorchBlock(BlockBehaviour.Properties.of().noCollission().instabreak().lightLevel((p_50876_) -> 10).sound(SoundType.WOOD).pushReaction(PushReaction.DESTROY)));
	public static final DeferredHolder<Block, Block> DRAGON_WALL_TORCH = HELPER.getDeferredRegister().register("dragon_wall_torch", () -> new DragonWallTorchBlock(BlockBehaviour.Properties.of().noCollission().instabreak().lightLevel((p_50874_) -> 10).sound(SoundType.WOOD).pushReaction(PushReaction.DESTROY)));

	// Compat
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

	public static final DeferredBlock<Block> DRAGON_CANDLE = HELPER.createFollowBlock("dragon_candle", () -> new DragonCandleBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).noOcclusion().strength(0.1F).sound(SoundType.CANDLE).lightLevel(CandleBlock.LIGHT_EMISSION).pushReaction(PushReaction.DESTROY)), CreativeModeTabs.FUNCTIONAL_BLOCKS, Items.CANDLE, CompatUtil.Mods.BUZZIER_BEES);
	public static final DeferredHolder<Block, Block> DRAGON_CANDLE_CAKE = HELPER.getDeferredRegister().register("dragon_candle_cake", () -> new DragonCandleCakeBlock(DRAGON_CANDLE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.CANDLE_CAKE)));

	private static ToIntFunction<BlockState> litBlockEmission() {
		return (p_50763_) -> (Boolean)p_50763_.getValue(BlockStateProperties.LIT) ? 10 : 0;
	}

}
