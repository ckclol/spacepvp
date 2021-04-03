package pvp.space;

import org.bukkit.configuration.file.FileConfiguration;

public class Config {

    spacepvp sp = new spacepvp();
    FileConfiguration config = sp.getConfig();

    public void changeConfig() {
        config.addDefault("sumo", false);
        config.addDefault("uhc", false);
        config.addDefault("barrier", false);
        config.addDefault("fly", true);
        config.addDefault("(barrier) jump boost", 1);
        config.addDefault("spd", false);
        config.addDefault("spdvalue", 1);
        config.options().copyDefaults(true);
        sp.saveConfig();
    }

}
