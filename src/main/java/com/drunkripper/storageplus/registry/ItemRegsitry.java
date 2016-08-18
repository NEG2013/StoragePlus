package com.drunkripper.storageplus.registry;

import com.drunkripper.storageplus.block.Controller;
import com.drunkripper.storageplus.block.GBlock;
import com.drunkripper.storageplus.block.StorageNetwork;
import com.drunkripper.storageplus.item.GItem;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class ItemRegsitry {

	public static Item storage_cell_basic, storage_cell, storage_cell_advanced, storage_cell_ultimate;

	public static void initItems() {

		storage_cell_basic = new GItem("storage_cell_basic");

	}

	public static void registerRenders() {
		GItem.registerRender(storage_cell_basic);
	}

}// class
