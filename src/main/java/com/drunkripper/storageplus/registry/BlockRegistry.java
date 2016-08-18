package com.drunkripper.storageplus.main;

import com.drunkripper.storageplus.Blocks.Controller;
import com.drunkripper.storageplus.Blocks.GBlock;
import com.drunkripper.storageplus.Blocks.StorageNetwork;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockRegistry {

	public static Block storage_network;
	public static Block controller;
	
	public void initBlocks() {
    	storage_network = new StorageNetwork(Material.ROCK);
    	controller = new Controller(Material.ROCK, "controller");
    	
	}

	public static void registerRenders(){
		GBlock.registerRender(controller);
		GBlock.registerRender(storage_network);
    	
	}
	
}
