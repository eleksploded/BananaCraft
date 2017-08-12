package com.pikachu923.bananacraft.Handler;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

import com.pikachu923.bananacraft.reference.Reference;

/**
 * Created by pikac on 6/21/2016.
 */
public class ConfigurationHandler {

    public static Configuration configuration;
    //configs
    public static boolean testValue = false;
    //end configs

    public static void init(File configFile) {
        if (configuration == null) {
            configuration = new Configuration(configFile);
            loadConfig();
        }
    }


    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
            loadConfig();
        }
    }
    private static void loadConfig(){
        testValue = configuration.getBoolean("TestValue", Configuration.CATEGORY_GENERAL, false, "Test Value");

        if (configuration.hasChanged()){
            configuration.save();
        }
    }
}

