/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.SoundType
 *  net.minecraft.block.material.Material
 */
package com.marctron.transformersmod.blocks;

import com.marctron.transformersmod.blocks.BlockBase;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class TransformiumBlock
extends BlockBase {
    public TransformiumBlock(String name, Material material) {
        super(name, material);
        this.func_149672_a(SoundType.field_185852_e);
        this.func_149711_c(5.0f);
        this.setHarvestLevel("pickaxe", 2);
    }
}

