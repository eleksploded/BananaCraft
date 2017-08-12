package com.pikachu923.bananacraft.items;

import com.pikachu923.bananacraft.reference.Reference;

public class BananaDough extends ItemWrapper {
	String Texture;
    public BananaDough(String unlocalName){
        super();
        Texture = Reference.RESOURCE_PREFIX + unlocalName;
        setRegistryName(unlocalName);
		setUnlocalizedName(unlocalName);
    }


}
