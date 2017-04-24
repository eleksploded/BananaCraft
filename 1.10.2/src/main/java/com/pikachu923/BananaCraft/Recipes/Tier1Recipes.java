package com.pikachu923.BananaCraft.Recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.pikachu923.BananaCraft.armor.ArmorInit;
import com.pikachu923.BananaCraft.init.Tier1Blocks;
import com.pikachu923.BananaCraft.init.Tier1Tools;
import com.pikachu923.BananaCraft.init.Tier1Items;
import com.pikachu923.BananaCraft.init.Tier2Items;

import cpw.mods.fml.common.registry.GameRegistry;

public class Tier1Recipes {
public static void init(){
	
	//Tools
	GameRegistry.addRecipe(new ItemStack(Tier1Tools.BananaPickaxe), "BBB", " S ", " S ", 's', new ItemStack(Items.stick), 'B', new ItemStack(Tier1Items.ReinBanana));
	GameRegistry.addRecipe(new ItemStack(Tier1Tools.BananaSword), "B", "B", "S", 'S', new ItemStack(Items.stick), 'B', new ItemStack(Tier1Items.ReinBanana));
	
	//Food
	GameRegistry.addRecipe(new ItemStack(Tier1Items.GoldenBanana), "GGG", "GBG", "GGG", 'G', new ItemStack(Items.gold_ingot), 'B', new ItemStack(Tier1Items.Banana));
	GameRegistry.addSmelting(new ItemStack(Tier1Items.BananaDough), new ItemStack(Tier1Items.BananaBread), 15);
	GameRegistry.addSmelting(new ItemStack(Tier1Blocks.BananaOre),new ItemStack(Tier1Items.Banana, 5), 10);
	GameRegistry.addRecipe(new ItemStack(Tier1Items.Banana), "NNN", "NNN", "NNN", 'N', new ItemStack(Tier1Items.BananaNugget));
	
	//items
	GameRegistry.addRecipe(new ItemStack(Tier1Items.BananaDough, 2), " B ", "BBB", " B ", 'B', new ItemStack(Tier1Items.Banana));
	GameRegistry.addRecipe(new ItemStack(Tier1Items.ReinBanana), "OIO", "IBI", "OIO", 'O', new ItemStack(Blocks.obsidian), 'I', new ItemStack(Items.iron_ingot), 'B', new ItemStack(Tier1Items.Banana));
	GameRegistry.addRecipe(new ItemStack(Tier1Items.BananaArmorCore), " B ", "BBB", " B ", 'B', new ItemStack(Tier1Items.ReinBanana));
	GameRegistry.addRecipe(new ItemStack(Tier1Items.BananaLifeCore), "BDB", "DSD", "BDB", 'D', new ItemStack(Items.diamond), 'B', new ItemStack(Tier1Blocks.BananaBlock), 'S', new ItemStack(Items.nether_star));
	
	//blocks
	GameRegistry.addRecipe(new ItemStack(Tier1Blocks.BananaBlock), "BBB", "BBB", "BBB", 'B', new ItemStack(Tier1Items.Banana));
	GameRegistry.addRecipe(new ItemStack(Tier1Blocks.BananaPillar, 6), "B B", "B B", "B B", 'B', new ItemStack(Tier1Blocks.BananaBlock));
	GameRegistry.addRecipe(new ItemStack(Tier1Blocks.BananaSlab, 6), "BBB", 'B', new ItemStack(Tier1Blocks.BananaBlock));
	GameRegistry.addRecipe(new ItemStack(Tier1Blocks.BananaDoubleSlab), "B", "B", 'B', new ItemStack(Tier1Blocks.BananaSlab));
	GameRegistry.addRecipe(new ItemStack(Tier1Blocks.BananaSlab, 2), "B", 'B', new ItemStack(Tier1Blocks.BananaDoubleSlab));
	GameRegistry.addRecipe(new ItemStack(Tier1Blocks.BananaBlock, 1), "B", 'B', new ItemStack(Tier1Blocks.BananaPillar));
	
	//armor
	GameRegistry.addRecipe(new ItemStack(ArmorInit.BananaHelmet), "BBB", "B B", 'B', new ItemStack(Tier1Items.BananaArmorCore));
	GameRegistry.addRecipe(new ItemStack(ArmorInit.BananaChestplate), "B B", "BBB", "BBB", 'B', new ItemStack(Tier1Items.BananaArmorCore));
	GameRegistry.addRecipe(new ItemStack(ArmorInit.BananaLeggings), "BBB", "B B", "B B", 'B', new ItemStack(Tier1Items.BananaArmorCore));
	GameRegistry.addRecipe(new ItemStack(ArmorInit.BananaBoots), "B B", "B B", 'B', new ItemStack(Tier1Items.BananaArmorCore));
	}
}
