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
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraft.world.World
 */
package com.marctron.transformersmod.items.gun;

import com.marctron.transformersmod.entity.EntityLargeRocket;
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
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class RocketLauncher
extends ItemGunBase {
    int Cooldown;

    public RocketLauncher(int cooldown) {
        super("rocket_launcher", 50);
        this.Cooldown = cooldown;
    }

    @Override
    public IShootable getAmmoItem() {
        return ModItems.Rocket_Clip;
    }

    @Override
    protected void spawnBullet(World world, EntityPlayer player) {
        player.func_184811_cZ().func_185145_a((Item)this, this.Cooldown);
        Vec3d aim = player.func_70040_Z();
        EntityLargeRocket fireball = new EntityLargeRocket(world, (EntityLivingBase)player, 1.0, 1.0, 1.0);
        fireball.func_70107_b(player.field_70165_t + aim.field_72450_a * 1.5, player.field_70163_u + aim.field_72448_b + 1.5, player.field_70161_v + aim.field_72449_c * 1.5);
        fireball.accelerationX = aim.field_72450_a * 0.15;
        fireball.accelerationY = aim.field_72448_b * 0.15;
        fireball.accelerationZ = aim.field_72449_c * 0.15;
        world.func_72838_d((Entity)fireball);
        fireball.explosionPower = 3;
    }

    @Override
    public void func_77624_a(ItemStack stack, @Nullable World world, List<String> list, ITooltipFlag flag) {
        list.add(TextFormatting.GOLD + I18n.func_135052_a((String)(TextFormatting.BOLD + I18n.func_135052_a((String)"Legendary", (Object[])new Object[0])), (Object[])new Object[0]));
        list.add("Ammo: " + this.getAmmoAmount(stack) + "/" + this.getMaxAmmo());
    }

    @Override
    public boolean getBoolean(String string) {
        return true;
    }
}

