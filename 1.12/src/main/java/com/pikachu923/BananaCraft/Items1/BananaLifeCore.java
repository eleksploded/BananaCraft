package com.pikachu923.BananaCraft.Items1;

import com.pikachu923.BananaCraft.init.Tier1Items;
import com.pikachu923.BananaCraft.reference.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BananaLifeCore extends Item {
	String Texture;
    public BananaLifeCore(String unlocalName){
        super();
        this.setUnlocalizedName(Reference.RESOURCE_PREFIX + unlocalName);
        Texture = Reference.RESOURCE_PREFIX + unlocalName;
        setMaxDamage(256);
        setNoRepair();
        setDamage(new ItemStack(Tier1Items.BananaLifeCore), 256);
        setCreativeTab(Reference.CreativeTab);
        setRegistryName("BananaLifeCore");
    }

   /* @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister){
        this.itemIcon = iconRegister.registerIcon(Texture);
    }*/
	
    @Override
    public ItemStack getContainerItem(ItemStack itemStack)
    {
    	itemStack = new ItemStack(Tier1Items.BananaLifeCore, itemStack.getMaxStackSize(), itemStack.getItemDamage());
    	itemStack.damageItem(1, null);
    	return itemStack;
    }
    

    
}