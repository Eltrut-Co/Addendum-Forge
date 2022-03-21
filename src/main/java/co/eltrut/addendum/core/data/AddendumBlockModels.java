package co.eltrut.addendum.core.data;

import co.eltrut.addendum.core.Addendum;
import co.eltrut.addendum.core.registry.AddendumBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class AddendumBlockModels extends BlockStateProvider {

	public AddendumBlockModels(DataGenerator gen, ExistingFileHelper exFileHelper) {
		super(gen, Addendum.MOD_ID, exFileHelper);
	}

	@Override
	protected void registerStatesAndModels() {
		this.simpleBlock(AddendumBlocks.HIMMEL_BRICKS.getBlock().get());
		this.slabBlock((SlabBlock)AddendumBlocks.HIMMEL_BRICKS.getSlabBlock().get(), new ResourceLocation(Addendum.MOD_ID, "block/himmel_bricks"), new ResourceLocation(Addendum.MOD_ID, "block/himmel_bricks"));
		this.stairsBlock((StairBlock)AddendumBlocks.HIMMEL_BRICKS.getStairsBlock().get(), new ResourceLocation(Addendum.MOD_ID, "block/himmel_bricks"));
		this.wallBlock((WallBlock)AddendumBlocks.HIMMEL_BRICKS.getWallBlock().get(), new ResourceLocation(Addendum.MOD_ID, "block/himmel_bricks"));
	}

}
