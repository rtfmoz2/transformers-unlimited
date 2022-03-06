/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.Item
 */
package com.marctron.transformersmod.items;

import com.marctron.transformersmod.Main;
import net.minecraft.item.Item;

public class ItemBasic
extends Item {
    protected final String TOOLTIP;

    public ItemBasic(String itemName) {
        this.func_77637_a(Main.tabTransformers);
        this.func_77655_b(itemName);
        this.setRegistryName(itemName);
        this.TOOLTIP = this.func_77658_a() + ".tooltip.";
    }
}

