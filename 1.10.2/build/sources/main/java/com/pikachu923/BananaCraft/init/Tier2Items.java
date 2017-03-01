package com.pikachu923.BananaCraft.init;

import com.pikachu923.BananaCraft.items.AwakenedArmorCore;
import com.pikachu923.BananaCraft.items.AwakenedBanana;
import com.pikachu923.BananaCraft.items.ItemWrapper;

import cpw.mods.fml.common.registry.GameRegistry;

public class Tier2Items {
	public static final ItemWrapper AwakenedBanana = new AwakenedBanana("AwakenedBanana");
	public static final ItemWrapper AwakenedArmorCore = new AwakenedArmorCore("AwakenedArmorCore");
	
	
	
	

	public static void Init() {
		GameRegistry.registerItem(AwakenedBanana, "AwakenedBanana");
		GameRegistry.registerItem(AwakenedArmorCore, "AwakenedArmorCore");
	}
}
