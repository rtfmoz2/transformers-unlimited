/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelBiped
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityArmorStand
 */
package com.marctron.transformersmod.transformers.models.vehicon;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;

public final class ModelCustomArmor
extends ModelBiped {
    public ModelRenderer Head1;
    public ModelRenderer Right_Arm;
    public ModelRenderer Chest;
    public ModelRenderer Left_Arm;
    public ModelRenderer Right_Leg;
    public ModelRenderer Left_Leg;
    public ModelRenderer Head_1;
    public ModelRenderer Head_2;
    public ModelRenderer Head_3;
    public ModelRenderer Head_4;
    public ModelRenderer Head_5;
    public ModelRenderer Head_6;
    public ModelRenderer Head_7;
    public ModelRenderer Head_8;
    public ModelRenderer Head_9;
    public ModelRenderer Head_10;
    public ModelRenderer Head_11;
    public ModelRenderer shape85;
    public ModelRenderer Right_Shoulder_1;
    public ModelRenderer Right_Shoulder_;
    public ModelRenderer Right_Shoulder__1;
    public ModelRenderer shape79;
    public ModelRenderer shape83;
    public ModelRenderer shape84;
    public ModelRenderer shape88;
    public ModelRenderer shape89;
    public ModelRenderer shape92;
    public ModelRenderer shape92_1;
    public ModelRenderer Croach_1;
    public ModelRenderer Croach_2;
    public ModelRenderer Left_Ab;
    public ModelRenderer Right_Ab;
    public ModelRenderer Middle_Ab;
    public ModelRenderer Chest_Up;
    public ModelRenderer Chest_Down;
    public ModelRenderer Chest_1;
    public ModelRenderer Chest_2;
    public ModelRenderer Chest_3;
    public ModelRenderer Chest_4;
    public ModelRenderer Chest_5;
    public ModelRenderer Chest_6;
    public ModelRenderer Chest_7;
    public ModelRenderer Chest_8;
    public ModelRenderer Chest_9;
    public ModelRenderer Chest_10;
    public ModelRenderer Back;
    public ModelRenderer Back_Wheel_Left;
    public ModelRenderer Back_Wheel_Right;
    public ModelRenderer shape96;
    public ModelRenderer shape97;
    public ModelRenderer Left_Shoulder_1;
    public ModelRenderer Left_Shoulder_2;
    public ModelRenderer Left_Shoulder_3;
    public ModelRenderer shape79_1;
    public ModelRenderer shape83_1;
    public ModelRenderer shape84_1;
    public ModelRenderer shape88_1;
    public ModelRenderer shape89_1;
    public ModelRenderer shape92_2;
    public ModelRenderer shape92_3;
    public ModelRenderer Right_Lower_Leg;
    public ModelRenderer Right_Foot_1;
    public ModelRenderer Right_Foot_2;
    public ModelRenderer Right_Leg_Back_1;
    public ModelRenderer Right_Leg_Back_11;
    public ModelRenderer Right_Leg_Back_2;
    public ModelRenderer Right_Leg_Back_22;
    public ModelRenderer Left_Leg_Wheel;
    public ModelRenderer Knee_Right;
    public ModelRenderer Right_Lower_Leg_1;
    public ModelRenderer Right_Lower_Leg_2;
    public ModelRenderer Right_Leg_2;
    public ModelRenderer Left_Lower_Leg;
    public ModelRenderer Left_Foot_1;
    public ModelRenderer Left_Foot_2;
    public ModelRenderer Left_Leg_Back_1;
    public ModelRenderer Left_Leg_Back_11;
    public ModelRenderer Left_Leg_Back_2;
    public ModelRenderer Left_Leg_Back_22;
    public ModelRenderer Left_Leg_Wheel_1;
    public ModelRenderer Knee_Left;
    public ModelRenderer Left_Lower_Leg_1;
    public ModelRenderer Left_Lower_Leg_2;
    public ModelRenderer Left_Leg_2;

    public ModelCustomArmor() {
        this.field_78090_t = 128;
        this.field_78089_u = 64;
        this.Head_11 = new ModelRenderer((ModelBase)this, 0, 58);
        this.Head_11.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Head_11.func_78790_a(-1.0f, -2.4f, 0.5f, 2, 2, 1, 0.0f);
        this.setRotateAngle(this.Head_11, -0.27314404f, 0.0f, 0.0f);
        this.Left_Shoulder_3 = new ModelRenderer((ModelBase)this, 114, 61);
        this.Left_Shoulder_3.field_78809_i = true;
        this.Left_Shoulder_3.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Left_Shoulder_3.func_78790_a(0.5f, -1.6f, -1.8f, 1, 1, 1, 0.0f);
        this.setRotateAngle(this.Left_Shoulder_3, 0.0f, -0.7853982f, 0.7853982f);
        this.Left_Leg_2 = new ModelRenderer((ModelBase)this, 0, 56);
        this.Left_Leg_2.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Left_Leg_2.func_78790_a(0.4f, -1.6f, -1.5f, 1, 2, 2, 0.0f);
        this.setRotateAngle(this.Left_Leg_2, 0.0f, 0.0f, 0.4537856f);
        this.Right_Shoulder_1 = new ModelRenderer((ModelBase)this, 0, 57);
        this.Right_Shoulder_1.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Right_Shoulder_1.func_78790_a(-2.6f, -4.1f, -1.2f, 1, 4, 2, 0.0f);
        this.setRotateAngle(this.Right_Shoulder_1, 0.0f, 0.0f, 0.20943952f);
        this.Head_10 = new ModelRenderer((ModelBase)this, 0, 59);
        this.Head_10.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Head_10.func_78790_a(-1.5f, -2.9f, 1.5f, 3, 2, 1, 0.0f);
        this.setRotateAngle(this.Head_10, 0.4098033f, 0.0f, 0.0f);
        this.Left_Leg = new ModelRenderer((ModelBase)this, 0, 55);
        this.Left_Leg.field_78809_i = true;
        this.Left_Leg.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Left_Leg.func_78790_a(-0.8f, -0.1f, -1.5f, 2, 6, 2, 0.0f);
        this.setRotateAngle(this.Left_Leg, -0.0f, 0.0f, (float)(-Math.PI) / 180);
        this.Left_Leg_Wheel_1 = new ModelRenderer((ModelBase)this, 116, 52);
        this.Left_Leg_Wheel_1.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Left_Leg_Wheel_1.func_78790_a(-0.7f, 5.7f, -2.2f, 2, 4, 4, 0.0f);
        this.setRotateAngle(this.Left_Leg_Wheel_1, 0.1308997f, 0.0f, 0.0f);
        this.Head1 = new ModelRenderer((ModelBase)this, 0, 61);
        this.Head1.func_78793_a(0.1f, 0.0f, 0.0f);
        this.Head1.func_78790_a(-0.9f, -2.0f, 0.0f, 2, 2, 1, 0.0f);
        this.Right_Ab = new ModelRenderer((ModelBase)this, 0, 56);
        this.Right_Ab.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Right_Ab.func_78790_a(-2.8f, 5.3f, -1.7f, 2, 4, 3, 0.0f);
        this.setRotateAngle(this.Right_Ab, 0.0f, 0.0f, -0.10471976f);
        this.shape79 = new ModelRenderer((ModelBase)this, 0, 56);
        this.shape79.func_78793_a(0.0f, 0.0f, 0.0f);
        this.shape79.func_78790_a(-1.5f, 2.0f, -1.2f, 2, 2, 2, 0.0f);
        this.shape92_1 = new ModelRenderer((ModelBase)this, 0, 57);
        this.shape92_1.func_78793_a(0.0f, 0.0f, 0.0f);
        this.shape92_1.func_78790_a(-0.5f, 8.8f, -1.2f, 1, 2, 2, 0.0f);
        this.Right_Leg_Back_2 = new ModelRenderer((ModelBase)this, 0, 55);
        this.Right_Leg_Back_2.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Right_Leg_Back_2.func_78790_a(0.7f, 7.3f, 5.0f, 1, 2, 2, 0.0f);
        this.setRotateAngle(this.Right_Leg_Back_2, -0.55850536f, 0.0f, 0.0f);
        this.Left_Lower_Leg = new ModelRenderer((ModelBase)this, 0, 54);
        this.Left_Lower_Leg.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Left_Lower_Leg.func_78790_a(-1.8f, 5.0f, -2.0f, 4, 7, 3, 0.0f);
        this.Left_Lower_Leg_2 = new ModelRenderer((ModelBase)this, 113, 60);
        this.Left_Lower_Leg_2.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Left_Lower_Leg_2.func_78790_a(0.5f, 5.9f, -3.1f, 1, 3, 1, 0.0f);
        this.setRotateAngle(this.Left_Lower_Leg_2, 0.0f, -0.5934119f, 0.20943952f);
        this.Head_2 = new ModelRenderer((ModelBase)this, 121, 62);
        this.Head_2.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Head_2.func_78790_a(-1.5f, -2.7f, -0.8f, 3, 1, 1, 0.0f);
        this.shape92 = new ModelRenderer((ModelBase)this, 0, 60);
        this.shape92.func_78793_a(0.0f, 0.0f, 0.0f);
        this.shape92.func_78790_a(-1.4f, 9.0f, -1.2f, 1, 2, 2, 0.0f);
        this.Left_Leg_Wheel = new ModelRenderer((ModelBase)this, 116, 52);
        this.Left_Leg_Wheel.field_78809_i = true;
        this.Left_Leg_Wheel.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Left_Leg_Wheel.func_78790_a(-1.1f, 5.7f, -2.2f, 2, 4, 4, 0.0f);
        this.setRotateAngle(this.Left_Leg_Wheel, 0.1308997f, 0.0f, 0.0f);
        this.Left_Foot_1 = new ModelRenderer((ModelBase)this, 0, 57);
        this.Left_Foot_1.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Left_Foot_1.func_78790_a(-1.3f, 11.0f, -3.2f, 3, 1, 6, 0.0f);
        this.shape88_1 = new ModelRenderer((ModelBase)this, 0, 54);
        this.shape88_1.func_78793_a(0.0f, 0.0f, 0.0f);
        this.shape88_1.func_78790_a(2.2f, 2.2f, -1.2f, 1, 7, 2, 0.0f);
        this.setRotateAngle(this.shape88_1, 0.0f, 0.0f, 0.17453292f);
        this.Head_6 = new ModelRenderer((ModelBase)this, 0, 58);
        this.Head_6.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Head_6.func_78790_a(-3.2f, -0.9f, -1.4f, 2, 1, 2, 0.0f);
        this.setRotateAngle(this.Head_6, 0.0f, 0.2268928f, 0.6981317f);
        this.Head_9 = new ModelRenderer((ModelBase)this, 0, 57);
        this.Head_9.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Head_9.func_78790_a(-1.5f, -3.6f, -1.0f, 3, 1, 2, 0.0f);
        this.shape83 = new ModelRenderer((ModelBase)this, 0, 54);
        this.shape83.func_78793_a(0.0f, 0.0f, 0.0f);
        this.shape83.func_78790_a(-1.0f, 3.5f, -1.2f, 2, 6, 2, 0.0f);
        this.Chest_10 = new ModelRenderer((ModelBase)this, 0, 54);
        this.Chest_10.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Chest_10.func_78790_a(-4.9f, -0.3f, -1.5f, 1, 6, 4, 0.0f);
        this.setRotateAngle(this.Chest_10, -0.17453292f, 0.0f, -0.17453292f);
        this.Chest_3 = new ModelRenderer((ModelBase)this, 0, 56);
        this.Chest_3.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Chest_3.func_78790_a(1.5f, -2.8f, -3.6f, 3, 1, 4, 0.0f);
        this.setRotateAngle(this.Chest_3, 1.0471976f, 0.0f, 0.30543262f);
        this.Left_Leg_Back_1 = new ModelRenderer((ModelBase)this, 0, 55);
        this.Left_Leg_Back_1.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Left_Leg_Back_1.func_78790_a(1.1f, 5.1f, -1.9f, 1, 5, 2, 0.0f);
        this.setRotateAngle(this.Left_Leg_Back_1, 0.20943952f, 0.0f, 0.0f);
        this.Middle_Ab = new ModelRenderer((ModelBase)this, 0, 55);
        this.Middle_Ab.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Middle_Ab.func_78790_a(-0.4f, 5.1f, -2.4f, 1, 5, 2, 0.0f);
        this.setRotateAngle(this.Middle_Ab, 0.05235988f, 0.0f, 0.0f);
        this.Left_Foot_2 = new ModelRenderer((ModelBase)this, 0, 56);
        this.Left_Foot_2.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Left_Foot_2.func_78790_a(-0.8f, 10.0f, -4.0f, 2, 2, 6, 0.0f);
        this.Left_Leg_Back_11 = new ModelRenderer((ModelBase)this, 0, 55);
        this.Left_Leg_Back_11.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Left_Leg_Back_11.func_78790_a(-1.5f, 5.1f, -1.9f, 1, 5, 2, 0.0f);
        this.setRotateAngle(this.Left_Leg_Back_11, 0.20943952f, 0.0f, 0.0f);
        this.shape89 = new ModelRenderer((ModelBase)this, 113, 60);
        this.shape89.field_78809_i = true;
        this.shape89.func_78793_a(0.0f, 0.0f, 0.0f);
        this.shape89.func_78790_a(-2.5f, 6.0f, -0.7f, 1, 3, 1, 0.0f);
        this.setRotateAngle(this.shape89, 0.0f, 0.0f, -0.091106184f);
        this.Knee_Left = new ModelRenderer((ModelBase)this, 0, 59);
        this.Knee_Left.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Knee_Left.func_78790_a(-1.3f, 2.8f, -4.4f, 3, 2, 1, 0.0f);
        this.setRotateAngle(this.Knee_Left, 0.4098033f, 0.0f, 0.0f);
        this.Head_8 = new ModelRenderer((ModelBase)this, 0, 57);
        this.Head_8.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Head_8.func_78790_a(1.7f, -3.0f, -0.9f, 1, 2, 2, 0.0f);
        this.setRotateAngle(this.Head_8, 0.0f, 0.0f, -0.17453292f);
        this.Left_Leg_Back_2 = new ModelRenderer((ModelBase)this, 0, 57);
        this.Left_Leg_Back_2.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Left_Leg_Back_2.func_78790_a(1.0f, 7.3f, 5.0f, 1, 2, 2, 0.0f);
        this.setRotateAngle(this.Left_Leg_Back_2, -0.55850536f, 0.0f, 0.0f);
        this.Croach_1 = new ModelRenderer((ModelBase)this, 0, 56);
        this.Croach_1.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Croach_1.func_78790_a(-1.4f, 10.9f, -1.8f, 3, 2, 3, 0.0f);
        this.Head_1 = new ModelRenderer((ModelBase)this, 124, 61);
        this.Head_1.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Head_1.func_78790_a(-0.5f, -1.9f, -0.8f, 1, 2, 1, 0.0f);
        this.shape79_1 = new ModelRenderer((ModelBase)this, 0, 54);
        this.shape79_1.func_78793_a(0.0f, 0.0f, 0.0f);
        this.shape79_1.func_78790_a(-0.5f, 2.0f, -1.2f, 2, 2, 2, 0.0f);
        this.shape88 = new ModelRenderer((ModelBase)this, 0, 55);
        this.shape88.func_78793_a(0.0f, 0.0f, 0.0f);
        this.shape88.func_78790_a(-3.2f, 2.2f, -1.2f, 1, 7, 2, 0.0f);
        this.setRotateAngle(this.shape88, 0.0f, 0.0f, -0.17453292f);
        this.Left_Shoulder_2 = new ModelRenderer((ModelBase)this, 0, 57);
        this.Left_Shoulder_2.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Left_Shoulder_2.func_78790_a(1.3f, -1.2f, -1.2f, 1, 2, 2, 0.0f);
        this.setRotateAngle(this.Left_Shoulder_2, 0.0f, 0.0f, 0.27314404f);
        this.Right_Lower_Leg = new ModelRenderer((ModelBase)this, 0, 54);
        this.Right_Lower_Leg.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Right_Lower_Leg.func_78790_a(-2.0f, 5.0f, -2.0f, 4, 7, 3, 0.0f);
        this.Head_3 = new ModelRenderer((ModelBase)this, 0, 57);
        this.Head_3.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Head_3.func_78790_a(0.2f, -1.8f, -1.1f, 1, 2, 2, 0.0f);
        this.setRotateAngle(this.Head_3, 0.0f, 0.13962634f, 0.17453292f);
        this.Knee_Right = new ModelRenderer((ModelBase)this, 0, 56);
        this.Knee_Right.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Knee_Right.func_78790_a(-1.4f, 2.8f, -4.4f, 3, 2, 1, 0.0f);
        this.setRotateAngle(this.Knee_Right, 0.4098033f, 0.0f, 0.0f);
        this.Left_Leg_Back_22 = new ModelRenderer((ModelBase)this, 0, 56);
        this.Left_Leg_Back_22.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Left_Leg_Back_22.func_78790_a(-1.5f, 7.3f, 5.0f, 1, 2, 2, 0.0f);
        this.setRotateAngle(this.Left_Leg_Back_22, -0.55850536f, 0.0f, 0.0f);
        this.shape89_1 = new ModelRenderer((ModelBase)this, 113, 60);
        this.shape89_1.func_78793_a(0.0f, 0.0f, 0.0f);
        this.shape89_1.func_78790_a(1.5f, 6.0f, -0.7f, 1, 3, 1, 0.0f);
        this.setRotateAngle(this.shape89_1, 0.0f, 0.0f, 0.091106184f);
        this.Right_Lower_Leg_2 = new ModelRenderer((ModelBase)this, 113, 60);
        this.Right_Lower_Leg_2.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Right_Lower_Leg_2.func_78790_a(-1.4f, 6.0f, -3.0f, 1, 3, 1, 0.0f);
        this.setRotateAngle(this.Right_Lower_Leg_2, 0.0f, 0.5934119f, -0.20943952f);
        this.Left_Shoulder_1 = new ModelRenderer((ModelBase)this, 0, 57);
        this.Left_Shoulder_1.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Left_Shoulder_1.func_78790_a(1.6f, -4.1f, -1.2f, 1, 4, 2, 0.0f);
        this.setRotateAngle(this.Left_Shoulder_1, 0.0f, 0.0f, -0.19198622f);
        this.Chest_Up = new ModelRenderer((ModelBase)this, 19, 58);
        this.Chest_Up.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Chest_Up.func_78790_a(-1.4f, 1.3f, -2.1f, 3, 3, 3, 0.0f);
        this.setRotateAngle(this.Chest_Up, -0.5462881f, 0.0f, 0.0f);
        this.Chest_Down = new ModelRenderer((ModelBase)this, 0, 58);
        this.Chest_Down.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Chest_Down.func_78790_a(-2.4f, -0.5f, -4.9f, 5, 4, 3, 0.0f);
        this.setRotateAngle(this.Chest_Down, 0.68294734f, 0.0f, 0.0f);
        this.Chest_5 = new ModelRenderer((ModelBase)this, 0, 56);
        this.Chest_5.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Chest_5.func_78790_a(-4.4f, 2.4f, -3.8f, 3, 2, 1, 0.0f);
        this.setRotateAngle(this.Chest_5, -0.22759093f, 0.0f, -0.3642502f);
        this.Chest_1 = new ModelRenderer((ModelBase)this, 0, 54);
        this.Chest_1.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Chest_1.func_78790_a(1.5f, -1.8f, -2.2f, 3, 4, 4, 0.0f);
        this.setRotateAngle(this.Chest_1, 0.0f, 0.0f, 0.31415927f);
        this.shape96 = new ModelRenderer((ModelBase)this, 0, 56);
        this.shape96.func_78793_a(0.0f, 0.0f, 0.0f);
        this.shape96.func_78790_a(-1.0f, 5.1f, 2.4f, 2, 4, 1, 0.0f);
        this.setRotateAngle(this.shape96, -0.18203785f, 0.0f, 0.0f);
        this.Left_Ab = new ModelRenderer((ModelBase)this, 0, 55);
        this.Left_Ab.field_78809_i = true;
        this.Left_Ab.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Left_Ab.func_78790_a(1.0f, 5.3f, -1.6f, 2, 4, 3, 0.0f);
        this.setRotateAngle(this.Left_Ab, 0.0f, 0.0f, 0.10471976f);
        this.Right_Leg = new ModelRenderer((ModelBase)this, 0, 54);
        this.Right_Leg.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Right_Leg.func_78790_a(-0.8f, -0.1f, -1.5f, 2, 6, 2, 0.0f);
        this.setRotateAngle(this.Right_Leg, 0.0f, 0.0f, (float)Math.PI / 180);
        this.shape85 = new ModelRenderer((ModelBase)this, 0, 61);
        this.shape85.func_78793_a(0.0f, 0.0f, 0.0f);
        this.shape85.func_78790_a(1.6f, -1.1f, 1.8f, 1, 1, 1, 0.0f);
        this.setRotateAngle(this.shape85, 1.6390387f, -0.13665928f, -0.7853982f);
        this.Right_Leg_Back_1 = new ModelRenderer((ModelBase)this, 0, 55);
        this.Right_Leg_Back_1.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Right_Leg_Back_1.func_78790_a(0.7f, 5.1f, -1.9f, 1, 5, 2, 0.0f);
        this.setRotateAngle(this.Right_Leg_Back_1, 0.20943952f, 0.0f, 0.0f);
        this.Left_Lower_Leg_1 = new ModelRenderer((ModelBase)this, 113, 60);
        this.Left_Lower_Leg_1.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Left_Lower_Leg_1.func_78790_a(-1.3f, 6.0f, -2.9f, 1, 3, 1, 0.0f);
        this.setRotateAngle(this.Left_Lower_Leg_1, 0.0f, 0.5934119f, -0.20943952f);
        this.Chest_9 = new ModelRenderer((ModelBase)this, 0, 54);
        this.Chest_9.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Chest_9.func_78790_a(3.9f, -0.3f, -1.5f, 1, 6, 4, 0.0f);
        this.setRotateAngle(this.Chest_9, -0.17453292f, 0.0f, 0.17453292f);
        this.Head_4 = new ModelRenderer((ModelBase)this, 0, 57);
        this.Head_4.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Head_4.func_78790_a(-1.3f, -1.8f, -1.1f, 1, 2, 2, 0.0f);
        this.setRotateAngle(this.Head_4, 0.0f, -0.13962634f, -0.17453292f);
        this.shape92_2 = new ModelRenderer((ModelBase)this, 0, 60);
        this.shape92_2.field_78809_i = true;
        this.shape92_2.func_78793_a(0.0f, 0.0f, 0.0f);
        this.shape92_2.func_78790_a(0.4f, 9.0f, -1.2f, 1, 2, 2, 0.0f);
        this.Chest_7 = new ModelRenderer((ModelBase)this, 0, 55);
        this.Chest_7.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Chest_7.func_78790_a(-5.1f, 1.7f, -0.1f, 1, 3, 3, 0.0f);
        this.setRotateAngle(this.Chest_7, -0.4098033f, -0.59184116f, -0.17453292f);
        this.Back = new ModelRenderer((ModelBase)this, 0, 57);
        this.Back.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Back.func_78790_a(-3.6f, 0.0f, 1.5f, 7, 6, 1, 0.0f);
        this.Croach_2 = new ModelRenderer((ModelBase)this, 0, 58);
        this.Croach_2.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Croach_2.func_78790_a(-2.4f, 9.4f, -2.2f, 5, 2, 4, 0.0f);
        this.Chest_2 = new ModelRenderer((ModelBase)this, 0, 54);
        this.Chest_2.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Chest_2.func_78790_a(-4.3f, -1.8f, -2.2f, 3, 4, 4, 0.0f);
        this.setRotateAngle(this.Chest_2, 0.0f, 0.0f, -0.31415927f);
        this.Right_Lower_Leg_1 = new ModelRenderer((ModelBase)this, 113, 60);
        this.Right_Lower_Leg_1.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Right_Lower_Leg_1.func_78790_a(0.4f, 6.0f, -3.0f, 1, 3, 1, 0.0f);
        this.setRotateAngle(this.Right_Lower_Leg_1, 0.0f, -0.5934119f, 0.20943952f);
        this.Left_Arm = new ModelRenderer((ModelBase)this, 0, 55);
        this.Left_Arm.field_78809_i = true;
        this.Left_Arm.func_78793_a(1.0f, 1.0f, 0.0f);
        this.Left_Arm.func_78790_a(-1.0f, -3.0f, -1.7f, 3, 5, 3, 0.0f);
        this.setRotateAngle(this.Left_Arm, 0.0f, 0.0f, -0.10000736f);
        this.shape84_1 = new ModelRenderer((ModelBase)this, 0, 55);
        this.shape84_1.func_78793_a(0.0f, 0.0f, 0.0f);
        this.shape84_1.func_78790_a(-0.5f, 3.8f, -1.7f, 2, 4, 3, 0.0f);
        this.Chest = new ModelRenderer((ModelBase)this, 0, 54);
        this.Chest.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Chest.func_78790_a(-1.4f, 0.0f, -2.0f, 3, 5, 4, 0.0f);
        this.Head_5 = new ModelRenderer((ModelBase)this, 0, 56);
        this.Head_5.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Head_5.func_78790_a(1.2f, -0.9f, -1.4f, 2, 1, 2, 0.0f);
        this.setRotateAngle(this.Head_5, 0.0f, -0.22759093f, -0.6981317f);
        this.Right_Shoulder_ = new ModelRenderer((ModelBase)this, 0, 57);
        this.Right_Shoulder_.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Right_Shoulder_.func_78790_a(-2.3f, -1.2f, -1.2f, 1, 2, 2, 0.0f);
        this.setRotateAngle(this.Right_Shoulder_, 0.0f, 0.0f, -0.27314404f);
        this.shape97 = new ModelRenderer((ModelBase)this, 3, 55);
        this.shape97.func_78793_a(0.0f, 0.0f, 0.0f);
        this.shape97.func_78790_a(-1.0f, -0.6f, 1.9f, 2, 4, 3, 0.0f);
        this.setRotateAngle(this.shape97, -0.63739425f, 0.0f, 0.0f);
        this.Right_Foot_1 = new ModelRenderer((ModelBase)this, 0, 56);
        this.Right_Foot_1.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Right_Foot_1.func_78790_a(-1.5f, 11.0f, -3.2f, 3, 1, 6, 0.0f);
        this.Head_7 = new ModelRenderer((ModelBase)this, 0, 57);
        this.Head_7.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Head_7.func_78790_a(-2.7f, -3.0f, -0.9f, 1, 2, 2, 0.0f);
        this.setRotateAngle(this.Head_7, 0.0f, 0.0f, 0.18203785f);
        this.Back_Wheel_Right = new ModelRenderer((ModelBase)this, 116, 52);
        this.Back_Wheel_Right.field_78809_i = true;
        this.Back_Wheel_Right.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Back_Wheel_Right.func_78790_a(-3.2f, -0.1f, 1.0f, 2, 4, 4, 0.0f);
        this.setRotateAngle(this.Back_Wheel_Right, -0.2268928f, 0.0f, 0.0f);
        this.Chest_6 = new ModelRenderer((ModelBase)this, 0, 57);
        this.Chest_6.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Chest_6.func_78790_a(4.4f, 1.7f, -0.2f, 1, 3, 3, 0.0f);
        this.setRotateAngle(this.Chest_6, -0.4098033f, 0.59184116f, 0.17453292f);
        this.Right_Leg_Back_22 = new ModelRenderer((ModelBase)this, 0, 54);
        this.Right_Leg_Back_22.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Right_Leg_Back_22.func_78790_a(-1.9f, 7.3f, 5.0f, 1, 2, 2, 0.0f);
        this.setRotateAngle(this.Right_Leg_Back_22, -0.55850536f, 0.0f, 0.0f);
        this.Chest_4 = new ModelRenderer((ModelBase)this, 0, 55);
        this.Chest_4.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Chest_4.func_78790_a(-4.3f, -2.7f, -3.6f, 3, 1, 4, 0.0f);
        this.setRotateAngle(this.Chest_4, 1.0471976f, 0.0f, -0.30543262f);
        this.Right_Shoulder__1 = new ModelRenderer((ModelBase)this, 113, 62);
        this.Right_Shoulder__1.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Right_Shoulder__1.func_78790_a(-1.5f, -1.6f, -1.8f, 1, 1, 1, 0.0f);
        this.setRotateAngle(this.Right_Shoulder__1, 0.0f, 0.7853982f, -0.7853982f);
        this.Chest_8 = new ModelRenderer((ModelBase)this, 0, 56);
        this.Chest_8.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Chest_8.func_78790_a(1.6f, 2.4f, -3.8f, 3, 2, 1, 0.0f);
        this.setRotateAngle(this.Chest_8, -0.22759093f, 0.0f, 0.3642502f);
        this.shape92_3 = new ModelRenderer((ModelBase)this, 0, 57);
        this.shape92_3.field_78809_i = true;
        this.shape92_3.func_78793_a(0.0f, 0.0f, 0.0f);
        this.shape92_3.func_78790_a(-0.5f, 8.8f, -1.2f, 1, 2, 2, 0.0f);
        this.shape83_1 = new ModelRenderer((ModelBase)this, 0, 56);
        this.shape83_1.func_78793_a(0.0f, 0.0f, 0.0f);
        this.shape83_1.func_78790_a(-1.0f, 3.5f, -1.2f, 2, 6, 2, 0.0f);
        this.Right_Leg_Back_11 = new ModelRenderer((ModelBase)this, 3, 54);
        this.Right_Leg_Back_11.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Right_Leg_Back_11.func_78790_a(-1.9f, 5.1f, -1.9f, 1, 5, 2, 0.0f);
        this.setRotateAngle(this.Right_Leg_Back_11, 0.20943952f, 0.0f, 0.0f);
        this.Right_Arm = new ModelRenderer((ModelBase)this, 0, 55);
        this.Right_Arm.func_78793_a(-0.8f, 1.0f, 0.0f);
        this.Right_Arm.func_78790_a(-2.0f, -3.0f, -1.7f, 3, 5, 3, 0.0f);
        this.setRotateAngle(this.Right_Arm, 0.0f, 0.0f, 0.10000736f);
        this.Right_Foot_2 = new ModelRenderer((ModelBase)this, 0, 55);
        this.Right_Foot_2.field_78809_i = true;
        this.Right_Foot_2.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Right_Foot_2.func_78790_a(-1.0f, 10.0f, -3.7f, 2, 2, 6, 0.0f);
        this.Back_Wheel_Left = new ModelRenderer((ModelBase)this, 116, 52);
        this.Back_Wheel_Left.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Back_Wheel_Left.func_78790_a(1.0f, -0.1f, 1.0f, 2, 4, 4, 0.0f);
        this.setRotateAngle(this.Back_Wheel_Left, -0.22759093f, 0.0f, 0.0f);
        this.shape84 = new ModelRenderer((ModelBase)this, 0, 56);
        this.shape84.func_78793_a(0.0f, 0.0f, 0.0f);
        this.shape84.func_78790_a(-1.5f, 3.8f, -1.7f, 2, 4, 3, 0.0f);
        this.Right_Leg_2 = new ModelRenderer((ModelBase)this, 0, 55);
        this.Right_Leg_2.func_78793_a(0.0f, 0.0f, 0.0f);
        this.Right_Leg_2.func_78790_a(-1.1f, -1.5f, -1.5f, 1, 2, 2, 0.0f);
        this.setRotateAngle(this.Right_Leg_2, 0.0f, 0.0f, -0.4537856f);
        this.Head1.func_78792_a(this.Head_11);
        this.Left_Arm.func_78792_a(this.Left_Shoulder_3);
        this.Left_Leg.func_78792_a(this.Left_Leg_2);
        this.Right_Arm.func_78792_a(this.Right_Shoulder_1);
        this.Head1.func_78792_a(this.Head_10);
        this.Left_Leg.func_78792_a(this.Left_Leg_Wheel_1);
        this.Chest.func_78792_a(this.Right_Ab);
        this.Right_Arm.func_78792_a(this.shape79);
        this.Right_Arm.func_78792_a(this.shape92_1);
        this.Right_Leg.func_78792_a(this.Right_Leg_Back_2);
        this.Left_Leg.func_78792_a(this.Left_Lower_Leg);
        this.Left_Leg.func_78792_a(this.Left_Lower_Leg_2);
        this.Head1.func_78792_a(this.Head_2);
        this.Right_Arm.func_78792_a(this.shape92);
        this.Right_Leg.func_78792_a(this.Left_Leg_Wheel);
        this.Left_Leg.func_78792_a(this.Left_Foot_1);
        this.Left_Arm.func_78792_a(this.shape88_1);
        this.Head1.func_78792_a(this.Head_6);
        this.Head1.func_78792_a(this.Head_9);
        this.Right_Arm.func_78792_a(this.shape83);
        this.Chest.func_78792_a(this.Chest_10);
        this.Chest.func_78792_a(this.Chest_3);
        this.Left_Leg.func_78792_a(this.Left_Leg_Back_1);
        this.Chest.func_78792_a(this.Middle_Ab);
        this.Left_Leg.func_78792_a(this.Left_Foot_2);
        this.Left_Leg.func_78792_a(this.Left_Leg_Back_11);
        this.Right_Arm.func_78792_a(this.shape89);
        this.Left_Leg.func_78792_a(this.Knee_Left);
        this.Head1.func_78792_a(this.Head_8);
        this.Left_Leg.func_78792_a(this.Left_Leg_Back_2);
        this.Chest.func_78792_a(this.Croach_1);
        this.Head1.func_78792_a(this.Head_1);
        this.Left_Arm.func_78792_a(this.shape79_1);
        this.Right_Arm.func_78792_a(this.shape88);
        this.Left_Arm.func_78792_a(this.Left_Shoulder_2);
        this.Right_Leg.func_78792_a(this.Right_Lower_Leg);
        this.Head1.func_78792_a(this.Head_3);
        this.Right_Leg.func_78792_a(this.Knee_Right);
        this.Left_Leg.func_78792_a(this.Left_Leg_Back_22);
        this.Left_Arm.func_78792_a(this.shape89_1);
        this.Right_Leg.func_78792_a(this.Right_Lower_Leg_2);
        this.Left_Arm.func_78792_a(this.Left_Shoulder_1);
        this.Chest.func_78792_a(this.Chest_Up);
        this.Chest.func_78792_a(this.Chest_Down);
        this.Chest.func_78792_a(this.Chest_5);
        this.Chest.func_78792_a(this.Chest_1);
        this.Chest.func_78792_a(this.shape96);
        this.Chest.func_78792_a(this.Left_Ab);
        this.Head1.func_78792_a(this.shape85);
        this.Right_Leg.func_78792_a(this.Right_Leg_Back_1);
        this.Left_Leg.func_78792_a(this.Left_Lower_Leg_1);
        this.Chest.func_78792_a(this.Chest_9);
        this.Head1.func_78792_a(this.Head_4);
        this.Left_Arm.func_78792_a(this.shape92_2);
        this.Chest.func_78792_a(this.Chest_7);
        this.Chest.func_78792_a(this.Back);
        this.Chest.func_78792_a(this.Croach_2);
        this.Chest.func_78792_a(this.Chest_2);
        this.Right_Leg.func_78792_a(this.Right_Lower_Leg_1);
        this.Left_Arm.func_78792_a(this.shape84_1);
        this.Head1.func_78792_a(this.Head_5);
        this.Right_Arm.func_78792_a(this.Right_Shoulder_);
        this.Chest.func_78792_a(this.shape97);
        this.Right_Leg.func_78792_a(this.Right_Foot_1);
        this.Head1.func_78792_a(this.Head_7);
        this.Chest.func_78792_a(this.Back_Wheel_Right);
        this.Chest.func_78792_a(this.Chest_6);
        this.Right_Leg.func_78792_a(this.Right_Leg_Back_22);
        this.Chest.func_78792_a(this.Chest_4);
        this.Right_Arm.func_78792_a(this.Right_Shoulder__1);
        this.Chest.func_78792_a(this.Chest_8);
        this.Left_Arm.func_78792_a(this.shape92_3);
        this.Left_Arm.func_78792_a(this.shape83_1);
        this.Right_Leg.func_78792_a(this.Right_Leg_Back_11);
        this.Right_Leg.func_78792_a(this.Right_Foot_2);
        this.Chest.func_78792_a(this.Back_Wheel_Left);
        this.Right_Arm.func_78792_a(this.shape84);
        this.Right_Leg.func_78792_a(this.Right_Leg_2);
        this.field_78116_c.func_78792_a(this.Head1);
        this.field_78115_e.func_78792_a(this.Chest);
        this.field_178724_i.func_78792_a(this.Left_Arm);
        this.field_178722_k.func_78792_a(this.Left_Leg);
        this.field_178723_h.func_78792_a(this.Right_Arm);
        this.field_178721_j.func_78792_a(this.Right_Leg);
    }

    public final void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
    }

    public final void func_78087_a(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
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
            ModelCustomArmor.func_178685_a((ModelRenderer)this.field_78116_c, (ModelRenderer)this.field_178720_f);
        } else {
            super.func_78087_a(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
        }
    }

    public final void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.field_78795_f = x;
        modelRenderer.field_78796_g = y;
        modelRenderer.field_78808_h = z;
    }
}
