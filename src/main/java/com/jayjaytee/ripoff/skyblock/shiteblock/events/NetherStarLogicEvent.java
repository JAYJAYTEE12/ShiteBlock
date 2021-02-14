package com.jayjaytee.ripoff.skyblock.shiteblock.events;

import com.jayjaytee.ripoff.skyblock.shiteblock.utils.ItemCreator;
import de.tr7zw.nbtapi.NBTItem;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryInteractEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class NetherStarLogicEvent implements Listener {
    @EventHandler
    public void onClick(PlayerInteractEvent event){
        Player player = event.getPlayer();
        if(event.getItem() == null || event.getItem().equals(Material.AIR)){
            return;
        }
        NBTItem nbt = new NBTItem(player.getInventory().getItemInMainHand());
        if(nbt.getBoolean("isNetherStar")){
            if(event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK){
                event.setCancelled(true);
                // Open the GUI

                Inventory inventory = Bukkit.createInventory(player, 6*9, "ShiteBlock Menu");

                for(int i=0; i < 54; i++){
                    inventory.setItem(i, new ItemStack(ItemCreator.createItem(Material.GRAY_STAINED_GLASS_PANE, 1, true, "&7", 0)));
                }

                inventory.setItem(13, new ItemStack(ItemCreator.getPlayerHead(player, 1, "&aYour ShiteBlock Profile",
                        "&c  ❤ Health &f100 HP",
                        "&a  ❈ Defense &f100",
                        "&c  ❁ Strength &f0",
                        "&f  ✦ Speed 100",
                        "&9  ☣ Crit Chance &f0%",
                        "&9  ☠ Crit Damage &f0%",
                        "&b  ✎ Intelligence &f100",
                        "&6     Mining Speed &f0",
                        "&3  α Sea Creature Chance &f20%",
                        "&b  ✯ Magic Find &f1",
                        "&d  ♣ Pet Luck &f10",
                        "&f",
                        "&eClick to view your profile!")));
                inventory.setItem(19, new ItemStack(ItemCreator.createItem(Material.DIAMOND_SWORD, 1, true, "&aYour Skills", 0,
                        "&7View your Skill progression and",
                        "&7rewards.",
                        "&7",
                        "&eClick to hide rankings!")));
                inventory.setItem(20, new ItemStack(ItemCreator.createItem(Material.PAINTING, 1, true, "&aCollection", 0,
                        "&7View all of the items available",
                        "&7in ShiteBlock. Collect more of an",
                        "&7item to unlock rewards on your",
                        "&7way to becoming a master of",
                        "&7ShiteBlock!",
                        "&7",
                        "&7Collection Unlocked: &e0&6%",
                        "&7------------------- &e0&6/&e60",
                        "&7",
                        "&eClick to view!")));
                inventory.setItem(21, new ItemStack(ItemCreator.createItem(Material.BOOK, 1, true, "&aRecipe Book", 0,
                        "&7Through your adventure, you will",
                        "&7unlock recipes for all kinds of ",
                        "&7special items! You can view how ",
                        "&7to craft these items here.",
                        "&7",
                        "&7Recipe Book Unlocked: &e0&6%",
                        "&7------------------- &e0&6/&e694",
                        "&7",
                        "&eClick to view!")));
                inventory.setItem(22, new ItemStack(ItemCreator.createItem(Material.EMERALD, 1, true, "&aTrades", 0,
                        "&7View your available trades.",
                        "&7These trades are always",
                        "&7available and accessible through",
                        "&7the ShiteBlock Menu.",
                        "&7",
                        "&7Trades Unlocked: &e50&6%",
                        "&7------------------- &e0&6/&e26",
                        "&7",
                        "&eClick to view!")));
                inventory.setItem(23, new ItemStack(ItemCreator.createItem(Material.WRITABLE_BOOK, 1, true, "&aQuest Log", 0,
                        "&7View your active quests,",
                        "&7progress, and rewards.",
                        "&7",
                        "&eClick to view!")));
                inventory.setItem(24, new ItemStack(ItemCreator.createItem(Material.CLOCK, 1, true, "&aCalendar and Events", 0,
                        "&7View the ShiteBlock Calendar,",
                        "&7upcoming events and event",
                        "&7rewards!",
                        "&7",
                        "&7Next Event: &bPoop Event",
                        "&7Starting in: &e1d 2h 44m 37s",
                        "&7",
                        "&eClick to view!")));
                inventory.setItem(25, new ItemStack(ItemCreator.createItem(Material.ENDER_CHEST, 1, true, "&aEnder Chest", 0,
                        "&7Store global items that you want",
                        "&7to access at any time from",
                        "&7anywhere here.",
                        "&7",
                        "&eClick to view!")));
                inventory.setItem(29, new ItemStack(ItemCreator.createItem(Material.POTION, 1, true, "&aActive Effects", 0,
                        "&7View and manage all of your",
                        "&7active potion effects.",
                        "&7",
                        "&7Drink Potions or splash them",
                        "&7on the ground to buff yourself!",
                        "&7",
                        "&7Currently Active: &e0",
                        "&7",
                        "&eClick to view!")));
                inventory.setItem(30, new ItemStack(ItemCreator.createItem(Material.BONE, 1, true, "&aPets", 0,
                        "&7View and manage all of your",
                        "&7Pets.",
                        "&7",
                        "&7Level up your pets faster by",
                        "&7gaining xp in their favorite",
                        "&7skill!",
                        "&7",
                        "&7Selected pet: &eNone",
                        "&7",
                        "&eClick to view!")));
                inventory.setItem(31, new ItemStack(ItemCreator.createItem(Material.CRAFTING_TABLE, 1, true, "&aCrafting Table", 0,
                        "&7Opens the crafting grid.",
                        "&7",
                        "&eClick to open!")));
                inventory.setItem(32, new ItemStack(ItemCreator.createItem(Material.LEATHER_CHESTPLATE, 1, true, "&aWardrobe", 0,
                        "&7Store armor sets and quickly",
                        "&7swap between them!",
                        "&7",
                        "&eClick to view!")));
                inventory.setItem(47, new ItemStack(ItemCreator.createItem(Material.PLAYER_HEAD, 1, true, "&bFast Travel", 0,
                        "&7Teleport to islands you've",
                        "&7already visited.",
                        "&7",
                        "&eClick to pick location!")));
                inventory.setItem(48, new ItemStack(ItemCreator.createItem(Material.NAME_TAG, 1, true, "&aProfile Management", 0,
                        "&7You can have multiple",
                        "&7ShiteBlock profiles at the",
                        "&7same time.",
                        "&7",
                        "&7Each profile has its own",
                        "&7island, inventory, quest",
                        "&7log...",
                        "&7",
                        "&7Profiles: &e1&6/&e1",
                        "&7Playing on: &aPoop",
                        "&7",
                        "&bPlay with friends using /coop!",
                        "&7",
                        "&eClick to manage!")));
                inventory.setItem(49, new ItemStack(ItemCreator.createItem(Material.BARRIER, 1, true, "&cClose", 0, "&7")));
                inventory.setItem(50, new ItemStack(ItemCreator.createItem(Material.REDSTONE_TORCH, 1, true, "&aSettings", 0,
                        "&7View and edit your ShiteBlock",
                        "&7settings.",
                        "&7",
                        "&eClick to view!")));
                inventory.setItem(53, new ItemStack(ItemCreator.createItem(Material.PLAYER_HEAD, 1, true, "&aAccessory Bag", 0,
                        "&7A special bag which can hold",
                        "&7Talismans, Rings, Artifacts and",
                        "&7Orbs within it. All will still",
                        "&7work while in this bag!",
                        "&7",
                        "&eClick to open!")));


                player.openInventory(inventory);
            }
        }
    }

    @EventHandler
    private void onInvClick(InventoryClickEvent event){
        Player player = (Player) event.getWhoClicked();
        if(player.getOpenInventory().getTitle().equals("ShiteBlock Menu")){
            event.setCancelled(true);
        }
    }
}
