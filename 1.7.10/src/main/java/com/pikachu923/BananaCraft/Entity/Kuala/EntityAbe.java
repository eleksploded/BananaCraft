package com.pikachu923.BananaCraft.Entity.Kuala;

import java.util.Random;

import com.pikachu923.BananaCraft.init.Tier1Items;
import com.pikachu923.BananaCraft.reference.Reference;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockColored;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityOwnable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBeg;
import net.minecraft.entity.ai.EntityAIFollowOwner;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIOwnerHurtByTarget;
import net.minecraft.entity.ai.EntityAIOwnerHurtTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITargetNonTamed;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityAbe extends EntityTameable implements IEntityOwnable {
	 private float field_70926_e;
	    private float field_70924_f;


	    private boolean field_70928_h;

	    private static final String __OBFID = "CL_00001654";

	    public EntityAbe(World p_i1696_1_)
	    {
	        super(p_i1696_1_);
	        this.setSize(0.6F, 0.8F);
	        this.getNavigator().setAvoidsWater(true);
	        this.tasks.addTask(1, new EntityAISwimming(this));
	        this.tasks.addTask(2, this.aiSit);
	        this.tasks.addTask(3, new EntityAILeapAtTarget(this, 0.4F));
	        this.tasks.addTask(4, new EntityAIAttackOnCollide(this, 1.0D, true));
	        this.tasks.addTask(5, new EntityAIFollowOwner(this, 1.0D, 10.0F, 2.0F));
	        this.tasks.addTask(6, new EntityAIMate(this, 1.0D));
	        this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
	        //this.tasks.addTask(8, new EntityAIBeg(this, 8.0F));
	        this.tasks.addTask(9, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
	        this.tasks.addTask(9, new EntityAILookIdle(this));
	        this.targetTasks.addTask(1, new EntityAIOwnerHurtByTarget(this));
	        this.targetTasks.addTask(2, new EntityAIOwnerHurtTarget(this));
	        this.targetTasks.addTask(3, new EntityAIHurtByTarget(this, true));
	        this.targetTasks.addTask(4, new EntityAITargetNonTamed(this, EntitySheep.class, 200, false));
	        this.setTamed(false);
	    }

	    protected void applyEntityAttributes()
	    {
	        super.applyEntityAttributes();
	        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.30000001192092896D);

	        if (this.isTamed())
	        {
	            this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0D);
	        }
	        else
	        {
	            this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(8.0D);
	        }
	    }

	    /**
	     * Returns true if the newer Entity AI code should be run
	     */
	    public boolean isAIEnabled()
	    {
	        return true;
	    }

	    /**
	     * Sets the active target the Task system uses for tracking
	     */
	    public void setAttackTarget(EntityLivingBase p_70624_1_)
	    {
	        super.setAttackTarget(p_70624_1_);

	        if (p_70624_1_ == null)
	        {
	            this.setAngry(false);
	        }
	        else if (!this.isTamed())
	        {
	            this.setAngry(true);
	        }
	    }

	    /**
	     * main AI tick function, replaces updateEntityActionState
	     */
	    protected void updateAITick()
	    {
	        this.dataWatcher.updateObject(18, Float.valueOf(this.getHealth()));
	    }

	    protected void entityInit()
	    {
	        super.entityInit();
	        this.dataWatcher.addObject(18, new Float(this.getHealth()));
	        this.dataWatcher.addObject(19, new Byte((byte)0));
	        this.dataWatcher.addObject(20, new Byte((byte)BlockColored.func_150032_b(1)));
	    }

	    protected void func_145780_a(int p_145780_1_, int p_145780_2_, int p_145780_3_, Block p_145780_4_)
	    {
	        this.playSound("mob.wolf.step", 0.15F, 1.0F);
	    }


	    /**
	     * Returns the sound this mob makes while it's alive.
	     */
	    protected String getLivingSound()
	    {
	        return Reference.RESOURCE_PREFIX + "mob.Kuala.Living";
	    }

	    /**
	     * Returns the sound this mob makes when it is hurt.
	     */
	    protected String getHurtSound()
	    {
	        return Reference.RESOURCE_PREFIX + "mob.Kuala.Hurt";
	    }

	    /**
	     * Returns the sound this mob makes on death.
	     */
	    protected String getDeathSound()
	    {
	        return Reference.RESOURCE_PREFIX + "mob.Kuala.Hurt";
	    }

	    /**
	     * Returns the volume for the sounds this mob makes.
	     */
	    protected float getSoundVolume()
	    {
	        return 0.4F;
	    }

	    protected Item func_146068_u()
	    {
	        return Item.getItemById(-1);
	    }

	    /**
	     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
	     * use this to react to sunlight and start to burn.
	     */
	    public void onLivingUpdate()
	    {
	        super.onLivingUpdate();

	        if (this.worldObj.isRemote/* && this.isShaking*/ && !this.field_70928_h && !this.hasPath() && this.onGround)
	        {
	            this.field_70928_h = true;
	            //this.timeWolfIsShaking = 0.0F;
	            //this.prevTimeWolfIsShaking = 0.0F;
	            this.worldObj.setEntityState(this, (byte)8);
	        }
	    }

	    /**
	     * Called to update the entity's position/logic.
	     */
	    public void onUpdate()
	    {
	        super.onUpdate();
	        this.field_70924_f = this.field_70926_e;

	        if (this.func_70922_bv())
	        {
	            this.field_70926_e += (1.0F - this.field_70926_e) * 0.4F;
	        }
	        else
	        {
	            this.field_70926_e += (0.0F - this.field_70926_e) * 0.4F;
	        }

	        if (this.func_70922_bv())
	        {
	            this.numTicksToChaseTarget = 10;
	        }
	    }
	    public float getInterestedAngle(float p_70917_1_)
	    {
	        return (this.field_70924_f + (this.field_70926_e - this.field_70924_f) * p_70917_1_) * 0.15F * (float)Math.PI;
	    }

	    public float getEyeHeight()
	    {
	        return this.height * 0.8F;
	    }

	    /**
	     * The speed it takes to move the entityliving's rotationPitch through the faceEntity method. This is only currently
	     * use in wolves.
	     */
	  //  public int getVerticalFaceSpeed()
	  //  {
	  //      return this.isSitting() ? 20 : super.getVerticalFaceSpeed();
	  //  }

	    /**
	     * Called when the entity is attacked.
	     */
	    public boolean attackEntityFrom(DamageSource p_70097_1_, float p_70097_2_)
	    {
	        if (this.isEntityInvulnerable())
	        {
	            return false;
	        }
	        else
	        {
	            Entity var3 = p_70097_1_.getEntity();
	            this.aiSit.setSitting(false);

	            if (var3 != null && !(var3 instanceof EntityPlayer) && !(var3 instanceof EntityArrow))
	            {
	                p_70097_2_ = (p_70097_2_ + 1.0F) / 2.0F;
	            }

	            return super.attackEntityFrom(p_70097_1_, p_70097_2_);
	        }
	    }

	    public boolean attackEntityAsMob(Entity p_70652_1_)
	    {
	        int var2 = this.isTamed() ? 4 : 2;
	        return p_70652_1_.attackEntityFrom(DamageSource.causeMobDamage(this), (float)var2);
	    }

	    public void setTamed(boolean p_70903_1_)
	    {
	        super.setTamed(p_70903_1_);

	        if (p_70903_1_)
	        {
	            this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0D);
	        }
	        else
	        {
	            this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(8.0D);
	        }
	    }

	    /**
	     * Called when a player interacts with a mob. e.g. gets milk from a cow, gets into the saddle on a pig.
	     */
	    public boolean interact(EntityPlayer p_70085_1_)
	    {
	        ItemStack var2 = p_70085_1_.inventory.getCurrentItem();

	        if (this.isTamed())
	        {
	            if (var2 != null)
	            {
	                if (var2.getItem() instanceof ItemFood)
	                {
	                    ItemFood var3 = (ItemFood)var2.getItem();

	                    if (var3 == Tier1Items.Banana && this.dataWatcher.getWatchableObjectFloat(18) < 20.0F)
	                    {
	                        if (!p_70085_1_.capabilities.isCreativeMode)
	                        {
	                            --var2.stackSize;
	                        }

	                        this.heal((float)var3.func_150905_g(var2));

	                        if (var2.stackSize <= 0)
	                        {
	                            p_70085_1_.inventory.setInventorySlotContents(p_70085_1_.inventory.currentItem, (ItemStack)null);
	                        }

	                        return true;
	                    }
	                }
	            }

	            if (this.func_152114_e(p_70085_1_) && this.worldObj.isRemote && !this.isBreedingItem(var2))
	            {
	                this.aiSit.setSitting(!this.isSitting());
	                this.isJumping = false;
	                this.setPathToEntity((PathEntity)null);
	                this.setTarget((Entity)null);
	                this.setAttackTarget((EntityLivingBase)null);
	            }
	        }
	        else if (var2 != null && var2.getItem() == Items.bone && !this.isAngry())
	        {
	            if (!p_70085_1_.capabilities.isCreativeMode)
	            {
	                --var2.stackSize;
	            }

	            if (var2.stackSize <= 0)
	            {
	                p_70085_1_.inventory.setInventorySlotContents(p_70085_1_.inventory.currentItem, (ItemStack)null);
	            }

	            if (this.worldObj.isRemote)
	            {
	                if (this.rand.nextInt(3) == 0)
	                {
	                    this.setTamed(true);
	                    this.setPathToEntity((PathEntity)null);
	                    this.setAttackTarget((EntityLivingBase)null);
	                    this.aiSit.setSitting(true);
	                    this.setHealth(20.0F);
	                    this.func_152115_b(p_70085_1_.getUniqueID().toString());
	                    this.playTameEffect(true);
	                    this.worldObj.setEntityState(this, (byte)7);
	                }
	                else
	                {
	                    this.playTameEffect(false);
	                    this.worldObj.setEntityState(this, (byte)6);
	                }
	            }

	            return true;
	        }

	        return super.interact(p_70085_1_);
	    }

	    public void handleHealthUpdate(byte p_70103_1_)
	    {
	        if (p_70103_1_ == 8)
	        {
	            this.field_70928_h = true;
	            //this.timeWolfIsShaking = 0.0F;
	            //this.prevTimeWolfIsShaking = 0.0F;
	        }
	        else
	        {
	            super.handleHealthUpdate(p_70103_1_);
	        }
	    }
	    /**
	     * Checks if the parameter is an item which this animal can be fed to breed it (wheat, carrots or seeds depending on
	     * the animal type)
	     */
	    public boolean isBreedingItem(ItemStack food)
	    {
	    	if(food.getItem() == Tier1Items.Banana){
	    		return true;
	    	} else {
	    		return false;
	    	}
	    }

	    /**
	     * Will return how many at most can spawn in a chunk at once.
	     */
	    public int getMaxSpawnedInChunk()
	    {
	        return 8;
	    }

	    /**
	     * Determines whether this wolf is angry or not.
	     */
	    public boolean isAngry()
	    {
	        return (this.dataWatcher.getWatchableObjectByte(16) & 2) != 0;
	    }

	    /**
	     * Sets whether this wolf is angry or not.
	     */
	    public void setAngry(boolean p_70916_1_)
	    {
	        byte var2 = this.dataWatcher.getWatchableObjectByte(16);

	        if (p_70916_1_)
	        {
	            this.dataWatcher.updateObject(16, Byte.valueOf((byte)(var2 | 2)));
	        }
	        else
	        {
	            this.dataWatcher.updateObject(16, Byte.valueOf((byte)(var2 & -3)));
	        }
	    }

	    public EntityAbe createChild(EntityAgeable p_90011_1_)
	    {
	        EntityAbe var2 = new EntityAbe(this.worldObj);
	        String var3 = this.func_152113_b();

	        if (var3 != null && var3.trim().length() > 0)
	        {
	            var2.func_152115_b(var3);
	            var2.setTamed(true);
	        }

	        return var2;
	    }

	    public void func_70918_i(boolean p_70918_1_)
	    {
	        if (p_70918_1_)
	        {
	            this.dataWatcher.updateObject(19, Byte.valueOf((byte)1));
	        }
	        else
	        {
	            this.dataWatcher.updateObject(19, Byte.valueOf((byte)0));
	        }
	    }

	    /**
	     * Returns true if the mob is currently able to mate with the specified mob.
	     */
	    public boolean canMateWith(EntityAnimal p_70878_1_)
	    {
	        if (p_70878_1_ == this)
	        {
	            return false;
	        }
	        else if (!this.isTamed())
	        {
	            return false;
	        }
	        else if (!(p_70878_1_ instanceof EntityAbe))
	        {
	            return false;
	        }
	        else
	        {
	            EntityAbe var2 = (EntityAbe)p_70878_1_;
	            return !var2.isTamed() ? false : (var2.isSitting() ? false : this.isInLove() && var2.isInLove());
	        }
	    }

	    public boolean func_70922_bv()
	    {
	        return this.dataWatcher.getWatchableObjectByte(19) == 1;
	    }

	    /**
	     * Determines if an entity can be despawned, used on idle far away entities
	     */
	    protected boolean canDespawn()
	    {
	        return !this.isTamed() && this.ticksExisted > 2400;
	    }

	    public boolean func_142018_a(EntityLivingBase p_142018_1_, EntityLivingBase p_142018_2_)
	    {
	        if (!(p_142018_1_ instanceof EntityCreeper) && !(p_142018_1_ instanceof EntityGhast))
	        {
	            if (p_142018_1_ instanceof EntityAbe)
	            {
	                EntityAbe var3 = (EntityAbe)p_142018_1_;

	                if (var3.isTamed() && var3.getOwner() == p_142018_2_)
	                {
	                    return false;
	                }
	            }

	            return p_142018_1_ instanceof EntityPlayer && p_142018_2_ instanceof EntityPlayer && !((EntityPlayer)p_142018_2_).canAttackPlayer((EntityPlayer)p_142018_1_) ? false : !(p_142018_1_ instanceof EntityHorse) || !((EntityHorse)p_142018_1_).isTame();
	        }
	        else
	        {
	            return false;
	        }
	    }
	    protected Item getDropItem()
	    {
	        return Items.leather;
	    }
	    
}	    