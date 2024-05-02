package net.undeadblazer.swordstoplowshares.Item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.undeadblazer.swordstoplowshares.SwordsToPlowshares;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SwordsToPlowshares.MOD_ID);

    public static final RegistryObject<Item> SWORD1 = ITEMS.register("sword1",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SWORDS_TO_PLOWSHARES_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
