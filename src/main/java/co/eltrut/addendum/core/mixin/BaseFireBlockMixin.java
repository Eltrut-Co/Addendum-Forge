package co.eltrut.addendum.core.mixin;

import co.eltrut.addendum.common.block.DragonFireBlock;
import co.eltrut.addendum.core.registry.AddendumBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.BaseFireBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BaseFireBlock.class)
public class BaseFireBlockMixin extends Block {

    private BaseFireBlockMixin(Properties properties) {
        super(properties);
    }

    @Inject(at = @At("HEAD"), method = "getState(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private static void getState(BlockGetter reader, BlockPos pos, CallbackInfoReturnable<BlockState> cir) {
        if (DragonFireBlock.canSurviveOnBlock(reader.getBlockState(pos.below())))
            cir.setReturnValue(AddendumBlocks.DRAGON_FIRE.get().defaultBlockState());
    }

}
