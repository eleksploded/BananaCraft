package com.pikachu923.BananaCraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

import com.pikachu923.BananaCraft.Entity.Kuala.EntityAbe;
import com.pikachu923.BananaCraft.items.*;
import com.pikachu923.BananaCraft.reference.Reference;

/**
 * Created by pikac on 6/21/2016.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class Tier1Items {
    public static final ItemWrapper ReinBanana = new ReinBanana("ReinBanana");
    public static final BananaArmorCore BananaArmorCore = new BananaArmorCore("BananaArmorCore");
    public static final GoldenBanana GoldenBanana = new GoldenBanana("GoldenBanana", 4, true, 10, 1, 10, 100F);
    public static final BananaBread BananaBread = new BananaBread("BananaBread", 10, 2.5F);
    public static final BananaLifeCore BananaLifeCore = new BananaLifeCore("BananaLifeCore");
    public static final ItemWrapper BananaNugget = new BananaNugget("BananaNugget");
    public static final ItemWrapper BananaDough = new BananaDough("BananaDough");

    public static final Banana Banana = new Banana(2, 2, Tier1Blocks.BananaPlant, Blocks.farmland, "BananaPlant");
	
    
    public static void init() {
        GameRegistry.registerItem(ReinBanana, "ReinBanana");
        GameRegistry.registerItem(Banana, "Banana");
        GameRegistry.registerItem(BananaArmorCore, "BananaArmorCore");
        GameRegistry.registerItem(GoldenBanana, "GoldenBanana");
        GameRegistry.registerItem(BananaBread, "BananaBread");
        GameRegistry.registerItem(BananaLifeCore, "BananaLifeCore");
        GameRegistry.registerItem(BananaNugget, "BananaNugger");
        GameRegistry.registerItem(BananaDough, "BananaDough"); 
        
    }
}

