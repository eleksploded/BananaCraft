package com.pikachu923.BananaCraft.init;

import com.pikachu923.BananaCraft.Items1.BananaAxe;
import com.pikachu923.BananaCraft.Items1.BananaHoe;
import com.pikachu923.BananaCraft.Items1.BananaPickaxe;
import com.pikachu923.BananaCraft.Items1.BananaShovel;
import com.pikachu923.BananaCraft.Items1.BananaSword;
import com.pikachu923.BananaCraft.Items2.BananaGun;
import com.pikachu923.BananaCraft.utility.BananaRegistry;

//import net.mincecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemBow;
import net.minecraftforge.common.util.EnumHelper;

public class Tier1Tools {
	public static ToolMaterial Banana = EnumHelper.addToolMaterial("Banana", 2, 700,  7.0F,  2.5F, 12);
	public static final BananaPickaxe BananaPickaxe = new BananaPickaxe("BananaPickaxe");
	public static final BananaSword BananaSword = new BananaSword("BananaSword");
	public static final BananaAxe BananaAxe = new BananaAxe("BananaAxe");
	public static final BananaShovel BananaShovel = new BananaShovel("BananaShovel");
	public static final BananaHoe BananaHoe = new BananaHoe("BananaHoe");
	

	public static void init(){
		BananaRegistry.registerItem(BananaPickaxe, "BananaPickaxe");
		BananaRegistry.registerItem(BananaSword, "BananaSword");
		BananaRegistry.registerItem(BananaAxe, "BananaAxe");
		BananaRegistry.registerItem(BananaShovel, "BananaShovel");
		BananaRegistry.registerItem(BananaHoe, "BananaHoe");		
	}
}
