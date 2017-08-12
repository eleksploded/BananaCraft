package com.pikachu923.bananacraft.init;

import com.pikachu923.bananacraft.block.AwakenedBlock;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class Tier2Blocks {
	public static AwakenedBlock AwakenedBlock = new AwakenedBlock("AwakenedBlock");
	
	public static void Init() {
		GameRegistry.register(AwakenedBlock);
	}

}
