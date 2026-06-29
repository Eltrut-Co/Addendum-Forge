package co.eltrut.addendum.core;

import co.eltrut.addendum.core.registry.AddendumBlockEntities;
import co.eltrut.addendum.core.registry.AddendumParticles;
import co.eltrut.differentiate.core.registrator.Registrator;
import net.minecraft.client.particle.FlameParticle;
import net.minecraft.client.renderer.blockentity.CampfireRenderer;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.loading.FMLEnvironment;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
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

        modContainer.registerConfig(ModConfig.Type.COMMON, AddendumConfig.SPEC);

        REGISTRATOR.register(modEventBus);
        AddendumBlockEntities.BLOCK_ENTITY_TYPES.register(modEventBus);
        AddendumParticles.PARTICLE_TYPES.register(modEventBus);

        modEventBus.addListener(this::registerEntityRenderers);

        if (FMLEnvironment.dist == Dist.CLIENT) {
            modEventBus.addListener(this::registerParticleProviders);
        }
        
    }

    private void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(AddendumBlockEntities.DRAGON_CAMPFIRE.get(), CampfireRenderer::new);
    }

    private void registerParticleProviders(RegisterParticleProvidersEvent event) {
        event.registerSpriteSet(AddendumParticles.DRAGON_FIRE_FLAME.get(), FlameParticle.Provider::new);
    }

}
