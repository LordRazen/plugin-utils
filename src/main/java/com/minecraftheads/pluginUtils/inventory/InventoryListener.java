package com.minecraftheads.pluginUtils.inventory;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;

public class InventoryListener implements Listener {
    /**
     * Remove inventory from inventoryHandler when an inventory is closed
     *
     * @param e InventoryCloseEvent
     */
    @EventHandler
    public void onInventoryClose(final InventoryCloseEvent e) {
        // TODO: cleanup of old selections when player leave? could result in memoryleak if server runs a long time
        // not possible yet, as we do not map players to inventoryHandler
        if (InventoryStorage.getInventory().contains(e.getView().getTopInventory())) {
            InventoryStorage.removeInventory(e.getView().getTopInventory());
        }
    }
}
