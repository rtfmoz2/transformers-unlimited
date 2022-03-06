/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelBiped
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 */
package com.marctron.transformersmod.transformers.models.altmodes;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class AJModelAlt
extends ModelBiped {
    public ModelRenderer Right_Arm;
    public ModelRenderer Right_Leg;
    public ModelRenderer Head;
    public ModelRenderer Chest;
    public ModelRenderer Left_Arm;
    public ModelRenderer Left_Leg;

    public AJModelAlt() {
        this.field_78090_t = 64;
        this.field_78089_u = 64;
        this.Left_Leg = new ModelRenderer((ModelBase)this, 16, 48);
        this.Left_Leg.func_78793_a(-3.0f, 6.0f, 0.0f);
        this.Left_Leg.func_78790_a(-2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f);
        this.setRotateAngle(this.Left_Leg, -1.5707964f, 0.0f, 0.0f);
        this.Left_Arm = new ModelRenderer((ModelBase)this, 32, 32);
        this.Left_Arm.func_78793_a(-4.0f, 6.0f, 0.0f);
        this.Left_Arm.func_78790_a(-1.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f);
        this.setRotateAngle(this.Left_Arm, 1.5707964f, 0.0f, 0.0f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.func_78793_a(0.0f, 8.0f, 0.0f);
        this.Head.func_78790_a(-4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f);
        this.Chest = new ModelRenderer((ModelBase)this, 16, 16);
        this.Chest.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Chest.func_78790_a(-4.0f, 0.0f, -2.0f, 8, 12, 4, 0.0f);
        this.Right_Arm = new ModelRenderer((ModelBase)this, 48, 32);
        this.Right_Arm.func_78793_a(4.0f, 6.0f, 0.0f);
        this.Right_Arm.func_78790_a(-3.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f);
        this.setRotateAngle(this.Right_Arm, 1.5707964f, 0.0f, 0.0f);
        this.Right_Leg = new ModelRenderer((ModelBase)this, 0, 16);
        this.Right_Leg.func_78793_a(3.0f, 6.0f, 0.0f);
        this.Right_Leg.func_78790_a(-2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f);
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

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}

