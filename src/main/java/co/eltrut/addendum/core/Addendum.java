package co.eltrut.addendum.core;

import co.eltrut.addendum.core.data.AddendumBlockModels;
import co.eltrut.differentiate.core.registrator.Registrator;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("addendum")
@Mod.EventBusSubscriber(modid = "addendum", bus = Bus.MOD)
public class Addendum {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "addendum";
    public static final Registrator REGISTRATOR = new Registrator(MOD_ID);
    public static Addendum instance;

    IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

    public Addendum() {
        modEventBus.addListener(this::doCommonStuff);
        modEventBus.addListener(this::doClientStuff);
        modEventBus.addListener(this::doDataStuff);
        instance = this;

        REGISTRATOR.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);
        
    }

    private void doCommonStuff(final FMLCommonSetupEvent event) {
    }
    
    private void doClientStuff(final FMLClientSetupEvent event) {
    }
    
    private void doDataStuff(final GatherDataEvent event) {
    	DataGenerator generator = event.getGenerator();
    	ExistingFileHelper helper = event.getExistingFileHelper();
    	generator.addProvider(new AddendumBlockModels(generator, helper));
    }
}
