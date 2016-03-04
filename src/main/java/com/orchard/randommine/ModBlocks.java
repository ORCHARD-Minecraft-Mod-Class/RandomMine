
package com.orchard.randommine;

import net.minecraftforge.fml.common.registry.GameRegistry;
import com.orchard.randommine.blocks.*;

//This is where blocks that are placed are registered into the game.

public class ModBlocks {
	//public static Block(name) block(name);
	public static BlockChoclate blockChoclate;
	public static BlockX blockX;
	public static Blockmrcatface blockmrcatface;
	public static BlockFaceSilly BlockFaceSilly;	
	public static BlockBraker BlockBraker;
	public static BlockSwordintheStone blockSwordintheStone;
	public static BlockControlPanel BlockControlPanel;
	public static BlockMustyApple BlockMustyApple;
	
	
    public static void preInitCommon() {

    	//block(name) = (Block(name)) new Block(name)().setUnlocalizedName("block(name)");   	
    	//GameRegistry.registerBlock(block(name), "block(name)");
    	
    	blockChoclate = (BlockChoclate) new BlockChoclate().setUnlocalizedName("blockChoclate").setCreativeTab(RandomMine.tab);   	
    	GameRegistry.registerBlock(blockChoclate, "blockChoclate");
    	
    	blockX = (BlockX) new BlockX().setUnlocalizedName("blockX").setCreativeTab(RandomMine.tab);   	
    	GameRegistry.registerBlock(blockX, "blockX");
    	
    	
    	BlockFaceSilly = (BlockFaceSilly) new BlockFaceSilly().setUnlocalizedName("BlockFaceSilly").setCreativeTab(RandomMine.tab);   	
    	GameRegistry.registerBlock(BlockFaceSilly, "BlockFaceSilly");
    	
    	blockSwordintheStone = (BlockSwordintheStone) new BlockSwordintheStone().setUnlocalizedName("Sword in the Stone").setCreativeTab(RandomMine.tab);   	
    	GameRegistry.registerBlock(blockSwordintheStone, "Sword in the Stone");
    	
    	
    	BlockControlPanel = (BlockControlPanel) new BlockControlPanel().setUnlocalizedName("Control Panel").setCreativeTab(RandomMine.tab);   	
    	GameRegistry.registerBlock(BlockControlPanel, "Control Panel");

    	BlockMustyApple = (BlockMustyApple) new BlockMustyApple().setUnlocalizedName("BlockMustyApple").setCreativeTab(RandomMine.tab);   	
    	GameRegistry.registerBlock(BlockMustyApple, "BlockMustyApple");
    	
    	BlockBraker = (BlockBraker) new BlockBraker().setUnlocalizedName("Braker").setCreativeTab(RandomMine.tab);   	
    	GameRegistry.registerBlock(BlockBraker, "BlockBraker");
    	
    	
    	
    	
//github.com/ORCHARD-Minecraft-Mod-Class/RandomMine.git
    
    }
}