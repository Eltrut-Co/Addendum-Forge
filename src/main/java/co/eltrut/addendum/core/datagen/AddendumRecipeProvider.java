package co.eltrut.addendum.core.datagen;

import co.eltrut.addendum.core.Addendum;
import co.eltrut.addendum.core.registry.AddendumBlocks;
import co.eltrut.differentiate.core.datagen.provider.DifferentiateRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = Addendum.MOD_ID)
public class AddendumRecipeProvider extends DifferentiateRecipeProvider {

	public AddendumRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, Addendum.MOD_ID);
    }

    @Override
    protected void buildRecipes(RecipeOutput output) {

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AddendumBlocks.POLISHED_END_STONE.getBlock()), RecipeCategory.BUILDING_BLOCKS, Blocks.END_STONE_BRICKS)
                .unlockedBy("has_block", has(AddendumBlocks.POLISHED_END_STONE.getBlock()))
                .save(output, ResourceLocation.fromNamespaceAndPath(Addendum.MOD_ID, "stonecutting/end_stone_bricks"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AddendumBlocks.POLISHED_END_STONE.getBlock()), RecipeCategory.BUILDING_BLOCKS, Blocks.END_STONE_BRICK_SLAB, 2)
                .unlockedBy("has_block", has(AddendumBlocks.POLISHED_END_STONE.getBlock()))
                .save(output, ResourceLocation.fromNamespaceAndPath(Addendum.MOD_ID, "stonecutting/end_stone_brick_slab"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AddendumBlocks.POLISHED_END_STONE.getBlock()), RecipeCategory.BUILDING_BLOCKS, Blocks.END_STONE_BRICK_STAIRS)
                .unlockedBy("has_block", has(AddendumBlocks.POLISHED_END_STONE.getBlock()))
                .save(output, ResourceLocation.fromNamespaceAndPath(Addendum.MOD_ID, "stonecutting/end_stone_brick_stairs"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(AddendumBlocks.POLISHED_END_STONE.getBlock()), RecipeCategory.BUILDING_BLOCKS, Blocks.END_STONE_BRICK_WALL)
                .unlockedBy("has_block", has(AddendumBlocks.POLISHED_END_STONE.getBlock()))
                .save(output, ResourceLocation.fromNamespaceAndPath(Addendum.MOD_ID, "stonecutting/end_stone_brick_wall"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PURPUR_BLOCK, AddendumBlocks.PURPUR_BRICKS.getBlock()),  RecipeCategory.BUILDING_BLOCKS, AddendumBlocks.CHISELED_PURPUR_BRICKS)
                .unlockedBy("has_block", has(Blocks.PURPUR_BLOCK))
                .save(output,  ResourceLocation.fromNamespaceAndPath(Addendum.MOD_ID, "stonecutting/chiseled_purpur_bricks"));

        // VariantRepo recipes
        this.buildStonecuttingRecipes(List.of(Blocks.END_STONE), AddendumBlocks.END_STONE, output);
        this.buildStonecuttingRecipes(List.of(Blocks.END_STONE, AddendumBlocks.POLISHED_END_STONE.getBlock().get()), AddendumBlocks.POLISHED_END_STONE, output);
        this.buildStonecuttingRecipes(List.of(AddendumBlocks.CHORUSY_END_STONE_BRICKS.getBlock().get()), AddendumBlocks.CHORUSY_END_STONE_BRICKS, output);
        this.buildStonecuttingRecipes(List.of(Blocks.PURPUR_BLOCK, AddendumBlocks.PURPUR_BRICKS.getBlock().get()), AddendumBlocks.PURPUR_BRICKS, output);

    }

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new AddendumRecipeProvider(output, lookupProvider));
    }


}
