package com.pikachu923.BananaCraft.init;

import net.minecraft.block.material.Material;

import com.pikachu923.BananaCraft.block.BananaBlock;
import com.pikachu923.BananaCraft.block.BananaOre;
import com.pikachu923.BananaCraft.block.BananaStone;
import com.pikachu923.BananaCraft.block.BlockWrapper;
import com.pikachu923.BananaCraft.reference.Reference;
import com.pikachu923.BananaCraft.utility.Plants;
import com.pikachu923.BananaCraft.block.*;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class Tier1Blocks {
	public static final BlockWrapper BananaBlock = new BananaBlock("BananaBlock");
	public static final BlockWrapper BananaOre = new BananaOre("BananaOre");
	public static final BlockWrapper BananaStone = new BananaStone("BananaStone");
	public static final BlockWrapper BananaGrass = new BananaGrass("BananaGrass");
	public static final Plants BananaPlant = new BananaPlant();
	public static final BlockWrapper BananaPillar = new BananaPillar("BananaPillar");
	public static final BananaSlab BananaSlab = new BananaSlab(Material.rock, "BananaSlab", false);
	public static final BananaSlab BananaDoubleSlab = new BananaSlab(Material.rock, "BananaDoubleSlab", true);
	public static final BananaStairs BananaStairs = new BananaStairs(BananaBlock, 0, "BananaStairs");
	

public static void init() {
    GameRegistry.registerBlock(BananaBlock, "BananaBlock");
    GameRegistry.registerBlock(BananaOre, "BananaOre");
    GameRegistry.registerBlock(BananaStone, "BananaStone");
    GameRegistry.registerBlock(BananaGrass, "BananaGrass");
    GameRegistry.registerBlock(BananaPlant, "BananaPlant");
    GameRegistry.registerBlock(BananaPillar, "BananaPillar");
    GameRegistry.registerBlock(BananaSlab, "BananaSlab");
    GameRegistry.registerBlock(BananaDoubleSlab, "BananaDoubleSlab");
    GameRegistry.registerBlock(BananaStairs, "BananaStairs");
	}
}