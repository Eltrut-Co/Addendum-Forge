package co.eltrut.addendum.core.registry;

import co.eltrut.addendum.core.Addendum;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class AddendumTags {

    public static final TagKey<Block> DRAGON_FIRE_BASE_BLOCKS = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Addendum.MOD_ID, "dragon_fire_base_blocks"));

}
