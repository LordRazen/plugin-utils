# HeadCreator
### How to use it:
Create a enum with the base64 value of the head found on [Minecraft-Heads](https://minecraft-heads.com).
Here is an example:
```
import com.minecraftheads.pluginUtils.heads.HeadCreator;
import org.bukkit.inventory.ItemStack;

public enum CustomHeads {
    RANDOM("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZThhNDZjNGM1NWFlNzFmMzk3ZjZlMDk2ZWFmNzFkZDdhNmQzYmZlYTQzMjI5OTgxNDkzZDgxYzc2NGJiOTIyMCJ9fX0=")
    ;

    private final ItemStack itemStack;

    CustomHeads(String base64) {
        itemStack = HeadCreator.getHead(base64);
    }

    public ItemStack asItemStack() {
        return itemStack.clone();
    }
}
```

To get the head as ItemStack you can use:
```
CustomHeads.RANDOM.asItemStack();
```