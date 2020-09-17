package com.the5teven.gold;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Gold extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new events(),this);

        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[Gold Plugin] Plugin Enabled");


    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[Gold Plugin] Plugin Disabled");

    }
}
