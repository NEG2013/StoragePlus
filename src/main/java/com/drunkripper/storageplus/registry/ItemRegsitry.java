package com.drunkripper.storageplus.registry;

import com.drunkripper.storageplus.block.Controller;
import com.drunkripper.storageplus.block.GBlock;
import com.drunkripper.storageplus.block.StorageNetwork;
import com.drunkripper.storageplus.item.GItem;
import com.drunkripper.storageplus.item.StorageCell;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class ItemRegsitry {

	public static Item storage_cell_basic, storage_cell, storage_cell_advanced, storage_cell_ultimate;

	public static void initItems() {

		storage_cell_basic = new StorageCell(8, "storage_cell_basic");
		storage_cell = new StorageCell(32, "storage_cell");
		storage_cell_advanced = new StorageCell(128, "storage_cell_advanced");
		storage_cell_ultimate = new StorageCell(512, "storage_cell_ultimate");
	}

	public static void registerRenders() {
		GItem.registerRender(storage_cell_basic);
		GItem.registerRender(storage_cell);
		GItem.registerRender(storage_cell_advanced);
		GItem.registerRender(storage_cell_ultimate);
	}

}// class
