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
 *  net.minecraft.init.SoundEvents
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.ActionResult
 *  net.minecraft.util.EnumActionResult
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.SoundCategory
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.marctron.transformersmod.items.gun;

import com.marctron.transformersmod.Main;
import com.marctron.transformersmod.entity.EntityBullet;
import com.marctron.transformersmod.init.ModItems;
import com.marctron.transformersmod.items.ItemBase;
import com.marctron.transformersmod.items.gun.IGun;
import com.marctron.transformersmod.items.gun.IShootable;
import com.marctron.transformersmod.items.gun.ItemGunBase;
import com.marctron.transformersmod.util.NBTHelper;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Scrapper
extends ItemBase
implements IGun {
    private final int minSpeed = 30;
    private final int maxSpeed = 2;
    private final float acceleration = -0.2f;
    private final float deceleration = 0.4f;
    private float curSpeed = 30.0f;
    private int lastShotTick = 0;
    private int ammoCache;
    private boolean isInUse = false;

    public Scrapper() {
        super("scrapper");
        this.func_77625_d(1);
        this.func_77637_a(Main.tabWeapons);
    }

    private int getMaxAmmo() {
        return this.getAmmoItem().getMaxAmmo();
    }

    @Override
    public boolean getBoolean(String string) {
        return true;
    }

    public int func_77626_a(ItemStack stack) {
        return 72000;
    }

    public ActionResult<ItemStack> func_77659_a(World worldIn, EntityPlayer playerIn, EnumHand hand) {
        ItemStack stack = playerIn.func_184586_b(hand);
        int ammo = this.getAmmoAmount(stack);
        if (playerIn.func_70093_af()) {
            if (!worldIn.field_72995_K && ammo < this.getMaxAmmo()) {
                ItemGunBase.reloadAll(playerIn, stack);
            }
        } else {
            if (playerIn.field_71075_bZ.field_75098_d && ammo == 0) {
                return new ActionResult(EnumActionResult.PASS, (Object)stack);
            }
            this.lastShotTick = 0;
            this.ammoCache = ammo;
            this.isInUse = true;
            if (playerIn.field_71075_bZ.field_75098_d) {
                this.curSpeed = 2.0f;
            }
            playerIn.func_184598_c(hand);
        }
        return new ActionResult(EnumActionResult.SUCCESS, (Object)stack);
    }

    public void onUsingTick(ItemStack stack, EntityLivingBase player, int count) {
        if (player.field_70170_p.field_72995_K) {
            return;
        }
        if (this.ammoCache <= 0) {
            player.func_184597_cx();
        }
        int ticksUsed = this.func_77626_a(stack) - count;
        this.curSpeed += -0.2f;
        if (this.curSpeed > 30.0f) {
            this.curSpeed = 30.0f;
        } else if (this.curSpeed < 2.0f) {
            this.curSpeed = 2.0f;
        }
        if ((float)ticksUsed >= (float)this.lastShotTick + this.curSpeed) {
            player.field_70170_p.func_72838_d((Entity)new EntityBullet(player.field_70170_p, player, 5.0f));
            player.field_70170_p.func_184133_a(null, player.func_180425_c(), SoundEvents.field_187737_v, SoundCategory.NEUTRAL, 1.0f, 1.0f / (field_77697_d.nextFloat() * 0.4f + 1.2f) + 0.5f);
            this.lastShotTick = ticksUsed;
            if (!((EntityPlayer)player).field_71075_bZ.field_75098_d) {
                --this.ammoCache;
            }
        }
    }

    public void func_77615_a(ItemStack stack, World worldIn, EntityLivingBase entityLiving, int timeLeft) {
        this.isInUse = false;
        this.setAmmoAmount(stack, this.ammoCache);
    }

    public void func_77663_a(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
        if (entityIn.field_70170_p.field_72995_K || !(entityIn instanceof EntityPlayer)) {
            return;
        }
        EntityPlayer player = (EntityPlayer)entityIn;
        if (!player.func_184587_cr() && this.curSpeed < 30.0f) {
            this.curSpeed += 0.4f;
            if (this.curSpeed > 30.0f) {
                this.curSpeed = 30.0f;
            }
        }
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
    public IShootable getAmmoItem() {
        return ModItems.Scrapper_Clip;
    }

    public boolean showDurabilityBar(ItemStack stack) {
        return true;
    }

    public double getDurabilityForDisplay(ItemStack stack) {
        int ammoAmount = this.isInUse ? this.ammoCache : this.getAmmoAmount(stack);
        return 1.0f - (float)ammoAmount / (float)this.getMaxAmmo();
    }

    @SideOnly(value=Side.CLIENT)
    public void func_77624_a(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add(TextFormatting.GOLD + I18n.func_135052_a((String)(TextFormatting.BOLD + I18n.func_135052_a((String)"Legendary", (Object[])new Object[0])), (Object[])new Object[0]));
        tooltip.add("Ammo: " + this.getAmmoAmount(stack) + "/" + this.getMaxAmmo());
    }
}

