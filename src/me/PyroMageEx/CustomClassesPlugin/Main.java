package me.PyroMageEx.CustomClassesPlugin;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.plugin.java.JavaPlugin;

import me.PyroMageEx.CustomClassesPlugin.Commands.ClassCommand;
import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin{

	@Override
	public void onEnable() {
		new ClassCommand(this);
	}
	@Override
	public void onDisable() {
		
	}
	
}
