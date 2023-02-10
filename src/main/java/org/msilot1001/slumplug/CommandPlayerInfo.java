package org.msilot1001.slumplug;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class CommandPlayerInfo implements CommandExecutor {
    private Plugin plugin;

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            if (args.length < 1) {
                sender.sendMessage("Usage:");
                sender.sendMessage("  /playerinfo <name>");
                return true;
            }
            String key = args[0];
        }

        return false;
    }

    public CommandPlayerInfo(Main plugin) {
        this.plugin = plugin;
        plugin.getCommand("playerinfo").setExecutor(this);
    }
}
