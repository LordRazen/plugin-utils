package com.minecraftheads.pluginUtils.heads;

import com.minecraftheads.pluginUtils.utils.Logger;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.profile.PlayerProfile;
import org.bukkit.profile.PlayerTextures;

import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.UUID;

public class HeadCreator {

    /**
     * Get a custom head based on the base64 data provided from Minecraft-Heads
     *
     * @param textureURL Texture URL value to use
     * @return Created skull
     */
    public static ItemStack getHead(String textureURL) {
        ItemStack head = new ItemStack(Material.PLAYER_HEAD);
        if (textureURL == null || textureURL.isEmpty()) {
            return head;
        }
        SkullMeta headMeta = (SkullMeta) head.getItemMeta();

        PlayerProfile pp = Bukkit.createPlayerProfile(UUID.randomUUID());
        PlayerTextures pt = pp.getTextures();
        try {
            pt.setSkin(new URL(textureURL));
        } catch (MalformedURLException e) {
            Logger.severe(e.toString());
        }
        pp.setTextures(pt);
        headMeta.setOwnerProfile(pp);
        head.setItemMeta(headMeta);
        return head;
    }
}