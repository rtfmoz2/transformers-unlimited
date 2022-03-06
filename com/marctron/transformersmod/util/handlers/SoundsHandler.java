/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.SoundEvent
 *  net.minecraftforge.fml.common.registry.ForgeRegistries
 *  net.minecraftforge.registries.IForgeRegistryEntry
 */
package com.marctron.transformersmod.util.handlers;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistryEntry;

public class SoundsHandler {
    public static SoundEvent TRANSFORMONE;
    public static SoundEvent TRANSFORMTWO;

    public static void init() {
        TRANSFORMONE = SoundsHandler.registerSound("transformation.transformone");
        TRANSFORMTWO = SoundsHandler.registerSound("transformation.transformtwo");
    }

    public static SoundEvent registerSound(String name) {
        ResourceLocation location = new ResourceLocation("tm", name);
        SoundEvent event = new SoundEvent(location);
        event.setRegistryName(name);
        ForgeRegistries.SOUND_EVENTS.register((IForgeRegistryEntry)event);
        return event;
    }
}

