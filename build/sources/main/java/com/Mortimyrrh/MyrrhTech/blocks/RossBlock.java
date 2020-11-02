package com.Mortimyrrh.MyrrhTech.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RossBlock extends BlockBase {
	public RossBlock(String name, Material material) 
	{
		super(name, material);
		
		// running over the block sound
		setSoundType(SoundType.STONE);
		
		// how long to break
		setHardness(2.0F);
		
		// how likly it is to break tnt number
		setResistance(15.0F);
		
		// mining level and tool
		setHarvestLevel("pickaxe", 2);
		
		// light level?
		//setLightLevel(1.0);
		
		// is it transparet
		//setLightOpacity(1);
		
		// stops block from being broken (bedrock) 
		//setBlockUnbreakable();
	}
}


