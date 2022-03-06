/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.InventoryPlayer
 *  net.minecraft.init.SoundEvents
 *  net.minecraft.inventory.Container
 *  net.minecraft.inventory.ItemStackHelper
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.tileentity.TileEntityLockableLoot
 *  net.minecraft.util.ITickable
 *  net.minecraft.util.NonNullList
 *  net.minecraft.util.SoundCategory
 *  net.minecraft.util.math.AxisAlignedBB
 */
package com.marctron.transformersmod.blocks.tileentity;

import com.marctron.transformersmod.blocks.container.ContainerEnergonCrate;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.ITickable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;

public class TileEntityEnergonCrate
extends TileEntityLockableLoot
implements ITickable {
    private NonNullList<ItemStack> chestContents = NonNullList.func_191197_a((int)72, (Object)ItemStack.field_190927_a);
    public int numPlayersUsing;
    public int ticksSinceSync;
    public float lidAngle;
    public float prevLidAngle;

    public int func_70302_i_() {
        return 72;
    }

    public int func_70297_j_() {
        return 64;
    }

    public boolean func_191420_l() {
        for (ItemStack stack : this.chestContents) {
            if (stack.func_190926_b()) continue;
            return false;
        }
        return true;
    }

    public String func_70005_c_() {
        return this.func_145818_k_() ? this.field_190577_o : "container.energon_crate";
    }

    public void func_145839_a(NBTTagCompound compound) {
        super.func_145839_a(compound);
        this.chestContents = NonNullList.func_191197_a((int)this.func_70302_i_(), (Object)ItemStack.field_190927_a);
        if (!this.func_184283_b(compound)) {
            ItemStackHelper.func_191283_b((NBTTagCompound)compound, this.chestContents);
        }
        if (compound.func_150297_b("CustomName", 8)) {
            this.field_190577_o = compound.func_74779_i("CustomName");
        }
    }

    public NBTTagCompound func_189515_b(NBTTagCompound compound) {
        super.func_189515_b(compound);
        if (!this.func_184282_c(compound)) {
            ItemStackHelper.func_191282_a((NBTTagCompound)compound, this.chestContents);
        }
        if (compound.func_150297_b("CustomName", 8)) {
            compound.func_74778_a("CustomName", this.field_190577_o);
        }
        return compound;
    }

    public Container func_174876_a(InventoryPlayer playerInventory, EntityPlayer playerIn) {
        return new ContainerEnergonCrate(playerInventory, this, playerIn);
    }

    public String func_174875_k() {
        return "tm:energon_crate";
    }

    protected NonNullList<ItemStack> func_190576_q() {
        return this.chestContents;
    }

    public void func_73660_a() {
        if (!this.field_145850_b.field_72995_K && this.numPlayersUsing != 0 && (this.ticksSinceSync + this.field_174879_c.func_177958_n() + this.field_174879_c.func_177956_o() + this.field_174879_c.func_177952_p()) % 200 == 0) {
            this.numPlayersUsing = 0;
            float f = 5.0f;
            for (EntityPlayer entityplayer : this.field_145850_b.func_72872_a(EntityPlayer.class, new AxisAlignedBB((double)((float)this.field_174879_c.func_177958_n() - 5.0f), (double)((float)this.field_174879_c.func_177956_o() - 5.0f), (double)((float)this.field_174879_c.func_177952_p() - 5.0f), (double)((float)(this.field_174879_c.func_177958_n() + 1) + 5.0f), (double)((float)(this.field_174879_c.func_177956_o() + 1) + 5.0f), (double)((float)(this.field_174879_c.func_177952_p() + 1) + 5.0f)))) {
                if (!(entityplayer.field_71070_bA instanceof ContainerEnergonCrate) || ((ContainerEnergonCrate)entityplayer.field_71070_bA).getChestInventory() != this) continue;
                ++this.numPlayersUsing;
            }
        }
        this.prevLidAngle = this.lidAngle;
        float f1 = 0.1f;
        if (this.numPlayersUsing > 0 && this.lidAngle == 0.0f) {
            double d1 = (double)this.field_174879_c.func_177958_n() + 0.5;
            double d2 = (double)this.field_174879_c.func_177952_p() + 0.5;
            this.field_145850_b.func_184148_a((EntityPlayer)null, d1, (double)this.field_174879_c.func_177956_o() + 0.5, d2, SoundEvents.field_187617_cK, SoundCategory.BLOCKS, 0.5f, this.field_145850_b.field_73012_v.nextFloat() * 0.1f + 0.9f);
        }
        if (this.numPlayersUsing == 0 && this.lidAngle > 0.0f || this.numPlayersUsing > 0 && this.lidAngle < 1.0f) {
            float f2 = this.lidAngle;
            this.lidAngle = this.numPlayersUsing > 0 ? (this.lidAngle += 0.1f) : (this.lidAngle -= 0.1f);
            if (this.lidAngle > 1.0f) {
                this.lidAngle = 1.0f;
            }
            float f3 = 0.5f;
            if (this.lidAngle < 0.5f && f2 >= 0.5f) {
                double d3 = (double)this.field_174879_c.func_177958_n() + 0.5;
                double d0 = (double)this.field_174879_c.func_177952_p() + 0.5;
                this.field_145850_b.func_184148_a((EntityPlayer)null, d3, (double)this.field_174879_c.func_177956_o() + 0.5, d0, SoundEvents.field_187614_cJ, SoundCategory.BLOCKS, 0.5f, this.field_145850_b.field_73012_v.nextFloat() * 0.1f + 0.9f);
            }
            if (this.lidAngle < 0.0f) {
                this.lidAngle = 0.0f;
            }
        }
    }

    public void func_174889_b(EntityPlayer player) {
        ++this.numPlayersUsing;
        this.field_145850_b.func_175641_c(this.field_174879_c, this.func_145838_q(), 1, this.numPlayersUsing);
        this.field_145850_b.func_175685_c(this.field_174879_c, this.func_145838_q(), false);
    }

    public void func_174886_c(EntityPlayer player) {
        --this.numPlayersUsing;
        this.field_145850_b.func_175641_c(this.field_174879_c, this.func_145838_q(), 1, this.numPlayersUsing);
        this.field_145850_b.func_175685_c(this.field_174879_c, this.func_145838_q(), false);
    }
}

