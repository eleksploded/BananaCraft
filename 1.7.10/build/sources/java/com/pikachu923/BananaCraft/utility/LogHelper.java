
package com.pikachu923.BananaCraft.utility;

import cpw.mods.fml.common.FMLLog;

import org.apache.logging.log4j.*;

import com.pikachu923.BananaCraft.reference.Reference;

public class LogHelper {
    //public static Logger Log = FMLLog.getLogger();
	private static Logger Log = LogManager.getLogger(Reference.MOD_ID);

    public static void Log(Level level, String message) {
        Log.log(level, message);
    }
    
    public static void Log(String message) {
        Log.log(Level.INFO, message);
    }
}

