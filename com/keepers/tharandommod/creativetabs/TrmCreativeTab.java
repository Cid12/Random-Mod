package com.keepers.tharandommod.creativetabs;

import com.keepers.tharandommod.ThaRandomMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TrmCreativeTab {

	static ThaRandomMod m = new ThaRandomMod();
	
	//Adding creative tab randomTrapTab to minecraft
    public static CreativeTabs randomTrapTab = new CreativeTabs("randomTrapTab") {
		
		public Item getTabIconItem() {
			return Item.getItemFromBlock(m.hiddenTrapDoor);
		}
};

public static CreativeTabs randomWeaponTab = new CreativeTabs("randomWeaponTab") {
	
	@Override
	public Item getTabIconItem() {
		return m.spikySnowball;
	}
};

}
