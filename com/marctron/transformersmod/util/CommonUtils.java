/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.EntityDamageSourceIndirect
 *  net.minecraft.util.NonNullList
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 */
package com.marctron.transformersmod.util;

import com.marctron.transformersmod.Main;
import com.marctron.transformersmod.entity.EntityBullet;
import com.marctron.transformersmod.util.handlers.EnumGuiID;
import java.util.Collections;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CommonUtils {
    public static DamageSource causeBulletDamage(EntityBullet bullet, Entity indirectEntity) {
        return new EntityDamageSourceIndirect("tm.bullet", (Entity)bullet, indirectEntity).func_76349_b();
    }

    public static void sortStringList(List<String> list) {
        Collections.sort(list);
    }

    public static void openGui(EntityPlayer player, World world, BlockPos pos) {
        player.openGui((Object)Main.instance, -1, world, pos.func_177958_n(), pos.func_177956_o(), pos.func_177952_p());
    }

    public static void openGui(EntityPlayer player, World world, EnumGuiID guiID) {
        CommonUtils.openGui(player, world, guiID.ordinal());
    }

    public static void openGui(EntityPlayer player, World world, int guiID) {
        BlockPos pos = player.func_180425_c();
        player.openGui((Object)Main.instance, guiID, world, pos.func_177958_n(), pos.func_177956_o(), pos.func_177952_p());
    }

    public static String capitaliseAllFirstLetters(String text) {
        String[] textArray = text.split("\\s");
        String output = "";
        for (String t : textArray) {
            String space = output.equals("") ? "" : " ";
            output = output + space + CommonUtils.capitaliseFirstLetter(t);
        }
        return output;
    }

    public static String capitaliseFirstLetter(String text) {
        if (text == null || text.length() <= 0) {
            return text;
        }
        return text.substring(0, 1).toUpperCase() + text.substring(1);
    }

    public static boolean isUsableByPlayer(TileEntity te, EntityPlayer player) {
        BlockPos pos = te.func_174877_v();
        return te.func_145831_w().func_175625_s(pos) == te && player.func_70092_e((double)pos.func_177958_n() + 0.5, (double)pos.func_177956_o() + 0.5, (double)pos.func_177952_p() + 0.5) <= 64.0;
    }

    public static boolean isStackListEmpty(NonNullList<ItemStack> list) {
        if (list.isEmpty()) {
            return true;
        }
        for (ItemStack stack : list) {
            if (stack.func_190926_b()) continue;
            return false;
        }
        return true;
    }
}

