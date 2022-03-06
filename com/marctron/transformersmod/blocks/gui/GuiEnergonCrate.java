/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.inventory.GuiContainer
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.InventoryPlayer
 *  net.minecraft.inventory.Container
 *  net.minecraft.util.ResourceLocation
 */
package com.marctron.transformersmod.blocks.gui;

import com.marctron.transformersmod.blocks.container.ContainerEnergonCrate;
import com.marctron.transformersmod.blocks.tileentity.TileEntityEnergonCrate;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

public class GuiEnergonCrate
extends GuiContainer {
    private static final ResourceLocation GUI_CHEST = new ResourceLocation("tm:textures/gui/energon_crate.png");
    private final InventoryPlayer playerInventory;
    private final TileEntityEnergonCrate te;

    public GuiEnergonCrate(InventoryPlayer playerInventory, TileEntityEnergonCrate chestInventory, EntityPlayer player) {
        super((Container)new ContainerEnergonCrate(playerInventory, chestInventory, player));
        this.playerInventory = playerInventory;
        this.te = chestInventory;
        this.field_146999_f = 179;
        this.field_147000_g = 256;
    }

    protected void func_146979_b(int mouseX, int mouseY) {
        this.field_146289_q.func_78276_b(this.te.func_145748_c_().func_150260_c(), 8, 6, 3127295);
        this.field_146289_q.func_78276_b(this.playerInventory.func_145748_c_().func_150260_c(), 8, this.field_147000_g - 92, 3127295);
    }

    public void func_73863_a(int mouseX, int mouseY, float partialTicks) {
        this.func_146276_q_();
        super.func_73863_a(mouseX, mouseY, partialTicks);
        this.func_191948_b(mouseX, mouseY);
    }

    protected void func_146976_a(float partialTicks, int mouseX, int mouseY) {
        GlStateManager.func_179131_c((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.field_146297_k.func_110434_K().func_110577_a(GUI_CHEST);
        this.func_73729_b(this.field_147003_i, this.field_147009_r, 0, -1, this.field_146999_f, this.field_147000_g);
    }
}

