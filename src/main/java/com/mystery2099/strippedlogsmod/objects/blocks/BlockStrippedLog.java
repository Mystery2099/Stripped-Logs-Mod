package com.mystery2099.strippedlogsmod.objects.blocks;

import com.mystery2099.strippedlogsmod.Main;

import net.minecraft.block.BlockDirectional;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockStrippedLog extends BlockBase {
	
	public static final PropertyDirection FACING = BlockDirectional.FACING;


	public BlockStrippedLog(String name, Material material)
	{
		
		
		super(name, material);
		setSoundType(SoundType.WOOD);
		setHardness(2F);
		setResistance(10.0F);
		setHarvestLevel("axe", 0);
		setCreativeTab(Main.STRIPPEDWOODTAB);
		//setLightLevel(1.0f);
		//setLightOpacity(1.0F);
		//setBlockUnbreakable();
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.SOUTH));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.SOLID;
	}

	@Override
	protected net.minecraft.block.state.BlockStateContainer createBlockState() {
		return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{FACING});
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(FACING, EnumFacing.getFront(meta));
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		return ((EnumFacing) state.getValue(FACING)).getIndex();
	}

	@Override
	public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta,
			EntityLivingBase placer) {
		if (facing == EnumFacing.WEST || facing == EnumFacing.EAST)
			facing = EnumFacing.UP;
		else if (facing == EnumFacing.NORTH || facing == EnumFacing.SOUTH)
			facing = EnumFacing.EAST;
		else
			facing = EnumFacing.SOUTH;
		return this.getDefaultState().withProperty(FACING, facing);
	}

}
