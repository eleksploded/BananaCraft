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

public class BananaLifeCore extends Item {
	String Texture;
    public BananaLifeCore(String unlocalName){
        super();
        this.setUnlocalizedName(Reference.RESOURCE_PREFIX + unlocalName);
        Texture = Reference.RESOURCE_PREFIX + unlocalName;
        setMaxDamage(257);
        setNoRepair();
        setDamage(new ItemStack(Tier1Items.BananaLifeCore), 256);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister){
        this.itemIcon = iconRegister.registerIcon(Texture);
    }
    /*public void takenFromCrafting(EntityPlayer player, ItemStack item, IInventory matrix)
    {
    	 for(int i=0; i<matrix.getSizeInventory(); i++)
    {		
    	 if(matrix.getStackInSlot(i) != null)
    	 {
    	 ItemStack itemnew = matrix.getStackInSlot(i);
    	 if(itemnew != null && itemnew.getItem() == ModItems.BananaLifeCore)
    	 {
    	 ItemStack k = new ItemStack(ModItems.BananaLifeCore, 2);
    	 k.damageItem(itemnew.getItemDamage(), 1, player);
    	 matrix.setInventorySlotContents(i, k);
    	 }
    	 }	
    }
    }*/
    @Override 
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemstack) {
		
     return false;
     
    }
	
	public ItemStack getContainerItemStack(ItemStack itemStack) {
		
	     itemStack.setItemDamage(itemStack.getItemDamage() + 1);
	     
	     	return itemStack;
	     	
	    }
	 //public int hasContainerItem(ItemStack stack)
	 //   {
	//	 if(getItemDamage() != 256){
	 //       return stack.getItemDamage() + 1;
	//	 }
	//    }
	///*
	public void onCrafting(EntityPlayer player, ItemStack item, IInventory craftMatrix) {
		for (int i = 0; i < craftMatrix.getSizeInventory(); i++) // Checks all
																	// the slots
		{
			if (craftMatrix.getStackInSlot(i) != null) // If there is an item
			{
				ItemStack j = craftMatrix.getStackInSlot(i); // Gets the item
				if (j.getItem() != null && j.getItem() == Tier1Items.BananaLifeCore) 
				{
					ItemStack k = new ItemStack(Tier1Items.BananaLifeCore, 2, (j.getItemDamage() + 1)); 
					if (k.getItemDamage() >= k.getMaxDamage()) { 
						k.stackSize--; 
					}
					craftMatrix.setInventorySlotContents(i, k);
				}
			}
		}
	}//*/
}
