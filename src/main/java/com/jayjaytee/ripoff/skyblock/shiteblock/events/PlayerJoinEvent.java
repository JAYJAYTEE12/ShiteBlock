package com.jayjaytee.ripoff.skyblock.shiteblock.events;

import com.jayjaytee.ripoff.skyblock.shiteblock.utils.ItemCreator;
import de.tr7zw.nbtapi.NBTItem;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class PlayerJoinEvent implements Listener {
    @EventHandler
    public void onPlayerJoin(org.bukkit.event.player.PlayerJoinEvent event){
        Player player = event.getPlayer();

        ItemStack netherStar = ItemCreator.createItem(Material.NETHER_STAR, 1, true, "&aShiteBlock Menu &7(Right Click)", 0, "&7View all of your ShiteBlock", "&7progress, including your Skills,", "&7Collections, Recipes, and more!", "&7", "&eClick to open!");
        NBTItem nbt = new NBTItem(netherStar);
        nbt.setBoolean("isNetherStar", true);
        netherStar = nbt.getItem();

        player.getInventory().setItem(8, netherStar);
    }
}
