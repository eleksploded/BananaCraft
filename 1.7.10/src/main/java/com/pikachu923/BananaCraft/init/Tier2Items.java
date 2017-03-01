package com.pikachu923.BananaCraft.init;

import com.pikachu923.BananaCraft.items.AwakenedIngot;
import com.pikachu923.BananaCraft.items.AwakenedBanana;
import com.pikachu923.BananaCraft.items.ItemWrapper;
import com.pikachu923.BananaCraft.items.Spawner;

import cpw.mods.fml.common.registry.GameRegistry;

public class Tier2Items {
	public static final ItemWrapper AwakenedBanana = new AwakenedBanana("AwakenedBanana");
	public static final ItemWrapper AwakenedIngot = new AwakenedIngot("AwakenedIngot");
	public static final ItemWrapper Spawner = new Spawner("Spawner");
	
	
	

	public static void Init() {
		GameRegistry.registerItem(AwakenedBanana, "AwakenedBanana");
		GameRegistry.registerItem(AwakenedIngot, "AwakenedIngot");
		GameRegistry.registerItem(Spawner, "Spawner");
	}
}
