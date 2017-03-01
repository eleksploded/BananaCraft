package com.pikachu923.BananaCraft.init;

import com.pikachu923.BananaCraft.items.*;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class Tier3Items {

	public static Item CorruptCore = new BananaLifeCore("CorruptCore");
	public static Item CorroptFragment = new CorruptFragment("CorruptFragment");
	public static Item CorruptIngot = new CorruptFragment("CorruptIngot");
	public static ItemWrapper Purifier = new Purifier("Purifier");
	public static ItemWrapper CorruptBanana = new CorruptBanana("CorruptBanana");
	public static ItemWrapper PurifiedBanana = new PurifiedBanana("PurifiedBanana");
	
	public static void Init() {
		GameRegistry.registerItem(CorruptCore, "CorruptCore");
		GameRegistry.registerItem(CorroptFragment, "CorruptFragment");
		GameRegistry.registerItem(CorruptIngot, "CorruptIngot");
		GameRegistry.registerItem(Purifier, "Purifier");
		GameRegistry.registerItem(CorruptBanana, "CorruptBanana");
		GameRegistry.registerItem(PurifiedBanana, "PurifiedBanana");
	}
}