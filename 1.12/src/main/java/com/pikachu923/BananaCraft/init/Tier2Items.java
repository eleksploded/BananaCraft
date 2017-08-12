package com.pikachu923.BananaCraft.init;

import com.pikachu923.BananaCraft.Items2.AwakenedBanana;
import com.pikachu923.BananaCraft.Items2.AwakenedIngot;
import com.pikachu923.BananaCraft.items.ItemWrapper;
import com.pikachu923.BananaCraft.utility.BananaRegistry;
import com.pikachu923.BananaCraft.Items3.Spawner;

public class Tier2Items {
	public static final ItemWrapper AwakenedBanana = new AwakenedBanana("AwakenedBanana");
	public static final ItemWrapper AwakenedIngot = new AwakenedIngot("AwakenedIngot");
	public static final ItemWrapper Spawner = new Spawner("Spawner");
	
	
	

	public static void Init() {
		BananaRegistry.registerItem(AwakenedBanana, "AwakenedBanana");
		BananaRegistry.registerItem(AwakenedIngot, "AwakenedIngot");
		BananaRegistry.registerItem(Spawner, "Spawner");
	}
}
