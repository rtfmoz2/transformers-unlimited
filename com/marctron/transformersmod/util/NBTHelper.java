/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTBase
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.nbt.NBTTagList
 */
package com.marctron.transformersmod.util;

import java.util.UUID;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

public class NBTHelper {
    public static boolean hasTag(ItemStack itemStack, String keyName) {
        return itemStack != null && itemStack.func_77978_p() != null && itemStack.func_77978_p().func_74764_b(keyName);
    }

    public static void removeTag(ItemStack itemStack, String keyName) {
        if (itemStack.func_77942_o()) {
            itemStack.func_77978_p().func_82580_o(keyName);
        }
    }

    private static void initNBTTagCompound(ItemStack itemStack) {
        if (!itemStack.func_77942_o()) {
            itemStack.func_77982_d(new NBTTagCompound());
        }
    }

    public static void setLong(ItemStack itemStack, String keyName, long keyValue) {
        NBTHelper.initNBTTagCompound(itemStack);
        itemStack.func_77978_p().func_74772_a(keyName, keyValue);
    }

    public static String getString(ItemStack itemStack, String keyName) {
        NBTHelper.initNBTTagCompound(itemStack);
        if (!itemStack.func_77978_p().func_74764_b(keyName)) {
            NBTHelper.setString(itemStack, keyName, "");
        }
        return itemStack.func_77978_p().func_74779_i(keyName);
    }

    public static void setString(ItemStack itemStack, String keyName, String keyValue) {
        NBTHelper.initNBTTagCompound(itemStack);
        itemStack.func_77978_p().func_74778_a(keyName, keyValue);
    }

    public static boolean getBoolean(ItemStack itemStack, String keyName) {
        NBTHelper.initNBTTagCompound(itemStack);
        if (!itemStack.func_77978_p().func_74764_b(keyName)) {
            NBTHelper.setBoolean(itemStack, keyName, false);
        }
        return itemStack.func_77978_p().func_74767_n(keyName);
    }

    public static void setBoolean(ItemStack itemStack, String keyName, boolean keyValue) {
        NBTHelper.initNBTTagCompound(itemStack);
        itemStack.func_77978_p().func_74757_a(keyName, keyValue);
    }

    public static byte getByte(ItemStack itemStack, String keyName) {
        NBTHelper.initNBTTagCompound(itemStack);
        if (!itemStack.func_77978_p().func_74764_b(keyName)) {
            NBTHelper.setByte(itemStack, keyName, (byte)0);
        }
        return itemStack.func_77978_p().func_74771_c(keyName);
    }

    public static void setByte(ItemStack itemStack, String keyName, byte keyValue) {
        NBTHelper.initNBTTagCompound(itemStack);
        itemStack.func_77978_p().func_74774_a(keyName, keyValue);
    }

    public static short getShort(ItemStack itemStack, String keyName) {
        NBTHelper.initNBTTagCompound(itemStack);
        if (!itemStack.func_77978_p().func_74764_b(keyName)) {
            NBTHelper.setShort(itemStack, keyName, (short)0);
        }
        return itemStack.func_77978_p().func_74765_d(keyName);
    }

    public static void setShort(ItemStack itemStack, String keyName, short keyValue) {
        NBTHelper.initNBTTagCompound(itemStack);
        itemStack.func_77978_p().func_74777_a(keyName, keyValue);
    }

    public static int getInt(ItemStack itemStack, String keyName) {
        NBTHelper.initNBTTagCompound(itemStack);
        if (!itemStack.func_77978_p().func_74764_b(keyName)) {
            NBTHelper.setInteger(itemStack, keyName, 0);
        }
        return itemStack.func_77978_p().func_74762_e(keyName);
    }

    public static void setInteger(ItemStack itemStack, String keyName, int keyValue) {
        NBTHelper.initNBTTagCompound(itemStack);
        itemStack.func_77978_p().func_74768_a(keyName, keyValue);
    }

    public static long getLong(ItemStack itemStack, String keyName) {
        NBTHelper.initNBTTagCompound(itemStack);
        if (!itemStack.func_77978_p().func_74764_b(keyName)) {
            NBTHelper.setLong(itemStack, keyName, 0L);
        }
        return itemStack.func_77978_p().func_74763_f(keyName);
    }

    public static float getFloat(ItemStack itemStack, String keyName) {
        NBTHelper.initNBTTagCompound(itemStack);
        if (!itemStack.func_77978_p().func_74764_b(keyName)) {
            NBTHelper.setFloat(itemStack, keyName, 0.0f);
        }
        return itemStack.func_77978_p().func_74760_g(keyName);
    }

    public static void setFloat(ItemStack itemStack, String keyName, float keyValue) {
        NBTHelper.initNBTTagCompound(itemStack);
        itemStack.func_77978_p().func_74776_a(keyName, keyValue);
    }

    public static double getDouble(ItemStack itemStack, String keyName) {
        NBTHelper.initNBTTagCompound(itemStack);
        if (!itemStack.func_77978_p().func_74764_b(keyName)) {
            NBTHelper.setDouble(itemStack, keyName, 0.0);
        }
        return itemStack.func_77978_p().func_74769_h(keyName);
    }

    public static void setDouble(ItemStack itemStack, String keyName, double keyValue) {
        NBTHelper.initNBTTagCompound(itemStack);
        itemStack.func_77978_p().func_74780_a(keyName, keyValue);
    }

    public static void setOwner(ItemStack stack, EntityPlayer player) {
        NBTHelper.setString(stack, "owner", player.getDisplayNameString());
        NBTHelper.setLong(stack, "uuid_most_sig", player.func_110124_au().getMostSignificantBits());
        NBTHelper.setLong(stack, "uuid_least_sig", player.func_110124_au().getLeastSignificantBits());
    }

    public static UUID getOwner(ItemStack stack) {
        if (NBTHelper.hasTag(stack, "owner") && NBTHelper.hasTag(stack, "uuid_most_sig") && NBTHelper.hasTag(stack, "uuid_least_sig")) {
            return new UUID(NBTHelper.getLong(stack, "uuid_most_sig"), NBTHelper.getLong(stack, "uuid_least_sig"));
        }
        return null;
    }

    public static void setList(ItemStack stack, String keyName, NBTTagList list) {
        NBTHelper.initNBTTagCompound(stack);
        stack.func_77978_p().func_74782_a(keyName, (NBTBase)list);
    }

    public static NBTTagList getList(ItemStack stack, String keyName) {
        return NBTHelper.getList(stack, keyName, 10);
    }

    public static NBTTagList getList(ItemStack stack, String keyName, int tagType) {
        NBTHelper.initNBTTagCompound(stack);
        return stack.func_77978_p().func_150295_c(keyName, tagType);
    }
}

