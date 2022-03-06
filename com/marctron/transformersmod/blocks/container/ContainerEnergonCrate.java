/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.InventoryPlayer
 *  net.minecraft.inventory.Container
 *  net.minecraft.inventory.IInventory
 *  net.minecraft.inventory.Slot
 *  net.minecraft.item.ItemStack
 */
package com.marctron.transformersmod.blocks.container;

import com.marctron.transformersmod.blocks.tileentity.TileEntityEnergonCrate;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerEnergonCrate
extends Container {
    private final int numRows;
    private final TileEntityEnergonCrate chestInventory;

    public ContainerEnergonCrate(InventoryPlayer playerInv, TileEntityEnergonCrate tileEntityEnergonCrate, EntityPlayer player) {
        this.chestInventory = tileEntityEnergonCrate;
        this.numRows = tileEntityEnergonCrate.func_70302_i_() / 9;
        tileEntityEnergonCrate.func_174889_b(player);
        for (int i = 0; i < this.numRows; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.func_75146_a(new Slot((IInventory)tileEntityEnergonCrate, j + i * 9, 8 + j * 18, 18 + i * 18));
            }
        }
        for (int y = 0; y < 3; ++y) {
            for (int x = 0; x < 9; ++x) {
                this.func_75146_a(new Slot((IInventory)playerInv, x + y * 9 + 9, 8 + x * 18, 175 + y * 18));
            }
        }
        for (int x = 0; x < 9; ++x) {
            this.func_75146_a(new Slot((IInventory)playerInv, x, 8 + x * 18, 233));
        }
    }

    public boolean func_75145_c(EntityPlayer playerIn) {
        return this.chestInventory.func_70300_a(playerIn);
    }

    public void func_75134_a(EntityPlayer playerIn) {
        super.func_75134_a(playerIn);
        this.chestInventory.func_174886_c(playerIn);
    }

    public ItemStack func_82846_b(EntityPlayer playerIn, int index) {
        ItemStack itemstack = ItemStack.field_190927_a;
        Slot slot = (Slot)this.field_75151_b.get(index);
        if (slot != null && slot.func_75216_d()) {
            ItemStack itemstack1 = slot.func_75211_c();
            itemstack = itemstack1.func_77946_l();
            if (index < this.numRows * 9 ? !this.func_75135_a(itemstack1, this.numRows * 9, this.field_75151_b.size(), true) : !this.func_75135_a(itemstack1, 0, this.numRows * 9, false)) {
                return ItemStack.field_190927_a;
            }
            if (itemstack1.func_190926_b()) {
                slot.func_75215_d(ItemStack.field_190927_a);
            } else {
                slot.func_75218_e();
            }
        }
        return itemstack;
    }

    public TileEntityEnergonCrate getChestInventory() {
        return this.chestInventory;
    }
}

