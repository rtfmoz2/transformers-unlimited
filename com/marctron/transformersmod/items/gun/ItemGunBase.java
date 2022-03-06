/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.client.util.ITooltipFlag
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.SoundEvents
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.SoundCategory
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.marctron.transformersmod.items.gun;

import com.marctron.transformersmod.Main;
import com.marctron.transformersmod.items.gun.AmmoClip;
import com.marctron.transformersmod.items.gun.IGun;
import com.marctron.transformersmod.items.gun.IShootable;
import com.marctron.transformersmod.items.gun.ItemCooldown;
import com.marctron.transformersmod.util.LogHelper;
import com.marctron.transformersmod.util.NBTHelper;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class ItemGunBase
extends ItemCooldown
implements IGun {
    public ItemGunBase(String itemName, int maxCooldown) {
        super(itemName, maxCooldown);
        this.func_77637_a(Main.tabWeapons);
    }

    protected abstract void spawnBullet(World var1, EntityPlayer var2);

    public int getMaxAmmo() {
        return this.getAmmoItem().getMaxAmmo();
    }

    @Override
    protected boolean doRightClickAction(ItemStack stack, World world, EntityPlayer player, EnumHand hand) {
        if (world.field_72995_K) {
            return true;
        }
        int ammo = this.getAmmoAmount(stack);
        if (player.func_70093_af()) {
            if (ammo < this.getMaxAmmo()) {
                ItemGunBase.reloadAll(player, stack);
                return true;
            }
            return false;
        }
        if (!player.field_71075_bZ.field_75098_d && ammo == 0) {
            player.field_70170_p.func_184133_a(null, player.func_180425_c(), SoundEvents.field_187576_at, SoundCategory.NEUTRAL, 1.0f, 1.0f / (field_77697_d.nextFloat() * 0.4f + 1.2f) + 0.5f);
            return false;
        }
        this.spawnBullet(world, player);
        player.field_70170_p.func_184133_a(null, player.func_180425_c(), SoundEvents.field_187797_fA, SoundCategory.NEUTRAL, 1.0f, 1.0f / (field_77697_d.nextFloat() * 0.4f + 1.2f) + 1.0E-5f);
        if (!player.field_71075_bZ.field_75098_d) {
            this.setAmmoAmount(stack, --ammo);
        }
        return true;
    }

    private static boolean isAmmoForGun(ItemStack gun, ItemStack ammo) {
        if (!(gun.func_77973_b() instanceof IGun) || !(ammo.func_77973_b() instanceof IShootable)) {
            return false;
        }
        return ((IGun)gun.func_77973_b()).getAmmoItem() == ammo.func_77973_b();
    }

    public static void reloadAll(EntityPlayer player, ItemStack gunStack) {
        int i;
        if (!(gunStack.func_77973_b() instanceof IGun)) {
            LogHelper.error("Trying to reload an ItemStack that is null or it's Item isn't an instance of IUseAmmo!");
            return;
        }
        for (EnumHand hand : EnumHand.values()) {
            ItemStack heldStack = player.func_184586_b(hand);
            int remaining = ItemGunBase.reloadWithStack(gunStack, heldStack);
            if (heldStack.func_190916_E() == 0) {
                player.func_184611_a(hand, ItemStack.field_190927_a);
            }
            if (remaining != 0) continue;
            return;
        }
        for (i = 0; i < player.field_71071_by.field_70462_a.size(); ++i) {
            ItemStack itemStack = (ItemStack)player.field_71071_by.field_70462_a.get(i);
        }
        for (i = 0; i < player.field_71071_by.field_70462_a.size(); ++i) {
            ItemStack stack = (ItemStack)player.field_71071_by.field_70462_a.get(i);
            int remaining = ItemGunBase.reloadWithStack(gunStack, stack);
            if (stack.func_190916_E() == 0) {
                player.field_71071_by.field_70462_a.set(i, (Object)ItemStack.field_190927_a);
            }
            if (remaining != 0) continue;
            return;
        }
    }

    public static int reloadWithStack(ItemStack gunStack, ItemStack clipStack) {
        if (!ItemGunBase.isAmmoForGun(gunStack, clipStack) || !(clipStack.func_77973_b() instanceof IShootable)) {
            return -1;
        }
        boolean isClip = ((IShootable)clipStack.func_77973_b()).isClip();
        int ammo = isClip ? AmmoClip.getBulletsAmount(clipStack) : clipStack.func_190916_E();
        int remaining = ItemGunBase.reload(gunStack, ammo);
        if (isClip) {
            AmmoClip.setBulletsAmount(clipStack, remaining);
        } else {
            clipStack.func_190920_e(remaining);
        }
        return ((IGun)gunStack.func_77973_b()).getAmmoSpace(gunStack);
    }

    public static int reload(ItemStack gunStack, int bullets) {
        int spaceInGun = ((IGun)gunStack.func_77973_b()).getAmmoSpace(gunStack);
        if (spaceInGun == 0 || bullets == 0) {
            return bullets;
        }
        int toRefill = Math.min(spaceInGun, bullets);
        ((IGun)gunStack.func_77973_b()).setAmmoAmount(gunStack, ((IGun)gunStack.func_77973_b()).getAmmoAmount(gunStack) + toRefill);
        return bullets - toRefill;
    }

    @Override
    public void setAmmoAmount(ItemStack stack, int amount) {
        NBTHelper.setInteger(stack, "ammo", Math.max(amount, 0));
    }

    @Override
    public int getAmmoAmount(ItemStack stack) {
        return NBTHelper.getInt(stack, "ammo");
    }

    @Override
    public int getAmmoSpace(ItemStack stack) {
        return this.getMaxAmmo() - this.getAmmoAmount(stack);
    }

    @Override
    public boolean showDurabilityBar(ItemStack stack) {
        return true;
    }

    @Override
    public double getDurabilityForDisplay(ItemStack stack) {
        return 1.0f - (float)this.getAmmoAmount(stack) / (float)this.getMaxAmmo();
    }

    @SideOnly(value=Side.CLIENT)
    public void func_77624_a(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add("Ammo: " + this.getAmmoAmount(stack) + "/" + this.getMaxAmmo());
    }
}

