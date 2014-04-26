package com.keepers.tharandommod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.keepers.tharandommod.blocks.TrmbHiddenTrapDoor;
import com.keepers.tharandommod.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid="randommod", name="Tha Random Mod", version="0.0.1")
public class ThaRandomMod {

	public static final String MODID = "randommod";
	
        // The instance of your mod that Forge uses.
        @Instance(value = "randommod")
        public static ThaRandomMod instance;
        
        @SidedProxy(clientSide="com.keepers.tharandommod.proxy.ClientProxy", serverSide="com.keepers.tharandommod.proxy.CommonProxy")
        public static CommonProxy proxy;
        
        //Adding creative tab randomTab to minecraft
        public static CreativeTabs randomTab = new CreativeTabs("randomTab") {
			
			public Item getTabIconItem() {
				return Items.apple;
			}
    };
    
    //Blocks
    public static Block hiddenTrapDoor;
       
        @EventHandler
        public void preInit(FMLPreInitializationEvent event) {
                //Put code here;
        	
        	//Defines blocks in Minecraft
        	hiddenTrapDoor = new TrmbHiddenTrapDoor(Material.wood);
        	
        	//Registers blocks in Minecraft
        	GameRegistry.registerBlock(hiddenTrapDoor, "hiddenTrapDoor");
        }
        
        @EventHandler
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderers();
        }
        
        @EventHandler
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