/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.EntityAgeable
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.monster.EntitySkeleton
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.SoundEvent
 *  net.minecraft.world.World
 */
package com.marctron.transformersmod.entity;

import com.marctron.transformersmod.util.handlers.LootTableHandler;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityVehicon
extends EntitySkeleton {
    public EntityVehicon(World worldIn) {
        super(worldIn);
    }

    protected void func_110147_ax() {
        super.func_110147_ax();
        this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(25.0);
        this.func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(4.0);
    }

    public EntitySkeleton createChild(EntityAgeable ageable) {
        return new EntityVehicon(this.field_70170_p);
    }

    protected ResourceLocation func_184647_J() {
        return LootTableHandler.VEHICON;
    }

    protected SoundEvent func_184639_G() {
        return super.func_184639_G();
    }

    protected SoundEvent func_184601_bQ(DamageSource source) {
        return super.func_184601_bQ(source);
    }

    protected SoundEvent func_184615_bR() {
        return super.func_184615_bR();
    }
}

