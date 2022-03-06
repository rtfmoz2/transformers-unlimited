/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.client.resources.I18n
 *  net.minecraft.client.util.ITooltipFlag
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.item.Item$ToolMaterial
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.ItemSword
 *  net.minecraft.util.ActionResult
 *  net.minecraft.util.EnumActionResult
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraft.world.World
 */
package com.marctron.transformersmod.items;

import com.marctron.transformersmod.Main;
import com.marctron.transformersmod.entity.EntityLargeRocket;
import com.marctron.transformersmod.init.ModItems;
import com.marctron.transformersmod.util.interfaces.IHasModel;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class ItemStarSaber
extends ItemSword
implements IHasModel {
    private final float attackDamage;
    int Cooldown;

    public ItemStarSaber(String name, int cooldown, Item.ToolMaterial material) {
        super(material);
        this.func_77655_b(name);
        this.setRegistryName(name);
        this.func_77637_a(Main.tabTransformers);
        this.Cooldown = cooldown;
        this.func_77625_d(1);
        ModItems.ITEMS.add((Item)this);
        this.attackDamage = 1.0f;
    }

    public ActionResult<ItemStack> func_77659_a(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        ItemStack itemstack = playerIn.func_184586_b(handIn);
        Vec3d aim = playerIn.func_70040_Z();
        EntityLargeRocket fireball = new EntityLargeRocket(worldIn, (EntityLivingBase)playerIn, 1.0, 1.0, 1.0);
        playerIn.func_184811_cZ().func_185145_a((Item)this, this.Cooldown);
        if (!worldIn.field_72995_K) {
            fireball.func_70107_b(playerIn.field_70165_t + aim.field_72450_a * 1.5, playerIn.field_70163_u + aim.field_72448_b + 1.5, playerIn.field_70161_v + aim.field_72449_c * 1.5);
            fireball.accelerationX = aim.field_72450_a * 0.05;
            fireball.accelerationY = aim.field_72448_b * 0.05;
            fireball.accelerationZ = aim.field_72449_c * 0.05;
            worldIn.func_72838_d((Entity)fireball);
            fireball.explosionPower = 4;
        }
        return new ActionResult(EnumActionResult.SUCCESS, (Object)itemstack);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer((Item)this, 0, "inventory");
    }

    public void func_77624_a(ItemStack stack, @Nullable World world, List<String> list, ITooltipFlag flag) {
        list.add(TextFormatting.DARK_PURPLE + I18n.func_135052_a((String)(TextFormatting.BOLD + I18n.func_135052_a((String)"Mythic", (Object[])new Object[0])), (Object[])new Object[0]));
    }
}

