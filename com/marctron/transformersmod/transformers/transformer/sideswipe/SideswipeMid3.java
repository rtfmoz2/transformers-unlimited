/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.marctron.transformersmod.transformers.transformer.sideswipe;

import com.marctron.transformersmod.Main;
import com.marctron.transformersmod.init.ModItems;
import com.marctron.transformersmod.transformers.models.sideswipe.ModelSideswipeMid;
import com.marctron.transformersmod.util.interfaces.IHasModel;
import java.util.Timer;
import java.util.TimerTask;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SideswipeMid3
extends ItemArmor
implements IHasModel {
    @SideOnly(value=Side.CLIENT)
    private static ModelSideswipeMid model = new ModelSideswipeMid();

    public SideswipeMid3(String name, ItemArmor.ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        this.func_77655_b(name);
        this.setRegistryName(name);
        this.func_77637_a(null);
        this.func_77625_d(1);
        ModItems.ITEMS.add((Item)this);
    }

    public void onArmorTick(final World world, final EntityPlayer player, final ItemStack itemStack) {
        player.func_70690_d(new PotionEffect(MobEffects.field_76441_p, 20, 0));
        Timer timer = new Timer();
        timer.schedule(new TimerTask(){

            @Override
            public void run() {
                player.eyeHeight = 1.25f;
                if (itemStack.func_77973_b() == ModItems.SIDESWIPE_MID3_HELMET && world.field_72995_K) {
                    player.field_71071_by.field_70460_b.set(3, (Object)new ItemStack(ModItems.SIDESWIPE_HELMET));
                }
                if (itemStack.func_77973_b() == ModItems.SIDESWIPE_MID3_CHESTPLATE && world.field_72995_K) {
                    player.field_71071_by.field_70460_b.set(2, (Object)new ItemStack(ModItems.SIDESWIPE_CHESTPLATE));
                }
                if (itemStack.func_77973_b() == ModItems.SIDESWIPE_MID3_LEGGINGS && world.field_72995_K) {
                    player.field_71071_by.field_70460_b.set(1, (Object)new ItemStack(ModItems.SIDESWIPE_LEGGINGS));
                }
                if (itemStack.func_77973_b() == ModItems.SIDESWIPE_MID3_BOOTS && world.field_72995_K) {
                    player.field_71071_by.field_70460_b.set(0, (Object)new ItemStack(ModItems.SIDESWIPE_BOOTS));
                }
            }
        }, 60L);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer((Item)this, 0, "inventory");
    }

    @SideOnly(value=Side.CLIENT)
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default) {
        if (!itemStack.func_190926_b() && itemStack.func_77973_b() instanceof ItemArmor) {
            SideswipeMid3.model.field_78116_c.field_78806_j = armorSlot == EntityEquipmentSlot.HEAD;
            SideswipeMid3.model.field_178720_f.field_78806_j = armorSlot == EntityEquipmentSlot.HEAD;
            SideswipeMid3.model.field_78115_e.field_78806_j = armorSlot == EntityEquipmentSlot.CHEST;
            SideswipeMid3.model.field_178723_h.field_78806_j = armorSlot == EntityEquipmentSlot.CHEST;
            SideswipeMid3.model.field_178724_i.field_78806_j = armorSlot == EntityEquipmentSlot.CHEST;
            SideswipeMid3.model.field_178721_j.field_78806_j = armorSlot == EntityEquipmentSlot.FEET;
            SideswipeMid3.model.field_178722_k.field_78806_j = armorSlot == EntityEquipmentSlot.FEET;
            SideswipeMid3.model.field_78117_n = _default.field_78117_n;
            SideswipeMid3.model.field_78093_q = _default.field_78093_q;
            SideswipeMid3.model.field_78091_s = _default.field_78091_s;
            SideswipeMid3.model.field_187076_m = _default.field_187076_m;
            SideswipeMid3.model.field_187075_l = _default.field_187075_l;
            return model;
        }
        return null;
    }
}

