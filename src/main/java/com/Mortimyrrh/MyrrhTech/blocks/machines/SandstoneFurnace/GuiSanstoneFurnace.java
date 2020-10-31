package com.Mortimyrrh.MyrrhTech.blocks.machines.SandstoneFurnace;


import com.Mortimyrrh.MyrrhTech.util.Reference;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiSanstoneFurnace extends GuiContainer
{
	private static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/gui/sandstone_furnace.png");
	private final InventoryPlayer player;
	private final TileEntitySandstoneFurnace tileentity;
	
	public GuiSanstoneFurnace(InventoryPlayer player, TileEntitySandstoneFurnace tileentity) 
	{
		super(new ContainerSandstoneFurnace(player, tileentity));
		this.player = player;
		this.tileentity = tileentity;
	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) 
	{
		//draw text labels
		String tileName = this.tileentity.getDisplayName().getUnformattedText();
		this.fontRenderer.drawString(tileName, (this.xSize / 2 - this.fontRenderer.getStringWidth(tileName) / 2) + 3, 6, 4210752);
		this.fontRenderer.drawString(this.player.getDisplayName().getUnformattedText(), 122, this.ySize - 96 + 2, 4210752);
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
	{
		GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
		this.mc.getTextureManager().bindTexture(TEXTURES);
		this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
		
		if(TileEntitySandstoneFurnace.isBurning(tileentity))
		{
			int k = this.getBurnLeftScaled(13);
			this.drawTexturedModalRect(this.guiLeft + 57, this.guiTop + 37 + 12 - k, 176, 12 - k, 14, k + 0);
		}
		
		int l = this.getCookProgressScaled(24);
		this.drawTexturedModalRect(this.guiLeft + 79, this.guiTop + 35, 176, 14, l + 1, 16); //41 20
	}
	
	private int getBurnLeftScaled(int pixels)
	{
		int i = this.tileentity.getCurrentBurnTime();
		if(i == 0) i = 200;
		return this.tileentity.getBurnTime() * pixels / i;
	}
	
	private int getCookProgressScaled(int pixels)
	{
		int i = this.tileentity.getCookTime();
		int j = this.tileentity.getTotalCookTime();
		return j != 0 && i != 0 ? i * pixels / j : 0;
	}
}