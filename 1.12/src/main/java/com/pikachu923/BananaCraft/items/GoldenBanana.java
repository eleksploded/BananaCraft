package com.pikachu923.BananaCraft.items;

//import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

import com.pikachu923.BananaCraft.reference.Reference;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GoldenBanana extends ItemFood {
	String Texture;
    public GoldenBanana(String unlocalName, int healAmount, PotionEffect potion, float potionEffectProbability){
        super(healAmount, false);
        setPotionEffect(potion, potionEffectProbability);
        this.setUnlocalizedName(Reference.RESOURCE_PREFIX + unlocalName);
        Texture = Reference.RESOURCE_PREFIX + unlocalName;
        setAlwaysEdible();
        setCreativeTab(Reference.CreativeTab);
		setRegistryName("GoldenBanana");
    }

   /* @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister){
        this.itemIcon = iconRegister.registerIcon(Texture);
    }*/
}