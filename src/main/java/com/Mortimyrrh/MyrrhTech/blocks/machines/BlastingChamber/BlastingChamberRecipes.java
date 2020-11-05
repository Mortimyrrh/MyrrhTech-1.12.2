package com.Mortimyrrh.MyrrhTech.blocks.machines.BlastingChamber;

import java.util.Map;
import java.util.Map.Entry;

import com.Mortimyrrh.MyrrhTech.Init.ModBlocks;
import com.Mortimyrrh.MyrrhTech.blocks.machines.SandstoneFurnace.SandstoneFurnaceRecipes;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class BlastingChamberRecipes 
{
	private static final BlastingChamberRecipes INSTANCE = new BlastingChamberRecipes();
	private final Table<ItemStack, ItemStack, ItemStack> smeltingList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
	private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();
	
	public static BlastingChamberRecipes getInstance()
	{
		return INSTANCE;
	}
	
	private BlastingChamberRecipes() 
	{
		//addBlastingRecipe(new ItemStack(Blocks.COBBLESTONE), new ItemStack(Blocks.COBBLESTONE), new ItemStack(ModBlocks.ROSS_BLOCK), 1.0F);
		addBlastingRecipe(new ItemStack(Blocks.SAND), new ItemStack(Blocks.MOSSY_COBBLESTONE), new ItemStack(Blocks.COBBLESTONE), 1.0F);

	}

	
	public void addBlastingRecipe(ItemStack input1, ItemStack input2, ItemStack result, float experience) 
	{
		if(getBlastingResult(input1, input2) != ItemStack.EMPTY) return;
		this.smeltingList.put(input1, input2, result);
		this.experienceList.put(result, Float.valueOf(experience));
	}
	
	public ItemStack getBlastingResult(ItemStack input1, ItemStack input2) 
	{
		for(Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.smeltingList.columnMap().entrySet()) 
		{
			if(this.compareItemStacks(input1, (ItemStack)entry.getKey())) 
			{
				for(Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet()) 
				{
					if(this.compareItemStacks(input2, (ItemStack)ent.getKey())) 
					{
						return (ItemStack)ent.getValue();
					}
				}
			}
		}
		return ItemStack.EMPTY;
	}
	
	private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
	{
		return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
	}
	
	public Table<ItemStack, ItemStack, ItemStack> getDualSmeltingList() 
	{
		return this.smeltingList;
	}
	
	public float getBlastingExperience(ItemStack stack)
	{
		for (Entry<ItemStack, Float> entry : this.experienceList.entrySet()) 
		{
			if(this.compareItemStacks(stack, (ItemStack)entry.getKey())) 
			{
				return ((Float)entry.getValue()).floatValue();
			}
		}
		return 0.0F;
	}
}