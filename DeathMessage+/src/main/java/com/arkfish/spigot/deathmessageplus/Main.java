package com.arkfish.spigot.deathmessageplus;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    FileConfiguration cf = getConfig();
    DeathMessages messages = new DeathMessages();

    @Override
    public void onEnable() {
        System.out.println(ChatColor.GREEN + "DeathMessagePlus on!");
        getServer().getPluginManager().registerEvents(new Event(), this);
    }

    @Override
    public void onDisable() {
        System.out.println(ChatColor.RED + "DeathMessagePlus off!");
        this.saveConfig();
    }
}
