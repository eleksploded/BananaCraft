package com.pikachu923.BananaCraft.Entity.BananaBoss;

import com.pikachu923.BananaCraft.init.Tier3Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.IMob;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class BossEntity extends EntityMob implements IBossDisplayData, IMob
{
    public Object capabilities;
    public BossEntity(World par1World)
	{
        super(par1World);
        this.setSize(0.9F, 1.3F);      
    }
    @Override
	protected void applyEntityAttributes()
	{
	    super.applyEntityAttributes(); 

	    // standard attributes registered to EntityLivingBase
	   getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(400.0D);
	   getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.20D);
	   getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.8D);
	   getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(16.0D);

	    // need to register any additional attributes
	   //getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
	   getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(10.0D);
	}
	@SideOnly(Side.CLIENT)
    public int getBossHealth() {
    	return (int) this.getHealth();
    }
    
     protected void entityInit()
     {
         super.entityInit();
         this.dataWatcher.addObject(13, new Byte((byte)0));
        
         
     }
     
     public void onLivingUpdate()
     {
         this.updateArmSwingProgress();
         float f = this.getBrightness(1.0F);

         if (f > 0.5F)
         {
             this.entityAge += 2;
         }
         
         BossStatus.setBossStatus(this, true);

         super.onLivingUpdate();
     }




    
    public boolean isAIEnabled()
    {
        return true;
    }
       
	public void initCreature() {
		// TODO Auto-generated method stub
		
	}
	
	public Item getDropItem() {
		return Tier3Items.CorroptFragment;
		
	}
	
	public void dropFewItems(boolean par1, int par2)
    {
        Item item = this.getDropItem();

        if (item != null)
        {
            int j = this.rand.nextInt(3) + 1;

            if (par2 > 0)
            {
                j += this.rand.nextInt(par2);
            }

            for (int k = 0; k < j; ++k)
            {
                this.dropItem(item, 1);
            }
        }
    }
	
	protected void updateAITick() {
		super.updateAITick();
	}
	
	public boolean attackEntityFrom(DamageSource p_70097_1_, float p_70097_2_) {
		return super.attackEntityFrom(p_70097_1_, p_70097_2_);
	}
	
	public boolean attackEntityAsMob(Entity p_70652_1_) {
		return super.attackEntityAsMob(p_70652_1_);
	}
	
	public void handleHealthUpdate(byte p_70103_1_){
		super.handleHealthUpdate(p_70103_1_);
	}
	
	protected boolean canDespawn(){
		return super.canDespawn();
	}
}
