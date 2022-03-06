/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.biome.Biome
 *  net.minecraft.world.gen.layer.GenLayer
 *  net.minecraft.world.gen.layer.IntCache
 */
package com.marctron.transformersmod.cybertronworldgen;

import com.marctron.transformersmod.init.ModBiomes;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerBiomesCybertron
extends GenLayer {
    protected Biome[] allowedBiomes = new Biome[]{ModBiomes.CYBERTRON};

    public GenLayerBiomesCybertron(long seed, GenLayer genlayer) {
        super(seed);
        this.field_75909_a = genlayer;
    }

    public GenLayerBiomesCybertron(long seed) {
        super(seed);
    }

    public int[] func_75904_a(int x, int z, int width, int depth) {
        int[] dest = IntCache.func_76445_a((int)(width * depth));
        for (int dz = 0; dz < depth; ++dz) {
            for (int dx = 0; dx < width; ++dx) {
                this.func_75903_a(dx + x, dz + z);
                dest[dx + dz * width] = Biome.func_185362_a((Biome)this.allowedBiomes[this.func_75902_a(this.allowedBiomes.length)]);
            }
        }
        return dest;
    }
}

