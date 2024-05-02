package net.undeadblazer.swordstoplowshares.Item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab SWORDS_TO_PLOWSHARES_TAB = new CreativeModeTab("swordstoplowsharestab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SWORD1.get());
        }
    };
}
