package com.drunkripper.storageplus.item;

import com.drunkripper.storageplus.creative.StoragePlusTab;
import com.drunkripper.storageplus.main.StoragePlus;
import com.drunkripper.storageplus.reference.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class GItem extends Item {

	public GItem(String name) {

		this.setCreativeTab(StoragePlusTab.StoragePlus);
		this.setHarvestLevel("pickaxe", 1);
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
	}

	public static void registerRender(Item item) {

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
				new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));

		GameRegistry.registerItem(item);
	}// register

}// class
