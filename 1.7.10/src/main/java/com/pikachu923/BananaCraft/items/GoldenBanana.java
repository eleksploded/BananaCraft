package com.pikachu923.BananaCraft.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemFood;

import com.pikachu923.BananaCraft.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GoldenBanana extends ItemFood {
	String Texture;
    public GoldenBanana(String unlocalName, int healAmount, int potionId, int potionAmplifier, int potionDuration, float potionEffectProbability){
        super(healAmount, false);
        setPotionEffect(potionId, potionDuration, potionAmplifier, potionEffectProbability);
        this.setUnlocalizedName(Reference.RESOURCE_PREFIX + unlocalName);
        Texture = Reference.RESOURCE_PREFIX + unlocalName;
        setAlwaysEdible();
        setCreativeTab(Reference.CreativeTab);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister){
        this.itemIcon = iconRegister.registerIcon(Texture);
    }
}
