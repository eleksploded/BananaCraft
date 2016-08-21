package com.pikachu923.BananaCraft.init;

import com.pikachu923.BananaCraft.items.BananaAxe;
import com.pikachu923.BananaCraft.items.BananaGun;
import com.pikachu923.BananaCraft.items.BananaHoe;
import com.pikachu923.BananaCraft.items.BananaPickaxe;
import com.pikachu923.BananaCraft.items.BananaShovel;
import com.pikachu923.BananaCraft.items.BananaSword;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemBow;
import net.minecraftforge.common.util.EnumHelper;

public class Tier1Tools {
	public static ToolMaterial Banana = EnumHelper.addToolMaterial("Banana", 2, 700,  7.0F,  2.5F, 12);
	public static final BananaPickaxe BananaPickaxe = new BananaPickaxe("BananaPickaxe");
	public static final BananaSword BananaSword = new BananaSword("BananaSword");
	public static final BananaAxe BananaAxe = new BananaAxe("BananaAxe");
	public static final BananaShovel BananaShovel = new BananaShovel("BananaShovel");
	public static final BananaHoe BananaHoe = new BananaHoe("BananaHoe");
	

	public static void init(){
		GameRegistry.registerItem(BananaPickaxe, "BananaPickaxe");
		GameRegistry.registerItem(BananaSword, "BananaSword");
		GameRegistry.registerItem(BananaAxe, "BananaAxe");
		GameRegistry.registerItem(BananaShovel, "BananaShovel");
		GameRegistry.registerItem(BananaHoe, "BananaHoe");		
	}
}
