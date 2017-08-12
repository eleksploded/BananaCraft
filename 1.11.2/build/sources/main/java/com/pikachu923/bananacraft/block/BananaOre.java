package com.pikachu923.bananacraft.block;

import com.pikachu923.bananacraft.reference.Reference;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BananaOre extends BlockWrapper {

	String unlocalName;
	String Texture;
	public BananaOre(String unlocalName){
		super();
		setRegistryName(unlocalName);
		setUnlocalizedName(unlocalName);
		Texture = Reference.RESOURCE_PREFIX + unlocalName;
	}


}
