package co.eltrut.addendum.core.datagen.loot;

import co.eltrut.addendum.core.registry.AddendumBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.List;
import java.util.Set;

public class AddendumBlockLootSubProvider extends BlockLootSubProvider {

    protected AddendumBlockLootSubProvider(HolderLookup.Provider lookupProvider) {
        super(Set.of(), FeatureFlags.DEFAULT_FLAGS, lookupProvider);
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return AddendumBlocks.HELPER.getDeferredRegister().getEntries().stream()
                .map(DeferredHolder::get)
                .map(Block.class::cast)
                .toList();
    }

    @Override
    protected void generate() {
        AddendumBlocks.DYE_DEPOT_SWIRLS.stream().map(DeferredHolder::get).forEach(this::dropSelf);
        AddendumBlocks.DYE_DEPOT_BLOCKS.stream().map(DeferredHolder::get).forEach(this::dropSelf);
    }

}
