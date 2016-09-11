package com.pikachu923.BananaCraft.init;

import java.util.Random;

import org.apache.logging.log4j.Level;

import com.pikachu923.BananaCraft.Projectiles.BananaBomb0.*;
import com.pikachu923.BananaCraft.Projectiles.BananaBomb1.*;
import com.pikachu923.BananaCraft.Projectiles.BananaBomb2.*;
import com.pikachu923.BananaCraft.Projectiles.BananaBomb3.*;
import com.pikachu923.BananaCraft.items.ItemWrapper;
import com.pikachu923.BananaCraft.reference.Reference;
import com.pikachu923.BananaCraft.utility.LogHelper;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import com.pikachu923.BananaCraft.items.ItemWrapper;

public class Other{
	public static final BananaBomb BananaBomb0 = new BananaBomb("BananaBomb", 5F); 
	public static final BananaBomb1 BananaBomb1 = new BananaBomb1("BananaBomb1", 7.5F); 
	public static final BananaBomb2 BananaBomb2 = new BananaBomb2("BananaBomb2", 10F); 
	public static final BananaBomb3 BananaBomb3 = new BananaBomb3("BananaBomb3", 12.5F); 
	
public static void init() {
	//Banana Life Core
		Tier1Items.BananaLifeCore.setContainerItem(Tier1Items.BananaLifeCore);
		Tier1Items.BananaLifeCore.setMaxStackSize(1);
		
		GameRegistry.registerWorldGenerator(new WorldGen(), 0);
		
		GameRegistry.registerItem(BananaBomb0, "BananaBomb");
		GameRegistry.registerItem(BananaBomb1, "BananaBomb1");
		GameRegistry.registerItem(BananaBomb2, "BananaBomb2");
		GameRegistry.registerItem(BananaBomb3, "BananaBomb3");
		
		EntityRegistry.registerGlobalEntityID(EntityBananaBomb.class, "BananaBomb", EntityRegistry.findGlobalUniqueEntityId());
	    EntityRegistry.registerModEntity(EntityBananaBomb.class, "BananaBomb", 2, Reference.MOD_ID, 256, 1, true);
	    
	    EntityRegistry.registerGlobalEntityID(EntityBananaBomb1.class, "BananaBomb1", EntityRegistry.findGlobalUniqueEntityId());
	    EntityRegistry.registerModEntity(EntityBananaBomb1.class, "BananaBomb1", 3, Reference.MOD_ID, 256, 1, true);
	    
	    EntityRegistry.registerGlobalEntityID(EntityBananaBomb2.class, "BananaBomb2", EntityRegistry.findGlobalUniqueEntityId());
	    EntityRegistry.registerModEntity(EntityBananaBomb2.class, "BananaBomb2", 4, Reference.MOD_ID, 256, 1, true);
	    
	    EntityRegistry.registerGlobalEntityID(EntityBananaBomb3.class, "BananaBomb3", EntityRegistry.findGlobalUniqueEntityId());
	    EntityRegistry.registerModEntity(EntityBananaBomb3.class, "BananaBomb3", 5, Reference.MOD_ID, 256, 1, true);
	    
	}
	

	//Functions

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
}
