/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.ResourceLocation
 *  net.minecraftforge.fml.common.registry.GameRegistry
 */
package com.marctron.transformersmod.util.handlers;

import com.marctron.transformersmod.blocks.tileentity.TileEntityEnergonCrate;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler {
    public static void registerTileEntities() {
        GameRegistry.registerTileEntity(TileEntityEnergonCrate.class, (ResourceLocation)new ResourceLocation("tm:energon_crate_block"));
    }
}

