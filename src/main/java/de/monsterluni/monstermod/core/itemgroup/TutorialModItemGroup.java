package de.monsterluni.monstermod.core.itemgroup;

import de.monsterluni.monstermod.core.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class TutorialModItemGroup extends ItemGroup {

    public static final TutorialModItemGroup MONSTER_MOD = new TutorialModItemGroup(ItemGroup.GROUPS.length, "monster_mod");

    public TutorialModItemGroup(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemInit.TEST_ITEM.get());
    }
}
