package com.pikachu923.BananaCraft;

import com.pikachu923.BananaCraft.Entity.Kuala.*;
import com.pikachu923.BananaCraft.Entity.BananaBoss.BossEntity;
import com.pikachu923.BananaCraft.Entity.BananaBoss.BossModel;
import com.pikachu923.BananaCraft.Entity.BananaBoss.BossRender;
import com.pikachu923.BananaCraft.Handler.ConfigurationHandler;
import com.pikachu923.BananaCraft.Handler.CraftingHandler;
import com.pikachu923.BananaCraft.Recipes.GemRecipes;
import com.pikachu923.BananaCraft.Recipes.Tier1Recipes;
import com.pikachu923.BananaCraft.Recipes.Tier2Recipes;
import com.pikachu923.BananaCraft.Recipes.Tier3Recipes;
import com.pikachu923.BananaCraft.armor.ArmorInit;
import com.pikachu923.BananaCraft.client.gui.GuiFactory;
import com.pikachu923.BananaCraft.init.DebugItems;
import com.pikachu923.BananaCraft.init.EntityInit;
import com.pikachu923.BananaCraft.init.Gems;
import com.pikachu923.BananaCraft.init.Other;
import com.pikachu923.BananaCraft.init.Tier1Blocks;
import com.pikachu923.BananaCraft.init.Tier1Items;
import com.pikachu923.BananaCraft.init.Tier1Tools;
import com.pikachu923.BananaCraft.init.Tier2Blocks;
import com.pikachu923.BananaCraft.init.Tier2Items;
import com.pikachu923.BananaCraft.init.Tier2Tools;
import com.pikachu923.BananaCraft.init.Tier3Items;
import com.pikachu923.BananaCraft.init.Tier3Tools;
import com.pikachu923.BananaCraft.proxy.ClientProxy;
import com.pikachu923.BananaCraft.proxy.IProxy;
import com.pikachu923.BananaCraft.proxy.ServerProxy;
import com.pikachu923.BananaCraft.reference.Reference;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraftforge.common.MinecraftForge;

/**
 * Created by pikachu on 6/20/2016.
 * Main Class
 */
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class BananaCraft {

	@Instance(Reference.MOD_ID)
	public static BananaCraft modInstance;

    @SidedProxy(clientSide = Reference.PROXYCLIENT, serverSide = Reference.PROXYSERVER)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        FMLCommonHandler.instance().bus().register(new CraftingHandler());

        //Init
        Tier1Items.init();
        Tier1Blocks.init();
        Tier1Tools.init();
        
        Tier2Items.Init();
        Tier2Blocks.Init(); 
        Tier2Tools.Init();
    
        Tier3Items.Init();
        Tier3Tools.Init();
        
        ArmorInit.init();
        
        Tier1Recipes.init();
        Tier2Recipes.Init();
        Tier3Recipes.Init();
        GemRecipes.Init();
        
        DebugItems.Init();
        
        Other.init();
        
        Gems.Init();
        
        
        proxy.registerTile();
        
        
    
    }
 
    @Mod.EventHandler
    public void Init(FMLInitializationEvent event){
    	//Recipes.init();
    	
    	//@SideOnly(Side.CLIENT)
    	proxy.registerRendering();
    	EntityInit.Init();
    	NetworkRegistry.INSTANCE.registerGuiHandler(modInstance, new GuiFactory());
    	
    }

    @Mod.EventHandler
public void PostInit(FMLPostInitializationEvent event){

    }
    
}
