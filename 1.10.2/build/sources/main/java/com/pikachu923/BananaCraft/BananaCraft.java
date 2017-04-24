package com.pikachu923.BananaCraft;

import com.pikachu923.BananaCraft.Entity.Kuala.EntityAbe;
import com.pikachu923.BananaCraft.Entity.Kuala.ModelAbe;
import com.pikachu923.BananaCraft.Entity.Kuala.RenderAbe;
import com.pikachu923.BananaCraft.Handler.ConfigurationHandler;
import com.pikachu923.BananaCraft.Recipes.Tier1Recipes;
import com.pikachu923.BananaCraft.Recipes.Tier2Recipes;
import com.pikachu923.BananaCraft.armor.ArmorInit;
import com.pikachu923.BananaCraft.init.EntityInit;
import com.pikachu923.BananaCraft.init.Other;
import com.pikachu923.BananaCraft.init.Tier1Blocks;
import com.pikachu923.BananaCraft.init.Tier1Items;
import com.pikachu923.BananaCraft.init.Tier1Tools;
import com.pikachu923.BananaCraft.init.Tier2Blocks;
import com.pikachu923.BananaCraft.init.Tier2Items;
import com.pikachu923.BananaCraft.init.Tier2Tools;
import com.pikachu923.BananaCraft.init.WorldGen;
import com.pikachu923.BananaCraft.proxy.IProxy;
import com.pikachu923.BananaCraft.reference.Reference;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * Created by pikachu on 6/20/2016.
 * Main Class
 */
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GuiFactory)
public class BananaCraft {

    @Mod.Instance(Reference.MOD_ID)
    public static BananaCraft instance;

    @SidedProxy(clientSide = Reference.PROXYCLIENT, serverSide = Reference.PROXYSERVER)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        //Init
        Tier1Items.init();
        Tier1Blocks.init();
        Tier1Tools.init();
        
        Tier2Items.Init();
        Tier2Blocks.Init(); 
        Tier2Tools.Init();
        
        ArmorInit.init();
        
        Tier1Recipes.init();
        Tier2Recipes.Init();
        
        EntityInit.Init();
        
        Other.init();
        
    
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event){
    	//Recipes.init();
    	
    	//@SideOnly(Side.CLIENT)
    	registerRendering();
    	
    }

    @Mod.EventHandler
public void PostInit(FMLPostInitializationEvent event){

    }
    
    @SideOnly(Side.CLIENT)
    public void registerRendering() {
		RenderingRegistry.registerEntityRenderingHandler(EntityAbe.class, new RenderAbe(new  ModelAbe(), 0.5F));
	}
}
