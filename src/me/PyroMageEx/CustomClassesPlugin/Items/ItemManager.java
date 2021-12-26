package me.PyroMageEx.CustomClassesPlugin.Items;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import net.md_5.bungee.api.ChatColor;

public class ItemManager {
	// Zombie Items
	public static ItemStack zombieHat() {
		ItemStack customItem = new ItemStack(Material.LEATHER_HELMET, 1);
		LeatherArmorMeta leatherMeta = (LeatherArmorMeta) customItem.getItemMeta();
		List<String> lore = new ArrayList<String>();

		lore.add(ChatColor.DARK_PURPLE + "Braiiiiiinnss...");
		leatherMeta.setLore(lore);
		leatherMeta.setDisplayName(ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Zombie Essence");
		leatherMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
		leatherMeta.addEnchant(Enchantment.BINDING_CURSE, 1, true);
		leatherMeta.setUnbreakable(true);
		leatherMeta.setColor(Color.GREEN);

		customItem.setItemMeta(leatherMeta);
		return customItem;
	}

	// Skeleton Items
	public static ItemStack skeleHat() {
		ItemStack customItem = new ItemStack(Material.LEATHER_HELMET, 1);
		LeatherArmorMeta leatherMeta = (LeatherArmorMeta) customItem.getItemMeta();
		List<String> lore = new ArrayList<String>();

		lore.add(ChatColor.DARK_PURPLE + "Clack.. Clack..");
		leatherMeta.setLore(lore);
		leatherMeta.setDisplayName(ChatColor.GRAY + "" + ChatColor.BOLD + "Skeleton Essence");
		leatherMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
		leatherMeta.addEnchant(Enchantment.BINDING_CURSE, 1, true);
		leatherMeta.setUnbreakable(true);
		leatherMeta.setColor(Color.GRAY);

		customItem.setItemMeta(leatherMeta);
		return customItem;
	}

	public static ItemStack skeleBow() {
		ItemStack customItem = new ItemStack(Material.BOW, 1);
		ItemMeta meta = customItem.getItemMeta();
		List<String> lore = new ArrayList<String>();

		lore.add(ChatColor.DARK_PURPLE + "Spooky Scary Skeletons..");
		meta.setLore(lore);
		meta.setDisplayName(ChatColor.GRAY + "" + ChatColor.BOLD + "Skeleton's Recurve Bow");
		meta.addEnchant(Enchantment.ARROW_INFINITE, 1, true);
		meta.addEnchant(Enchantment.ARROW_DAMAGE, 3, true);
		meta.addEnchant(Enchantment.BINDING_CURSE, 1, true);
		meta.setUnbreakable(true);

		customItem.setItemMeta(meta);
		return customItem;
	}

	// Enderman Items
	public static ItemStack endermanHat() {
		ItemStack customItem = new ItemStack(Material.LEATHER_HELMET, 1);
		LeatherArmorMeta leatherMeta = (LeatherArmorMeta) customItem.getItemMeta();
		List<String> lore = new ArrayList<String>();

		lore.add(ChatColor.DARK_PURPLE + "... ...");
		leatherMeta.setLore(lore);
		leatherMeta.setDisplayName(ChatColor.BLACK + "" + ChatColor.BOLD + "Enderman Essence");
		leatherMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
		leatherMeta.addEnchant(Enchantment.BINDING_CURSE, 1, true);
		leatherMeta.setUnbreakable(true);
		leatherMeta.setColor(Color.BLACK);

		customItem.setItemMeta(leatherMeta);
		return customItem;
	}

	public static ItemStack enderPearl() {
		ItemStack customItem = new ItemStack(Material.ENDER_PEARL, 1);
		ItemMeta meta = customItem.getItemMeta();
		List<String> lore = new ArrayList<String>();

		lore.add(ChatColor.DARK_PURPLE + "Vwoop.");
		meta.setLore(lore);
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Ender Pearl");
		meta.addEnchant(Enchantment.DAMAGE_ALL, 4, true);
		meta.addEnchant(Enchantment.BINDING_CURSE, 1, true);
		meta.setUnbreakable(true);

		customItem.setItemMeta(meta);
		return customItem;
	}

	// Blaze Items
	public static ItemStack blazeHat() {
		ItemStack customItem = new ItemStack(Material.LEATHER_HELMET, 1);
		LeatherArmorMeta leatherMeta = (LeatherArmorMeta) customItem.getItemMeta();
		List<String> lore = new ArrayList<String>();

		lore.add(ChatColor.GOLD + "Burn your enemies alive");
		leatherMeta.setLore(lore);
		leatherMeta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Blaze Essence");
		leatherMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
		leatherMeta.addEnchant(Enchantment.BINDING_CURSE, 1, true);
		leatherMeta.setUnbreakable(true);
		leatherMeta.setColor(Color.ORANGE);

		customItem.setItemMeta(leatherMeta);
		return customItem;
	}

	public static ItemStack blazeBow() {
		ItemStack customItem = new ItemStack(Material.BOW, 1);
		ItemMeta meta = customItem.getItemMeta();
		List<String> lore = new ArrayList<String>();

		lore.add(ChatColor.GOLD + "Fwoosh.. Fwoosh..");
		meta.setLore(lore);
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Blaze Rod");
		meta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
		meta.addEnchant(Enchantment.ARROW_FIRE, 2, true);
		meta.addEnchant(Enchantment.ARROW_INFINITE, 1, true);
		meta.addEnchant(Enchantment.BINDING_CURSE, 1, true);
		meta.setUnbreakable(true);

		customItem.setItemMeta(meta);
		return customItem;
	}

	// Wither Skeleton Items
	public static ItemStack witherSkeletonHat() {
		ItemStack customItem = new ItemStack(Material.LEATHER_HELMET, 1);
		LeatherArmorMeta leatherMeta = (LeatherArmorMeta) customItem.getItemMeta();
		List<String> lore = new ArrayList<String>();

		lore.add(ChatColor.DARK_GRAY + "The most fearsome of gladiators");
		leatherMeta.setLore(lore);
		leatherMeta.setDisplayName(ChatColor.DARK_GRAY + "" + ChatColor.BOLD + "Wither Skeleton Essence");
		leatherMeta.addEnchant(Enchantment.SOUL_SPEED, 2, true);
		leatherMeta.addEnchant(Enchantment.BINDING_CURSE, 1, true);
		leatherMeta.setUnbreakable(true);
		leatherMeta.setColor(Color.BLACK);

		customItem.setItemMeta(leatherMeta);
		return customItem;
	}

	public static ItemStack witherSkeletonChest() {
		ItemStack customItem = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
		LeatherArmorMeta leatherMeta = (LeatherArmorMeta) customItem.getItemMeta();
		List<String> lore = new ArrayList<String>();

		lore.add(ChatColor.DARK_GRAY + "Clack.. Clack.. Clack..");
		leatherMeta.setLore(lore);
		leatherMeta.setDisplayName(ChatColor.DARK_GRAY + "" + ChatColor.BOLD + "Wither Skeleton Essence");
		leatherMeta.addEnchant(Enchantment.BINDING_CURSE, 1, true);
		leatherMeta.setUnbreakable(true);
		leatherMeta.setColor(Color.BLACK);

		customItem.setItemMeta(leatherMeta);
		return customItem;
	}

	public static ItemStack witherSkeletonSword() {
		ItemStack customItem = new ItemStack(Material.STONE_SWORD, 1);
		ItemMeta meta = customItem.getItemMeta();
		List<String> lore = new ArrayList<String>();

		lore.add(ChatColor.DARK_GRAY + "Clack...");
		meta.setLore(lore);
		meta.setDisplayName(ChatColor.DARK_GRAY + "" + ChatColor.BOLD + "Bone Machete");
		meta.addEnchant(Enchantment.FIRE_ASPECT, 1, true);
		meta.addEnchant(Enchantment.SWEEPING_EDGE, 5, true);
		meta.setUnbreakable(true);

		customItem.setItemMeta(meta);
		return customItem;
	}

	// Silverfish items
	public static ItemStack silverfishHat() {
		ItemStack customItem = new ItemStack(Material.LEATHER_HELMET, 1);
		LeatherArmorMeta leatherMeta = (LeatherArmorMeta) customItem.getItemMeta();
		List<String> lore = new ArrayList<String>();

		lore.add(ChatColor.DARK_GRAY + "Release your inner rat");
		leatherMeta.setLore(lore);
		leatherMeta.setDisplayName(ChatColor.DARK_GRAY + "" + ChatColor.BOLD + "Silverfish Essence");
		leatherMeta.addEnchant(Enchantment.BINDING_CURSE, 1, true);
		leatherMeta.setUnbreakable(true);
		leatherMeta.setColor(Color.GRAY);

		customItem.setItemMeta(leatherMeta);
		return customItem;
	}

	public static ItemStack silverfishPick() {
		ItemStack customItem = new ItemStack(Material.IRON_PICKAXE, 1);
		ItemMeta meta = customItem.getItemMeta();
		List<String> lore = new ArrayList<String>();

		lore.add(ChatColor.DARK_GRAY + "Scritch.. Scratch..");
		meta.setLore(lore);
		meta.setDisplayName(ChatColor.DARK_GRAY + "" + ChatColor.BOLD + "Silverfish Claw");
		meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 2, true);
		meta.addEnchant(Enchantment.KNOCKBACK, 2, true);
		meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
		meta.addEnchant(Enchantment.DIG_SPEED, 3, true);
		meta.setUnbreakable(true);

		customItem.setItemMeta(meta);
		return customItem;
	}

	// Dolphin Items
	public static ItemStack dolphinHat() {
		ItemStack customItem = new ItemStack(Material.LEATHER_HELMET, 1);
		LeatherArmorMeta leatherMeta = (LeatherArmorMeta) customItem.getItemMeta();
		List<String> lore = new ArrayList<String>();

		lore.add(ChatColor.AQUA + "Rule the seas!");
		leatherMeta.setLore(lore);
		leatherMeta.setDisplayName(ChatColor.DARK_GRAY + "" + ChatColor.BOLD + "Dolphin Essence");
		leatherMeta.addEnchant(Enchantment.DEPTH_STRIDER, 10, true);
		leatherMeta.addEnchant(Enchantment.WATER_WORKER, 10, true);
		leatherMeta.addEnchant(Enchantment.OXYGEN, 10, true);
		leatherMeta.addEnchant(Enchantment.BINDING_CURSE, 1, true);
		leatherMeta.setUnbreakable(true);
		leatherMeta.setColor(Color.AQUA);

		customItem.setItemMeta(leatherMeta);
		return customItem;
	}
	public static ItemStack dolphinFish() {
		ItemStack customItem = new ItemStack(Material.COD, 1);
		ItemMeta meta = customItem.getItemMeta();
		List<String> lore = new ArrayList<String>();

		lore.add(ChatColor.AQUA + "Flop..");
		meta.setLore(lore);
		meta.setDisplayName(ChatColor.DARK_GRAY + "" + ChatColor.BOLD + "Captured Cod");
		meta.addEnchant(Enchantment.KNOCKBACK, 5, true);
		meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
		meta.setUnbreakable(true);

		customItem.setItemMeta(meta);
		return customItem;
	}
	// Witch Items
	public static ItemStack witchHat() {
		ItemStack customItem = new ItemStack(Material.LEATHER_HELMET, 1);
		LeatherArmorMeta leatherMeta = (LeatherArmorMeta) customItem.getItemMeta();
		List<String> lore = new ArrayList<String>();

		lore.add(ChatColor.BLACK + "Fancy a potion?");
		leatherMeta.setLore(lore);
		leatherMeta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Witch Essence");
		leatherMeta.addEnchant(Enchantment.THORNS, 2, true);
		leatherMeta.addEnchant(Enchantment.PROTECTION_FIRE, 10, true);
		leatherMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
		leatherMeta.setUnbreakable(true);
		leatherMeta.setColor(Color.BLACK);

		customItem.setItemMeta(leatherMeta);
		return customItem;
	}
	public static ItemStack witchCauldron() {
		ItemStack customItem = new ItemStack(Material.CAULDRON, 1);
		ItemMeta meta = customItem.getItemMeta();
		List<String> lore = new ArrayList<String>();

		lore.add(ChatColor.BLACK + "It hits like a truck..");
		meta.setLore(lore);
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Witch's Brewing Pot");
		meta.addEnchant(Enchantment.DAMAGE_ALL, 3, true);
		meta.addEnchant(Enchantment.FIRE_ASPECT, 1, true);
		meta.setUnbreakable(true);

		customItem.setItemMeta(meta);
		return customItem;
	}
	public static ItemStack potions(int x) {
		ItemStack customItem = new ItemStack(Material.SPLASH_POTION, 2);
		PotionMeta meta = (PotionMeta) customItem.getItemMeta();
		List<String> lore = new ArrayList<String>();
		
		lore.add(ChatColor.DARK_PURPLE + "Bon Appetit");
		meta.setLore(lore);
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Mystery Potion");
		meta.setColor(Color.TEAL);
		meta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		//PotionEffect: PotionEffectType, duration, amplifier
		switch(x) {
		//Escape Potion
		case 1:
			meta.addCustomEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 10*20, 2), true);
			meta.addCustomEffect(new PotionEffect(PotionEffectType.LEVITATION, 5*20, 2), true);
			break;
		//Offensive Potion
		case 2:
			meta.addCustomEffect(new PotionEffect(PotionEffectType.BLINDNESS, 20*20, 2), true);
			meta.addCustomEffect(new PotionEffect(PotionEffectType.POISON, 20*20, 3), true);
			break;
		//Aggressive Potion
		case 3:
			meta.addCustomEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 15*20, 2), true);
			meta.addCustomEffect(new PotionEffect(PotionEffectType.REGENERATION, 15*20, 2), true);
			break;
		//Loot table/passive Potion
		case 4:
			meta.addCustomEffect(new PotionEffect(PotionEffectType.LUCK, 120*20, 5), true);
			meta.addCustomEffect(new PotionEffect(PotionEffectType.SATURATION, 120*20, 2), true);
			break;
		//Ghosty Potion
		case 5:
			meta.addCustomEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 60*20, 5), true);
			break;
		}
		customItem.setItemMeta(meta);
		return customItem;
	}
	//Villager Items
	public static ItemStack villagerHat() {
		ItemStack customItem = new ItemStack(Material.LEATHER_HELMET, 1);
		LeatherArmorMeta leatherMeta = (LeatherArmorMeta) customItem.getItemMeta();
		List<String> lore = new ArrayList<String>();

		lore.add(ChatColor.YELLOW + "Hrrrm?");
		leatherMeta.setLore(lore);
		leatherMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Villager Essence");
		leatherMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
		leatherMeta.addEnchant(Enchantment.BINDING_CURSE, 1, true);
		leatherMeta.setUnbreakable(true);
		leatherMeta.setColor(Color.YELLOW);

		customItem.setItemMeta(leatherMeta);
		return customItem;
	}
	//
	public static ItemStack villagerItems(String type, int rng) {
		ItemStack item = null;
		if(type.equals("bad")) {
			switch(rng) {
			case 1:
				item = new ItemStack(Material.ROTTEN_FLESH, 64);
				break;
			case 2:
				item = new ItemStack(Material.WHEAT_SEEDS, 32);
				break;
			case 3:
				item = new ItemStack(Material.GLASS_PANE, 64);
				break;
			case 4:
				item = new ItemStack(Material.COAL, 40);
				break;
			case 5:
				item = new ItemStack(Material.SUGAR, 32);
				break;
			case 6:
				item = new ItemStack(Material.LEATHER, 40);
				break;
			case 7:
				item = new ItemStack(Material.DEEPSLATE, 64);
				break;
			case 8:
				item = new ItemStack(Material.GREEN_WOOL, 64);
				break;
			case 9:
				item = new ItemStack(Material.BLACK_BANNER, 1);
				break;
			}
		}
		else if(type.equals("good")) {
			switch(rng) {
			case 1:
				item = new ItemStack(Material.ENDER_PEARL, 8);
				break;
			case 2:
				item = new ItemStack(Material.DIAMOND_AXE, 1);
				break;
			case 3:
				item = new ItemStack(Material.IRON_PICKAXE, 1);
				break;
			case 4:
				item = new ItemStack(Material.NETHERITE_INGOT, 1);
				break;
			case 5:
				item = new ItemStack(Material.COOKED_BEEF, 32);
				break;
			case 6:
				item = new ItemStack(Material.OAK_LOG, 40);
				break;
			case 7:
				item = new ItemStack(Material.GOLDEN_APPLE, 4);
				break;
			case 8:
				item = new ItemStack(Material.IRON_CHESTPLATE, 1);
				break;
			case 9:
				item = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
				break;
			}
		}
		else if(type.equals("op")) {
			switch(rng) {
			case 1:
				item = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 1);
				break;
			case 2:
				item = new ItemStack(Material.DIAMOND_BOOTS, 1);
				break;
			case 3:
				item = new ItemStack(Material.IRON_BLOCK, 5);
				break;
			case 4:
				item = new ItemStack(Material.BARRIER, 5);
				break;
			case 5:
				item = new ItemStack(Material.GOLD_BLOCK, 5);
				break;
			case 6:
				item = new ItemStack(Material.CREEPER_SPAWN_EGG, 5);
				break;
			case 7:
				item = new ItemStack(Material.DIAMOND, 10);
				break;
			}
		}
		return item;
	}
	
	
}
