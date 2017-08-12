package com.pikachu923.bananacraft.Items2;

import com.pikachu923.bananacraft.init.Tier2Tools;
import com.pikachu923.bananacraft.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class AwakenedShovel extends ItemSpade{
	String Texture;

    public AwakenedShovel(String unlocalName) {
        super(Tier2Tools.AwakenedBanana);
        this.setUnlocalizedName(Reference.RESOURCE_PREFIX + unlocalName);
        this.Texture = Reference.RESOURCE_PREFIX + unlocalName;
        this.setCreativeTab(Reference.CreativeTab);
    }

    @SideOnly(value=Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(this.Texture);
    }

    public boolean onBlockDestroyed(ItemStack p_150894_1_, World p_150894_2_, Block p_150894_3_, int p_150894_4_, int p_150894_5_, int p_150894_6_, EntityLivingBase p_150894_7_) {
    	if ((double)p_150894_3_.getBlockHardness(p_150894_2_, p_150894_4_, p_150894_5_, p_150894_6_) != 0.0D)
        {
            p_150894_1_.damageItem(1, p_150894_7_);
        }
        p_150894_7_.addPotionEffect(new PotionEffect(Potion.digSpeed.getId(), 200, 1, true));
        return true;
    }
}
