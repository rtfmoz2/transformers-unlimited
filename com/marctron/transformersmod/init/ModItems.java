/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.init.SoundEvents
 *  net.minecraft.inventory.EntityEquipmentSlot
 *  net.minecraft.item.Item
 *  net.minecraft.item.Item$ToolMaterial
 *  net.minecraft.item.ItemArmor$ArmorMaterial
 *  net.minecraft.item.ItemStack
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.SoundEvent
 *  net.minecraftforge.common.util.EnumHelper
 */
package com.marctron.transformersmod.init;

import com.marctron.transformersmod.init.EItemBasic;
import com.marctron.transformersmod.items.ItemBase;
import com.marctron.transformersmod.items.ItemBasicMeta;
import com.marctron.transformersmod.items.ItemEnergonMug;
import com.marctron.transformersmod.items.ItemEnergonMugDark;
import com.marctron.transformersmod.items.ItemEnergonMugRed;
import com.marctron.transformersmod.items.ItemEnergonMugSynthetic;
import com.marctron.transformersmod.items.ItemMedkit;
import com.marctron.transformersmod.items.ItemPhaseShifter;
import com.marctron.transformersmod.items.ItemStarSaber;
import com.marctron.transformersmod.items.ModdedBow;
import com.marctron.transformersmod.items.gun.AmmoClip;
import com.marctron.transformersmod.items.gun.EMPShotgun;
import com.marctron.transformersmod.items.gun.EnergonBattlePistol;
import com.marctron.transformersmod.items.gun.IGun;
import com.marctron.transformersmod.items.gun.IShootable;
import com.marctron.transformersmod.items.gun.NeutronRepeater;
import com.marctron.transformersmod.items.gun.RocketLauncher;
import com.marctron.transformersmod.items.gun.ScatterBlaster;
import com.marctron.transformersmod.items.gun.Scrapper;
import com.marctron.transformersmod.transformers.ArmorModelTarn;
import com.marctron.transformersmod.transformers.MovieOptimusPrime;
import com.marctron.transformersmod.transformers.transformer.Tarn2;
import com.marctron.transformersmod.transformers.transformer.sideswipe.ArmorModelSideswipe;
import com.marctron.transformersmod.transformers.transformer.sideswipe.SideswipeAltmode;
import com.marctron.transformersmod.transformers.transformer.sideswipe.SideswipeMid;
import com.marctron.transformersmod.transformers.transformer.sideswipe.SideswipeMid2;
import com.marctron.transformersmod.transformers.transformer.sideswipe.SideswipeMid3;
import com.marctron.transformersmod.transformers.transformer.sideswipe.SideswipeMid4;
import com.marctron.transformersmod.transformers.transformer.starscream.Starscream;
import com.marctron.transformersmod.transformers.transformer.starscream.StarscreamAltmode;
import com.marctron.transformersmod.transformers.transformer.starscream.StarscreamMid1;
import com.marctron.transformersmod.transformers.transformer.starscream.StarscreamMid2;
import com.marctron.transformersmod.transformers.transformer.starscream.StarscreamMid3;
import com.marctron.transformersmod.transformers.transformer.starscream.StarscreamMid4;
import com.marctron.transformersmod.transformers.transformer.starscream.StarscreamMid5;
import com.marctron.transformersmod.transformers.transformer.starscream.StarscreamMid6;
import com.marctron.transformersmod.transformers.transformer.vehicon.ArmorModelVehicon;
import com.marctron.transformersmod.transformers.transformer.vehicon.VehiconAltmode;
import com.marctron.transformersmod.transformers.transformer.vehicon.VehiconMid;
import com.marctron.transformersmod.transformers.transformer.vehicon.VehiconMid2;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<Item>();
    public static final Item ENERGON_SHARD = new ItemBase("energon_shard");
    public static final Item BLUE_ENERGON_SHARD = new ItemBase("blue_energon_shard");
    public static final Item RED_ENERGON_SHARD = new ItemBase("red_energon_shard");
    public static final Item DARK_ENERGON_SHARD = new ItemBase("dark_energon_shard");
    public static final Item SYNTHETIC_ENERGON_SHARD = new ItemBase("synthetic_energon_shard");
    public static final Item MUG = new ItemBase("mug");
    public static final Item ENERGON_MUG = new ItemEnergonMug("energon_mug", 4, false, new PotionEffect[0]);
    public static final Item RED_ENERGON_MUG = new ItemEnergonMugRed("red_energon_mug", 4, false, new PotionEffect[0]);
    public static final Item DARK_ENERGON_MUG = new ItemEnergonMugDark("dark_energon_mug", 4, false, new PotionEffect[0]);
    public static final Item SYNTHETIC_ENERGON_MUG = new ItemEnergonMugSynthetic("synthetic_energon_mug", 4, false, new PotionEffect[0]);
    public static final Item TRANSFORMIUM = new ItemBase("transformium");
    public static final Item SILICON = new ItemBase("silicon");
    public static final Item PALE_GREEN_DYE = new ItemBase("pale_green_dye");
    public static final Item PALE_BROWN_DYE = new ItemBase("pale_brown_dye");
    public static final Item DARK_RED_DYE = new ItemBase("dark_red_dye");
    public static final Item DARK_GRAY_DYE = new ItemBase("dark_gray_dye");
    public static final Item BEIGE_DYE = new ItemBase("beige_dye");
    public static final Item.ToolMaterial GUN_MATERIAL = EnumHelper.addToolMaterial((String)"gun", (int)0, (int)1000, (float)2.0f, (float)0.0f, (int)0);
    public static final Item.ToolMaterial SWORD_MATERIAL = EnumHelper.addToolMaterial((String)"sword", (int)0, (int)1000, (float)2.0f, (float)4.0f, (int)0);
    public static final ItemArmor.ArmorMaterial CUSTOM_MODEL_MATERIAL = EnumHelper.addArmorMaterial((String)"custom_model", (String)"tm:custom_model", (int)10, (int[])new int[]{3, 3, 3, 3}, (int)0, (SoundEvent)SoundEvents.field_187719_p, (float)2.0f);
    public static final ItemArmor.ArmorMaterial TARN_MODEL_MATERIAL = EnumHelper.addArmorMaterial((String)"tarn_model", (String)"tm:tarn_model", (int)20, (int[])new int[]{7, 8, 8, 9}, (int)0, (SoundEvent)SoundEvents.field_187719_p, (float)2.0f);
    public static final ItemArmor.ArmorMaterial TARN2_MODEL_MATERIAL = EnumHelper.addArmorMaterial((String)"tarn2_model", (String)"tm:tarn2_model", (int)20, (int[])new int[]{7, 8, 8, 9}, (int)0, (SoundEvent)SoundEvents.field_187719_p, (float)2.0f);
    public static final ItemArmor.ArmorMaterial STARSCREAM_MODEL_MATERIAL = EnumHelper.addArmorMaterial((String)"starscream_model", (String)"tm:starscream_model", (int)20, (int[])new int[]{7, 8, 8, 9}, (int)0, (SoundEvent)SoundEvents.field_187719_p, (float)2.0f);
    public static final ItemArmor.ArmorMaterial MOVIE_OPTIMUS_PRIME_MATERIAL = EnumHelper.addArmorMaterial((String)"movie_optimus_prime_model", (String)"tm:movie_optimus_prime_model", (int)1000, (int[])new int[]{7, 8, 8, 9}, (int)0, (SoundEvent)SoundEvents.field_187719_p, (float)2.0f);
    public static final ItemArmor.ArmorMaterial SKYWARP_MODEL_MATERIAL = EnumHelper.addArmorMaterial((String)"skywarp_model", (String)"tm:skywarp_model", (int)20, (int[])new int[]{7, 8, 8, 9}, (int)0, (SoundEvent)SoundEvents.field_187719_p, (float)2.0f);
    public static final ItemArmor.ArmorMaterial THUNDERCRACKER_MODEL_MATERIAL = EnumHelper.addArmorMaterial((String)"thundercracker_model", (String)"tm:thundercracker_model", (int)20, (int[])new int[]{7, 8, 8, 9}, (int)0, (SoundEvent)SoundEvents.field_187719_p, (float)2.0f);
    public static final ItemArmor.ArmorMaterial SIDESWIPE_MODEL_MATERIAL = EnumHelper.addArmorMaterial((String)"sideswipe_model", (String)"tm:sideswipe_model", (int)20, (int[])new int[]{7, 8, 8, 9}, (int)0, (SoundEvent)SoundEvents.field_187719_p, (float)2.0f);
    public static final ItemArmor.ArmorMaterial IRONHIDE_MATERIAL = EnumHelper.addArmorMaterial((String)"ironhide_model", (String)"tm:ironhide_model", (int)20, (int[])new int[]{7, 8, 8, 9}, (int)0, (SoundEvent)SoundEvents.field_187719_p, (float)2.0f);
    public static final ItemArmor.ArmorMaterial VEHICON_ALTMODE_MATERIAL = EnumHelper.addArmorMaterial((String)"vehicon_altmode_model", (String)"tm:vehicon_altmode_model", (int)20, (int[])new int[]{5, 5, 5, 5}, (int)0, (SoundEvent)SoundEvents.field_187719_p, (float)2.0f);
    public static final ItemArmor.ArmorMaterial SIDESWIPE_ALTMODE_MATERIAL = EnumHelper.addArmorMaterial((String)"sideswipe_altmode_model", (String)"tm:sideswipe_altmode_model", (int)20, (int[])new int[]{5, 5, 5, 5}, (int)0, (SoundEvent)SoundEvents.field_187719_p, (float)2.0f);
    public static final ItemArmor.ArmorMaterial SKYWARP_ALTMODE_MATERIAL = EnumHelper.addArmorMaterial((String)"skywarp_altmode_model", (String)"tm:skywarp_altmode_model", (int)20, (int[])new int[]{7, 8, 8, 9}, (int)0, (SoundEvent)SoundEvents.field_187719_p, (float)2.0f);
    public static final Item MOVIE_OPTIMUS_PRIME_HELMET = new MovieOptimusPrime("movie_optimus_prime_helmet", MOVIE_OPTIMUS_PRIME_MATERIAL, 1, EntityEquipmentSlot.HEAD);
    public static final Item MOVIE_OPTIMUS_PRIME_CHESTPLATE = new MovieOptimusPrime("movie_optimus_prime_chestplate", MOVIE_OPTIMUS_PRIME_MATERIAL, 1, EntityEquipmentSlot.CHEST);
    public static final Item MOVIE_OPTIMUS_PRIME_LEGGINGS = new MovieOptimusPrime("movie_optimus_prime_leggings", MOVIE_OPTIMUS_PRIME_MATERIAL, 2, EntityEquipmentSlot.LEGS);
    public static final Item MOVIE_OPTIMUS_PRIME_BOOTS = new MovieOptimusPrime("movie_optimus_prime_boots", MOVIE_OPTIMUS_PRIME_MATERIAL, 1, EntityEquipmentSlot.FEET);
    public static final Item CUSTOM_HELMET = new ArmorModelVehicon("custom_helmet", CUSTOM_MODEL_MATERIAL, 1, EntityEquipmentSlot.HEAD);
    public static final Item CUSTOM_CHESTPLATE = new ArmorModelVehicon("custom_chestplate", CUSTOM_MODEL_MATERIAL, 1, EntityEquipmentSlot.CHEST);
    public static final Item CUSTOM_LEGGINGS = new ArmorModelVehicon("custom_leggings", CUSTOM_MODEL_MATERIAL, 2, EntityEquipmentSlot.LEGS);
    public static final Item CUSTOM_BOOTS = new ArmorModelVehicon("custom_boots", CUSTOM_MODEL_MATERIAL, 1, EntityEquipmentSlot.FEET);
    public static final Item VEHICON_MID_HELMET = new VehiconMid("vehicon_mid_helmet", VEHICON_ALTMODE_MATERIAL, 1, EntityEquipmentSlot.HEAD);
    public static final Item VEHICON_MID_CHESTPLATE = new VehiconMid("vehicon_mid_chestplate", VEHICON_ALTMODE_MATERIAL, 1, EntityEquipmentSlot.CHEST);
    public static final Item VEHICON_MID_LEGGINGS = new VehiconMid("vehicon_mid_leggings", VEHICON_ALTMODE_MATERIAL, 2, EntityEquipmentSlot.LEGS);
    public static final Item VEHICON_MID_BOOTS = new VehiconMid("vehicon_mid_boots", VEHICON_ALTMODE_MATERIAL, 1, EntityEquipmentSlot.FEET);
    public static final Item VEHICON_MID_2_HELMET = new VehiconMid2("vehicon_mid_2_helmet", VEHICON_ALTMODE_MATERIAL, 1, EntityEquipmentSlot.HEAD);
    public static final Item VEHICON_MID_2_CHESTPLATE = new VehiconMid2("vehicon_mid_2_chestplate", VEHICON_ALTMODE_MATERIAL, 1, EntityEquipmentSlot.CHEST);
    public static final Item VEHICON_MID_2_LEGGINGS = new VehiconMid2("vehicon_mid_2_leggings", VEHICON_ALTMODE_MATERIAL, 2, EntityEquipmentSlot.LEGS);
    public static final Item VEHICON_MID_2_BOOTS = new VehiconMid2("vehicon_mid_2_boots", VEHICON_ALTMODE_MATERIAL, 1, EntityEquipmentSlot.FEET);
    public static final Item VEHICON_ALTMODE_HELMET = new VehiconAltmode("vehicon_altmode_helmet", VEHICON_ALTMODE_MATERIAL, 1, EntityEquipmentSlot.HEAD);
    public static final Item VEHICON_ALTMODE_CHESTPLATE = new VehiconAltmode("vehicon_altmode_chestplate", VEHICON_ALTMODE_MATERIAL, 1, EntityEquipmentSlot.CHEST);
    public static final Item VEHICON_ALTMODE_LEGGINGS = new VehiconAltmode("vehicon_altmode_leggings", VEHICON_ALTMODE_MATERIAL, 2, EntityEquipmentSlot.LEGS);
    public static final Item VEHICON_ALTMODE_BOOTS = new VehiconAltmode("vehicon_altmode_boots", VEHICON_ALTMODE_MATERIAL, 1, EntityEquipmentSlot.FEET);
    public static final Item TARN_HELMET = new Tarn2("tarn_helmet", TARN2_MODEL_MATERIAL, 1, EntityEquipmentSlot.HEAD);
    public static final Item TARN_CHESTPLATE = new ArmorModelTarn("tarn_chestplate", TARN2_MODEL_MATERIAL, 1, EntityEquipmentSlot.CHEST);
    public static final Item TARN_LEGGINGS = new Tarn2("tarn_leggings", TARN2_MODEL_MATERIAL, 2, EntityEquipmentSlot.LEGS);
    public static final Item TARN_BOOTS = new Tarn2("tarn_boots", TARN2_MODEL_MATERIAL, 1, EntityEquipmentSlot.FEET);
    public static final Item STARSCREAM_HELMET = new Starscream("starscream_helmet", STARSCREAM_MODEL_MATERIAL, 1, EntityEquipmentSlot.HEAD);
    public static final Item STARSCREAM_CHESTPLATE = new Starscream("starscream_chestplate", STARSCREAM_MODEL_MATERIAL, 1, EntityEquipmentSlot.CHEST);
    public static final Item STARSCREAM_LEGGINGS = new Starscream("starscream_leggings", STARSCREAM_MODEL_MATERIAL, 2, EntityEquipmentSlot.LEGS);
    public static final Item STARSCREAM_BOOTS = new Starscream("starscream_boots", STARSCREAM_MODEL_MATERIAL, 1, EntityEquipmentSlot.FEET);
    public static final Item STARSCREAM_MID1_HELMET = new StarscreamMid1("starscream_mid1_helmet", STARSCREAM_MODEL_MATERIAL, 1, EntityEquipmentSlot.HEAD);
    public static final Item STARSCREAM_MID1_CHESTPLATE = new StarscreamMid1("starscream_mid1_chestplate", STARSCREAM_MODEL_MATERIAL, 1, EntityEquipmentSlot.CHEST);
    public static final Item STARSCREAM_MID1_LEGGINGS = new StarscreamMid1("starscream_mid1_leggings", STARSCREAM_MODEL_MATERIAL, 2, EntityEquipmentSlot.LEGS);
    public static final Item STARSCREAM_MID1_BOOTS = new StarscreamMid1("starscream_mid1_boots", STARSCREAM_MODEL_MATERIAL, 1, EntityEquipmentSlot.FEET);
    public static final Item STARSCREAM_MID2_HELMET = new StarscreamMid2("starscream_mid2_helmet", STARSCREAM_MODEL_MATERIAL, 1, EntityEquipmentSlot.HEAD);
    public static final Item STARSCREAM_MID2_CHESTPLATE = new StarscreamMid2("starscream_mid2_chestplate", STARSCREAM_MODEL_MATERIAL, 1, EntityEquipmentSlot.CHEST);
    public static final Item STARSCREAM_MID2_LEGGINGS = new StarscreamMid2("starscream_mid2_leggings", STARSCREAM_MODEL_MATERIAL, 2, EntityEquipmentSlot.LEGS);
    public static final Item STARSCREAM_MID2_BOOTS = new StarscreamMid2("starscream_mid2_boots", STARSCREAM_MODEL_MATERIAL, 1, EntityEquipmentSlot.FEET);
    public static final Item STARSCREAM_MID3_HELMET = new StarscreamMid3("starscream_mid3_helmet", STARSCREAM_MODEL_MATERIAL, 1, EntityEquipmentSlot.HEAD);
    public static final Item STARSCREAM_MID3_CHESTPLATE = new StarscreamMid3("starscream_mid3_chestplate", STARSCREAM_MODEL_MATERIAL, 1, EntityEquipmentSlot.CHEST);
    public static final Item STARSCREAM_MID3_LEGGINGS = new StarscreamMid3("starscream_mid3_leggings", STARSCREAM_MODEL_MATERIAL, 2, EntityEquipmentSlot.LEGS);
    public static final Item STARSCREAM_MID3_BOOTS = new StarscreamMid3("starscream_mid3_boots", STARSCREAM_MODEL_MATERIAL, 1, EntityEquipmentSlot.FEET);
    public static final Item STARSCREAM_ALTMODE_HELMET = new StarscreamAltmode("starscream_altmode_helmet", STARSCREAM_MODEL_MATERIAL, 1, EntityEquipmentSlot.HEAD);
    public static final Item STARSCREAM_ALTMODE_CHESTPLATE = new StarscreamAltmode("starscream_altmode_chestplate", STARSCREAM_MODEL_MATERIAL, 1, EntityEquipmentSlot.CHEST);
    public static final Item STARSCREAM_ALTMODE_LEGGINGS = new StarscreamAltmode("starscream_altmode_leggings", STARSCREAM_MODEL_MATERIAL, 2, EntityEquipmentSlot.LEGS);
    public static final Item STARSCREAM_ALTMODE_BOOTS = new StarscreamAltmode("starscream_altmode_boots", STARSCREAM_MODEL_MATERIAL, 1, EntityEquipmentSlot.FEET);
    public static final Item STARSCREAM_MID4_HELMET = new StarscreamMid4("starscream_mid4_helmet", STARSCREAM_MODEL_MATERIAL, 1, EntityEquipmentSlot.HEAD);
    public static final Item STARSCREAM_MID4_CHESTPLATE = new StarscreamMid4("starscream_mid4_chestplate", STARSCREAM_MODEL_MATERIAL, 1, EntityEquipmentSlot.CHEST);
    public static final Item STARSCREAM_MID4_LEGGINGS = new StarscreamMid4("starscream_mid4_leggings", STARSCREAM_MODEL_MATERIAL, 2, EntityEquipmentSlot.LEGS);
    public static final Item STARSCREAM_MID4_BOOTS = new StarscreamMid4("starscream_mid4_boots", STARSCREAM_MODEL_MATERIAL, 1, EntityEquipmentSlot.FEET);
    public static final Item STARSCREAM_MID5_HELMET = new StarscreamMid5("starscream_mid5_helmet", STARSCREAM_MODEL_MATERIAL, 1, EntityEquipmentSlot.HEAD);
    public static final Item STARSCREAM_MID5_CHESTPLATE = new StarscreamMid5("starscream_mid5_chestplate", STARSCREAM_MODEL_MATERIAL, 1, EntityEquipmentSlot.CHEST);
    public static final Item STARSCREAM_MID5_LEGGINGS = new StarscreamMid5("starscream_mid5_leggings", STARSCREAM_MODEL_MATERIAL, 2, EntityEquipmentSlot.LEGS);
    public static final Item STARSCREAM_MID5_BOOTS = new StarscreamMid5("starscream_mid5_boots", STARSCREAM_MODEL_MATERIAL, 1, EntityEquipmentSlot.FEET);
    public static final Item STARSCREAM_MID6_HELMET = new StarscreamMid6("starscream_mid6_helmet", STARSCREAM_MODEL_MATERIAL, 1, EntityEquipmentSlot.HEAD);
    public static final Item STARSCREAM_MID6_CHESTPLATE = new StarscreamMid6("starscream_mid6_chestplate", STARSCREAM_MODEL_MATERIAL, 1, EntityEquipmentSlot.CHEST);
    public static final Item STARSCREAM_MID6_LEGGINGS = new StarscreamMid6("starscream_mid6_leggings", STARSCREAM_MODEL_MATERIAL, 2, EntityEquipmentSlot.LEGS);
    public static final Item STARSCREAM_MID6_BOOTS = new StarscreamMid6("starscream_mid6_boots", STARSCREAM_MODEL_MATERIAL, 1, EntityEquipmentSlot.FEET);
    public static final Item SKYWARP_HELMET = new Starscream("skywarp_helmet", SKYWARP_MODEL_MATERIAL, 1, EntityEquipmentSlot.HEAD);
    public static final Item SKYWARP_CHESTPLATE = new Starscream("skywarp_chestplate", SKYWARP_MODEL_MATERIAL, 1, EntityEquipmentSlot.CHEST);
    public static final Item SKYWARP_LEGGINGS = new Starscream("skywarp_leggings", SKYWARP_MODEL_MATERIAL, 2, EntityEquipmentSlot.LEGS);
    public static final Item SKYWARP_BOOTS = new Starscream("skywarp_boots", SKYWARP_MODEL_MATERIAL, 1, EntityEquipmentSlot.FEET);
    public static final Item SKYWARP_MID1_HELMET = new StarscreamMid1("skywarp_mid1_helmet", SKYWARP_MODEL_MATERIAL, 1, EntityEquipmentSlot.HEAD);
    public static final Item SKYWARP_MID1_CHESTPLATE = new StarscreamMid1("skywarp_mid1_chestplate", SKYWARP_MODEL_MATERIAL, 1, EntityEquipmentSlot.CHEST);
    public static final Item SKYWARP_MID1_LEGGINGS = new StarscreamMid1("skywarp_mid1_leggings", SKYWARP_MODEL_MATERIAL, 2, EntityEquipmentSlot.LEGS);
    public static final Item SKYWARP_MID1_BOOTS = new StarscreamMid1("skywarp_mid1_boots", SKYWARP_MODEL_MATERIAL, 1, EntityEquipmentSlot.FEET);
    public static final Item SKYWARP_MID2_HELMET = new StarscreamMid2("skywarp_mid2_helmet", SKYWARP_MODEL_MATERIAL, 1, EntityEquipmentSlot.HEAD);
    public static final Item SKYWARP_MID2_CHESTPLATE = new StarscreamMid2("skywarp_mid2_chestplate", SKYWARP_MODEL_MATERIAL, 1, EntityEquipmentSlot.CHEST);
    public static final Item SKYWARP_MID2_LEGGINGS = new StarscreamMid2("skywarp_mid2_leggings", SKYWARP_MODEL_MATERIAL, 2, EntityEquipmentSlot.LEGS);
    public static final Item SKYWARP_MID2_BOOTS = new StarscreamMid2("skywarp_mid2_boots", SKYWARP_MODEL_MATERIAL, 1, EntityEquipmentSlot.FEET);
    public static final Item SKYWARP_MID3_HELMET = new StarscreamMid3("skywarp_mid3_helmet", SKYWARP_MODEL_MATERIAL, 1, EntityEquipmentSlot.HEAD);
    public static final Item SKYWARP_MID3_CHESTPLATE = new StarscreamMid3("skywarp_mid3_chestplate", SKYWARP_MODEL_MATERIAL, 1, EntityEquipmentSlot.CHEST);
    public static final Item SKYWARP_MID3_LEGGINGS = new StarscreamMid3("skywarp_mid3_leggings", SKYWARP_MODEL_MATERIAL, 2, EntityEquipmentSlot.LEGS);
    public static final Item SKYWARP_MID3_BOOTS = new StarscreamMid3("skywarp_mid3_boots", SKYWARP_MODEL_MATERIAL, 1, EntityEquipmentSlot.FEET);
    public static final Item SKYWARP_ALTMODE_HELMET = new StarscreamAltmode("skywarp_altmode_helmet", SKYWARP_ALTMODE_MATERIAL, 1, EntityEquipmentSlot.HEAD);
    public static final Item SKYWARP_ALTMODE_CHESTPLATE = new StarscreamAltmode("skywarp_altmode_chestplate", SKYWARP_ALTMODE_MATERIAL, 1, EntityEquipmentSlot.CHEST);
    public static final Item SKYWARP_ALTMODE_LEGGINGS = new StarscreamAltmode("skywarp_altmode_leggings", SKYWARP_ALTMODE_MATERIAL, 2, EntityEquipmentSlot.LEGS);
    public static final Item SKYWARP_ALTMODE_BOOTS = new StarscreamAltmode("skywarp_altmode_boots", SKYWARP_ALTMODE_MATERIAL, 1, EntityEquipmentSlot.FEET);
    public static final Item SKYWARP_MID4_HELMET = new StarscreamMid4("skywarp_mid4_helmet", SKYWARP_MODEL_MATERIAL, 1, EntityEquipmentSlot.HEAD);
    public static final Item SKYWARP_MID4_CHESTPLATE = new StarscreamMid4("skywarp_mid4_chestplate", SKYWARP_MODEL_MATERIAL, 1, EntityEquipmentSlot.CHEST);
    public static final Item SKYWARP_MID4_LEGGINGS = new StarscreamMid4("skywarp_mid4_leggings", SKYWARP_MODEL_MATERIAL, 2, EntityEquipmentSlot.LEGS);
    public static final Item SKYWARP_MID4_BOOTS = new StarscreamMid4("skywarp_mid4_boots", SKYWARP_MODEL_MATERIAL, 1, EntityEquipmentSlot.FEET);
    public static final Item SKYWARP_MID5_HELMET = new StarscreamMid5("skywarp_mid5_helmet", SKYWARP_MODEL_MATERIAL, 1, EntityEquipmentSlot.HEAD);
    public static final Item SKYWARP_MID5_CHESTPLATE = new StarscreamMid5("skywarp_mid5_chestplate", SKYWARP_MODEL_MATERIAL, 1, EntityEquipmentSlot.CHEST);
    public static final Item SKYWARP_MID5_LEGGINGS = new StarscreamMid5("skywarp_mid5_leggings", SKYWARP_MODEL_MATERIAL, 2, EntityEquipmentSlot.LEGS);
    public static final Item SKYWARP_MID5_BOOTS = new StarscreamMid5("skywarp_mid5_boots", SKYWARP_MODEL_MATERIAL, 1, EntityEquipmentSlot.FEET);
    public static final Item SKYWARP_MID6_HELMET = new StarscreamMid6("skywarp_mid6_helmet", SKYWARP_MODEL_MATERIAL, 1, EntityEquipmentSlot.HEAD);
    public static final Item SKYWARP_MID6_CHESTPLATE = new StarscreamMid6("skywarp_mid6_chestplate", SKYWARP_MODEL_MATERIAL, 1, EntityEquipmentSlot.CHEST);
    public static final Item SKYWARP_MID6_LEGGINGS = new StarscreamMid6("skywarp_mid6_leggings", SKYWARP_MODEL_MATERIAL, 2, EntityEquipmentSlot.LEGS);
    public static final Item SKYWARP_MID6_BOOTS = new StarscreamMid6("skywarp_mid6_boots", SKYWARP_MODEL_MATERIAL, 1, EntityEquipmentSlot.FEET);
    public static final Item THUNDERCRACKER_HELMET = new Starscream("thundercracker_helmet", THUNDERCRACKER_MODEL_MATERIAL, 1, EntityEquipmentSlot.HEAD);
    public static final Item THUNDERCRACKER_CHESTPLATE = new Starscream("thundercracker_chestplate", THUNDERCRACKER_MODEL_MATERIAL, 1, EntityEquipmentSlot.CHEST);
    public static final Item THUNDERCRACKER_LEGGINGS = new Starscream("thundercracker_leggings", THUNDERCRACKER_MODEL_MATERIAL, 2, EntityEquipmentSlot.LEGS);
    public static final Item THUNDERCRACKER_BOOTS = new Starscream("thundercracker_boots", THUNDERCRACKER_MODEL_MATERIAL, 1, EntityEquipmentSlot.FEET);
    public static final Item THUNDERCRACKER_MID1_HELMET = new StarscreamMid1("thundercracker_mid1_helmet", THUNDERCRACKER_MODEL_MATERIAL, 1, EntityEquipmentSlot.HEAD);
    public static final Item THUNDERCRACKER_MID1_CHESTPLATE = new StarscreamMid1("thundercracker_mid1_chestplate", THUNDERCRACKER_MODEL_MATERIAL, 1, EntityEquipmentSlot.CHEST);
    public static final Item THUNDERCRACKER_MID1_LEGGINGS = new StarscreamMid1("thundercracker_mid1_leggings", THUNDERCRACKER_MODEL_MATERIAL, 2, EntityEquipmentSlot.LEGS);
    public static final Item THUNDERCRACKER_MID1_BOOTS = new StarscreamMid1("thundercracker_mid1_boots", THUNDERCRACKER_MODEL_MATERIAL, 1, EntityEquipmentSlot.FEET);
    public static final Item THUNDERCRACKER_MID2_HELMET = new StarscreamMid2("thundercracker_mid2_helmet", THUNDERCRACKER_MODEL_MATERIAL, 1, EntityEquipmentSlot.HEAD);
    public static final Item THUNDERCRACKER_MID2_CHESTPLATE = new StarscreamMid2("thundercracker_mid2_chestplate", THUNDERCRACKER_MODEL_MATERIAL, 1, EntityEquipmentSlot.CHEST);
    public static final Item THUNDERCRACKER_MID2_LEGGINGS = new StarscreamMid2("thundercracker_mid2_leggings", THUNDERCRACKER_MODEL_MATERIAL, 2, EntityEquipmentSlot.LEGS);
    public static final Item THUNDERCRACKER_MID2_BOOTS = new StarscreamMid2("thundercracker_mid2_boots", THUNDERCRACKER_MODEL_MATERIAL, 1, EntityEquipmentSlot.FEET);
    public static final Item THUNDERCRACKER_MID3_HELMET = new StarscreamMid3("thundercracker_mid3_helmet", THUNDERCRACKER_MODEL_MATERIAL, 1, EntityEquipmentSlot.HEAD);
    public static final Item THUNDERCRACKER_MID3_CHESTPLATE = new StarscreamMid3("thundercracker_mid3_chestplate", THUNDERCRACKER_MODEL_MATERIAL, 1, EntityEquipmentSlot.CHEST);
    public static final Item THUNDERCRACKER_MID3_LEGGINGS = new StarscreamMid3("thundercracker_mid3_leggings", THUNDERCRACKER_MODEL_MATERIAL, 2, EntityEquipmentSlot.LEGS);
    public static final Item THUNDERCRACKER_MID3_BOOTS = new StarscreamMid3("thundercracker_mid3_boots", THUNDERCRACKER_MODEL_MATERIAL, 1, EntityEquipmentSlot.FEET);
    public static final Item THUNDERCRACKER_ALTMODE_HELMET = new StarscreamAltmode("thundercracker_altmode_helmet", THUNDERCRACKER_MODEL_MATERIAL, 1, EntityEquipmentSlot.HEAD);
    public static final Item THUNDERCRACKER_ALTMODE_CHESTPLATE = new StarscreamAltmode("thundercracker_altmode_chestplate", THUNDERCRACKER_MODEL_MATERIAL, 1, EntityEquipmentSlot.CHEST);
    public static final Item THUNDERCRACKER_ALTMODE_LEGGINGS = new StarscreamAltmode("thundercracker_altmode_leggings", THUNDERCRACKER_MODEL_MATERIAL, 2, EntityEquipmentSlot.LEGS);
    public static final Item THUNDERCRACKER_ALTMODE_BOOTS = new StarscreamAltmode("thundercracker_altmode_boots", THUNDERCRACKER_MODEL_MATERIAL, 1, EntityEquipmentSlot.FEET);
    public static final Item THUNDERCRACKER_MID4_HELMET = new StarscreamMid4("thundercracker_mid4_helmet", THUNDERCRACKER_MODEL_MATERIAL, 1, EntityEquipmentSlot.HEAD);
    public static final Item THUNDERCRACKER_MID4_CHESTPLATE = new StarscreamMid4("thundercracker_mid4_chestplate", THUNDERCRACKER_MODEL_MATERIAL, 1, EntityEquipmentSlot.CHEST);
    public static final Item THUNDERCRACKER_MID4_LEGGINGS = new StarscreamMid4("thundercracker_mid4_leggings", THUNDERCRACKER_MODEL_MATERIAL, 2, EntityEquipmentSlot.LEGS);
    public static final Item THUNDERCRACKER_MID4_BOOTS = new StarscreamMid4("thundercracker_mid4_boots", THUNDERCRACKER_MODEL_MATERIAL, 1, EntityEquipmentSlot.FEET);
    public static final Item THUNDERCRACKER_MID5_HELMET = new StarscreamMid5("thundercracker_mid5_helmet", THUNDERCRACKER_MODEL_MATERIAL, 1, EntityEquipmentSlot.HEAD);
    public static final Item THUNDERCRACKER_MID5_CHESTPLATE = new StarscreamMid5("thundercracker_mid5_chestplate", THUNDERCRACKER_MODEL_MATERIAL, 1, EntityEquipmentSlot.CHEST);
    public static final Item THUNDERCRACKER_MID5_LEGGINGS = new StarscreamMid5("thundercracker_mid5_leggings", THUNDERCRACKER_MODEL_MATERIAL, 2, EntityEquipmentSlot.LEGS);
    public static final Item THUNDERCRACKER_MID5_BOOTS = new StarscreamMid5("thundercracker_mid5_boots", THUNDERCRACKER_MODEL_MATERIAL, 1, EntityEquipmentSlot.FEET);
    public static final Item THUNDERCRACKER_MID6_HELMET = new StarscreamMid6("thundercracker_mid6_helmet", THUNDERCRACKER_MODEL_MATERIAL, 1, EntityEquipmentSlot.HEAD);
    public static final Item THUNDERCRACKER_MID6_CHESTPLATE = new StarscreamMid6("thundercracker_mid6_chestplate", THUNDERCRACKER_MODEL_MATERIAL, 1, EntityEquipmentSlot.CHEST);
    public static final Item THUNDERCRACKER_MID6_LEGGINGS = new StarscreamMid6("thundercracker_mid6_leggings", THUNDERCRACKER_MODEL_MATERIAL, 2, EntityEquipmentSlot.LEGS);
    public static final Item THUNDERCRACKER_MID6_BOOTS = new StarscreamMid6("thundercracker_mid6_boots", THUNDERCRACKER_MODEL_MATERIAL, 1, EntityEquipmentSlot.FEET);
    public static final Item SIDESWIPE_HELMET = new ArmorModelSideswipe("sideswipe_helmet", SIDESWIPE_MODEL_MATERIAL, 1, EntityEquipmentSlot.HEAD);
    public static final Item SIDESWIPE_CHESTPLATE = new ArmorModelSideswipe("sideswipe_chestplate", SIDESWIPE_MODEL_MATERIAL, 1, EntityEquipmentSlot.CHEST);
    public static final Item SIDESWIPE_LEGGINGS = new ArmorModelSideswipe("sideswipe_leggings", SIDESWIPE_MODEL_MATERIAL, 2, EntityEquipmentSlot.LEGS);
    public static final Item SIDESWIPE_BOOTS = new ArmorModelSideswipe("sideswipe_boots", SIDESWIPE_MODEL_MATERIAL, 1, EntityEquipmentSlot.FEET);
    public static final Item SIDESWIPE_MID_HELMET = new SideswipeMid("sideswipe_mid_helmet", SIDESWIPE_MODEL_MATERIAL, 1, EntityEquipmentSlot.HEAD);
    public static final Item SIDESWIPE_MID_CHESTPLATE = new SideswipeMid("sideswipe_mid_chestplate", SIDESWIPE_MODEL_MATERIAL, 1, EntityEquipmentSlot.CHEST);
    public static final Item SIDESWIPE_MID_LEGGINGS = new SideswipeMid("sideswipe_mid_leggings", SIDESWIPE_MODEL_MATERIAL, 2, EntityEquipmentSlot.LEGS);
    public static final Item SIDESWIPE_MID_BOOTS = new SideswipeMid("sideswipe_mid_boots", SIDESWIPE_MODEL_MATERIAL, 1, EntityEquipmentSlot.FEET);
    public static final Item SIDESWIPE_MID2_HELMET = new SideswipeMid2("sideswipe_mid2_helmet", SIDESWIPE_MODEL_MATERIAL, 1, EntityEquipmentSlot.HEAD);
    public static final Item SIDESWIPE_MID2_CHESTPLATE = new SideswipeMid2("sideswipe_mid2_chestplate", SIDESWIPE_MODEL_MATERIAL, 1, EntityEquipmentSlot.CHEST);
    public static final Item SIDESWIPE_MID2_LEGGINGS = new SideswipeMid2("sideswipe_mid2_leggings", SIDESWIPE_MODEL_MATERIAL, 2, EntityEquipmentSlot.LEGS);
    public static final Item SIDESWIPE_MID2_BOOTS = new SideswipeMid2("sideswipe_mid2_boots", SIDESWIPE_MODEL_MATERIAL, 1, EntityEquipmentSlot.FEET);
    public static final Item SIDESWIPE_MID3_HELMET = new SideswipeMid3("sideswipe_mid3_helmet", SIDESWIPE_MODEL_MATERIAL, 1, EntityEquipmentSlot.HEAD);
    public static final Item SIDESWIPE_MID3_CHESTPLATE = new SideswipeMid3("sideswipe_mid3_chestplate", SIDESWIPE_MODEL_MATERIAL, 1, EntityEquipmentSlot.CHEST);
    public static final Item SIDESWIPE_MID3_LEGGINGS = new SideswipeMid3("sideswipe_mid3_leggings", SIDESWIPE_MODEL_MATERIAL, 2, EntityEquipmentSlot.LEGS);
    public static final Item SIDESWIPE_MID3_BOOTS = new SideswipeMid3("sideswipe_mid3_boots", SIDESWIPE_MODEL_MATERIAL, 1, EntityEquipmentSlot.FEET);
    public static final Item SIDESWIPE_MID4_HELMET = new SideswipeMid4("sideswipe_mid4_helmet", SIDESWIPE_MODEL_MATERIAL, 1, EntityEquipmentSlot.HEAD);
    public static final Item SIDESWIPE_MID4_CHESTPLATE = new SideswipeMid4("sideswipe_mid4_chestplate", SIDESWIPE_MODEL_MATERIAL, 1, EntityEquipmentSlot.CHEST);
    public static final Item SIDESWIPE_MID4_LEGGINGS = new SideswipeMid4("sideswipe_mid4_leggings", SIDESWIPE_MODEL_MATERIAL, 2, EntityEquipmentSlot.LEGS);
    public static final Item SIDESWIPE_MID4_BOOTS = new SideswipeMid4("sideswipe_mid4_boots", SIDESWIPE_MODEL_MATERIAL, 1, EntityEquipmentSlot.FEET);
    public static final Item SIDESWIPE_ALTMODE_HELMET = new SideswipeAltmode("sideswipe_altmode_helmet", SIDESWIPE_ALTMODE_MATERIAL, 1, EntityEquipmentSlot.HEAD);
    public static final Item SIDESWIPE_ALTMODE_CHESTPLATE = new SideswipeAltmode("sideswipe_altmode_chestplate", SIDESWIPE_ALTMODE_MATERIAL, 1, EntityEquipmentSlot.CHEST);
    public static final Item SIDESWIPE_ALTMODE_LEGGINGS = new SideswipeAltmode("sideswipe_altmode_leggings", SIDESWIPE_ALTMODE_MATERIAL, 2, EntityEquipmentSlot.LEGS);
    public static final Item SIDESWIPE_ALTMODE_BOOTS = new SideswipeAltmode("sideswipe_altmode_boots", SIDESWIPE_ALTMODE_MATERIAL, 1, EntityEquipmentSlot.FEET);
    public static Item ItemBase = new ItemBasicMeta("basic", EItemBasic.allNames);
    public static final Item PHOTON_BURST_RIFLE = new ModdedBow("modded_bow");
    public static final IGun Energon_Battle_Pistol = new EnergonBattlePistol(15);
    public static final IShootable Energon_Battle_Pistol_Clip = new AmmoClip("Energon_Battle_Pistol_Clip", 10);
    public static final IGun Scrapper = new Scrapper();
    public static final IShootable Scrapper_Clip = new AmmoClip("Scrapper_Clip", 60);
    public static final IGun EMPShotgun = new EMPShotgun(10);
    public static final IShootable EMP_Shotgun_Shell = new AmmoClip("EMP_Shotgun_Shell", 2);
    public static final IGun ScatterBlaster = new ScatterBlaster(5);
    public static final IShootable Scatter_Blaster_Shell = new AmmoClip("Scatter_Blaster_Shell", 6);
    public static final IGun NeutronRepeater = new NeutronRepeater(2);
    public static final IShootable Neutron_Repeater_Clip = new AmmoClip("Neutron_Repeater_Clip", 224);
    public static final IGun RocketLauncher = new RocketLauncher(50);
    public static final IShootable Rocket_Clip = new AmmoClip("Rocket_Clip", 4);
    public static final Item AMMO = new ItemBase("ammo");
    public static final Item MEDKIT = new ItemMedkit("medkit", 3, 10, 100);
    public static final Item PROTOFORM = new ItemBase("protoform");
    public static final Item PROTOFORM_HEAD = new ItemBase("protoform_head");
    public static final Item PROTOFORM_CHEST = new ItemBase("protoform_chest");
    public static final Item PROTOFORM_LEGS = new ItemBase("protoform_legs");
    public static final Item PROTOFORM_FEET = new ItemBase("protoform_feet");
    public static final Item SPARK = new ItemBase("spark");
    public static final Item OPTICS = new ItemBase("optics");
    public static final Item VOICEBOX = new ItemBase("voicebox");
    public static final Item BRAIN = new ItemBase("brain");
    public static final Item HAND = new ItemBase("hand");
    public static final Item LIMB = new ItemBase("limb");
    public static final Item SPARK_CHAMBER = new ItemBase("spark_chamber");
    public static final Item TRANSFORMATION_COG = new ItemBase("transformation_cog");
    public static final Item AUTOBOT_INSGINIA = new ItemBase("autobot_insignia");
    public static final Item DECEPTICON_INSGINIA = new ItemBase("decepticon_insignia");
    public static final Item ADVANCED_CIRCUIT = new ItemBase("advanced_circuit");
    public static final Item BASIC_CIRCUIT = new ItemBase("basic_circuit");
    public static final Item ALLOY = new ItemBase("alloy");
    public static final Item COCKPIT = new ItemBase("cockpit");
    public static final Item WING = new ItemBase("wing");
    public static final Item TREAD = new ItemBase("tread");
    public static final Item TIRE = new ItemBase("tire");
    public static final Item WHEEL = new ItemBase("wheel");
    public static final Item HUBCAP = new ItemBase("hubcap");
    public static final Item THRUSTER = new ItemBase("thruster");
    public static final Item CREDIT1 = new ItemBase("credit1");
    public static final Item CREDIT5 = new ItemBase("credit5");
    public static final Item CREDIT10 = new ItemBase("credit10");
    public static final Item CREDIT50 = new ItemBase("credit50");
    public static final Item CREDIT100 = new ItemBase("credit100");
    public static final Item CREDIT500 = new ItemBase("credit500");
    public static final Item BOTCOIN = new ItemBase("botcoin");
    public static final Item STAR_SABER = new ItemStarSaber("star_saber", 200, SWORD_MATERIAL);
    public static final Item PHASE_SHIFTER = new ItemPhaseShifter("phase_shifter");

    public static ItemStack getBasicItem(EItemBasic basicName) {
        return ModItems.getBasicItem(basicName, 1);
    }

    public static ItemStack getBasicItem(EItemBasic basicName, int stackSize) {
        return new ItemStack(ItemBase, stackSize, basicName.ordinal());
    }
}

