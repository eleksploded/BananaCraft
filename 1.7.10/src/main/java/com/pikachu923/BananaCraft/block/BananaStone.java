package com.pikachu923.BananaCraft.block;

import java.util.Random;

import com.pikachu923.BananaCraft.init.Tier1Items;
import com.pikachu923.BananaCraft.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class BananaStone extends BlockWrapper{
	String unlocalName;
	String Texture;
public BananaStone(String unlocalName){
	 super();
     this.setBlockName(unlocalName);
     Texture = Reference.RESOURCE_PREFIX + unlocalName;
     setHardness(2.0F);
 }
@Override
 @SideOnly(Side.CLIENT)
 public void registerBlockIcons(IIconRegister iconRegister){
     this.blockIcon = iconRegister.registerIcon(Texture);
 }

@Override
public Item getItemDropped(int metadata, Random random, int fortune) {
    return Tier1Items.BananaNugget;
}
public boolean canSilkHarvest() {
	return true;
}

}


