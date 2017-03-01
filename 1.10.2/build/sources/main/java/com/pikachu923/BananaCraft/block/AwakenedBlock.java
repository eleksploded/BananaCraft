package com.pikachu923.BananaCraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.pikachu923.BananaCraft.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class AwakenedBlock extends BlockWrapper{
	String unlocalName;
    String Texture;
    public AwakenedBlock(String unlocalName){
        super(Material.rock);
        this.setBlockName(unlocalName);
        Texture = Reference.RESOURCE_PREFIX + unlocalName;
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister){
        this.blockIcon = iconRegister.registerIcon(Texture);
    }
    public void onEntityWalking(World par1World, int par2, int par3, int par4, Entity par5Entity) {
    	if(par5Entity instanceof EntityPlayer){
    		((EntityLivingBase) par5Entity).addPotionEffect(new PotionEffect(Potion.heal.getId(), 50, 1, true));
    	}
    }

}
