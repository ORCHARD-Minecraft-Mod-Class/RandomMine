package com.test.item;

//This is where you import any assets you need.
import net.minecraft.item.ItemFood;
import net.minecraft.potion.PotionEffect;



//Replace anywhere it says "BaseFood" with whatever you named your food item.
public class BaseFood extends ItemFood {


public BaseFood(String unlocalizedName, int amount, float saturation, boolean isWolfFood, PotionEffect... effects) {
super(amount, saturation, isWolfFood);
this.setUnlocalizedName(unlocalizedName);

//Change the "1" to however many items will be able to stack. Max is 64
this.setMaxStackSize(1);
}




}
