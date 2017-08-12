package com.pikachu923.bananacraft.client.gui;

import cpw.mods.fml.client.IModGuiFactory;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import java.util.Set;

import com.pikachu923.bananacraft.Inventory.ContainerIngotizer;
import com.pikachu923.bananacraft.TileEntity.TileIngotizer;
import com.pikachu923.bananacraft.gui.IngotizerGui;

/**
 * Created by pikac on 6/21/2016.
 */
public class GuiFactory implements IGuiHandler{
    
    @Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == 9){
			TileIngotizer tileEntityFurnace = (TileIngotizer) world.getTileEntity(x, y, z);
			return new ContainerIngotizer(player.inventory, tileEntityFurnace);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == 9){
			TileIngotizer tileIngotizer = (TileIngotizer) world.getTileEntity(x, y, z);
			return new IngotizerGui(player.inventory, tileIngotizer);
		}
		return null;
	}
}
