package co.eltrut.addendum.common.block;

import co.eltrut.addendum.core.registry.AddendumParticles;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.CandleBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

public class DragonCandleBlock extends CandleBlock {

    public DragonCandleBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        if (state.getValue(LIT)) {
            this.getParticleOffsets(state).forEach((p_220695_) -> addParticlesAndSound(level, p_220695_.add(pos.getX(), pos.getY(), pos.getZ()), random, AddendumParticles.SMALL_DRAGON_FIRE_FLAME.get()));
        }
    }

    public static void addParticlesAndSound(Level level, Vec3 offset, RandomSource random, ParticleOptions particle) {
        float f = random.nextFloat();
        if (f < 0.3F) {
            level.addParticle(ParticleTypes.SMOKE, offset.x, offset.y, offset.z, 0.0F, 0.0F, 0.0F);
            if (f < 0.17F) {
                level.playLocalSound(offset.x + 0.5D, offset.y + 0.5D, offset.z + 0.5D, SoundEvents.CANDLE_AMBIENT, SoundSource.BLOCKS, 1.0F + random.nextFloat(), random.nextFloat() * 0.7F + 0.3F, false);
            }
        }

        level.addParticle(particle, offset.x, offset.y, offset.z, 0.0F, 0.0F, 0.0F);
    }

}
