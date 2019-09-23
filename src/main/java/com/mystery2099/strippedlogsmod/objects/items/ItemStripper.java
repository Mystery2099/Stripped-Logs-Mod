package com.mystery2099.strippedlogsmod.objects.items;

import com.mystery2099.strippedlogsmod.Main;
import com.mystery2099.strippedlogsmod.init.ModItems;
import com.mystery2099.strippedlogsmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemStripper extends Item implements IHasModel
{
	public ItemStripper(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.STRIPPEDWOODTAB);
		setContainerItem(this);
		setMaxDamage(1);
		maxStackSize = 1;


		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
