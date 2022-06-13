/*
Plugin Name: Black Mob Egg Catcher
Author: Blackiiiii (Phillip Unzen)
Copyright: 2022
Contact: development@phillipunzen.de
 */


package de.phillipunzen.blackmobeggcatcher.types;

import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;

public enum SpawnEggTypes {
    // Liste aller Mobs die gefangen werden können mit den dazugehörigen Namen und Item ID des Spawn EIs
    //TODO
    // Mobs hinzufügen...
    COW(EntityType.COW,"Cow",Material.COW_SPAWN_EGG);

    private final EntityType mobType;
    private final String mobName;
    private final Material spawnEggItemID;

    // Konstruktor um die Final Variablen zu Initialisieren
    SpawnEggTypes(EntityType mobType, String mobName, Material spawnEggItemID)
    {
        this.mobType = mobType;
        this.mobName = mobName;
        this.spawnEggItemID = spawnEggItemID;
    }

    //Getter Methoden für Mobtyp, Mobnamen und SpawnEgg Item
    public EntityType getMobType()
    {
        return this.mobType;
    }

    public String getMobName()
    {
        return this.mobName;
    }

    public Material getSpawnEggItemID()
    {
        return this.spawnEggItemID;
    }

    /*
    Methode um den Item Typ zurückzubekommen
    Bekommt das Mob als Parameter übergeben.
    Arbeitet die Schleife durch, bis der Parameter mit dem Mob in der Liste übereinstimmt.
    Dann wird der Typ zurückgegeben.
     */

    public static SpawnEggTypes getSpawnItemType(Entity entity)
    {
        for(SpawnEggTypes type : SpawnEggTypes.values())
        {
            if (!type.getMobType().getEntityClass().isInstance(entity))
            {
                continue;
            }
            return type;
        }
        return null;
    }
}
