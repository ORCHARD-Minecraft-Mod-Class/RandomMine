package com.ParkerMc.tools;

import java.util.Enumeration;
import java.util.Hashtable;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Register {
	public static Hashtable<String, Block> mblocks = new Hashtable<String, Block>();
	public static Hashtable<String, Item> mitems = new Hashtable<String, Item>();
	public static void addblock(String name, Block blockl)
	{
		mblocks.put(name,blockl);
	}
	public static Block GB(String name)
	{
		return mblocks.get(name);
	}
	public static Item GI(String name)
	{
		return mitems.get(name);
	}
	public static void additem(String name, Item Iteml)
	{
		mitems.put(name,Iteml);
	}
	public static void load(){ 
		loadBlocks();
	loadItems();
	}
	public static void loadBlocks()
	{
		Enumeration<String> i = mblocks.keys();
		while(i.hasMoreElements())
		{
		String j = i.nextElement();
		GameRegistry.registerBlock(mblocks.get(j), j);
		}
		
	}
	public static void loadItems()
	{
		Enumeration<String> i = mitems.keys();
		while(i.hasMoreElements())
		{
		String j = i.nextElement();
		GameRegistry.registerItem(mitems.get(j), j);
		}
		
	}
	public static void render(String modid)
	{
		Enumeration<String> i = mblocks.keys();
		while(i.hasMoreElements())
		{
			registerItemRendering(i.nextElement(),modid);
		}
		i = mitems.keys();
		while(i.hasMoreElements())
		{
			registerItemRendering(i.nextElement(),modid);
		}
	}
	private static void registerItemRendering(String name,String modid)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(GameRegistry.findItem(modid, name), 0, new ModelResourceLocation(modid+":" + name, "inventory"));

	}
}
