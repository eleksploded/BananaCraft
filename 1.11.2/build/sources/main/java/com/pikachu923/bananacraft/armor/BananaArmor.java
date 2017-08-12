package com.pikachu923.bananacraft.armor;

import com.pikachu923.bananacraft.reference.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class BananaArmor extends ItemArmor {

	public String textureName;

	public BananaArmor(String unlocalizedName, ArmorMaterial material, String textureName, EntityEquipmentSlot type) {
	    super(material, 0, type);
	    this.textureName = textureName;
	    this.setUnlocalizedName(Reference.RESOURCE_PREFIX + unlocalizedName);
	    //this.setTextureName(Reference.RESOURCE_PREFIX + unlocalizedName);
	    this.setCreativeTab(Reference.CreativeTab);
	}

}
