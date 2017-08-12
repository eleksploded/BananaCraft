package com.pikachu923.BananaCraft.proxy;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * Created by pikac on 6/20/2016.
 */
public interface IProxy {

	void registerTile();

	void registerRendering();
}
