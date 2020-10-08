package eltrut.addendum.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import eltrut.addendum.core.registry.util.AddendumRegistryHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("addendum")
@Mod.EventBusSubscriber(modid = "addendum", bus = Bus.MOD)
public class Addendum
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "addendum";
    public static final AddendumRegistryHelper REGISTRY_HELPER = new AddendumRegistryHelper(MOD_ID);
    public static Addendum instance;

    IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

    public Addendum() {
        modEventBus.addListener(this::doCommonStuff);
        modEventBus.addListener(this::doClientStuff);
        instance = this;
        
        REGISTRY_HELPER.getDeferredItemRegister().register(modEventBus);
        REGISTRY_HELPER.getDeferredBlockRegister().register(modEventBus);
        
        MinecraftForge.EVENT_BUS.register(this);
        
    }

    private void doCommonStuff(final FMLCommonSetupEvent event)
    {
    }
    
    private void doClientStuff(final FMLClientSetupEvent event) {
    }
}
