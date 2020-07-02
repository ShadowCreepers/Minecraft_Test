package com.shadowmods.obsidian.items;

import com.shadowmods.obsidian.Main;
import com.shadowmods.obsidian.init.ModItems;
import com.shadowmods.obsidian.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "");
		
	}

	
}
