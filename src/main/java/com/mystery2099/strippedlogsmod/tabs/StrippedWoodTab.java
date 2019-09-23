package com.mystery2099.strippedlogsmod.tabs;

import com.mystery2099.strippedlogsmod.init.ModBlocks;
import com.mystery2099.strippedlogsmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class StrippedWoodTab extends CreativeTabs 
{
	public StrippedWoodTab(String label) { super("strippedwoodtab");
	this.setBackgroundImageName("items.png"); }
	public ItemStack getTabIconItem() { return new ItemStack(ModBlocks.STRIPPED_OAK_LOG);}
}