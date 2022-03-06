/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockBreakable
 *  net.minecraft.block.material.Material
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemBlock
 *  net.minecraft.util.BlockRenderLayer
 */
package com.marctron.transformersmod.blocks;

import com.marctron.transformersmod.Main;
import com.marctron.transformersmod.init.ModBlocks;
import com.marctron.transformersmod.init.ModItems;
import com.marctron.transformersmod.util.interfaces.IHasModel;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;

public class BlockGlassBase
extends BlockBreakable
implements IHasModel {
    public BlockGlassBase(String name, Material material, boolean ignoreSimilarity) {
        super(material, ignoreSimilarity);
        this.func_149663_c(name);
        this.setRegistryName(name);
        this.func_149647_a(Main.tabTransformers);
        ModBlocks.BLOCKS.add((Block)this);
        ModItems.ITEMS.add((Item)new ItemBlock((Block)this).setRegistryName(this.getRegistryName()));
    }

    public int func_149745_a(Random random) {
        return 0;
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(Item.func_150898_a((Block)this), 0, "inventory");
    }

    public BlockRenderLayer func_180664_k() {
        return BlockRenderLayer.TRANSLUCENT;
    }

    public boolean func_149686_d(IBlockState state) {
        return false;
    }

    protected boolean func_149700_E() {
        return true;
    }
}

