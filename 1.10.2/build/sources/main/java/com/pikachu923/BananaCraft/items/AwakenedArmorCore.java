package com.pikachu923.BananaCraft.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;

import com.pikachu923.BananaCraft.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class AwakenedArmorCore extends ItemWrapper {
	String Texture;
    public AwakenedArmorCore(String unlocalName){
        super();
        this.setUnlocalizedName(unlocalName);
        Texture = Reference.RESOURCE_PREFIX + unlocalName;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister){
        this.itemIcon = iconRegister.registerIcon(Texture);
    }

}
