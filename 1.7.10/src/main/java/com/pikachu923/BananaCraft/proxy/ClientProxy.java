package com.pikachu923.BananaCraft.proxy;

import com.pikachu923.BananaCraft.Entity.EntityAbe;
import com.pikachu923.BananaCraft.Entity.ModelAbe;
import com.pikachu923.BananaCraft.Entity.RenderAbe;
import com.pikachu923.BananaCraft.Entity.BananaBoss.BossEntity;
import com.pikachu923.BananaCraft.Entity.BananaBoss.BossModel;
import com.pikachu923.BananaCraft.Entity.BananaBoss.BossRender;

import cpw.mods.fml.client.registry.RenderingRegistry;

/**
 * Created by pikac on 6/20/2016.
 */
public class ClientProxy extends CommonProxy {

	@Override
	public void registerTile() {
	}
	
	public void registerRendering() {
		RenderingRegistry.registerEntityRenderingHandler(EntityAbe.class, new RenderAbe(new  ModelAbe(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(BossEntity.class, new BossRender(new BossModel(), 0.5F));
	}
}
