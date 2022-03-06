/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.material.Material
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 */
package com.marctron.transformersmod.blocks;

import com.marctron.transformersmod.blocks.BlockBase;
import com.marctron.transformersmod.commands.util.CustomTeleporter;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SpaceBridgeBlock
extends BlockBase {
    public SpaceBridgeBlock(String name) {
        super(name, Material.field_151576_e);
    }

    public boolean func_180639_a(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (!worldIn.field_72995_K) {
            CustomTeleporter.teleportToDimension(playerIn, 4, playerIn.func_180425_c().func_177958_n(), playerIn.func_180425_c().func_177956_o() + 5, playerIn.func_180425_c().func_177952_p());
            return true;
        }
        return false;
    }
}

