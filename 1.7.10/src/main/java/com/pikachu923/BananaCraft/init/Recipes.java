package com.pikachu923.BananaCraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.*;
import net.minecraft.item.ItemStack;

public class Recipes {
public static void init(){
	//Tools
	GameRegistry.addRecipe(new ItemStack(ModTools.BananaPickaxe), "BBB", " S ", " S ", 's', new ItemStack(Items.stick), 'B', new ItemStack(ModItems.ReinBanana));
	GameRegistry.addRecipe(new ItemStack(ModTools.BananaSword), "B", "B", "S", 'S', new ItemStack(Items.stick), 'B', new ItemStack(ModItems.ReinBanana));
	
	//Food
	GameRegistry.addRecipe(new ItemStack(ModItems.GoldenBanana), "GGG", "GBG", "GGG", 'G', new ItemStack(Items.gold_ingot), 'B', new ItemStack(ModItems.Banana));
	GameRegistry.addSmelting(new ItemStack(ModItems.BananaDough), new ItemStack(ModItems.BananaBread), 15);
	GameRegistry.addSmelting(new ItemStack(ModBlock.BananaOre),new ItemStack(ModItems.Banana, 5), 10);
	GameRegistry.addRecipe(new ItemStack(ModItems.Banana), "NNN", "NNN", "NNN", 'N', new ItemStack(ModItems.BananaNugget));
	
	//items
	GameRegistry.addRecipe(new ItemStack(ModItems.BananaDough, 2), " B ", "BBB", " B ", 'B', new ItemStack(ModItems.Banana));
	GameRegistry.addRecipe(new ItemStack(ModItems.ReinBanana), "OIO", "IBI", "OIO", 'O', new ItemStack(Blocks.obsidian), 'I', new ItemStack(Items.iron_ingot), 'B', new ItemStack(ModItems.Banana));
	GameRegistry.addRecipe(new ItemStack(ModItems.BananaArmorCore), " B ", "BBB", " B ", 'B', new ItemStack(ModItems.ReinBanana));
	
	//blocks
	GameRegistry.addRecipe(new ItemStack(ModBlock.BananaBlock), "BBB", "BBB", "BBB", 'B', new ItemStack(ModItems.Banana));
	GameRegistry.addRecipe(new ItemStack(ModBlock.BananaPillar, 6), "B B", "B B", "B B", 'B', new ItemStack(ModBlock.BananaBlock));
	GameRegistry.addRecipe(new ItemStack(ModBlock.BananaSlab, 6), "BBB", 'B', new ItemStack(ModBlock.BananaBlock));
	GameRegistry.addRecipe(new ItemStack(ModBlock.BananaDoubleSlab), "B", "B", 'B', new ItemStack(ModBlock.BananaSlab));
	GameRegistry.addRecipe(new ItemStack(ModBlock.BananaSlab, 2), "B", 'B', new ItemStack(ModBlock.BananaDoubleSlab));
	GameRegistry.addRecipe(new ItemStack(ModBlock.BananaBlock, 1), "B", 'B', new ItemStack(ModBlock.BananaPillar));
	
	//armor
	GameRegistry.addRecipe(new ItemStack(ModTools.BananaHelmet), "BBB", "B B", 'B', new ItemStack(ModItems.BananaArmorCore));
	GameRegistry.addRecipe(new ItemStack(ModTools.BananaChestplate), "B B", "BBB", "BBB", 'B', new ItemStack(ModItems.BananaArmorCore));
	GameRegistry.addRecipe(new ItemStack(ModTools.BananaLeggings), "BBB", "B B", "B B", 'B', new ItemStack(ModItems.BananaArmorCore));
	GameRegistry.addRecipe(new ItemStack(ModTools.BananaBoots), "B B", "B B", 'B', new ItemStack(ModItems.BananaArmorCore));
	}
}
