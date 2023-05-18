package de.monsterluni.monstermod.core.init;

import de.monsterluni.monstermod.core.itemgroup.TutorialModItemGroup;
import de.monsterluni.monstermod.monstermod;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, monstermod.MOD_ID);

    public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item",
            ()-> new Item(new Item.Properties().group(TutorialModItemGroup.MONSTER_MOD)));

    public static final RegistryObject<Item> MONSTER_ORE = ITEMS.register("monster_ingot",
            ()-> new Item(new Item.Properties().group(TutorialModItemGroup.MONSTER_MOD)));


    }


