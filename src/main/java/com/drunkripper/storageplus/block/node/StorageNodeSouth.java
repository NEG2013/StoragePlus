package com.drunkripper.storageplus.block.node;

import java.util.List;

import javax.annotation.Nullable;

import com.drunkripper.storageplus.block.GBlock;
import com.google.common.base.Predicate;

import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class StorageNodeSouth extends GBlock {
	 	 
	
	
	//1 / 16 = 0.0625
	private static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0, 0, 0, 1, 0.25, 1);
	
	public StorageNodeSouth(Material materialIn, String name) {
		super(materialIn, name);
		
	}//constructor

	@Override
	public boolean isFullCube(IBlockState state) {

		return false;
	}//isFullCube
	
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {

		return false;
	}//isOpaqueCube
	
	@Override
	public BlockRenderLayer getBlockLayer() {

		return BlockRenderLayer.TRANSLUCENT;
	}//BlockRenderLayer
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {

		return BOUNDING_BOX;
	}//getBoundingBox
	
	@Override
	public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox,
			List<AxisAlignedBB> collidingBoxes, Entity entityIn) {

		super.addCollisionBoxToList(pos, entityBox, collidingBoxes, BOUNDING_BOX);;
	}//addCollisionBoxToList
	
}//class
