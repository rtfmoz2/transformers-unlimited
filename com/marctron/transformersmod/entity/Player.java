/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBiped$ArmPose
 *  net.minecraft.client.model.ModelPlayer
 *  net.minecraft.client.renderer.entity.RenderLivingBase
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.EnumHandSide
 *  net.minecraftforge.client.event.RenderLivingEvent$Pre
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.marctron.transformersmod.entity;

import com.marctron.transformersmod.items.gun.IGun;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHandSide;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(value=Side.CLIENT)
@Mod.EventBusSubscriber(value={Side.CLIENT})
public class Player {
    @SubscribeEvent
    public static void EntityRender(RenderLivingEvent.Pre event) {
        EntityPlayer player;
        EntityLivingBase entity = event.getEntity();
        if (entity instanceof EntityPlayer && (player = (EntityPlayer)entity).func_184614_ca().func_77973_b() instanceof IGun) {
            RenderLivingBase renderer = event.getRenderer();
            ItemStack stack = event.getEntity().func_184614_ca();
            ModelPlayer model = (ModelPlayer)renderer.func_177087_b();
            if (stack.func_77973_b() instanceof IGun) {
                IGun nbt = (IGun)stack.func_77973_b();
                if (nbt.getBoolean("Gun")) {
                    model.field_187076_m = player.func_70051_ag() ? ModelBiped.ArmPose.BLOCK : ModelBiped.ArmPose.BOW_AND_ARROW;
                }
                if (nbt.getBoolean("running")) {
                    if (player.func_184591_cq() == EnumHandSide.LEFT) {
                        model.field_187075_l = ModelBiped.ArmPose.BLOCK;
                    } else {
                        model.field_187076_m = ModelBiped.ArmPose.BLOCK;
                    }
                }
            }
        }
    }
}

