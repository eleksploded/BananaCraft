/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.common.registry.GameRegistry
 *  net.minecraft.item.Item
 *  net.minecraft.item.Item$ToolMaterial
 *  net.minecraft.item.ItemPickaxe
 *  net.minecraft.item.ItemSword
 *  net.minecraftforge.common.util.EnumHelper
 */
package com.pikachu923.BananaCraft.init;

import com.pikachu923.BananaCraft.items.AwakenedAxe;
import com.pikachu923.BananaCraft.items.AwakenedHoe;
import com.pikachu923.BananaCraft.items.AwakenedPickaxe;
import com.pikachu923.BananaCraft.items.AwakenedShovel;
import com.pikachu923.BananaCraft.items.AwakenedSword;
import com.pikachu923.BananaCraft.items.BananaGun;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class Tier2Tools {
    public static Item.ToolMaterial AwakenedBanana = EnumHelper.addToolMaterial("AwakenedBanana", 4, 2222, 10.0F, 5, 15);
    public static ItemSword AwakenedSword = new AwakenedSword("AwakenedSword");
    public static ItemPickaxe AwakenedPickaxe = new AwakenedPickaxe("AwakenedPickaxe");
    public static ItemAxe AwakenedAxe = new AwakenedAxe("AwakenedAxe");
    public static ItemSpade AwakenedShovel = new AwakenedShovel("AwakenedShovel");
    public static ItemHoe AwakenedHoe = new AwakenedHoe("AwakenedHoe");
    public static final ItemBow BananaGun = new BananaGun("BananaGun");

    public static void Init() {
        GameRegistry.registerItem((Item)AwakenedSword, (String)"AwakenedSword");
        GameRegistry.registerItem((Item)AwakenedPickaxe, (String)"AwakenedPickaxe");
        GameRegistry.registerItem(AwakenedAxe, "AwakenedAxe");
        GameRegistry.registerItem(AwakenedShovel, "AwakenedShovel");
        GameRegistry.registerItem(AwakenedHoe, "AwakenedHoe");
        GameRegistry.registerItem(BananaGun, "BananaGun");
    }
}

