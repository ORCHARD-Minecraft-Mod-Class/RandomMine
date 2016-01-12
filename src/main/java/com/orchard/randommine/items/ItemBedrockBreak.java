package com.orchard.randommine.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class ItemBedrockBreak extends Item {
		
	@Override
	public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn) {
		super.onItemRightClick(itemStackIn, worldIn, playerIn);
		 Vec3 LookAt = playerIn.getLookVec();
		 BlockPos pos1 = new BlockPos((int)playerIn.posX, (int)playerIn.posY, (int)playerIn.posZ);
		 System.out.println(worldIn.getBlockState(pos1).getBlock());
		 System.out.println((int)playerIn.posX+"-"+(int)playerIn.posY+"-"+ (int)playerIn.posZ);
		 System.out.println(LookAt.xCoord+"-"+ LookAt.yCoord+"-"+LookAt.zCoord);
		
		return itemStackIn;
	}
	
}
