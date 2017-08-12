package com.pikachu923.bananacraft.block;

import java.util.Random;

import com.pikachu923.bananacraft.init.Tier1Items;
import com.pikachu923.bananacraft.reference.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BananaStone extends Block{
	String unlocalName;
	String Texture;
	public BananaStone(String unlocalName){
		super(Material.ROCK);
		setRegistryName(unlocalName);
		setUnlocalizedName(unlocalName);
		Texture = Reference.RESOURCE_PREFIX + unlocalName;
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Tier1Items.BananaNugget;
	}
	public boolean canSilkHarvest() {
		return true;
	}

}


