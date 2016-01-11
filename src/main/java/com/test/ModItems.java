package com.test;

//This is where you render items.
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.common.registry.GameRegistry;
import com.test.item.*;

public class ModItems {
	//public static(Item Name) item(Item Name);
	public static Item itemChocolate;
	public static ItemBedrockBreak BedrockBreak;
	public static void preInitCommon() {
	 //item(Item Name)= (Item Name) new Item(Item Name)().setUnlocalizedName("item(Item Name)");
	 //GameRegistry.registerItem(item(Item Name), "item(Item Name)");
		 itemChocolate= (BaseFood) new BaseFood("Chocolate", 1, 1F, false, new PotionEffect(Potion.moveSpeed.id, 150, 0));
		 GameRegistry.registerItem(itemChocolate, "itemChocolate");
		 BedrockBreak= (ItemBedrockBreak) new ItemBedrockBreak().setUnlocalizedName("itemBedrockBreak");
		 GameRegistry.registerItem(BedrockBreak, "itemBedrockBreak");
	}
}