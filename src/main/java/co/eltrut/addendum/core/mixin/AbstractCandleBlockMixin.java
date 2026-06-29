package co.eltrut.addendum.core.mixin;

import co.eltrut.addendum.core.AddendumConfig;
import co.eltrut.addendum.core.registry.AddendumParticles;
import co.eltrut.addendum.core.registry.AddendumTags;
import co.eltrut.differentiate.core.util.CompatUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.AbstractCandleBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(AbstractCandleBlock.class)
public class AbstractCandleBlockMixin extends Block {

    private AbstractCandleBlockMixin(Properties properties) {
        super(properties);
    }

    @Inject(at = @At("HEAD"), method = "addParticlesAndSound(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private static void addParticlesAndSound(Level level, Vec3 offset, RandomSource random, CallbackInfo info) {
        BlockPos testPos = BlockPos.containing(offset.x, offset.y - 1, offset.z);
        BlockState testState = level.getBlockState(testPos);

        if (testState.is(AddendumTags.DRAGON_FIRE_BASE_BLOCKS) && AddendumConfig.CONFIG.dragonCandles.get()) {
            float f = random.nextFloat();
            if (f < 0.3F) {
                level.addParticle(ParticleTypes.SMOKE, offset.x, offset.y, offset.z, 0.0F, 0.0F, 0.0F);
                if (f < 0.17F) {
                    level.playLocalSound(offset.x + (double)0.5F, offset.y + (double)0.5F, offset.z + (double)0.5F, SoundEvents.CANDLE_AMBIENT, SoundSource.BLOCKS, 1.0F + random.nextFloat(), random.nextFloat() * 0.7F + 0.3F, false);
                }
            }

            level.addParticle(AddendumParticles.DRAGON_FIRE_FLAME.get(), offset.x, offset.y, offset.z, 0.0F, 0.0F, 0.0F);
            info.cancel();
        }
    }

}
