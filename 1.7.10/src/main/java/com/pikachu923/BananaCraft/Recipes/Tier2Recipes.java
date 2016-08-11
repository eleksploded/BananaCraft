package com.pikachu923.BananaCraft.Recipes;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.pikachu923.BananaCraft.armor.ArmorInit;
import com.pikachu923.BananaCraft.init.Tier1Blocks;
import com.pikachu923.BananaCraft.init.Tier1Items;
import com.pikachu923.BananaCraft.init.Tier2Blocks;
import com.pikachu923.BananaCraft.init.Tier2Items;

import cpw.mods.fml.common.registry.GameRegistry;

public class Tier2Recipes {
public static void Init() {
	//Items
	GameRegistry.addRecipe(new ItemStack(Tier2Items.AwakenedBanana, 2)," c ", "cic", " c ", 'c' , new ItemStack(Tier1Items.ReinBanana), 'i', new ItemStack(Tier1Items.BananaLifeCore , 1, OreDictionary.WILDCARD_VALUE));
	GameRegistry.addRecipe(new ItemStack(Tier2Items.AwakenedArmorCore), " A ", "AAA", " A ", 'A', new ItemStack(Tier2Items.AwakenedBanana));
	
	//Blocks
	GameRegistry.addRecipe(new ItemStack(Tier2Blocks.AwakenedBlock), "BBB", "BBB", "BBB", 'B', new ItemStack(Tier2Items.AwakenedBanana));
	
	//Foods
	
	//Armor
	GameRegistry.addRecipe(new ItemStack(ArmorInit.AwakenedBananaHelmet), "BBB", "B B", 'B', new ItemStack(Tier2Items.AwakenedArmorCore));
	GameRegistry.addRecipe(new ItemStack(ArmorInit.AwakenedBananaChestplate), "B B", "BBB", "BBB", 'B', new ItemStack(Tier2Items.AwakenedArmorCore));
	GameRegistry.addRecipe(new ItemStack(ArmorInit.AwakenedBananaLeggings), "BBB", "B B", "B B", 'B', new ItemStack(Tier2Items.AwakenedArmorCore));
	GameRegistry.addRecipe(new ItemStack(ArmorInit.AwakenedBananaBoots), "B B", "B B", 'B', new ItemStack(Tier2Items.AwakenedArmorCore));
}
}