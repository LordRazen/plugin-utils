package com.minecraftheads.pluginUtils.utils;

import org.bukkit.Bukkit;

public class Logger {
    private static String pluginPrefix;

    public static void setPrefix(String prefix) {pluginPrefix = prefix;}

    public static void info(String msg) {
        if (pluginPrefix != null) {
            Bukkit.getLogger().info(pluginPrefix + " " + msg);
        } else {
            Bukkit.getLogger().info(msg);
        }
    }
    public static void warning(String msg) {
        if (pluginPrefix != null) {
            Bukkit.getLogger().warning(pluginPrefix + " " + msg);
        } else {
            Bukkit.getLogger().warning(msg);
        }
    }
    public static void severe(String msg) {
        if (pluginPrefix != null) {
            Bukkit.getLogger().severe(pluginPrefix + " " + msg);
        } else {
            Bukkit.getLogger().severe(msg);
        }
    }
}
