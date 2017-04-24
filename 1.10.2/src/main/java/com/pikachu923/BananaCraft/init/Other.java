package com.pikachu923.BananaCraft.init;

import java.util.Random;

import org.apache.logging.log4j.Level;

import com.pikachu923.BananaCraft.reference.Reference;
import com.pikachu923.BananaCraft.utility.LogHelper;

import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class Other{
public static void init() {
	//Banana Life Core
		Tier1Items.BananaLifeCore.setContainerItem(Tier1Items.BananaLifeCore);
		Tier1Items.BananaLifeCore.setMaxStackSize(1);
		GameRegistry.registerWorldGenerator(new WorldGen(), 0);
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
		
		//if(Spawns == true) {
			EntityRegistry.addSpawn(entityClass, 6, 1, 5, EnumCreatureType.creature);
		//	LogHelper.Log(Level.DEBUG, "true");
		//} else {
		//	LogHelper.Log(Level.DEBUG, "false");
		//}
	}
}
