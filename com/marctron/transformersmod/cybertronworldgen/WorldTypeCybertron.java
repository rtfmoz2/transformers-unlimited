/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiCreateWorld
 *  net.minecraft.server.MinecraftServer
 *  net.minecraft.world.World
 *  net.minecraft.world.WorldServer
 *  net.minecraft.world.WorldType
 *  net.minecraft.world.biome.BiomeProvider
 *  net.minecraft.world.gen.IChunkGenerator
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.marctron.transformersmod.cybertronworldgen;

import com.marctron.transformersmod.cybertronworldgen.BiomeProviderCybertron;
import com.marctron.transformersmod.cybertronworldgen.ChunkGeneratorCybertron;
import java.util.Random;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiCreateWorld;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WorldTypeCybertron
extends WorldType {
    public WorldTypeCybertron() {
        super("cybertron");
        System.out.println("Constructing WorldTypeCybertron");
    }

    public BiomeProvider getBiomeProvider(World world) {
        return new BiomeProviderCybertron(world);
    }

    public IChunkGenerator getChunkGenerator(World world, String generatorOptions) {
        return new ChunkGeneratorCybertron(world);
    }

    public int getMinimumSpawnHeight(World world) {
        return world.func_181545_F() + 1;
    }

    public double getHorizon(World world) {
        return 63.0;
    }

    public double voidFadeMagnitude() {
        return 0.03125;
    }

    public boolean handleSlimeSpawnReduction(Random random, World world) {
        return false;
    }

    public void onGUICreateWorldPress() {
    }

    public int getSpawnFuzz(WorldServer world, MinecraftServer server) {
        return Math.max(0, server.func_184108_a(world));
    }

    @SideOnly(value=Side.CLIENT)
    public void onCustomizeButton(Minecraft mc, GuiCreateWorld guiCreateWorld) {
    }

    public boolean isCustomizable() {
        return false;
    }

    @SideOnly(value=Side.CLIENT)
    public boolean func_151357_h() {
        return true;
    }

    public float getCloudHeight() {
        return 150.0f;
    }
}

