package com.keepers.tharandommod.items;

import com.keepers.tharandommod.ThaRandomMod;
import com.keepers.tharandommod.creativetabs.TrmCreativeTab;
import com.keepers.tharandommod.entities.EntitySpikySnowball;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class TrmiSpikySnowball extends Item {

	public TrmiSpikySnowball()
    {
        this.maxStackSize = 16;
        this.setCreativeTab(TrmCreativeTab.randomWeaponTab);
        this.setUnlocalizedName("spikySnowball");
        this.setTextureName(ThaRandomMod.MODID + ":" + "spikySnowballCactus");
    }
	
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (!par3EntityPlayer.capabilities.isCreativeMode)
        {
            --par1ItemStack.stackSize;
        }

        par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!par2World.isRemote)
        {
            par2World.spawnEntityInWorld(new EntitySpikySnowball(par2World, par3EntityPlayer));
        }

        return par1ItemStack;
    }
	
	
}
