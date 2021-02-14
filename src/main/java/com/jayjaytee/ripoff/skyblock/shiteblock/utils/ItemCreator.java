package com.jayjaytee.ripoff.skyblock.shiteblock.utils;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.ArrayList;

public class ItemCreator {
    public static ItemStack createItem(Material mat, Integer amount, Boolean hideFlags , String name, Integer rarity ,String... lore){
        ItemStack item = new ItemStack(mat, amount);
        ItemMeta meta = item.getItemMeta();
        ArrayList<String> fLore = new ArrayList<>();
        for(String s : lore){
            fLore.add(ChatColor.translateAlternateColorCodes('&', s));
        }
        switch(rarity){
            case 0:
                break;
            case 1:
                fLore.add(" ");
                fLore.add(ChatColor.translateAlternateColorCodes('&', "&f&lCOMMON"));
                break;
            case 2:
                fLore.add(" ");
                fLore.add(ChatColor.translateAlternateColorCodes('&', "&a&lUNCOMMON"));
                break;
            case 3:
                fLore.add(" ");
                fLore.add(ChatColor.translateAlternateColorCodes('&', "&9&lRARE"));
                break;
            case 4:
                fLore.add(" ");
                fLore.add(ChatColor.translateAlternateColorCodes('&', "&5&lEPIC"));
                break;
            case 5:
                fLore.add(" ");
                fLore.add(ChatColor.translateAlternateColorCodes('&', "&6&lLEGENDARY"));
                break;
            case 6:
                fLore.add(" ");
                fLore.add(ChatColor.translateAlternateColorCodes('&', "&c&lSPECIAL"));
                break;
        }
        meta.setLore(fLore);
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', name));
        if(hideFlags) {
            item.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            item.addItemFlags(ItemFlag.HIDE_DESTROYS);
            item.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            item.addItemFlags(ItemFlag.HIDE_DYE);
            item.addItemFlags(ItemFlag.HIDE_PLACED_ON);
            item.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
            item.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        }
        item.setItemMeta(meta);
        return item;
    }
    public static ItemStack createItem(Material mat, Integer amount, Boolean hideFlags , String name, Integer rarity){
        ItemStack item = new ItemStack(mat, amount);
        ItemMeta meta = item.getItemMeta();
        ArrayList<String> fLore = new ArrayList<>();
        switch(rarity){
            case 0:
                break;
            case 1:
                fLore.add(ChatColor.translateAlternateColorCodes('&', "&f&lCOMMON"));
                break;
            case 2:
                fLore.add(ChatColor.translateAlternateColorCodes('&', "&a&lUNCOMMON"));
                break;
            case 3:
                fLore.add(ChatColor.translateAlternateColorCodes('&', "&9&lRARE"));
                break;
            case 4:
                fLore.add(ChatColor.translateAlternateColorCodes('&', "&5&lEPIC"));
                break;
            case 5:
                fLore.add(ChatColor.translateAlternateColorCodes('&', "&6&lLEGENDARY"));
                break;
            case 6:
                fLore.add(ChatColor.translateAlternateColorCodes('&', "&c&lSPECIAL"));
                break;
        }
        meta.setLore(fLore);
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', name));
        if(hideFlags) {
            item.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            item.addItemFlags(ItemFlag.HIDE_DESTROYS);
            item.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            item.addItemFlags(ItemFlag.HIDE_DYE);
            item.addItemFlags(ItemFlag.HIDE_PLACED_ON);
            item.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
            item.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        }
        return item;
    }
    public static ItemStack getPlayerHead(Player player, Integer amount, String display, String... lore){
        ItemStack item = new ItemStack(Material.PLAYER_HEAD, amount);
        SkullMeta meta = (SkullMeta) item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', display));
        meta.setOwningPlayer(player);
        ArrayList<String> fLore = new ArrayList<>();
        for(String s : lore){
            fLore.add(ChatColor.translateAlternateColorCodes('&', s));
        }
        meta.setLore(fLore);
        item.setItemMeta(meta);
        return item;
    }
    public static ItemStack getPlayerHead(Player player, Integer amount, String display){
        ItemStack item = new ItemStack(Material.PLAYER_HEAD, amount);
        SkullMeta meta = (SkullMeta) item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', display));
        meta.setOwningPlayer(player);
        item.setItemMeta(meta);
        return item;
    }
}
