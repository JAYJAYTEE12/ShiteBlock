package com.jayjaytee.ripoff.skyblock.shiteblock.events;

import de.tr7zw.nbtapi.NBTItem;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class NetherStarPrevention implements Listener {

    @EventHandler
    public void onDrop(PlayerDropItemEvent event){

        ItemStack item = event.getItemDrop().getItemStack();
        if(item == null || item.equals(Material.AIR)){
            return;
        }
        NBTItem nbt = new NBTItem(item);
        if(nbt.getBoolean("isNetherStar")){
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onClick(InventoryClickEvent event){
        if(event.getWhoClicked() instanceof Player && event.getClickedInventory() != null) {
            List<ItemStack> items = new ArrayList<>();
            items.add(event.getCurrentItem());
            items.add(event.getCursor());
            items.add((event.getClick() == org.bukkit.event.inventory.ClickType.NUMBER_KEY) ? event.getWhoClicked().getInventory().getItem(event.getHotbarButton()) : event.getCurrentItem());
            for(ItemStack item : items) {
                if(item != null && item.hasItemMeta()) {
                    NBTItem nbt = new NBTItem(item);
                    if(nbt.getBoolean("isNetherStar")){
                        event.setCancelled(true);
                    }
                }
            }
        }
    }

}
