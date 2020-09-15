package eltrut.addendum.core;

import com.teamabnormals.abnormals_core.common.blocks.AbnormalsStairsBlock;
import com.teamabnormals.abnormals_core.common.blocks.VerticalSlabBlock;
import com.teamabnormals.abnormals_core.core.utils.RegistryHelper;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Addendum.MOD_ID, bus = Bus.MOD)
public class BlockInit {
	public static final RegistryHelper HELPER = Addendum.REGISTRY_HELPER;
	
	// End Stone
	public static final RegistryObject<Block> END_STONE_SLAB = HELPER.createBlock("end_stone_slab", () -> new SlabBlock(Block.Properties.from(Blocks.END_STONE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> END_STONE_STAIRS = HELPER.createBlock("end_stone_stairs", () -> new AbnormalsStairsBlock(Blocks.END_STONE.getDefaultState(), Block.Properties.from(Blocks.END_STONE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> END_STONE_WALL = HELPER.createBlock("end_stone_wall", () -> new WallBlock(Block.Properties.from(Blocks.END_STONE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> END_STONE_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "end_stone_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.END_STONE)), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> POLISHED_END_STONE = HELPER.createBlock("polished_end_stone", () -> new Block(Block.Properties.from(Blocks.END_STONE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> POLISHED_END_STONE_SLAB = HELPER.createBlock("polished_end_stone_slab", () -> new SlabBlock(Block.Properties.from(Blocks.END_STONE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> POLISHED_END_STONE_STAIRS = HELPER.createBlock("polished_end_stone_stairs", () -> new AbnormalsStairsBlock(POLISHED_END_STONE.get().getDefaultState(), Block.Properties.from(Blocks.END_STONE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> POLISHED_END_STONE_WALL = HELPER.createBlock("polished_end_stone_wall", () -> new WallBlock(Block.Properties.from(Blocks.END_STONE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> POLISHED_END_STONE_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "polished_end_stone_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.END_STONE)), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> CRACKED_END_STONE_BRICKS = HELPER.createBlock("cracked_end_stone_bricks", () -> new Block(Block.Properties.from(Blocks.END_STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_END_STONE_BRICK_SLAB = HELPER.createCompatBlock("lepton", "cracked_end_stone_brick_slab", () -> new SlabBlock(Block.Properties.from(Blocks.END_STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_END_STONE_BRICK_STAIRS = HELPER.createCompatBlock("lepton", "cracked_end_stone_brick_stairs", () -> new AbnormalsStairsBlock(CRACKED_END_STONE_BRICKS.get().getDefaultState(), Block.Properties.from(Blocks.END_STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CRACKED_END_STONE_BRICK_WALL = HELPER.createCompatBlock("lepton", "cracked_end_stone_brick_wall", () -> new WallBlock(Block.Properties.from(Blocks.END_STONE_BRICKS)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CRACKED_END_STONE_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock("lepton", "cracked_end_stone_brick_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(Blocks.END_STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> CHORUSY_END_STONE_BRICKS = HELPER.createBlock("chorusy_end_stone_bricks", () -> new Block(Block.Properties.from(Blocks.END_STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CHISELED_POLISHED_END_STONE = HELPER.createBlock("chiseled_polished_end_stone", () -> new Block(Block.Properties.from(Blocks.END_STONE)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> CHISELED_END_STONE_BRICKS = HELPER.createBlock("chiseled_end_stone_bricks", () -> new Block(Block.Properties.from(Blocks.END_STONE_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	
	// Purpur
}
