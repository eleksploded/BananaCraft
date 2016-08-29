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
        this.setUnlocalizedName(unlocalName);
        Texture = Reference.RESOURCE_PREFIX + unlocalName;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister){
        this.itemIcon = iconRegister.registerIcon(Texture);
    }
    
    public void onUpdate(ItemStack p_77663_1_, World p_77663_2_, Entity p_77663_3_, int p_77663_4_, boolean p_77663_5_) {
    	super.onUpdate(p_77663_1_, p_77663_2_, p_77663_3_, p_77663_4_, p_77663_5_);
    	DebugGem = 1;
    }
}
