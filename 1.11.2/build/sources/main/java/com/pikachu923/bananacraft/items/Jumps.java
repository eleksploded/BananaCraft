package com.pikachu923.bananacraft.items;

import net.minecraft.creativetab.CreativeTabs;

public class Jumps extends ItemWrapper {
	String Texture;
    public Jumps(String unlocalName){
        super();
        setRegistryName(unlocalName);
		setUnlocalizedName(unlocalName);
        setCreativeTab(CreativeTabs.MATERIALS);
    }


}
