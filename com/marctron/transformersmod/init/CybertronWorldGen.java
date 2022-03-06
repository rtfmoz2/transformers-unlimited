/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.world.DimensionType
 *  net.minecraft.world.WorldType
 *  net.minecraftforge.common.DimensionManager
 */
package com.marctron.transformersmod.init;

import com.marctron.transformersmod.cybertronworldgen.WorldProviderCybertron;
import com.marctron.transformersmod.cybertronworldgen.WorldTypeCybertron;
import javax.annotation.Nullable;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.DimensionManager;

public class CybertronWorldGen {
    public static final String CYBERTRON_NAME = "cybertron";
    public static final int CYBERTRON_DIM_ID = CybertronWorldGen.findFreeDimensionID();
    public static final DimensionType CYBERTRON_DIM_TYPE = DimensionType.register((String)"cybertron", (String)"_cybertron", (int)CYBERTRON_DIM_ID, WorldProviderCybertron.class, (boolean)false);
    public static final WorldType CYBERTRON_WORLD_TYPE = new WorldTypeCybertron();

    public static final void registerDimensions() {
        DimensionManager.registerDimension((int)CYBERTRON_DIM_ID, (DimensionType)CYBERTRON_DIM_TYPE);
    }

    @Nullable
    private static Integer findFreeDimensionID() {
        for (int i = 2; i < Integer.MAX_VALUE; ++i) {
            if (DimensionManager.isDimensionRegistered((int)i)) continue;
            System.out.println("Found free dimension ID = " + i);
            return i;
        }
        System.out.println("ERROR: Could not find free dimension ID");
        return null;
    }
}

