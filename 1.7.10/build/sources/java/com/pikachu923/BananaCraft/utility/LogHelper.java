
package com.pikachu923.BananaCraft.utility;

import cpw.mods.fml.common.FMLLog;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

public class LogHelper {
    public static Logger Log = FMLLog.getLogger();

    public static void Log(Level level, String message) {
        Log.log(level, message);
    }
}

