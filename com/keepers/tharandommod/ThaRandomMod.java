package com.keepers.tharandommod;

import com.keepers.tharandommod.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="randommod", name="Tha Random Mod", version="0.0.1")
public class ThaRandomMod {

	public static final String MODID = "randommod";
	
        // The instance of your mod that Forge uses.
        @Instance(value = "randommod")
        public static ThaRandomMod instance;
        
        // Says where the client and server 'proxy' code is loaded.
        @SidedProxy(clientSide="com.keepers.tharandommod.proxy.ClientProxy", serverSide="com.keepers.tharandommod.proxy.CommonProxy")
        public static CommonProxy proxy;
        
        @EventHandler // used in 1.6.2
        //@PreInit    // used in 1.5.2
        public void preInit(FMLPreInitializationEvent event) {
                // Stub Method
        }
        
        @EventHandler // used in 1.6.2
        //@Init       // used in 1.5.2
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderers();
        }
        
        @EventHandler // used in 1.6.2
        //@PostInit   // used in 1.5.2
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
}

/*
Enforced Armor
Spiky Snowball
Barbed Wire
Coloured Flower Pot
Ender Chest Plate
Hidden Trap Door
Sleeping Bag
*/