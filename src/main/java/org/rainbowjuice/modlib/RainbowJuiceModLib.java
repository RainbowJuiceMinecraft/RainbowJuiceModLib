package org.rainbowjuice.modlib;

import com.sun.jna.platform.win32.WinDef;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class RainbowJuiceModLib implements ModInitializer {
    public static final String MOD_ID = "RAINBOWJUICEMODLIB";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Rainbow Juice Mod Lib");
        LOGGER.info("Executing shit code");
        LOGGER.info("Executed Successfully");
        LOGGER.info("Waiting for Lags");
    }
}
