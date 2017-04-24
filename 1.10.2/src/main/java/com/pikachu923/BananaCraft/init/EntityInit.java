package com.pikachu923.BananaCraft.init;

import com.pikachu923.BananaCraft.Entity.Kuala.EntityAbe;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EnumCreatureType;

public class EntityInit {
public static void Init () {
	Other.registerEntity(EntityAbe.class, "Kuala", 8421504, 0, true);
	EntityRegistry.addSpawn(EntityAbe.class, 10, 1, 5, EnumCreatureType.creature);
	}
}
