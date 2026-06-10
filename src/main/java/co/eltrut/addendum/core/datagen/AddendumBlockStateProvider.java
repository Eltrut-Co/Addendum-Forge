package co.eltrut.addendum.core.datagen;

import co.eltrut.addendum.core.Addendum;
import co.eltrut.addendum.core.registry.AddendumBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.registries.DeferredHolder;

@EventBusSubscriber
public class AddendumBlockStateProvider extends BlockStateProvider {

    public AddendumBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Addendum.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
//        AddendumBlocks.DYE_DEPOT_BLOCKS.stream().map(DeferredHolder::get).forEach(this::simpleBlock);
//        AddendumBlocks.DYE_DEPOT_SWIRLS.stream().map(DeferredHolder::get).forEach(this::simpleBlock);
    }

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(event.includeClient(), new AddendumBlockStateProvider(packOutput, existingFileHelper));
    }

}
