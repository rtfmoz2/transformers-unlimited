/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 */
package com.marctron.transformersmod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRocket
extends ModelBase {
    public ModelRenderer shape1;

    public ModelRocket() {
        this.field_78090_t = 32;
        this.field_78089_u = 32;
        this.shape1 = new ModelRenderer((ModelBase)this, "shape1").func_78784_a(5, 6);
        this.shape1.func_78793_a(-1.3f, 22.7f, -0.5f);
        this.shape1.func_78790_a(0.0f, 0.0f, 0.0f, 2, 2, 2, 0.0f);
    }

    public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.shape1.func_78785_a(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}

