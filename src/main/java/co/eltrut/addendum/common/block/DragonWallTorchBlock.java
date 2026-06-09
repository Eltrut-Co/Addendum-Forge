package co.eltrut.addendum.common.block;

import co.eltrut.addendum.core.registry.AddendumParticles;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.WallTorchBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

public class DragonWallTorchBlock extends WallTorchBlock {

    public DragonWallTorchBlock(Properties properties) {
        super(ParticleTypes.SOUL_FIRE_FLAME, properties);
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        Direction direction = (Direction)state.getValue(FACING);
        double d0 = (double)pos.getX() + (double)0.5F;
        double d1 = (double)pos.getY() + 0.7;
        double d2 = (double)pos.getZ() + (double)0.5F;
        double d3 = 0.22;
        double d4 = 0.27;
        Direction direction1 = direction.getOpposite();
        level.addParticle(ParticleTypes.SMOKE, d0 + 0.27 * (double)direction1.getStepX(), d1 + 0.22, d2 + 0.27 * (double)direction1.getStepZ(), (double)0.0F, (double)0.0F, (double)0.0F);
        level.addParticle(AddendumParticles.DRAGON_FIRE_FLAME.get(), d0 + 0.27 * (double)direction1.getStepX(), d1 + 0.22, d2 + 0.27 * (double)direction1.getStepZ(), (double)0.0F, (double)0.0F, (double)0.0F);
    }
}
