package com.drunkripper.storageplus.creative;

import com.drunkripper.storageplus.registry.ItemRegsitry;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class StoragePlusTab {
	public static final CreativeTabs StoragePlus = new CreativeTabs("Storage Plus")
    {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem()
        {
            return ItemRegsitry.storage_cell_ultimate;
        }
    };
}// class
