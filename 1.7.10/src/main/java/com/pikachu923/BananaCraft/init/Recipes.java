package com.pikachu923.BananaCraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes {
public static void init(){
	//Tools
	GameRegistry.addRecipe(new ItemStack(ModTools.BananaPickaxe), "BBB", " S ", " S ", 's', new ItemStack(Items.stick), 'B', new ItemStack(ModItems.Reinbanana));
	GameRegistry.addRecipe(new ItemStack(ModTools.BananaSword), "B", "B", "S", 'S', new ItemStack(Items.stick), 'B', new ItemStack(ModItems.Reinbanana));
	
	//Food
	GameRegistry.addRecipe(new ItemStack(ModItems.GoldenBanana), "GGG", "GBG", "GGG", 'G', new ItemStack(Items.gold_ingot), 'B', new ItemStack(ModItems.Banana));
	GameRegistry.addSmelting(new ItemStack(ModItems.BananaDough), new ItemStack(ModItems.BananaBread), 15);
	
	}
}
