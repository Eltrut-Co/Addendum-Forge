package co.eltrut.addendum.core.registry;

import co.eltrut.addendum.core.Addendum;
import co.eltrut.differentiate.common.block.DifferStairsBlock;
import co.eltrut.differentiate.common.block.VerticalSlabBlock;
import co.eltrut.differentiate.core.registrator.BlockHelper;
import co.eltrut.differentiate.core.util.CompatUtil.Mods;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = Addendum.MOD_ID, bus = Bus.MOD)
public class AddendumBlocks {
	public static final BlockHelper HELPER = Addendum.REGISTRATOR.getHelper(ForgeRegistries.BLOCKS);
	
	// End Stone
	public static final RegistryObject<Block> END_STONE_SLAB = HELPER.createSimpleBlock("end_stone_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.END_STONE)), ItemGroup.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> END_STONE_STAIRS = HELPER.createSimpleBlock("end_stone_stairs", () -> new DifferStairsBlock(Blocks.END_STONE::defaultBlockState, Block.Properties.copy(Blocks.END_STONE)), ItemGroup.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> END_STONE_WALL = HELPER.createSimpleBlock("end_stone_wall", () -> new WallBlock(Block.Properties.copy(Blocks.END_STONE)), ItemGroup.TAB_DECORATIONS);
	public static final RegistryObject<Block> END_STONE_VERTICAL_SLAB = HELPER.createSimpleBlock("end_stone_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.END_STONE)), ItemGroup.TAB_BUILDING_BLOCKS, Mods.QUARK);
	
	public static final RegistryObject<Block> POLISHED_END_STONE = HELPER.createSimpleBlock("polished_end_stone", () -> new Block(Block.Properties.copy(Blocks.END_STONE)), ItemGroup.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> POLISHED_END_STONE_SLAB = HELPER.createSimpleBlock("polished_end_stone_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.END_STONE)), ItemGroup.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> POLISHED_END_STONE_STAIRS = HELPER.createSimpleBlock("polished_end_stone_stairs", () -> new DifferStairsBlock(POLISHED_END_STONE.get()::defaultBlockState, Block.Properties.copy(Blocks.END_STONE)), ItemGroup.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> POLISHED_END_STONE_WALL = HELPER.createSimpleBlock("polished_end_stone_wall", () -> new WallBlock(Block.Properties.copy(Blocks.END_STONE)), ItemGroup.TAB_DECORATIONS);
	public static final RegistryObject<Block> POLISHED_END_STONE_VERTICAL_SLAB = HELPER.createSimpleBlock("polished_end_stone_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.END_STONE)), ItemGroup.TAB_BUILDING_BLOCKS, Mods.QUARK);
	
	public static final RegistryObject<Block> CHORUSY_END_STONE_BRICKS = HELPER.createSimpleBlock("chorusy_end_stone_bricks", () -> new Block(Block.Properties.copy(Blocks.END_STONE_BRICKS)), ItemGroup.TAB_BUILDING_BLOCKS);
	
	// Purpur
	public static final RegistryObject<Block> PURPUR_BRICKS = HELPER.createSimpleBlock("purpur_bricks", () -> new Block(Block.Properties.copy(Blocks.PURPUR_BLOCK)), ItemGroup.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> PURPUR_BRICK_SLAB = HELPER.createSimpleBlock("purpur_brick_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.PURPUR_BLOCK)), ItemGroup.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> PURPUR_BRICK_STAIRS = HELPER.createSimpleBlock("purpur_brick_stairs", () -> new DifferStairsBlock(PURPUR_BRICKS.get()::defaultBlockState, Block.Properties.copy(Blocks.PURPUR_BLOCK)), ItemGroup.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> PURPUR_BRICK_WALL = HELPER.createSimpleBlock("purpur_brick_wall", () -> new WallBlock(Block.Properties.copy(Blocks.PURPUR_BLOCK)), ItemGroup.TAB_DECORATIONS);
	public static final RegistryObject<Block> PURPUR_BRICK_VERTICAL_SLAB = HELPER.createSimpleBlock("purpur_brick_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.PURPUR_BLOCK)), ItemGroup.TAB_BUILDING_BLOCKS, Mods.QUARK);
	
	public static final RegistryObject<Block> CHISELED_PURPUR_BRICKS = HELPER.createSimpleBlock("chiseled_purpur_bricks", () -> new Block(Block.Properties.copy(Blocks.PURPUR_BLOCK)), ItemGroup.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> POPPED_CHORUS_FRUIT_BLOCK = HELPER.createSimpleBlock("popped_chorus_fruit_block", () -> new Block(Block.Properties.copy(Blocks.MAGENTA_WOOL)), ItemGroup.TAB_DECORATIONS);
	
	// Midori
	public static final RegistryObject<Block> MIDORI_BRICKS = HELPER.createSimpleBlock("midori_bricks", () -> new Block(Properties.MIDORI), ItemGroup.TAB_BUILDING_BLOCKS, Mods.QUARK);
	public static final RegistryObject<Block> MIDORI_BRICK_SLAB = HELPER.createSimpleBlock("midori_brick_slab", () -> new SlabBlock(Properties.MIDORI), ItemGroup.TAB_BUILDING_BLOCKS, Mods.QUARK);
	public static final RegistryObject<Block> MIDORI_BRICK_STAIRS = HELPER.createSimpleBlock("midori_brick_stairs", () -> new DifferStairsBlock(MIDORI_BRICKS.get()::defaultBlockState, Properties.MIDORI), ItemGroup.TAB_BUILDING_BLOCKS, Mods.QUARK);
	public static final RegistryObject<Block> MIDORI_BRICK_WALL = HELPER.createSimpleBlock("midori_brick_wall", () -> new WallBlock(Properties.MIDORI), ItemGroup.TAB_DECORATIONS, Mods.QUARK);
	public static final RegistryObject<Block> MIDORI_BRICK_VERTICAL_SLAB = HELPER.createSimpleBlock("midori_brick_vertical_slab", () -> new VerticalSlabBlock(Properties.MIDORI), ItemGroup.TAB_BUILDING_BLOCKS, Mods.QUARK);
	
	public static final RegistryObject<Block> CHISELED_MIDORI_BRICKS = HELPER.createSimpleBlock("chiseled_midori_bricks", () -> new Block(Properties.MIDORI), ItemGroup.TAB_BUILDING_BLOCKS, Mods.QUARK);
	public static final RegistryObject<Block> CACTUS_PASTE_BLOCK = HELPER.createSimpleBlock("cactus_paste_block", () -> new Block(Block.Properties.copy(Blocks.LIME_WOOL)), ItemGroup.TAB_DECORATIONS, Mods.QUARK);
	
	// Himmel
	public static final RegistryObject<Block> HIMMEL_BRICKS = HELPER.createSimpleBlock("himmel_bricks", () -> new Block(Block.Properties.copy(Blocks.PURPUR_BLOCK)), ItemGroup.TAB_BUILDING_BLOCKS, Mods.OUTER_END);
	public static final RegistryObject<Block> HIMMEL_BRICK_SLAB = HELPER.createSimpleBlock("himmel_brick_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.PURPUR_BLOCK)), ItemGroup.TAB_BUILDING_BLOCKS, Mods.OUTER_END);
	public static final RegistryObject<Block> HIMMEL_BRICK_STAIRS = HELPER.createSimpleBlock("himmel_brick_stairs", () -> new DifferStairsBlock(HIMMEL_BRICKS.get()::defaultBlockState, Block.Properties.copy(Blocks.PURPUR_BLOCK)), ItemGroup.TAB_BUILDING_BLOCKS, Mods.OUTER_END);
	public static final RegistryObject<Block> HIMMEL_BRICK_WALL = HELPER.createSimpleBlock("himmel_brick_wall", () -> new WallBlock(Block.Properties.copy(Blocks.PURPUR_BLOCK)), ItemGroup.TAB_DECORATIONS, Mods.OUTER_END);
	public static final RegistryObject<Block> HIMMEL_BRICK_VERTICAL_SLAB = HELPER.createSimpleBlock("himmel_brick_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.copy(Blocks.PURPUR_BLOCK)), ItemGroup.TAB_BUILDING_BLOCKS, Mods.OUTER_END, Mods.QUARK);
	
	public static final RegistryObject<Block> CHISELED_HIMMEL_BRICKS = HELPER.createSimpleBlock("chiseled_himmel_bricks", () -> new Block(Block.Properties.copy(Blocks.PURPUR_BLOCK)), ItemGroup.TAB_BUILDING_BLOCKS, Mods.OUTER_END);
	public static final RegistryObject<Block> FLORAL_PASTE_BLOCK = HELPER.createSimpleBlock("floral_paste_block", () -> new Block(Block.Properties.copy(Blocks.CYAN_WOOL)), ItemGroup.TAB_DECORATIONS, Mods.OUTER_END);
	
	// Shulker
	public static final RegistryObject<Block> SHULKER_BLOCK = HELPER.createSimpleBlock("shulker_block", () -> new Block(Block.Properties.copy(Blocks.SHULKER_BOX)), ItemGroup.TAB_DECORATIONS);
	public static final RegistryObject<Block> SHULKER_SWIRL = HELPER.createSimpleBlock("shulker_swirl", () -> new Block(Block.Properties.copy(Blocks.SHULKER_BOX)), ItemGroup.TAB_DECORATIONS);
	
	public static final RegistryObject<Block> WHITE_SHULKER_BLOCK = HELPER.createSimpleBlock("white_shulker_block", () -> new Block(Block.Properties.copy(Blocks.WHITE_SHULKER_BOX)), ItemGroup.TAB_DECORATIONS);
	public static final RegistryObject<Block> WHITE_SHULKER_SWIRL = HELPER.createSimpleBlock("white_shulker_swirl", () -> new Block(Block.Properties.copy(Blocks.WHITE_SHULKER_BOX)), ItemGroup.TAB_DECORATIONS);
	public static final RegistryObject<Block> ORANGE_SHULKER_BLOCK = HELPER.createSimpleBlock("orange_shulker_block", () -> new Block(Block.Properties.copy(Blocks.ORANGE_SHULKER_BOX)), ItemGroup.TAB_DECORATIONS);
	public static final RegistryObject<Block> ORANGE_SHULKER_SWIRL = HELPER.createSimpleBlock("orange_shulker_swirl", () -> new Block(Block.Properties.copy(Blocks.ORANGE_SHULKER_BOX)), ItemGroup.TAB_DECORATIONS);
	public static final RegistryObject<Block> MAGENTA_SHULKER_BLOCK = HELPER.createSimpleBlock("magenta_shulker_block", () -> new Block(Block.Properties.copy(Blocks.MAGENTA_SHULKER_BOX)), ItemGroup.TAB_DECORATIONS);
	public static final RegistryObject<Block> MAGENTA_SHULKER_SWIRL = HELPER.createSimpleBlock("magenta_shulker_swirl", () -> new Block(Block.Properties.copy(Blocks.MAGENTA_SHULKER_BOX)), ItemGroup.TAB_DECORATIONS);
	public static final RegistryObject<Block> LIGHT_BLUE_SHULKER_BLOCK = HELPER.createSimpleBlock("light_blue_shulker_block", () -> new Block(Block.Properties.copy(Blocks.LIGHT_BLUE_SHULKER_BOX)), ItemGroup.TAB_DECORATIONS);
	public static final RegistryObject<Block> LIGHT_BLUE_SHULKER_SWIRL = HELPER.createSimpleBlock("light_blue_shulker_swirl", () -> new Block(Block.Properties.copy(Blocks.LIGHT_BLUE_SHULKER_BOX)), ItemGroup.TAB_DECORATIONS);
	public static final RegistryObject<Block> YELLOW_SHULKER_BLOCK = HELPER.createSimpleBlock("yellow_shulker_block", () -> new Block(Block.Properties.copy(Blocks.YELLOW_SHULKER_BOX)), ItemGroup.TAB_DECORATIONS);
	public static final RegistryObject<Block> YELLOW_SHULKER_SWIRL = HELPER.createSimpleBlock("yellow_shulker_swirl", () -> new Block(Block.Properties.copy(Blocks.YELLOW_SHULKER_BOX)), ItemGroup.TAB_DECORATIONS);
	public static final RegistryObject<Block> LIME_SHULKER_BLOCK = HELPER.createSimpleBlock("lime_shulker_block", () -> new Block(Block.Properties.copy(Blocks.LIME_SHULKER_BOX)), ItemGroup.TAB_DECORATIONS);
	public static final RegistryObject<Block> LIME_SHULKER_SWIRL = HELPER.createSimpleBlock("lime_shulker_swirl", () -> new Block(Block.Properties.copy(Blocks.LIME_SHULKER_BOX)), ItemGroup.TAB_DECORATIONS);
	public static final RegistryObject<Block> PINK_SHULKER_BLOCK = HELPER.createSimpleBlock("pink_shulker_block", () -> new Block(Block.Properties.copy(Blocks.PINK_SHULKER_BOX)), ItemGroup.TAB_DECORATIONS);
	public static final RegistryObject<Block> PINK_SHULKER_SWIRL = HELPER.createSimpleBlock("pink_shulker_swirl", () -> new Block(Block.Properties.copy(Blocks.PINK_SHULKER_BOX)), ItemGroup.TAB_DECORATIONS);
	public static final RegistryObject<Block> GRAY_SHULKER_BLOCK = HELPER.createSimpleBlock("gray_shulker_block", () -> new Block(Block.Properties.copy(Blocks.GRAY_SHULKER_BOX)), ItemGroup.TAB_DECORATIONS);
	public static final RegistryObject<Block> GRAY_SHULKER_SWIRL = HELPER.createSimpleBlock("gray_shulker_swirl", () -> new Block(Block.Properties.copy(Blocks.GRAY_SHULKER_BOX)), ItemGroup.TAB_DECORATIONS);
	public static final RegistryObject<Block> LIGHT_GRAY_SHULKER_BLOCK = HELPER.createSimpleBlock("light_gray_shulker_block", () -> new Block(Block.Properties.copy(Blocks.LIGHT_GRAY_SHULKER_BOX)), ItemGroup.TAB_DECORATIONS);
	public static final RegistryObject<Block> LIGHT_GRAY_SHULKER_SWIRL = HELPER.createSimpleBlock("light_gray_shulker_swirl", () -> new Block(Block.Properties.copy(Blocks.LIGHT_GRAY_SHULKER_BOX)), ItemGroup.TAB_DECORATIONS);
	public static final RegistryObject<Block> CYAN_SHULKER_BLOCK = HELPER.createSimpleBlock("cyan_shulker_block", () -> new Block(Block.Properties.copy(Blocks.CYAN_SHULKER_BOX)), ItemGroup.TAB_DECORATIONS);
	public static final RegistryObject<Block> CYAN_SHULKER_SWIRL = HELPER.createSimpleBlock("cyan_shulker_swirl", () -> new Block(Block.Properties.copy(Blocks.CYAN_SHULKER_BOX)), ItemGroup.TAB_DECORATIONS);
	public static final RegistryObject<Block> PURPLE_SHULKER_BLOCK = HELPER.createSimpleBlock("purple_shulker_block", () -> new Block(Block.Properties.copy(Blocks.PURPLE_SHULKER_BOX)), ItemGroup.TAB_DECORATIONS);
	public static final RegistryObject<Block> PURPLE_SHULKER_SWIRL = HELPER.createSimpleBlock("purple_shulker_swirl", () -> new Block(Block.Properties.copy(Blocks.PURPLE_SHULKER_BOX)), ItemGroup.TAB_DECORATIONS);
	public static final RegistryObject<Block> BLUE_SHULKER_BLOCK = HELPER.createSimpleBlock("blue_shulker_block", () -> new Block(Block.Properties.copy(Blocks.BLUE_SHULKER_BOX)), ItemGroup.TAB_DECORATIONS);
	public static final RegistryObject<Block> BLUE_SHULKER_SWIRL = HELPER.createSimpleBlock("blue_shulker_swirl", () -> new Block(Block.Properties.copy(Blocks.BLUE_SHULKER_BOX)), ItemGroup.TAB_DECORATIONS);
	public static final RegistryObject<Block> BROWN_SHULKER_BLOCK = HELPER.createSimpleBlock("brown_shulker_block", () -> new Block(Block.Properties.copy(Blocks.BROWN_SHULKER_BOX)), ItemGroup.TAB_DECORATIONS);
	public static final RegistryObject<Block> BROWN_SHULKER_SWIRL = HELPER.createSimpleBlock("brown_shulker_swirl", () -> new Block(Block.Properties.copy(Blocks.BROWN_SHULKER_BOX)), ItemGroup.TAB_DECORATIONS);
	public static final RegistryObject<Block> GREEN_SHULKER_BLOCK = HELPER.createSimpleBlock("green_shulker_block", () -> new Block(Block.Properties.copy(Blocks.GREEN_SHULKER_BOX)), ItemGroup.TAB_DECORATIONS);
	public static final RegistryObject<Block> GREEN_SHULKER_SWIRL = HELPER.createSimpleBlock("green_shulker_swirl", () -> new Block(Block.Properties.copy(Blocks.GREEN_SHULKER_BOX)), ItemGroup.TAB_DECORATIONS);
	public static final RegistryObject<Block> RED_SHULKER_BLOCK = HELPER.createSimpleBlock("red_shulker_block", () -> new Block(Block.Properties.copy(Blocks.RED_SHULKER_BOX)), ItemGroup.TAB_DECORATIONS);
	public static final RegistryObject<Block> RED_SHULKER_SWIRL = HELPER.createSimpleBlock("red_shulker_swirl", () -> new Block(Block.Properties.copy(Blocks.RED_SHULKER_BOX)), ItemGroup.TAB_DECORATIONS);
	public static final RegistryObject<Block> BLACK_SHULKER_BLOCK = HELPER.createSimpleBlock("black_shulker_block", () -> new Block(Block.Properties.copy(Blocks.BLACK_SHULKER_BOX)), ItemGroup.TAB_DECORATIONS);
	public static final RegistryObject<Block> BLACK_SHULKER_SWIRL = HELPER.createSimpleBlock("black_shulker_swirl", () -> new Block(Block.Properties.copy(Blocks.BLACK_SHULKER_BOX)), ItemGroup.TAB_DECORATIONS);
	
	public static class Properties {
		public static final Block.Properties MIDORI = Block.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GREEN).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).strength(1.5F, 6.0F);
	}
	
}
