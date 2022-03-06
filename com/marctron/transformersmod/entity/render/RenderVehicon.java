/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.renderer.entity.RenderLiving
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.util.ResourceLocation
 */
package com.marctron.transformersmod.entity.render;

import com.marctron.transformersmod.entity.EntityVehicon;
import com.marctron.transformersmod.entity.model.ModelVehicon;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class RenderVehicon
extends RenderLiving<EntityVehicon> {
    public static final ResourceLocation TEXTURES = new ResourceLocation("tm:textures/entity/vehicon.png");

    public RenderVehicon(RenderManager manager) {
        super(manager, (ModelBase)new ModelVehicon(), 0.25f);
    }

    protected ResourceLocation getEntityTexture(EntityVehicon entity) {
        return TEXTURES;
    }

    protected void applyRotations(EntityVehicon entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
        super.func_77043_a((EntityLivingBase)entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
}

