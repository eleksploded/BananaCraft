package com.pikachu923.BananaCraft.init;

import com.pikachu923.BananaCraft.block.AwakenedBlock;
import com.pikachu923.BananaCraft.block.BlockWrapper;
import com.pikachu923.BananaCraft.utility.BananaRegistry;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.entity.Render;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.IForgeRegistry;


public class Tier2Blocks {
	public static AwakenedBlock AwakenedBlock = new AwakenedBlock("AwakenedBlock");
	
	public static void Init() {
		//BananaRegistry.registerBlock(AwakenedBlock, "AwakenedBlock");
	}
	
	public static void register(final RegistryEvent.Register<Block> event) {
		final IForgeRegistry<Block> registry = event.getRegistry();
		
		registry.register(AwakenedBlock);

	}
	
	public static void Renders(final RegistryEvent.Register<Block> event) {		
		final IForgeRegistry<Block> registry = event.getRegistry();

	}
	
}
