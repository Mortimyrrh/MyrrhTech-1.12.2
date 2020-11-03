package com.Mortimyrrh.MyrrhTech.Init;

import java.util.ArrayList;
import java.util.List;

import com.Mortimyrrh.MyrrhTech.Items.ItemBase;
import com.Mortimyrrh.MyrrhTech.Items.armor.ArmorBase;
import com.Mortimyrrh.MyrrhTech.Items.tools.ToolAxe;
import com.Mortimyrrh.MyrrhTech.Items.tools.ToolHoe;
import com.Mortimyrrh.MyrrhTech.Items.tools.ToolPickaxe;
import com.Mortimyrrh.MyrrhTech.Items.tools.ToolSpade;
import com.Mortimyrrh.MyrrhTech.Items.tools.ToolSword;
import com.Mortimyrrh.MyrrhTech.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	// Materials
	public static final ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 3, 1561, 8.0F, 3.0F, 10);
	public static final ArmorMaterial ARMOR_MATERIAL_RUBY = EnumHelper.addArmorMaterial("armor_material_ruby", Reference.MOD_ID + ":ruby", 14, 
			new int[] {2,5,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
			//boots chest leg hat
	
	public static final ArmorMaterial ARMOR_MATERIAL_SHULKEMET = EnumHelper.addArmorMaterial("armor_material_shulkemet", Reference.MOD_ID + ":shulkemet", 14, 
			new int[] {2,5,6,4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
			//boots chest leg hat
	
	// Items
	public static final Item RUBY 					= new ItemBase("ruby");
	
	// Tools
	public static final ItemSword RUBY_SWORD 		= new ToolSword("ruby_sword", MATERIAL_RUBY);
	public static final ItemSpade RUBY_SHOVEL 		= new ToolSpade("ruby_shovel", MATERIAL_RUBY);
	public static final ItemPickaxe RUBY_PICKAXE 	= new ToolPickaxe("ruby_pickaxe", MATERIAL_RUBY);
	public static final ItemAxe RUBY_AXE 			= new ToolAxe("ruby_Axe", MATERIAL_RUBY);
	public static final ItemHoe RUBY_HOE 			= new ToolHoe("ruby_Hoe", MATERIAL_RUBY);
	
	// Armor
	public static final Item RUBY_HELMET 			= new ArmorBase("ruby_helmet", 		ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.HEAD);
	public static final Item RUBY_CHESTPLATE 		= new ArmorBase("ruby_chestplate", 	ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.CHEST);
	public static final Item RUBY_LEGGINGS 			= new ArmorBase("ruby_leggings", 	ARMOR_MATERIAL_RUBY, 2, EntityEquipmentSlot.LEGS);
	public static final Item RUBY_BOOTS 			= new ArmorBase("ruby_boots", 		ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.FEET);
	
	public static final Item SHULKEMET 				= new ArmorBase("shulkemet", 		ARMOR_MATERIAL_SHULKEMET, 1, EntityEquipmentSlot.HEAD);

}