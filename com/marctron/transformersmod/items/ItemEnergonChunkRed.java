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
 *  net.minecraft.util.ActionResult
 *  net.minecraft.util.EnumActionResult
 *  net.minecraft.util.EnumHand
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
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemEnergonChunkRed
extends ItemFood
implements IHasModel {
    int HealthFix;
    int Cooldown;
    private PotionEffect[] effects;

    public ItemEnergonChunkRed(String name, int amount, boolean isWolfFood, int StackSize, int health, int cooldown) {
        super(amount, isWolfFood);
        this.func_77655_b(name);
        this.setRegistryName(name);
        this.func_77637_a(Main.tabTransformers);
        this.Cooldown = cooldown;
        this.HealthFix = health;
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

    public ActionResult<ItemStack> func_77659_a(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        ItemStack itemstack = playerIn.func_184586_b(handIn);
        if (playerIn.func_110143_aJ() != playerIn.func_110138_aP()) {
            playerIn.func_184811_cZ().func_185145_a((Item)this, this.Cooldown);
            if (!worldIn.field_72995_K) {
                playerIn.func_70606_j(playerIn.func_110143_aJ() + (float)this.HealthFix);
            }
            playerIn.field_71071_by.func_174925_a(ModItems.RED_ENERGON_MUG, 0, 1, null);
        }
        return new ActionResult(EnumActionResult.SUCCESS, (Object)itemstack);
    }
}

