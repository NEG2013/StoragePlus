package com.drunkripper.storageplus.creative;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class StoragePlusTab extends CreativeTabs {

	public static Item item1;

	public StoragePlusTab(String label) {
		super(label);
	}// constructor

	public static void setItem(Item item) {
		item1 = item;
	}// setItem

	@Override
	public Item getTabIconItem() {
		return item1;
	}// getTabIconItem

}// class
