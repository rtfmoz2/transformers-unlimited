/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTBase
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.util.ActionResult
 *  net.minecraft.util.EnumActionResult
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.world.World
 *  net.minecraftforge.common.capabilities.Capability
 *  net.minecraftforge.common.capabilities.ICapabilityProvider
 *  net.minecraftforge.common.capabilities.ICapabilitySerializable
 *  net.minecraftforge.items.CapabilityItemHandler
 *  net.minecraftforge.items.ItemStackHandler
 */
package com.marctron.transformersmod.items;

import com.marctron.transformersmod.items.ItemBase;
import com.marctron.transformersmod.util.CommonUtils;
import com.marctron.transformersmod.util.handlers.EnumGuiID;
import javax.annotation.Nullable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;

public class PrimaryAmmo
extends ItemBase {
    public PrimaryAmmo() {
        super("primary_ammo");
        this.func_77625_d(1);
    }

    public ActionResult<ItemStack> func_77659_a(World worldIn, EntityPlayer playerIn, EnumHand hand) {
        if (!worldIn.field_72995_K && !playerIn.func_70093_af()) {
            CommonUtils.openGui(playerIn, worldIn, EnumGuiID.PRIMARY_AMMO);
        }
        return new ActionResult(EnumActionResult.PASS, (Object)playerIn.func_184586_b(hand));
    }

    public static ItemStackHandler getInventoryHandler(ItemStack stack) {
        return (ItemStackHandler)stack.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);
    }

    public ICapabilityProvider initCapabilities(ItemStack stack, NBTTagCompound nbt) {
        return new ICapabilitySerializable(){
            private ItemStackHandler items = new ItemStackHandler(9);

            public boolean hasCapability(Capability<?> capability, @Nullable EnumFacing facing) {
                return capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY;
            }

            public <T> T getCapability(Capability<T> capability, @Nullable EnumFacing facing) {
                return (T)(this.hasCapability(capability, facing) ? this.items : null);
            }

            public NBTBase serializeNBT() {
                return this.items.serializeNBT();
            }

            public void deserializeNBT(NBTBase nbt) {
                this.items.deserializeNBT((NBTTagCompound)nbt);
            }
        };
    }
}

