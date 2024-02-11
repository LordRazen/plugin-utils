package com.minecraftheads.pluginUtils.config;

import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.OfflinePlayer;
import org.bukkit.configuration.Configuration;
import org.bukkit.configuration.ConfigurationOptions;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.Vector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ConfigReader implements Configuration {
    private static FileConfiguration config;

    public ConfigReader(Plugin p) {
        config = p.getConfig();
    }

    @Override
    public @NotNull Set<String> getKeys(boolean deep) {
        return config.getKeys(deep);
    }

    @Override
    public @NotNull Map<String, Object> getValues(boolean deep) {
        return config.getValues(deep);
    }

    @Override
    public boolean contains(@NotNull String path) {
        return config.contains(path);
    }

    @Override
    public boolean contains(@NotNull String path, boolean ignoreDefault) {
        return config.contains(path, ignoreDefault);
    }

    @Override
    public boolean isSet(@NotNull String path) {
        return config.isSet(path);
    }

    @Override
    public String getCurrentPath() {
        return config.getCurrentPath();
    }

    @Override
    public @NotNull String getName() {
        return config.getName();
    }

    @Override
    public Configuration getRoot() {
        return config.getRoot();
    }

    @Override
    public ConfigurationSection getParent() {
        return config.getParent();
    }

    @Override
    public Object get(@NotNull String path) {
        return config.get(path);
    }

    @Override
    public Object get(@NotNull String path, Object def) {
        return config.get(path, def);
    }

    @Override
    public void set(@NotNull String path, Object value) {
        config.set(path, value);
    }

    @Override
    public @NotNull ConfigurationSection createSection(@NotNull String path) {
        return config.createSection(path);
    }

    @Override
    public @NotNull ConfigurationSection createSection(@NotNull String path, @NotNull Map<?, ?> map) {
        return config.createSection(path, map);
    }

    @Override
    public String getString(@NotNull String path) {
        return config.getString(path);
    }

    @Override
    public String getString(@NotNull String path, String def) {
        return config.getString(path, def);
    }

    @Override
    public boolean isString(@NotNull String path) {
        return config.isString(path);
    }

    @Override
    public int getInt(@NotNull String path) {
        return config.getInt(path);
    }

    @Override
    public int getInt(@NotNull String path, int def) {
        return config.getInt(path, def);
    }

    @Override
    public boolean isInt(@NotNull String path) {
        return config.isInt(path);
    }

    @Override
    public boolean getBoolean(@NotNull String path) {
        return config.getBoolean(path);
    }

    @Override
    public boolean getBoolean(@NotNull String path, boolean def) {
        return config.getBoolean(path, def);
    }

    @Override
    public boolean isBoolean(@NotNull String path) {
        return config.isBoolean(path);
    }

    @Override
    public double getDouble(@NotNull String path) {
        return config.getDouble(path);
    }

    @Override
    public double getDouble(@NotNull String path, double def) {
        return config.getDouble(path, def);
    }

    @Override
    public boolean isDouble(@NotNull String path) {
        return config.isDouble(path);
    }

    @Override
    public long getLong(@NotNull String path) {
        return 0;
    }

    @Override
    public long getLong(@NotNull String path, long def) {
        return 0;
    }

    @Override
    public boolean isLong(@NotNull String path) {
        return false;
    }

    @Override
    public List<?> getList(@NotNull String path) {
        return null;
    }

    @Override
    public List<?> getList(@NotNull String path, List<?> def) {
        return null;
    }

    @Override
    public boolean isList(@NotNull String path) {
        return false;
    }

    @Override
    public @NotNull List<String> getStringList(@NotNull String path) {
        return null;
    }

    @Override
    public @NotNull List<Integer> getIntegerList(@NotNull String path) {
        return null;
    }

    @Override
    public @NotNull List<Boolean> getBooleanList(@NotNull String path) {
        return null;
    }

    @Override
    public @NotNull List<Double> getDoubleList(@NotNull String path) {
        return null;
    }

    @Override
    public @NotNull List<Float> getFloatList(@NotNull String path) {
        return null;
    }

    @Override
    public @NotNull List<Long> getLongList(@NotNull String path) {
        return null;
    }

    @Override
    public @NotNull List<Byte> getByteList(@NotNull String path) {
        return null;
    }

    @Override
    public @NotNull List<Character> getCharacterList(@NotNull String path) {
        return null;
    }

    @Override
    public @NotNull List<Short> getShortList(@NotNull String path) {
        return null;
    }

    @Override
    public @NotNull List<Map<?, ?>> getMapList(@NotNull String path) {
        return null;
    }

    @Override
    public <T> T getObject(@NotNull String path, @NotNull Class<T> clazz) {
        return null;
    }

    @Override
    public <T> T getObject(@NotNull String path, @NotNull Class<T> clazz, T def) {
        return null;
    }

    @Override
    public <T extends ConfigurationSerializable> T getSerializable(@NotNull String path, @NotNull Class<T> clazz) {
        return null;
    }

    @Override
    public <T extends ConfigurationSerializable> T getSerializable(@NotNull String path, @NotNull Class<T> clazz, T def) {
        return null;
    }

    @Override
    public Vector getVector(@NotNull String path) {
        return null;
    }

    @Override
    public Vector getVector(@NotNull String path, Vector def) {
        return null;
    }

    @Override
    public boolean isVector(@NotNull String path) {
        return false;
    }

    @Override
    public OfflinePlayer getOfflinePlayer(@NotNull String path) {
        return null;
    }

    @Override
    public OfflinePlayer getOfflinePlayer(@NotNull String path, OfflinePlayer def) {
        return null;
    }

    @Override
    public boolean isOfflinePlayer(@NotNull String path) {
        return false;
    }

    @Override
    public ItemStack getItemStack(@NotNull String path) {
        return null;
    }

    @Override
    public ItemStack getItemStack(@NotNull String path, ItemStack def) {
        return null;
    }

    @Override
    public boolean isItemStack(@NotNull String path) {
        return false;
    }

    @Override
    public Color getColor(@NotNull String path) {
        return null;
    }

    @Override
    public Color getColor(@NotNull String path, Color def) {
        return null;
    }

    @Override
    public boolean isColor(@NotNull String path) {
        return false;
    }

    @Override
    public Location getLocation(@NotNull String path) {
        return null;
    }

    @Override
    public Location getLocation(@NotNull String path, Location def) {
        return null;
    }

    @Override
    public boolean isLocation(@NotNull String path) {
        return config.isLocation(path);
    }

    @Override
    public ConfigurationSection getConfigurationSection(@NotNull String path) {
        return config.getConfigurationSection(path);
    }

    @Override
    public boolean isConfigurationSection(@NotNull String path) {
        return config.isConfigurationSection(path);
    }

    @Override
    public ConfigurationSection getDefaultSection() {
        return config.getDefaultSection();
    }

    @Override
    public void addDefault(@NotNull String path, Object value) {
        config.addDefault(path, value);
    }

    @NotNull
    @Override
    public List<String> getComments(@NotNull String s) {
        return null;
    }

    @NotNull
    @Override
    public List<String> getInlineComments(@NotNull String s) {
        return null;
    }

    @Override
    public void setComments(@NotNull String s, @Nullable List<String> list) {

    }

    @Override
    public void setInlineComments(@NotNull String s, @Nullable List<String> list) {

    }

    @Override
    public void addDefaults(@NotNull Map<String, Object> defaults) {
        config.addDefaults(defaults);
    }

    @Override
    public void addDefaults(@NotNull Configuration defaults) {
        config.addDefaults(defaults);
    }

    @Override
    public void setDefaults(@NotNull Configuration defaults) {
        config.setDefaults(defaults);
    }

    @Override
    public Configuration getDefaults() {
        return config.getDefaults();
    }

    @Override
    public @NotNull ConfigurationOptions options() {
        return config.options();
    }
}
