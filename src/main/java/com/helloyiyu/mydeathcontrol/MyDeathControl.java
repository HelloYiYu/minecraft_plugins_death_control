package com.helloyiyu.mydeathcontrol;

import org.bukkit.plugin.java.JavaPlugin;

public final class MyDeathControl extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new MyDeathControlListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
