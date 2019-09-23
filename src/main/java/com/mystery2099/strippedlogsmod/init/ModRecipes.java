package com.mystery2099.strippedlogsmod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	
	public static void init() 
	{
		GameRegistry.addSmelting(ModBlocks.STRIPPED_ACACIA_LOG, new ItemStack(ModItems.WOOD_DUST, 4), 1.0F);
		GameRegistry.addSmelting(ModBlocks.STRIPPED_BIRCH_LOG, new ItemStack(ModItems.WOOD_DUST, 4), 1.0F);
		GameRegistry.addSmelting(ModBlocks.STRIPPED_DARK_OAK_LOG, new ItemStack(ModItems.WOOD_DUST, 4), 1.0F);
		GameRegistry.addSmelting(ModBlocks.STRIPPED_JUNGLE_LOG, new ItemStack(ModItems.WOOD_DUST, 4), 1.0F);
		GameRegistry.addSmelting(ModBlocks.STRIPPED_OAK_LOG, new ItemStack(ModItems.WOOD_DUST, 4), 1.0F);
		GameRegistry.addSmelting(ModBlocks.STRIPPED_SPRUCE_LOG, new ItemStack(ModItems.WOOD_DUST, 4), 1.0F);
	}
}
