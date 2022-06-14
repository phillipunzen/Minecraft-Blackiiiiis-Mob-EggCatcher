package de.phillipunzen.blackmobeggcatcher.listeners;

import de.phillipunzen.blackmobeggcatcher.events.ReplaceMobWithSpawneggEvent;
import de.phillipunzen.blackmobeggcatcher.types.SpawnEggTypes;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class MobHitByEggListener implements Listener
{
    private JavaPlugin plugin;

    public MobHitByEggListener(JavaPlugin plugin)
    {
        this.plugin = plugin;
    }

    //Methode des Listeners
    @EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
    public void onEntityDamage(EntityDamageByEntityEvent event)
    {
        //Überprüfe ob das Event aus einem Entity schadet Entity entsteht
        if(event instanceof EntityDamageByEntityEvent)
        {
            if(! (SpawnEggTypes.getSpawnItemType(event.getEntity()) == null))
            {
                ReplaceMobWithSpawneggEvent replaceMobEvent = new ReplaceMobWithSpawneggEvent(plugin, event);
                replaceMobEvent.runEvent();
            }
        }
    }
}
