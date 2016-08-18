package com.drunkripper.storageplus.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class StorageNetwork extends Block implements Network{
	
	public StorageNetwork(Material materialIn) {
		super(materialIn);
		this.setCreativeTab(CreativeTabs.BREWING);
		this.setHardness(0.1F);
		this.setHarvestLevel("pickaxe", 1);
		this.setLightLevel(15F);
		this.setRegistryName("network_block");
		this.setUnlocalizedName("network_block");
	}
	
}
