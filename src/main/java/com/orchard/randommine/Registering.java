package com.orchard.randommine;

import com.orchard.randommine.item.*;
import com.orchard.randommine.blocks.*;

import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import com.ParkerMc.tools.Register;

public class Registering {
	public static void add()
	{
	Register.addblock("BlockChoclate", new BlockChoclate().setUnlocalizedName("blockChoclate"));
	Register.addblock("BlockX",new BlockX().setUnlocalizedName("blockX"));
	
	Register.additem("ItemChoclate", new BaseFood("Chocolate", 1, 1F, false, new PotionEffect(Potion.moveSpeed.id, 150, 0)));
	//Register.additem("ItemBedrockBreak",new ItemBedrockBreak().setUnlocalizedName("itemBedrockBreak"));
}}
