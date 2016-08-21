package com.pikachu923.BananaCraft.items;

import com.pikachu923.BananaCraft.init.Tier1Tools;
import com.pikachu923.BananaCraft.reference.Reference;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemSpade;

public class BananaShovel extends ItemSpade {

	public String Texture;
	public BananaShovel(String unlocalName) {
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

