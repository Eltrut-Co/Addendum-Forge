package eltrut.addendum.core.registry;

import com.minecraftabnormals.abnormals_core.common.blocks.AbnormalsStairsBlock;
import com.minecraftabnormals.abnormals_core.common.blocks.VerticalSlabBlock;
import com.minecraftabnormals.abnormals_core.core.util.registry.BlockSubRegistryHelper;

import eltrut.addendum.core.Addendum;
import eltrut.addendum.core.other.AddendumMods;
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

@Mod.EventBusSubscriber(modid = Addendum.MOD_ID, bus = Bus.MOD)
public class AddendumBlocks {
	public static final BlockSubRegistryHelper HELPER = Addendum.REGISTRY_HELPER.getBlockSubHelper();
	
	// End Stone
	public static final RegistryObject<Block> END_STONE_SLAB = HELPER.createBlock("end_stone_slab", () -> new SlabBlock(Block.Properties.from(Blocks.END_STONE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> END_STONE_STAIRS = HELPER.createBlock("end_stone_stairs", () -> new AbnormalsStairsBlock(Blocks.END_STONE.getDefaultState(), Block.Properties.from(Blocks.END_STONE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> END_STONE_WALL = HELPER.createBlock("end_stone_wall", () -> new WallBlock(Block.Properties.from(Blocks.END_STONE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> END_STONE_VERTICAL_SLAB = HELPER.createCompatBlock(AddendumMods.QUARK, "end_stone_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.END_STONE)), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> POLISHED_END_STONE = HELPER.createBlock("polished_end_stone", () -> new Block(Block.Properties.from(Blocks.END_STONE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> POLISHED_END_STONE_SLAB = HELPER.createBlock("polished_end_stone_slab", () -> new SlabBlock(Block.Properties.from(Blocks.END_STONE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> POLISHED_END_STONE_STAIRS = HELPER.createBlock("polished_end_stone_stairs", () -> new AbnormalsStairsBlock(POLISHED_END_STONE.get().getDefaultState(), Block.Properties.from(Blocks.END_STONE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> POLISHED_END_STONE_WALL = HELPER.createBlock("polished_end_stone_wall", () -> new WallBlock(Block.Properties.from(Blocks.END_STONE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> POLISHED_END_STONE_VERTICAL_SLAB = HELPER.createCompatBlock(AddendumMods.QUARK, "polished_end_stone_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.END_STONE)), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> CHORUSY_END_STONE_BRICKS = HELPER.createBlock("chorusy_end_stone_bricks", () -> new Block(Block.Properties.from(Blocks.END_STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	
	// Purpur
	public static final RegistryObject<Block> PURPUR_BRICKS = HELPER.createBlock("purpur_bricks", () -> new Block(Block.Properties.from(Blocks.PURPUR_BLOCK)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> PURPUR_BRICK_SLAB = HELPER.createBlock("purpur_brick_slab", () -> new SlabBlock(Block.Properties.from(Blocks.PURPUR_BLOCK)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> PURPUR_BRICK_STAIRS = HELPER.createBlock("purpur_brick_stairs", () -> new AbnormalsStairsBlock(PURPUR_BRICKS.get().getDefaultState(), Block.Properties.from(Blocks.PURPUR_BLOCK)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> PURPUR_BRICK_WALL = HELPER.createBlock("purpur_brick_wall", () -> new WallBlock(Block.Properties.from(Blocks.PURPUR_BLOCK)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PURPUR_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock(AddendumMods.QUARK, "purpur_brick_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.PURPUR_BLOCK)), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> CHISELED_PURPUR_BRICKS = HELPER.createBlock("chiseled_purpur_bricks", () -> new Block(Block.Properties.from(Blocks.PURPUR_BLOCK)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> POPPED_CHORUS_FRUIT_BLOCK = HELPER.createBlock("popped_chorus_fruit_block", () -> new Block(Block.Properties.from(Blocks.MAGENTA_WOOL)), ItemGroup.DECORATIONS);
	
	// Midori
	public static final RegistryObject<Block> MIDORI_BRICKS = HELPER.createCompatBlock(AddendumMods.QUARK, "midori_bricks", () -> new Block(Properties.MIDORI), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> MIDORI_BRICK_SLAB = HELPER.createCompatBlock(AddendumMods.QUARK, "midori_brick_slab", () -> new SlabBlock(Properties.MIDORI), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> MIDORI_BRICK_STAIRS = HELPER.createCompatBlock(AddendumMods.QUARK, "midori_brick_stairs", () -> new AbnormalsStairsBlock(MIDORI_BRICKS.get().getDefaultState(), Properties.MIDORI), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> MIDORI_BRICK_WALL = HELPER.createCompatBlock(AddendumMods.QUARK, "midori_brick_wall", () -> new WallBlock(Properties.MIDORI), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> MIDORI_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock(AddendumMods.QUARK, "midori_brick_vertical_slab", () -> new VerticalSlabBlock(Properties.MIDORI), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> CHISELED_MIDORI_BRICKS = HELPER.createCompatBlock(AddendumMods.QUARK, "chiseled_midori_bricks", () -> new Block(Properties.MIDORI), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CACTUS_PASTE_BLOCK = HELPER.createCompatBlock(AddendumMods.QUARK, "cactus_paste_block", () -> new Block(Block.Properties.from(Blocks.LIME_WOOL)), ItemGroup.DECORATIONS);
	
	// Shulker
	public static final RegistryObject<Block> SHULKER_BLOCK = HELPER.createBlock("shulker_block", () -> new Block(Block.Properties.from(Blocks.SHULKER_BOX)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SHULKER_SWIRL = HELPER.createBlock("shulker_swirl", () -> new Block(Block.Properties.from(Blocks.SHULKER_BOX)), ItemGroup.DECORATIONS);
	
	public static final RegistryObject<Block> WHITE_SHULKER_BLOCK = HELPER.createBlock("white_shulker_block", () -> new Block(Block.Properties.from(Blocks.WHITE_SHULKER_BOX)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> WHITE_SHULKER_SWIRL = HELPER.createBlock("white_shulker_swirl", () -> new Block(Block.Properties.from(Blocks.WHITE_SHULKER_BOX)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> ORANGE_SHULKER_BLOCK = HELPER.createBlock("orange_shulker_block", () -> new Block(Block.Properties.from(Blocks.ORANGE_SHULKER_BOX)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> ORANGE_SHULKER_SWIRL = HELPER.createBlock("orange_shulker_swirl", () -> new Block(Block.Properties.from(Blocks.ORANGE_SHULKER_BOX)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> MAGENTA_SHULKER_BLOCK = HELPER.createBlock("magenta_shulker_block", () -> new Block(Block.Properties.from(Blocks.MAGENTA_SHULKER_BOX)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> MAGENTA_SHULKER_SWIRL = HELPER.createBlock("magenta_shulker_swirl", () -> new Block(Block.Properties.from(Blocks.MAGENTA_SHULKER_BOX)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> LIGHT_BLUE_SHULKER_BLOCK = HELPER.createBlock("light_blue_shulker_block", () -> new Block(Block.Properties.from(Blocks.LIGHT_BLUE_SHULKER_BOX)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> LIGHT_BLUE_SHULKER_SWIRL = HELPER.createBlock("light_blue_shulker_swirl", () -> new Block(Block.Properties.from(Blocks.LIGHT_BLUE_SHULKER_BOX)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> YELLOW_SHULKER_BLOCK = HELPER.createBlock("yellow_shulker_block", () -> new Block(Block.Properties.from(Blocks.YELLOW_SHULKER_BOX)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> YELLOW_SHULKER_SWIRL = HELPER.createBlock("yellow_shulker_swirl", () -> new Block(Block.Properties.from(Blocks.YELLOW_SHULKER_BOX)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> LIME_SHULKER_BLOCK = HELPER.createBlock("lime_shulker_block", () -> new Block(Block.Properties.from(Blocks.LIME_SHULKER_BOX)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> LIME_SHULKER_SWIRL = HELPER.createBlock("lime_shulker_swirl", () -> new Block(Block.Properties.from(Blocks.LIME_SHULKER_BOX)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PINK_SHULKER_BLOCK = HELPER.createBlock("pink_shulker_block", () -> new Block(Block.Properties.from(Blocks.PINK_SHULKER_BOX)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PINK_SHULKER_SWIRL = HELPER.createBlock("pink_shulker_swirl", () -> new Block(Block.Properties.from(Blocks.PINK_SHULKER_BOX)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> GRAY_SHULKER_BLOCK = HELPER.createBlock("gray_shulker_block", () -> new Block(Block.Properties.from(Blocks.GRAY_SHULKER_BOX)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> GRAY_SHULKER_SWIRL = HELPER.createBlock("gray_shulker_swirl", () -> new Block(Block.Properties.from(Blocks.GRAY_SHULKER_BOX)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> LIGHT_GRAY_SHULKER_BLOCK = HELPER.createBlock("light_gray_shulker_block", () -> new Block(Block.Properties.from(Blocks.LIGHT_GRAY_SHULKER_BOX)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> LIGHT_GRAY_SHULKER_SWIRL = HELPER.createBlock("light_gray_shulker_swirl", () -> new Block(Block.Properties.from(Blocks.LIGHT_GRAY_SHULKER_BOX)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CYAN_SHULKER_BLOCK = HELPER.createBlock("cyan_shulker_block", () -> new Block(Block.Properties.from(Blocks.CYAN_SHULKER_BOX)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CYAN_SHULKER_SWIRL = HELPER.createBlock("cyan_shulker_swirl", () -> new Block(Block.Properties.from(Blocks.CYAN_SHULKER_BOX)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PURPLE_SHULKER_BLOCK = HELPER.createBlock("purple_shulker_block", () -> new Block(Block.Properties.from(Blocks.PURPLE_SHULKER_BOX)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PURPLE_SHULKER_SWIRL = HELPER.createBlock("purple_shulker_swirl", () -> new Block(Block.Properties.from(Blocks.PURPLE_SHULKER_BOX)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BLUE_SHULKER_BLOCK = HELPER.createBlock("blue_shulker_block", () -> new Block(Block.Properties.from(Blocks.BLUE_SHULKER_BOX)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BLUE_SHULKER_SWIRL = HELPER.createBlock("blue_shulker_swirl", () -> new Block(Block.Properties.from(Blocks.BLUE_SHULKER_BOX)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BROWN_SHULKER_BLOCK = HELPER.createBlock("brown_shulker_block", () -> new Block(Block.Properties.from(Blocks.BROWN_SHULKER_BOX)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BROWN_SHULKER_SWIRL = HELPER.createBlock("brown_shulker_swirl", () -> new Block(Block.Properties.from(Blocks.BROWN_SHULKER_BOX)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> GREEN_SHULKER_BLOCK = HELPER.createBlock("green_shulker_block", () -> new Block(Block.Properties.from(Blocks.GREEN_SHULKER_BOX)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> GREEN_SHULKER_SWIRL = HELPER.createBlock("green_shulker_swirl", () -> new Block(Block.Properties.from(Blocks.GREEN_SHULKER_BOX)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> RED_SHULKER_BLOCK = HELPER.createBlock("red_shulker_block", () -> new Block(Block.Properties.from(Blocks.RED_SHULKER_BOX)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> RED_SHULKER_SWIRL = HELPER.createBlock("red_shulker_swirl", () -> new Block(Block.Properties.from(Blocks.RED_SHULKER_BOX)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BLACK_SHULKER_BLOCK = HELPER.createBlock("black_shulker_block", () -> new Block(Block.Properties.from(Blocks.BLACK_SHULKER_BOX)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BLACK_SHULKER_SWIRL = HELPER.createBlock("black_shulker_swirl", () -> new Block(Block.Properties.from(Blocks.BLACK_SHULKER_BOX)), ItemGroup.DECORATIONS);
	
	public static class Properties {
		public static final Block.Properties MIDORI = Block.Properties.create(Material.ROCK, MaterialColor.LIME).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5F, 6.0F);
	}
	
}
