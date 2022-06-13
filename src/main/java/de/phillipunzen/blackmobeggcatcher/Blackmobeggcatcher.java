/*
Plugin Name: Black Mob Egg Catcher
Author: Blackiiiii (Phillip Unzen)
Copyright: 2022
Contact: development@phillipunzen.de
 */

package de.phillipunzen.blackmobeggcatcher;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Blackmobeggcatcher extends JavaPlugin {

    //Prefix für Log Meldungen in der Konsole
    public static String PREFIX = ChatColor.YELLOW + "[" + ChatColor.GOLD + "Egg-Catcher" + ChatColor.YELLOW + "]" + ChatColor.WHITE;

    /*TODO
    1. Erstellen der ENUM Klasse für die einzelnen Mobs
    2. Programmieren der Events
    3. Events registrieren
    4. Konfigurationsdatei einlesen und erstellen
    5. Programm Logik generell
     */




    @Override
    public void onEnable() {
        // Plugin startup logic
        sendLog("Plugin wurde gestartet und aktiviert!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        sendLog("Plugin wurde heruntergefahren und deaktiviert!");
    }

    // Plugin gibt Text (Parameter) in der Konsole aus.
    public void sendLog(String message)
    {
        Bukkit.getConsoleSender().sendMessage(PREFIX + message);
    }
}
