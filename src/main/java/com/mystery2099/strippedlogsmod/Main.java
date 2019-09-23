package com.mystery2099.strippedlogsmod;

import com.mystery2099.strippedlogsmod.init.ModRecipes;
import com.mystery2099.strippedlogsmod.proxy.CommonProxy;
import com.mystery2099.strippedlogsmod.tabs.StrippedWoodTab;
import com.mystery2099.strippedlogsmod.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main 
{
	//Tabs
		public static final CreativeTabs STRIPPEDWOODTAB = new StrippedWoodTab("strippedwoodtab");
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {}
	
	@EventHandler
	public static void Init(FMLInitializationEvent event) 
	{
		ModRecipes.init();
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {}
}
