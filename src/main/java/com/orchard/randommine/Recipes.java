package com.orchard.randommine;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipes {
	public static void add()
	{
		
		//Copy the code below and paste it anywhere at the bottom of the program.
		//replace "myBlock" with whatever the output of the recipe will be.
		//replace "item_name" with whatever thing your block will be crafted with.
		//remove ('A', Items.item_name2) if you only want to craft your block with one type of item/block. Also remove the comma after the first (item_name)
		
		
	//  GameRegistry.addRecipe(new ItemStack(ModBlocks.myBlock, 1), new Object[] {
	//	 "PPP",
	//	 "AAA",
	//	 "PPP",
	//	 'P', Items.item_name,
	//	 'A', Items.item_name2
	//   });	
		
		
		
		
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
		
			//Put your block or item recipes down here.
			
		  GameRegistry.addRecipe(new ItemStack(ModBlocks.blockSwordintheStone, 1), new Object[] {
				 "SSS",
				 "SIS",
				 "SSS",
				 'I', Items.iron_sword,
				 'S', Blocks.stone
			   });	
				
			
			
			
			
			
			
			
			
			
			
	}
}
