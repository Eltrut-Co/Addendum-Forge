package co.eltrut.addendum.core.registry;

import co.eltrut.addendum.core.Addendum;
import co.eltrut.differentiate.core.event.LoadEvent;
import co.eltrut.differentiate.core.registrator.ItemHelper;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.registries.DeferredItem;

@EventBusSubscriber(modid = Addendum.MOD_ID)
public class AddendumItems {
    @SubscribeEvent
    public static void load(LoadEvent event) {}

    public static final ItemHelper HELPER = Addendum.REGISTRATOR.getHelper(Registries.ITEM);

    public static final DeferredItem<Item> DRAGON_TORCH_ITEM = HELPER.createFollowItem("dragon_torch", () -> new StandingAndWallBlockItem(AddendumBlocks.DRAGON_TORCH.get(), AddendumBlocks.DRAGON_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN), CreativeModeTabs.FUNCTIONAL_BLOCKS, Items.SOUL_TORCH);

}
