package com.pikachu923.bananacraft.items;

import com.pikachu923.bananacraft.reference.Reference;

import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.PotionEffect;

public class GoldenBanana extends ItemFood {
	String Texture;
    public GoldenBanana(String unlocalName, int healAmount){
        super(healAmount, false);
        setPotionEffect(new PotionEffect(MobEffects.REGENERATION,200,1), 100F);
        setRegistryName(unlocalName);
		setUnlocalizedName(Reference.RESOURCE_PREFIX + unlocalName);
        setAlwaysEdible();
        setCreativeTab(Reference.CreativeTab);
    }


}
