/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.MoverType
 *  net.minecraft.entity.item.EntityTNTPrimed
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.network.datasync.DataParameter
 *  net.minecraft.network.datasync.DataSerializer
 *  net.minecraft.network.datasync.DataSerializers
 *  net.minecraft.network.datasync.EntityDataManager
 *  net.minecraft.util.EnumParticleTypes
 *  net.minecraft.world.World
 */
package com.marctron.transformersmod.entity;

import javax.annotation.Nullable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializer;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;

public class EntityEnergonCube
extends Entity {
    private static final DataParameter<Integer> FUSE = EntityDataManager.func_187226_a(EntityTNTPrimed.class, (DataSerializer)DataSerializers.field_187192_b);
    @Nullable
    private EntityLivingBase tntPlacedBy;
    private int fuse = 2;

    public EntityEnergonCube(World worldIn) {
        super(worldIn);
        this.field_70156_m = true;
        this.field_70178_ae = true;
        this.func_70105_a(0.98f, 0.98f);
    }

    public EntityEnergonCube(World worldIn, double x, double y, double z, EntityLivingBase igniter) {
        this(worldIn);
        this.func_70107_b(x, y, z);
        float f = (float)(Math.random() * (Math.PI * 2));
        this.field_70159_w = -((float)Math.sin(f)) * 0.02f;
        this.field_70181_x = 0.2f;
        this.field_70179_y = -((float)Math.cos(f)) * 0.02f;
        this.setFuse(2);
        this.field_70169_q = x;
        this.field_70167_r = y;
        this.field_70166_s = z;
        this.tntPlacedBy = igniter;
    }

    protected void func_70088_a() {
        this.field_70180_af.func_187214_a(FUSE, (Object)2);
    }

    protected boolean func_70041_e_() {
        return false;
    }

    public boolean func_70067_L() {
        return !this.field_70128_L;
    }

    public void func_70071_h_() {
        this.field_70169_q = this.field_70165_t;
        this.field_70167_r = this.field_70163_u;
        this.field_70166_s = this.field_70161_v;
        if (!this.func_189652_ae()) {
            this.field_70181_x -= (double)0.04f;
        }
        this.func_70091_d(MoverType.SELF, this.field_70159_w, this.field_70181_x, this.field_70179_y);
        this.field_70159_w *= (double)0.98f;
        this.field_70181_x *= (double)0.98f;
        this.field_70179_y *= (double)0.98f;
        if (this.field_70122_E) {
            this.field_70159_w *= (double)0.7f;
            this.field_70179_y *= (double)0.7f;
            this.field_70181_x *= -0.5;
        }
        --this.fuse;
        if (this.fuse <= 0) {
            this.func_70106_y();
            if (!this.field_70170_p.field_72995_K) {
                this.explode();
            }
        } else {
            this.func_70072_I();
            this.field_70170_p.func_175688_a(EnumParticleTypes.SMOKE_NORMAL, this.field_70165_t, this.field_70163_u + 0.5, this.field_70161_v, 0.0, 0.0, 0.0, new int[0]);
        }
    }

    private void explode() {
        float f = 4.0f;
        this.field_70170_p.func_72876_a((Entity)this, this.field_70165_t, this.field_70163_u + (double)(this.field_70131_O / 16.0f), this.field_70161_v, 10.0f, true);
    }

    protected void func_70014_b(NBTTagCompound compound) {
        compound.func_74777_a("Fuse", (short)this.getFuse());
    }

    protected void func_70037_a(NBTTagCompound compound) {
        this.setFuse(compound.func_74765_d("Fuse"));
    }

    @Nullable
    public EntityLivingBase getTntPlacedBy() {
        return this.tntPlacedBy;
    }

    public float func_70047_e() {
        return 0.0f;
    }

    public void setFuse(int fuseIn) {
        this.field_70180_af.func_187227_b(FUSE, (Object)fuseIn);
        this.fuse = fuseIn;
    }

    public void func_184206_a(DataParameter<?> key) {
        if (FUSE.equals(key)) {
            this.fuse = this.getFuseDataManager();
        }
    }

    public int getFuseDataManager() {
        return (Integer)this.field_70180_af.func_187225_a(FUSE);
    }

    public int getFuse() {
        return this.fuse;
    }
}

