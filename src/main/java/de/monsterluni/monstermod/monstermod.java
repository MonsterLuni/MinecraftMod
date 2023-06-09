package de.monsterluni.monstermod;

import de.monsterluni.monstermod.core.init.BlockInit;
import de.monsterluni.monstermod.core.init.ItemInit;
import de.monsterluni.monstermod.core.itemgroup.TutorialModItemGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("monstermod")
@Mod.EventBusSubscriber(modid = monstermod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class monstermod {

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "monstermod";
    public monstermod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        BlockInit.BLOCKS.register(bus);
        ItemInit.ITEMS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event){
        BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
            event.getRegistry().register(new BlockItem(block, new Item.Properties().group(TutorialModItemGroup.MONSTER_MOD))
                    .setRegistryName(block.getRegistryName()));
        });
    }
}
