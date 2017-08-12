package com.pikachu923.bananacraft.Items1;

import com.pikachu923.bananacraft.init.Tier1Tools;
import com.pikachu923.bananacraft.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemSword;

public class BananaSword extends ItemSword{
	String Texture;
	public BananaSword(String unlocalName){
		super(Tier1Tools.Banana);
		this.setUnlocalizedName(Reference.RESOURCE_PREFIX + unlocalName);
        Texture = Reference.RESOURCE_PREFIX + "BananaSword";
        this.setCreativeTab(Reference.CreativeTab);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister){
        this.itemIcon = iconRegister.registerIcon(Texture);
    }
}
