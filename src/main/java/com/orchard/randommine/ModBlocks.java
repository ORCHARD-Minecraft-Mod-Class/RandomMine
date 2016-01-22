
package com.orchard.randommine;

import net.minecraftforge.fml.common.registry.GameRegistry;
import com.orchard.randommine.blocks.*;

//This is where blocks that are placed are registered into the game.

public class ModBlocks {
//public static Block(name) block(name);
	public static BlockChoclate blockChoclate;
	public static BlockX blockX;
	public static BlockFaceSilly BlockFaceSilly;
	public static BlockMustyApple BlockMustyApple;
	public static BlockSwordintheStone blockSwordintheStone;
	
	
    public static void preInitCommon() {

    	//block(name) = (Block(name)) new Block(name)().setUnlocalizedName("block(name)");   	
    	//GameRegistry.registerBlock(block(name), "block(name)");
    	
    	blockChoclate = (BlockChoclate) new BlockChoclate().setUnlocalizedName("blockChoclate").setCreativeTab(RandomMine.tab);   	
    	GameRegistry.registerBlock(blockChoclate, "blockChoclate");
    	
    	blockX = (BlockX) new BlockX().setUnlocalizedName("blockX").setCreativeTab(RandomMine.tab);   	
    	GameRegistry.registerBlock(blockX, "blockX");
    	
    	
    	BlockFaceSilly = (BlockFaceSilly) new BlockFaceSilly().setUnlocalizedName("BlockFaceSilly").setCreativeTab(RandomMine.tab);   	
    	GameRegistry.registerBlock(BlockFaceSilly, "BlockFaceSilly");
    	
    	blockSwordintheStone = (BlockSwordintheStone) new BlockSwordintheStone().setUnlocalizedName("blockSwordintheStone").setCreativeTab(RandomMine.tab);   	
    	GameRegistry.registerBlock(blockSwordintheStone, "blockSwordintheStone");
    	
    	BlockMustyApple = (BlockMustyApple) new BlockMustyApple().setUnlocalizedName("BlockMustyApple").setCreativeTab(RandomMine.tab);   	
    	GameRegistry.registerBlock(BlockMustyApple, "BlockMustyApple");
    	
    
    }
}