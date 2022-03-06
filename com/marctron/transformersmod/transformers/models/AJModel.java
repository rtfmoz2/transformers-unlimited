/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelBiped
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityArmorStand
 *  net.minecraft.entity.player.EntityPlayer
 */
package com.marctron.transformersmod.transformers.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.entity.player.EntityPlayer;

public class AJModel
extends ModelBiped {
    public ModelRenderer Right_Arm;
    public ModelRenderer Right_Leg;
    public ModelRenderer Head;
    public ModelRenderer Chest;
    public ModelRenderer Left_Arm;
    public ModelRenderer Left_Leg;

    public AJModel() {
        this.field_78090_t = 64;
        this.field_78089_u = 64;
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Head.func_78790_a(-4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f);
        this.Left_Arm = new ModelRenderer((ModelBase)this, 32, 32);
        this.Left_Arm.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Left_Arm.func_78790_a(-1.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f);
        this.Left_Leg = new ModelRenderer((ModelBase)this, 16, 48);
        this.Left_Leg.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Left_Leg.func_78790_a(-2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f);
        this.Right_Leg = new ModelRenderer((ModelBase)this, 0, 16);
        this.Right_Leg.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Right_Leg.func_78790_a(-2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f);
        this.Chest = new ModelRenderer((ModelBase)this, 16, 16);
        this.Chest.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Chest.func_78790_a(-4.0f, 0.0f, -2.0f, 8, 12, 4, 0.0f);
        this.Right_Arm = new ModelRenderer((ModelBase)this, 48, 32);
        this.Right_Arm.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Right_Arm.func_78790_a(-3.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f);
        this.field_78116_c.func_78792_a(this.Head);
        this.field_78115_e.func_78792_a(this.Chest);
        this.field_178724_i.func_78792_a(this.Left_Arm);
        this.field_178722_k.func_78792_a(this.Left_Leg);
        this.field_178723_h.func_78792_a(this.Right_Arm);
        this.field_178721_j.func_78792_a(this.Right_Leg);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
    }

    public void func_78087_a(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        if (entityIn instanceof EntityArmorStand) {
            EntityArmorStand entityarmorstand = (EntityArmorStand)entityIn;
            this.field_78116_c.field_78795_f = (float)Math.PI / 180 * entityarmorstand.func_175418_s().func_179415_b();
            this.field_78116_c.field_78796_g = (float)Math.PI / 180 * entityarmorstand.func_175418_s().func_179416_c();
            this.field_78116_c.field_78808_h = (float)Math.PI / 180 * entityarmorstand.func_175418_s().func_179413_d();
            this.field_78116_c.func_78793_a(0.0f, 1.0f, 0.0f);
            this.field_78115_e.field_78795_f = (float)Math.PI / 180 * entityarmorstand.func_175408_t().func_179415_b();
            this.field_78115_e.field_78796_g = (float)Math.PI / 180 * entityarmorstand.func_175408_t().func_179416_c();
            this.field_78115_e.field_78808_h = (float)Math.PI / 180 * entityarmorstand.func_175408_t().func_179413_d();
            this.field_178724_i.field_78795_f = (float)Math.PI / 180 * entityarmorstand.func_175404_u().func_179415_b();
            this.field_178724_i.field_78796_g = (float)Math.PI / 180 * entityarmorstand.func_175404_u().func_179416_c();
            this.field_178724_i.field_78808_h = (float)Math.PI / 180 * entityarmorstand.func_175404_u().func_179413_d();
            this.field_178723_h.field_78795_f = (float)Math.PI / 180 * entityarmorstand.func_175411_v().func_179415_b();
            this.field_178723_h.field_78796_g = (float)Math.PI / 180 * entityarmorstand.func_175411_v().func_179416_c();
            this.field_178723_h.field_78808_h = (float)Math.PI / 180 * entityarmorstand.func_175411_v().func_179413_d();
            this.field_178722_k.field_78795_f = (float)Math.PI / 180 * entityarmorstand.func_175403_w().func_179415_b();
            this.field_178722_k.field_78796_g = (float)Math.PI / 180 * entityarmorstand.func_175403_w().func_179416_c();
            this.field_178722_k.field_78808_h = (float)Math.PI / 180 * entityarmorstand.func_175403_w().func_179413_d();
            this.field_178722_k.func_78793_a(1.9f, 11.0f, 0.0f);
            this.field_178721_j.field_78795_f = (float)Math.PI / 180 * entityarmorstand.func_175407_x().func_179415_b();
            this.field_178721_j.field_78796_g = (float)Math.PI / 180 * entityarmorstand.func_175407_x().func_179416_c();
            this.field_178721_j.field_78808_h = (float)Math.PI / 180 * entityarmorstand.func_175407_x().func_179413_d();
            this.field_178721_j.func_78793_a(-1.9f, 11.0f, 0.0f);
            AJModel.func_178685_a((ModelRenderer)this.field_78116_c, (ModelRenderer)this.field_178720_f);
        } else {
            super.func_78087_a(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
        }
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }

    public void doTransformationAnimations(EntityPlayer player, float progress, float limbSwing, float limbSwingAmount, float ticks, float rotationYaw, float rotationPitch, boolean wearingHead, boolean wearingChest, boolean wearingLegs, boolean wearingFeet) {
        float f = 1.0f - progress;
        this.setRotateAngle(this.Head, 0.0f, 0.0f, 0.0f);
        this.setRotateAngle(this.Chest, 0.0f, 0.0f, 0.0f);
        this.setRotateAngle(this.Left_Leg, 0.0f, 0.0f, 0.0f);
        this.setRotateAngle(this.Right_Leg, 0.0f, 0.0f, 0.0f);
        this.setRotateAngle(this.Left_Arm, 0.0f, 0.0f, 0.0f);
        this.setRotateAngle(this.Right_Arm, 0.0f, 0.0f, 0.0f);
        this.Left_Leg.field_78795_f = 0.2443461f + 2.8972466f * progress;
        this.Right_Leg.field_78795_f = 0.2443461f + 2.8972466f * progress;
        this.Left_Leg.func_78793_a(-1.0f + progress / -3.0f, 6.0f + 2.5f * progress, -1.0f + 2.5f * progress);
        this.Right_Leg.func_78793_a(1.0f - progress / 3.0f, 6.0f + 2.5f * progress, -1.0f + 2.5f * progress);
        this.Left_Arm.field_78795_f = 0.2443461f + 2.8972466f * progress;
        this.Right_Arm.field_78795_f = 0.2443461f + 2.8972466f * progress;
        this.Left_Arm.func_78793_a(-1.0f + progress / -4.0f, 6.0f + 2.5f * progress, -1.0f + 2.5f * progress);
        this.Right_Arm.func_78793_a(1.0f - progress / 4.0f, 6.0f + 2.5f * progress, -1.0f + 2.5f * progress);
        this.Chest.field_78795_f = 0.2443461f + 2.8972466f * progress;
        this.Chest.func_78793_a(1.0f - progress / 0.0f, 0.0f + 2.5f * progress, -1.0f + 2.5f * progress);
        this.Head.field_78795_f = 0.2443461f + 2.8972466f * progress;
        this.Head.func_78793_a(1.0f - progress / 0.0f, 8.0f + 2.5f * progress, -1.0f + 2.5f * progress);
    }
}

