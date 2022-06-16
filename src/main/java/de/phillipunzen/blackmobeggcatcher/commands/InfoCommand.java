 package de.phillipunzen.blackmobeggcatcher.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class InfoCommand implements CommandExecutor {

    JavaPlugin plugin;

    public InfoCommand(JavaPlugin plugin)
    {
        this.plugin = plugin;
    }
    /*
    Funktion die ausgeführt wird, wenn ein Befehl abgesetzt wird.
    Überprüft dann, ob der Befehl eggcatcher als Prefix hat.
    Wenn dies auch erfüllt ist, dann wird überprüft ob der Befehl info oder help hat.
    Dementsprechend wird der Text an den Sender zurückgegeben.
     */
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(command.getName().toString().equals("eggcatcher"))
        {
            if(args[0].toString().equals("info"))
            {
                sender.sendMessage(ChatColor.DARK_PURPLE + "" + ChatColor.UNDERLINE + "============================================================");
                sender.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "Plugin Name: " + ChatColor.RESET + "" + ChatColor.GOLD + "BlackMobEggCatcher");
                sender.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "Plugin Author: " + ChatColor.RESET + "" + ChatColor.GOLD + "Phillip Unzen (Ingame: Blackiiiii)");
                sender.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "Version: " + ChatColor.RESET + "" + ChatColor.GOLD + "v1.0");
                sender.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "Help: " + ChatColor.RESET + "" + ChatColor.GOLD + "/eggcatcher help");
                sender.sendMessage(ChatColor.DARK_PURPLE + "" + ChatColor.UNDERLINE + "============================================================");
            } else if(args[0].toString().equals("help"))
            {
                sender.sendMessage(ChatColor.DARK_PURPLE + "" + ChatColor.UNDERLINE + "=========================== Help ===========================");
                sender.sendMessage((ChatColor.GOLD + "" + ChatColor.BOLD + "How to catch: " + ChatColor.RESET + "Throw a egg to a mob. If you have the permission to catch the mob, the cost of some " + plugin.getConfig().getString("ItemToCatch").toString() + " will get out of your inventory and the spawnegg drops at the position from the mob."));
                sender.sendMessage(ChatColor.DARK_PURPLE + "" + ChatColor.UNDERLINE + "============================================================");
            }
        }
        return true;
    }
}
