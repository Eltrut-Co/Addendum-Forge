package co.eltrut.addendum.core.registry;

import co.eltrut.addendum.core.Addendum;
import co.eltrut.differentiate.common.block.VerticalSlabBlock;
import co.eltrut.differentiate.common.repo.VariantBlocksRepo;
import co.eltrut.differentiate.core.registrator.BlockHelper;
import co.eltrut.differentiate.core.util.BlockUtil;
import co.eltrut.differentiate.core.util.CompatUtil.Mods;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = Addendum.MOD_ID, bus = Bus.MOD)
public class AddendumBlocks {
	public static final BlockHelper HELPER = Addendum.REGISTRATOR.getHelper(ForgeRegistries.BLOCKS);

	// Vanilla
	public static final VariantBlocksRepo END_STONE = HELPER.createSimpleVariants(Blocks.END_STONE);
	public static final VariantBlocksRepo POLISHED_END_STONE = HELPER.createSimpleBlockWithVariants("polished_end_stone", Block.Properties.copy(Blocks.END_STONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> CHORUSY_END_STONE_BRICKS = HELPER.createSimpleBlock("chorusy_end_stone_bricks", () -> new Block(Block.Properties.copy(Blocks.END_STONE_BRICKS)), CreativeModeTab.TAB_BUILDING_BLOCKS);

	public static final VariantBlocksRepo PURPUR_BRICKS = HELPER.createSimpleBlockWithVariants("purpur_bricks", BlockBehaviour.Properties.copy(Blocks.PURPUR_BLOCK), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> CHISELED_PURPUR_BRICKS = HELPER.createSimpleBlock("chiseled_purpur_bricks", () -> new Block(Block.Properties.copy(Blocks.PURPUR_BLOCK)), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> POPPED_CHORUS_FRUIT_BLOCK = HELPER.createSimpleBlock("popped_chorus_fruit_block", () -> new Block(Block.Properties.copy(Blocks.MAGENTA_WOOL)), CreativeModeTab.TAB_DECORATIONS);

	public static final RegistryObject<Block> SHULKER_BLOCK = HELPER.createSimpleBlock("shulker_block", () -> new Block(Block.Properties.copy(Blocks.SHULKER_BOX)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> SHULKER_SWIRL = HELPER.createSimpleBlock("shulker_swirl", () -> new Block(Block.Properties.copy(Blocks.SHULKER_BOX)), CreativeModeTab.TAB_DECORATIONS);

	public static final RegistryObject<Block> WHITE_SHULKER_BLOCK = HELPER.createSimpleBlock("white_shulker_block", () -> new Block(Block.Properties.copy(Blocks.WHITE_SHULKER_BOX)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> WHITE_SHULKER_SWIRL = HELPER.createSimpleBlock("white_shulker_swirl", () -> new Block(Block.Properties.copy(Blocks.WHITE_SHULKER_BOX)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> ORANGE_SHULKER_BLOCK = HELPER.createSimpleBlock("orange_shulker_block", () -> new Block(Block.Properties.copy(Blocks.ORANGE_SHULKER_BOX)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> ORANGE_SHULKER_SWIRL = HELPER.createSimpleBlock("orange_shulker_swirl", () -> new Block(Block.Properties.copy(Blocks.ORANGE_SHULKER_BOX)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> MAGENTA_SHULKER_BLOCK = HELPER.createSimpleBlock("magenta_shulker_block", () -> new Block(Block.Properties.copy(Blocks.MAGENTA_SHULKER_BOX)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> MAGENTA_SHULKER_SWIRL = HELPER.createSimpleBlock("magenta_shulker_swirl", () -> new Block(Block.Properties.copy(Blocks.MAGENTA_SHULKER_BOX)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> LIGHT_BLUE_SHULKER_BLOCK = HELPER.createSimpleBlock("light_blue_shulker_block", () -> new Block(Block.Properties.copy(Blocks.LIGHT_BLUE_SHULKER_BOX)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> LIGHT_BLUE_SHULKER_SWIRL = HELPER.createSimpleBlock("light_blue_shulker_swirl", () -> new Block(Block.Properties.copy(Blocks.LIGHT_BLUE_SHULKER_BOX)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> YELLOW_SHULKER_BLOCK = HELPER.createSimpleBlock("yellow_shulker_block", () -> new Block(Block.Properties.copy(Blocks.YELLOW_SHULKER_BOX)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> YELLOW_SHULKER_SWIRL = HELPER.createSimpleBlock("yellow_shulker_swirl", () -> new Block(Block.Properties.copy(Blocks.YELLOW_SHULKER_BOX)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> LIME_SHULKER_BLOCK = HELPER.createSimpleBlock("lime_shulker_block", () -> new Block(Block.Properties.copy(Blocks.LIME_SHULKER_BOX)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> LIME_SHULKER_SWIRL = HELPER.createSimpleBlock("lime_shulker_swirl", () -> new Block(Block.Properties.copy(Blocks.LIME_SHULKER_BOX)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> PINK_SHULKER_BLOCK = HELPER.createSimpleBlock("pink_shulker_block", () -> new Block(Block.Properties.copy(Blocks.PINK_SHULKER_BOX)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> PINK_SHULKER_SWIRL = HELPER.createSimpleBlock("pink_shulker_swirl", () -> new Block(Block.Properties.copy(Blocks.PINK_SHULKER_BOX)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> GRAY_SHULKER_BLOCK = HELPER.createSimpleBlock("gray_shulker_block", () -> new Block(Block.Properties.copy(Blocks.GRAY_SHULKER_BOX)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> GRAY_SHULKER_SWIRL = HELPER.createSimpleBlock("gray_shulker_swirl", () -> new Block(Block.Properties.copy(Blocks.GRAY_SHULKER_BOX)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> LIGHT_GRAY_SHULKER_BLOCK = HELPER.createSimpleBlock("light_gray_shulker_block", () -> new Block(Block.Properties.copy(Blocks.LIGHT_GRAY_SHULKER_BOX)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> LIGHT_GRAY_SHULKER_SWIRL = HELPER.createSimpleBlock("light_gray_shulker_swirl", () -> new Block(Block.Properties.copy(Blocks.LIGHT_GRAY_SHULKER_BOX)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> CYAN_SHULKER_BLOCK = HELPER.createSimpleBlock("cyan_shulker_block", () -> new Block(Block.Properties.copy(Blocks.CYAN_SHULKER_BOX)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> CYAN_SHULKER_SWIRL = HELPER.createSimpleBlock("cyan_shulker_swirl", () -> new Block(Block.Properties.copy(Blocks.CYAN_SHULKER_BOX)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> PURPLE_SHULKER_BLOCK = HELPER.createSimpleBlock("purple_shulker_block", () -> new Block(Block.Properties.copy(Blocks.PURPLE_SHULKER_BOX)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> PURPLE_SHULKER_SWIRL = HELPER.createSimpleBlock("purple_shulker_swirl", () -> new Block(Block.Properties.copy(Blocks.PURPLE_SHULKER_BOX)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> BLUE_SHULKER_BLOCK = HELPER.createSimpleBlock("blue_shulker_block", () -> new Block(Block.Properties.copy(Blocks.BLUE_SHULKER_BOX)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> BLUE_SHULKER_SWIRL = HELPER.createSimpleBlock("blue_shulker_swirl", () -> new Block(Block.Properties.copy(Blocks.BLUE_SHULKER_BOX)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> BROWN_SHULKER_BLOCK = HELPER.createSimpleBlock("brown_shulker_block", () -> new Block(Block.Properties.copy(Blocks.BROWN_SHULKER_BOX)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> BROWN_SHULKER_SWIRL = HELPER.createSimpleBlock("brown_shulker_swirl", () -> new Block(Block.Properties.copy(Blocks.BROWN_SHULKER_BOX)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> GREEN_SHULKER_BLOCK = HELPER.createSimpleBlock("green_shulker_block", () -> new Block(Block.Properties.copy(Blocks.GREEN_SHULKER_BOX)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> GREEN_SHULKER_SWIRL = HELPER.createSimpleBlock("green_shulker_swirl", () -> new Block(Block.Properties.copy(Blocks.GREEN_SHULKER_BOX)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> RED_SHULKER_BLOCK = HELPER.createSimpleBlock("red_shulker_block", () -> new Block(Block.Properties.copy(Blocks.RED_SHULKER_BOX)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> RED_SHULKER_SWIRL = HELPER.createSimpleBlock("red_shulker_swirl", () -> new Block(Block.Properties.copy(Blocks.RED_SHULKER_BOX)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> BLACK_SHULKER_BLOCK = HELPER.createSimpleBlock("black_shulker_block", () -> new Block(Block.Properties.copy(Blocks.BLACK_SHULKER_BOX)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> BLACK_SHULKER_SWIRL = HELPER.createSimpleBlock("black_shulker_swirl", () -> new Block(Block.Properties.copy(Blocks.BLACK_SHULKER_BOX)), CreativeModeTab.TAB_DECORATIONS);

	// Compat
	public static final VariantBlocksRepo MIDORI_BRICKS = HELPER.createSimpleBlockWithVariants("midori_bricks", BlockUtil.QuarkProperties.MIDORI, CreativeModeTab.TAB_BUILDING_BLOCKS, Mods.QUARK);
	public static final RegistryObject<Block> CHISELED_MIDORI_BRICKS = HELPER.createSimpleBlock("chiseled_midori_bricks", () -> new Block(BlockUtil.QuarkProperties.MIDORI), CreativeModeTab.TAB_BUILDING_BLOCKS, Mods.QUARK);
	public static final RegistryObject<Block> MOSS_PASTE_BLOCK = HELPER.createSimpleBlock("moss_paste_block", () -> new Block(Block.Properties.copy(Blocks.LIME_WOOL)), CreativeModeTab.TAB_DECORATIONS, Mods.QUARK);

	public static final VariantBlocksRepo HIMMEL_BRICKS = HELPER.createSimpleBlockWithVariants("himmel_bricks", BlockBehaviour.Properties.copy(Blocks.PURPUR_BLOCK), CreativeModeTab.TAB_BUILDING_BLOCKS, Mods.OUTER_END);
	public static final RegistryObject<Block> CHISELED_HIMMEL_BRICKS = HELPER.createSimpleBlock("chiseled_himmel_bricks", () -> new Block(Block.Properties.copy(Blocks.PURPUR_BLOCK)), CreativeModeTab.TAB_BUILDING_BLOCKS, Mods.OUTER_END);
	public static final RegistryObject<Block> FLORAL_PASTE_BLOCK = HELPER.createSimpleBlock("floral_paste_block", () -> new Block(Block.Properties.copy(Blocks.CYAN_WOOL)), CreativeModeTab.TAB_DECORATIONS, Mods.OUTER_END);

}
