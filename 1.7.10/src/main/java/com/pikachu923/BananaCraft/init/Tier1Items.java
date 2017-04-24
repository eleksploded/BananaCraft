package com.pikachu923.BananaCraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

import com.pikachu923.BananaCraft.Entity.Kuala.*;
import com.pikachu923.BananaCraft.Items1.BananaIngot;
import com.pikachu923.BananaCraft.Items1.BananaLifeCore;
import com.pikachu923.BananaCraft.Items1.ReinBanana;
import com.pikachu923.BananaCraft.items.*;
import com.pikachu923.BananaCraft.reference.Reference;

/**
 * Created by pikac on 6/21/2016.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class Tier1Items {
    public static final ItemWrapper ReinBanana = new ReinBanana("ReinBanana");
    public static final BananaIngot BananaIngot = new BananaIngot("BananaIngot");
    public static final GoldenBanana GoldenBanana = new GoldenBanana("GoldenBanana", 4, 10, 1, 10, 100F);
    public static final BananaBread BananaBread = new BananaBread("BananaBread", 10, 2.5F);
    public static final BananaLifeCore BananaLifeCore = new BananaLifeCore("BananaLifeCore");
    public static final ItemWrapper BananaNugget = new BananaNugget("BananaNugget");
    public static final ItemWrapper BananaDough = new BananaDough("BananaDough");
    public static final ItemWrapper BananaPowder = new BananaPowder("BananaPowder");
    public static final Jumps JumpWings = new Jumps("JumpWings");

    public static final Banana Banana = new Banana(2, 2, Tier1Blocks.BananaPlant, Blocks.farmland, "BananaPlant");
	
    
    public static void init() {
        GameRegistry.registerItem(ReinBanana, "ReinBanana");
        GameRegistry.registerItem(Banana, "Banana");
        GameRegistry.registerItem(BananaIngot, "BananaIngot");
        GameRegistry.registerItem(GoldenBanana, "GoldenBanana");
        GameRegistry.registerItem(BananaBread, "BananaBread");
        GameRegistry.registerItem(BananaLifeCore, "BananaLifeCore");
        GameRegistry.registerItem(BananaNugget, "BananaNugger");
        GameRegistry.registerItem(BananaDough, "BananaDough"); 
        GameRegistry.registerItem(BananaPowder, "BananaPowder");
        GameRegistry.registerItem(JumpWings, "JumpWings");
    }
}

