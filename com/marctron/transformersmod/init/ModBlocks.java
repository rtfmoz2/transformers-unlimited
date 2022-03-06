/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 */
package com.marctron.transformersmod.init;

import com.marctron.transformersmod.blocks.BlockBase;
import com.marctron.transformersmod.blocks.BlockEnergonCrate;
import com.marctron.transformersmod.blocks.BlockGlassBase;
import com.marctron.transformersmod.blocks.BlueEnergonoreBlock;
import com.marctron.transformersmod.blocks.DarkEnergonoreBlock;
import com.marctron.transformersmod.blocks.EnergoncubeBlock;
import com.marctron.transformersmod.blocks.EnergonoreBlock;
import com.marctron.transformersmod.blocks.ItemSpawner;
import com.marctron.transformersmod.blocks.RedEnergonoreBlock;
import com.marctron.transformersmod.blocks.TransformiumoreBlock;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();
    public static final Block ENERGON_CUBE_BLOCK = new EnergoncubeBlock("energon_cube_block", Material.field_151573_f).func_149711_c(3.0f);
    public static final Block RED_ENERGON_CUBE_BLOCK = new EnergoncubeBlock("red_energon_cube_block", Material.field_151573_f).func_149711_c(3.0f);
    public static final Block BLUE_ENERGON_CUBE_BLOCK = new EnergoncubeBlock("blue_energon_cube_block", Material.field_151573_f).func_149711_c(3.0f);
    public static final Block DARK_ENERGON_CUBE_BLOCK = new EnergoncubeBlock("dark_energon_cube_block", Material.field_151573_f).func_149711_c(3.0f);
    public static final Block SYNTHETIC_ENERGON_CUBE_BLOCK = new EnergoncubeBlock("synthetic_energon_cube_block", Material.field_151573_f).func_149711_c(3.0f);
    public static final Block ENERGON_ORE_BLOCK = new EnergonoreBlock("energon_ore_block", Material.field_151573_f, true);
    public static final Block RED_ENERGON_ORE_BLOCK = new RedEnergonoreBlock("red_energon_ore_block", Material.field_151573_f, true);
    public static final Block BLUE_ENERGON_ORE_BLOCK = new BlueEnergonoreBlock("blue_energon_ore_block", Material.field_151573_f, true);
    public static final Block DARK_ENERGON_ORE_BLOCK = new DarkEnergonoreBlock("dark_energon_ore_block", Material.field_151573_f, true);
    public static final Block RED_ENERGON_ORE_BLOCK_NETHERRACK = new RedEnergonoreBlock("red_energon_ore_block_netherrack", Material.field_151573_f, true);
    public static final Block DARK_ENERGON_ORE_BLOCK_END_STONE = new DarkEnergonoreBlock("dark_energon_ore_block_end_stone", Material.field_151573_f, true);
    public static final Block TRANSFORMIUM_BLOCK = new BlockBase("transformium_block", Material.field_151573_f).func_149711_c(3.0f);
    public static final Block TRANSFORMIUM_ORE_BLOCK = new TransformiumoreBlock("transformium_ore_block", Material.field_151573_f);
    public static final Block ENERGON_CRATE_BLOCK = new BlockEnergonCrate("energon_crate_block");
    public static final Block ITEM_SPAWNER = new ItemSpawner("item_spawner");
    public static final Block SPACE_BRIDGE_BLOCK = new BlockBase("space_bridge_block", Material.field_151573_f);
    public static final Block WOOL_PALE_GREEN = new BlockBase("wool_pale_green", Material.field_151580_n);
    public static final Block WOOL_PALE_BROWN = new BlockBase("wool_pale_brown", Material.field_151580_n);
    public static final Block WOOL_DARK_RED = new BlockBase("wool_dark_red", Material.field_151580_n);
    public static final Block WOOL_DARK_GRAY = new BlockBase("wool_dark_gray", Material.field_151580_n);
    public static final Block WOOL_BEIGE = new BlockBase("wool_beige", Material.field_151580_n);
    public static final Block STAINED_GLASS_PALE_GREEN = new BlockGlassBase("stained_glass_pale_green", Material.field_151592_s, false);
    public static final Block STAINED_GLASS_PALE_BROWN = new BlockGlassBase("stained_glass_pale_brown", Material.field_151592_s, false);
    public static final Block STAINED_GLASS_DARK_RED = new BlockGlassBase("stained_glass_dark_red", Material.field_151592_s, false);
    public static final Block STAINED_GLASS_DARK_GRAY = new BlockGlassBase("stained_glass_dark_gray", Material.field_151592_s, false);
    public static final Block STAINED_GLASS_BEIGE = new BlockGlassBase("stained_glass_beige", Material.field_151592_s, false);
    public static final Block STAINED_HARDENED_CLAY_PALE_GREEN = new BlockBase("stained_hardened_clay_pale_green", Material.field_151571_B);
    public static final Block STAINED_HARDENED_CLAY_PALE_BROWN = new BlockBase("stained_hardened_clay_pale_brown", Material.field_151571_B);
    public static final Block STAINED_HARDENED_CLAY_DARK_RED = new BlockBase("stained_hardened_clay_dark_red", Material.field_151571_B);
    public static final Block STAINED_HARDENED_CLAY_DARK_GRAY = new BlockBase("stained_hardened_clay_dark_gray", Material.field_151571_B);
    public static final Block STAINED_HARDENED_CLAY_BEIGE = new BlockBase("stained_hardened_clay_beige", Material.field_151571_B);
}

