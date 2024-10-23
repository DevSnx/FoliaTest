package de.devsnx.xaldrion.lobbysystem;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import de.devsnx.xaldrion.lobbysystem.listener.PlayerJoinListener;

public final class Lobbysystem extends JavaPlugin {

    public static Lobbysystem instance;

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;

        // Use Bukkit's logging instead of System.out
        getLogger().info("Lobbysystem loaded!");

        loadEvents();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        instance = null;
        getLogger().info("Lobbysystem disabled.");
    }

    private void loadEvents() {
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new PlayerJoinListener(), this);
    }

    public static Lobbysystem getInstance() {
        return instance;
    }
}