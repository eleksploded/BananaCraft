package com.pikachu923.BananaCraft.init;

import com.pikachu923.BananaCraft.items.DebugGem;
import com.pikachu923.BananaCraft.items.DebugSword;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class Debug {
	public static ToolMaterial Debug = EnumHelper.addToolMaterial("Debug", 2, 700,  7.0F,  12904F, 12);
	public static final DebugSword DebugSword = new DebugSword("DebugSword");
	public static final DebugGem DebugGem = new DebugGem("DebugGem");
	
	public static void Init() {
		GameRegistry.registerItem(DebugSword, "DebugSword");
		GameRegistry.registerItem(DebugGem, "DebugGem");
		
	}
}