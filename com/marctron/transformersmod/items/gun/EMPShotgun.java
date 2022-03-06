/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.client.resources.I18n
 *  net.minecraft.client.util.ITooltipFlag
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraft.world.World
 */
package com.marctron.transformersmod.items.gun;

import com.marctron.transformersmod.entity.EntityBullet;
import com.marctron.transformersmod.init.ModItems;
import com.marctron.transformersmod.items.gun.IShootable;
import com.marctron.transformersmod.items.gun.ItemGunBase;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class EMPShotgun
extends ItemGunBase {
    int Cooldown;

    public EMPShotgun(int cooldown) {
        super("empshotgun", 11);
        this.Cooldown = cooldown;
    }

    @Override
    public IShootable getAmmoItem() {
        return ModItems.EMP_Shotgun_Shell;
    }

    @Override
    protected void spawnBullet(World world, EntityPlayer player) {
        player.func_184811_cZ().func_185145_a((Item)this, this.Cooldown);
        for (int i = 0; i < 6; ++i) {
            world.func_72838_d((Entity)new EntityBullet(world, (EntityLivingBase)player, 10.0f).setDamage(2.0f));
        }
    }

    @Override
    public void func_77624_a(ItemStack stack, @Nullable World world, List<String> list, ITooltipFlag flag) {
        list.add(TextFormatting.AQUA + I18n.func_135052_a((String)(TextFormatting.BOLD + I18n.func_135052_a((String)"Uncommon", (Object[])new Object[0])), (Object[])new Object[0]));
        list.add("Ammo: " + this.getAmmoAmount(stack) + "/" + this.getMaxAmmo());
    }

    @Override
    public boolean getBoolean(String string) {
        return true;
    }
}

