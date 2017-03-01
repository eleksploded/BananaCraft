package com.pikachu923.BananaCraft.items;

import com.pikachu923.BananaCraft.init.Tier1Items;
import com.pikachu923.BananaCraft.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
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
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister){
        this.itemIcon = iconRegister.registerIcon(Texture);
    }
   
    @Override 
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemstack) {
		
     return false;
     
    }
	
    @Override
    public ItemStack getContainerItem(ItemStack itemStack)
    {
    	itemStack = new ItemStack(Tier1Items.BananaLifeCore, itemStack.getMaxStackSize(), itemStack.getItemDamage());
    	itemStack.attemptDamageItem(1, null);
    	return itemStack;
    }
    

    
}
