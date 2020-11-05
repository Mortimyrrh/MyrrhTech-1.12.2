package com.Mortimyrrh.MyrrhTech.Items.tools;

import com.Mortimyrrh.MyrrhTech.Main;
import com.Mortimyrrh.MyrrhTech.Init.ModItems;
import com.Mortimyrrh.MyrrhTech.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel {
	
	public ToolSword(String name, ToolMaterial material) 
	{
		super(material);
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
