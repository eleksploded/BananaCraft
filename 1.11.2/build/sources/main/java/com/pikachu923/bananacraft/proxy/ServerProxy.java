package com.pikachu923.bananacraft.proxy;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by pikac on 6/20/2016.
 */
//@SideOnly(Side.SERVER)
public class ServerProxy extends CommonProxy {

	@Override
	public void registerRendering() {
		// TODO Auto-generated method stub
		
	}
	
	public ServerProxy getServerProxy() {
		return this;
	}

	@Override
	public void registerTile() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ItemRender() {
		// TODO Auto-generated method stub
		
	}
	
	
}