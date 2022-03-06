/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.ResourceLocation
 *  net.minecraftforge.fml.client.registry.IRenderFactory
 *  net.minecraftforge.fml.client.registry.RenderingRegistry
 *  net.minecraftforge.fml.common.registry.EntityRegistry
 */
package com.marctron.transformersmod.init;

import com.marctron.transformersmod.Main;
import com.marctron.transformersmod.entity.EntityBullet;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class GunEntities {
    private static List<Class<? extends Entity>> ENTITY_CLASSES = new ArrayList<Class<? extends Entity>>();
    private static int modEntityId = 0;

    private static void regEntity(Class<? extends Entity> entityClass, String name) {
        EntityRegistry.registerModEntity((ResourceLocation)new ResourceLocation("tm", name), entityClass, (String)name, (int)(++modEntityId), (Object)Main.instance, (int)64, (int)20, (boolean)false);
        ENTITY_CLASSES.add(entityClass);
    }

    private static <T extends Entity> void regRender(Class<T> entityClass, IRenderFactory<? super T> renderFactory) {
        RenderingRegistry.registerEntityRenderingHandler(entityClass, renderFactory);
    }

    public static void regEntities() {
        GunEntities.regEntity(EntityBullet.class, "Bullet");
    }
}

