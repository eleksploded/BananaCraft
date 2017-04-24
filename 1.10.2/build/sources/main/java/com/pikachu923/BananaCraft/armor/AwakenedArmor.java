package com.pikachu923.BananaCraft.armor;

import org.apache.logging.log4j.Level;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.pikachu923.BananaCraft.init.Tier1Tools;
import com.pikachu923.BananaCraft.reference.Reference;
import com.pikachu923.BananaCraft.utility.LogHelper;

public class AwakenedArmor extends ItemArmor {

	public String textureName;

	public AwakenedArmor(String unlocalizedName, ArmorMaterial material, String textureName, int type) {
	    super(material, 0, type);
	    this.textureName = textureName;
	    this.setUnlocalizedName(Reference.RESOURCE_PREFIX + unlocalizedName);
	    this.setTextureName(Reference.RESOURCE_PREFIX + unlocalizedName);
	    this.setCreativeTab(Reference.CreativeTab);
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
	    return Reference.RESOURCE_PREFIX + "textures/armor/" + this.textureName + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
	}

	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		EntityPlayer entity = null;
		EntityPlayer Player = (EntityPlayer) entity;
		ItemStack boots = ((EntityPlayer)player).inventory.armorInventory[0];
		ItemStack pants = ((EntityPlayer)player).inventory.armorInventory[1];
		ItemStack chest = ((EntityPlayer)player).inventory.armorInventory[2];
		ItemStack head = ((EntityPlayer)player).inventory.armorInventory[3];
		//@SuppressWarnings("null"
		//LogHelper.log(Level.DEBUG, hand);
		if(boots != null && pants != null && chest != null && head != null/* && hand != null*/)
		{
			((EntityLivingBase) player).addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 1, 1, true));
			((EntityLivingBase) player).addPotionEffect(new PotionEffect(Potion.jump.getId(), 1, 1, true));
;
		}
	}	
}