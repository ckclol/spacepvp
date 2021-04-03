package pvp.space;

import org.bukkit.command.CommandExecutor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class spacepvp extends JavaPlugin implements Listener, CommandExecutor {

    FileConfiguration config = this.getConfig();
    @Override
    public void onEnable() {
        config.addDefault("sumo", false);
        config.addDefault("uhc", false);
        config.addDefault("barrier", false);
        config.addDefault("fly", true);
        config.addDefault("(barrier) jump boost", 1);
        config.addDefault("spd", false);
        config.addDefault("spdvalue", 1);
        config.options().copyDefaults(true);
        this.saveConfig();
    }

    @Override
    public void onDisable() {

    }
}
