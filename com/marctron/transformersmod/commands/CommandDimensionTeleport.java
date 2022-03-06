/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  net.minecraft.command.CommandBase
 *  net.minecraft.command.CommandException
 *  net.minecraft.command.ICommandSender
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.server.MinecraftServer
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentString
 *  net.minecraft.util.text.TextFormatting
 */
package com.marctron.transformersmod.commands;

import com.google.common.collect.Lists;
import com.marctron.transformersmod.commands.util.CustomTeleporter;
import java.util.Collections;
import java.util.List;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

public class CommandDimensionTeleport
extends CommandBase {
    private final List<String> aliases = Lists.newArrayList((Object[])new String[]{"tm", "TP", "tp", "tpdim", "tpdimension", "teleport"});

    public void func_184881_a(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        int dimension;
        if (args.length < 1) {
            return;
        }
        String s = args[0];
        try {
            dimension = Integer.parseInt(s);
        }
        catch (NumberFormatException e) {
            sender.func_145747_a((ITextComponent)new TextComponentString(TextFormatting.RED + "Dimension not found"));
            return;
        }
        if (sender instanceof EntityPlayer) {
            CustomTeleporter.teleportToDimension((EntityPlayer)sender, dimension, 0.0, 100.0, 0.0);
        }
    }

    public String func_71517_b() {
        return "tpdimension";
    }

    public String func_71518_a(ICommandSender sender) {
        return "tpdimension <id>";
    }

    public List<String> func_71514_a() {
        return this.aliases;
    }

    public boolean func_184882_a(MinecraftServer server, ICommandSender sender) {
        return true;
    }

    public List<String> func_184883_a(MinecraftServer server, ICommandSender sender, String[] args, BlockPos targetPos) {
        return Collections.emptyList();
    }
}

