package com.pikachu923.bananacraft.Recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.pikachu923.bananacraft.armor.ArmorInit;
import com.pikachu923.bananacraft.init.Tier1Blocks;
import com.pikachu923.bananacraft.init.Tier1Items;
import com.pikachu923.bananacraft.init.Tier1Tools;
import com.pikachu923.bananacraft.init.Tier2Blocks;
import com.pikachu923.bananacraft.init.Tier2Items;
import com.pikachu923.bananacraft.init.Tier2Tools;

import cpw.mods.fml.common.registry.GameRegistry;

public class Tier2Recipes {
public static void Init() {
	//Items
	//GameRegistry.addShapelessRecipe(new ItemStack(Tier2Items.AwakenedBanana), new ItemStack(Tier1Items.ReinBanana), new ItemStack(Tier1Items.ReinBanana));
	GameRegistry.addRecipe(new ItemStack(Tier2Tools.BananaGun), "AA ", " LA", " AG", 'A', new ItemStack(Tier2Items.AwakenedBanana), 'L', new ItemStack(Blocks.lever), 'G', new ItemStack(Items.gunpowder));
	GameRegistry.addRecipe(new ItemStack(Tier2Tools.AwakenedPickaxe), "AAA", " S ", " S ", 'S', new ItemStack(Items.stick), 'A', new ItemStack(Tier2Items.AwakenedBanana));
	GameRegistry.addRecipe(new ItemStack(Tier2Tools.AwakenedAxe), "AA", "AS", " S", 'S', new ItemStack(Items.stick), 'A', new ItemStack(Tier2Items.AwakenedBanana));
	GameRegistry.addRecipe(new ItemStack(Tier2Tools.AwakenedHoe), "AA ", " S ", " S ", 'S', new ItemStack(Items.stick), 'A', new ItemStack(Tier2Items.AwakenedBanana));
	GameRegistry.addRecipe(new ItemStack(Tier2Tools.AwakenedShovel), "A", "S", "S", 'S', new ItemStack(Items.stick), 'A', new ItemStack(Tier2Items.AwakenedBanana));
	GameRegistry.addRecipe(new ItemStack(Tier2Tools.AwakenedSword), "A", "A", "S", 'S', new ItemStack(Items.stick), 'A', new ItemStack(Tier2Items.AwakenedBanana));
	GameRegistry.addRecipe(new ItemStack(Tier2Items.AwakenedBanana, 9), "A" , 'A', new ItemStack(Tier2Blocks.AwakenedBlock));
	GameRegistry.addRecipe(new ItemStack(Tier2Items.Spawner), " A ", "ABA", " A ", 'A', new ItemStack(Tier2Items.AwakenedBanana), 'B', new ItemStack(Items.diamond));
	
	//Blocks
	GameRegistry.addRecipe(new ItemStack(Tier2Blocks.AwakenedBlock), "BBB", "BBB", "BBB", 'B', new ItemStack(Tier2Items.AwakenedBanana));
	
	//Foods
	
	//Armor
	GameRegistry.addRecipe(new ItemStack(ArmorInit.AwakenedBananaHelmet), "BBB", "B B", 'B', new ItemStack(Tier2Items.AwakenedIngot));
	GameRegistry.addRecipe(new ItemStack(ArmorInit.AwakenedBananaChestplate), "B B", "BBB", "BBB", 'B', new ItemStack(Tier2Items.AwakenedIngot));
	GameRegistry.addRecipe(new ItemStack(ArmorInit.AwakenedBananaLeggings), "BBB", "B B", "B B", 'B', new ItemStack(Tier2Items.AwakenedIngot));
	GameRegistry.addRecipe(new ItemStack(ArmorInit.AwakenedBananaBoots), "B B", "B B", 'B', new ItemStack(Tier2Items.AwakenedIngot));
	}
}
