/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.inventory.IInventory
 *  net.minecraft.inventory.ItemStackHelper
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.NonNullList
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentString
 *  net.minecraft.util.text.TextComponentTranslation
 */
package com.marctron.transformersmod.util;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;

public class InventorySimple
implements IInventory {
    private String title;
    private final boolean hasCustomName;
    private final int slotCount;
    private final int stackLimit;
    private final NonNullList<ItemStack> contents;

    public InventorySimple(String title, boolean hasCustomName, int slotCount, int stackLimit) {
        this.title = title;
        this.hasCustomName = hasCustomName;
        this.slotCount = slotCount;
        this.stackLimit = stackLimit;
        this.contents = NonNullList.func_191197_a((int)slotCount, (Object)ItemStack.field_190927_a);
    }

    public ItemStack addItem(ItemStack stack) {
        ItemStack itemstack = stack.func_77946_l();
        for (int i = 0; i < this.slotCount; ++i) {
            ItemStack itemstack1 = this.func_70301_a(i);
            if (itemstack1.func_190926_b() && this.func_94041_b(i, itemstack)) {
                this.func_70299_a(i, itemstack);
                this.func_70296_d();
                return null;
            }
            if (!ItemStack.func_179545_c((ItemStack)itemstack1, (ItemStack)itemstack)) continue;
            int j = Math.min(this.func_70297_j_(), itemstack1.func_77976_d());
            int k = Math.min(itemstack.func_190916_E(), j - itemstack1.func_190916_E());
            if (k <= 0) continue;
            itemstack1.func_190917_f(k);
            itemstack.func_190918_g(k);
            if (itemstack.func_190916_E() > 0) continue;
            this.func_70296_d();
            return null;
        }
        if (itemstack.func_190916_E() != stack.func_190916_E()) {
            this.func_70296_d();
        }
        return itemstack;
    }

    public int func_70302_i_() {
        return this.slotCount;
    }

    public boolean func_191420_l() {
        return false;
    }

    public ItemStack func_70301_a(int index) {
        return index >= 0 && index < this.slotCount ? (ItemStack)this.contents.get(index) : ItemStack.field_190927_a;
    }

    public ItemStack func_70298_a(int index, int count) {
        ItemStack itemStack = ItemStackHelper.func_188382_a(this.contents, (int)index, (int)count);
        if (!itemStack.func_190926_b()) {
            this.func_70296_d();
        }
        return itemStack;
    }

    public ItemStack func_70304_b(int index) {
        if (!((ItemStack)this.contents.get(index)).func_190926_b()) {
            ItemStack itemstack = (ItemStack)this.contents.get(index);
            this.contents.set(index, (Object)ItemStack.field_190927_a);
            return itemstack;
        }
        return null;
    }

    public void func_70299_a(int index, ItemStack stack) {
        this.contents.set(index, (Object)stack);
        if (stack.func_190916_E() > this.func_70297_j_()) {
            stack.func_190920_e(this.func_70297_j_());
        }
        this.func_70296_d();
    }

    public int func_70297_j_() {
        return this.stackLimit;
    }

    public void func_70296_d() {
    }

    public boolean func_70300_a(EntityPlayer player) {
        return true;
    }

    public void func_174889_b(EntityPlayer player) {
    }

    public void func_174886_c(EntityPlayer player) {
    }

    public boolean func_94041_b(int index, ItemStack stack) {
        return true;
    }

    public int func_174887_a_(int id) {
        return 0;
    }

    public void func_174885_b(int id, int value) {
    }

    public int func_174890_g() {
        return 0;
    }

    public void func_174888_l() {
        this.contents.clear();
    }

    public String func_70005_c_() {
        return this.title;
    }

    public boolean func_145818_k_() {
        return this.hasCustomName;
    }

    public ITextComponent func_145748_c_() {
        return this.func_145818_k_() ? new TextComponentString(this.func_70005_c_()) : new TextComponentTranslation(this.func_70005_c_(), new Object[0]);
    }
}

