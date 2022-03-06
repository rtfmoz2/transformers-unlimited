/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.item.ItemStack
 *  net.minecraftforge.fml.common.IWorldGenerator
 *  net.minecraftforge.fml.common.Mod
 *  net.minecraftforge.fml.common.Mod$EventHandler
 *  net.minecraftforge.fml.common.Mod$Instance
 *  net.minecraftforge.fml.common.SidedProxy
 *  net.minecraftforge.fml.common.event.FMLInitializationEvent
 *  net.minecraftforge.fml.common.event.FMLPostInitializationEvent
 *  net.minecraftforge.fml.common.event.FMLPreInitializationEvent
 *  net.minecraftforge.fml.common.event.FMLServerStartingEvent
 *  net.minecraftforge.fml.common.registry.GameRegistry
 */
package com.marctron.transformersmod;

import com.marctron.transformersmod.init.CybertronWorldGen;
import com.marctron.transformersmod.init.EntityInit;
import com.marctron.transformersmod.init.GunEntities;
import com.marctron.transformersmod.init.ModItems;
import com.marctron.transformersmod.init.ModRecipes;
import com.marctron.transformersmod.proxy.CommonProxy;
import com.marctron.transformersmod.util.handlers.RegistryHandler;
import com.marctron.transformersmod.util.handlers.RenderHandler;
import com.marctron.transformersmod.world.generators.ModWorldGen;
import com.marctron.transformersmod.world.generators.WorldGenCustomStructures;
import java.io.File;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid="tm", name="TransformersMod", version="1.0", acceptedMinecraftVersions="[1.12.2]")
public class Main {
    @Mod.Instance
    public static Main instance;
    @SidedProxy(clientSide="com.marctron.transformersmod.proxy.ClientProxy", serverSide="com.marctron.transformersmod.proxy.CommonProxy")
    public static CommonProxy proxy;
    public static File config;
    public static CreativeTabs tabTransformers;
    public static CreativeTabs tabWeapons;
    public static CreativeTabs tabDecepticon;
    public static CreativeTabs tabAutobot;

    @Mod.EventHandler
    public static void PreInit(FMLPreInitializationEvent event) {
        GameRegistry.registerWorldGenerator((IWorldGenerator)new ModWorldGen(), (int)3);
        CybertronWorldGen.registerDimensions();
        GameRegistry.registerWorldGenerator((IWorldGenerator)new WorldGenCustomStructures(), (int)0);
        RegistryHandler.preInitRegistries(event);
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event) {
        ModRecipes.init();
        RegistryHandler.initRegistries();
        proxy.register();
        GunEntities.regEntities();
    }

    @Mod.EventHandler
    public static void preInitRegistries() {
        EntityInit.registerEntities();
        RenderHandler.registerEntityRenders();
    }

    public static void postInit(FMLPostInitializationEvent event) {
    }

    @Mod.EventHandler
    public static void serverInit(FMLServerStartingEvent event) {
        RegistryHandler.serverRegistries(event);
    }

    static {
        tabTransformers = new CreativeTabs("tabTransformersMod"){

            public ItemStack func_78016_d() {
                return new ItemStack(ModItems.ENERGON_SHARD);
            }

            public boolean hasSearchBar() {
                return true;
            }
        }.func_78025_a("item_search.png");
        tabWeapons = new CreativeTabs("tabWeapons"){

            public ItemStack func_78016_d() {
                return new ItemStack(ModItems.AMMO);
            }

            public boolean hasSearchBar() {
                return false;
            }
        };
        tabDecepticon = new CreativeTabs("tabDecepticon"){

            public ItemStack func_78016_d() {
                return new ItemStack(ModItems.DECEPTICON_INSGINIA);
            }

            public boolean hasSearchBar() {
                return false;
            }
        };
        tabAutobot = new CreativeTabs("tabAutobot"){

            public ItemStack func_78016_d() {
                return new ItemStack(ModItems.AUTOBOT_INSGINIA);
            }

            public boolean hasSearchBar() {
                return false;
            }
        };
    }
}

