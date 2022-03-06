/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.ResourceLocation
 *  net.minecraftforge.fml.common.registry.EntityRegistry
 */
package com.marctron.transformersmod.init;

import com.marctron.transformersmod.Main;
import com.marctron.transformersmod.entity.EntityBullet;
import com.marctron.transformersmod.entity.EntityLargeRocket;
import com.marctron.transformersmod.entity.EntitySwindle;
import com.marctron.transformersmod.entity.EntityVehicon;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit {
    public static void registerEntities() {
        EntityInit.registerEntity("vehicon", EntityVehicon.class, 120, 50, 0, 660066);
        EntityInit.registerEntity("swindle", EntitySwindle.class, 120, 50, 8983288, 16043109);
        EntityInit.registerProjectile("rocket", EntityLargeRocket.class, 420);
        EntityInit.registerProjectile("bullet", EntityBullet.class, 69);
    }

    private static void registerEntity(String name, Class<? extends Entity> entity, int range, int color1, int color2, int id) {
        EntityRegistry.registerModEntity((ResourceLocation)new ResourceLocation("tm:" + name), entity, (String)name, (int)id, (Object)Main.instance, (int)range, (int)1, (boolean)true, (int)color1, (int)color2);
    }

    public static void registerProjectile(String name, Class<? extends Entity> entity, int id) {
        EntityRegistry.registerModEntity((ResourceLocation)new ResourceLocation("tm:" + name), entity, (String)name, (int)id, (Object)Main.instance, (int)64, (int)1, (boolean)true);
    }
}

