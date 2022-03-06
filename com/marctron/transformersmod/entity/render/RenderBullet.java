/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.entity.Render
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.client.renderer.entity.RenderTippedArrow
 *  net.minecraft.util.ResourceLocation
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 *  org.lwjgl.opengl.GL11
 */
package com.marctron.transformersmod.entity.render;

import com.marctron.transformersmod.entity.EntityBullet;
import com.marctron.transformersmod.entity.model.ModelBullet;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderTippedArrow;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

@SideOnly(value=Side.CLIENT)
public class RenderBullet
extends Render<EntityBullet> {
    public static final ResourceLocation TEXTURES = new ResourceLocation("tm:textures/entity/bullet.png");
    private final ModelBullet model = new ModelBullet();

    public RenderBullet(RenderManager manager) {
        super(manager);
    }

    public void doRender(EntityBullet entity, double x, double y, double z, float entityYaw, float partialTicks) {
        GL11.glPushMatrix();
        this.func_110776_a(TEXTURES);
        GL11.glTranslated((double)x, (double)(y - 1.3), (double)z);
        this.model.func_78088_a(entity, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        GlStateManager.func_179114_b((float)(entity.field_70126_B + (entity.field_70177_z - entity.field_70126_B) * partialTicks - 90.0f), (float)0.0f, (float)1.0f, (float)0.0f);
        GlStateManager.func_179114_b((float)(entity.field_70127_C + (entity.field_70125_A - entity.field_70127_C) * partialTicks), (float)0.0f, (float)0.0f, (float)1.0f);
        GL11.glPopMatrix();
    }

    public ResourceLocation getEntityTexture(EntityBullet entity) {
        return RenderTippedArrow.field_188305_a;
    }
}

