package com.Mortimyrrh.MyrrhTech.Init;

import java.util.ArrayList;
import java.util.List;

import com.Mortimyrrh.MyrrhTech.blocks.BlockBase;
import com.Mortimyrrh.MyrrhTech.blocks.RubyBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List <Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON);
	
}
