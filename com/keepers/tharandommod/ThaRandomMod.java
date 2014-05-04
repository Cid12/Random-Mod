package com.keepers.tharandommod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.keepers.tharandommod.blocks.TrmbHiddenTrapDoor;
import com.keepers.tharandommod.items.TrmiSpikySnowball;
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
        
        //Blocks
        
        //Wooden hidden trap doors
        public static Block hiddenTrapDoor;
        public static Block hiddenTrapDoor1;
        public static Block hiddenTrapDoor2;
        public static Block hiddenTrapDoor3;
        public static Block hiddenTrapDoor4;
        public static Block hiddenTrapDoor5;
        
        //Stone hidden trap doors
        public static Block hiddenTrapDoor6;
        public static Block hiddenTrapDoor7;
        public static Block hiddenTrapDoor8;

        //Items
        
        public static Item spikySnowball;

       
        @EventHandler
        public void preInit(FMLPreInitializationEvent event) {
        	
        	//Defines blocks in Minecraft
        	//Wooden hidden trap doors
        	hiddenTrapDoor = new TrmbHiddenTrapDoor(Material.wood, 0).setBlockName("hiddenTrapDoor");
        	hiddenTrapDoor1 = new TrmbHiddenTrapDoor(Material.wood, 1).setBlockName("hiddenTrapDoorBirch");
        	hiddenTrapDoor2 = new TrmbHiddenTrapDoor(Material.wood, 2).setBlockName("hiddenTrapDoorSpruce");
        	hiddenTrapDoor3 = new TrmbHiddenTrapDoor(Material.wood, 3).setBlockName("hiddenTrapDoorJungle");
        	hiddenTrapDoor4 = new TrmbHiddenTrapDoor(Material.wood, 4).setBlockName("hiddenTrapDoorAcacia");
        	hiddenTrapDoor5 = new TrmbHiddenTrapDoor(Material.wood, 5).setBlockName("hiddenTrapDoorBigOak");
        	//Stone hidden trap doors
        	hiddenTrapDoor6 = new TrmbHiddenTrapDoor(Material.rock, 6).setBlockName("hiddenTrapDoorStone");
        	hiddenTrapDoor7 = new TrmbHiddenTrapDoor(Material.rock, 7).setBlockName("hiddenTrapDoorCobblestone");
        	hiddenTrapDoor8 = new TrmbHiddenTrapDoor(Material.rock, 8).setBlockName("hiddenTrapDoorStoneBrick");
        	
        	//Defines items in Minecraft
        	spikySnowball = new TrmiSpikySnowball();


        	
        	//Registers blocks in Minecraft
        	GameRegistry.registerBlock(hiddenTrapDoor, "hiddenTrapDoor");
        	GameRegistry.registerBlock(hiddenTrapDoor1, "hiddenTrapDoor1");
        	GameRegistry.registerBlock(hiddenTrapDoor2, "hiddenTrapDoor2");
        	GameRegistry.registerBlock(hiddenTrapDoor3, "hiddenTrapDoor3");
        	GameRegistry.registerBlock(hiddenTrapDoor4, "hiddenTrapDoor4");
        	GameRegistry.registerBlock(hiddenTrapDoor5, "hiddenTrapDoor5");
        	GameRegistry.registerBlock(hiddenTrapDoor6, "hiddenTrapDoor6");
        	GameRegistry.registerBlock(hiddenTrapDoor7, "hiddenTrapDoor7");
        	GameRegistry.registerBlock(hiddenTrapDoor8, "hiddenTrapDoor8");
        	
        	//Registers items in Minecraft
        	GameRegistry.registerItem(spikySnowball, "spikySnowball");
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