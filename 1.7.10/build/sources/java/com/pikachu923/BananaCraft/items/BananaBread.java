package com.pikachu923.BananaCraft.items;

import com.pikachu923.BananaCraft.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemFood;

public class BananaBread extends ItemFood {
	String Texture;
    public BananaBread(String unlocalName, int parHealAmount, float parSaturationModifier){
        super(parHealAmount, parSaturationModifier, false);
        this.setUnlocalizedName(Reference.RESOURCE_PREFIX + unlocalName);
        Texture = Reference.RESOURCE_PREFIX + unlocalName;
        setCreativeTab(Reference.CreativeTab);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister){
        this.itemIcon = iconRegister.registerIcon(Texture);
    }
}
