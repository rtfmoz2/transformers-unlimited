/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  net.minecraft.block.Block
 *  net.minecraft.client.util.RecipeItemHelper
 *  net.minecraft.inventory.InventoryCrafting
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.crafting.IRecipe
 *  net.minecraft.item.crafting.Ingredient
 *  net.minecraft.item.crafting.ShapelessRecipes
 *  net.minecraft.util.NonNullList
 *  net.minecraft.world.World
 *  net.minecraftforge.common.util.RecipeMatcher
 */
package com.marctron.transformersmod.util;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.client.util.RecipeItemHelper;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.RecipeMatcher;

public class ShapelessNBTRecipe
extends ShapelessRecipes {
    private final ItemStack recipeOutput;
    public final NonNullList<Ingredient> field_77579_b;
    private final String group;
    private final boolean isSimple;

    public ShapelessNBTRecipe(String group, ItemStack output, NonNullList<Ingredient> ingredients) {
        super(group, output, ingredients);
        this.group = group;
        this.recipeOutput = output;
        this.field_77579_b = ingredients;
        boolean simple = true;
        for (Ingredient i : ingredients) {
            simple &= i.isSimple();
        }
        this.isSimple = simple;
    }

    private static List<ItemStack> parseInputList(Object[] inputList) {
        ArrayList list = Lists.newArrayList();
        for (Object object : inputList) {
            if (object instanceof ItemStack) {
                list.add(((ItemStack)object).func_77946_l());
                continue;
            }
            if (object instanceof Item) {
                list.add(new ItemStack((Item)object));
                continue;
            }
            if (!(object instanceof Block)) {
                throw new IllegalArgumentException("Invalid shapeless recipe: unknown type " + object.getClass().getName() + "!");
            }
            list.add(new ItemStack((Block)object));
        }
        return list;
    }

    public boolean func_77569_a(InventoryCrafting inv, World worldIn) {
        int ingredientCount = 0;
        RecipeItemHelper recipeItemHelper = new RecipeItemHelper();
        ArrayList inputs = Lists.newArrayList();
        for (int i = 0; i < inv.func_174923_h(); ++i) {
            for (int j = 0; j < inv.func_174922_i(); ++j) {
                ItemStack itemstack = inv.func_70463_b(j, i);
                if (itemstack.func_190926_b()) continue;
                ++ingredientCount;
                if (this.isSimple) {
                    recipeItemHelper.accountStack(itemstack, 1);
                    continue;
                }
                inputs.add(itemstack);
            }
        }
        if (ingredientCount != this.field_77579_b.size()) {
            return false;
        }
        if (this.isSimple) {
            return recipeItemHelper.func_194116_a((IRecipe)this, null);
        }
        return RecipeMatcher.findMatches((List)inputs, this.field_77579_b) != null;
    }
}

