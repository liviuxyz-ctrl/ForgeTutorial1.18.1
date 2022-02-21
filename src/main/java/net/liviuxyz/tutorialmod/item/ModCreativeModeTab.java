package net.liviuxyz.tutorialmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TUTORIAL_TAB = new CreativeModeTab("tutorial_tab") {
        @Override
        public ItemStack makeIcon(){
            return new ItemStack(ModItems.CITRINE.get());
        }
    };
    public static final CreativeModeTab TUTORIAL_WIP = new CreativeModeTab("tutorial_wip") {
        @Override
        public ItemStack makeIcon(){
            return new ItemStack(ModItems.RAW_CITRINE.get());
        }
    };
}
