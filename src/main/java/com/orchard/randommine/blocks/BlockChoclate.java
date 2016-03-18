package com.orchard.randommine.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class BlockChoclate extends Block{
	public BlockChoclate() {
		super(Material.rock);
		this.setHardness(15.0F);
		}
		public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ)
		{
			if (playerIn.canEat(false))
			{
			playerIn.getFoodStats().addStats(9, 1F);
			playerIn.addPotionEffect(new PotionEffect(Potion.moveSpeed.id,60,0));
			worldIn.setBlockToAir(pos);
			}
			return true;
		}
}
