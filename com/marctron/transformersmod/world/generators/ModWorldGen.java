/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  net.minecraft.block.Block
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.block.state.pattern.BlockMatcher
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 *  net.minecraft.world.chunk.IChunkProvider
 *  net.minecraft.world.gen.IChunkGenerator
 *  net.minecraft.world.gen.feature.WorldGenMinable
 *  net.minecraftforge.fml.common.IWorldGenerator
 */
package com.marctron.transformersmod.world.generators;

import com.google.common.base.Predicate;
import com.marctron.transformersmod.init.ModBlocks;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGen
implements IWorldGenerator {
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.field_73011_w.getDimension()) {
            case -1: {
                this.generateNether(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
                break;
            }
            case 0: {
                this.generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
                break;
            }
            case 1: {
                this.generateEnd(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
            }
        }
    }

    private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        this.generateOre(ModBlocks.BLUE_ENERGON_ORE_BLOCK.func_176223_P(), world, random, chunkX * 16, chunkZ * 16, 1, 100, random.nextInt(9) + 4, 8, Blocks.field_150348_b);
        this.generateOre(ModBlocks.RED_ENERGON_ORE_BLOCK.func_176223_P(), world, random, chunkX * 16, chunkZ * 16, 1, 66, random.nextInt(8) + 5, 7, Blocks.field_150348_b);
        this.generateOre(ModBlocks.DARK_ENERGON_ORE_BLOCK.func_176223_P(), world, random, chunkX * 16, chunkZ * 16, 1, 33, random.nextInt(7) + 4, 6, Blocks.field_150348_b);
        this.generateOre(ModBlocks.TRANSFORMIUM_ORE_BLOCK.func_176223_P(), world, random, chunkX * 16, chunkZ * 16, 1, 70, random.nextInt(6) + 2, 8, Blocks.field_150348_b);
    }

    private void generateNether(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        this.generateOre(ModBlocks.RED_ENERGON_ORE_BLOCK_NETHERRACK.func_176223_P(), world, random, chunkX * 16, chunkZ * 16, 1, 100, random.nextInt(8) + 16, 16, Blocks.field_150424_aL);
    }

    private void generateEnd(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        this.generateOre(ModBlocks.DARK_ENERGON_ORE_BLOCK_END_STONE.func_176223_P(), world, random, chunkX * 16, chunkZ * 16, 1, 130, random.nextInt(8) + 12, 12, Blocks.field_150377_bs);
    }

    private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances, Block block) {
        int deltaY = maxY - minY;
        for (int i = 0; i < chances; ++i) {
            BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
            WorldGenMinable generator = new WorldGenMinable(ore, size, (Predicate)BlockMatcher.func_177642_a((Block)block));
            generator.func_180709_b(world, random, pos);
        }
    }
}

