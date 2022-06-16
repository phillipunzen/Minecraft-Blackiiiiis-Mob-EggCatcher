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
    AXOLOTL(EntityType.AXOLOTL,"axolotl",Material.AXOLOTL_SPAWN_EGG),
    BAT(EntityType.BAT,"bat",Material.BAT_SPAWN_EGG),
    BEE(EntityType.BEE, "bee", Material.BEE_SPAWN_EGG),
    BLAZE(EntityType.BLAZE,"blaze",Material.BLAZE_SPAWN_EGG),
    CAT(EntityType.CAT, "cat", Material.CAT_SPAWN_EGG),
    CAVE_SPIDER(EntityType.CAVE_SPIDER,"cavespider",Material.CAVE_SPIDER_SPAWN_EGG),
    CHICKEN(EntityType.CHICKEN,"chicken",Material.CHICKEN_SPAWN_EGG),
    COD(EntityType.COD, "cod", Material.COD_SPAWN_EGG),
    COW(EntityType.COW,"cow",Material.COW_SPAWN_EGG),
    CREEPER(EntityType.CREEPER,"creeper",Material.CREEPER_SPAWN_EGG),
    DOLPHIN(EntityType.DOLPHIN, "dolphin", Material.DOLPHIN_SPAWN_EGG),
    DONKEY(EntityType.DONKEY, "donkey", Material.DONKEY_SPAWN_EGG),
    DROWNED(EntityType.DROWNED,"drowned",Material.DROWNED_SPAWN_EGG),
    ELDER_GUARDIAN(EntityType.ELDER_GUARDIAN, "elderguardian", Material.ELDER_GUARDIAN_SPAWN_EGG),
    ENDERMAN(EntityType.ENDERMAN, "enderman", Material.ENDERMAN_SPAWN_EGG),
    ENDERMITE(EntityType.ENDERMITE, "endermite", Material.ENDERMITE_SPAWN_EGG),
    EVOKER(EntityType.EVOKER,"evoker",Material.EVOKER_SPAWN_EGG),
    FOX(EntityType.FOX, "fox", Material.FOX_SPAWN_EGG),
    FROG(EntityType.FROG,"frog",Material.FROG_SPAWN_EGG),
    GHAST(EntityType.GHAST,"ghast",Material.GHAST_SPAWN_EGG),
    GLOW_SQUID(EntityType.GLOW_SQUID,"glowsquid",Material.GLOW_SQUID_SPAWN_EGG),
    GOAT(EntityType.GOAT,"goat",Material.GOAT_SPAWN_EGG),
    GUARDIAN(EntityType.GUARDIAN, "guardian", Material.GUARDIAN_SPAWN_EGG),
    HOGLIN(EntityType.HOGLIN,"hoglin",Material.HOGLIN_SPAWN_EGG),
    HORSE(EntityType.HORSE, "horse", Material.HORSE_SPAWN_EGG),
    HUSK(EntityType.HUSK,"husk",Material.HUSK_SPAWN_EGG),
    LAMA(EntityType.LLAMA, "lama", Material.LLAMA_SPAWN_EGG),
    MAGMA_CUBE(EntityType.MAGMA_CUBE,"magmacube",Material.MAGMA_CUBE_SPAWN_EGG),
    MULE(EntityType.MULE, "mule", Material.MULE_SPAWN_EGG),
    MUSHROOM_COW(EntityType.MUSHROOM_COW,"mushroomcow",Material.MOOSHROOM_SPAWN_EGG),
    OCELOT(EntityType.OCELOT,"ocelot",Material.OCELOT_SPAWN_EGG),
    PANDA(EntityType.PANDA, "panda", Material.PANDA_SPAWN_EGG),
    PARROT(EntityType.PARROT, "parrot", Material.PARROT_SPAWN_EGG),
    PHANTOM(EntityType.PHANTOM, "phantom", Material.PHANTOM_SPAWN_EGG),
    PIG(EntityType.PIG,"pig",Material.PIG_SPAWN_EGG),
    PIGLIN(EntityType.PIGLIN,"piglin",Material.PIGLIN_SPAWN_EGG),
    PILLAGER(EntityType.PILLAGER, "pillager", Material.PILLAGER_SPAWN_EGG),
    POLAR_BEAR(EntityType.POLAR_BEAR, "polarbear", Material.POLAR_BEAR_SPAWN_EGG),
    PUFFERFISH(EntityType.PUFFERFISH, "pufferfish", Material.PUFFERFISH_SPAWN_EGG),
    RABBIT(EntityType.RABBIT, "rabbit", Material.RABBIT_SPAWN_EGG),
    RAVAGER(EntityType.RAVAGER, "ravager", Material.RAVAGER_SPAWN_EGG),
    SALMON(EntityType.SALMON, "salmon", Material.SALMON_SPAWN_EGG),
    SHEEP(EntityType.SHEEP, "sheep",Material.SHEEP_SPAWN_EGG),
    SHULKER(EntityType.SHULKER, "shulker", Material.SHULKER_SPAWN_EGG),
    SILVERFISH(EntityType.SILVERFISH,"silverfish", Material.SILVERFISH_SPAWN_EGG),
    SKELETON(EntityType.SKELETON,"skeleton",Material.SKELETON_SPAWN_EGG),
    SKELETON_HORSE(EntityType.SKELETON_HORSE, "skeletonhorse", Material.SKELETON_HORSE_SPAWN_EGG),
    SLIME(EntityType.SLIME,"slime",Material.SLIME_SPAWN_EGG),
    SPIDER(EntityType.SPIDER,"spider",Material.SPIDER_SPAWN_EGG),
    SQUID(EntityType.SQUID,"squid",Material.SQUID_SPAWN_EGG),
    STRAY(EntityType.STRAY,"stray",Material.STRAY_SPAWN_EGG),
    STRIDER(EntityType.STRIDER,"strider",Material.STRIDER_SPAWN_EGG),
    TADPOLE(EntityType.TADPOLE,"tadpole",Material.TADPOLE_SPAWN_EGG),
    TRADER_LAMA(EntityType.TRADER_LLAMA, "traderlama", Material.TRADER_LLAMA_SPAWN_EGG),
    TROPICAL_FISH(EntityType.TROPICAL_FISH, "tropicalfish", Material.TROPICAL_FISH_SPAWN_EGG),
    TURTLE(EntityType.TURTLE, "turtle", Material.TURTLE_SPAWN_EGG),
    VEX(EntityType.VEX,"vex",Material.VEX_SPAWN_EGG),
    VILLAGER(EntityType.VILLAGER,"villager",Material.VILLAGER_SPAWN_EGG),
    VINDICATOR(EntityType.VINDICATOR,"vindicator",Material.VINDICATOR_SPAWN_EGG),
    WANDERING_TRADER(EntityType.WANDERING_TRADER, "wanderingtrader", Material.WANDERING_TRADER_SPAWN_EGG),
    WARDEN(EntityType.WARDEN,"warden",Material.WARDEN_SPAWN_EGG),
    WITCH(EntityType.WITCH,"witch",Material.WITCH_SPAWN_EGG),
    WITHER_SKELETON(EntityType.WITHER_SKELETON,"witherSkeleton",Material.WITHER_SKELETON_SPAWN_EGG),
    WOLF(EntityType.WOLF,"wolf",Material.WOLF_SPAWN_EGG),
    ZOGLIN(EntityType.ZOGLIN,"zoglin",Material.ZOGLIN_SPAWN_EGG),
    ZOMBIE(EntityType.ZOMBIE,"zombie",Material.ZOMBIE_SPAWN_EGG),
    ZOMBIE_HORSE(EntityType.ZOMBIE_HORSE, "zombiehorse", Material.ZOMBIE_HORSE_SPAWN_EGG),
    ZOMBIE_VILLAGER(EntityType.ZOMBIE_VILLAGER,"zombievillager",Material.ZOMBIE_VILLAGER_SPAWN_EGG),
    ZOMBIFIED_PIGLIN(EntityType.ZOMBIFIED_PIGLIN,"zombifiedpiglin",Material.ZOMBIFIED_PIGLIN_SPAWN_EGG);

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

    /*
    Methode arbeitet die Enum Liste durch, und gibt dann bei dem entsprechenden Mob den Typen als String aus.
     */
    public static String getMobName(Entity entity)
    {
         for(SpawnEggTypes type: SpawnEggTypes.values())
         {
             if( !type.getMobType().getEntityClass().isInstance(entity))
             {
                 continue;
             }
             return type.mobName;
         }
         return "";
    }
}
