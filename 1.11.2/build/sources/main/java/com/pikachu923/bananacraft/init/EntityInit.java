package com.pikachu923.bananacraft.init;

import com.pikachu923.bananacraft.Entity.BananaBoss.BossEntity;
import com.pikachu923.bananacraft.utility.func;

public class EntityInit {
public static void Init() {
	//Other.registerEntity(EntityAbe.class, "Kuala", 8421504, 0, true);
	//EntityRegistry.addSpawn(EntityAbe.class, 10, 1, 5, EnumCreatureType.creature);
	
	func.registerEntityNoEgg(BossEntity.class, "BananaBoss", false);
	//func.registerEntity(EntityBananaCreeper.class, "BananaCreeper", 16776960, 0,  true);
	}
}
