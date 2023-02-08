package org.msilot1001.slumplug;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class ButtonEvent implements Listener {
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        Player p = event.getPlayer();
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            Block clickedBlock = event.getClickedBlock();
            if (clickedBlock.getType() == Material.STONE_BUTTON) {
                p.sendMessage("Button Clicked!");
                Bukkit.getLogger().info(p.getName() + "pressed the button!");
            }
        }
    }
}
