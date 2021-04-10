package co.eltrut.addendum.core.data;

import co.eltrut.addendum.core.Addendum;
import co.eltrut.addendum.core.registry.AddendumBlocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class AddendumBlockModels extends BlockStateProvider {

	public AddendumBlockModels(DataGenerator gen, ExistingFileHelper exFileHelper) {
		super(gen, Addendum.MOD_ID, exFileHelper);
	}

	@Override
	protected void registerStatesAndModels() {
		this.simpleBlock(AddendumBlocks.HIMMEL_BRICKS.get());
		this.slabBlock((SlabBlock)AddendumBlocks.HIMMEL_BRICK_SLAB.get(), new ResourceLocation(Addendum.MOD_ID, "block/himmel_bricks"), new ResourceLocation(Addendum.MOD_ID, "block/himmel_bricks"));
		this.stairsBlock((StairsBlock)AddendumBlocks.HIMMEL_BRICK_STAIRS.get(), new ResourceLocation(Addendum.MOD_ID, "block/himmel_bricks"));
		this.wallBlock((WallBlock)AddendumBlocks.HIMMEL_BRICK_WALL.get(), new ResourceLocation(Addendum.MOD_ID, "block/himmel_bricks"));
	}

}
