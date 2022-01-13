# LanguageHandler
### How to use it:
On startup: set the plugin where the handler shall lookup the language files and config:
```
import com.minecraftheads.pluginUtils.config.LanguageHandler;

public final class PseudoPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        LanguageHandler.setPlugin(this);
    }

}
```



Create an enum with the path value of the message.

Here is an example:

```
import com.minecraftheads.pluginUtils.config.LanguageHandler;

public enum LanguageMapping {
    PREFIX("prefix"),
    ERROR_INVALID_COMMAND_SENDER("error_invalid_command_sender")
    ;

    private final String path;

    LanguageMapping(String path) {
        this.path = path;
    }

    public String getString() {
        return LanguageHandler.getString(path);
    }
    public String getStringWithPrefix() {
        return LanguageMapping.PREFIX.getString() + " " + LanguageHandler.getString(path);
    }
}
```

To get the value of it (in the correct language):
```
LanguageMapping.PREFIX.getString();
```

:warning:
you need to put the config value `language` into the config.yml like this:
```
language: en
```


For detailed usage check out: LeatherColoriser