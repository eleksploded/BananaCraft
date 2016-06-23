package com.pikachu923.BananaCraft.init;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import com.pikachu923.BananaCraft.items.*;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModTools {
	public static ToolMaterial Banana = EnumHelper.addToolMaterial("Banana", 3, 2222, 10.0F, 7.0F, 11);
	public static final BananaPickaxe BananaPickaxe = new BananaPickaxe("BananaPickaxe");
	public static final BananaSword BananaSword = new BananaSword("BananaSword");

	public static void init(){
		GameRegistry.registerItem(BananaPickaxe, "BananaPickaxe");
		GameRegistry.registerItem(BananaSword, "BananaSword");
	}
}
