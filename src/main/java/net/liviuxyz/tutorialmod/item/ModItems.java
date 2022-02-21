package net.liviuxyz.tutorialmod.item;

import net.liviuxyz.tutorialmod.TutorialMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.rmi.registry.Registry;

public class ModItems {

    private static final Logger LOGGER = LogManager.getLogger();

    /** This is the list of the items */
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    /**Defining items  */
    public static final RegistryObject<Item> CITRINE;

    /**Defining items  */
    public static final RegistryObject<Item> RAW_CITRINE;

    static {
        CITRINE = ITEMS.register("citrine",
                () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
        RAW_CITRINE = ITEMS.register("raw_citrine",
                () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB).fireResistant()));
    }


    /** This is calling the register */
    public static void register(IEventBus eventBus){


        ITEMS.register(eventBus);
//        LOGGER.info("CITRINE loaded >> {}", CITRINE);
//        LOGGER.info("RAW CITRINE loaded >> {}", RAW_CITRINE);
    }

}
