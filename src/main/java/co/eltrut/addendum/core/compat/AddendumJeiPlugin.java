package co.eltrut.addendum.core.compat;

import co.eltrut.addendum.core.Addendum;
import co.eltrut.addendum.core.registry.AddendumBlocks;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.RecipeTypes;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import net.minecraft.resources.ResourceLocation;

@JeiPlugin
public class AddendumJeiPlugin implements IModPlugin {

    @Override
    public ResourceLocation getPluginUid() {
        return ResourceLocation.fromNamespaceAndPath(Addendum.MOD_ID, Addendum.MOD_ID);
    }

    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        registration.addRecipeCatalyst(AddendumBlocks.DRAGON_CAMPFIRE, RecipeTypes.CAMPFIRE_COOKING);
    }
}
