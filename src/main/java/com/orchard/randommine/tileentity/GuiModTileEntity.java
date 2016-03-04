package com.orchard.randommine.tileentity;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.IInventory;
import com.orchard.randommine.gui.*;
import com.orchard.randommine.tileentity.ModTileEntity;

public class GuiModTileEntity extends GuiContainer {

    public GuiModTileEntity(IInventory playerInv, ModTileEntity te) {
        super(new BasicGui(playerInv, te));

        this.xSize = 176;
        this.ySize = 166;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
    }
}