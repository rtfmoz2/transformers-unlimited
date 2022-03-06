/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.item.ItemStack
 *  net.minecraftforge.fml.common.registry.GameRegistry
 */
package com.marctron.transformersmod.init;

import com.marctron.transformersmod.init.ModBlocks;
import com.marctron.transformersmod.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
    public static void init() {
        GameRegistry.addSmelting((Block)ModBlocks.TRANSFORMIUM_ORE_BLOCK, (ItemStack)new ItemStack(ModItems.TRANSFORMIUM, 1), (float)1.5f);
    }
}

