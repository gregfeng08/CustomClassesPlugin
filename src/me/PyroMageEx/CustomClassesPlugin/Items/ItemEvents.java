package me.PyroMageEx.CustomClassesPlugin.Items;

import org.bukkit.Bukkit;
import org.bukkit.entity.EnderPearl;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.PyroMageEx.CustomClassesPlugin.Main;
import net.md_5.bungee.api.ChatColor;

public class ItemEvents implements Listener{
	private Main plugin;
	public ItemEvents(Main plugin) {
		this.plugin = plugin;
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	//For Infinite Ender Pearl
	@EventHandler
	public void onEnderPearlUse(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		ItemStack item = p.getInventory().getItemInMainHand();
		ItemMeta meta = item.getItemMeta();
		String name = meta.getDisplayName();
		if((e.getAction().equals(Action.RIGHT_CLICK_AIR)||e.getAction().equals(Action.RIGHT_CLICK_BLOCK))&&name.equals(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Ender Pearl")) {
			p.launchProjectile(EnderPearl.class);
			e.setCancelled(true);
		}
	}
}
