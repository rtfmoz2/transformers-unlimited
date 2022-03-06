/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.projectile.ProjectileHelper
 *  net.minecraft.nbt.NBTBase
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.nbt.NBTTagList
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.EnumParticleTypes
 *  net.minecraft.util.datafix.DataFixer
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.World
 *  net.minecraftforge.event.ForgeEventFactory
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.marctron.transformersmod.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.ProjectileHelper;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class EntityRocket
extends Entity {
    public EntityLivingBase shootingEntity;
    private int ticksAlive;
    private int ticksInAir;
    public double accelerationX;
    public double accelerationY;
    public double accelerationZ;

    public EntityRocket(World worldIn) {
        super(worldIn);
        this.func_70105_a(1.0f, 1.0f);
    }

    protected void func_70088_a() {
    }

    @SideOnly(value=Side.CLIENT)
    public boolean func_70112_a(double distance) {
        double d0 = this.func_174813_aQ().func_72320_b() * 4.0;
        if (Double.isNaN(d0)) {
            d0 = 4.0;
        }
        return distance < (d0 *= 64.0) * d0;
    }

    public EntityRocket(World worldIn, double x, double y, double z, double accelX, double accelY, double accelZ) {
        super(worldIn);
        this.func_70105_a(1.0f, 1.0f);
        this.func_70012_b(x, y, z, this.field_70177_z, this.field_70125_A);
        this.func_70107_b(x, y, z);
        double d0 = MathHelper.func_76133_a((double)(accelX * accelX + accelY * accelY + accelZ * accelZ));
        this.accelerationX = accelX / d0 * 0.1;
        this.accelerationY = accelY / d0 * 0.1;
        this.accelerationZ = accelZ / d0 * 0.1;
    }

    public EntityRocket(World worldIn, EntityLivingBase shooter, double accelX, double accelY, double accelZ) {
        super(worldIn);
        this.shootingEntity = shooter;
        this.func_70105_a(1.0f, 1.0f);
        this.func_70012_b(shooter.field_70165_t, shooter.field_70163_u, shooter.field_70161_v, shooter.field_70177_z, shooter.field_70125_A);
        this.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
        this.field_70159_w = 0.0;
        this.field_70181_x = 0.0;
        this.field_70179_y = 0.0;
        double d0 = MathHelper.func_76133_a((double)((accelX += this.field_70146_Z.nextGaussian() * 0.4) * accelX + (accelY += this.field_70146_Z.nextGaussian() * 0.4) * accelY + (accelZ += this.field_70146_Z.nextGaussian() * 0.4) * accelZ));
        this.accelerationX = accelX / d0 * 0.1;
        this.accelerationY = accelY / d0 * 0.1;
        this.accelerationZ = accelZ / d0 * 0.1;
    }

    public void func_70071_h_() {
        if (this.field_70170_p.field_72995_K || (this.shootingEntity == null || !this.shootingEntity.field_70128_L) && this.field_70170_p.func_175667_e(new BlockPos((Entity)this))) {
            super.func_70071_h_();
            ++this.ticksInAir;
            RayTraceResult raytraceresult = ProjectileHelper.func_188802_a((Entity)this, (boolean)true, (this.ticksInAir >= 25 ? 1 : 0) != 0, (Entity)this.shootingEntity);
            if (raytraceresult != null && !ForgeEventFactory.onProjectileImpact((Entity)this, (RayTraceResult)raytraceresult)) {
                this.onImpact(raytraceresult);
            }
            this.field_70165_t += this.field_70159_w;
            this.field_70163_u += this.field_70181_x;
            this.field_70161_v += this.field_70179_y;
            ProjectileHelper.func_188803_a((Entity)this, (float)0.2f);
            float f = this.getMotionFactor();
            if (this.func_70090_H()) {
                for (int i = 0; i < 4; ++i) {
                    float f1 = 0.25f;
                    this.field_70170_p.func_175688_a(EnumParticleTypes.WATER_BUBBLE, this.field_70165_t - this.field_70159_w * 0.25, this.field_70163_u - this.field_70181_x * 0.25, this.field_70161_v - this.field_70179_y * 0.25, this.field_70159_w, this.field_70181_x, this.field_70179_y, new int[0]);
                }
                f = 0.8f;
            }
            this.field_70159_w += this.accelerationX;
            this.field_70181_x += this.accelerationY;
            this.field_70179_y += this.accelerationZ;
            this.field_70159_w *= (double)f;
            this.field_70181_x *= (double)f;
            this.field_70179_y *= (double)f;
            this.field_70170_p.func_175688_a(this.getParticleType(), this.field_70165_t, this.field_70163_u + 0.5, this.field_70161_v, 0.0, 0.0, 0.0, new int[0]);
            this.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
        } else {
            this.func_70106_y();
        }
    }

    protected boolean isFireballFiery() {
        return true;
    }

    protected EnumParticleTypes getParticleType() {
        return EnumParticleTypes.SMOKE_NORMAL;
    }

    protected float getMotionFactor() {
        return 0.95f;
    }

    protected abstract void onImpact(RayTraceResult var1);

    public static void registerFixesFireball(DataFixer fixer, String name) {
    }

    public void func_70014_b(NBTTagCompound compound) {
        compound.func_74782_a("direction", (NBTBase)this.func_70087_a(new double[]{this.field_70159_w, this.field_70181_x, this.field_70179_y}));
        compound.func_74782_a("power", (NBTBase)this.func_70087_a(new double[]{this.accelerationX, this.accelerationY, this.accelerationZ}));
        compound.func_74768_a("life", this.ticksAlive);
    }

    public void func_70037_a(NBTTagCompound compound) {
        NBTTagList nbttaglist;
        if (compound.func_150297_b("power", 9) && (nbttaglist = compound.func_150295_c("power", 6)).func_74745_c() == 3) {
            this.accelerationX = nbttaglist.func_150309_d(0);
            this.accelerationY = nbttaglist.func_150309_d(1);
            this.accelerationZ = nbttaglist.func_150309_d(2);
        }
        this.ticksAlive = compound.func_74762_e("life");
        if (compound.func_150297_b("direction", 9) && compound.func_150295_c("direction", 6).func_74745_c() == 3) {
            NBTTagList nbttaglist1 = compound.func_150295_c("direction", 6);
            this.field_70159_w = nbttaglist1.func_150309_d(0);
            this.field_70181_x = nbttaglist1.func_150309_d(1);
            this.field_70179_y = nbttaglist1.func_150309_d(2);
        } else {
            this.func_70106_y();
        }
    }

    public boolean func_70067_L() {
        return true;
    }

    public float func_70111_Y() {
        return 1.0f;
    }

    public boolean func_70097_a(DamageSource source, float amount) {
        if (this.func_180431_b(source)) {
            return false;
        }
        this.func_70018_K();
        if (source.func_76346_g() != null) {
            Vec3d vec3d = source.func_76346_g().func_70040_Z();
            if (vec3d != null) {
                this.field_70159_w = vec3d.field_72450_a;
                this.field_70181_x = vec3d.field_72448_b;
                this.field_70179_y = vec3d.field_72449_c;
                this.accelerationX = this.field_70159_w * 0.1;
                this.accelerationY = this.field_70181_x * 0.1;
                this.accelerationZ = this.field_70179_y * 0.1;
            }
            if (source.func_76346_g() instanceof EntityLivingBase) {
                this.shootingEntity = (EntityLivingBase)source.func_76346_g();
            }
            return true;
        }
        return false;
    }

    public float func_70013_c() {
        return 1.0f;
    }

    @SideOnly(value=Side.CLIENT)
    public int func_70070_b() {
        return 0xF000F0;
    }
}

