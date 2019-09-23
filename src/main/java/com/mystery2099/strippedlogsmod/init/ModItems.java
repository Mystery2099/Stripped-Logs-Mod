package com.mystery2099.strippedlogsmod.init;

import java.util.ArrayList;
import java.util.List;

import com.mystery2099.strippedlogsmod.objects.items.ItemBase;
import com.mystery2099.strippedlogsmod.objects.items.ItemStripper;

import net.minecraft.item.Item;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item WOOD_STRIPPER = new ItemStripper("wood_stripper");
	public static final Item WOOD_DUST = new ItemBase("wood_dust");
}
