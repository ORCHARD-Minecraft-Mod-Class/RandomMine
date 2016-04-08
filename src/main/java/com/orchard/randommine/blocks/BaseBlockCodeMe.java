//This is the package (folder) your blocks are in. Instead of slashes (/) programmers use "."
package com.orchard.randommine.blocks;
 
//This is where you import all the things you will need in your program.
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
//BACON!!!!!!!!!!!
//MORE BACON!!!!!!!!
// EVEN MORE BACON!!!!!!!!!!!!!!!
//Wherever it says "BaseBlockCode" replace it with the name of your block, for example "MyBlock"
public class BaseBlockCodeMe extends Block{
	public BaseBlockCodeMe() {
		
		
//Hold down ctrl, then click on "rock" it will give you a full list of all the material types you can use.
		super(Material.grass);
		
		
		//This is the creative tab your block is in. Use ctrl click to see more options.
		this.setCreativeTab(CreativeTabs.tabDecorations);
		
		
//This is the hardness of your block. For example, setting it to "(25.0F)" would make the block harder.
		this.setHardness(9.0F);

		
	
	//This is where you define what color your block is on a map. Again, hold down ctrl and click "sandColor" to see a
	//full list of options..
	}   public MapColor getMapColor(IBlockState state)
	    {
	        return MapColor.diamondColor;
	    }
	{
		
		
		
		
		
		
		
		
		
	}
}	