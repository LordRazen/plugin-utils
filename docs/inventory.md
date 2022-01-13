# InventoryCreator
### How to use it:
Create a new Inventory, add ItemStacks to the wanted position and open it.

Here is an example:

```
import com.minecraftheads.pluginUtils.inventory.InventoryCreator;

public class InventoryCreatorBridge {

    /**
     * This is a bridge to pluginUtils.
     *
     * @param player Player
     */
    public InventoryCreatorBridge(Player player) {
        InventoryCreator inv = new InventoryCreator(LanguageMapping.TITLE.getString());
        inv.addItem(1, new ItemStack(Material.PLAYER_HEAD, 1);
        inv.openInventory(player);
    }
}
```

To identify if the player clicked in one of the custom inventories created by the utils use:

```
import com.minecraftheads.pluginUtils.inventory.InventoryStorage;

public class PsuedoCode implements Listener{
    /**
     * Cancel dragging in custom inventory
     *
     * @param e InventoryDragEvent
     */
    @EventHandler
    public void onInventoryClick(final InventoryDragEvent e) {
        if (InventoryStorage.getInventory().contains(e.getView().getTopInventory()))
            e.setCancelled(true);
    }
}
```

:warning: There will always be a watermark at pos 53 which points to MinecraftHeads