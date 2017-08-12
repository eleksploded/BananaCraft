package com.pikachu923.bananacraft.items;

import com.pikachu923.bananacraft.reference.Reference;

import net.minecraft.item.ItemFood;

public class Banana extends ItemFood {
    String Texture;


    public Banana(int parHealAmount, float parSaturationModifier, String unlocalName) {
        super(parHealAmount, parSaturationModifier, false);
        setRegistryName(unlocalName);
		setUnlocalizedName(Reference.RESOURCE_PREFIX + unlocalName);
        setCreativeTab(Reference.CreativeTab);
    }
}



