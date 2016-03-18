package com.orchard.randommine.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class itemHamburger extends ItemFood {

	private PotionEffect[] effects;

	public itemHamburger(String unlocalizedName, int amount, float saturation, boolean isWolfFood,int max, PotionEffect... effects) {
		super(amount, saturation, isWolfFood);
		this.setUnlocalizedName(unlocalizedName);
		this.effects = effects;
		this.setMaxStackSize(max);
	}

	@Override
	protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
		super.onFoodEaten(stack, world, player);

		for (int i = 0; i < this.effects.length; i++) {
			if (!world.isRemote && this.effects[i] != null && this.effects[i].getPotionID() > 0)
				player.addPotionEffect(new PotionEffect(this.effects[i]));
		}
	}
}
