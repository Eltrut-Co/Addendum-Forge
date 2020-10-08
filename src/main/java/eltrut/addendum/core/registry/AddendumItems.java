package eltrut.addendum.core.registry;

import com.teamabnormals.abnormals_core.core.utils.RegistryHelper;

import eltrut.addendum.core.Addendum;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Addendum.MOD_ID, bus = Bus.MOD)
public class AddendumItems {
	public static final RegistryHelper HELPER = Addendum.REGISTRY_HELPER;
}
