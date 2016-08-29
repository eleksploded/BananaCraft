package com.pikachu923.BananaCraft.init;

import net.minecraft.item.Item;
import com.pikachu923.BananaCraft.items.BananaLifeCore;
import com.pikachu923.BananaCraft.items.CorruptFragment;

import cpw.mods.fml.common.registry.GameRegistry;

public class Tier3Items {

	public static Item CorruptCore = new BananaLifeCore("CorruptCore");
	public static Item CorroptFragment = new CorruptFragment("CorruptFragment");
	
	public static void Init() {
		GameRegistry.registerItem(CorruptCore, "CorruptCore");
		GameRegistry.registerItem(CorroptFragment, "CorruptFragment");
	}
}
