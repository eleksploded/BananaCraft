package com.pikachu923.BananaCraft.items;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
//import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
//import net.minecraftforge.common.util.ForgeDirection;

import com.pikachu923.BananaCraft.reference.Reference;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Banana extends ItemFood {
	String Texture;
	/**
	 * Block ID of the soil this seed food should be planted on.
	 */


	public Banana(int parHealAmount, float parSaturationModifier, String unlocalName) {
		super(parHealAmount, parSaturationModifier, false);
		//theBlockPlant = parBlockPlant;
		//soilId = parSoilBlock;
		this.setUnlocalizedName(Reference.RESOURCE_PREFIX + unlocalName);
		Texture = Reference.RESOURCE_PREFIX + unlocalName;
		setCreativeTab(Reference.CreativeTab);
		setRegistryName("Banana");
	}


	/*@Override
	public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public IBlockState getPlant(IBlockAccess world, BlockPos pos) {
		// TODO Auto-generated method stub
		return (IBlockState) theBlockPlant;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(Texture);
	}
	@Override
	public boolean onItemUse(ItemStack parItemStack, EntityPlayer parPlayer, 
			World parWorld, int parX, int parY, int parZ, int par7, float par8, 
			float par9, float par10)
	{
		// not sure what this parameter does, copied it from potato
		if (par7 != 1)
		{
			return false;
		}
		// check if player has capability to edit
		else if (parPlayer.canPlayerEdit(parX, parY+1, parZ, par7, parItemStack))
		{
			// check that the soil block can sustain the plant
			// and that block above is air so there is room for plant to grow
			if (parWorld.getBlock(parX, parY, parZ).canSustainPlant(parWorld, 
					parX, parY, parZ, ForgeDirection.UP, this) && parWorld
					.isAirBlock(parX, parY+1, parZ))
			{
				// place the plant block
				parWorld.setBlock(parX, parY+1, parZ, theBlockPlant);
				// decrement the stack of seed items
				--parItemStack.stackSize;
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}

	@Override
	public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z)
	{
		return EnumPlantType.Crop;
	}

	@Override
	public Block getPlant(IBlockAccess world, int x, int y, int z)
	{
		return theBlockPlant;
	}

	@Override
	public int getPlantMetadata(IBlockAccess world, int x, int y, int z)
	{
		return 0;
	}

	public Block getSoilId() 
	{
		return soilId;
	}*/
}


