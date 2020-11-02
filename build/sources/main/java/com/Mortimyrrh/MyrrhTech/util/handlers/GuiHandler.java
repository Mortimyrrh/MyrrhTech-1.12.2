package com.Mortimyrrh.MyrrhTech.util.handlers;

import com.Mortimyrrh.MyrrhTech.blocks.machines.SandstoneFurnace.ContainerSandstoneFurnace;
import com.Mortimyrrh.MyrrhTech.blocks.machines.SandstoneFurnace.GuiSanstoneFurnace;
import com.Mortimyrrh.MyrrhTech.blocks.machines.SandstoneFurnace.TileEntitySandstoneFurnace;
import com.Mortimyrrh.MyrrhTech.util.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler 
{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == Reference.GUI_SANDSTONE_FURNACE) return new ContainerSandstoneFurnace(player.inventory, (TileEntitySandstoneFurnace)world.getTileEntity(new BlockPos(x, y, z)));
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == Reference.GUI_SANDSTONE_FURNACE) return new GuiSanstoneFurnace(player.inventory, (TileEntitySandstoneFurnace)world.getTileEntity(new BlockPos(x, y, z)));
		return null;
	}

}
