package de.phillipunzen.blackmobeggcatcher.events;

import de.phillipunzen.blackmobeggcatcher.types.SpawnEggTypes;
import org.bukkit.entity.Egg;
import org.bukkit.entity.Entity;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class ReplaceMobWithSpawneggEvent {
    //Variablen Deklaration
    private JavaPlugin plugin;
    private EntityDamageByEntityEvent event;
    private Entity targetEntity;
    private Egg egg = null;
    private SpawnEggTypes type;

    //Konstruktor für die Event Klasse
    public ReplaceMobWithSpawneggEvent(JavaPlugin plugin, EntityDamageByEntityEvent event)
    {
        this.plugin = plugin;
        this.event = event;
        targetEntity = event.getEntity();
        this.type = SpawnEggTypes.getSpawnItemType(targetEntity);
    }

    public void runEvent()
    {
        if(checkDamagerIsEgg())
        {
            if(getCatchStatusPercentage())
            {
                replaceMobWithItem();
            }
        }
    }

    private boolean checkDamagerIsEgg()
    {
        if(event.getDamager() instanceof Egg)
        {
            return true;
        } else
        {
            return false;
        }
    }

    //Gibt zurück ob mit der Fangchance der Mob gefangen kann
    private boolean getCatchStatusPercentage()
    {
        //Beziehe Einstellung ob Fang Chance verwendet wird. Wenn ja, dann nutze den Zufallsgenerator. Ansonsten kann der Mob immer gefangen werden
        boolean usePercentageChance = plugin.getConfig().getBoolean("UsePercentageChance", false);
        if(usePercentageChance)
        {
            //Beziehe die Double Daten aus der Konfigurationsdatei mit der Fangchance
            //Methode gibt dann zurück ob das Mob gefangen werden kann oder nicht
            double catchChance = plugin.getConfig().getDouble("CatchChance." + type.getMobName());
            if (Math.random() * 100 > catchChance)
            {
                return false;
            } else
            {
                return true;
            }
        } else
        {
            return true;
        }
    }

    private void replaceMobWithItem()
    {
        //Entferne das Mob und setze dort eine Explosion
        targetEntity.remove();
        targetEntity.getWorld().createExplosion(targetEntity.getLocation(), 0);

        //Erhalte das Item des Spawneggs und drop es an dem Ort wo der Mob vorher stand
        ItemStack items = new ItemStack(type.getSpawnEggItemID());
        targetEntity.getWorld().dropItem(targetEntity.getLocation(), items);
    }

}
