package com.helloyiyu.mydeathcontrol;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class MyDeathControlListener implements Listener {

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        Player player = event.getEntity();
        event.getEntity().sendMessage(player.getName() + " dead and lost all his experience T_T");
        event.setKeepInventory(true);
        event.getDrops().clear();
        event.setKeepLevel(false);
        event.setDroppedExp(event.getDroppedExp());
    }
}
