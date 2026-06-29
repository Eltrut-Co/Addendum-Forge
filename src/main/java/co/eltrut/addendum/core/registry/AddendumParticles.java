package co.eltrut.addendum.core.registry;

import co.eltrut.addendum.core.Addendum;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.Registries;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class AddendumParticles {

    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES = DeferredRegister.create(Registries.PARTICLE_TYPE, Addendum.MOD_ID);

    public static final Supplier<SimpleParticleType> DRAGON_FIRE_FLAME = PARTICLE_TYPES.register("dragon_fire_flame", () -> new SimpleParticleType(false));
    public static final Supplier<SimpleParticleType> SMALL_DRAGON_FIRE_FLAME = PARTICLE_TYPES.register("small_dragon_fire_flame", () -> new SimpleParticleType(false));

}
