package com.minecraftheads.pluginUtils.inventory;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class InventoryCreator {
    private Inventory inv;

    /**
     * Constructor
     */
    public InventoryCreator(String title) {
        this.inv = Bukkit.createInventory(null, 54, title);
        setWatermark();
    }

    /**
     * Set items in custom Inventory
     * @param slot int
     * @param item ItemStack
     */
    public void addItem(int slot, ItemStack item) {
        this.inv.setItem(slot, item);
    }

    /**
     * Set MCHeads Watermark
     */
    private void setWatermark() {
        ItemStack item = new ItemStack(Material.PUFFERFISH, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("www.minecraft-heads.com");
        item.setItemMeta(meta);
        this.inv.setItem(53, item);
    }

    /**
     * Open the inventory for given player
     *
     * @param player Player
     */
    public void openInventory(Player player) {
        player.openInventory(this.inv);
        InventoryStorage.addInventory(inv);
    }
}