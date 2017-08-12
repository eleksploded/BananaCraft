package com.pikachu923.bananacraft.armor;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ArmorInit {
	public static ArmorMaterial ReinBananaArmor = EnumHelper.addArmorMaterial("ReinBananaArmor", "ReinBananaArmor", 38, new int[] {3, 7, 5, 3}, 11, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.5F);
	public static ArmorMaterial AwakenedBananaArmor = EnumHelper.addArmorMaterial("AwakenedBananaArmor","AwakenedBananaArmor", 39, new int[] {5, 10, 8, 5}, 22, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3F);
	public static ArmorMaterial CorruptArmor = EnumHelper.addArmorMaterial("CorruptArmor", "CorruptArmor", 40, new int[] {7, 13, 11, 7}, 33, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4F);
	
	//Tier 1
	public static Item BananaHelmet;
	public static Item BananaChestplate;
	public static Item BananaLeggings;
	public static Item BananaBoots;
	//Tier 2
	public static Item AwakenedBananaHelmet;
	public static Item AwakenedBananaChestplate;
	public static Item AwakenedBananaLeggings;
	public static Item AwakenedBananaBoots;
	//Tier3
	public static Item CorruptHelmet;
	public static Item CorruptChestplate;
	public static Item CorruptLeggings;
	public static Item CorruptBoots;

	public static void init() {
		//Tier 1
		GameRegistry.register(BananaHelmet = new BananaArmor("BananaHelmet", ReinBananaArmor, "ReinBananaArmor", EntityEquipmentSlot.HEAD)); //0 for helmet
		GameRegistry.register(BananaChestplate = new BananaArmor("BananaChestplate", ReinBananaArmor, "ReinBananaArmor", EntityEquipmentSlot.CHEST)); // 1 for chestplate
		GameRegistry.register(BananaLeggings = new BananaArmor("BananaLeggings", ReinBananaArmor, "ReinBananaArmor", EntityEquipmentSlot.LEGS)); // 2 for leggings
		GameRegistry.register(BananaBoots = new BananaArmor("BananaBoots", ReinBananaArmor, "ReinBananaArmor",  EntityEquipmentSlot.FEET)); // 3 for boots
		//Tier 2
		GameRegistry.register(AwakenedBananaHelmet = new AwakenedArmor("AwakenedBananaHelmet", AwakenedBananaArmor, "AwakenedBananaArmor", EntityEquipmentSlot.HEAD));
		GameRegistry.register(AwakenedBananaChestplate = new AwakenedArmor("AwakenedBananaChestplate", AwakenedBananaArmor, "AwakenedBananaArmor", EntityEquipmentSlot.CHEST));
		GameRegistry.register(AwakenedBananaLeggings = new AwakenedArmor("AwakenedBananaLeggings", AwakenedBananaArmor, "AwakenedBananaArmor", EntityEquipmentSlot.LEGS));
		GameRegistry.register(AwakenedBananaBoots = new AwakenedArmor("AwakenedBananaBoots", AwakenedBananaArmor, "AwakenedBananaArmor", EntityEquipmentSlot.FEET));
		//Tier 3
		//GameRegistry.registerItem(CorruptHelmet = new CorruptArmor("CorruptHelmet", CorruptArmor, "CorruptArmor", 0), "CorruptHelmet");
		//GameRegistry.registerItem(CorruptChestplate = new CorruptArmor("CorruptChestplate", CorruptArmor, "CorruptArmor", 1), "CorruptChestplate");
		//GameRegistry.registerItem(CorruptHelmet = new CorruptArmor("CorruptLeggings", CorruptArmor, "CorruptArmor", 2), "CorruptLeggings");
		//GameRegistry.registerItem(CorruptHelmet = new CorruptArmor("CorruptBoots", CorruptArmor, "CorruptArmor", 3), "CorruptBoots");
	}
}
