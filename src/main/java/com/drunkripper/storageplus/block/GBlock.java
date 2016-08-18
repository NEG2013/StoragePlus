package com.drunkripper.storageplus.Blocks;

import com.drunkripper.storageplus.reference.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class GBlock extends Block {

	public GBlock(Material materialIn, String name) {
		super(materialIn);

		this.setCreativeTab(CreativeTabs.REDSTONE);
		this.setHardness(1F);
		this.setHarvestLevel("pickaxe", 1);
		this.setLightLevel(0F);
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
	}

	public static void registerRender(Block block){
		//Item item = new Item().getItemFromBlock(block);
		
			Minecraft
			.getMinecraft()
			.getRenderItem()
			.getItemModelMesher()
			.register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Reference.MODID + ":" + block
			.getUnlocalizedName()
			.substring(5), "inventory"));
			


		
		
		GameRegistry.registerBlock(block);
	}// register
}
