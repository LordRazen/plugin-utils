package com.minecraftheads.pluginUtils.inventory;

import org.bukkit.inventory.Inventory;

import java.util.ArrayList;
import java.util.List;

public class InventoryStorage {
    private final static List<Inventory> InventoryList = new ArrayList<>();

    public static void addInventory(Inventory i) {
        InventoryList.add(i);
    }

    public static void removeInventory(Inventory i) {
        InventoryList.remove(i);
    }

    public static List<Inventory> getInventory() {
        return InventoryList;
    }
}
