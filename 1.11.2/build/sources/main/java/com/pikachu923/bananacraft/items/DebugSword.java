package com.pikachu923.bananacraft.items;

import com.pikachu923.bananacraft.init.DebugItems;

import net.minecraft.item.ItemSword;

public class DebugSword extends ItemSword{
	String Texture;
	public DebugSword(String unlocalName){
		super(DebugItems.Debug);
		setRegistryName(unlocalName);
		setUnlocalizedName(unlocalName);
        setCreativeTab(null);
    }


}
