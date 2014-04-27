package com.keepers.tharandommod.blocks;

import com.keepers.tharandommod.ThaRandomMod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;

public class TrmbHiddenTrapDoor extends BlockTrapDoor {

	ThaRandomMod m = new ThaRandomMod() ;
	public TrmbHiddenTrapDoor(Material mat, int type) {
		super(mat);
		setHardness(1.0F);
		setCreativeTab(m.randomtTrapTab);
		
		if(type == 0)
			setBlockTextureName("planks_oak");
		setStepSound(soundTypeWood);
		
		if(type == 1)
			 setBlockTextureName("planks_birch");
		setStepSound(soundTypeWood);
		
		if(type == 2)
			 setBlockTextureName("planks_spruce");
		setStepSound(soundTypeWood);
		
		if(type == 3)
			 setBlockTextureName("planks_jungle");
		setStepSound(soundTypeWood);
		
		if(type == 4)
			 setBlockTextureName("planks_acacia");
		setStepSound(soundTypeWood);
		
		if(type == 5)
			 setBlockTextureName("planks_big_oak");
		setStepSound(soundTypeWood);
		
		if(type == 6)
			 setBlockTextureName("stone");
		setStepSound(soundTypePiston);
		
		if(type == 7)
			 setBlockTextureName("cobblestone");
		setStepSound(soundTypePiston);
		
		if(type == 8)
			 setBlockTextureName("stonebrick");
		setStepSound(soundTypePiston);
		
		
	}

}
