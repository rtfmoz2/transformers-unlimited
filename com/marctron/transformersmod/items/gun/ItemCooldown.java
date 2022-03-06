/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.ActionResult
 *  net.minecraft.util.EnumActionResult
 *  net.minecraft.util.EnumHand
 *  net.minecraft.world.World
 */
package com.marctron.transformersmod.items.gun;

import com.marctron.transformersmod.items.ItemBase;
import com.marctron.transformersmod.util.NBTHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemCooldown
extends ItemBase {
    protected final int MAX_COOLDOWN;
    protected static final String KEY_COOLDOWN = "cooldown";
    private final boolean durabilityBar;

    public ItemCooldown(String itemName, int maxCooldown) {
        this(itemName, maxCooldown, true);
    }

    public ItemCooldown(String itemName, int maxCooldown, boolean useDurabilityBar) {
        super(itemName);
        this.func_77625_d(1);
        this.MAX_COOLDOWN = maxCooldown;
        this.durabilityBar = useDurabilityBar;
    }

    public static boolean isActive(ItemStack stack) {
        return NBTHelper.getInt(stack, KEY_COOLDOWN) > 0;
    }

    protected boolean doRightClickAction(ItemStack stack, World world, EntityPlayer player, EnumHand hand) {
        return true;
    }

    public ActionResult<ItemStack> func_77659_a(World world, EntityPlayer player, EnumHand hand) {
        ItemStack stack = player.func_184586_b(hand);
        int cooldown = NBTHelper.getInt(stack, KEY_COOLDOWN);
        if (cooldown > 0) {
            return new ActionResult(EnumActionResult.PASS, (Object)stack);
        }
        boolean startCooldown = this.doRightClickAction(stack, world, player, hand);
        if (!player.func_184812_l_() && startCooldown && player.func_184812_l_()) {
            NBTHelper.setInteger(stack, KEY_COOLDOWN, this.MAX_COOLDOWN);
        }
        return new ActionResult(EnumActionResult.SUCCESS, (Object)stack);
    }

    public void func_77663_a(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
        int cooldown = NBTHelper.getInt(stack, KEY_COOLDOWN);
        if (cooldown > 0) {
            NBTHelper.setInteger(stack, KEY_COOLDOWN, --cooldown);
        }
    }

    public boolean shouldCauseReequipAnimation(ItemStack oldStack, ItemStack newStack, boolean slotChanged) {
        return !oldStack.func_77969_a(newStack) || ItemCooldown.isActive(oldStack) != ItemCooldown.isActive(newStack);
    }

    public boolean showDurabilityBar(ItemStack stack) {
        return this.durabilityBar && NBTHelper.getInt(stack, KEY_COOLDOWN) > 0;
    }

    public double getDurabilityForDisplay(ItemStack stack) {
        return (float)NBTHelper.getInt(stack, KEY_COOLDOWN) / (float)this.MAX_COOLDOWN;
    }
}

