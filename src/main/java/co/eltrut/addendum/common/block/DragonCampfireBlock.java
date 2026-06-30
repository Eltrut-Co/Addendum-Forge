package co.eltrut.addendum.common.block;

import co.eltrut.addendum.common.block.entity.DragonCampfireBlockEntity;
import co.eltrut.addendum.core.registry.AddendumBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.CampfireBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class DragonCampfireBlock extends CampfireBlock {

    public DragonCampfireBlock(Properties properties) {
        super(false, 3, properties);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new DragonCampfireBlockEntity(pos, state);
    }

    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> blockEntityType) {
        if (level.isClientSide) {
            return state.getValue(LIT) ? createTickerHelper(blockEntityType, AddendumBlockEntities.DRAGON_CAMPFIRE.get(), DragonCampfireBlockEntity::particleTick) : null;
        } else {
            return state.getValue(LIT) ? createTickerHelper(blockEntityType, AddendumBlockEntities.DRAGON_CAMPFIRE.get(), DragonCampfireBlockEntity::cookTick) : createTickerHelper(blockEntityType, AddendumBlockEntities.DRAGON_CAMPFIRE.get(), DragonCampfireBlockEntity::cooldownTick);
        }
    }

}
