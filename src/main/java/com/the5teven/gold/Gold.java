package com.the5teven.gold;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

public final class Gold extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new events(),this);
        BukkitTask task = new tasks(this.getServer()).runTaskTimer(this,0,20);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[Gold Plugin] Plugin Enabled");


    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[Gold Plugin] Plugin Disabled");

    }
}
