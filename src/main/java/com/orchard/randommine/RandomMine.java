package com.orchard.randommine;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = RandomMine.MODID, version = RandomMine.VERSION, name = "RandomMine")
public class RandomMine 
{
	public static CreativeTabs tab = new CreativeTab("Random Mine");

	public static final String MODID = "randommine";
	public static final String VERSION = "1.0";
	
	@Mod.Instance(RandomMine.MODID)
	public static RandomMine instance;
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
		ModBlocks.preInitCommon();
		ModItems.preInitCommon();
	}
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		Recipes.add();
		if(event.getSide() == Side.CLIENT)
		{
		ItemRendering.start();
		}
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}	
}


