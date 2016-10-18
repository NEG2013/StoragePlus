package com.drunkripper.storageplus.registry;

import com.drunkripper.storageplus.block.Controller;
import com.drunkripper.storageplus.block.GBlock;
import com.drunkripper.storageplus.block.StorageNetwork;
import com.drunkripper.storageplus.block.node.StorageNode;
import com.drunkripper.storageplus.block.node.StorageNodeDown;
import com.drunkripper.storageplus.block.node.StorageNodeUp;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockRegistry {

	public static Block storage_network;
	public static Block controller;
	public static Block storage_node, storage_node_down, storage_node_up;//, storage_node_north, storage_node_south, storage_node_east, storage_node_west;
	
	public static void initBlocks() {
    	storage_network = new StorageNetwork(Material.ROCK);
    	controller = new Controller(Material.ROCK, "controller");
    	
    	storage_node = new StorageNode(Material.ROCK, "storage_node");
    	
    	//storage_node_up = new StorageNodeUp(Material.ROCK, "storage_node_up");
    	//storage_node_down = new StorageNodeDown(Material.ROCK, "storage_node_down");
    	//storage_node_north = new StorageNode(Material.ROCK, "storage_node_north");
    	//storage_node_south = new StorageNode(Material.ROCK, "storage_node_south");
    	//storage_node_east = new StorageNode(Material.ROCK, "storage_node_east");
    	//storage_node_west = new StorageNode(Material.ROCK, "storage_node_west");
    	
    	
	}//init

	public static void register(){
		GBlock.registerAsItem(storage_network);
		GBlock.registerAsItem(controller);
		
		GBlock.registerAsItem(storage_node);
		
		//GBlock.registerAsItem(storage_node_down);
		//GBlock.registerAsItem(storage_node_up);
		//GBlock.registerAsItem(storage_node_north);
		//GBlock.registerAsItem(storage_node_south);
		//GBlock.registerAsItem(storage_node_east);
		//GBlock.registerAsItem(storage_node_west);
		
		
	}//register
	
	public static void registerRenders(){
		GBlock.registerRender(storage_network);	
		GBlock.registerRender(controller);
		
		GBlock.registerRender(storage_node);
		
		//GBlock.registerRender(storage_node_down);
		//GBlock.registerRender(storage_node_up);
		//GBlock.registerRender(storage_node_north);
		//GBlock.registerRender(storage_node_south);
		//GBlock.registerRender(storage_node_east);
		//GBlock.registerRender(storage_node_west);
		
	}//register renders
	
	
	
	
	
	
	
}//class
