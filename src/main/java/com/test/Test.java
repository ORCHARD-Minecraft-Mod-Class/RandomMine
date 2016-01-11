package com.test;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

import com.test.ItemRendering;

@Mod(modid = Test.MODID, version = Test.VERSION, name = "test")
public class Test 
{

	public static final String MODID = "test";
	public static final String VERSION = "1.0";
	
	@Mod.Instance(Test.MODID)
	public static Test instance;
	
	
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


