package com.pikachu923.BananaCraft.Recipes;

import com.pikachu923.BananaCraft.Handler.IngotizerRecipes;
import com.pikachu923.BananaCraft.init.Tier1Items;
import com.pikachu923.BananaCraft.init.Tier3Items;

import net.minecraft.item.ItemStack;

public class Tier3Recipes {
	//public static final IngotizerRecipes Recipe1 = new IngotizerRecipes(Tier3Items.CorroptFragment, new ItemStack(Tier1Items.BananaArmorCore), 0F);
public static void Init() {
	 new IngotizerRecipes().addRecipe(new ItemStack(Tier3Items.CorroptFragment), new ItemStack(Tier1Items.BananaArmorCore), 0F);;
	}
}