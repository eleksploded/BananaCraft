package com.pikachu923.bananacraft.utility;

import java.util.Random;

import org.apache.logging.log4j.Level;

import com.pikachu923.bananacraft.reference.Reference;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

public class func {
	public static void removeItem(EntityPlayer ep, ItemStack removeitem) {
		IInventory inv = ep.inventory;
		for(int i=0; i < inv.getSizeInventory(); i++)
		{
			if(inv.getStackInSlot(i) != null)
			{
				ItemStack j = inv.getStackInSlot(i);
				if(j.getItem() != null && j.getItem() == removeitem.getItem())
				{
					inv.setInventorySlotContents(i, null);
				}
			}
		}
	}
	
	public static void removeItem(Entity e, ItemStack removeitem) {
		EntityPlayer ep = (EntityPlayer) e;
		IInventory inv = ep.inventory;
		for(int i=0; i < inv.getSizeInventory(); i++)
		{
			if(inv.getStackInSlot(i) != null)
			{
				ItemStack j = inv.getStackInSlot(i);
				if(j.getItem() != null && j.getItem() == removeitem.getItem())
				{
					inv.setInventorySlotContents(i, null);
				}
			}
		}
	}
	
	public static void registerEntity(Class entityClass, String name, boolean Spawns)
	{
		int entityID = EntityRegistry.findGlobalUniqueEntityId();
		long seed = name.hashCode();
		Random rand = new Random(seed);
		int primaryColor = rand.nextInt() * 16777215;
		int secondaryColor = rand.nextInt() * 16777215;

		EntityRegistry.registerGlobalEntityID(entityClass, name, entityID);
		EntityRegistry.registerModEntity(entityClass, name, entityID, Reference.MOD_ID, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, primaryColor, secondaryColor));
		if(Spawns == true) {
			EntityRegistry.addSpawn(entityClass, 6, 1, 5, EnumCreatureType.creature);
			LogHelper.Log(Level.DEBUG, "Spawn for " + name + "On");
		} else {
			LogHelper.Log(Level.DEBUG, "Spawn for " + name + "Off");
		}
	}
	
	public static void registerEntity(Class entityClass, String name, int primaryColor, int secondaryColor, boolean Spawns)
	{
		int entityID = EntityRegistry.findGlobalUniqueEntityId();
		long seed = name.hashCode();
		Random rand = new Random(seed);
		

		EntityRegistry.registerGlobalEntityID(entityClass, name, entityID);
		EntityRegistry.registerModEntity(entityClass, name, entityID, Reference.MOD_ID, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, primaryColor, secondaryColor));
		
		if(Spawns == true) {
			EntityRegistry.addSpawn(entityClass, 6, 1, 5, EnumCreatureType.creature);
			LogHelper.Log(Level.DEBUG, "Spawn for " + name + "On");
		} else {
			LogHelper.Log(Level.DEBUG, "Spawn for " + name + "Off");
		}
	}
	
	public static void registerEntityNoEgg(Class entityClass, String name, boolean Spawns)
	{
		int entityID = EntityRegistry.findGlobalUniqueEntityId();

		EntityRegistry.registerGlobalEntityID(entityClass, name, entityID);
		EntityRegistry.registerModEntity(entityClass, name, entityID, Reference.MOD_ID, 64, 1, true);
		//EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, primaryColor, secondaryColor));
		if(Spawns == true) {
			EntityRegistry.addSpawn(entityClass, 6, 1, 5, EnumCreatureType.creature);
			LogHelper.Log(Level.DEBUG, "Spawn for " + name + "On");
		} else {
			LogHelper.Log(Level.DEBUG, "Spawn for " + name + "Off");
		}
	}
}
