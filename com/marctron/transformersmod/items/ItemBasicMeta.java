/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.NonNullList
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.marctron.transformersmod.items;

import com.marctron.transformersmod.items.ItemBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemBasicMeta
extends ItemBase {
    protected String[] subNames;

    public ItemBasicMeta(String itemName, String ... subNames) {
        super(itemName);
        this.func_77627_a(subNames != null && subNames.length > 0);
        this.subNames = this.field_77787_bX ? subNames : null;
    }

    @SideOnly(value=Side.CLIENT)
    public void func_150895_a(CreativeTabs tab, NonNullList<ItemStack> items) {
        if (this.func_194125_a(tab)) {
            items.add((Object)new ItemStack((Item)this));
        }
    }

    public String func_77667_c(ItemStack stack) {
        if (this.field_77787_bX) {
            return super.func_77667_c(stack) + "." + this.getSubNames()[stack.func_77960_j()];
        }
        return super.func_77667_c(stack);
    }

    public String[] getSubNames() {
        return this.subNames;
    }
}

