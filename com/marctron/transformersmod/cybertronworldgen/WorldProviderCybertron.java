/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.DimensionType
 *  net.minecraft.world.WorldProvider
 *  net.minecraft.world.chunk.Chunk
 */
package com.marctron.transformersmod.cybertronworldgen;

import com.marctron.transformersmod.init.CybertronWorldGen;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.Chunk;

public class WorldProviderCybertron
extends WorldProvider {
    public DimensionType func_186058_p() {
        return CybertronWorldGen.CYBERTRON_DIM_TYPE;
    }

    public boolean func_76569_d() {
        return true;
    }

    public boolean canDoLightning(Chunk chunk) {
        return true;
    }

    public boolean canDoRainSnowIce(Chunk chunk) {
        return false;
    }

    public boolean canSnowAt(BlockPos pos, boolean checkLight) {
        return false;
    }
}

