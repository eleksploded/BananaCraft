package com.pikachu923.bananacraft.items;

import net.minecraft.item.Item;

public class DebugGem extends Item {
	public int DebugGem;
	String Texture;
    public DebugGem(String unlocalName){
        super();
        setRegistryName(unlocalName);
		setUnlocalizedName(unlocalName);
        setCreativeTab(null);
    }
    
}
