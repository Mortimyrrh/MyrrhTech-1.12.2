package com.Mortimyrrh.MyrrhTech.blocks.machines.SandstoneFurnace.slots;

import com.Mortimyrrh.MyrrhTech.blocks.machines.SandstoneFurnace.TileEntitySandstoneFurnace;

import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class SlotSandstoneFurnaceFuel extends SlotItemHandler 
{

	public SlotSandstoneFurnaceFuel(IItemHandler itemHandler, int index, int xPosition, int yPosition) {
		super(itemHandler, index, xPosition, yPosition);
	}
	
	@Override
	public boolean isItemValid(ItemStack stack) {
		return TileEntitySandstoneFurnace.isItemFuel(stack);
	}
	
	@Override
	public int getItemStackLimit(ItemStack stack) {
		return super.getItemStackLimit(stack);
	}
	
	@Override
	public void onSlotChanged() {
		super.onSlotChanged();
	}
}
