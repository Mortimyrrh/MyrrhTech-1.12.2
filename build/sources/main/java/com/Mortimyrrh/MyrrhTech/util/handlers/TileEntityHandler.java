package com.Mortimyrrh.MyrrhTech.util.handlers;

import com.Mortimyrrh.MyrrhTech.blocks.machines.SandstoneFurnace.TileEntitySandstoneFurnace;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler {
	public static void registerTileEntities() 
	{
		GameRegistry.registerTileEntity(TileEntitySandstoneFurnace.class, "sandstone_furnace");
	}
}
