/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.block.model.ModelResourceLocation
 *  net.minecraft.client.settings.KeyBinding
 *  net.minecraft.item.Item
 *  net.minecraft.util.ResourceLocation
 *  net.minecraftforge.client.model.ModelLoader
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.client.registry.ClientRegistry
 */
package com.marctron.transformersmod.proxy;

import com.marctron.transformersmod.events.ClientEvents;
import com.marctron.transformersmod.proxy.CommonProxy;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ClientProxy
extends CommonProxy {
    public static final KeyBinding MY_KEYBINDING = new KeyBinding("key.transform", 45, "category.transformers");
    public static final KeyBinding ROBOT_MODE = new KeyBinding("key.robotmode", 21, "category.transformers");

    @Override
    public void register() {
        MinecraftForge.EVENT_BUS.register((Object)new ClientEvents());
        ClientRegistry.registerKeyBinding((KeyBinding)MY_KEYBINDING);
        MinecraftForge.EVENT_BUS.register((Object)new ClientEvents());
        ClientRegistry.registerKeyBinding((KeyBinding)ROBOT_MODE);
    }

    @Override
    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation((Item)item, (int)meta, (ModelResourceLocation)new ModelResourceLocation(item.getRegistryName(), id));
    }

    @Override
    public void registerVariantRenderer(Item item, int meta, String filename, String id) {
        ModelLoader.setCustomModelResourceLocation((Item)item, (int)meta, (ModelResourceLocation)new ModelResourceLocation(new ResourceLocation("tm", filename), id));
    }
}

