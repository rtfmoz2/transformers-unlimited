/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockDispenser
 *  net.minecraft.block.BlockSourceImpl
 *  net.minecraft.block.properties.IProperty
 *  net.minecraft.block.properties.PropertyBool
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.dispenser.BehaviorDefaultDispenseItem
 *  net.minecraft.dispenser.IBehaviorDispenseItem
 *  net.minecraft.dispenser.IBlockSource
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.inventory.IInventory
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemBlock
 *  net.minecraft.item.ItemStack
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.tileentity.TileEntityDispenser
 *  net.minecraft.tileentity.TileEntityDropper
 *  net.minecraft.tileentity.TileEntityHopper
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 *  net.minecraftforge.items.VanillaInventoryCodeHooks
 */
package com.marctron.transformersmod.blocks;

import com.marctron.transformersmod.Main;
import com.marctron.transformersmod.init.ModBlocks;
import com.marctron.transformersmod.init.ModItems;
import com.marctron.transformersmod.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDispenser;
import net.minecraft.block.BlockSourceImpl;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.IBlockState;
import net.minecraft.dispenser.BehaviorDefaultDispenseItem;
import net.minecraft.dispenser.IBehaviorDispenseItem;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityDispenser;
import net.minecraft.tileentity.TileEntityDropper;
import net.minecraft.tileentity.TileEntityHopper;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.items.VanillaInventoryCodeHooks;

public class ItemSpawner
extends BlockDispenser
implements IHasModel {
    public static final PropertyBool TRIGGERED = PropertyBool.func_177716_a((String)"triggered");
    private final IBehaviorDispenseItem dropBehavior = new BehaviorDefaultDispenseItem();

    public ItemSpawner(String name) {
        this.func_149663_c(name);
        this.setRegistryName(name);
        this.func_149647_a(Main.tabTransformers);
        this.func_149715_a(0.3f);
        this.func_180632_j(this.field_176227_L.func_177621_b().func_177226_a((IProperty)field_176441_a, (Comparable)EnumFacing.NORTH).func_177226_a((IProperty)TRIGGERED, (Comparable)Boolean.valueOf(false)));
        ModBlocks.BLOCKS.add((Block)this);
        ModItems.ITEMS.add((Item)new ItemBlock((Block)this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(Item.func_150898_a((Block)this), 0, "inventory");
    }

    public boolean func_180639_a(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        TileEntity tileentity = worldIn.func_175625_s(pos);
        if (tileentity instanceof TileEntityDropper && playerIn.func_189808_dh()) {
            playerIn.func_71007_a((IInventory)tileentity);
            return true;
        }
        return false;
    }

    protected IBehaviorDispenseItem func_149940_a(ItemStack stack) {
        return this.dropBehavior;
    }

    public TileEntity func_149915_a(World worldIn, int meta) {
        return new TileEntityDropper();
    }

    protected void func_176439_d(World worldIn, BlockPos pos) {
        BlockSourceImpl blocksourceimpl = new BlockSourceImpl(worldIn, pos);
        TileEntityDispenser tileentitydispenser = (TileEntityDispenser)blocksourceimpl.func_150835_j();
        if (tileentitydispenser != null) {
            int i = tileentitydispenser.func_146017_i();
            if (i < 0) {
                worldIn.func_175718_b(1001, pos, 0);
            } else {
                ItemStack itemstack = tileentitydispenser.func_70301_a(i);
                if (!itemstack.func_190926_b() && VanillaInventoryCodeHooks.dropperInsertHook((World)worldIn, (BlockPos)pos, (TileEntityDispenser)tileentitydispenser, (int)i, (ItemStack)itemstack)) {
                    ItemStack itemstack1;
                    EnumFacing enumfacing = (EnumFacing)worldIn.func_180495_p(pos).func_177229_b((IProperty)field_176441_a);
                    BlockPos blockpos = pos.func_177972_a(enumfacing);
                    IInventory iinventory = TileEntityHopper.func_145893_b((World)worldIn, (double)blockpos.func_177958_n(), (double)blockpos.func_177956_o(), (double)blockpos.func_177952_p());
                    if (iinventory == null) {
                        itemstack1 = this.dropBehavior.func_82482_a((IBlockSource)blocksourceimpl, itemstack);
                    } else {
                        itemstack1 = TileEntityHopper.func_174918_a((IInventory)tileentitydispenser, (IInventory)iinventory, (ItemStack)itemstack.func_77946_l().func_77979_a(1), (EnumFacing)enumfacing.func_176734_d());
                        if (itemstack1.func_190926_b()) {
                            itemstack1 = itemstack.func_77946_l();
                            itemstack1.func_190918_g(1);
                        } else {
                            itemstack1 = itemstack.func_77946_l();
                        }
                    }
                    tileentitydispenser.func_70299_a(i, itemstack1);
                }
            }
        }
    }
}

