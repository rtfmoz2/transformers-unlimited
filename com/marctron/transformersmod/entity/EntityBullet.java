/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 *  net.minecraft.block.material.Material
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.IProjectile
 *  net.minecraft.entity.monster.EntityEnderman
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.init.SoundEvents
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.server.SPacketChangeGameState
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.EntitySelectors
 *  net.minecraft.util.EnumParticleTypes
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.common.registry.IThrowableEntity
 */
package com.marctron.transformersmod.entity;

import com.marctron.transformersmod.util.CommonUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.SoundEvents;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.SPacketChangeGameState;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.IThrowableEntity;

public class EntityBullet
extends Entity
implements IProjectile,
IThrowableEntity {
    private static final Predicate<Entity> BULLET_TARGETS = ((Predicate<Entity>)arg_0 -> ((com.google.common.base.Predicate)EntitySelectors.field_180132_d).apply(arg_0)).and(arg_0 -> ((com.google.common.base.Predicate)EntitySelectors.field_94557_a).apply(arg_0)).and(Entity::func_70067_L);
    private float damage = 4.0f;
    private int knockbackStrength = 1;
    public Entity shooter;
    private int ticksInAir = 0;

    public EntityBullet(World world) {
        super(world);
        this.func_70105_a(0.2f, 0.2f);
    }

    public EntityBullet(World world, double x, double y, double z) {
        this(world);
        this.func_70107_b(x, y, z);
    }

    public EntityBullet(World world, EntityLivingBase shooter) {
        this(world, shooter, 0.25f);
    }

    public EntityBullet(World world, EntityLivingBase shooter, float inaccuracy) {
        this(world, shooter.field_70165_t, shooter.field_70163_u + (double)shooter.func_70047_e() - 0.1, shooter.field_70161_v);
        this.setThrower((Entity)shooter);
        this.setHeadingFromShooter((Entity)shooter, 5.0f, inaccuracy);
    }

    public EntityBullet setDamage(float amount) {
        this.damage = amount;
        return this;
    }

    protected void func_70088_a() {
    }

    protected void func_70037_a(NBTTagCompound nbt) {
        this.damage = nbt.func_74760_g("damage");
        this.knockbackStrength = nbt.func_74762_e("knockback");
    }

    protected void func_70014_b(NBTTagCompound nbt) {
        nbt.func_74776_a("damage", this.damage);
        nbt.func_74768_a("knockback", this.knockbackStrength);
    }

    public void setHeadingFromShooter(Entity shooter, float velocity, float inaccuracy) {
        float rotYaw = shooter.field_70177_z;
        float rotPitch = shooter.field_70125_A;
        float x = -MathHelper.func_76126_a((float)(rotYaw * ((float)Math.PI / 180))) * MathHelper.func_76134_b((float)(rotPitch * ((float)Math.PI / 180)));
        float y = -MathHelper.func_76126_a((float)(rotPitch * ((float)Math.PI / 180)));
        float z = MathHelper.func_76134_b((float)(rotYaw * ((float)Math.PI / 180))) * MathHelper.func_76134_b((float)(rotPitch * ((float)Math.PI / 180)));
        this.setThrowableHeading(x, y, z, velocity, inaccuracy);
        this.field_70159_w += shooter.field_70159_w;
        this.field_70179_y += shooter.field_70179_y;
        if (!shooter.field_70122_E) {
            this.field_70181_x += shooter.field_70181_x;
        }
    }

    private double genRandInaccuracy(float inaccuracy) {
        return this.field_70146_Z.nextGaussian() * (double)0.0075f * (double)inaccuracy;
    }

    public void setThrowableHeading(double x, double y, double z, float velocity, float inaccuracy) {
        double magnitude = MathHelper.func_76133_a((double)(x * x + y * y + z * z));
        x = (x / magnitude + this.genRandInaccuracy(inaccuracy)) * (double)velocity;
        y = (y / magnitude + this.genRandInaccuracy(inaccuracy)) * (double)velocity;
        z = (z / magnitude + this.genRandInaccuracy(inaccuracy)) * (double)velocity;
        this.field_70159_w = x;
        this.field_70181_x = y;
        this.field_70179_y = z;
        double hMagnitude = MathHelper.func_76133_a((double)(x * x + z * z));
        this.field_70177_z = (float)(MathHelper.func_181159_b((double)x, (double)z) * 57.29577951308232);
        this.field_70125_A = (float)(MathHelper.func_181159_b((double)y, (double)hMagnitude) * 57.29577951308232);
        this.field_70126_B = this.field_70177_z;
        this.field_70127_C = this.field_70125_A;
    }

    protected void onHit(RayTraceResult ray) {
        Entity entityHit = ray.field_72308_g;
        if (entityHit != null) {
            float magnitude = MathHelper.func_76133_a((double)(this.field_70159_w * this.field_70159_w + this.field_70181_x * this.field_70181_x + this.field_70179_y * this.field_70179_y));
            DamageSource damageSource = this.shooter == null ? CommonUtils.causeBulletDamage(this, this) : CommonUtils.causeBulletDamage(this, this.shooter);
            if (this.func_70027_ad() && !(entityHit instanceof EntityEnderman)) {
                entityHit.func_70015_d(5);
            }
            if (entityHit.func_70097_a(damageSource, this.damage)) {
                if (entityHit instanceof EntityLivingBase) {
                    EntityLivingBase entityLiving = (EntityLivingBase)entityHit;
                    if (magnitude > 0.0f) {
                        entityLiving.func_70024_g((double)this.knockbackStrength * 0.6 / (double)magnitude, 0.1, (double)this.knockbackStrength * 0.6 / (double)magnitude);
                    }
                    if (this.shooter instanceof EntityLivingBase) {
                        EnchantmentHelper.func_151384_a((EntityLivingBase)entityLiving, (Entity)this.shooter);
                        EnchantmentHelper.func_151385_b((EntityLivingBase)((EntityLivingBase)this.shooter), (Entity)entityLiving);
                    }
                    entityLiving.field_70737_aN = 0;
                    entityLiving.field_70172_ad = 0;
                    this.bulletHit(entityLiving);
                    if (entityLiving != this.shooter && entityLiving instanceof EntityPlayer && this.shooter instanceof EntityPlayerMP) {
                        ((EntityPlayerMP)this.shooter).field_71135_a.func_147359_a((Packet)new SPacketChangeGameState(6, 0.0f));
                    }
                }
                this.func_184185_a(SoundEvents.field_187677_b, 1.0f, 1.2f / (this.field_70146_Z.nextFloat() * 0.2f + 0.9f));
                if (!(entityHit instanceof EntityEnderman)) {
                    this.func_70106_y();
                }
            } else {
                this.func_70106_y();
            }
        } else {
            this.func_184185_a(SoundEvents.field_187677_b, 1.0f, 1.2f / (this.field_70146_Z.nextFloat() * 0.7f + 0.9f));
            BlockPos pos = ray.func_178782_a();
            IBlockState state = this.field_70170_p.func_180495_p(pos);
            if (state.func_185904_a() != Material.field_151579_a) {
                state.func_177230_c().func_180634_a(this.field_70170_p, pos, state, (Entity)this);
            }
            this.func_70106_y();
        }
    }

    protected void bulletHit(EntityLivingBase entityHit) {
    }

    public void func_70071_h_() {
        Entity entityHit;
        super.func_70071_h_();
        ++this.ticksInAir;
        Vec3d posNow = new Vec3d(this.field_70165_t, this.field_70163_u, this.field_70161_v);
        Vec3d posNext = posNow.func_72441_c(this.field_70159_w, this.field_70181_x, this.field_70179_y);
        Object ray = this.field_70170_p.func_147447_a(posNow, posNext, false, true, false);
        posNow = new Vec3d(this.field_70165_t, this.field_70163_u, this.field_70161_v);
        posNext = posNow.func_72441_c(this.field_70159_w, this.field_70181_x, this.field_70179_y);
        if (ray != null) {
            posNext = ray.field_72307_f;
        }
        if ((entityHit = this.findEntityOnPath(posNow, posNext)) != null) {
            ray = entityHit instanceof EntityPlayer && this.shooter instanceof EntityPlayer && !((EntityPlayer)this.shooter).func_96122_a((EntityPlayer)entityHit) ? null : new RayTraceResult(entityHit);
        }
        if (ray != null) {
            this.onHit((RayTraceResult)ray);
        }
        this.field_70165_t += this.field_70159_w;
        this.field_70163_u += this.field_70181_x;
        this.field_70161_v += this.field_70179_y;
        float motionMult = 0.99f;
        if (this.func_70090_H()) {
            for (int i = 0; i < 4; ++i) {
                this.field_70170_p.func_175688_a(EnumParticleTypes.WATER_BUBBLE, this.field_70165_t - this.field_70159_w * 0.25, this.field_70163_u - this.field_70181_x * 0.25, this.field_70161_v - this.field_70179_y * 0.25, this.field_70159_w, this.field_70181_x, this.field_70179_y, new int[0]);
            }
            motionMult = 0.6f;
        }
        if (this.func_70026_G()) {
            this.func_70066_B();
        }
        this.field_70159_w *= (double)motionMult;
        this.field_70181_x *= (double)motionMult;
        this.field_70179_y *= (double)motionMult;
        this.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
        this.func_145775_I();
    }

    private List<Entity> getEntitiesInArea(AxisAlignedBB area, List<Entity> entities) {
        ArrayList<Entity> entitiesInArea = new ArrayList<Entity>();
        entities.forEach(entity -> {
            if (entity.func_174813_aQ().func_72326_a(area) && BULLET_TARGETS.test((Entity)entity)) {
                entitiesInArea.add((Entity)entity);
            }
        });
        return entitiesInArea;
    }

    public Vec3d getCenter(AxisAlignedBB box) {
        return new Vec3d(box.field_72340_a + (box.field_72336_d - box.field_72340_a) * 0.5, box.field_72338_b + (box.field_72337_e - box.field_72338_b) * 0.5, box.field_72339_c + (box.field_72334_f - box.field_72339_c) * 0.5);
    }

    @Nullable
    protected Entity findEntityOnPath(Vec3d start, Vec3d end) {
        double stepMove;
        Entity closestEntity = null;
        double closestDistance = 0.0;
        AxisAlignedBB startAABB = this.func_174813_aQ();
        AxisAlignedBB endAABB = startAABB.func_72317_d(this.field_70159_w, this.field_70181_x, this.field_70179_y);
        Vec3d startCenter = this.getCenter(this.func_174813_aQ());
        Vec3d endCenter = this.getCenter(endAABB);
        AxisAlignedBB area = new AxisAlignedBB(startCenter, endCenter).func_186662_g(startAABB.func_72320_b());
        List possibleEntities = this.field_70170_p.func_175674_a((Entity)this, area, BULLET_TARGETS::test);
        if (possibleEntities.isEmpty()) {
            return null;
        }
        AxisAlignedBB movingAABB = new AxisAlignedBB(startAABB.field_72340_a, startAABB.field_72338_b, startAABB.field_72339_c, startAABB.field_72336_d, startAABB.field_72337_e, startAABB.field_72334_f);
        double distanceToEnd = startCenter.func_72438_d(endCenter);
        int steps = (int)Math.floor(distanceToEnd / (stepMove = startAABB.func_72320_b() * 1.5));
        Vec3d stepVec = steps == 0 ? new Vec3d(this.field_70159_w, this.field_70181_x, this.field_70179_y) : endCenter.func_178788_d(startCenter).func_186678_a(1.0 / (double)steps);
        for (int i = 0; i < steps; ++i) {
            if (i > 0) {
                movingAABB = movingAABB.func_191194_a(stepVec);
            }
            List<Entity> list = this.getEntitiesInArea(movingAABB, possibleEntities);
            for (Entity entity : list) {
                double distance;
                AxisAlignedBB aabb;
                RayTraceResult raytraceresult;
                if (entity == this.shooter || (raytraceresult = (aabb = entity.func_174813_aQ()).func_72327_a(start, end)) == null || !((distance = start.func_72436_e(raytraceresult.field_72307_f)) < closestDistance) && closestDistance != 0.0) continue;
                closestEntity = entity;
                closestDistance = distance;
            }
            if (closestEntity != null) break;
        }
        return closestEntity;
    }

    public Entity getThrower() {
        return this.shooter;
    }

    public void setThrower(Entity entity) {
        this.shooter = entity;
    }

    public void func_70186_c(double x, double y, double z, float velocity, float inaccuracy) {
    }
}

