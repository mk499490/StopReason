package com.horizonbagel.stopreason;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by mk499490 on 2017/01/08.
 */
public class Main extends JavaPlugin{
    @Override
    public void onEnable(){
        this.getCommand("stop").setExecutor(new StopReason());
        this.getLogger().info("Plugin has been enabled!");
    }

    @Override
    public void onDisable(){
        this.getLogger().info("Plugin has been disabled!");
    }
}
