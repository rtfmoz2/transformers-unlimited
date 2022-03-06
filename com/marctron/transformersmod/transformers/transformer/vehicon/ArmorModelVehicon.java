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
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.marctron.transformersmod.transformers.transformer.vehicon;

import com.marctron.transformersmod.Main;
import com.marctron.transformersmod.init.ModItems;
import com.marctron.transformersmod.proxy.ClientProxy;
import com.marctron.transformersmod.transformers.models.vehicon.ModelCustomArmor;
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
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ArmorModelVehicon
extends ItemArmor
implements IHasModel {
    @SideOnly(value=Side.CLIENT)
    private static ModelCustomArmor model = new ModelCustomArmor();

    public ArmorModelVehicon(String name, ItemArmor.ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        this.func_77655_b(name);
        this.setRegistryName(name);
        this.func_77637_a(Main.tabDecepticon);
        this.func_77625_d(1);
        ModItems.ITEMS.add((Item)this);
    }

    public void func_77624_a(ItemStack stack, @Nullable World world, List<String> list, ITooltipFlag flag) {
        list.add(TextFormatting.GRAY + I18n.func_135052_a((String)(TextFormatting.BOLD + I18n.func_135052_a((String)"War for Cybertron", (Object[])new Object[0])), (Object[])new Object[0]));
    }

    public final void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
        player.func_70690_d(new PotionEffect(MobEffects.field_76441_p, 160, 0));
        player.eyeHeight = 1.65f;
        if (itemStack.func_77973_b() == ModItems.CUSTOM_HELMET && world.field_72995_K && ClientProxy.MY_KEYBINDING.func_151470_d()) {
            player.field_71071_by.field_70460_b.set(3, (Object)new ItemStack(ModItems.VEHICON_MID_HELMET));
            Minecraft.func_71410_x().field_71439_g.func_184185_a(SoundsHandler.TRANSFORMTWO, 0.3f, 1.85f);
        }
        if (itemStack.func_77973_b() == ModItems.CUSTOM_CHESTPLATE && world.field_72995_K && ClientProxy.MY_KEYBINDING.func_151470_d()) {
            player.field_71071_by.field_70460_b.set(2, (Object)new ItemStack(ModItems.VEHICON_MID_CHESTPLATE));
        }
        if (itemStack.func_77973_b() == ModItems.CUSTOM_LEGGINGS && world.field_72995_K && ClientProxy.MY_KEYBINDING.func_151470_d()) {
            player.field_71071_by.field_70460_b.set(1, (Object)new ItemStack(ModItems.VEHICON_MID_LEGGINGS));
        }
        if (itemStack.func_77973_b() == ModItems.CUSTOM_BOOTS && world.field_72995_K && ClientProxy.MY_KEYBINDING.func_151470_d()) {
            player.field_71071_by.field_70460_b.set(0, (Object)new ItemStack(ModItems.VEHICON_MID_BOOTS));
        }
    }

    @Override
    public final void registerModels() {
        Main.proxy.registerItemRenderer((Item)this, 0, "inventory");
    }

    @SideOnly(value=Side.CLIENT)
    public final ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default) {
        if (!itemStack.func_190926_b() && itemStack.func_77973_b() instanceof ItemArmor) {
            ArmorModelVehicon.model.field_78116_c.field_78806_j = armorSlot == EntityEquipmentSlot.HEAD;
            ArmorModelVehicon.model.field_178720_f.field_78806_j = armorSlot == EntityEquipmentSlot.HEAD;
            ArmorModelVehicon.model.field_78115_e.field_78806_j = armorSlot == EntityEquipmentSlot.CHEST;
            ArmorModelVehicon.model.field_178723_h.field_78806_j = armorSlot == EntityEquipmentSlot.CHEST;
            ArmorModelVehicon.model.field_178724_i.field_78806_j = armorSlot == EntityEquipmentSlot.CHEST;
            ArmorModelVehicon.model.field_178721_j.field_78806_j = armorSlot == EntityEquipmentSlot.FEET;
            ArmorModelVehicon.model.field_178722_k.field_78806_j = armorSlot == EntityEquipmentSlot.FEET;
            ArmorModelVehicon.model.field_78117_n = _default.field_78117_n;
            ArmorModelVehicon.model.field_78093_q = _default.field_78093_q;
            ArmorModelVehicon.model.field_78091_s = _default.field_78091_s;
            ArmorModelVehicon.model.field_187076_m = _default.field_187076_m;
            ArmorModelVehicon.model.field_187075_l = _default.field_187075_l;
            return model;
        }
        return null;
    }
}

