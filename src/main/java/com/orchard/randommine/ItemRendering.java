package com.orchard.randommine;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemRendering {
	private static void registerItemRendering(String name)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(GameRegistry.findItem(RandomMine.MODID, name), 0, new ModelResourceLocation(RandomMine.MODID+":" + name, "inventory"));

	}
	public static void start()
	{
	//This is where you render items that are entities on the ground.	
	//example: "registerItemRendering("MyBlockName");
	registerItemRendering("blockChoclate");
	registerItemRendering("itemChoclatePie");
	registerItemRendering("itemChocolate");
	registerItemRendering("blockX");
	registerItemRendering("blockSwordintheStone");
	registerItemRendering("itemDimondfood");
	registerItemRendering("BlockControlPanel");
	registerItemRendering("itemBedrockBreak");
	//registerItemRendering("BlockBraker");
	registerItemRendering("blockHotDog");
	registerItemRendering("itemPickle");
	registerItemRendering("itemHamburger");
	registerItemRendering("itemBaconBurger");
//github.com/ORCHARD-Minecraft-Mod-Class/mod-repo-test.git
	}
}
