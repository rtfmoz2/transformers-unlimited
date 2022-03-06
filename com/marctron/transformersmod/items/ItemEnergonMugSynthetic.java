/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.EnumAction
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemFood
 *  net.minecraft.item.ItemStack
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.world.World
 */
package com.marctron.transformersmod.items;

import com.marctron.transformersmod.Main;
import com.marctron.transformersmod.init.ModItems;
import com.marctron.transformersmod.util.interfaces.IHasModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemEnergonMugSynthetic
extends ItemFood
implements IHasModel {
    private PotionEffect[] effects;

    public ItemEnergonMugSynthetic(String name, int amount, boolean isWolfFood, PotionEffect ... potionEffects) {
        super(amount, isWolfFood);
        this.func_77655_b(name);
        this.setRegistryName(name);
        this.func_77637_a(Main.tabTransformers);
        this.func_77625_d(1);
        ModItems.ITEMS.add((Item)this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer((Item)this, 0, "inventory");
    }

    public EnumAction func_77661_b(ItemStack stack) {
        return EnumAction.DRINK;
    }

    protected void func_77849_c(ItemStack stack, World worldIn, EntityPlayer player) {
        for (PotionEffect effect : this.effects) {
            player.func_70690_d(effect);
        }
    }
}

