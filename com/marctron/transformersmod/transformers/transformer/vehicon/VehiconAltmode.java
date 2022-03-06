/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
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
package com.marctron.transformersmod.transformers.transformer.vehicon;

import com.marctron.transformersmod.Main;
import com.marctron.transformersmod.init.ModItems;
import com.marctron.transformersmod.proxy.ClientProxy;
import com.marctron.transformersmod.transformers.models.vehicon.ModelVehiconAltmode;
import com.marctron.transformersmod.util.handlers.SoundsHandler;
import com.marctron.transformersmod.util.interfaces.IHasModel;
import javax.annotation.Nullable;
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

public final class VehiconAltmode
extends ItemArmor
implements IHasModel {
    private Object ModelVehiconAltmode = Float.valueOf(1.0f);
    @SideOnly(value=Side.CLIENT)
    private static ModelVehiconAltmode model = new ModelVehiconAltmode();

    public VehiconAltmode(String name, ItemArmor.ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        this.func_77655_b(name);
        this.setRegistryName(name);
        this.func_77637_a(null);
        this.func_77625_d(1);
        ModItems.ITEMS.add((Item)this);
    }

    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
        player.func_70690_d(new PotionEffect(MobEffects.field_76441_p, 10, 0));
        player.func_71040_bB(true);
        world.func_175688_a(EnumParticleTypes.SUSPENDED_DEPTH, player.field_70165_t, player.field_70163_u, player.field_70161_v, 0.0, 0.0, 0.0, new int[0]);
        player.field_70143_R = 0.0f;
        player.field_70726_aT = 0.0f;
        player.field_71109_bG = 0.0f;
        player.eyeHeight = 0.4f;
        if (Minecraft.func_71410_x().field_71474_y.field_74351_w.func_151470_d() && player.field_70122_E) {
            player.func_191958_b(0.0f, 0.0f, 0.025f, 3.0f);
        }
        if (itemStack.func_77973_b() == ModItems.VEHICON_ALTMODE_HELMET && world.field_72995_K && ClientProxy.ROBOT_MODE.func_151470_d()) {
            player.field_71071_by.field_70460_b.set(3, (Object)new ItemStack(ModItems.VEHICON_MID_2_HELMET));
            Minecraft.func_71410_x().field_71439_g.func_184185_a(SoundsHandler.TRANSFORMONE, 0.3f, 1.9f);
        }
        if (itemStack.func_77973_b() == ModItems.VEHICON_ALTMODE_CHESTPLATE && world.field_72995_K && ClientProxy.ROBOT_MODE.func_151470_d()) {
            player.field_71071_by.field_70460_b.set(2, (Object)new ItemStack(ModItems.VEHICON_MID_2_CHESTPLATE));
        }
        if (itemStack.func_77973_b() == ModItems.VEHICON_ALTMODE_LEGGINGS && world.field_72995_K && ClientProxy.ROBOT_MODE.func_151470_d()) {
            player.field_71071_by.field_70460_b.set(1, (Object)new ItemStack(ModItems.VEHICON_MID_2_LEGGINGS));
        }
        if (itemStack.func_77973_b() == ModItems.VEHICON_ALTMODE_BOOTS && world.field_72995_K && ClientProxy.ROBOT_MODE.func_151470_d()) {
            player.field_71071_by.field_70460_b.set(0, (Object)new ItemStack(ModItems.VEHICON_MID_2_BOOTS));
        }
    }

    @Override
    public final void registerModels() {
        Main.proxy.registerItemRenderer((Item)this, 0, "inventory");
    }

    @SideOnly(value=Side.CLIENT)
    @Nullable
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default) {
        if (!itemStack.func_190926_b() && itemStack.func_77973_b() instanceof ItemArmor) {
            VehiconAltmode.model.field_78116_c.field_78806_j = armorSlot == EntityEquipmentSlot.HEAD;
            VehiconAltmode.model.field_178720_f.field_78806_j = armorSlot == EntityEquipmentSlot.HEAD;
            VehiconAltmode.model.field_78115_e.field_78806_j = armorSlot == EntityEquipmentSlot.CHEST;
            VehiconAltmode.model.field_178723_h.field_78806_j = armorSlot == EntityEquipmentSlot.CHEST;
            VehiconAltmode.model.field_178724_i.field_78806_j = armorSlot == EntityEquipmentSlot.CHEST;
            VehiconAltmode.model.field_178721_j.field_78806_j = armorSlot == EntityEquipmentSlot.FEET;
            VehiconAltmode.model.field_178722_k.field_78806_j = armorSlot == EntityEquipmentSlot.FEET;
            VehiconAltmode.model.field_78117_n = _default.field_78117_n;
            VehiconAltmode.model.field_78093_q = _default.field_78093_q;
            VehiconAltmode.model.field_78091_s = _default.field_78091_s;
            VehiconAltmode.model.field_187076_m = _default.field_187076_m;
            VehiconAltmode.model.field_187075_l = _default.field_187075_l;
            return model;
        }
        return null;
    }
}

