package co.eltrut.addendum.core.registry;

import co.eltrut.addendum.common.block.entity.DragonCampfireBlockEntity;
import co.eltrut.addendum.core.Addendum;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class AddendumBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, Addendum.MOD_ID);

    public static final Supplier<BlockEntityType<DragonCampfireBlockEntity>> DRAGON_CAMPFIRE = BLOCK_ENTITY_TYPES.register(
            "dragon_campfire",
            () -> BlockEntityType.Builder.of(
                    DragonCampfireBlockEntity::new,
                    AddendumBlocks.DRAGON_CAMPFIRE.get()
            ).build(null)
    );

}
