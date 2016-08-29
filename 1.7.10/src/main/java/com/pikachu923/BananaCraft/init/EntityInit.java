package com.pikachu923.BananaCraft.init;

import com.pikachu923.BananaCraft.Entity.EntityAbe;
import com.pikachu923.BananaCraft.Entity.BananaBoss.BossEntity;

import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.EnumCreatureType;

public class EntityInit {
	//public final static Class KualaClass = com.pikachu923.BananaCraft.Entity.EntityAbe.class;
	@SideOnly(Side.CLIENT)
public static void Init() {
	Other.registerEntity(EntityAbe.class, "Kuala", 8421504, 0, true);
	EntityRegistry.addSpawn(EntityAbe.class, 10, 1, 5, EnumCreatureType.creature);
	
	Other.registerEntity(BossEntity.class, "BananaBoss", false);
	}
}
