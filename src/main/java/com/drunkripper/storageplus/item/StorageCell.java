package com.drunkripper.storageplus.item;

import net.minecraft.item.Item;

public class StorageCell extends GItem {

	public static int types;
	public static final boolean isCell = true;

	public StorageCell(int types, String name) {
		super(name);
		this.types = types;
	}// constructor

}// class
