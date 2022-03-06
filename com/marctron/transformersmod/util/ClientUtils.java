/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.ItemMeshDefinition
 *  net.minecraft.client.renderer.block.model.ModelBakery
 *  net.minecraft.client.renderer.block.model.ModelResourceLocation
 *  net.minecraft.client.renderer.block.statemap.IStateMapper
 *  net.minecraft.client.renderer.block.statemap.StateMapperBase
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.ResourceLocation
 *  net.minecraftforge.client.model.ModelLoader
 *  net.minecraftforge.fluids.IFluidBlock
 */
package com.marctron.transformersmod.util;

import com.marctron.transformersmod.items.ItemBasicMeta;
import com.marctron.transformersmod.util.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.IStateMapper;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.IFluidBlock;

public class ClientUtils {
    private static Minecraft mc = Minecraft.func_71410_x();

    public static void regModel(Item item) {
        if (item instanceof ItemBasicMeta && item.func_77614_k()) {
            for (int meta = 0; meta < ((ItemBasicMeta)item).getSubNames().length; ++meta) {
                ModelLoader.setCustomModelResourceLocation((Item)item, (int)meta, (ModelResourceLocation)new ModelResourceLocation(item.getRegistryName().toString() + "/" + ((ItemBasicMeta)item).getSubNames()[meta], "inventory"));
            }
        } else {
            ClientUtils.regModel(item, 0);
        }
    }

    public static void regModel(Block block) {
        ClientUtils.regModel(Item.func_150898_a((Block)block), 0);
    }

    public static void regModel(Item item, int meta) {
        ModelLoader.setCustomModelResourceLocation((Item)item, (int)meta, (ModelResourceLocation)new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

    public static void regFluidModel(IFluidBlock fluidBlock) {
        Item item = Item.func_150898_a((Block)((Block)fluidBlock));
        if (item == null) {
            LogHelper.fatal("Fluid " + ((Block)fluidBlock).getRegistryName() + " gave a null Item!");
            return;
        }
        ModelBakery.registerItemVariants((Item)item, (ResourceLocation[])new ResourceLocation[0]);
        final ModelResourceLocation modelLoc = new ModelResourceLocation("tm:fluid");
        ModelLoader.setCustomMeshDefinition((Item)item, (ItemMeshDefinition)new ItemMeshDefinition(){

            public ModelResourceLocation func_178113_a(ItemStack stack) {
                return modelLoc;
            }
        });
        ModelLoader.setCustomStateMapper((Block)((Block)fluidBlock), (IStateMapper)new StateMapperBase(){

            protected ModelResourceLocation func_178132_a(IBlockState state) {
                return modelLoc;
            }
        });
    }
}

