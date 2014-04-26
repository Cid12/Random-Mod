package com.keepers.tharandommod.blocks;

import com.keepers.tharandommod.ThaRandomMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TrmbHiddenTrapDoor extends Block {

	ThaRandomMod m = new ThaRandomMod() ;
	public TrmbHiddenTrapDoor(Material mat) {
		super(mat);
		setStepSound(soundTypeWood);
		setBlockTextureName("planks_oak");
		setCreativeTab(m.randomTab);
		setBlockName("hiddenTrapDoor");
		setHardness(1.0F);
	}

}
