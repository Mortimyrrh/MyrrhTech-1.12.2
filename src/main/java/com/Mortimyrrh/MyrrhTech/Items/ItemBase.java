package com.Mortimyrrh.MyrrhTech.Items;

import com.Mortimyrrh.MyrrhTech.Main;
import com.Mortimyrrh.MyrrhTech.Init.ModItems;
import com.Mortimyrrh.MyrrhTech.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel 
{

	public ItemBase(String name) 
	{
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
