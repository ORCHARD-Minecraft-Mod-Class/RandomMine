package com.orchard.randommine;

import com.ParkerMc.tools.Register;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;;

@Mod(modid = RandomMine.MODID, version = RandomMine.VERSION, name = "RandomMine")
public class RandomMine 
{

	public static final String MODID = "randommine";
	public static final String VERSION = "1.0";
	
	@Mod.Instance(RandomMine.MODID)
	public static RandomMine instance;
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		Registering.add();
		Register.load();
	}
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		Recipes.add();
		if(event.getSide() == Side.CLIENT)
		{
			Register.render(RandomMine.MODID);
		}
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
	
}


