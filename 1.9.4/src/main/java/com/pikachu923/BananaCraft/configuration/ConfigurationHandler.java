package com.pikachu923.BananaCraft.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by pikac on 6/21/2016.
 */
public class ConfigurationHandler {

    public static void init(File configFile){
        Configuration configuration = new Configuration(configFile);

        try{
            configuration.load();

            boolean configValue = configuration.get("Banana_General", "configValue", true, "This is an expample").getBoolean(true);
        }
        catch (Exception e){

        }
        finally {
            configuration.save();
        }
    };
}
