package me.PyroMageEx.CustomClassesPlugin.Items;

import org.bukkit.Bukkit;
import org.bukkit.entity.EnderPearl;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerExpChangeEvent;
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
	//For Witch Potion Drops
	@EventHandler
	public void onExpChange(PlayerExpChangeEvent e) {
		Player p = e.getPlayer();
		ItemStack item = p.getInventory().getHelmet();
		ItemMeta meta = item.getItemMeta();
		String name = meta.getDisplayName();
		//0.25 of getting a random 2 potions
		if(name.equals(ChatColor.GOLD + "" + ChatColor.BOLD + "Witch Essence")) {
			int rand1 = (int) (Math.random()*(4-1+1)+1);
			if(rand1==1) {
				p.sendMessage("You find a pair of mysterious potion in the bottom of your bag...");
				int rand2 = (int) (Math.random()*(5-1+1)+1);
				switch(rand2) {
				case 1:
					p.getInventory().addItem(ItemManager.potions(1));
					break;
				case 2:
					p.getInventory().addItem(ItemManager.potions(2));
					break;
				case 3:
					p.getInventory().addItem(ItemManager.potions(3));
					break;
				case 4:
					p.getInventory().addItem(ItemManager.potions(4));
					break;
				case 5:
					p.getInventory().addItem(ItemManager.potions(5));
					break;
				}
			}
		}
	}
}
