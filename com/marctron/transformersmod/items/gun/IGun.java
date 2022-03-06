/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  net.minecraft.item.ItemStack
 */
package com.marctron.transformersmod.items.gun;

import com.marctron.transformersmod.items.gun.IShootable;
import javax.annotation.Nonnull;
import net.minecraft.item.ItemStack;

public interface IGun {
    public void setAmmoAmount(ItemStack var1, int var2);

    public int getAmmoAmount(ItemStack var1);

    public int getAmmoSpace(ItemStack var1);

    @Nonnull
    public IShootable getAmmoItem();

    public boolean getBoolean(String var1);
}

