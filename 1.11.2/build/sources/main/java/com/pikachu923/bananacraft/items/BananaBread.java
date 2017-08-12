package com.pikachu923.bananacraft.items;

import com.pikachu923.bananacraft.reference.Reference;

import net.minecraft.item.ItemFood;

public class BananaBread extends ItemFood {
	String Texture;
    public BananaBread(String unlocalName, int parHealAmount, float parSaturationModifier){
        super(parHealAmount, parSaturationModifier, false);
        setRegistryName(unlocalName);
		setUnlocalizedName(Reference.RESOURCE_PREFIX + unlocalName);        
        setCreativeTab(Reference.CreativeTab);
    }

}
