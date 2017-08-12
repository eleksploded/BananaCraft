package com.pikachu923.bananacraft.armor;

import org.apache.logging.log4j.Level;

import com.pikachu923.bananacraft.init.Tier1Tools;
import com.pikachu923.bananacraft.reference.Reference;
import com.pikachu923.bananacraft.utility.LogHelper;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class AwakenedArmor extends ItemArmor {

	public String textureName;

	public AwakenedArmor(String unlocalizedName, ArmorMaterial material, String textureName, EntityEquipmentSlot type) {
	    super(material, 0, type);
	    this.textureName = textureName;
	    this.setUnlocalizedName(Reference.RESOURCE_PREFIX + unlocalizedName);
	    //this.setTextureName(Reference.RESOURCE_PREFIX + unlocalizedName);
	    this.setCreativeTab(Reference.CreativeTab);
	}

	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		EntityPlayer entity = null;
		EntityPlayer Player = (EntityPlayer) entity;
		ItemStack boots = ((EntityPlayer)player).inventory.armorInventory.get(0);
		ItemStack pants = ((EntityPlayer)player).inventory.armorInventory.get(1);
		ItemStack chest = ((EntityPlayer)player).inventory.armorInventory.get(2);
		ItemStack head = ((EntityPlayer)player).inventory.armorInventory.get(3);
		if(boots != null && pants != null && chest != null && head != null/* && hand != null*/)
		{
			((EntityLivingBase) player).addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 1, 1));
			((EntityLivingBase) player).addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1, 1));
;
		}
	}	
}