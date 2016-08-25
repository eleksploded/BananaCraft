package com.pikachu923.BananaCraft.Projectiles;

import com.pikachu923.BananaCraft.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class Projectile extends Item {
    
    private String texturePath = "BananaCraft:";
    
    public Projectile(String textureName)
    {
        super();
        this.setUnlocalizedName(Reference.RESOURCE_PREFIX + textureName);
        this.setCreativeTab(CreativeTabs.tabMaterials);
        texturePath += textureName;
    }

@Override   
@SideOnly(Side.CLIENT)

    public void registerIcons(IIconRegister iconRegister)
    {
        this.itemIcon = iconRegister.registerIcon(texturePath);
    }   
    
/**
 * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
 */
public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
{
    if (!par3EntityPlayer.capabilities.isCreativeMode)
    {
        --par1ItemStack.stackSize;
    }

    par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

    if (!par2World.isRemote)
    {
        par2World.spawnEntityInWorld(new EntityProjectile(par2World, par3EntityPlayer));
    }

    return par1ItemStack;
}

}

