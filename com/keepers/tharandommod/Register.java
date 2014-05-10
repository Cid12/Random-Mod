package com.keepers.tharandommod;

import cpw.mods.fml.common.registry.GameRegistry;

public class Register {

	public static void addTrapdoorRegistrations(){
		ThaRandomMod m = new ThaRandomMod();
		
    	GameRegistry.registerBlock(m.hiddenTrapDoor, "hiddenTrapDoor");
    	GameRegistry.registerBlock(m.hiddenTrapDoor1, "hiddenTrapDoor1");
    	GameRegistry.registerBlock(m.hiddenTrapDoor2, "hiddenTrapDoor2");
    	GameRegistry.registerBlock(m.hiddenTrapDoor3, "hiddenTrapDoor3");
    	GameRegistry.registerBlock(m.hiddenTrapDoor4, "hiddenTrapDoor4");
    	GameRegistry.registerBlock(m.hiddenTrapDoor5, "hiddenTrapDoor5");
    	GameRegistry.registerBlock(m.hiddenTrapDoor6, "hiddenTrapDoor6");
    	GameRegistry.registerBlock(m.hiddenTrapDoor7, "hiddenTrapDoor7");
    	GameRegistry.registerBlock(m.hiddenTrapDoor8, "hiddenTrapDoor8");
    	
	}
	
}
