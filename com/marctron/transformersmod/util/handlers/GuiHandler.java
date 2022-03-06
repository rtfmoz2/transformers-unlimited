/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.common.network.IGuiHandler
 */
package com.marctron.transformersmod.util.handlers;

import com.marctron.transformersmod.blocks.container.ContainerEnergonCrate;
import com.marctron.transformersmod.blocks.gui.GuiEnergonCrate;
import com.marctron.transformersmod.blocks.tileentity.TileEntityEnergonCrate;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler
implements IGuiHandler {
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == 2) {
            return new ContainerEnergonCrate(player.field_71071_by, (TileEntityEnergonCrate)world.func_175625_s(new BlockPos(x, y, z)), player);
        }
        return null;
    }

    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == 2) {
            return new GuiEnergonCrate(player.field_71071_by, (TileEntityEnergonCrate)world.func_175625_s(new BlockPos(x, y, z)), player);
        }
        return null;
    }
}

