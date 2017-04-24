package com.pikachu923.BananaCraft.items;

import com.pikachu923.BananaCraft.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class DebugGem extends Item {
	public int DebugGem;
	String Texture;
    public DebugGem(String unlocalName){
        super();
        this.setUnlocalizedName(Reference.RESOURCE_PREFIX + unlocalName);
        Texture = Reference.RESOURCE_PREFIX + "CorruptCore";
        setCreativeTab(null);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister){
        this.itemIcon = iconRegister.registerIcon(Texture);
    }
    
}
