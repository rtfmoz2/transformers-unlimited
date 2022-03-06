/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.datafix.DataFixer
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.world.World
 *  net.minecraftforge.event.ForgeEventFactory
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.marctron.transformersmod.entity;

import com.marctron.transformersmod.entity.EntityRocket;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityLargeRocket
extends EntityRocket {
    public int explosionPower = 1;

    public EntityLargeRocket(World worldIn) {
        super(worldIn);
    }

    @SideOnly(value=Side.CLIENT)
    public EntityLargeRocket(World worldIn, double x, double y, double z, double accelX, double accelY, double accelZ) {
        super(worldIn, x, y, z, accelX, accelY, accelZ);
    }

    public EntityLargeRocket(World worldIn, EntityLivingBase shooter, double accelX, double accelY, double accelZ) {
        super(worldIn, shooter, accelX, accelY, accelZ);
    }

    @Override
    protected void onImpact(RayTraceResult result) {
        if (!this.field_70170_p.field_72995_K) {
            if (result.field_72308_g != null) {
                result.field_72308_g.func_70097_a(DamageSource.func_188403_a((Entity)this, (EntityLivingBase)this.shootingEntity), this.field_70140_Q);
                this.func_174815_a(this.shootingEntity, result.field_72308_g);
            }
            boolean flag = ForgeEventFactory.getMobGriefingEvent((World)this.field_70170_p, (Entity)this.shootingEntity);
            this.field_70170_p.func_72885_a((Entity)null, this.field_70165_t, this.field_70163_u, this.field_70161_v, (float)this.explosionPower, flag, flag);
            this.func_70106_y();
        }
    }

    public static void registerFixesLargeFireball(DataFixer fixer) {
        EntityLargeRocket.registerFixesFireball(fixer, "Rocket");
    }

    @Override
    public void func_70014_b(NBTTagCompound compound) {
        super.func_70014_b(compound);
        compound.func_74768_a("ExplosionPower", this.explosionPower);
    }

    @Override
    public void func_70037_a(NBTTagCompound compound) {
        super.func_70037_a(compound);
        if (compound.func_150297_b("ExplosionPower", 99)) {
            this.explosionPower = compound.func_74762_e("ExplosionPower");
        }
    }
}

