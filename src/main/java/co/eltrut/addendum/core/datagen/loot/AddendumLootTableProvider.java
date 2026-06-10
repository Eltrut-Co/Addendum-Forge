package co.eltrut.addendum.core.datagen.loot;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

@EventBusSubscriber
public class AddendumLootTableProvider extends LootTableProvider {

    public AddendumLootTableProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, Set.of(), List.of(new LootTableProvider.SubProviderEntry(AddendumBlockLootSubProvider::new, LootContextParamSets.BLOCK)), registries);
    }

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
//        event.getGenerator().addProvider(event.includeServer(), (Factory<AddendumLootTableProvider>) output -> new AddendumLootTableProvider(output, event.getLookupProvider()));
    }

}
