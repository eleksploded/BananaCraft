package com.pikachu923.bananacraft.block;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.pikachu923.bananacraft.reference.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

public class BlockWrapper extends Block
{

	public BlockWrapper(Material material){
		super(material);
		this.setCreativeTab(Reference.CreativeTab);
		setHardness(3.0F);
		setResistance(5.0F);
	}
	
	public BlockWrapper(){
		this(Material.ROCK);
		this.setCreativeTab(Reference.CreativeTab);
		setHardness(3.0F);
		setResistance(5.0F);
	}

	    @Override
	    public String getUnlocalizedName()
	    {
	        return String.format("tile.%s%s", Reference.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	    }

	    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	    {
	        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	    }
}
