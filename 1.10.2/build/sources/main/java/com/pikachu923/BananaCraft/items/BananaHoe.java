package com.pikachu923.BananaCraft.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;

import com.pikachu923.BananaCraft.init.Tier1Tools;
import com.pikachu923.BananaCraft.reference.Reference;

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
