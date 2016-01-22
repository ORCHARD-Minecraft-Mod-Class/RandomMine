
package com.orchard.randommine;

import net.minecraftforge.fml.common.registry.GameRegistry;
import com.orchard.randommine.blocks.*;

//This is where blocks that are placed are registered into the game.

public class ModBlocks {
//public static Block(name) block(name);
	public static BlockChoclate blockChoclate;
	public static BlockX blockX;
	public static Blockmrcatface blockmrcatface;
	
	
    public static void preInitCommon() {

    	//block(name) = (Block(name)) new Block(name)().setUnlocalizedName("block(name)");   	
    	//GameRegistry.registerBlock(block(name), "block(name)");
    	
    	blockChoclate = (BlockChoclate) new BlockChoclate().setUnlocalizedName("blockChoclate").setCreativeTab(RandomMine.tab);   	
    	GameRegistry.registerBlock(blockChoclate, "blockChoclate");
    	
    	blockX = (BlockX) new BlockX().setUnlocalizedName("blockX").setCreativeTab(RandomMine.tab);   	
    	GameRegistry.registerBlock(blockX, "blockX");
    	
    	
    
    }
}