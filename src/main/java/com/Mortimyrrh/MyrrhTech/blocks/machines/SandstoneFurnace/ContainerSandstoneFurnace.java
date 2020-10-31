package com.Mortimyrrh.MyrrhTech.blocks.machines.SandstoneFurnace;

import com.Mortimyrrh.MyrrhTech.blocks.machines.SandstoneFurnace.slots.SlotSandstoneFurnaceFuel;
import com.Mortimyrrh.MyrrhTech.blocks.machines.SandstoneFurnace.slots.SlotSandstoneFurnaceOutput;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IContainerListener;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class ContainerSandstoneFurnace extends Container
{
	private final TileEntitySandstoneFurnace tileentity;
	private int cookTime, totalCookTime, burnTime, currentBurnTime;
	
	public ContainerSandstoneFurnace(InventoryPlayer player, TileEntitySandstoneFurnace tileentity) 
	{
		this.tileentity = tileentity;
		IItemHandler handler = tileentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);
		
		this.addSlotToContainer(new SlotItemHandler(handler, 0, 46, 17));
		this.addSlotToContainer(new SlotItemHandler(handler, 1, 67, 17));
		this.addSlotToContainer(new SlotSandstoneFurnaceFuel(handler, 2, 56, 53));
		this.addSlotToContainer(new SlotSandstoneFurnaceOutput(player.player, handler, 3, 116, 35)); //4 down 4 to the right
		
		for(int y = 0; y < 3; y++)
		{
			for(int x = 0; x < 9; x++)
			{
				this.addSlotToContainer(new Slot(player, x + y*9 + 9, 8 + x*18, 84 + y*18));
			}
		}
		
		for(int x = 0; x < 9; x++)
		{
			this.addSlotToContainer(new Slot(player, x, 8 + x * 18, 142));
		}
	}
	
	@Override
	public void detectAndSendChanges() 
	{
		super.detectAndSendChanges();
		
		for(int i = 0; i < this.listeners.size(); ++i) 
		{
			IContainerListener listener = (IContainerListener)this.listeners.get(i);
			
			if(this.cookTime != this.tileentity.getCookTime()) listener.sendWindowProperty(this, 2, this.tileentity.getCookTime());
			if(this.burnTime != this.tileentity.getBurnTime()) listener.sendWindowProperty(this, 0, this.tileentity.getBurnTime());
			if(this.currentBurnTime != this.tileentity.getCurrentBurnTime()) listener.sendWindowProperty(this, 1, this.tileentity.getCurrentBurnTime());
			if(this.totalCookTime != this.tileentity.getTotalCookTime()) listener.sendWindowProperty(this, 3, this.tileentity.getTotalCookTime());
		}
		
		this.cookTime = this.tileentity.getCookTime();
		this.burnTime = this.tileentity.getBurnTime();
		this.currentBurnTime = this.tileentity.getCurrentBurnTime();
		this.totalCookTime = this.tileentity.getTotalCookTime();
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void updateProgressBar(int id, int data) 
	{		
		switch(id) 
		{
		case 0:
			this.tileentity.setBurnTime(data);
			break;
		case 1:
			this.tileentity.setCurrentBurnTime(data);
			break;
		case 2:
			this.tileentity.setCookTime(data);
			break;
		case 3:
			this.tileentity.setTotalCookTime(data);
		}
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer playerIn) 
	{
		return this.tileentity.isUsableByPlayer(playerIn);
	}
	
	@Override
	public ItemStack transferStackInSlot(EntityPlayer playerIn, int index) 
	{
		ItemStack stack = ItemStack.EMPTY;
		Slot slot = (Slot)this.inventorySlots.get(index);
		
		if(slot != null && slot.getHasStack()) 
		{
			ItemStack stack1 = slot.getStack();
			stack = stack1.copy();
			
			if(index == 3) 
			{
				if(!this.mergeItemStack(stack1, 4, 40, true)) return ItemStack.EMPTY;
				slot.onSlotChange(stack1, stack);
			}
			else if(index != 2 && index != 1 && index != 0) 
			{		
				Slot slot1 = (Slot)this.inventorySlots.get(index + 1);
				
				if(!SandstoneFurnaceRecipes.getInstance().getSandstoneResult(stack1, slot1.getStack()).isEmpty())
				{
					if(!this.mergeItemStack(stack1, 0, 2, false)) 
					{
						return ItemStack.EMPTY;
					}
					else if(TileEntitySandstoneFurnace.isItemFuel(stack1))
					{
						if(!this.mergeItemStack(stack1, 2, 3, false)) return ItemStack.EMPTY;
					}
					else if(TileEntitySandstoneFurnace.isItemFuel(stack1))
					{
						if(!this.mergeItemStack(stack1, 2, 3, false)) return ItemStack.EMPTY;
					}
					else if(TileEntitySandstoneFurnace.isItemFuel(stack1))
					{
						if(!this.mergeItemStack(stack1, 2, 3, false)) return ItemStack.EMPTY;
					}
					else if(index >= 4 && index < 31)
					{
						if(!this.mergeItemStack(stack1, 31, 40, false)) return ItemStack.EMPTY;
					}
					else if(index >= 31 && index < 40 && !this.mergeItemStack(stack1, 4, 31, false))
					{
						return ItemStack.EMPTY;
					}
				}
			} 
			else if(!this.mergeItemStack(stack1, 4, 40, false)) 
			{
				return ItemStack.EMPTY;
			}
			if(stack1.isEmpty())
			{
				slot.putStack(ItemStack.EMPTY);
			}
			else
			{
				slot.onSlotChanged();

			}
			if(stack1.getCount() == stack.getCount()) return ItemStack.EMPTY;
			slot.onTake(playerIn, stack1);
		}
		return stack;
	}
}