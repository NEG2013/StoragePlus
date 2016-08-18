package com.drunkripper.storageplus.proxy;

import com.drunkripper.storageplus.registry.BlockRegistry;
import com.drunkripper.storageplus.registry.ItemRegsitry;

public class ClientProxy implements CommonProxy{

	@Override
	public void init() {
		BlockRegistry.registerRenders();
		ItemRegsitry.registerRenders();
		
	}

}
