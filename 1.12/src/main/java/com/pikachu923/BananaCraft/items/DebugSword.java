package com.pikachu923.BananaCraft.items;

import com.pikachu923.BananaCraft.init.DebugItems;
import com.pikachu923.BananaCraft.init.Tier1Tools;
import com.pikachu923.BananaCraft.reference.Reference;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
//import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemSword;

public class DebugSword extends ItemSword{
	String Texture;
	public DebugSword(String unlocalName){
		super(DebugItems.Debug);
		this.setUnlocalizedName(Reference.RESOURCE_PREFIX + unlocalName);
        Texture = Reference.RESOURCE_PREFIX + "AwakenedSword";
        setCreativeTab(null);
    }

    /*@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister){
        this.itemIcon = iconRegister.registerIcon(Texture);
    }*/
}
