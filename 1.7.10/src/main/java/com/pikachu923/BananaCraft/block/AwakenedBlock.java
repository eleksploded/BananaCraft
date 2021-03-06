package com.pikachu923.BananaCraft.block;

import com.pikachu923.BananaCraft.Entity.BananaBoss.BossEntity;
import com.pikachu923.BananaCraft.Items3.Spawner;
import com.pikachu923.BananaCraft.reference.Reference;
import com.pikachu923.BananaCraft.utility.func;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class AwakenedBlock extends BlockWrapper{
	String unlocalName;
    String Texture;
    ItemStack item;
    Block block;
    Block block2;
    public AwakenedBlock(String unlocalName){
        super(Material.rock);
        this.setBlockName(unlocalName);
        Texture = Reference.RESOURCE_PREFIX + unlocalName;
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister){
        this.blockIcon = iconRegister.registerIcon(Texture);
    }
    public void onEntityWalking(World par1World, int par2, int par3, int par4, Entity par5Entity) {
    	if(par5Entity instanceof EntityPlayer){
    		((EntityLivingBase) par5Entity).addPotionEffect(new PotionEffect(Potion.heal.getId(), 50, 1, true));
    	}
    }
    public void onBlockClicked(World world, int x, int y, int z, EntityPlayer player) {
    	item = player.inventory.getCurrentItem();
    	block = world.getBlock(x, y, z);
    	block2 = world.getBlock(x, y + 1, z);
    	if (player.getCurrentEquippedItem() != null && !world.isRemote) {
    		if (item.getItem() instanceof Spawner && block instanceof AwakenedBlock && block2 instanceof AwakenedBlock) {
    			world.playSoundAtEntity(player, "random.explode" , 1F, 0.5F);
    			world.spawnParticle("hugeexplosion", x, y + 1, z, 0.0D, 0.0D, 0.0D);
    			world.setBlock(x, y, z, Blocks.air);
    			world.setBlock(x, y + 1, z, Blocks.air);
    			BossEntity entity = new BossEntity(world);
    			entity.setPosition(x, y, z);
    			world.spawnEntityInWorld(entity);
    			func.removeItem(player, item);
    		}
    	}
    }
}

