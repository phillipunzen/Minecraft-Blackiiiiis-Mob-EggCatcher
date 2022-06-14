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
    private final double fileConfigVersion;
    private final double configVersion = 1.0;
    FileConfiguration config;

    //Überprüfe die Version der Konfigurationsdatei
    public ConfigChecker(JavaPlugin plugin)
    {

        fileConfigVersion = plugin.getConfig().getDouble("ConfigurationVersion", 0.0);
        if (fileConfigVersion == configVersion)
        {
            plugin.saveConfig();
        } else {
            plugin.saveResource("config.yml", true);
        }
    }

    //Überprüft ob Konfigurationsdatei vorhanden ist, und gibt dann den entsprechenden bool Wert zurück.
    public boolean isConfigFileCorrect()
    {
        if(fileConfigVersion == configVersion)
        {
            return true;
        } else {
            return false;
        }

    }
}
