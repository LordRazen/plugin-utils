# HeadCreator
### How to use it:
Create a enum with the texture URL of the head found on [Minecraft-Heads](https://minecraft-heads.com).
Here is an example:
```
import com.minecraftheads.pluginUtils.heads.HeadCreator;
import org.bukkit.inventory.ItemStack;

public enum CustomHeads {
    RANDOM("http://textures.minecraft.net/texture/e8a46c4c55ae71f397f6e096eaf71dd7a6d3bfea43229981493d81c764bb9220")
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