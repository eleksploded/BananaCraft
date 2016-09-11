package com.pikachu923.BananaCraft.proxy;

import com.pikachu923.BananaCraft.TileEntity.TileIngotizer;
import com.pikachu923.BananaCraft.block.BananaIngotizer;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * Created by pikac on 6/20/2016.
 */
@SideOnly(Side.SERVER)
public class ServerProxy extends CommonProxy {
	
	public void registerTile() {
		GameRegistry.registerTileEntity(TileIngotizer.class, "BananaIngotizer");
	}

	@Override
	public void registerRendering() {
		// TODO Auto-generated method stub
		
	}
	
	public ServerProxy getServerProxy() {
		return this;
	}
	
	
}
