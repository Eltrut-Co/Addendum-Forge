package co.eltrut.addendum.common.block;

import co.eltrut.addendum.core.registry.AddendumParticles;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CandleCakeBlock;
import net.minecraft.world.level.block.state.BlockState;

public class DragonCandleCakeBlock extends CandleCakeBlock {

    public DragonCandleCakeBlock(Block candleBlock, Properties properties) {
        super(candleBlock, properties);
    }

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        if (state.getValue(LIT)) {
            this.getParticleOffsets(state).forEach((p_220695_) -> DragonCandleBlock.addParticlesAndSound(level, p_220695_.add(pos.getX(), pos.getY(), pos.getZ()), random, AddendumParticles.SMALL_DRAGON_FIRE_FLAME.get()));
        }
    }

}
