/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockContainer
 *  net.minecraft.block.material.Material
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.inventory.IInventory
 *  net.minecraft.inventory.InventoryHelper
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemBlock
 *  net.minecraft.item.ItemStack
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.util.EnumBlockRenderType
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 */
package com.marctron.transformersmod.blocks;

import com.marctron.transformersmod.Main;
import com.marctron.transformersmod.blocks.tileentity.TileEntityEnergonCrate;
import com.marctron.transformersmod.init.ModBlocks;
import com.marctron.transformersmod.init.ModItems;
import com.marctron.transformersmod.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockEnergonCrate
extends BlockContainer
implements IHasModel {
    public BlockEnergonCrate(String name) {
        super(Material.field_151574_g);
        this.func_149663_c(name);
        this.setRegistryName(name);
        this.func_149647_a(Main.tabTransformers);
        this.func_149715_a(0.15f);
        ModBlocks.BLOCKS.add((Block)this);
        ModItems.ITEMS.add((Item)new ItemBlock((Block)this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(Item.func_150898_a((Block)this), 0, "inventory");
    }

    public boolean func_180639_a(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (!worldIn.field_72995_K) {
            playerIn.openGui((Object)Main.instance, 2, worldIn, pos.func_177958_n(), pos.func_177956_o(), pos.func_177952_p());
        }
        return true;
    }

    public void func_180663_b(World worldIn, BlockPos pos, IBlockState state) {
        TileEntityEnergonCrate tileentity = (TileEntityEnergonCrate)worldIn.func_175625_s(pos);
        InventoryHelper.func_180175_a((World)worldIn, (BlockPos)pos, (IInventory)tileentity);
        super.func_180663_b(worldIn, pos, state);
    }

    public void func_180633_a(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
        TileEntity tileentity;
        if (stack.func_82837_s() && (tileentity = worldIn.func_175625_s(pos)) instanceof TileEntityEnergonCrate) {
            ((TileEntityEnergonCrate)tileentity).func_190575_a(stack.func_82833_r());
        }
    }

    public TileEntity func_149915_a(World worldIn, int meta) {
        return new TileEntityEnergonCrate();
    }

    public EnumBlockRenderType func_149645_b(IBlockState state) {
        return EnumBlockRenderType.MODEL;
    }

    public boolean func_149662_c(IBlockState state) {
        return false;
    }

    public boolean func_149686_d(IBlockState state) {
        return false;
    }
}

