package net.liviuxyz.tutorialmod.block;

import net.liviuxyz.tutorialmod.TutorialMod;
import net.liviuxyz.tutorialmod.item.ModCreativeModeTab;
import net.liviuxyz.tutorialmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TutorialMod.MOD_ID);

    public static final RegistryObject<Block> CITRINE_ORE;

    public static final RegistryObject<Block> DEEPSLATE_CITRINE_ORE;

    public static final RegistryObject<Block> NETHERRACK_CITRINE_ORE;

    public static final RegistryObject<Block> ENDSTONE_CITRINE_ORE;

    public static final RegistryObject<Block> CITRINE_BLOCK;

    static {
        CITRINE_ORE = registerBlock("citrine_ore",
                () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                        .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.TUTORIAL_TAB);
        DEEPSLATE_CITRINE_ORE = registerBlock("deepslate_citrine_ore",
                () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                        .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.TUTORIAL_TAB);
        NETHERRACK_CITRINE_ORE = registerBlock("netherrack_citrine_ore",
                () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                        .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.TUTORIAL_WIP);
        ENDSTONE_CITRINE_ORE = registerBlock("endstone_citrine_ore",
                () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                        .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.TUTORIAL_WIP);
        CITRINE_BLOCK = registerBlock("citrine_block",
                () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                        .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.TUTORIAL_TAB);
    }




    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }


//    private static <T extends Block> void
//        registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
//        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
//    }

    private static <T extends Block> void
    registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }



    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
