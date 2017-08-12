package com.pikachu923.BananaCraft.init;

import com.pikachu923.BananaCraft.Items1.BananaLifeCore;
import com.pikachu923.BananaCraft.Items3.*;
import com.pikachu923.BananaCraft.items.ItemWrapper;
import com.pikachu923.BananaCraft.utility.BananaRegistry;

import net.minecraft.item.Item;

public class Tier3Items {

	public static Item CorruptCore = new BananaLifeCore("CorruptCore");
	public static Item CorroptFragment = new CorruptFragment("CorruptFragment");
	public static Item CorruptIngot = new CorruptFragment("CorruptIngot");
	public static ItemWrapper Purifier = new Purifier("Purifier");
	public static ItemWrapper CorruptBanana = new CorruptBanana("CorruptBanana");
	public static ItemWrapper PurifiedBanana = new PurifiedBanana("PurifiedBanana");
	
	public static void Init() {
		BananaRegistry.registerItem(CorruptCore, "CorruptCore");
		BananaRegistry.registerItem(CorroptFragment, "CorruptFragment");
		BananaRegistry.registerItem(CorruptIngot, "CorruptIngot");
		BananaRegistry.registerItem(Purifier, "Purifier");
		BananaRegistry.registerItem(CorruptBanana, "CorruptBanana");
		BananaRegistry.registerItem(PurifiedBanana, "PurifiedBanana");
	}
}