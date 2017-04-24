package com.pikachu923.BananaCraft.Recipes;

import java.util.List;

import com.pikachu923.BananaCraft.init.Tier1Items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

public class CraftingHandler implements ICrafting {
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
	}

	public void onSmelting(EntityPlayer player, ItemStack item) {
	}

	@Override
	public void sendContainerAndContentsToPlayer(Container p_71110_1_,
			List p_71110_2_) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendSlotContents(Container p_71111_1_, int p_71111_2_,
			ItemStack p_71111_3_) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendProgressBarUpdate(Container p_71112_1_, int p_71112_2_,
			int p_71112_3_) {
		// TODO Auto-generated method stub
		
	}

}
