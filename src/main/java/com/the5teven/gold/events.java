package com.the5teven.gold;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.bukkit.event.inventory.*;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerSwapHandItemsEvent;
import org.bukkit.inventory.ItemStack;

public class events implements Listener {
    private void Golditem(ItemStack item){
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

    private void GoldBlock(Block block){
        Material mat = block.getType();
        if (mat.name().contains("_ORE")) {
            block.setType(Material.GOLD_ORE);
        }else if (mat.name().contains("_BLOCK")) {
            block.setType(Material.GOLD_BLOCK);
        }
    }

    @EventHandler
    public void onInventoryClickEvent(InventoryClickEvent event) {
        for (ItemStack item :event.getWhoClicked().getInventory().getContents()){
            Golditem(item);
        }
    }

    @EventHandler
    public void onInventoryClickEvent(EntityPickupItemEvent event) {
        ItemStack item  = event.getItem().getItemStack();
        Golditem(item);
    }

    @EventHandler
    public void onHand(PlayerItemHeldEvent event) {
        ItemStack item = event.getPlayer().getInventory().getItem(event.getNewSlot());
        Golditem(item);
        }


    @EventHandler
    public void onMove(PlayerMoveEvent event) {
        Location loc = event.getPlayer().getLocation();
        loc.setY(loc.getY() - 1);
        Block block = loc.getBlock();
        GoldBlock(block);
    }
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        if( event.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.AIR)){
            if(event.getAction().equals(Action.LEFT_CLICK_BLOCK)){
           Block block = event.getClickedBlock();
           GoldBlock(block);
        }
        }
    }

    @EventHandler
    public void onPlayerSwapHandItems(PlayerSwapHandItemsEvent event){
        ItemStack item = event.getMainHandItem();
        Golditem(item);
        ItemStack item2 = event.getOffHandItem();
        Golditem(item2);}

}
