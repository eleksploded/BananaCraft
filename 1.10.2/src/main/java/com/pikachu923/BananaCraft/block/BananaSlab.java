package com.pikachu923.BananaCraft.block;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Facing;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.pikachu923.BananaCraft.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BananaSlab extends BlockSlab {
	public IIcon Side0;
    public IIcon Side1;
    public IIcon Side2;
    public IIcon Side3;
    public IIcon Side4;
    public IIcon Side5;
	public String Texture;
	public BananaSlab(Material material, String unlocalname,boolean field_150004_a)
    {
        super(field_150004_a, material);
        this.opaque = true;
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
        this.setLightOpacity(255);
        Texture = Reference.RESOURCE_PREFIX + "BananaSlab";
        this.setBlockName(Reference.RESOURCE_PREFIX + unlocalname);
        this.setCreativeTab(Reference.CreativeTab);
        this.useNeighborBrightness = true;
    }
	@Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister icon){
        //Bottom
        Side0 = icon.registerIcon(Texture + "_top");
        //top
        Side1 = icon.registerIcon(Texture + "_top");
        //sides
        Side2 = icon.registerIcon(Texture + "_side");
        Side3 = icon.registerIcon(Texture + "_side");
        Side4 = icon.registerIcon(Texture + "_side");
        Side5 = icon.registerIcon(Texture + "_side");
    }
public IIcon getIcon(int side, int meta){
        if(side == 0){
            return Side0;
        }else if(side == 1){
            return Side1;
        }else if(side == 2){
            return Side2;
        }else if(side == 3){
            return Side3;
        }else if(side == 4){
            return Side4;
        }else if(side == 5){
            return Side5;
        }
    return null;
    }
@Override
public String func_150002_b(int p_150002_1_) {
	// TODO Auto-generated method stub
	return null;
}
}
