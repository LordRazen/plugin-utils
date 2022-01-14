package com.minecraftheads.pluginUtils.config;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

import java.io.File;

public class LanguageHandler {
    private static Plugin plugin;

    public static void setPlugin(Plugin p) {
        plugin = p;
    }


    /**
     * Fetches a string from the configured lang file
     *
     * @param section String
     * @return String
     */
    public static String getString(String section) {
        // Get language from config
        String lang = plugin.getConfig().getString("language");

        // Read corresponding language file
        YamlConfiguration langFile = YamlConfiguration.loadConfiguration(
                new File(plugin.getDataFolder(), "languages/" + lang + ".yml"));

        // Return the correct string
        return langFile.getString(section);
    }
}
