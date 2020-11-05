package com.Mortimyrrh.MyrrhTech.Init;

import java.util.ArrayList;
import java.util.List;

import com.Mortimyrrh.MyrrhTech.blocks.BlockBase;
import com.Mortimyrrh.MyrrhTech.blocks.RossBlock;
import com.Mortimyrrh.MyrrhTech.blocks.RubyBlock;
import com.Mortimyrrh.MyrrhTech.blocks.RubyOre;
import com.Mortimyrrh.MyrrhTech.blocks.machines.BlastingChamber.BlastingChamber;
import com.Mortimyrrh.MyrrhTech.blocks.machines.SandstoneFurnace.SandstoneFurnace;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List <Block> BLOCKS = new ArrayList<Block>();
	
	// Blocks
	public static final Block RUBY_BLOCK 			= new RubyBlock("ruby_block", 	Material.IRON);
	public static final Block RUBY_ORE 				= new RubyOre("ruby_ore", 		Material.ROCK);
	public static final Block ROSS_BLOCK 			= new RossBlock("ross_block", 	Material.ROCK);

	public static final Block SANDSTONE_FURNACE 	= new SandstoneFurnace("sandstone_furnace");
	public static final Block BLASTING_CHAMBER 		= new BlastingChamber("blasting_chamber");
	
}
