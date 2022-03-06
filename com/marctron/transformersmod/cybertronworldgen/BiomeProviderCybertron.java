/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.World
 *  net.minecraft.world.WorldType
 *  net.minecraft.world.biome.BiomeProvider
 *  net.minecraft.world.gen.layer.GenLayer
 *  net.minecraft.world.gen.layer.GenLayerVoronoiZoom
 *  net.minecraft.world.gen.layer.GenLayerZoom
 */
package com.marctron.transformersmod.cybertronworldgen;

import com.marctron.transformersmod.cybertronworldgen.GenLayerBiomesCybertron;
import com.marctron.transformersmod.init.ModBiomes;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.GenLayerVoronoiZoom;
import net.minecraft.world.gen.layer.GenLayerZoom;

public class BiomeProviderCybertron
extends BiomeProvider {
    public BiomeProviderCybertron(World world) {
        super(world.func_72912_H());
        allowedBiomes.clear();
        allowedBiomes.add(ModBiomes.CYBERTRON);
        this.func_76932_a().clear();
        this.func_76932_a().add(ModBiomes.CYBERTRON);
    }

    public GenLayer[] getModdedBiomeGenerators(WorldType worldType, long seed, GenLayer[] original) {
        GenLayerBiomesCybertron biomes = new GenLayerBiomesCybertron(1L);
        biomes = new GenLayerBiomesCybertron(1000L, biomes);
        biomes = new GenLayerZoom(1000L, (GenLayer)biomes);
        biomes = new GenLayerZoom(1001L, (GenLayer)biomes);
        biomes = new GenLayerZoom(1002L, (GenLayer)biomes);
        biomes = new GenLayerZoom(1003L, (GenLayer)biomes);
        biomes = new GenLayerZoom(1004L, (GenLayer)biomes);
        GenLayerVoronoiZoom biomeIndexLayer = new GenLayerVoronoiZoom(10L, (GenLayer)biomes);
        biomeIndexLayer.func_75905_a(seed);
        return new GenLayer[]{biomes, biomeIndexLayer};
    }
}

