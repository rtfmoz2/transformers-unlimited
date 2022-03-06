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
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package com.marctron.transformersmod.transformers;

import com.marctron.transformersmod.Main;
import com.marctron.transformersmod.init.ModItems;
import com.marctron.transformersmod.proxy.ClientProxy;
import com.marctron.transformersmod.transformers.models.movieop.MovieOptimusPrimeModel;
import com.marctron.transformersmod.util.interfaces.IHasModel;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
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
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MovieOptimusPrime
extends ItemArmor
implements IHasModel {
    @SideOnly(value=Side.CLIENT)
    private static MovieOptimusPrimeModel model = new MovieOptimusPrimeModel();

    public MovieOptimusPrime(String name, ItemArmor.ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        this.func_77655_b(name);
        this.setRegistryName(name);
        this.func_77637_a(Main.tabAutobot);
        this.func_77625_d(1);
        ModItems.ITEMS.add((Item)this);
    }

    @Override
    public final void registerModels() {
        Main.proxy.registerItemRenderer((Item)this, 0, "inventory");
    }

    public void func_77624_a(ItemStack stack, @Nullable World world, List<String> list, ITooltipFlag flag) {
        list.add(TextFormatting.GRAY + I18n.func_135052_a((String)(TextFormatting.BOLD + I18n.func_135052_a((String)"MOVIE", (Object[])new Object[0])), (Object[])new Object[0]));
    }

    @SubscribeEvent
    public final void onArmorTick(final World world, final EntityPlayer player, final ItemStack itemStack) {
        ItemStack heldItem;
        player.func_70690_d(new PotionEffect(MobEffects.field_76441_p, 10, 0));
        if (!Minecraft.func_71410_x().field_71474_y.field_74313_G.func_151470_d() && !player.func_184812_l_()) {
            player.field_71075_bZ.field_75100_b = false;
        }
        if ((heldItem = player.field_71071_by.func_70448_g()) != null && heldItem.func_77973_b() == ModItems.PHASE_SHIFTER) {
            if (Minecraft.func_71410_x().field_71474_y.field_74314_A.func_151470_d()) {
                player.field_70181_x -= (double)0.014f;
                player.field_70181_x = Math.min(0.25, player.field_70181_x);
            }
            if (Minecraft.func_71410_x().field_71474_y.field_74313_G.func_151470_d()) {
                player.field_70739_aP = 0.0f;
                player.field_70145_X = true;
                player.func_70031_b(true);
                player.func_70045_F();
                player.func_180427_aV();
                player.func_70648_aU();
                player.field_70172_ad = 20;
                if (Minecraft.func_71410_x().field_71474_y.field_74351_w.func_151470_d()) {
                    player.field_70181_x -= (double)0.0015f;
                    player.field_70181_x = Math.min(0.25, player.field_70181_x);
                }
                if (!Minecraft.func_71410_x().field_71474_y.field_74311_E.func_151470_d()) {
                    player.field_71075_bZ.field_75100_b = true;
                }
            }
        }
        if (world.field_72995_K) {
            if (Minecraft.func_71410_x().field_71474_y.field_74314_A.func_151470_d()) {
                // empty if block
            }
            if (ClientProxy.MY_KEYBINDING.func_151470_d()) {
                Timer timer = new Timer();
                timer.schedule(new TimerTask(){

                    @Override
                    public void run() {
                        if (world.field_72995_K) {
                            if (itemStack.func_77973_b() == ModItems.STARSCREAM_BOOTS) {
                                player.field_71071_by.field_70460_b.set(0, (Object)new ItemStack(ModItems.STARSCREAM_MID1_BOOTS));
                            }
                            if (itemStack.func_77973_b() == ModItems.STARSCREAM_LEGGINGS) {
                                player.field_71071_by.field_70460_b.set(1, (Object)new ItemStack(ModItems.STARSCREAM_MID1_LEGGINGS));
                            }
                            if (itemStack.func_77973_b() == ModItems.STARSCREAM_CHESTPLATE) {
                                player.field_71071_by.field_70460_b.set(2, (Object)new ItemStack(ModItems.STARSCREAM_MID1_CHESTPLATE));
                            }
                            if (itemStack.func_77973_b() == ModItems.STARSCREAM_HELMET) {
                                player.field_71071_by.field_70460_b.set(3, (Object)new ItemStack(ModItems.STARSCREAM_MID1_HELMET));
                            }
                        }
                    }
                }, 60L);
            }
        }
    }

    @SideOnly(value=Side.CLIENT)
    public final ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default) {
        if (!itemStack.func_190926_b() && itemStack.func_77973_b() instanceof ItemArmor) {
            MovieOptimusPrime.model.field_78116_c.field_78806_j = armorSlot == EntityEquipmentSlot.HEAD;
            MovieOptimusPrime.model.field_178720_f.field_78806_j = armorSlot == EntityEquipmentSlot.HEAD;
            MovieOptimusPrime.model.field_78115_e.field_78806_j = armorSlot == EntityEquipmentSlot.CHEST || armorSlot == EntityEquipmentSlot.CHEST;
            MovieOptimusPrime.model.field_178723_h.field_78806_j = armorSlot == EntityEquipmentSlot.CHEST;
            MovieOptimusPrime.model.field_178724_i.field_78806_j = armorSlot == EntityEquipmentSlot.CHEST;
            MovieOptimusPrime.model.field_178721_j.field_78806_j = armorSlot == EntityEquipmentSlot.LEGS;
            MovieOptimusPrime.model.field_178722_k.field_78806_j = armorSlot == EntityEquipmentSlot.LEGS;
            MovieOptimusPrime.model.field_78117_n = _default.field_78117_n;
            MovieOptimusPrime.model.field_78093_q = _default.field_78093_q;
            MovieOptimusPrime.model.field_78091_s = _default.field_78091_s;
            MovieOptimusPrime.model.field_187076_m = _default.field_187076_m;
            MovieOptimusPrime.model.field_187075_l = _default.field_187075_l;
            return model;
        }
        return null;
    }
}

