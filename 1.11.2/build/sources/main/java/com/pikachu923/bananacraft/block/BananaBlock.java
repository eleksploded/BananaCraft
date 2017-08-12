package com.pikachu923.bananacraft.block;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.pikachu923.bananacraft.Items1.BananaLifeCore;
import com.pikachu923.bananacraft.init.Tier1Items;
import com.pikachu923.bananacraft.init.Tier2Blocks;
import com.pikachu923.bananacraft.reference.Reference;
import com.pikachu923.bananacraft.utility.LogHelper;
import com.pikachu923.bananacraft.utility.func;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;

public class BananaBlock extends Block{
    String unlocalName;
    String Texture;
    ItemStack item;
    Block block;
    Block block2;
    public BananaBlock(String unlocalName){
        super(Material.ROCK);
        //this.setBlockName(Reference.RESOURCE_PREFIX + unlocalName);
        Texture = Reference.RESOURCE_PREFIX + unlocalName;
        this.setCreativeTab(Reference.CreativeTab);
        setHardness(3.0F);
        setRegistryName("BananaBlock");
        setUnlocalizedName("AwakenedBlock");
		setResistance(5.0F);
    }
    @Override
    public void onBlockClicked(World world, BlockPos pos, EntityPlayer player) {
    	item = player.inventory.getCurrentItem();
    	block = world.getBlockState(pos).getBlock();
    	block2 = world.getBlockState(pos.add(0,1,0)).getBlock();
    	if (item != null) {
    		if (item.getItem() instanceof BananaLifeCore && block instanceof BananaBlock && block2 instanceof BananaBlock) {
    			world.playSound(null, pos, SoundEvents.ENTITY_LIGHTNING_THUNDER, SoundCategory.BLOCKS,  1F, 0.5F);
    			world.spawnParticle(EnumParticleTypes.EXPLOSION_LARGE, pos.getX(), pos.getY() + 1, pos.getZ(), 0.0D, 0.0D, 0.0D);
    			world.setBlockState(pos, Tier2Blocks.AwakenedBlock.getDefaultState());
    			world.setBlockToAir(pos.add(0, 1, 0));
    			item.damageItem(2, player);
    			if (item.getItemDamage() == 0) {
    				func.removeItem(player, item);
    			}
    		}
    	}
    }
}
