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
		registerItemRendering("Sword in the Stone");
		registerItemRendering("itemDimondfood");
		registerItemRendering("Control Panel");
		registerItemRendering("itemBedrockBreak");
		//registerItemRendering("BlockBraker");
		registerItemRendering("itemHotDog");
		registerItemRendering("itemPickle");
		registerItemRendering("Hamburger");
		registerItemRendering("The Bacon Burger");
		registerItemRendering("PurpleArmor_leggins");
		registerItemRendering("PurpleArmor_boots");
		registerItemRendering("PurpleArmor_body");
		registerItemRendering("PurpleArmor_helmet");
		registerItemRendering("BlockFaceSilly");
		registerItemRendering("BlockMustyApple");
		registerItemRendering("ItemModPickaxe");
	registerItemRendering("DirtArmor_leggins");
	registerItemRendering("DirtArmor_boots");
	registerItemRendering("DirtArmor_body");
	registerItemRendering("DirtArmor_head");
	registerItemRendering("EmeraldArmor_leggins");
	registerItemRendering("EmeraldArmor_boots");
	registerItemRendering("EmeraldArmor_body");
	registerItemRendering("EmeraldArmor_head");
	registerItemRendering("Minion_Armor_leggins");
	registerItemRendering("Minion_Armor_boots");
	registerItemRendering("Minion_Armor_body");
	registerItemRendering("Minion_Armor_head");
	registerItemRendering("Techno_Armor_leggins");
	registerItemRendering("Techno_Armor_boots");
	registerItemRendering("Techno_Armor_body");
	registerItemRendering("Techno_Armor_head");
	registerItemRendering("KnightArmor_head");
	registerItemRendering("KnightArmor_body");
	registerItemRendering("KnightArmor_leggins");
	registerItemRendering("KnightArmor_boots");
		registerItemRendering("spelunkycape_head");
	registerItemRendering("spelunkycape_leggins");
	registerItemRendering("spelunkycape_boots");
	registerItemRendering("spelunkycape_body");
	registerItemRendering("spelunkycape_head");
	}
}
