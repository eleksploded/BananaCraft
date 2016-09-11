package com.pikachu923.BananaCraft.init;

import net.minecraft.item.Item;
import com.pikachu923.BananaCraft.items.BananaLifeCore;
import com.pikachu923.BananaCraft.items.CorruptFragment;
import com.pikachu923.BananaCraft.items.ItemWrapper;

import cpw.mods.fml.common.registry.GameRegistry;

public class Tier3Items {

	public static Item CorruptCore = new BananaLifeCore("CorruptCore");
	public static Item CorroptFragment = new CorruptFragment("CorruptFragment");
	public static Item CorruptIngot = new CorruptFragment("CorruptIngot");
	
	public static void Init() {
		GameRegistry.registerItem(CorruptCore, "CorruptCore");
		GameRegistry.registerItem(CorroptFragment, "CorruptFragment");
		GameRegistry.registerItem(CorruptIngot, "CorruptIngot");
	}
}
