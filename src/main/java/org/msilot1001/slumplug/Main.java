package org.msilot1001.slumplug;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import redis.clients.jedis.JedisPool;


public class Main extends JavaPlugin {
    public static JedisPool pool;
    private static Main plugin;

    @Override
    public void onLoad() {
        plugin = this;
    }

    @Override
    public void onEnable() {
        new ButtonEvent(this);

        Bukkit.getLogger().info("§6§l[SLUMPLUG] SLUM PLUGIN §9ENABLED");
        pool = new JedisPool("localhost", 9999 /* Port */);
    }

    @Override
    public void onDisable() {
        pool.close();
        Bukkit.getLogger().info("§6§l[SLUMPLUG] SLUM PLUGIN §cDISABLED");
    }
}
