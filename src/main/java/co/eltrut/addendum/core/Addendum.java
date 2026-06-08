package co.eltrut.addendum.core;

import co.eltrut.addendum.core.registry.AddendumBlockEntities;
import co.eltrut.differentiate.core.registrator.Registrator;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("addendum")
public class Addendum {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "addendum";
    public static final Registrator REGISTRATOR = new Registrator(MOD_ID);
    public static Addendum instance;

    public Addendum(IEventBus modEventBus, ModContainer modContainer) {
        instance = this;

        REGISTRATOR.register(modEventBus);
        AddendumBlockEntities.BLOCK_ENTITY_TYPES.register(modEventBus);
        
    }

}
