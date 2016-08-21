package com.pikachu923.BananaCraft.items;

import com.pikachu923.BananaCraft.init.Tier2Tools;
import com.pikachu923.BananaCraft.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class AwakenedHoe extends ItemHoe {
	String Texture;

    public AwakenedHoe(String unlocalName) {
        super(Tier2Tools.AwakenedBanana);
        this.setUnlocalizedName(Reference.RESOURCE_PREFIX + unlocalName);
        this.Texture = Reference.RESOURCE_PREFIX + unlocalName;
        this.setCreativeTab(Reference.CreativeTab);
    }

    @SideOnly(value=Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(this.Texture);
    }
}
