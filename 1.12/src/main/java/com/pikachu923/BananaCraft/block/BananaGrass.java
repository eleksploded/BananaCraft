package com.pikachu923.BananaCraft.block;

import java.util.Random;

import com.pikachu923.BananaCraft.init.Tier1Blocks;
import com.pikachu923.BananaCraft.init.Tier1Items;
import com.pikachu923.BananaCraft.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BananaGrass extends BlockWrapper{
    String unlocalName;
    String Texture;
    public IIcon Side0;
    public IIcon Side1;
    public IIcon Side2;
    public BananaGrass(String unlocalName){
        super(Material.grass);
        this.setBlockName(unlocalName);
        Texture = Reference.RESOURCE_PREFIX + unlocalName;
        setHardness(0.6F);
        setResistance(0.1F);
        setStepSound(soundTypeGrass);
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister icon){
        //Bottom
        Side0 = icon.registerIcon(Texture + "_bottom");
        //top
        Side1 = icon.registerIcon(Texture + "_top");
        //sides
        Side2 = icon.registerIcon(Texture + "_side");
    }
public IIcon getIcon(int side, int meta){
        if(side == 0){
            return Side0;
        }else if(side == 1){
            return Side1;
        }else if(side == 2){
            return Side2;
        }else if(side == 3){
            return Side2;
        }else if(side == 4){
            return Side2;
        }else if(side == 5){
            return Side2;
        }
    return null;
    }
	protected boolean canSilkHarvest()
	{
		return true;
	}
	public Item getItemDropped(int metadata, Random random, int fortune) {
	    return Blocks.dirt.getItemDropped(0, random, fortune);
	}
	
	
}
