/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.SoundType
 *  net.minecraft.block.material.Material
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.EnumParticleTypes
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.marctron.transformersmod.blocks;

import com.marctron.transformersmod.blocks.BlockBase;
import com.marctron.transformersmod.init.ModBlocks;
import com.marctron.transformersmod.init.ModItems;
import java.util.Random;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EnergonoreBlock
extends BlockBase {
    private final boolean isOn;

    public EnergonoreBlock(String name, Material material, boolean isOn) {
        super(name, material);
        this.func_149672_a(SoundType.field_185852_e);
        this.func_149711_c(5.0f);
        this.setHarvestLevel("pickaxe", 2);
        this.func_149715_a(0.4f);
        if (isOn) {
            this.func_149675_a(true);
        }
        this.isOn = isOn;
    }

    public Item func_180660_a(IBlockState state, Random par2Random, int par3) {
        return new ItemStack(ModItems.ENERGON_SHARD).func_77973_b();
    }

    public int func_149679_a(int fortune, Random random) {
        return 2 + random.nextInt(6);
    }

    public int func_149738_a(World worldIn) {
        return 30;
    }

    public void func_180649_a(World worldIn, BlockPos pos, EntityPlayer playerIn) {
        this.activate(worldIn, pos);
        super.func_180649_a(worldIn, pos, playerIn);
    }

    public void func_176199_a(World worldIn, BlockPos pos, Entity entityIn) {
        this.activate(worldIn, pos);
        super.func_176199_a(worldIn, pos, entityIn);
    }

    private void activate(World worldIn, BlockPos pos) {
        this.spawnParticles(worldIn, pos);
        if (this == ModBlocks.DARK_ENERGON_ORE_BLOCK) {
            worldIn.func_175656_a(pos, ModBlocks.DARK_ENERGON_ORE_BLOCK.func_176223_P());
        }
    }

    public void func_180650_b(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        if (this == ModBlocks.DARK_ENERGON_ORE_BLOCK) {
            worldIn.func_175656_a(pos, ModBlocks.DARK_ENERGON_ORE_BLOCK.func_176223_P());
        }
    }

    @SideOnly(value=Side.CLIENT)
    public void func_180655_c(IBlockState stateIn, World worldIn, BlockPos pos, Random rand) {
        if (this.isOn) {
            this.spawnParticles(worldIn, pos);
        }
    }

    private void spawnParticles(World worldIn, BlockPos pos) {
        Random random = worldIn.field_73012_v;
        double d0 = 0.0625;
        for (int i = 0; i < 6; ++i) {
            double d1 = (float)pos.func_177958_n() + random.nextFloat();
            double d2 = (float)pos.func_177956_o() + random.nextFloat();
            double d3 = (float)pos.func_177952_p() + random.nextFloat();
            if (i == 0 && !worldIn.func_180495_p(pos.func_177984_a()).func_185914_p()) {
                d2 = (double)pos.func_177956_o() + 0.0625 + 1.0;
            }
            if (i == 1 && !worldIn.func_180495_p(pos.func_177977_b()).func_185914_p()) {
                d2 = (double)pos.func_177956_o() - 0.0625;
            }
            if (i == 2 && !worldIn.func_180495_p(pos.func_177968_d()).func_185914_p()) {
                d3 = (double)pos.func_177952_p() + 0.0625 + 1.0;
            }
            if (i == 3 && !worldIn.func_180495_p(pos.func_177978_c()).func_185914_p()) {
                d3 = (double)pos.func_177952_p() - 0.0625;
            }
            if (i == 4 && !worldIn.func_180495_p(pos.func_177974_f()).func_185914_p()) {
                d1 = (double)pos.func_177958_n() + 0.0625 + 1.0;
            }
            if (i == 5 && !worldIn.func_180495_p(pos.func_177976_e()).func_185914_p()) {
                d1 = (double)pos.func_177958_n() - 0.0625;
            }
            if (!(d1 < (double)pos.func_177958_n() || d1 > (double)(pos.func_177958_n() + 1) || d2 < 0.0 || d2 > (double)(pos.func_177956_o() + 1) || d3 < (double)pos.func_177952_p()) && !(d3 > (double)(pos.func_177952_p() + 1))) continue;
            worldIn.func_175688_a(EnumParticleTypes.REDSTONE, d1, d2, d3, 0.9, 0.45, 0.77, new int[0]);
        }
    }
}

