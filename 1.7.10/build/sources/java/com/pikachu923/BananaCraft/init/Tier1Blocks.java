package com.pikachu923.BananaCraft.init;

import com.pikachu923.BananaCraft.TileEntity.TileIngotizer;
import com.pikachu923.BananaCraft.block.BananaBlock;
import com.pikachu923.BananaCraft.block.BananaGrass;
import com.pikachu923.BananaCraft.block.BananaIngotizer;
import com.pikachu923.BananaCraft.block.BananaOre;
import com.pikachu923.BananaCraft.block.BananaPillar;
import com.pikachu923.BananaCraft.block.BananaPlant;
import com.pikachu923.BananaCraft.block.BananaSlab;
import com.pikachu923.BananaCraft.block.BananaStairs;
import com.pikachu923.BananaCraft.block.BananaStone;
import com.pikachu923.BananaCraft.block.BlockWrapper;
import com.pikachu923.BananaCraft.reference.Reference;
import com.pikachu923.BananaCraft.utility.Plants;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class Tier1Blocks {
	public static final Block BananaBlock = new BananaBlock("BananaBlock");
	public static final BlockWrapper BananaOre = new BananaOre("BananaOre");
	public static final BlockWrapper BananaStone = new BananaStone("BananaStone");
	public static final BlockWrapper BananaGrass = new BananaGrass("BananaGrass");
	public static final Plants BananaPlant = new BananaPlant();
	public static final BlockWrapper BananaPillar = new BananaPillar("BananaPillar");
	public static final BananaSlab BananaSlab = new BananaSlab(Material.rock, "BananaSlab", false);
	public static final BananaSlab BananaDoubleSlab = new BananaSlab(Material.rock, "BananaDoubleSlab", true);
	public static final BananaStairs BananaStairs = new BananaStairs(BananaBlock, 0, "BananaStairs");
	
	public static final Block BananaIngotizer = new BananaIngotizer(false, "BananaIngotizer").setCreativeTab(Reference.CreativeTab);
	public static final Block BananaIngotizerActive = new BananaIngotizer(true, "BananaIngotizer");
	
	

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
    GameRegistry.registerBlock(BananaIngotizer, "BananaIngotizer");
    GameRegistry.registerTileEntity(TileIngotizer.class, "BananaIngotizer");
    GameRegistry.registerBlock(BananaIngotizerActive, "BananaIngotizerActive");
	}
}