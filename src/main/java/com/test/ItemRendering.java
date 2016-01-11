package com.test;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import com.test.Test;

public class ItemRendering {
	private static void registerItemRendering(String name)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(GameRegistry.findItem(Test.MODID, name), 0, new ModelResourceLocation("test:" + name, "inventory"));

	}
	public static void start()
	{
	//This is where you render items that are entities on the ground.	
	//example: "registerItemRendering("MyBlockName");
	registerItemRendering("blockChoclate");
	registerItemRendering("itemChocolate");
	registerItemRendering("blockX");

	registerItemRendering("itemBedrockBreak");
//github.com/ORCHARD-Minecraft-Mod-Class/mod-repo-test.git
	}
}
