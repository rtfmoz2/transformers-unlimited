/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.model.ModelBiped
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.MobEffects
 *  net.minecraft.inventory.EntityEquipmentSlot
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemArmor
 *  net.minecraft.item.ItemArmor$ArmorMaterial
 *  net.minecraft.item.ItemStack
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.EnumParticleTypes
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.marctron.transformersmod.transformers.transformer.starscream;

import com.marctron.transformersmod.Main;
import com.marctron.transformersmod.init.ModItems;
import com.marctron.transformersmod.proxy.ClientProxy;
import com.marctron.transformersmod.transformers.models.starscream.ModelStarscreamAltmode;
import com.marctron.transformersmod.util.handlers.SoundsHandler;
import com.marctron.transformersmod.util.interfaces.IHasModel;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class StarscreamAltmode
extends ItemArmor
implements IHasModel {
    @SideOnly(value=Side.CLIENT)
    private static ModelStarscreamAltmode model = new ModelStarscreamAltmode();

    public StarscreamAltmode(String name, ItemArmor.ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        this.func_77655_b(name);
        this.setRegistryName(name);
        this.func_77637_a(null);
        this.func_77625_d(1);
        ModItems.ITEMS.add((Item)this);
    }

    @Override
    public final void registerModels() {
        Main.proxy.registerItemRenderer((Item)this, 0, "inventory");
    }

    public final void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
        player.func_70690_d(new PotionEffect(MobEffects.field_76441_p, 10, 0));
        player.field_70143_R = 0.0f;
        player.func_71040_bB(true);
        if (ClientProxy.ROBOT_MODE.func_151470_d()) {
            if (itemStack.func_77973_b() == ModItems.STARSCREAM_ALTMODE_BOOTS && world.field_72995_K) {
                player.field_71071_by.field_70460_b.set(0, (Object)new ItemStack(ModItems.STARSCREAM_MID4_BOOTS));
                Minecraft.func_71410_x().field_71439_g.func_184185_a(SoundsHandler.TRANSFORMONE, 0.3f, 1.9f);
            }
            if (itemStack.func_77973_b() == ModItems.STARSCREAM_ALTMODE_LEGGINGS && world.field_72995_K) {
                player.field_71071_by.field_70460_b.set(1, (Object)new ItemStack(ModItems.STARSCREAM_MID4_LEGGINGS));
            }
            if (itemStack.func_77973_b() == ModItems.STARSCREAM_ALTMODE_CHESTPLATE && world.field_72995_K) {
                player.field_71071_by.field_70460_b.set(2, (Object)new ItemStack(ModItems.STARSCREAM_MID4_CHESTPLATE));
            }
            if (itemStack.func_77973_b() == ModItems.STARSCREAM_ALTMODE_HELMET && world.field_72995_K) {
                player.field_71071_by.field_70460_b.set(3, (Object)new ItemStack(ModItems.STARSCREAM_MID4_HELMET));
            }
            if (itemStack.func_77973_b() == ModItems.SKYWARP_ALTMODE_BOOTS && world.field_72995_K) {
                player.field_71071_by.field_70460_b.set(0, (Object)new ItemStack(ModItems.SKYWARP_MID4_BOOTS));
                Minecraft.func_71410_x().field_71439_g.func_184185_a(SoundsHandler.TRANSFORMONE, 0.3f, 1.9f);
            }
            if (itemStack.func_77973_b() == ModItems.SKYWARP_ALTMODE_LEGGINGS && world.field_72995_K) {
                player.field_71071_by.field_70460_b.set(1, (Object)new ItemStack(ModItems.SKYWARP_MID4_LEGGINGS));
            }
            if (itemStack.func_77973_b() == ModItems.SKYWARP_ALTMODE_CHESTPLATE && world.field_72995_K) {
                player.field_71071_by.field_70460_b.set(2, (Object)new ItemStack(ModItems.SKYWARP_MID4_CHESTPLATE));
            }
            if (itemStack.func_77973_b() == ModItems.SKYWARP_ALTMODE_HELMET && world.field_72995_K) {
                player.field_71071_by.field_70460_b.set(3, (Object)new ItemStack(ModItems.SKYWARP_MID4_HELMET));
            }
            if (itemStack.func_77973_b() == ModItems.THUNDERCRACKER_ALTMODE_BOOTS && world.field_72995_K) {
                player.field_71071_by.field_70460_b.set(0, (Object)new ItemStack(ModItems.THUNDERCRACKER_MID4_BOOTS));
                Minecraft.func_71410_x().field_71439_g.func_184185_a(SoundsHandler.TRANSFORMONE, 0.3f, 1.9f);
            }
            if (itemStack.func_77973_b() == ModItems.THUNDERCRACKER_ALTMODE_LEGGINGS && world.field_72995_K) {
                player.field_71071_by.field_70460_b.set(1, (Object)new ItemStack(ModItems.THUNDERCRACKER_MID4_LEGGINGS));
            }
            if (itemStack.func_77973_b() == ModItems.THUNDERCRACKER_ALTMODE_CHESTPLATE && world.field_72995_K) {
                player.field_71071_by.field_70460_b.set(2, (Object)new ItemStack(ModItems.THUNDERCRACKER_MID4_CHESTPLATE));
            }
            if (itemStack.func_77973_b() == ModItems.THUNDERCRACKER_ALTMODE_HELMET && world.field_72995_K) {
                player.field_71071_by.field_70460_b.set(3, (Object)new ItemStack(ModItems.THUNDERCRACKER_MID4_HELMET));
            }
            if (!player.field_70122_E && Minecraft.func_71410_x().field_71474_y.field_74351_w.func_151470_d()) {
                player.func_70031_b(false);
                player.func_191958_b(0.0f, 0.0f, 0.01f, 3.0f);
            }
        }
        player.func_70031_b(false);
        player.func_191958_b(0.0f, 0.0f, 0.01f, 3.0f);
        world.func_175688_a(EnumParticleTypes.REDSTONE, player.field_70165_t, player.field_70163_u + 1.3, player.field_70161_v, 0.6, 0.0, 0.85, new int[0]);
        world.func_175688_a(EnumParticleTypes.REDSTONE, player.field_70165_t + 0.2, player.field_70163_u + 1.3, player.field_70161_v, 0.6, 0.0, 0.85, new int[0]);
        world.func_175688_a(EnumParticleTypes.REDSTONE, player.field_70165_t - 0.2, player.field_70163_u + 1.3, player.field_70161_v, 0.6, 0.0, 0.85, new int[0]);
        world.func_175688_a(EnumParticleTypes.REDSTONE, player.field_70165_t, player.field_70163_u + 1.3, player.field_70161_v + 0.2, 0.6, 0.0, 0.85, new int[0]);
        world.func_175688_a(EnumParticleTypes.REDSTONE, player.field_70165_t, player.field_70163_u + 1.3, player.field_70161_v - 0.2, 0.6, 0.0, 0.85, new int[0]);
        player.field_70726_aT = 0.0f;
        player.field_71109_bG = 0.0f;
        if (Minecraft.func_71410_x().field_71474_y.field_74351_w.func_151470_d()) {
            world.func_175688_a(EnumParticleTypes.REDSTONE, player.field_70165_t, player.field_70163_u + 0.15, player.field_70161_v, 0.6, 0.0, 0.85, new int[0]);
            world.func_175688_a(EnumParticleTypes.REDSTONE, player.field_70165_t + 0.2, player.field_70163_u + 0.15, player.field_70161_v, 0.6, 0.0, 0.85, new int[0]);
            world.func_175688_a(EnumParticleTypes.REDSTONE, player.field_70165_t - 0.2, player.field_70163_u + 0.15, player.field_70161_v, 0.6, 0.0, 0.85, new int[0]);
            world.func_175688_a(EnumParticleTypes.REDSTONE, player.field_70165_t, player.field_70163_u + 0.15, player.field_70161_v + 0.2, 0.6, 0.0, 0.85, new int[0]);
            world.func_175688_a(EnumParticleTypes.REDSTONE, player.field_70165_t, player.field_70163_u + 0.15, player.field_70161_v - 0.2, 0.6, 0.0, 0.85, new int[0]);
            player.func_70031_b(false);
            player.func_191958_b(0.0f, 0.0f, 0.01f, 3.0f);
        }
        if (Minecraft.func_71410_x().field_71474_y.field_74368_y.func_151470_d()) {
            player.func_70031_b(false);
            player.func_191958_b(0.0f, 0.0f, -0.01f, 3.0f);
        }
        if (Minecraft.func_71410_x().field_71474_y.field_74314_A.func_151470_d()) {
            player.field_70181_x += (double)0.3f;
            player.field_70181_x = Math.min((double)0.45f, player.field_70181_x);
            if (Minecraft.func_71410_x().field_71474_y.field_74351_w.func_151470_d()) {
                player.func_70031_b(false);
                player.func_191958_b(0.0f, 0.0f, 0.01f, 3.0f);
            }
            if (itemStack.func_77973_b() != ModItems.STARSCREAM_ALTMODE_CHESTPLATE || world.field_72995_K) {
                // empty if block
            }
        }
    }

    private void setSize(float f, float f1) {
        f = 0.6f;
        f1 = 2.9f;
    }

    @SideOnly(value=Side.CLIENT)
    public final ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default) {
        if (!itemStack.func_190926_b() && itemStack.func_77973_b() instanceof ItemArmor) {
            StarscreamAltmode.model.field_78116_c.field_78806_j = armorSlot == EntityEquipmentSlot.HEAD;
            StarscreamAltmode.model.field_178720_f.field_78806_j = armorSlot == EntityEquipmentSlot.HEAD;
            StarscreamAltmode.model.field_78115_e.field_78806_j = armorSlot == EntityEquipmentSlot.CHEST || armorSlot == EntityEquipmentSlot.CHEST;
            StarscreamAltmode.model.field_178723_h.field_78806_j = armorSlot == EntityEquipmentSlot.CHEST;
            StarscreamAltmode.model.field_178724_i.field_78806_j = armorSlot == EntityEquipmentSlot.CHEST;
            StarscreamAltmode.model.field_178721_j.field_78806_j = armorSlot == EntityEquipmentSlot.LEGS;
            StarscreamAltmode.model.field_178722_k.field_78806_j = armorSlot == EntityEquipmentSlot.LEGS;
            StarscreamAltmode.model.field_78117_n = _default.field_78117_n;
            StarscreamAltmode.model.field_78093_q = _default.field_78093_q;
            StarscreamAltmode.model.field_78091_s = _default.field_78091_s;
            StarscreamAltmode.model.field_187076_m = _default.field_187076_m;
            StarscreamAltmode.model.field_187075_l = _default.field_187075_l;
            return model;
        }
        return null;
    }
}

