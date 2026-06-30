package co.eltrut.addendum.core.datagen;

import co.eltrut.addendum.core.Addendum;
import co.eltrut.addendum.core.registry.AddendumBlocks;
import co.eltrut.differentiate.core.util.BlockUtil;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber
public class AddendumItemModelProvider extends ItemModelProvider {

    public AddendumItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Addendum.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
//        AddendumBlocks.DYE_DEPOT_SWIRLS.forEach(s -> {
//            withExistingParent(s.getRegisteredName(), modLoc("block/" + BlockUtil.getIdFromBlock(s.get())));
//        });
    }

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(event.includeClient(), new AddendumItemModelProvider(packOutput, existingFileHelper));

    }


}
