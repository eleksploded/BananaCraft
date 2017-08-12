package com.pikachu923.bananacraft.block;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.pikachu923.bananacraft.Entity.BananaBoss.BossEntity;
import com.pikachu923.bananacraft.Items1.BananaLifeCore;
import com.pikachu923.bananacraft.reference.Reference;
import com.pikachu923.bananacraft.utility.func;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class AwakenedBlock extends Block{
	String unlocalName;
    String Texture;
    ItemStack item;
    Block block;
    Block block2;
    public AwakenedBlock(String unlocalName){
        super(Material.ROCK);
        //this.setBlockName(unlocalName);
        Texture = Reference.RESOURCE_PREFIX + unlocalName;
        setRegistryName(unlocalName);
		setUnlocalizedName(unlocalName);
    }
    public void onEntityWalking(World par1World, int par2, int par3, int par4, Entity par5Entity) {
    	if(par5Entity instanceof EntityPlayer){
    		((EntityLivingBase) par5Entity).addPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH, 50, 1));
    	}
    }
    public void onBlockClicked(World world, BlockPos pos, EntityPlayer player) {
    	item = player.inventory.getCurrentItem();
    	block = (world.getBlockState(pos)).getBlock();
    	block2 = (world.getBlockState(pos.add(0,1,0))).getBlock();
    	if (item != null && !world.isRemote) {
    		if (item.getItem() instanceof BananaLifeCore && block instanceof AwakenedBlock && block2 instanceof AwakenedBlock) {
    			world.playSound(null, pos, SoundEvents.ENTITY_LIGHTNING_THUNDER, SoundCategory.BLOCKS,  1F, 0.5F);
    			world.spawnParticle(EnumParticleTypes.EXPLOSION_LARGE, pos.getX(), pos.getY() + 1, pos.getZ(), 0.0D, 0.0D, 0.0D);
    			world.setBlockToAir(pos);
    			world.setBlockToAir(pos.add(0, 1, 0));
    			BossEntity entity = new BossEntity(world);
    			entity.setPosition(pos.getX(),pos.getY(),pos.getZ());
    			world.spawnEntity(entity);
    			func.removeItem(player, item);
    		}
    	}
    }
}

