package com.pikachu923.BananaCraft.Items3;

import com.pikachu923.BananaCraft.init.Tier1Items;
import com.pikachu923.BananaCraft.items.ItemWrapper;
import com.pikachu923.BananaCraft.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Purifier extends ItemWrapper {
	String Texture;
    public Purifier(String unlocalName){
        super();
        this.setUnlocalizedName(unlocalName);
        Texture = Reference.RESOURCE_PREFIX + unlocalName;
        setMaxDamage(4);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister){
        this.itemIcon = iconRegister.registerIcon(Texture);
    }
    
    public void onUpdate(ItemStack p_77663_1_, World p_77663_2_, Entity player, int p_77663_4_, boolean p_77663_5_) {
    	((EntityLivingBase) player).addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 1, 1));
    }
    
    @Override
    public ItemStack getContainerItem(ItemStack itemStack)
    {
    	itemStack = new ItemStack(this, itemStack.getMaxStackSize(), itemStack.getItemDamage());
    	itemStack.attemptDamageItem(1, null);
    	return itemStack;
    }
}