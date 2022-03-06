/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.fml.common.FMLLog
 *  org.apache.logging.log4j.Level
 */
package com.marctron.transformersmod.util;

import net.minecraftforge.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

public class LogHelper {
    public static void log(Level logLevel, Object object) {
        FMLLog.log((String)"tm", (Level)logLevel, (String)String.valueOf(object), (Object[])new Object[0]);
    }

    public static void all(Object object) {
        LogHelper.log(Level.ALL, object);
    }

    public static void debug(Object object) {
        LogHelper.log(Level.DEBUG, object);
    }

    public static void error(Object object) {
        LogHelper.log(Level.ERROR, object);
    }

    public static void fatal(Object object) {
        LogHelper.log(Level.FATAL, object);
    }

    public static void info(Object object) {
        LogHelper.log(Level.INFO, object);
    }

    public static void off(Object object) {
        LogHelper.log(Level.OFF, object);
    }

    public static void trace(Object object) {
        LogHelper.log(Level.TRACE, object);
    }

    public static void warn(Object object) {
        LogHelper.log(Level.WARN, object);
    }
}

