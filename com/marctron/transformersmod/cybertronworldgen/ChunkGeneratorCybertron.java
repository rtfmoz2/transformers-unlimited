/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockFalling
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.entity.EnumCreatureType
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.ChunkPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.world.World
 *  net.minecraft.world.WorldEntitySpawner
 *  net.minecraft.world.WorldType
 *  net.minecraft.world.biome.Biome
 *  net.minecraft.world.biome.Biome$SpawnListEntry
 *  net.minecraft.world.chunk.Chunk
 *  net.minecraft.world.chunk.ChunkPrimer
 *  net.minecraft.world.gen.IChunkGenerator
 *  net.minecraft.world.gen.MapGenBase
 *  net.minecraft.world.gen.MapGenCaves
 *  net.minecraft.world.gen.MapGenRavine
 *  net.minecraft.world.gen.NoiseGeneratorOctaves
 *  net.minecraft.world.gen.NoiseGeneratorPerlin
 *  net.minecraft.world.gen.feature.WorldGenDungeons
 *  net.minecraft.world.gen.feature.WorldGenLakes
 *  net.minecraft.world.gen.structure.MapGenMineshaft
 *  net.minecraft.world.gen.structure.MapGenScatteredFeature
 *  net.minecraft.world.gen.structure.MapGenStronghold
 *  net.minecraft.world.gen.structure.MapGenVillage
 *  net.minecraft.world.gen.structure.StructureOceanMonument
 *  net.minecraftforge.event.ForgeEventFactory
 *  net.minecraftforge.event.terraingen.InitMapGenEvent$EventType
 *  net.minecraftforge.event.terraingen.InitNoiseGensEvent$Context
 *  net.minecraftforge.event.terraingen.InitNoiseGensEvent$ContextOverworld
 *  net.minecraftforge.event.terraingen.PopulateChunkEvent$Populate$EventType
 *  net.minecraftforge.event.terraingen.TerrainGen
 */
package com.marctron.transformersmod.cybertronworldgen;

import com.marctron.transformersmod.init.ModBiomes;
import com.marctron.transformersmod.init.ModBlocks;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.WorldEntitySpawner;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.MapGenBase;
import net.minecraft.world.gen.MapGenCaves;
import net.minecraft.world.gen.MapGenRavine;
import net.minecraft.world.gen.NoiseGeneratorOctaves;
import net.minecraft.world.gen.NoiseGeneratorPerlin;
import net.minecraft.world.gen.feature.WorldGenDungeons;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.structure.MapGenMineshaft;
import net.minecraft.world.gen.structure.MapGenScatteredFeature;
import net.minecraft.world.gen.structure.MapGenStronghold;
import net.minecraft.world.gen.structure.MapGenVillage;
import net.minecraft.world.gen.structure.StructureOceanMonument;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.event.terraingen.InitMapGenEvent;
import net.minecraftforge.event.terraingen.InitNoiseGensEvent;
import net.minecraftforge.event.terraingen.PopulateChunkEvent;
import net.minecraftforge.event.terraingen.TerrainGen;

public class ChunkGeneratorCybertron
implements IChunkGenerator {
    protected World world;
    protected ChunkPrimer chunkPrimer = new ChunkPrimer();
    protected int chunkX;
    protected int chunkZ;
    protected ChunkPos chunkPos;
    protected boolean mapFeaturesEnabled = true;
    protected Random rand;
    protected WorldType terrainType;
    protected Biome biome = ModBiomes.CYBERTRON;
    protected IBlockState baseBlock = ModBlocks.TRANSFORMIUM_BLOCK.func_176223_P();
    protected IBlockState oceanBlock = Blocks.field_150355_j.func_176223_P();
    protected NoiseGeneratorOctaves minLimitPerlinNoise;
    protected NoiseGeneratorOctaves maxLimitPerlinNoise;
    protected NoiseGeneratorOctaves mainPerlinNoise;
    protected NoiseGeneratorPerlin surfaceNoise;
    protected NoiseGeneratorOctaves scaleNoise;
    protected NoiseGeneratorOctaves depthNoise;
    protected NoiseGeneratorOctaves forestNoise;
    double[] mainNoiseRegion;
    double[] minLimitRegion;
    double[] maxLimitRegion;
    double[] depthRegion;
    protected double[] heightMap = new double[825];
    protected float[] biomeWeights = new float[25];
    protected double[] depthBuffer = new double[256];
    protected MapGenBase caveGenerator = new MapGenCaves();
    protected MapGenStronghold strongholdGenerator = new MapGenStronghold();
    protected MapGenMineshaft mineshaftGenerator = new MapGenMineshaft();
    protected MapGenScatteredFeature scatteredFeatureGenerator = new MapGenScatteredFeature();
    protected MapGenBase ravineGenerator = new MapGenRavine();
    protected StructureOceanMonument oceanMonumentGenerator = new StructureOceanMonument();
    protected WorldGenDungeons dungeonGenerator = new WorldGenDungeons();
    protected WorldGenLakes lakeGenerator = new WorldGenLakes((Block)Blocks.field_150355_j);
    protected WorldGenLakes lavaLakeGenerator = new WorldGenLakes((Block)Blocks.field_150353_l);
    private boolean useRavines = true;
    private boolean useMineShafts = true;
    private boolean useVillages = true;
    private boolean useStrongholds = true;
    private boolean useTemples = true;
    private boolean useMonuments = true;
    private boolean useCaves = true;
    private boolean useWaterLakes = true;
    private boolean useLavaLakes = true;
    private boolean useDungeons = true;
    private double depthNoiseScaleX = 200.0;
    private double depthNoiseScaleZ = 200.0;
    private double depthNoiseScaleExponent = 0.5;
    private int coordScale = 684;
    private int mainNoiseScaleX = 80;
    private int mainNoiseScaleY = 160;
    private int mainNoiseScaleZ = 80;
    private int heightScale = 684;
    private int biomeDepthOffSet = 0;
    private int biomeScaleOffset = 0;
    private double heightStretch = 12.0;
    private double baseSize = 8.5;
    private double lowerLimitScale = 512.0;
    private double upperLimitScale = 512.0;
    private float biomeDepthWeight = 1.0f;
    private float biomeScaleWeight = 1.0f;
    private int waterLakeChance = 4;
    private int dungeonChance = 7;
    private int lavaLakeChance = 80;

    public ChunkGeneratorCybertron(World worldIn) {
        System.out.println("Constructing ChunkGeneratorCloud");
        this.world = worldIn;
        this.rand = new Random(this.world.func_72905_C());
        this.terrainType = this.world.func_72912_H().func_76067_t();
        this.mapFeaturesEnabled = this.world.func_72912_H().func_76089_r();
        this.world.func_181544_b(63);
        MapGenVillage.field_75055_e.add(ModBiomes.CYBERTRON);
        this.initNoiseGenerators();
        this.postTerrainGenEvents();
        this.setBiomeWeights();
        this.postNoiseEvent();
    }

    private void postNoiseEvent() {
        InitNoiseGensEvent.ContextOverworld ctx = new InitNoiseGensEvent.ContextOverworld(this.minLimitPerlinNoise, this.maxLimitPerlinNoise, this.mainPerlinNoise, this.surfaceNoise, this.scaleNoise, this.depthNoise, this.forestNoise);
        ctx = (InitNoiseGensEvent.ContextOverworld)TerrainGen.getModdedNoiseGenerators((World)this.world, (Random)this.rand, (InitNoiseGensEvent.Context)ctx);
        this.minLimitPerlinNoise = ctx.getLPerlin1();
        this.maxLimitPerlinNoise = ctx.getLPerlin2();
        this.mainPerlinNoise = ctx.getPerlin();
        this.surfaceNoise = ctx.getHeight();
        this.scaleNoise = ctx.getScale();
        this.depthNoise = ctx.getDepth();
        this.forestNoise = ctx.getForest();
    }

    private void setBiomeWeights() {
        for (int i = -2; i <= 2; ++i) {
            for (int j = -2; j <= 2; ++j) {
                float f;
                this.biomeWeights[i + 2 + (j + 2) * 5] = f = 10.0f / MathHelper.func_76129_c((float)((float)(i * i + j * j) + 0.2f));
            }
        }
    }

    protected void initNoiseGenerators() {
        this.minLimitPerlinNoise = new NoiseGeneratorOctaves(this.rand, 16);
        this.maxLimitPerlinNoise = new NoiseGeneratorOctaves(this.rand, 16);
        this.mainPerlinNoise = new NoiseGeneratorOctaves(this.rand, 8);
        this.surfaceNoise = new NoiseGeneratorPerlin(this.rand, 4);
        this.scaleNoise = new NoiseGeneratorOctaves(this.rand, 10);
        this.depthNoise = new NoiseGeneratorOctaves(this.rand, 16);
        this.forestNoise = new NoiseGeneratorOctaves(this.rand, 8);
    }

    protected void postTerrainGenEvents() {
        this.caveGenerator = TerrainGen.getModdedMapGen((MapGenBase)this.caveGenerator, (InitMapGenEvent.EventType)InitMapGenEvent.EventType.CAVE);
        this.strongholdGenerator = (MapGenStronghold)TerrainGen.getModdedMapGen((MapGenBase)this.strongholdGenerator, (InitMapGenEvent.EventType)InitMapGenEvent.EventType.STRONGHOLD);
        this.mineshaftGenerator = (MapGenMineshaft)TerrainGen.getModdedMapGen((MapGenBase)this.mineshaftGenerator, (InitMapGenEvent.EventType)InitMapGenEvent.EventType.MINESHAFT);
        this.scatteredFeatureGenerator = (MapGenScatteredFeature)TerrainGen.getModdedMapGen((MapGenBase)this.scatteredFeatureGenerator, (InitMapGenEvent.EventType)InitMapGenEvent.EventType.SCATTERED_FEATURE);
        this.ravineGenerator = TerrainGen.getModdedMapGen((MapGenBase)this.ravineGenerator, (InitMapGenEvent.EventType)InitMapGenEvent.EventType.RAVINE);
        this.oceanMonumentGenerator = (StructureOceanMonument)TerrainGen.getModdedMapGen((MapGenBase)this.oceanMonumentGenerator, (InitMapGenEvent.EventType)InitMapGenEvent.EventType.OCEAN_MONUMENT);
    }

    public Chunk func_185932_a(int parChunkX, int parChunkZ) {
        this.chunkX = parChunkX;
        this.chunkZ = parChunkZ;
        this.rand.setSeed((long)this.chunkX * 341873128712L + (long)this.chunkZ * 132897987541L);
        this.generateHeightmap();
        this.setBlocksInChunk();
        this.replaceBiomeBlocks();
        if (this.useCaves) {
            this.caveGenerator.func_186125_a(this.world, this.chunkX, this.chunkZ, this.chunkPrimer);
        }
        if (this.useRavines) {
            this.ravineGenerator.func_186125_a(this.world, this.chunkX, this.chunkZ, this.chunkPrimer);
        }
        if (this.mapFeaturesEnabled) {
            if (this.useMineShafts) {
                this.mineshaftGenerator.func_186125_a(this.world, this.chunkX, this.chunkZ, this.chunkPrimer);
            }
            if (this.useStrongholds) {
                this.strongholdGenerator.func_186125_a(this.world, this.chunkX, this.chunkZ, this.chunkPrimer);
            }
            if (this.useTemples) {
                this.scatteredFeatureGenerator.func_186125_a(this.world, this.chunkX, this.chunkZ, this.chunkPrimer);
            }
            if (this.useMonuments) {
                this.oceanMonumentGenerator.func_186125_a(this.world, this.chunkX, this.chunkZ, this.chunkPrimer);
            }
        }
        Chunk chunk = new Chunk(this.world, this.chunkPrimer, parChunkX, parChunkZ);
        byte[] abyte = chunk.func_76605_m();
        for (int i = 0; i < abyte.length; ++i) {
            abyte[i] = (byte)Biome.func_185362_a((Biome)this.biome);
        }
        chunk.func_76603_b();
        return chunk;
    }

    public void setBlocksInChunk() {
        for (int i = 0; i < 4; ++i) {
            int j = i * 5;
            for (int l = 0; l < 4; ++l) {
                int i1 = (j + l) * 33;
                int j1 = (j + l + 1) * 33;
                for (int i2 = 0; i2 < 32; ++i2) {
                    for (int j2 = 0; j2 < 8; ++j2) {
                        double d10 = this.heightMap[i1 + i2];
                        double d11 = this.heightMap[j1 + i2];
                        for (int k2 = 0; k2 < 4; ++k2) {
                            double d16 = (d11 - d10) * 0.25;
                            double lvt_45_1_ = d10 - d16;
                            for (int l2 = 0; l2 < 4; ++l2) {
                                double d;
                                lvt_45_1_ += d16;
                                if (d > 0.0) {
                                    this.chunkPrimer.func_177855_a(i * 4 + k2, i2 * 8 + j2, l * 4 + l2, this.baseBlock);
                                    continue;
                                }
                                if (i2 * 8 + j2 >= this.world.func_181545_F()) continue;
                                this.chunkPrimer.func_177855_a(i * 4 + k2, i2 * 8 + j2, l * 4 + l2, this.oceanBlock);
                            }
                        }
                    }
                }
            }
        }
    }

    public void replaceBiomeBlocks() {
        if (!ForgeEventFactory.onReplaceBiomeBlocks((IChunkGenerator)this, (int)this.chunkX, (int)this.chunkZ, (ChunkPrimer)this.chunkPrimer, (World)this.world)) {
            return;
        }
        this.depthBuffer = this.surfaceNoise.func_151599_a(this.depthBuffer, (double)(this.chunkX * 16), (double)(this.chunkZ * 16), 16, 16, 0.0625, 0.0625, 1.0);
        for (int xInChunk = 0; xInChunk < 16; ++xInChunk) {
            for (int zInChunk = 0; zInChunk < 16; ++zInChunk) {
                this.biome.func_180622_a(this.world, this.rand, this.chunkPrimer, this.chunkX * 16 + xInChunk, this.chunkZ * 16 + zInChunk, this.depthBuffer[zInChunk + xInChunk * 16]);
            }
        }
    }

    protected void generateHeightmap() {
        int xOffset = this.chunkX * 4;
        int zOffset = this.chunkZ * 4;
        this.depthRegion = this.depthNoise.func_76305_a(this.depthRegion, xOffset, zOffset, 5, 5, this.depthNoiseScaleX, this.depthNoiseScaleZ, this.depthNoiseScaleExponent);
        this.mainNoiseRegion = this.mainPerlinNoise.func_76304_a(this.mainNoiseRegion, xOffset, 0, zOffset, 5, 33, 5, (double)(this.coordScale / this.mainNoiseScaleX), (double)(this.heightScale / this.mainNoiseScaleY), (double)(this.coordScale / this.mainNoiseScaleZ));
        this.minLimitRegion = this.minLimitPerlinNoise.func_76304_a(this.minLimitRegion, xOffset, 0, zOffset, 5, 33, 5, (double)this.coordScale, (double)this.heightScale, (double)this.coordScale);
        this.maxLimitRegion = this.maxLimitPerlinNoise.func_76304_a(this.maxLimitRegion, xOffset, 0, zOffset, 5, 33, 5, (double)this.coordScale, (double)this.heightScale, (double)this.coordScale);
        int i = 0;
        int j = 0;
        for (int k = 0; k < 5; ++k) {
            for (int l = 0; l < 5; ++l) {
                float accumulatedHeightVariation = 0.0f;
                float accumulatedHeight = 0.0f;
                float accumulatedWeightedHeightFactor = 0.0f;
                for (int j1 = -2; j1 <= 2; ++j1) {
                    for (int k1 = -2; k1 <= 2; ++k1) {
                        float baseHeight = (float)this.biomeDepthOffSet + this.biome.func_185355_j() * this.biomeDepthWeight;
                        float heightVariation = (float)this.biomeScaleOffset + this.biome.func_185360_m() * this.biomeScaleWeight;
                        float weightedHeightFactor = this.biomeWeights[j1 + 2 + (k1 + 2) * 5] / (baseHeight + 2.0f);
                        accumulatedHeightVariation += heightVariation * weightedHeightFactor;
                        accumulatedHeight += baseHeight * weightedHeightFactor;
                        accumulatedWeightedHeightFactor += weightedHeightFactor;
                    }
                }
                accumulatedHeightVariation = accumulatedHeightVariation / accumulatedWeightedHeightFactor * 0.9f + 0.1f;
                accumulatedHeight = (accumulatedHeight / accumulatedWeightedHeightFactor * 4.0f - 1.0f) / 8.0f;
                double depthBy8k = this.depthRegion[j] / 8000.0;
                if (depthBy8k < 0.0) {
                    depthBy8k = -depthBy8k * 0.3;
                }
                if ((depthBy8k = depthBy8k * 3.0 - 2.0) < 0.0) {
                    if ((depthBy8k /= 2.0) < -1.0) {
                        depthBy8k = -1.0;
                    }
                    depthBy8k /= 2.8;
                } else {
                    if (depthBy8k > 1.0) {
                        depthBy8k = 1.0;
                    }
                    depthBy8k /= 8.0;
                }
                ++j;
                for (int l1 = 0; l1 < 33; ++l1) {
                    double d1 = ((double)l1 - (this.baseSize + ((double)accumulatedHeight + depthBy8k * 0.2) * this.baseSize / 8.0 * 4.0)) * this.heightStretch / 2.0 / (double)accumulatedHeightVariation;
                    if (d1 < 0.0) {
                        d1 *= 4.0;
                    }
                    double minLimitScaled = this.minLimitRegion[i] / this.lowerLimitScale;
                    double maxLimitScaled = this.maxLimitRegion[i] / this.upperLimitScale;
                    double noiseValue = (this.mainNoiseRegion[i] / 10.0 + 1.0) / 2.0;
                    double linearInterpHeight = MathHelper.func_151238_b((double)minLimitScaled, (double)maxLimitScaled, (double)noiseValue) - d1;
                    if (l1 > 29) {
                        linearInterpHeight = linearInterpHeight * (1.0 - (double)((float)(l1 - 29) / 3.0f)) + -10.0 * (double)((float)(l1 - 29) / 3.0f);
                    }
                    this.heightMap[i] = linearInterpHeight;
                    ++i;
                }
            }
        }
    }

    public void func_185931_b(int parChunkX, int parChunkZ) {
        BlockFalling.field_149832_M = true;
        int chunkStartXInWorld = parChunkX * 16;
        int chunkStartZInWorld = parChunkZ * 16;
        BlockPos blockpos = new BlockPos(chunkStartXInWorld, 0, chunkStartZInWorld);
        this.rand.setSeed(this.world.func_72905_C());
        long k = this.rand.nextLong() / 2L * 2L + 1L;
        long l = this.rand.nextLong() / 2L * 2L + 1L;
        this.rand.setSeed((long)parChunkX * k + (long)parChunkZ * l ^ this.world.func_72905_C());
        this.chunkPos = new ChunkPos(parChunkX, parChunkZ);
        boolean villageHasGenerated = false;
        ForgeEventFactory.onChunkPopulate((boolean)true, (IChunkGenerator)this, (World)this.world, (Random)this.rand, (int)parChunkX, (int)parChunkZ, (boolean)villageHasGenerated);
        if (this.mapFeaturesEnabled) {
            villageHasGenerated = this.generateMapFeatures();
        }
        if (this.useWaterLakes && !villageHasGenerated && this.rand.nextInt(this.waterLakeChance) == 0 && TerrainGen.populate((IChunkGenerator)this, (World)this.world, (Random)this.rand, (int)parChunkX, (int)parChunkZ, (boolean)villageHasGenerated, (PopulateChunkEvent.Populate.EventType)PopulateChunkEvent.Populate.EventType.LAKE)) {
            int lakeStartX = this.rand.nextInt(16) + 8;
            int lakeStartY = this.rand.nextInt(256);
            int lakeStartZ = this.rand.nextInt(16) + 8;
            this.lakeGenerator.func_180709_b(this.world, this.rand, blockpos.func_177982_a(lakeStartX, lakeStartY, lakeStartZ));
        }
        if (this.useLavaLakes && !villageHasGenerated && this.rand.nextInt(this.lavaLakeChance / 10) == 0 && TerrainGen.populate((IChunkGenerator)this, (World)this.world, (Random)this.rand, (int)parChunkX, (int)parChunkZ, (boolean)villageHasGenerated, (PopulateChunkEvent.Populate.EventType)PopulateChunkEvent.Populate.EventType.LAVA)) {
            int lavaStartX = this.rand.nextInt(16) + 8;
            int lavaStartY = this.rand.nextInt(this.rand.nextInt(248) + 8);
            int lavaStartZ = this.rand.nextInt(16) + 8;
            if (lavaStartY < this.world.func_181545_F() || this.rand.nextInt(this.lavaLakeChance / 8) == 0) {
                this.lavaLakeGenerator.func_180709_b(this.world, this.rand, blockpos.func_177982_a(lavaStartX, lavaStartY, lavaStartZ));
            }
        }
        if (this.useDungeons && TerrainGen.populate((IChunkGenerator)this, (World)this.world, (Random)this.rand, (int)parChunkX, (int)parChunkZ, (boolean)villageHasGenerated, (PopulateChunkEvent.Populate.EventType)PopulateChunkEvent.Populate.EventType.DUNGEON)) {
            for (int dungeonAttempt = 0; dungeonAttempt < this.dungeonChance; ++dungeonAttempt) {
                int dungeonStartX = this.rand.nextInt(16) + 8;
                int dungeonStartY = this.rand.nextInt(256);
                int dungeonStartZ = this.rand.nextInt(16) + 8;
                this.dungeonGenerator.func_180709_b(this.world, this.rand, blockpos.func_177982_a(dungeonStartX, dungeonStartY, dungeonStartZ));
            }
        }
        this.biome.func_180624_a(this.world, this.rand, new BlockPos(chunkStartXInWorld, 0, chunkStartZInWorld));
        if (TerrainGen.populate((IChunkGenerator)this, (World)this.world, (Random)this.rand, (int)parChunkX, (int)parChunkZ, (boolean)villageHasGenerated, (PopulateChunkEvent.Populate.EventType)PopulateChunkEvent.Populate.EventType.CUSTOM)) {
            WorldEntitySpawner.func_77191_a((World)this.world, (Biome)this.biome, (int)(chunkStartXInWorld + 8), (int)(chunkStartZInWorld + 8), (int)16, (int)16, (Random)this.rand);
        }
        ForgeEventFactory.onChunkPopulate((boolean)false, (IChunkGenerator)this, (World)this.world, (Random)this.rand, (int)parChunkX, (int)parChunkZ, (boolean)villageHasGenerated);
        BlockFalling.field_149832_M = false;
    }

    private boolean generateMapFeatures() {
        boolean villageHasGenerated = false;
        if (this.useMineShafts) {
            this.mineshaftGenerator.func_175794_a(this.world, this.rand, this.chunkPos);
        }
        if (this.useStrongholds) {
            this.strongholdGenerator.func_175794_a(this.world, this.rand, this.chunkPos);
        }
        if (this.useTemples) {
            this.scatteredFeatureGenerator.func_175794_a(this.world, this.rand, this.chunkPos);
        }
        if (this.useMonuments) {
            this.oceanMonumentGenerator.func_175794_a(this.world, this.rand, this.chunkPos);
        }
        return villageHasGenerated;
    }

    public boolean func_185933_a(Chunk chunkIn, int x, int z) {
        boolean structureHasGenerated = false;
        if (this.useMonuments && this.mapFeaturesEnabled && chunkIn.func_177416_w() < 3600L) {
            structureHasGenerated |= this.oceanMonumentGenerator.func_175794_a(this.world, this.rand, new ChunkPos(x, z));
        }
        return structureHasGenerated;
    }

    public List<Biome.SpawnListEntry> func_177458_a(EnumCreatureType creatureType, BlockPos pos) {
        Biome biome = this.world.func_180494_b(pos);
        if (this.mapFeaturesEnabled) {
            if (creatureType == EnumCreatureType.MONSTER && this.scatteredFeatureGenerator.func_175798_a(pos)) {
                return this.scatteredFeatureGenerator.func_82667_a();
            }
            if (creatureType == EnumCreatureType.MONSTER && this.useMonuments && this.oceanMonumentGenerator.func_175796_a(this.world, pos)) {
                return this.oceanMonumentGenerator.func_175799_b();
            }
        }
        return biome.func_76747_a(creatureType);
    }

    public boolean func_193414_a(World worldIn, String structureName, BlockPos pos) {
        if (!this.mapFeaturesEnabled) {
            return false;
        }
        if ("Stronghold".equals(structureName) && this.strongholdGenerator != null) {
            return this.strongholdGenerator.func_175795_b(pos);
        }
        if ("Monument".equals(structureName) && this.oceanMonumentGenerator != null) {
            return this.oceanMonumentGenerator.func_175795_b(pos);
        }
        if ("Mineshaft".equals(structureName) && this.mineshaftGenerator != null) {
            return this.mineshaftGenerator.func_175795_b(pos);
        }
        return "Temple".equals(structureName) && this.scatteredFeatureGenerator != null ? this.scatteredFeatureGenerator.func_175795_b(pos) : false;
    }

    @Nullable
    public BlockPos func_180513_a(World worldIn, String structureName, BlockPos position, boolean findUnexplored) {
        if (!this.mapFeaturesEnabled) {
            return null;
        }
        if ("Stronghold".equals(structureName) && this.strongholdGenerator != null) {
            return this.strongholdGenerator.func_180706_b(worldIn, position, findUnexplored);
        }
        if ("Monument".equals(structureName) && this.oceanMonumentGenerator != null) {
            return this.oceanMonumentGenerator.func_180706_b(worldIn, position, findUnexplored);
        }
        if ("Mineshaft".equals(structureName) && this.mineshaftGenerator != null) {
            return this.mineshaftGenerator.func_180706_b(worldIn, position, findUnexplored);
        }
        return "Temple".equals(structureName) && this.scatteredFeatureGenerator != null ? this.scatteredFeatureGenerator.func_180706_b(worldIn, position, findUnexplored) : null;
    }

    public void func_180514_a(Chunk chunkIn, int x, int z) {
        if (this.mapFeaturesEnabled) {
            if (this.useMineShafts) {
                this.mineshaftGenerator.func_186125_a(this.world, x, z, (ChunkPrimer)null);
            }
            if (this.useStrongholds) {
                this.strongholdGenerator.func_186125_a(this.world, x, z, (ChunkPrimer)null);
            }
            if (this.useTemples) {
                this.scatteredFeatureGenerator.func_186125_a(this.world, x, z, (ChunkPrimer)null);
            }
            if (this.useMonuments) {
                this.oceanMonumentGenerator.func_186125_a(this.world, x, z, (ChunkPrimer)null);
            }
        }
    }
}

