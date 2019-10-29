package com.Mortimyrrh.MyrrhTech.Init;

import java.util.ArrayList;
import java.util.List;

import com.Mortimyrrh.MyrrhTech.Items.ItemBase;
import com.Mortimyrrh.MyrrhTech.Items.tools.ToolAxe;
import com.Mortimyrrh.MyrrhTech.Items.tools.ToolHoe;
import com.Mortimyrrh.MyrrhTech.Items.tools.ToolPickaxe;
import com.Mortimyrrh.MyrrhTech.Items.tools.ToolSpade;
import com.Mortimyrrh.MyrrhTech.Items.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
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
	
	// Items
	public static final Item RUBY = new ItemBase("ruby");
	
	// Tools
	public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword", MATERIAL_RUBY);
	public static final ItemSpade RUBY_SHOVEL = new ToolSpade("ruby_shovel", MATERIAL_RUBY);
	public static final ItemPickaxe RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", MATERIAL_RUBY);
	public static final ItemAxe RUBY_AXE = new ToolAxe("ruby_Axe", MATERIAL_RUBY);
	public static final ItemHoe RUBY_HOE = new ToolHoe("ruby_Hoe", MATERIAL_RUBY);
}