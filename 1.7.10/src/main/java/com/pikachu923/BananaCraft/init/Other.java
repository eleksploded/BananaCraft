package com.pikachu923.BananaCraft.init;

import java.util.Random;

import com.pikachu923.BananaCraft.Recipes.CraftingHandler;
import com.pikachu923.BananaCraft.reference.Reference;

import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.EntityList;
import net.minecraft.item.Item;

public class Other extends Item {
public static void init() {
	//Banana Life Core
		Tier1Items.BananaLifeCore.setContainerItem(Tier1Items.BananaLifeCore);
		Tier1Items.BananaLifeCore.setMaxStackSize(1);
		GameRegistry.registerWorldGenerator(new WorldGen(), 0);
	}
	public static void registerEntity(Class entityClass, String name)
	{
		int entityID = EntityRegistry.findGlobalUniqueEntityId();
		long seed = name.hashCode();
		Random rand = new Random(seed);
		int primaryColor = rand.nextInt() * 16777215;
		int secondaryColor = rand.nextInt() * 16777215;

		EntityRegistry.registerGlobalEntityID(entityClass, name, entityID);
		EntityRegistry.registerModEntity(entityClass, name, entityID, Reference.MOD_ID, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, primaryColor, secondaryColor));
	}
}
