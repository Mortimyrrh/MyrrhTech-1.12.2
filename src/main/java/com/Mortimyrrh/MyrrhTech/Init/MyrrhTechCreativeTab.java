package com.Mortimyrrh.MyrrhTech.Init;

import com.Mortimyrrh.MyrrhTech.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MyrrhTechCreativeTab extends CreativeTabs 
{
	public MyrrhTechCreativeTab() 
	{
		super(Reference.MOD_ID);
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Item.getItemFromBlock(ModBlocks.BLASTING_CHAMBER));
	}
}
