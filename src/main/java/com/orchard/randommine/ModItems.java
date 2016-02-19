package com.orchard.randommine;

//This is where you render items.
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.common.registry.GameRegistry;
import com.orchard.randommine.items.*;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	//public static(Item Name) item(Item Name);
	public static Item itemChocolate;
	public static ItemBedrockBreak BedrockBreak;
	public static Item itemHamburger;
	public static Item itemBaconBurger;
	public static Item ItemModPickaxe;
	
	
	
	//This is where you add your tool material types.
	
		// This is the format: Replace "MyMaterial" With the name of your Material.
		//Replace 1 with the level of hardness. (3 is diamond)
		//Replace 2 with the durability level (1561 is diamond)
		//Replace 3.0F with the mining speed (8.0F is diamond)
		//Replace 4.0F with the damage value (3.0F is diamond tool)
		//Replace the 5 with the enchantibility level of the tool (diamond is 10)
		public static ToolMaterial MyMaterial = EnumHelper.addToolMaterial("MyMaterial", 1, 2, 3.0F, 4.0F, 5);
	
	
		
	
	public static void preInitCommon() {
	 //item(Item Name)= (Item Name) new Item(Item Name)().setUnlocalizedName("item(Item Name)");
	 //GameRegistry.registerItem(item(Item Name), "item(Item Name)");
		
		
	 itemChocolate= (BaseFood) new BaseFood("Chocolate", 	1, 1F, false,64, new PotionEffect(Potion.moveSpeed.id, 150, 0)).setCreativeTab(RandomMine.tab);
		 GameRegistry.registerItem(itemChocolate, "itemChocolate");
		 
		 BedrockBreak= (ItemBedrockBreak) new ItemBedrockBreak().setUnlocalizedName("itemBedrockBreak").setCreativeTab(RandomMine.tab);
		 GameRegistry.registerItem(BedrockBreak, "itemBedrockBreak");
		 
		 itemHamburger= (BaseFood) new BaseFood("Hamburger", 	10, 10F, true,64, new PotionEffect(Potion.invisibility.id, 150, 0)).setCreativeTab(RandomMine.tab);
		 GameRegistry.registerItem(itemHamburger, "Hamburger");
		 
		 itemBaconBurger= (BaseFood) new BaseFood("The Bacon Burger!", 	20, 20F, true,64, new PotionEffect(Potion.regeneration.id, 150, 0)).setCreativeTab(RandomMine.tab);
		 GameRegistry.registerItem(itemBaconBurger, "The Bacon Burger!");
		 
		 GameRegistry.registerItem(ItemModPickaxe = new ItemModPickaxe("ItemModPickaxe", MyMaterial), "ItemModPickaxe");
		 
		 
	}

}