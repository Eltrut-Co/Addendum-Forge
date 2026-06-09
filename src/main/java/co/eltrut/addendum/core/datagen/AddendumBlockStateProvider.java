package co.eltrut.addendum.core.datagen;

import co.eltrut.addendum.core.Addendum;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class AddendumBlockStateProvider extends BlockStateProvider {

    public AddendumBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Addendum.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

    }

}
