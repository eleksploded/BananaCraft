package com.pikachu923.bananacraft.Items1;

import com.pikachu923.bananacraft.init.Tier1Items;
import com.pikachu923.bananacraft.reference.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BananaLifeCore extends Item {
	String Texture;
    public BananaLifeCore(String unlocalName){
        super();
        setRegistryName(unlocalName);
		setUnlocalizedName(Reference.RESOURCE_PREFIX + unlocalName);
        setMaxDamage(256);
        setNoRepair();
        setDamage(new ItemStack(Tier1Items.BananaLifeCore), 256);
        setCreativeTab(Reference.CreativeTab);
    }

	
    @Override
    public ItemStack getContainerItem(ItemStack itemStack)
    {
    	itemStack = new ItemStack(Tier1Items.BananaLifeCore, itemStack.getMaxStackSize(), itemStack.getItemDamage());
    	itemStack.attemptDamageItem(1, null);
    	return itemStack;
    }
    

    
}
