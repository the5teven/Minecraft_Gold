package com.the5teven.gold;

import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

public class tasks extends BukkitRunnable{
    Server server;

    public tasks(Server server){
        this.server = server;
    }
    public void Golditem(ItemStack item){
        if (item != null) {
            if (item.getType().name().equals("APPLE")) {
                item.setType(Material.GOLDEN_APPLE);
            } else if (item.getType().name().equals("MELON_SLICE")) {
                item.setType(Material.GLISTERING_MELON_SLICE);
            } else if (item.getType().name().equals("CARROT")) {
                item.setType(Material.GOLDEN_CARROT);
            } else if (item.getType().name().contains("_AXE")) {
                item.setType(Material.GOLDEN_AXE);
            } else if (item.getType().name().contains("_PICKAXE")) {
                item.setType(Material.GOLDEN_PICKAXE);
            } else if (item.getType().name().contains("_SHOVEL")) {
                item.setType(Material.GOLDEN_SHOVEL);
            } else if (item.getType().name().contains("_SWORD")) {
                item.setType(Material.GOLDEN_SWORD);
            } else if (item.getType().name().contains("_HOE")) {
                item.setType(Material.GOLDEN_HOE);
            } else if (item.getType().name().contains("_HORSE_ARMOR")) {
                item.setType(Material.GOLDEN_HORSE_ARMOR);
            } else if (item.getType().name().contains("_HELMET")) {
                item.setType(Material.GOLDEN_HELMET);
            } else if (item.getType().name().contains("_LEGGINGS")) {
                item.setType(Material.GOLDEN_LEGGINGS);
            } else if (item.getType().name().contains("_BOOTS")) {
                item.setType(Material.GOLDEN_BOOTS);
            } else if (item.getType().name().contains("_CHESTPLATE")) {
                item.setType(Material.GOLDEN_CHESTPLATE);
            } else if (item.getType().name().contains("_INGOT")) {
                item.setType(Material.GOLD_INGOT);
            } else if (item.getType().name().contains("_NUGGET")) {
                item.setType(Material.GOLD_NUGGET);
            } else if (item.getType().name().contains("_ORE")) {
                item.setType(Material.GOLD_ORE);
            } else if (item.getType().name().contains("_BLOCK")) {
                item.setType(Material.GOLD_BLOCK);
            }
        }
    }
    public void run(){
        for(Player player : server.getOnlinePlayers()){
            for (ItemStack item: player.getInventory().getContents()){
                Golditem(item);
            }
        }
    }

}
