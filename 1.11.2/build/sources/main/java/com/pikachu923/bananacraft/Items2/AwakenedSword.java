package com.pikachu923.bananacraft.Items2;

import com.pikachu923.bananacraft.init.Tier2Tools;
import com.pikachu923.bananacraft.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.IIcon;

public class AwakenedSword
extends ItemSword {
    String Texture;

    public AwakenedSword(String unlocalName) {
        super(Tier2Tools.AwakenedBanana);
        this.setUnlocalizedName(Reference.RESOURCE_PREFIX + unlocalName);
        this.Texture = Reference.RESOURCE_PREFIX + unlocalName;
        this.setCreativeTab(Reference.CreativeTab);
    }

    @SideOnly(value=Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
    	this.itemIcon = iconRegister.registerIcon(this.Texture);
    }

    public boolean hitEntity(ItemStack p_77644_1_, EntityLivingBase p_77644_2_, EntityLivingBase p_77644_3_) {
        p_77644_2_.addPotionEffect(new PotionEffect(Potion.wither.getId(), 200, 1, false));
        p_77644_1_.damageItem(2, p_77644_3_);
        return true;
    }
}