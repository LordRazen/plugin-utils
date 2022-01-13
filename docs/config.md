# ConfigUpdater
### How to use it:
Pass the config name to the updater.

:warning: The config has to exist before doing this

Here is an example where it updates the config and a language file:
```
public final class PseudoPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        checkConfig();
        // Plugin startup logic

    }


    private void checkConfig() {
        //The config needs to exist before using the updater
        saveDefaultConfig();
        File langDir = new File(this.getDataFolder(), "languages/");
        if (!langDir.exists()) {
            langDir.mkdir();
        }
        this.saveResource("languages/en.yml", false);

        // try to run the updater and then reload the files
        try {
            File configFile = new File(getDataFolder(), "config.yml");
            ConfigUpdater.update(this, "config.yml", configFile, Collections.emptyList());
            configFile = new File(getDataFolder(), "languages/en.yml");
            ConfigUpdater.update(this, "languages/en.yml", configFile, Collections.emptyList());
        } catch (IOException e) {
            e.printStackTrace();
        }

        reloadConfig();

    }
}
```