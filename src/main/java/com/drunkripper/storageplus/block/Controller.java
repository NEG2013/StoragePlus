package com.drunkripper.storageplus.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class Controller extends GBlock{

	public static final PropertyInteger TYPE = PropertyInteger.create("type", 1, 2);
	
	public Controller(Material materialIn, String name) {
		super(materialIn, name);
	}


	
	
}
