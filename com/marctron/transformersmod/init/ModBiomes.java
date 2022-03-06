/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.biome.Biome
 *  net.minecraftforge.common.BiomeDictionary
 *  net.minecraftforge.common.BiomeDictionary$Type
 *  net.minecraftforge.common.BiomeManager
 *  net.minecraftforge.common.BiomeManager$BiomeEntry
 *  net.minecraftforge.common.BiomeManager$BiomeType
 *  net.minecraftforge.fml.common.registry.ForgeRegistries
 *  net.minecraftforge.registries.IForgeRegistryEntry
 */
package com.marctron.transformersmod.init;

import com.marctron.transformersmod.util.ModConfiguration;
import com.marctron.transformersmod.world.biomes.BiomeCybertron;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistryEntry;

public class ModBiomes {
    public static final Biome CYBERTRON = new BiomeCybertron();

    public static void registerBiomes() {
        ModBiomes.initBiome(CYBERTRON, "Cybertron", BiomeManager.BiomeType.WARM, BiomeDictionary.Type.HILLS, BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.DRY);
    }

    private static Biome initBiome(Biome biome, String name, BiomeManager.BiomeType biomeType, BiomeDictionary.Type ... types) {
        biome.setRegistryName(name);
        ForgeRegistries.BIOMES.register((IForgeRegistryEntry)biome);
        BiomeDictionary.addTypes((Biome)biome, (BiomeDictionary.Type[])types);
        BiomeManager.addBiome((BiomeManager.BiomeType)biomeType, (BiomeManager.BiomeEntry)new BiomeManager.BiomeEntry(biome, 10));
        if (ModConfiguration.spawnCustomBiomesInOverworld) {
            BiomeManager.addSpawnBiome((Biome)biome);
        }
        return biome;
    }
}

