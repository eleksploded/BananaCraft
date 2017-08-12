package com.pikachu923.bananacraft.init;

import com.pikachu923.bananacraft.Items1.BananaLifeCore;
import com.pikachu923.bananacraft.Items1.ReinBanana;
import com.pikachu923.bananacraft.items.Banana;
import com.pikachu923.bananacraft.items.BananaBread;
import com.pikachu923.bananacraft.items.BananaDough;
import com.pikachu923.bananacraft.items.BananaIngot;
import com.pikachu923.bananacraft.items.BananaNugget;
import com.pikachu923.bananacraft.items.BananaPowder;
import com.pikachu923.bananacraft.items.GoldenBanana;
import com.pikachu923.bananacraft.items.ItemWrapper;
import com.pikachu923.bananacraft.items.Jumps;
import com.pikachu923.bananacraft.reference.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by pikac on 6/21/2016.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class Tier1Items {
    public static final ItemWrapper ReinBanana = new ReinBanana("ReinBanana");
    public static final BananaIngot BananaIngot = new BananaIngot("BananaIngot");
    public static final GoldenBanana GoldenBanana = new GoldenBanana("GoldenBanana", 4);
    public static final BananaBread BananaBread = new BananaBread("BananaBread", 10, 2.5F);
    public static final BananaLifeCore BananaLifeCore = new BananaLifeCore("BananaLifeCore");
    public static final ItemWrapper BananaNugget = new BananaNugget("BananaNugget");
    public static final ItemWrapper BananaDough = new BananaDough("BananaDough");
    public static final ItemWrapper BananaPowder = new BananaPowder("BananaPowder");
    public static final Jumps JumpWings = new Jumps("JumpWings");

    public static final Banana Banana = new Banana(2, 2, "Banana");
	
    
    public static void init() {
        GameRegistry.register(ReinBanana);
        GameRegistry.register(Banana);
        GameRegistry.register(BananaIngot);
        GameRegistry.register(GoldenBanana);
        GameRegistry.register(BananaBread);
        GameRegistry.register(BananaLifeCore);
        GameRegistry.register(BananaNugget);
        GameRegistry.register(BananaDough); 
        GameRegistry.register(BananaPowder);
        GameRegistry.register(JumpWings);
    }
    
    public static void Render() {
    	registerRender(BananaIngot);
    	registerRender(Banana);
    	registerRender(ReinBanana);
    	registerRender(GoldenBanana);
    	registerRender(BananaBread);
    	registerRender(BananaLifeCore);
    	registerRender(BananaNugget);
    	registerRender(BananaDough);
    	registerRender(BananaPowder);
    	registerRender(JumpWings);
    }
    
    private static void registerRender(Item item) {
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getUnlocalizedName().substring(5), "inventory"));
    }
}

