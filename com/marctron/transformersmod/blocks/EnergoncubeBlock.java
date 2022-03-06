/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.SoundType
 *  net.minecraft.block.material.Material
 *  net.minecraft.block.properties.IProperty
 *  net.minecraft.block.properties.PropertyBool
 *  net.minecraft.block.state.BlockStateContainer
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.projectile.EntityArrow
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Items
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.Explosion
 *  net.minecraft.world.World
 */
package com.marctron.transformersmod.blocks;

import com.marctron.transformersmod.blocks.BlockBase;
import com.marctron.transformersmod.entity.EntityBullet;
import com.marctron.transformersmod.entity.EntityEnergonCube;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class EnergoncubeBlock
extends BlockBase {
    public static final PropertyBool EXPLODE = PropertyBool.func_177716_a((String)"explode");

    public EnergoncubeBlock(String name, Material material) {
        super(name, material);
        this.func_149672_a(SoundType.field_185852_e);
        this.func_149711_c(5.0f);
        this.setHarvestLevel("pickaxe", 2);
        this.func_149715_a(0.6f);
    }

    public void func_176213_c(World worldIn, BlockPos pos, IBlockState state) {
        super.func_176213_c(worldIn, pos, state);
        if (worldIn.func_175640_z(pos)) {
            this.func_176206_d(worldIn, pos, state.func_177226_a((IProperty)EXPLODE, (Comparable)Boolean.valueOf(true)));
            worldIn.func_175698_g(pos);
        }
    }

    public void func_189540_a(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {
        if (worldIn.func_175640_z(pos)) {
            this.func_176206_d(worldIn, pos, state.func_177226_a((IProperty)EXPLODE, (Comparable)Boolean.valueOf(true)));
            worldIn.func_175698_g(pos);
        }
    }

    public void func_180652_a(World worldIn, BlockPos pos, Explosion explosionIn) {
        if (!worldIn.field_72995_K) {
            EntityEnergonCube entityenergoncube = new EntityEnergonCube(worldIn, (float)pos.func_177958_n() + 0.5f, pos.func_177956_o(), (float)pos.func_177952_p() + 0.5f, explosionIn.func_94613_c());
            entityenergoncube.setFuse((short)(worldIn.field_73012_v.nextInt(entityenergoncube.getFuse() / 1) + entityenergoncube.getFuse() / 4));
            worldIn.func_72838_d((Entity)entityenergoncube);
        }
    }

    public void func_176206_d(World worldIn, BlockPos pos, IBlockState state) {
        this.explode(worldIn, pos, state, null);
    }

    public void explode(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase igniter) {
        if (!worldIn.field_72995_K && ((Boolean)state.func_177229_b((IProperty)EXPLODE)).booleanValue()) {
            EntityEnergonCube entityenergoncube = new EntityEnergonCube(worldIn, (float)pos.func_177958_n() + 0.5f, pos.func_177956_o(), (float)pos.func_177952_p() + 0.5f, igniter);
            worldIn.func_72838_d((Entity)entityenergoncube);
        }
    }

    public boolean func_180639_a(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        ItemStack itemstack = playerIn.func_184586_b(hand);
        if (!(itemstack.func_190926_b() || itemstack.func_77973_b() != Items.field_151033_d && itemstack.func_77973_b() != Items.field_151059_bz)) {
            this.explode(worldIn, pos, state.func_177226_a((IProperty)EXPLODE, (Comparable)Boolean.valueOf(true)), (EntityLivingBase)playerIn);
            worldIn.func_180501_a(pos, Blocks.field_150350_a.func_176223_P(), 11);
            if (itemstack.func_77973_b() == Items.field_151033_d) {
                itemstack.func_77972_a(1, (EntityLivingBase)playerIn);
            } else if (!playerIn.field_71075_bZ.field_75098_d) {
                itemstack.func_190918_g(1);
            }
            return true;
        }
        return super.func_180639_a(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
    }

    public void func_180634_a(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
        EntityArrow entityarrow;
        EntityBullet entitybullet;
        if (!worldIn.field_72995_K && entityIn instanceof EntityBullet && (entitybullet = (EntityBullet)entityIn).func_70089_S()) {
            this.explode(worldIn, pos, worldIn.func_180495_p(pos).func_177226_a((IProperty)EXPLODE, (Comparable)Boolean.valueOf(true)), entitybullet.shooter instanceof EntityLivingBase ? (EntityLivingBase)entitybullet.shooter : null);
            worldIn.func_175698_g(pos);
        }
        if (!worldIn.field_72995_K && entityIn instanceof EntityArrow && !(entityarrow = (EntityArrow)entityIn).func_70027_ad()) {
            this.explode(worldIn, pos, worldIn.func_180495_p(pos).func_177226_a((IProperty)EXPLODE, (Comparable)Boolean.valueOf(true)), entityarrow.field_70250_c instanceof EntityLivingBase ? (EntityLivingBase)entityarrow.field_70250_c : null);
            worldIn.func_175698_g(pos);
        }
    }

    public boolean func_149659_a(Explosion explosionIn) {
        return false;
    }

    public IBlockState func_176203_a(int meta) {
        return this.func_176223_P().func_177226_a((IProperty)EXPLODE, (Comparable)Boolean.valueOf((meta & 1) > 0));
    }

    public int func_176201_c(IBlockState state) {
        return (Boolean)state.func_177229_b((IProperty)EXPLODE) != false ? 1 : 0;
    }

    protected BlockStateContainer func_180661_e() {
        return new BlockStateContainer((Block)this, new IProperty[]{EXPLODE});
    }
}

