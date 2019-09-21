package com.mystery2099.strippedlogsmod.init;

import java.util.ArrayList;
import java.util.List;

import com.mystery2099.strippedlogsmod.objects.blocks.BlockStrippedLog;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block STRIPPED_ACACIA_LOG = new BlockStrippedLog("stripped_acacia_log", Material.WOOD);
	public static final Block STRIPPED_BIRCH_LOG = new BlockStrippedLog("stripped_birch_log", Material.WOOD);
	public static final Block STRIPPED_DARK_OAK_LOG = new BlockStrippedLog("stripped_dark_oak_log", Material.WOOD);
	public static final Block STRIPPED_JUNGLE_LOG = new BlockStrippedLog("stripped_jungle_log", Material.WOOD);
	public static final Block STRIPPED_OAK_LOG = new BlockStrippedLog("stripped_oak_log", Material.WOOD);
	public static final Block STRIPPED_SPRUCE_LOG = new BlockStrippedLog("stripped_spruce_log", Material.WOOD);
}