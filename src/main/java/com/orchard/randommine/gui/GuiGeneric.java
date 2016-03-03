package com.orchard.randommine.gui;

import java.awt.Color;

import com.orchard.randommine.container.ContainerGeneric;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiGeneric extends GuiContainer
{
	private static final ResourceLocation texture = new ResourceLocation("randommine", "textures/gui/GenericGui.png");
	
	public GuiGeneric(InventoryPlayer invPlayer) {
		super(new ContainerGeneric(invPlayer));
		xSize = 176;
		ySize = 133;
	}

	//Draws the gui image
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) 
	{
		
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
	}
	
	//Draws the text at the top
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) 
	{
		fontRendererObj.drawString(I18n.format("tile.GuiGeneric.name", new Object[0]), 60, 5, Color.darkGray.getRGB());
	}
}
