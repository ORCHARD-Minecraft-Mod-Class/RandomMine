package com.test;

import com.test.ModBlocks;
import com.test.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipes {
	public static void add()
	{
	// GameRegistry.addRecipe(new ItemStack(StartupCommon.blockEnder, 1), new Object[] {
	//	 "PPP",
	//	 "PPP",
	//	 "PPP",
	//	 'P', Items.ender_pearl
	 //});	
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemChocolate), new Object[] {
					new ItemStack(Items.sugar),
					new ItemStack(Items.dye, 3)
				});
			ItemStack C = new ItemStack(ModItems.itemChocolate);
			
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blockChoclate), new Object[] {
					C,C,C,C,C,C,C,C,C
				});
			
			//From http://minecraft.gamepedia.com/Mods/Creating_mods/Adding_a_recipe
			GameRegistry.addRecipe(new ItemStack(Blocks.end_stone, 64), new Object[] { "W $", " S ", "s E", 'W', new ItemStack(Blocks.log, 1, 2), '$', Items.stick, 'S', Blocks.sand, 's', Blocks.sapling, 'E', Items.ender_pearl });
			
			GameRegistry.addRecipe(new ItemStack(ModBlocks.blockX, 1), new Object[] {
				 "T T",
				 " T ",
				 "T T",
				 'T', Blocks.tnt
			});
			
	}
}
