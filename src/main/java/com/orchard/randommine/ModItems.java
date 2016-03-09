package com.orchard.randommine;

//This is where you render items.
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.common.registry.GameRegistry;
import com.orchard.randommine.items.*;
import com.orchard.randommine.armor.*;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	//public static(Item Name) item(Item Name);
	public static Item itemChocolate;
	public static ItemBedrockBreak BedrockBreak;
	public static Item itemChoclatePie;
	public static Item itemHamburger;
	public static Item itemBaconBurger;
	public static Item itemHotDog;
	public static Item itemPickle;
	public static ToolMaterial pic;

	
	
	public static void preInitCommon() {
	
			//This is where you add your tool material types.
			
			// This is the format: Replace "MyMaterial" With the name of your Material.
			//Replace 1 with the level of hardness. (3 is diamond)
				//Replace 2 with the durability level (1561 is diamond)
				//Replace 3.0F with the mining speed (8.0F is diamond)
				//Replace 4.0F with the damage value (3.0F is diamond tool)
				//Replace the 5 with the enchantibility level of the tool (diamond is 10)
				ToolMaterial MyMaterial = EnumHelper.addToolMaterial("MyMaterial", 1, 2, 3.0F, 4.0F, 5);
	
	
	
	
	
	
	
	
	 //item(Item Name)= (Item Name) new Item(Item Name)().setUnlocalizedName("item(Item Name)");
	 //GameRegistry.registerItem(item(Item Name), "item(Item Name)");
		
		
		
		
	 itemChocolate= (BaseFood) new BaseFood("Chocolate", 	1, 1F, false,64, new PotionEffect(Potion.moveSpeed.id, 150, 0)).setCreativeTab(RandomMine.tab);
		 GameRegistry.registerItem(itemChocolate, "itemChocolate");
		 
		 BedrockBreak= (ItemBedrockBreak) new ItemBedrockBreak().setUnlocalizedName("itemBedrockBreak").setCreativeTab(RandomMine.tab);
		 GameRegistry.registerItem(BedrockBreak, "itemBedrockBreak");
		 itemChoclatePie= (BaseFood) new BaseFood("ChocolatePie", 5, 2F, true,64).setCreativeTab(RandomMine.tab);
		 GameRegistry.registerItem(itemChoclatePie, "itemChoclatePie");
		 
		 itemHamburger= (BaseFood) new BaseFood("Hamburger", 	10, 10F, true,64, new PotionEffect(Potion.invisibility.id, 150, 0)).setCreativeTab(RandomMine.tab);
		 GameRegistry.registerItem(itemHamburger, "Hamburger");
		 
		 itemBaconBurger= (BaseFood) new BaseFood("The Bacon Burger!", 	20, 20F, true,64, new PotionEffect(Potion.regeneration.id, 150, 0)).setCreativeTab(RandomMine.tab);
		 GameRegistry.registerItem(itemBaconBurger, "The Bacon Burger");
		 
		 GameRegistry.registerItem( new ItemModPickaxe("ItemModPickaxe", MyMaterial), "ItemModPickaxe");
		 
		GameRegistry.registerItem(PurpleArmor.helmet, "PurpleArmor_helmet");
		GameRegistry.registerItem(PurpleArmor.body, "PurpleArmor_body");
		GameRegistry.registerItem(PurpleArmor.legs, "PurpleArmor_leggins");
		GameRegistry.registerItem(PurpleArmor.boots, "PurpleArmor_boots");
				GameRegistry.registerItem(Minion_Armor.helmet, "Minion_Armor_head");
		GameRegistry.registerItem(Minion_Armor.body, "Minion_Armor_body");
		GameRegistry.registerItem(Minion_Armor.legs, "Minion_Armor_leggins");
		GameRegistry.registerItem(Minion_Armor.boots, "Minion_Armor_boots");
		GameRegistry.registerItem(Techno_Armor.helmet, "Techno_Armor_head");
		GameRegistry.registerItem(Techno_Armor.body, "Techno_Armor_body");
		GameRegistry.registerItem(Techno_Armor.legs, "Techno_Armor_leggins");
		GameRegistry.registerItem(Techno_Armor.boots, "Techno_Armor_boots");
		GameRegistry.registerItem(DirtArmor.helmet, "DirtArmor_head");
		GameRegistry.registerItem(DirtArmor.body, "DirtArmor_body");
		GameRegistry.registerItem(DirtArmor.legs, "DirtArmor_leggins");
		GameRegistry.registerItem(DirtArmor.boots, "DirtArmor_boots");
		GameRegistry.registerItem(EmeraldArmor.helmet, "EmeraldArmor_head");
		GameRegistry.registerItem(EmeraldArmor.body, "EmeraldArmor_body");
		GameRegistry.registerItem(EmeraldArmor.legs, "EmeraldArmor_leggins");
		GameRegistry.registerItem(EmeraldArmor.boots, "EmeraldArmor_boots");
		GameRegistry.registerItem(KnightArmor.helmet, "KnightArmor_head");
		GameRegistry.registerItem(KnightArmor.body, "KnightArmor_body");
		GameRegistry.registerItem(KnightArmor.legs, "KnightArmor_leggins");
		GameRegistry.registerItem(KnightArmor.boots, "KnightArmor_boots");
	 itemHotDog= (BaseFood) new BaseFood("Hot Dog", 20, 20F, false,64, new PotionEffect(Potion.moveSpeed.id, 150, 0)).setCreativeTab(RandomMine.tab);
	 GameRegistry.registerItem(itemHotDog, "itemHotDog");
	 itemPickle= (BaseFood) new BaseFood("Pickle", 20, 20F, true,64, new PotionEffect(Potion.moveSpeed.id, 150, 0)).setCreativeTab(RandomMine.tab);
	 GameRegistry.registerItem(itemPickle, "itemPickle");
	 }}
