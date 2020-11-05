package com.Mortimyrrh.MyrrhTech.Items.tools;

import com.Mortimyrrh.MyrrhTech.Main;
import com.Mortimyrrh.MyrrhTech.Init.ModItems;
import com.Mortimyrrh.MyrrhTech.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe implements IHasModel {

	public ToolAxe(String name, ToolMaterial material) 
	{
		super(material, 6.0F, -3.2F); //damage, speed
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.MYRRHTECH_TAB);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
