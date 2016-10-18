package com.drunkripper.storageplus.block;

import com.drunkripper.storageplus.creative.StoragePlusTab;
import com.drunkripper.storageplus.main.StoragePlus;
import com.drunkripper.storageplus.reference.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FBlock extends Block {

	public FBlock(Material materialIn, String name) {
		super(materialIn);

		this.setHardness(1F);
		this.setHarvestLevel("pickaxe", 1);
		this.setLightLevel(0F);
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
	}

	public static void registerAsItem(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	public static void registerRender(Block block) {
		// Item item = new Item().getItemFromBlock(block);

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation(Reference.MODID + ":" + block.getUnlocalizedName().substring(5),
						"inventory"));

		// GameRegistry.registerBlock(block);
	}// register
}

