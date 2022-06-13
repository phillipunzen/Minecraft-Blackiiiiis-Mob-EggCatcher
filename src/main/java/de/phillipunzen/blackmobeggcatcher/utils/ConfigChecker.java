/*
Plugin Name: Black Mob Egg Catcher
Author: Blackiiiii (Phillip Unzen)
Copyright: 2022
Contact: development@phillipunzen.de
 */

package de.phillipunzen.blackmobeggcatcher.utils;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

//Überprüft die Konfiguration. Falls die Konfiguration älter ist, wird diese Ersetzt mit der aktuellen Konfiguration.
public class ConfigChecker {
    private final double configVersion;
    FileConfiguration config;
    JavaPlugin plugin;

    public ConfigChecker()
    {
        configVersion = plugin.getConfig().getDouble("ConfigurationVersion", 0.0);
        if (configVersion == 1.0)
        {
            plugin.saveConfig();
        } else {
            plugin.saveResource("config.yml", true);
        }
    }
}
