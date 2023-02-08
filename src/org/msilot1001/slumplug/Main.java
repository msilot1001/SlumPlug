package org.msilot1001.slumplug;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.getLogger().info("[SLUMPLUG] SLUM PLUGIN ENABLED");
        getServer().getPluginManager().registerEvents(new ButtonEvent(), this);
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("[SLUMPLUG] SLUM PLUGIN DISABLED");
    }
}
