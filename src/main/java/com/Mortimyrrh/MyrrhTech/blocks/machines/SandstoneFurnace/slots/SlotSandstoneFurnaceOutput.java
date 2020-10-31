package com.Mortimyrrh.MyrrhTech.blocks.machines.SandstoneFurnace.slots;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class SlotSandstoneFurnaceOutput extends SlotItemHandler {

	private EntityPlayer player; //was final
	private int removeCount;
	
	public SlotSandstoneFurnaceOutput(EntityPlayer player, IItemHandler itemHandler, int index, int xPosition, int yPosition) {
		super(itemHandler, index, xPosition, yPosition);
	}

	@Override
	public boolean isItemValid(ItemStack stack) {
		return false;
	}
	
	@Override
	public ItemStack onTake(EntityPlayer thePlayer, ItemStack stack) 
	{
		this.onCrafting(stack);
		super.onTake(thePlayer, stack);
		return stack;
	}
	
	@Override
	public ItemStack decrStackSize(int amount) {
	
		if(this.getHasStack()) this.removeCount += Math.min(amount, this.getStack().getCount());
		return super.decrStackSize(amount);
	}
	
	@Override
	public void onSlotChanged() {
		super.onSlotChanged();
	}
}
