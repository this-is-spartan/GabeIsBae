package me.vomet.gabeisbae.main;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.MapInitializeEvent;
import org.bukkit.map.MapView;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
        getCommand("quotegabe").setExecutor(new QuoteGabeCommand(this));

    }

    @EventHandler
    public void onMapInitialise(MapInitializeEvent e) {
        MapView map = e.getMap();
        map.getRenderers().clear();
        map.addRenderer(new Renderer());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
