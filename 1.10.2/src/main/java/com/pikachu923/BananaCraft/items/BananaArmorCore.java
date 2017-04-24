package com.pikachu923.BananaCraft.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.pikachu923.BananaCraft.init.Tier1Items;
import com.pikachu923.BananaCraft.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BananaArmorCore extends Item {
	String Texture;
	private ItemStack emptyItem = null;
	private static int maxDamage = 256;
    public BananaArmorCore(String unlocalName){
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

