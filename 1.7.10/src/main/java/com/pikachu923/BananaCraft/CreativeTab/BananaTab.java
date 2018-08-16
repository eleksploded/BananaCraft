package com.eleksploded.BananaCraft.CreativeTab;

import com.eleksploded.BananaCraft.init.Tier1Items;
import com.eleksploded.BananaCraft.reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BananaTab {
public static final CreativeTabs BananaTab = new CreativeTabs(Reference.MOD_ID){
	@Override
	public Item getTabIconItem(){
		return Tier1Items.Banana;
	}
	public String getTranslatedTabLable(){
		return "BananaCraft";
	}
};
}
