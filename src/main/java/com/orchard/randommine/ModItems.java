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
	public static Item itemChoclatePie;
	public static void preInitCommon() {
	 //item(Item Name)= (Item Name) new Item(Item Name)().setUnlocalizedName("item(Item Name)");
	 //GameRegistry.registerItem(item(Item Name), "item(Item Name)");
		 itemChocolate= (BaseFood) new BaseFood("Chocolate", 1, 1F, false,64).setCreativeTab(RandomMine.tab);
		 GameRegistry.registerItem(itemChocolate, "itemChocolate");
		 
		 BedrockBreak= (ItemBedrockBreak) new ItemBedrockBreak().setUnlocalizedName("itemBedrockBreak").setCreativeTab(RandomMine.tab);
		 GameRegistry.registerItem(BedrockBreak, "itemBedrockBreak");
		 itemChoclatePie= (BaseFood) new BaseFood("ChocolatePie", 5, 2F, true,64).setCreativeTab(RandomMine.tab);
		 GameRegistry.registerItem(itemChoclatePie, "itemChoclatePie");
		 
		 itemHamburger= (BaseFood) new BaseFood("Hamburger", 	10, 10F, true,64, new PotionEffect(Potion.invisibility.id, 150, 0)).setCreativeTab(RandomMine.tab);
		 GameRegistry.registerItem(itemHamburger, "Hamburger");
		 
		 itemBaconBurger= (BaseFood) new BaseFood("The Bacon Burger!", 	20, 20F, true,64, new PotionEffect(Potion.regeneration.id, 150, 0)).setCreativeTab(RandomMine.tab);
		 GameRegistry.registerItem(itemBaconBurger, "The Bacon Burger!");
		 
		 GameRegistry.registerItem(ItemModPickaxe = new ItemModPickaxe("ItemModPickaxe", MyMaterial), "ItemModPickaxe");
		 
		 
	 itemHotDog= (BaseFood) new BaseFood("Hot Dog", 20, 20F, false,64, (Potion.moveSpeed.id, 150, 0)).setCreativeTab(RandomMine.tab);
	 GameRegistry.registerItem(itemHotDog, "itemHotDog");
 itemPickle= (BaseFood) new BaseFood("Pickle", 20, 20F, true,64, (Potion.moveSpeed.id, 150, 0)).setCreativeTab(RandomMine.tab);
GameRegistry.registerItem(itemPickle, "itemPickle");}