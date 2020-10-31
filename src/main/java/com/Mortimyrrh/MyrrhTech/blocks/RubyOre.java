package com.Mortimyrrh.MyrrhTech.blocks;

import java.util.Random;

import com.Mortimyrrh.MyrrhTech.Init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class RubyOre extends BlockBase {

	public RubyOre(String name, Material material) {
		super(name, material);
		
		// running over the block sound
		setSoundType(SoundType.METAL);
		
		// how long to break
		setHardness(5.0F);
		
		// how likly it is to break tnt number
		setResistance(15.0F);
		
		// mining level and tool
		setHarvestLevel("pickaxe", 2);
		
		// light level?
		setLightLevel(0.5F);
		
		// is it transparet
		//setLightOpacity(1);
		
		// stops block from being broken (bedrock) 
		//setBlockUnbreakable();
	}
	
	//custom drop like redstone
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.RUBY;
		
	}
	
	@Override
	public int quantityDropped(Random rand) {
		return rand.nextInt(4) + 1;
	}
}
