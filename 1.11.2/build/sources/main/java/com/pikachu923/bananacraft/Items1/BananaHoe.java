package com.pikachu923.bananacraft.Items1;

import com.pikachu923.bananacraft.init.Tier1Tools;
import com.pikachu923.bananacraft.reference.Reference;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;

public class BananaHoe extends ItemHoe {

	public String Texture;
	public BananaHoe(String unlocalName) {
		super(Tier1Tools.Banana);
		this.setUnlocalizedName(Reference.RESOURCE_PREFIX + unlocalName);
        Texture = Reference.RESOURCE_PREFIX + unlocalName;
        this.setCreativeTab(Reference.CreativeTab);
		// TODO Auto-generated constructor stub
	}
	public void registerIcons(IIconRegister iconRegister){
        this.itemIcon = iconRegister.registerIcon(Texture);
    }
}
