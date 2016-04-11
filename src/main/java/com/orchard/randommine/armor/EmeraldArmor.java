package com.orchard.randommine.armor;
import net.minecraftforge.fml.common.event.*;
import net.minecraft.creativetab.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.world.*;
import java.util.Random;

import net.minecraftforge.common.util.*;
public class EmeraldArmor{

public EmeraldArmor(){}

public static Item helmet;
public static Item body;
public static Item legs;
public static Item boots;
public Object instance;
public void generateNether(World world, Random random, int chunkX, int chunkZ){}
public void generateSurface(World world, Random random, int chunkX, int chunkZ){}
public int addFuel(ItemStack fuel){return 0;}
public void serverLoad(FMLServerStartingEvent event){}
public void preInit(FMLPreInitializationEvent event){}
public void registerRenderers(){}


static{
ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("EMERALDARMOR", "EmeraldArmor", 25, new int[] {2, 7, 5, 3}, 42);

int armorPreffix = 0;
helmet = (new ItemArmor(enuma, armorPreffix, 0){public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack){
}
}).setUnlocalizedName("EmeraldArmor_head");helmet.setMaxStackSize(1);
body = (new ItemArmor(enuma, armorPreffix, 1){public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack){
}
}).setUnlocalizedName("EmeraldArmor_body");body.setMaxStackSize(1);
legs = (new ItemArmor(enuma, armorPreffix, 2){public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack){
}
}).setUnlocalizedName("EmeraldArmor_leggins");legs.setMaxStackSize(1);
boots = (new ItemArmor(enuma, armorPreffix, 3){public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack){
}
}).setUnlocalizedName("EmeraldArmor_boots");boots.setMaxStackSize(1);

helmet.setCreativeTab(CreativeTabs.tabCombat);
body.setCreativeTab(CreativeTabs.tabCombat);
legs.setCreativeTab(CreativeTabs.tabCombat);
boots.setCreativeTab(CreativeTabs.tabCombat);

}

}
