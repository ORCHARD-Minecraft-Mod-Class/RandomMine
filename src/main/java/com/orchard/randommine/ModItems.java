package com.orchard.randommine;

//This is where you render items.
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.common.registry.GameRegistry;
import com.orchard.randommine.items.*;

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
	}
}