/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.model.ModelBiped
 *  net.minecraft.client.resources.I18n
 *  net.minecraft.client.util.ITooltipFlag
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
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.marctron.transformersmod.transformers.transformer.starscream;

import com.marctron.transformersmod.Main;
import com.marctron.transformersmod.init.ModItems;
import com.marctron.transformersmod.proxy.ClientProxy;
import com.marctron.transformersmod.transformers.models.starscream.ModelStarscream;
import com.marctron.transformersmod.util.handlers.SoundsHandler;
import com.marctron.transformersmod.util.interfaces.IHasModel;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Starscream
extends ItemArmor
implements IHasModel {
    @SideOnly(value=Side.CLIENT)
    private static ModelStarscream model = new ModelStarscream();

    public Starscream(String name, ItemArmor.ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        this.func_77655_b(name);
        this.setRegistryName(name);
        this.func_77637_a(Main.tabDecepticon);
        this.func_77625_d(1);
        ModItems.ITEMS.add((Item)this);
    }

    @Override
    public final void registerModels() {
        Main.proxy.registerItemRenderer((Item)this, 0, "inventory");
    }

    public void func_77624_a(ItemStack stack, @Nullable World world, List<String> list, ITooltipFlag flag) {
        list.add(TextFormatting.GRAY + I18n.func_135052_a((String)(TextFormatting.BOLD + I18n.func_135052_a((String)"G1", (Object[])new Object[0])), (Object[])new Object[0]));
    }

    @SubscribeEvent
    public final void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
        player.func_70690_d(new PotionEffect(MobEffects.field_76441_p, 10, 0));
        player.field_70143_R = 0.0f;
        if (world.field_72995_K) {
            if (Minecraft.func_71410_x().field_71474_y.field_74314_A.func_151470_d()) {
                player.func_174829_m();
                player.field_70181_x += (double)0.1f;
                player.field_70181_x = Math.min(0.25, player.field_70181_x);
                if (Minecraft.func_71410_x().field_71474_y.field_74351_w.func_151470_d()) {
                    player.func_70031_b(false);
                    player.func_191958_b(0.0f, 0.0f, 0.0099f, 3.0f);
                }
                world.func_175688_a(EnumParticleTypes.REDSTONE, player.field_70165_t, player.field_70163_u + 0.15, player.field_70161_v, 0.6, 0.0, 0.85, new int[0]);
                world.func_175688_a(EnumParticleTypes.REDSTONE, player.field_70165_t + 0.2, player.field_70163_u + 0.15, player.field_70161_v, 0.6, 0.0, 0.85, new int[0]);
                world.func_175688_a(EnumParticleTypes.REDSTONE, player.field_70165_t - 0.2, player.field_70163_u + 0.15, player.field_70161_v, 0.6, 0.0, 0.85, new int[0]);
                world.func_175688_a(EnumParticleTypes.REDSTONE, player.field_70165_t, player.field_70163_u + 0.15, player.field_70161_v + 0.2, 0.6, 0.0, 0.85, new int[0]);
                world.func_175688_a(EnumParticleTypes.REDSTONE, player.field_70165_t, player.field_70163_u + 0.15, player.field_70161_v - 0.2, 0.6, 0.0, 0.85, new int[0]);
                world.func_175688_a(EnumParticleTypes.SMOKE_NORMAL, player.field_70165_t, player.field_70163_u, player.field_70161_v, 0.0, -0.1, 0.0, new int[0]);
            }
            if (ClientProxy.MY_KEYBINDING.func_151470_d()) {
                if (itemStack.func_77973_b() == ModItems.STARSCREAM_BOOTS && world.field_72995_K) {
                    player.field_71071_by.field_70460_b.set(0, (Object)new ItemStack(ModItems.STARSCREAM_MID1_BOOTS));
                    Minecraft.func_71410_x().field_71439_g.func_184185_a(SoundsHandler.TRANSFORMTWO, 0.3f, 1.85f);
                }
                if (itemStack.func_77973_b() == ModItems.STARSCREAM_LEGGINGS && world.field_72995_K) {
                    player.field_71071_by.field_70460_b.set(1, (Object)new ItemStack(ModItems.STARSCREAM_MID1_LEGGINGS));
                }
                if (itemStack.func_77973_b() == ModItems.STARSCREAM_CHESTPLATE && world.field_72995_K) {
                    player.field_71071_by.field_70460_b.set(2, (Object)new ItemStack(ModItems.STARSCREAM_MID1_CHESTPLATE));
                }
                if (itemStack.func_77973_b() == ModItems.STARSCREAM_HELMET && world.field_72995_K) {
                    player.field_71071_by.field_70460_b.set(3, (Object)new ItemStack(ModItems.STARSCREAM_MID1_HELMET));
                }
                if (itemStack.func_77973_b() == ModItems.SKYWARP_BOOTS && world.field_72995_K) {
                    player.field_71071_by.field_70460_b.set(0, (Object)new ItemStack(ModItems.SKYWARP_MID1_BOOTS));
                    Minecraft.func_71410_x().field_71439_g.func_184185_a(SoundsHandler.TRANSFORMTWO, 0.3f, 1.85f);
                }
                if (itemStack.func_77973_b() == ModItems.SKYWARP_LEGGINGS && world.field_72995_K) {
                    player.field_71071_by.field_70460_b.set(1, (Object)new ItemStack(ModItems.SKYWARP_MID1_LEGGINGS));
                }
                if (itemStack.func_77973_b() == ModItems.SKYWARP_CHESTPLATE && world.field_72995_K) {
                    player.field_71071_by.field_70460_b.set(2, (Object)new ItemStack(ModItems.SKYWARP_MID1_CHESTPLATE));
                }
                if (itemStack.func_77973_b() == ModItems.SKYWARP_HELMET && world.field_72995_K) {
                    player.field_71071_by.field_70460_b.set(3, (Object)new ItemStack(ModItems.SKYWARP_MID1_HELMET));
                }
                if (itemStack.func_77973_b() == ModItems.THUNDERCRACKER_BOOTS && world.field_72995_K) {
                    player.field_71071_by.field_70460_b.set(0, (Object)new ItemStack(ModItems.THUNDERCRACKER_MID1_BOOTS));
                    Minecraft.func_71410_x().field_71439_g.func_184185_a(SoundsHandler.TRANSFORMTWO, 0.3f, 1.85f);
                }
                if (itemStack.func_77973_b() == ModItems.THUNDERCRACKER_LEGGINGS && world.field_72995_K) {
                    player.field_71071_by.field_70460_b.set(1, (Object)new ItemStack(ModItems.THUNDERCRACKER_MID1_LEGGINGS));
                }
                if (itemStack.func_77973_b() == ModItems.THUNDERCRACKER_CHESTPLATE && world.field_72995_K) {
                    player.field_71071_by.field_70460_b.set(2, (Object)new ItemStack(ModItems.THUNDERCRACKER_MID1_CHESTPLATE));
                }
                if (itemStack.func_77973_b() == ModItems.THUNDERCRACKER_HELMET && world.field_72995_K) {
                    player.field_71071_by.field_70460_b.set(3, (Object)new ItemStack(ModItems.THUNDERCRACKER_MID1_HELMET));
                }
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
            Starscream.model.field_78116_c.field_78806_j = armorSlot == EntityEquipmentSlot.HEAD;
            Starscream.model.field_178720_f.field_78806_j = armorSlot == EntityEquipmentSlot.HEAD;
            Starscream.model.field_78115_e.field_78806_j = armorSlot == EntityEquipmentSlot.CHEST || armorSlot == EntityEquipmentSlot.CHEST;
            Starscream.model.field_178723_h.field_78806_j = armorSlot == EntityEquipmentSlot.CHEST;
            Starscream.model.field_178724_i.field_78806_j = armorSlot == EntityEquipmentSlot.CHEST;
            Starscream.model.field_178721_j.field_78806_j = armorSlot == EntityEquipmentSlot.LEGS;
            Starscream.model.field_178722_k.field_78806_j = armorSlot == EntityEquipmentSlot.LEGS;
            Starscream.model.field_78117_n = _default.field_78117_n;
            Starscream.model.field_78093_q = _default.field_78093_q;
            Starscream.model.field_78091_s = _default.field_78091_s;
            Starscream.model.field_187076_m = _default.field_187076_m;
            Starscream.model.field_187075_l = _default.field_187075_l;
            return model;
        }
        return null;
    }
}

