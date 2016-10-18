package com.drunkripper.storageplus.main;

import com.drunkripper.storageplus.block.Controller;
import com.drunkripper.storageplus.block.StorageNetwork;
import com.drunkripper.storageplus.creative.StoragePlusTab;
import com.drunkripper.storageplus.proxy.CommonProxy;
import com.drunkripper.storageplus.reference.Reference;
import com.drunkripper.storageplus.registry.BlockRegistry;
import com.drunkripper.storageplus.registry.ItemRegsitry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = Reference.MODID, version = Reference.VERSION, name = Reference.NAME)

public class StoragePlus
{
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)

	public static CommonProxy proxy;

	@EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
    	

    
    }//pre init
	
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	BlockRegistry.initBlocks();
    	BlockRegistry.register();
    	ItemRegsitry.initItems();
    	proxy.init();    
    	
    	
    }//init
    
    @EventHandler
    public void postinit(FMLPostInitializationEvent event)
    {
    	
    	
    	
    	
    	
    }//post init
    
}//class
