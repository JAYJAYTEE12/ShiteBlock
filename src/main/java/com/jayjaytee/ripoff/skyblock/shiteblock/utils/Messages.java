package com.jayjaytee.ripoff.skyblock.shiteblock.utils;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Messages {
    public static void sendMessage(Player player, String msg){
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', msg));
    }
    public static void sendMessage(CommandSender player, String msg){
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', msg));
    }
}
