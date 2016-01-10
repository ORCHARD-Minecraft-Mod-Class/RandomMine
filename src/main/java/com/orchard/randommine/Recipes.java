package com.orchard.randommine;

import com.ParkerMc.tools.Register;
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
			GameRegistry.addShapelessRecipe(new ItemStack(Register.mitems.get("ItemChocolate")), new Object[] {
					new ItemStack(Items.sugar),
					new ItemStack(Items.dye, 3)
				});
			ItemStack C = new ItemStack(Register.mitems.get("ItemChocolate"));
			
			GameRegistry.addShapelessRecipe(new ItemStack(Register.mblocks.get("BlockChoclate")), new Object[] {
					C,C,C,C,C,C,C,C,C
				});
			
			//From http://minecraft.gamepedia.com/Mods/Creating_mods/Adding_a_recipe
		
			
			GameRegistry.addRecipe(new ItemStack(Register.mblocks.get("BlockX"), 1), new Object[] {
				 "T T",
				 " T ",
				 "T T",
				 'T', Blocks.tnt
			});
			
	}
}
