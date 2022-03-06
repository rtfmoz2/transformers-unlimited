/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.common.config.Configuration
 *  net.minecraftforge.fml.common.event.FMLPreInitializationEvent
 */
package com.marctron.transformersmod.util;

import com.marctron.transformersmod.Main;
import java.io.File;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ModConfiguration {
    public static Configuration config;
    public static int ENTITY_VEHICON_ID;
    public static int ENTITY_SWINDLE_ID;
    public static int DIMENSION_CYBERTRON_ID;
    public static boolean spawnCustomBiomesInOverworld;

    public static void init(File file) {
        config = new Configuration(file);
        String category = "Biomes";
        config.addCustomCategoryComment(category, "Set the ID's for the GUI's to ensure that they don't clash with other mod's ids");
        spawnCustomBiomesInOverworld = config.getBoolean("spawnCustomBiomesInOverworld", category, true, "Decide whether the custom biomes should spawn in the overworld");
    }

    public static void registerConfig(FMLPreInitializationEvent event) {
        Main.config = new File(event.getModConfigurationDirectory() + "/" + "tm");
        Main.config.mkdirs();
        ModConfiguration.init(new File(Main.config.getPath(), "tm.cfg"));
    }

    static {
        ENTITY_VEHICON_ID = 201;
        ENTITY_SWINDLE_ID = 202;
        DIMENSION_CYBERTRON_ID = 2;
        spawnCustomBiomesInOverworld = true;
    }
}

