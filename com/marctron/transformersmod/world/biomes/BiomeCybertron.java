/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.biome.Biome
 *  net.minecraft.world.biome.Biome$BiomeProperties
 *  net.minecraft.world.biome.Biome$SpawnListEntry
 */
package com.marctron.transformersmod.world.biomes;

import com.marctron.transformersmod.entity.EntityVehicon;
import com.marctron.transformersmod.init.ModBlocks;
import net.minecraft.world.biome.Biome;

public class BiomeCybertron
extends Biome {
    public BiomeCybertron() {
        super(new Biome.BiomeProperties("Cybertron").func_185398_c(1.0f).func_185400_d(1.0f).func_185396_a().func_185410_a(1.0f).func_185402_a(16711861));
        this.field_76752_A = ModBlocks.TRANSFORMIUM_BLOCK.func_176223_P();
        this.field_76753_B = ModBlocks.TRANSFORMIUM_ORE_BLOCK.func_176223_P();
        this.field_82914_M.clear();
        this.field_76762_K.clear();
        this.field_76761_J.clear();
        this.field_76755_L.clear();
        this.field_76762_K.add(new Biome.SpawnListEntry(EntityVehicon.class, 5, 1, 5));
    }
}

