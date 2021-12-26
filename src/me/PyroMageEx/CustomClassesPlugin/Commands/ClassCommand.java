package me.PyroMageEx.CustomClassesPlugin.Commands;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import java.util.*;
import me.PyroMageEx.CustomClassesPlugin.Main;
import me.PyroMageEx.CustomClassesPlugin.Items.ItemManager;
import net.md_5.bungee.api.ChatColor;

public class ClassCommand implements CommandExecutor{

	private Main plugin;
	public ClassCommand(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("class").setExecutor(this);
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("Only players may execute this command.");
			return true;
		}
		
		Player p = (Player) sender;
		String playerClass = args[0].toLowerCase();
		for (PotionEffect effect : p.getActivePotionEffects())
	        p.removePotionEffect(effect.getType());
		for(int i=0;i<=103;i++) {
			p.getInventory().setItem(i, null);
		}
		if(p.hasPermission("class.use")) {
			switch(playerClass) {
			case "zombie":
				p.getInventory().addItem(ItemManager.zombieHat());
				p.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 100000, 10));
				p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 100000, 1));
				p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100000, 1));
				p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 100000, 1));
				p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 100000, 1));
				p.getInventory().setItem(8, new ItemStack(Material.COMPASS, 1));
				Bukkit.broadcastMessage(ChatColor.UNDERLINE+""+ChatColor.BOLD+p.getName()+" has selected class: "+playerClass);
				break;
			case "skeleton":
				p.getInventory().addItem(ItemManager.skeleHat());
				p.getInventory().addItem(ItemManager.skeleBow());
				p.getInventory().addItem(new ItemStack(Material.ARROW, 1));
				p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 100000, 2));
				p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 100000, 1));
				p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 100000, 1));
				p.getInventory().setItem(8, new ItemStack(Material.COMPASS, 1));
				Bukkit.broadcastMessage(ChatColor.UNDERLINE+""+ChatColor.BOLD+p.getName()+" has selected class: "+playerClass);
				break;
			case "enderman":
				p.getInventory().addItem(ItemManager.endermanHat());
				p.getInventory().addItem(ItemManager.enderPearl());
				p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 100000, 2));
				p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 100000, 1));
				p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 100000, 1));
				p.getInventory().setItem(8, new ItemStack(Material.COMPASS, 1));
				Bukkit.broadcastMessage(ChatColor.UNDERLINE+""+ChatColor.BOLD+p.getName()+" has selected class: "+playerClass);
				break;
			case "blaze":
				p.getInventory().addItem(ItemManager.blazeHat());
				p.getInventory().addItem(ItemManager.blazeBow());
				p.getInventory().addItem(new ItemStack(Material.ARROW, 1));
				p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_FALLING, 100000, 3));
				p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 100000, 5));
				p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 100000, 1));
				p.getInventory().setItem(8, new ItemStack(Material.COMPASS, 1));
				Bukkit.broadcastMessage(ChatColor.UNDERLINE+""+ChatColor.BOLD+p.getName()+" has selected class: "+playerClass);
				break;
			case "wither_skeleton":
				p.getInventory().addItem(ItemManager.witherSkeletonChest());
				p.getInventory().addItem(ItemManager.witherSkeletonHat());
				p.getInventory().addItem(ItemManager.witherSkeletonSword());
				p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 100000, 2));
				p.getInventory().setItem(8, new ItemStack(Material.COMPASS, 1));
				Bukkit.broadcastMessage(ChatColor.UNDERLINE+""+ChatColor.BOLD+p.getName()+" has selected class: "+playerClass);
				break;
			case "silverfish":
				p.getInventory().addItem(ItemManager.silverfishHat());
				p.getInventory().addItem(ItemManager.silverfishPick());
				p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 100000, 4));
				p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 100000, 2));
				p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 100000, 1));
				p.getInventory().setItem(8, new ItemStack(Material.COMPASS, 1));
				Bukkit.broadcastMessage(ChatColor.UNDERLINE+""+ChatColor.BOLD+p.getName()+" has selected class: "+playerClass);
				break;
			case "dolphin":
				p.getInventory().addItem(ItemManager.dolphinHat());
				p.getInventory().addItem(ItemManager.dolphinFish());
				p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100000, 3));
				p.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, 100000, 1));
				break;
			case "reset":
				p.sendMessage("Your class has been reset.");
				break;
			default:
				p.sendMessage(ChatColor.RED+"Invalid class selected.");
				break;
			}
			return true;
		} else {
			p.sendMessage("You do not have permission to use this command.");
		}
		
		return false;
	}
}