/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.command.ICommand
 *  net.minecraft.item.Item
 *  net.minecraftforge.client.event.ModelRegistryEvent
 *  net.minecraftforge.event.RegistryEvent$Register
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 *  net.minecraftforge.fml.common.event.FMLPreInitializationEvent
 *  net.minecraftforge.fml.common.event.FMLServerStartingEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.network.IGuiHandler
 *  net.minecraftforge.fml.common.network.NetworkRegistry
 *  net.minecraftforge.registries.IForgeRegistryEntry
 */
package com.marctron.transformersmod.util.handlers;

import com.marctron.transformersmod.Main;
import com.marctron.transformersmod.commands.CommandDimensionTeleport;
import com.marctron.transformersmod.init.EntityInit;
import com.marctron.transformersmod.init.ModBlocks;
import com.marctron.transformersmod.init.ModItems;
import com.marctron.transformersmod.util.handlers.GuiHandler;
import com.marctron.transformersmod.util.handlers.RenderHandler;
import com.marctron.transformersmod.util.handlers.SoundsHandler;
import com.marctron.transformersmod.util.handlers.TileEntityHandler;
import com.marctron.transformersmod.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.command.ICommand;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;

@Mod.EventBusSubscriber
public class RegistryHandler {
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll((IForgeRegistryEntry[])ModItems.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll((IForgeRegistryEntry[])ModBlocks.BLOCKS.toArray(new Block[0]));
        TileEntityHandler.registerTileEntities();
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        for (Item item : ModItems.ITEMS) {
            if (!(item instanceof IHasModel)) continue;
            ((IHasModel)item).registerModels();
        }
        for (Block block : ModBlocks.BLOCKS) {
            if (!(block instanceof IHasModel)) continue;
            ((IHasModel)block).registerModels();
        }
    }

    public static void preInitRegistries(FMLPreInitializationEvent event) {
        EntityInit.registerEntities();
        RenderHandler.registerEntityRenders();
    }

    public static void preInitRegistriesSide() {
        EntityInit.registerEntities();
        RenderHandler.registerEntityRenders();
        SoundsHandler.init();
    }

    public static void initRegistries() {
        SoundsHandler.init();
        NetworkRegistry.INSTANCE.registerGuiHandler((Object)Main.instance, (IGuiHandler)new GuiHandler());
    }

    public static void serverRegistries(FMLServerStartingEvent event) {
        event.registerServerCommand((ICommand)new CommandDimensionTeleport());
    }
}

