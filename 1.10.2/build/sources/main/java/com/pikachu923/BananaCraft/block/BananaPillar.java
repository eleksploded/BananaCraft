package com.pikachu923.BananaCraft.block;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

import com.pikachu923.BananaCraft.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BananaPillar extends BlockWrapper {
    String unlocalName;
    String Texture;
    public IIcon Side0;
    public IIcon Side1;
    public IIcon Side2;
    public IIcon Side3;
    public IIcon Side4;
    public IIcon Side5;
    public BananaPillar(String unlocalName){
        super();
        this.setBlockName(unlocalName);
        Texture = Reference.RESOURCE_PREFIX + unlocalName;
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister icon){
        //Bottom
        Side0 = icon.registerIcon(Reference.RESOURCE_PREFIX + "BananaBlock");
        //top
        Side1 = icon.registerIcon(Reference.RESOURCE_PREFIX + "BananaBlock");
        //sides
        Side2 = icon.registerIcon(Texture);
        Side3 = icon.registerIcon(Texture);
        Side4 = icon.registerIcon(Texture);
        Side5 = icon.registerIcon(Texture);
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

}
