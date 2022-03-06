/*
 * Decompiled with CFR 0.152.
 */
package com.marctron.transformersmod.items.gun;

import com.marctron.transformersmod.items.ItemBase;
import com.marctron.transformersmod.items.gun.IShootable;

public class Bullet
extends ItemBase
implements IShootable {
    public Bullet(String itemName) {
        super(itemName);
    }

    public Bullet(String itemName, int maxStackSize) {
        super(itemName);
        this.func_77625_d(maxStackSize);
    }

    @Override
    public boolean isClip() {
        return false;
    }

    @Override
    public int getMaxAmmo() {
        return this.field_77777_bU;
    }
}

