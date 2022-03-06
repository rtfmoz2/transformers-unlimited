/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.client.resources.I18n
 *  net.minecraft.client.util.ITooltipFlag
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.NonNullList
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.marctron.transformersmod.items.gun;

import com.marctron.transformersmod.Main;
import com.marctron.transformersmod.items.ItemBase;
import com.marctron.transformersmod.items.gun.IShootable;
import com.marctron.transformersmod.util.NBTHelper;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class AmmoClip
extends ItemBase
implements IShootable {
    public int clipSize;

    public AmmoClip(String itemName, int clipSize) {
        super(itemName);
        this.func_77625_d(1);
        this.clipSize = clipSize;
        this.func_77637_a(Main.tabWeapons);
    }

    @SideOnly(value=Side.CLIENT)
    public void func_150895_a(CreativeTabs tab, NonNullList<ItemStack> items) {
        if (this.func_194125_a(tab)) {
            ItemStack clip = new ItemStack((Item)this);
            AmmoClip.setBulletsAmount(clip, 0);
            items.add((Object)clip.func_77946_l());
            AmmoClip.setBulletsAmount(clip, this.clipSize);
            items.add((Object)clip);
        }
    }

    public static void setBulletsAmount(ItemStack stack, int amount) {
        NBTHelper.setInteger(stack, "ammo", Math.max(Math.min(amount, ((AmmoClip)stack.func_77973_b()).clipSize), 0));
    }

    public static int getBulletsAmount(ItemStack stack) {
        return NBTHelper.getInt(stack, "ammo");
    }

    @SideOnly(value=Side.CLIENT)
    public void func_77624_a(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add(TextFormatting.YELLOW + I18n.func_135052_a((String)"Ammo", (Object[])new Object[0]));
        tooltip.add("Bullets: " + AmmoClip.getBulletsAmount(stack) + "/" + this.clipSize);
    }

    @Override
    public boolean isClip() {
        return true;
    }

    @Override
    public int getMaxAmmo() {
        return this.clipSize;
    }
}

