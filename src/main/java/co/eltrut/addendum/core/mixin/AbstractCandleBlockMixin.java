package co.eltrut.addendum.core.mixin;

import co.eltrut.addendum.common.block.DragonCandleBlock;
import co.eltrut.addendum.core.AddendumConfig;
import co.eltrut.addendum.core.registry.AddendumParticles;
import co.eltrut.addendum.core.registry.AddendumTags;
import net.minecraft.core.BlockPos;
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
            DragonCandleBlock.addParticlesAndSound(level, offset, random, AddendumParticles.DRAGON_FIRE_FLAME.get());
            info.cancel();
        }
    }

}
