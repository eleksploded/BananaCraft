package com.pikachu923.BananaCraft.init;

import com.pikachu923.BananaCraft.block.AwakenedBlock;
import com.pikachu923.BananaCraft.block.BlockWrapper;

import cpw.mods.fml.common.registry.GameRegistry;

public class Tier2Blocks {
	public static AwakenedBlock AwakenedBlock = new AwakenedBlock("AwakenedBlock");
	
	public static void Init() {
		GameRegistry.registerBlock(AwakenedBlock, "AwakenedBlock");
	}

}
