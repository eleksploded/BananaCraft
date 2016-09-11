package com.pikachu923.BananaCraft.proxy;

import com.pikachu923.BananaCraft.Entity.BananaBoss.BossEntity;
import com.pikachu923.BananaCraft.Entity.BananaBoss.BossModel;
import com.pikachu923.BananaCraft.Entity.BananaBoss.BossRender;
import com.pikachu923.BananaCraft.Projectiles.BananaBomb0.EntityBananaBomb;
import com.pikachu923.BananaCraft.Projectiles.BananaBomb0.RenderBananaBomb;
import com.pikachu923.BananaCraft.Projectiles.BananaBomb1.EntityBananaBomb1;
import com.pikachu923.BananaCraft.Projectiles.BananaBomb1.RenderBananaBomb1;
import com.pikachu923.BananaCraft.Projectiles.BananaBomb2.EntityBananaBomb2;
import com.pikachu923.BananaCraft.Projectiles.BananaBomb2.RenderBananaBomb2;
import com.pikachu923.BananaCraft.Projectiles.BananaBomb3.EntityBananaBomb3;
import com.pikachu923.BananaCraft.Projectiles.BananaBomb3.RenderBananaBomb3;
import com.pikachu923.BananaCraft.init.Other;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.world.World;

/**
 * Created by pikac on 6/20/2016.
 */
@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {
	 public World worldObj;

	//@Override
	public void registerTile() {
	}
	
	//@SideOnly(Side.CLIENT)
	public void registerRendering() {
		//if(!this.worldObj.isRemote) {
		//RenderingRegistry.registerEntityRenderingHandler(EntityAbe.class, new RenderAbe(new  ModelAbe(), 0.5F));
		//@SideOnly(Side.CLIENT)
		RenderingRegistry.registerEntityRenderingHandler(BossEntity.class, new BossRender(new BossModel(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBananaBomb.class, new RenderBananaBomb(Other.BananaBomb0));
		RenderingRegistry.registerEntityRenderingHandler(EntityBananaBomb1.class, new RenderBananaBomb1(Other.BananaBomb1));
		RenderingRegistry.registerEntityRenderingHandler(EntityBananaBomb2.class, new RenderBananaBomb2(Other.BananaBomb2));
		RenderingRegistry.registerEntityRenderingHandler(EntityBananaBomb3.class, new RenderBananaBomb3(Other.BananaBomb3));
		//}
	}
	
	public ClientProxy getClientProxy() {
		return this;
	}
	
}
