package co.eltrut.addendum.common.block.entity;

import co.eltrut.addendum.core.registry.AddendumBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.CampfireBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class DragonCampfireBlockEntity extends CampfireBlockEntity {

    public DragonCampfireBlockEntity(BlockPos pos, BlockState blockState) {
        super(pos, blockState);
    }

    @Override
    public BlockEntityType<?> getType() {
        return AddendumBlockEntities.DRAGON_CAMPFIRE.get();
    }
}
