package com.pikachu923.BananaCraft.client.gui;

import com.pikachu923.BananaCraft.Handler.ConfigurationHandler;
import com.pikachu923.BananaCraft.reference.Reference;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

/**
 * Created by pikac on 6/21/2016.
 */
public class ConfigGui extends GuiConfig {
    public ConfigGui(GuiScreen guiScreen) {
            super(guiScreen,
            new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
            Reference.MOD_ID,
            false,
            false,
            GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }
}
