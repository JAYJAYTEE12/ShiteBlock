package com.jayjaytee.ripoff.skyblock.shiteblock.events;

import com.jayjaytee.ripoff.skyblock.shiteblock.ShiteBlock;
import de.tr7zw.nbtapi.NBTItem;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;

public class ItemPickupEvent implements Listener {
    ShiteBlock plugin;
    public ItemPickupEvent(ShiteBlock plugin){
        this.plugin = plugin;
    }
    @EventHandler
    private void onPickup(EntityPickupItemEvent event){
        Player player = (Player) event.getEntity();
        ItemStack item = event.getItem().getItemStack();
        ItemMeta meta = item.getItemMeta();
        NBTItem nbt = new NBTItem(item);
        if(!nbt.hasKey("isSkyblockItem")){

        }
    }
}
