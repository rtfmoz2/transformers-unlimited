/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.client.resources.I18n
 *  net.minecraft.client.util.ITooltipFlag
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraft.world.World
 */
package com.marctron.transformersmod.items;

import com.marctron.transformersmod.Main;
import com.marctron.transformersmod.init.ModItems;
import com.marctron.transformersmod.util.interfaces.IHasModel;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class ItemPhaseShifter
extends Item
implements IHasModel {
    protected final String TOOLTIP;
    private PotionEffect[] effects;

    public ItemPhaseShifter(String name) {
        this.func_77655_b(name);
        this.setRegistryName(name);
        this.func_77637_a(Main.tabTransformers);
        this.TOOLTIP = this.func_77658_a() + ".tooltip.";
        this.func_77625_d(1);
        ModItems.ITEMS.add(this);
    }

    public void onUsingTick(ItemStack stack, EntityLivingBase player, int count) {
        player.field_70145_X = true;
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }

    public void func_77624_a(ItemStack stack, @Nullable World world, List<String> list, ITooltipFlag flag) {
        list.add(TextFormatting.DARK_PURPLE + I18n.func_135052_a((String)(TextFormatting.BOLD + I18n.func_135052_a((String)"Mythic", (Object[])new Object[0])), (Object[])new Object[0]));
    }
}

