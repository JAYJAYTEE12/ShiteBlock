package com.jayjaytee.ripoff.skyblock.shiteblock;

import com.jayjaytee.ripoff.skyblock.shiteblock.events.ItemPickupEvent;
import com.jayjaytee.ripoff.skyblock.shiteblock.events.NetherStarLogicEvent;
import com.jayjaytee.ripoff.skyblock.shiteblock.events.NetherStarPrevention;
import com.jayjaytee.ripoff.skyblock.shiteblock.events.PlayerJoinEvent;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class ShiteBlock extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getConsoleSender().sendMessage("This shit enabled!");
        registerEvents();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage("This shit disabled!");
    }

    private void registerEvents(){
        getServer().getPluginManager().registerEvents(new PlayerJoinEvent(), this);
        getServer().getPluginManager().registerEvents(new NetherStarPrevention(), this);
        getServer().getPluginManager().registerEvents(new NetherStarLogicEvent(), this);
        getServer().getPluginManager().registerEvents(new ItemPickupEvent(this), this);
    }
}
