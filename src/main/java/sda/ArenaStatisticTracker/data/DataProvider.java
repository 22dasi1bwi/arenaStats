package sda.ArenaStatisticTracker.data;

import java.util.Arrays;

import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import com.google.common.collect.Sets;

import sda.ArenaStatisticTracker.build.Build;
import sda.ArenaStatisticTracker.build.Talent;
import sda.ArenaStatisticTracker.fight.Combination;
import sda.ArenaStatisticTracker.fight.Fight;
import sda.ArenaStatisticTracker.fight.Result;
import sda.ArenaStatisticTracker.fight.WoWClass;
import sda.ArenaStatisticTracker.fight.business.FightService;

@Singleton
@Startup
public class DataProvider {

    @EJB
    private FightService fightService;

    public static void provideData() {
        new Fight(new Combination(Arrays.asList(WoWClass.PRIEST_DISCIPLINE, WoWClass.HUNTER_SURVIVAL)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.FIST_OF_JUSTICE)), WoWClass.PRIEST_DISCIPLINE, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_FERAL, WoWClass.PRIEST_DISCIPLINE)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.FIST_OF_JUSTICE)), WoWClass.DRUID_FERAL, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.HUNTER_BEASTMASTERY)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.FIST_OF_JUSTICE)), WoWClass.HUNTER_BEASTMASTERY, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_BALANCE, WoWClass.MAGE_FROST)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.FIST_OF_JUSTICE)), WoWClass.MAGE_FROST, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.WARRIOR_FURY, WoWClass.WARLOCK_AFFLICTION)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.FIST_OF_JUSTICE)), WoWClass.WARLOCK_AFFLICTION, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.PRIEST_DISCIPLINE, WoWClass.WARRIOR_ARMS)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.FIST_OF_JUSTICE)), WoWClass.PRIEST_DISCIPLINE, Result.DEFEAT,
                "Next time blessed hands");
        new Fight(new Combination(Arrays.asList(WoWClass.PRIEST_DISCIPLINE, WoWClass.SHAMAN_ELEMENTAL)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.FIST_OF_JUSTICE)), WoWClass.SHAMAN_ELEMENTAL, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.MONK_WINDWALKER, WoWClass.WARRIOR_ARMS)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.FIST_OF_JUSTICE)), WoWClass.WARRIOR_ARMS, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.PALADIN_RETRIBUTION, WoWClass.MONK_MISTWEAVER)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE)), WoWClass.MONK_MISTWEAVER, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.HUNTER_MARKMANSHIP, WoWClass.WARRIOR_ARMS)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.FIST_OF_JUSTICE)), WoWClass.HUNTER_MARKMANSHIP, Result.WIN,
                "Only vs 1 hunter");
        new Fight(new Combination(Arrays.asList(WoWClass.MONK_WINDWALKER, WoWClass.PRIEST_DISCIPLINE)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.FIST_OF_JUSTICE)), WoWClass.PRIEST_DISCIPLINE, Result.DEFEAT,
                "vs WW blessed hands");
        new Fight(new Combination(Arrays.asList(WoWClass.WARRIOR_PROTECTION, WoWClass.WARRIOR_FURY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE)), WoWClass.WARRIOR_FURY, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.ROGUE_ASSASINATION)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.FIST_OF_JUSTICE)), WoWClass.DRUID_RESTORATION, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.MONK_MISTWEAVER, WoWClass.MONK_WINDWALKER)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE)), WoWClass.MONK_MISTWEAVER, Result.WIN,
                "first MW than WW");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.ROGUE_ASSASINATION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE)), WoWClass.DRUID_RESTORATION, Result.DEFEAT,
                "Change target more often?");
        new Fight(new Combination(Arrays.asList(WoWClass.PALADIN_HOLY, WoWClass.SHAMAN_ELEMENTAL)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.FIST_OF_JUSTICE)), WoWClass.PALADIN_HOLY, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.WARRIOR_FURY)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.FIST_OF_JUSTICE)), WoWClass.DRUID_RESTORATION, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_FERAL, WoWClass.MONK_WINDWALKER)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE)), WoWClass.DRUID_FERAL, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.PALADIN_HOLY, WoWClass.ROGUE_SUBTLETY)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.FIST_OF_JUSTICE)), WoWClass.PALADIN_HOLY, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.ROGUE_ASSASINATION, WoWClass.SHAMAN_RESTORATION)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.FIST_OF_JUSTICE)), WoWClass.SHAMAN_RESTORATION, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DEMONHUNTER_HAVOC, WoWClass.PRIEST_DISCIPLINE)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE)), WoWClass.PRIEST_DISCIPLINE, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.HUNTER_SURVIVAL, WoWClass.WARRIOR_FURY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE)), WoWClass.WARRIOR_FURY, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.MAGE_FIRE, WoWClass.ROGUE_ASSASINATION)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.FIST_OF_JUSTICE)), WoWClass.ROGUE_ASSASINATION, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.MONK_MISTWEAVER, WoWClass.DEATHKNIGHT_UNHOLY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE)), WoWClass.MONK_MISTWEAVER, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.MAGE_FIRE, WoWClass.ROGUE_SUBTLETY)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.FIST_OF_JUSTICE)), WoWClass.MAGE_FIRE, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.PALADIN_RETRIBUTION, WoWClass.DEMONHUNTER_HAVOC)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE)), WoWClass.DEMONHUNTER_HAVOC, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DEMONHUNTER_HAVOC, WoWClass.SHAMAN_RESTORATION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE)), WoWClass.SHAMAN_RESTORATION, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.DEMONHUNTER_HAVOC)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND)), WoWClass.DEMONHUNTER_HAVOC, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.MONK_MISTWEAVER, WoWClass.DEMONHUNTER_HAVOC)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND)), WoWClass.MONK_MISTWEAVER, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.DEMONHUNTER_HAVOC)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE)), WoWClass.DRUID_RESTORATION, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.DEMONHUNTER_HAVOC)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE)), WoWClass.DRUID_RESTORATION, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.WARRIOR_ARMS, WoWClass.WARLOCK_DESTRUCTION)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.FIST_OF_JUSTICE)), WoWClass.WARLOCK_DESTRUCTION, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.MONK_WINDWALKER, WoWClass.DEMONHUNTER_HAVOC)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE)), WoWClass.DEMONHUNTER_HAVOC, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.PRIEST_DISCIPLINE, WoWClass.MAGE_FIRE)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.FIST_OF_JUSTICE)), WoWClass.MAGE_FIRE, Result.DEFEAT, "Mixed focus");
        new Fight(new Combination(Arrays.asList(WoWClass.PRIEST_DISCIPLINE, WoWClass.MAGE_FROST)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE)), WoWClass.MAGE_FROST, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.SHAMAN_RESTORATION, WoWClass.WARRIOR_FURY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND)), WoWClass.SHAMAN_RESTORATION, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.ROGUE_ASSASINATION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND)), WoWClass.DRUID_RESTORATION, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.ROGUE_SUBTLETY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND)), WoWClass.DRUID_RESTORATION, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.PRIEST_DISCIPLINE, WoWClass.ROGUE_ASSASINATION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND)), WoWClass.PRIEST_DISCIPLINE, Result.DEFEAT, "Mixed focus");
        new Fight(new Combination(Arrays.asList(WoWClass.MONK_MISTWEAVER, WoWClass.ROGUE_ASSASINATION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND)), WoWClass.ROGUE_ASSASINATION, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DEMONHUNTER_HAVOC, WoWClass.PRIEST_HOLY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND)), WoWClass.PRIEST_HOLY, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.DEATHKNIGHT_UNHOLY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND)), WoWClass.DRUID_RESTORATION, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.WARRIOR_PROTECTION, WoWClass.WARRIOR_ARMS)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND)), WoWClass.WARRIOR_ARMS, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.DEMONHUNTER_HAVOC)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND)), WoWClass.DRUID_RESTORATION, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.MAGE_FIRE, WoWClass.MAGE_FIRE)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND)), WoWClass.MAGE_FIRE, Result.WIN, "2x Mage");
        new Fight(new Combination(Arrays.asList(WoWClass.PRIEST_DISCIPLINE, WoWClass.ROGUE_ASSASINATION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND)), WoWClass.PRIEST_DISCIPLINE, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.WARRIOR_FURY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND)), WoWClass.DRUID_RESTORATION, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.WARLOCK_AFFLICTION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND)), WoWClass.WARLOCK_AFFLICTION, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.PALADIN_HOLY, WoWClass.DEATHKNIGHT_UNHOLY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND)), WoWClass.PALADIN_HOLY, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DEATHKNIGHT_FROST, WoWClass.PRIEST_HOLY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND)), WoWClass.PRIEST_HOLY, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.PRIEST_DISCIPLINE, WoWClass.ROGUE_ASSASINATION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND)), WoWClass.PRIEST_DISCIPLINE, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.DEMONHUNTER_HAVOC)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND)), WoWClass.DRUID_RESTORATION, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_FERAL, WoWClass.PRIEST_SHADOW)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND)), WoWClass.PRIEST_SHADOW, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.DEMONHUNTER_HAVOC)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND)), WoWClass.DRUID_RESTORATION, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.PALADIN_RETRIBUTION, WoWClass.DEMONHUNTER_HAVOC)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND)), WoWClass.PALADIN_RETRIBUTION, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.MONK_MISTWEAVER, WoWClass.DEMONHUNTER_HAVOC)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND)), WoWClass.MONK_MISTWEAVER, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.DEMONHUNTER_HAVOC)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND)), WoWClass.DRUID_RESTORATION, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DEMONHUNTER_HAVOC, WoWClass.DEMONHUNTER_HAVOC)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND)), WoWClass.DEMONHUNTER_HAVOC, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.PALADIN_RETRIBUTION, WoWClass.HUNTER_BEASTMASTERY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND)), WoWClass.PALADIN_RETRIBUTION, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.WARRIOR_FURY, WoWClass.WARLOCK_DESTRUCTION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND)), WoWClass.WARRIOR_FURY, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DEMONHUNTER_HAVOC, WoWClass.SHAMAN_RESTORATION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND)), WoWClass.SHAMAN_RESTORATION, Result.DEFEAT,
                "first Resto, than havoc");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.DEATHKNIGHT_UNHOLY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND)), WoWClass.DRUID_RESTORATION, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DEMONHUNTER_HAVOC, WoWClass.WARRIOR_FURY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND)), WoWClass.WARRIOR_FURY, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.PRIEST_DISCIPLINE, WoWClass.ROGUE_ASSASINATION)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND)), WoWClass.PRIEST_DISCIPLINE, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.PRIEST_DISCIPLINE, WoWClass.ROGUE_ASSASINATION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND)), WoWClass.PRIEST_DISCIPLINE, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_FERAL, WoWClass.MONK_MISTWEAVER)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND)), WoWClass.DRUID_FERAL, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.WARRIOR_ARMS)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND)), WoWClass.DRUID_RESTORATION, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.MAGE_FROST, WoWClass.ROGUE_SUBTLETY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND)), WoWClass.MAGE_FROST, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.ROGUE_ASSASINATION, WoWClass.SHAMAN_RESTORATION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND)), WoWClass.SHAMAN_RESTORATION, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DEATHKNIGHT_FROST, WoWClass.MAGE_ARCANE)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND)), WoWClass.MAGE_ARCANE, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.MONK_MISTWEAVER, WoWClass.WARLOCK_AFFLICTION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND)), WoWClass.WARLOCK_AFFLICTION, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DEMONHUNTER_HAVOC, WoWClass.PRIEST_DISCIPLINE)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND)), WoWClass.PRIEST_DISCIPLINE, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.MONK_MISTWEAVER, WoWClass.WARRIOR_FURY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND)), WoWClass.MONK_MISTWEAVER, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.HUNTER_SURVIVAL, WoWClass.SHAMAN_RESTORATION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.RELENTLESS)), WoWClass.HUNTER_SURVIVAL, Result.DEFEAT,
                "pressure on hunter was good");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.MAGE_FIRE)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.RELENTLESS)), WoWClass.MAGE_FIRE, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.PRIEST_DISCIPLINE, WoWClass.ROGUE_ASSASINATION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR)), WoWClass.ROGUE_ASSASINATION, Result.DEFEAT,
                "pressure on rogue was good");
        new Fight(new Combination(Arrays.asList(WoWClass.MONK_MISTWEAVER, WoWClass.DEATHKNIGHT_UNHOLY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR)), WoWClass.MONK_MISTWEAVER, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.ROGUE_SUBTLETY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR)), WoWClass.DRUID_RESTORATION, Result.DEFEAT,
                "");
        new Fight(new Combination(Arrays.asList(WoWClass.MONK_MISTWEAVER, WoWClass.DEATHKNIGHT_UNHOLY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR)), WoWClass.MONK_MISTWEAVER, Result.DEFEAT,
                "");
        new Fight(new Combination(Arrays.asList(WoWClass.MONK_MISTWEAVER, WoWClass.DEMONHUNTER_HAVOC)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR)), WoWClass.DEMONHUNTER_HAVOC, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.PALADIN_RETRIBUTION, WoWClass.SHAMAN_RESTORATION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR)), WoWClass.PALADIN_RETRIBUTION, Result.WIN,
                "");
        new Fight(new Combination(Arrays.asList(WoWClass.PRIEST_HOLY, WoWClass.ROGUE_ASSASINATION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR)), WoWClass.PRIEST_HOLY, Result.WIN,
                "Mixed pressure was good");
        new Fight(new Combination(Arrays.asList(WoWClass.MONK_WINDWALKER, WoWClass.PRIEST_DISCIPLINE)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR)), WoWClass.PRIEST_DISCIPLINE, Result.DEFEAT,
                "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_BALANCE, WoWClass.PRIEST_DISCIPLINE)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR)), WoWClass.PRIEST_DISCIPLINE, Result.WIN,
                "crusader was awesome");
        new Fight(new Combination(Arrays.asList(WoWClass.MONK_WINDWALKER, WoWClass.PRIEST_DISCIPLINE)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR)), WoWClass.PRIEST_DISCIPLINE, Result.DEFEAT,
                "crusader better than hands");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.DEATHKNIGHT_UNHOLY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR)), WoWClass.DRUID_RESTORATION, Result.DEFEAT,
                "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.HUNTER_BEASTMASTERY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.RELENTLESS)), WoWClass.HUNTER_BEASTMASTERY, Result.WIN,
                "");
        new Fight(new Combination(Arrays.asList(WoWClass.MONK_MISTWEAVER, WoWClass.DEATHKNIGHT_UNHOLY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR)), WoWClass.MONK_MISTWEAVER, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.ROGUE_ASSASINATION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART)),
                WoWClass.ROGUE_ASSASINATION, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.MAGE_FIRE)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.RELENTLESS, Talent.LIGHTS_GRACE)), WoWClass.MAGE_FIRE,
                Result.WIN, "switched on resto later on");
        new Fight(new Combination(Arrays.asList(WoWClass.DEMONHUNTER_HAVOC, WoWClass.PRIEST_DISCIPLINE)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.PRIEST_DISCIPLINE, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.DEATHKNIGHT_UNHOLY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.DRUID_RESTORATION, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.PALADIN_HOLY, WoWClass.DEATHKNIGHT_UNHOLY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)), WoWClass.PALADIN_HOLY,
                Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.ROGUE_ASSASINATION, WoWClass.WARLOCK_DEMONOLOGY)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)), WoWClass.WARLOCK_DEMONOLOGY,
                Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.DEMONHUNTER_HAVOC)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.DEMONHUNTER_HAVOC, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.PRIEST_DISCIPLINE, WoWClass.ROGUE_ASSASINATION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART)),
                WoWClass.ROGUE_ASSASINATION, Result.DEFEAT, "maybe the next time");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.ROGUE_ASSASINATION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART)),
                WoWClass.ROGUE_ASSASINATION, Result.DEFEAT, "maybe the next time");
        new Fight(new Combination(Arrays.asList(WoWClass.MONK_MISTWEAVER, WoWClass.SHAMAN_ENHANCEMENT)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.SHAMAN_ENHANCEMENT, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.ROGUE_ASSASINATION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART)),
                WoWClass.DRUID_RESTORATION, Result.WIN, "good dmg on both");
        new Fight(new Combination(Arrays.asList(WoWClass.DEMONHUNTER_HAVOC, WoWClass.DEMONHUNTER_HAVOC)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.DEMONHUNTER_HAVOC, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.SHAMAN_ENHANCEMENT)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.SHAMAN_ENHANCEMENT, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DEMONHUNTER_HAVOC, WoWClass.PRIEST_DISCIPLINE)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.PRIEST_DISCIPLINE, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.PALADIN_RETRIBUTION, WoWClass.HUNTER_SURVIVAL)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.PALADIN_RETRIBUTION, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.ROGUE_SUBTLETY, WoWClass.SHAMAN_ELEMENTAL)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)), WoWClass.SHAMAN_ELEMENTAL,
                Result.WIN, "crusader was a good choice");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.PALADIN_RETRIBUTION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.DRUID_RESTORATION, Result.WIN, "switched later on to pala");
        new Fight(new Combination(Arrays.asList(WoWClass.DEMONHUNTER_HAVOC, WoWClass.PRIEST_DISCIPLINE)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.PRIEST_DISCIPLINE, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DEATHKNIGHT_FROST, WoWClass.ROGUE_SUBTLETY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.ROGUE_SUBTLETY, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.PRIEST_DISCIPLINE, WoWClass.ROGUE_SUBTLETY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.PRIEST_DISCIPLINE, Result.DEFEAT, "get something better for this combo");
        new Fight(new Combination(Arrays.asList(WoWClass.PALADIN_HOLY, WoWClass.DEMONHUNTER_HAVOC)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.DEMONHUNTER_HAVOC, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.PRIEST_DISCIPLINE, WoWClass.MAGE_FROST)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.RELENTLESS, Talent.LIGHTS_GRACE)), WoWClass.MAGE_FROST,
                Result.DEFEAT, "Fear is not affected by relentless");
        new Fight(new Combination(Arrays.asList(WoWClass.PALADIN_RETRIBUTION, WoWClass.DEMONHUNTER_HAVOC)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.PALADIN_RETRIBUTION, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.SHAMAN_RESTORATION, WoWClass.WARRIOR_FURY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.SHAMAN_RESTORATION, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.PRIEST_DISCIPLINE, WoWClass.WARRIOR_FURY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.PRIEST_DISCIPLINE, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.PRIEST_SHADOW, WoWClass.DEMONHUNTER_HAVOC)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)), WoWClass.PRIEST_SHADOW,
                Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.ROGUE_ASSASINATION, WoWClass.MAGE_FIRE)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART)), WoWClass.MAGE_FIRE,
                Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.DEATHKNIGHT_UNHOLY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.DEATHKNIGHT_UNHOLY, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.MONK_WINDWALKER, WoWClass.MAGE_ARCANE)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)), WoWClass.MAGE_ARCANE,
                Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.PRIEST_DISCIPLINE, WoWClass.ROGUE_ASSASINATION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART)),
                WoWClass.ROGUE_ASSASINATION, Result.WIN, "disc disconnect");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.DEATHKNIGHT_UNHOLY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.DRUID_RESTORATION, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.ROGUE_ASSASINATION, WoWClass.MAGE_FIRE)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART)), WoWClass.MAGE_FIRE,
                Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.WARRIOR_ARMS)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)), WoWClass.WARRIOR_ARMS,
                Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.MONK_WINDWALKER, WoWClass.ROGUE_ASSASINATION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART)),
                WoWClass.ROGUE_ASSASINATION, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.PRIEST_DISCIPLINE, WoWClass.PRIEST_DISCIPLINE)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.PRIEST_DISCIPLINE, Result.WIN, "second partner was not there");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.DEMONHUNTER_HAVOC)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.DRUID_RESTORATION, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.SHAMAN_RESTORATION, WoWClass.WARRIOR_FURY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.SHAMAN_RESTORATION, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.PRIEST_SHADOW)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)), WoWClass.PRIEST_SHADOW,
                Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.MONK_MISTWEAVER, WoWClass.DEMONHUNTER_HAVOC)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.MONK_MISTWEAVER, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.PALADIN_HOLY, WoWClass.WARRIOR_FURY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)), WoWClass.PALADIN_HOLY,
                Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.PRIEST_SHADOW, WoWClass.ROGUE_SUBTLETY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)), WoWClass.PRIEST_SHADOW,
                Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.PALADIN_HOLY, WoWClass.MAGE_FROST)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)), WoWClass.MAGE_FROST,
                Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.PALADIN_HOLY, WoWClass.WARLOCK_AFFLICTION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.WARLOCK_AFFLICTION, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.SHAMAN_RESTORATION, WoWClass.WARLOCK_AFFLICTION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.WARLOCK_AFFLICTION, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.PRIEST_DISCIPLINE, WoWClass.WARRIOR_FURY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.PRIEST_DISCIPLINE, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.ROGUE_ASSASINATION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.ROGUE_ASSASINATION, Result.WIN, "druid first down");
        new Fight(new Combination(Arrays.asList(WoWClass.DEMONHUNTER_HAVOC, WoWClass.SHAMAN_RESTORATION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.SHAMAN_RESTORATION, Result.WIN, "druid first down");
        new Fight(new Combination(Arrays.asList(WoWClass.ROGUE_SUBTLETY, WoWClass.MAGE_FIRE)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)), WoWClass.MAGE_FIRE,
                Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.PRIEST_DISCIPLINE, WoWClass.ROGUE_ASSASINATION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART)),
                WoWClass.ROGUE_ASSASINATION, Result.WIN, "rogue is a good choice");
        new Fight(new Combination(Arrays.asList(WoWClass.PRIEST_DISCIPLINE, WoWClass.ROGUE_ASSASINATION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART)),
                WoWClass.ROGUE_ASSASINATION, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_FERAL, WoWClass.SHAMAN_RESTORATION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)), WoWClass.DRUID_FERAL,
                Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.DEMONHUNTER_HAVOC)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.DRUID_RESTORATION, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DEATHKNIGHT_UNHOLY, WoWClass.SHAMAN_RESTORATION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.SHAMAN_RESTORATION, Result.WIN, "god bless you @more");
        new Fight(new Combination(Arrays.asList(WoWClass.MONK_MISTWEAVER, WoWClass.WARRIOR_FURY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.MONK_MISTWEAVER, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.SHAMAN_RESTORATION, WoWClass.WARRIOR_ARMS)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.SHAMAN_RESTORATION, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.HUNTER_SURVIVAL)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.DRUID_RESTORATION, Result.DEFEAT, "switch targets was good");
        new Fight(new Combination(Arrays.asList(WoWClass.PALADIN_HOLY, WoWClass.ROGUE_ASSASINATION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART)),
                WoWClass.ROGUE_ASSASINATION, Result.DEFEAT, "forced pala to BOP, than switched to rogue");
        new Fight(new Combination(Arrays.asList(WoWClass.ROGUE_ASSASINATION, WoWClass.MAGE_FROST)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART)), WoWClass.MAGE_FROST,
                Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.MONK_WINDWALKER, WoWClass.MAGE_FROST)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)), WoWClass.MAGE_FROST,
                Result.WIN, "switched to monk later on");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.WARLOCK_AFFLICTION)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE, Talent.BEACON_OF_FAITH)),
                WoWClass.WARLOCK_AFFLICTION, Result.WIN, "hold massiv pressure on affliction");
        new Fight(new Combination(Arrays.asList(WoWClass.SHAMAN_RESTORATION, WoWClass.WARRIOR_FURY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.SHAMAN_RESTORATION, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.PALADIN_HOLY, WoWClass.DEATHKNIGHT_FROST)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)), WoWClass.PALADIN_HOLY,
                Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.ROGUE_SUBTLETY, WoWClass.MAGE_FIRE)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE, Talent.BEACON_OF_FAITH)),
                WoWClass.MAGE_FIRE, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.MAGE_FROST)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)), WoWClass.MAGE_FROST,
                Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.ROGUE_ASSASINATION, WoWClass.SHAMAN_RESTORATION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART)),
                WoWClass.SHAMAN_RESTORATION, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.ROGUE_ASSASINATION, WoWClass.SHAMAN_RESTORATION)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART, Talent.BEACON_OF_FAITH)),
                WoWClass.SHAMAN_RESTORATION, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.DEMONHUNTER_HAVOC)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.DEMONHUNTER_HAVOC, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.MONK_WINDWALKER, WoWClass.PRIEST_DISCIPLINE)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.MONK_WINDWALKER, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.SHAMAN_ELEMENTAL)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE, Talent.BEACON_OF_FAITH)),
                WoWClass.DRUID_RESTORATION, Result.WIN, "crusader was a good choice");
        new Fight(new Combination(Arrays.asList(WoWClass.PRIEST_DISCIPLINE, WoWClass.MAGE_FROST)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)), WoWClass.MAGE_FROST,
                Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.DEMONHUNTER_HAVOC)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.DRUID_RESTORATION, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.MONK_MISTWEAVER, WoWClass.DEMONHUNTER_HAVOC)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.MONK_MISTWEAVER, Result.DEFEAT, "was really close");
        new Fight(new Combination(Arrays.asList(WoWClass.PALADIN_HOLY, WoWClass.ROGUE_ASSASINATION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.ROGUE_ASSASINATION, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.WARRIOR_ARMS)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)), WoWClass.WARRIOR_ARMS,
                Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DEATHKNIGHT_UNHOLY, WoWClass.MAGE_FIRE)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE, Talent.BEACON_OF_FAITH)),
                WoWClass.MAGE_FIRE, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.PALADIN_HOLY, WoWClass.HUNTER_BEASTMASTERY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.HUNTER_BEASTMASTERY, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.ROGUE_ASSASINATION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART)),
                WoWClass.DRUID_RESTORATION, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.SHAMAN_RESTORATION, WoWClass.WARRIOR_FURY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.SHAMAN_RESTORATION, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.SHAMAN_ENHANCEMENT)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.SHAMAN_ENHANCEMENT, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.HUNTER_SURVIVAL)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.DRUID_RESTORATION, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.ROGUE_ASSASINATION, WoWClass.ROGUE_ASSASINATION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART)),
                WoWClass.ROGUE_ASSASINATION, Result.WIN, "only one rogue there");
        new Fight(new Combination(Arrays.asList(WoWClass.MAGE_FROST, WoWClass.ROGUE_SUBTLETY)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE, Talent.BEACON_OF_FAITH)),
                WoWClass.MAGE_FROST, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.SHAMAN_ENHANCEMENT)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.DRUID_RESTORATION, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.MAGE_FIRE, WoWClass.ROGUE_SUBTLETY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)), WoWClass.MAGE_FIRE,
                Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.MAGE_FIRE, WoWClass.ROGUE_ASSASINATION)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART)), WoWClass.MAGE_FIRE,
                Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.ROGUE_ASSASINATION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART)),
                WoWClass.DRUID_RESTORATION, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.HUNTER_SURVIVAL, WoWClass.PRIEST_DISCIPLINE)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.HUNTER_SURVIVAL, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.MAGE_FROST, WoWClass.PRIEST_SHADOW)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE, Talent.BEACON_OF_FAITH)),
                WoWClass.PRIEST_SHADOW, Result.WIN, "crusader was probably the better choice");
        new Fight(new Combination(Arrays.asList(WoWClass.SHAMAN_RESTORATION, WoWClass.PRIEST_SHADOW)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)), WoWClass.PRIEST_SHADOW,
                Result.DEFEAT, "absolutly no chance; crusader + additional beacon");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.ROGUE_ASSASINATION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.ROGUE_ASSASINATION, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_FERAL, WoWClass.SHAMAN_RESTORATION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.SHAMAN_RESTORATION, Result.DEFEAT, "crusader?");
        new Fight(new Combination(Arrays.asList(WoWClass.PALADIN_HOLY, WoWClass.PRIEST_SHADOW)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE, Talent.BEACON_OF_FAITH)),
                WoWClass.PRIEST_SHADOW, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.PALADIN_HOLY, WoWClass.DEATHKNIGHT_UNHOLY)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE, Talent.BEACON_OF_FAITH)),
                WoWClass.PALADIN_HOLY, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.PRIEST_DISCIPLINE, WoWClass.ROGUE_ASSASINATION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART)),
                WoWClass.PRIEST_DISCIPLINE, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.PRIEST_DISCIPLINE, WoWClass.DEMONHUNTER_HAVOC)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.PRIEST_DISCIPLINE, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.MAGE_FIRE, WoWClass.DEMONHUNTER_HAVOC)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE, Talent.BEACON_OF_FAITH)),
                WoWClass.MAGE_FIRE, Result.DEFEAT, "consider bubble rather than bop");
        new Fight(new Combination(Arrays.asList(WoWClass.MAGE_FIRE, WoWClass.MONK_MISTWEAVER)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE, Talent.BEACON_OF_FAITH)),
                WoWClass.MAGE_FIRE, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.PRIEST_DISCIPLINE, WoWClass.DEATHKNIGHT_FROST)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.PRIEST_DISCIPLINE, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.SHAMAN_ENHANCEMENT)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.DRUID_RESTORATION, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.DEATHKNIGHT_UNHOLY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.DRUID_RESTORATION, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.PRIEST_DISCIPLINE, WoWClass.PALADIN_RETRIBUTION)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)), WoWClass.PRIEST_DISCIPLINE,
                Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DEMONHUNTER_HAVOC, WoWClass.WARRIOR_FURY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)), WoWClass.WARRIOR_FURY,
                Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.MONK_MISTWEAVER, WoWClass.SHAMAN_ENHANCEMENT)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.MONK_MISTWEAVER, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.MONK_MISTWEAVER, WoWClass.DEMONHUNTER_HAVOC)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.DEMONHUNTER_HAVOC, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.MONK_MISTWEAVER, WoWClass.WARRIOR_FURY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.MONK_MISTWEAVER, Result.DEFEAT, "switched often; didn't reached both");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.ROGUE_ASSASINATION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART)),
                WoWClass.ROGUE_ASSASINATION, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.WARRIOR_FURY, WoWClass.DEMONHUNTER_HAVOC)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)), WoWClass.WARRIOR_FURY,
                Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.MAGE_FIRE, WoWClass.ROGUE_ASSASINATION)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART, Talent.BEACON_OF_FAITH)),
                WoWClass.MAGE_FIRE, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.MAGE_FROST, WoWClass.DEMONHUNTER_HAVOC)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)), WoWClass.MAGE_FROST,
                Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.PRIEST_DISCIPLINE, WoWClass.ROGUE_ASSASINATION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART)),
                WoWClass.ROGUE_ASSASINATION, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.PRIEST_DISCIPLINE, WoWClass.ROGUE_ASSASINATION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART)),
                WoWClass.ROGUE_ASSASINATION, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DEMONHUNTER_HAVOC, WoWClass.DEATHKNIGHT_UNHOLY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.DEMONHUNTER_HAVOC, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.MONK_MISTWEAVER, WoWClass.WARRIOR_ARMS)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.MONK_MISTWEAVER, Result.DEFEAT, "changed target often");
        new Fight(new Combination(Arrays.asList(WoWClass.MAGE_FROST, WoWClass.PALADIN_HOLY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)), WoWClass.MAGE_FROST,
                Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.PRIEST_DISCIPLINE, WoWClass.ROGUE_ASSASINATION)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART)),
                WoWClass.ROGUE_ASSASINATION, Result.WIN, "crusader!!!!");
        new Fight(new Combination(Arrays.asList(WoWClass.SHAMAN_RESTORATION, WoWClass.WARLOCK_DEMONOLOGY)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)), WoWClass.WARLOCK_DEMONOLOGY,
                Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.PRIEST_DISCIPLINE, WoWClass.WARLOCK_AFFLICTION)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE, Talent.BEACON_OF_FAITH)),
                WoWClass.WARLOCK_AFFLICTION, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_FERAL, WoWClass.PALADIN_HOLY)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE, Talent.BEACON_OF_FAITH)),
                WoWClass.DRUID_FERAL, Result.WIN, "crusader is good with beacon");
        new Fight(new Combination(Arrays.asList(WoWClass.ROGUE_SUBTLETY, WoWClass.ROGUE_SUBTLETY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.ROGUE_SUBTLETY, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.DEMONHUNTER_HAVOC)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.DRUID_RESTORATION, Result.WIN, "burst on druid with touch of death on havoc; havoc died first");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.DEMONHUNTER_HAVOC)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.DRUID_RESTORATION, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.PRIEST_DISCIPLINE, WoWClass.ROGUE_ASSASINATION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.ROGUE_ASSASINATION, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.MONK_WINDWALKER, WoWClass.DEMONHUNTER_VENGEANCE)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.MONK_WINDWALKER, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.WARLOCK_AFFLICTION, WoWClass.SHAMAN_RESTORATION)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE, Talent.BEACON_OF_FAITH)),
                WoWClass.WARLOCK_AFFLICTION, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.MAGE_FROST)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)), WoWClass.MAGE_FROST,
                Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.DEMONHUNTER_HAVOC)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.DRUID_RESTORATION, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.MONK_WINDWALKER, WoWClass.WARRIOR_FURY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.MONK_WINDWALKER, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.MAGE_FIRE, WoWClass.ROGUE_SUBTLETY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)), WoWClass.MAGE_FIRE,
                Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.PRIEST_DISCIPLINE, WoWClass.ROGUE_SUBTLETY)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)), WoWClass.ROGUE_SUBTLETY,
                Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.MAGE_FIRE, WoWClass.ROGUE_SUBTLETY)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)), WoWClass.MAGE_FIRE,
                Result.DEFEAT, "play it with crusader next time");
        new Fight(new Combination(Arrays.asList(WoWClass.ROGUE_ASSASINATION, WoWClass.MAGE_FROST)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART)),
                WoWClass.ROGUE_ASSASINATION, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.ROGUE_ASSASINATION, WoWClass.PRIEST_DISCIPLINE)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART)),
                WoWClass.ROGUE_ASSASINATION, Result.DEFEAT, "what the hell shall we do?");
        new Fight(new Combination(Arrays.asList(WoWClass.PALADIN_HOLY, WoWClass.PRIEST_SHADOW)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.BEACON_OF_FAITH, Talent.LIGHTS_GRACE)),
                WoWClass.PRIEST_SHADOW, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.HUNTER_SURVIVAL, WoWClass.DRUID_RESTORATION)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.BEACON_OF_FAITH, Talent.LIGHTS_GRACE)),
                WoWClass.HUNTER_SURVIVAL, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DEMONHUNTER_HAVOC, WoWClass.MONK_MISTWEAVER)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.BEACON_OF_FAITH, Talent.LIGHTS_GRACE)),
                WoWClass.MONK_MISTWEAVER, Result.WIN, "splitted dmg");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.HUNTER_SURVIVAL)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)), WoWClass.HUNTER_SURVIVAL,
                Result.DEFEAT, "");

        // started here today (18.02.17)
        new Fight(new Combination(Arrays.asList(WoWClass.MONK_MISTWEAVER, WoWClass.ROGUE_ASSASINATION)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART)),
                WoWClass.ROGUE_ASSASINATION, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.HUNTER_SURVIVAL, WoWClass.PRIEST_DISCIPLINE)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)), WoWClass.HUNTER_SURVIVAL,
                Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.ROGUE_SUBTLETY, WoWClass.MAGE_FIRE)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)), WoWClass.MAGE_FIRE,
                Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.ROGUE_ASSASINATION, WoWClass.DEMONHUNTER_HAVOC)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART)),
                WoWClass.DEMONHUNTER_HAVOC, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.MAGE_FIRE, WoWClass.PALADIN_RETRIBUTION)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)), WoWClass.MAGE_FIRE,
                Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.WARLOCK_AFFLICTION, WoWClass.MONK_WINDWALKER)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE, Talent.BEACON_OF_FAITH)),
                WoWClass.WARLOCK_AFFLICTION, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.DEMONHUNTER_HAVOC)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.DRUID_RESTORATION, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.PRIEST_DISCIPLINE, WoWClass.ROGUE_ASSASINATION)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART)),
                WoWClass.ROGUE_ASSASINATION, Result.WIN,
                "high pressure on assa, so that disc cannot do any dmg to us. separate them from each other and burst on rogue");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.ROGUE_ASSASINATION)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART)),
                WoWClass.ROGUE_ASSASINATION, Result.WIN,
                "high pressure on assa, so that resto cannot do any dmg / stun to us. separate them from each other and burst on rogue");
        new Fight(new Combination(Arrays.asList(WoWClass.PALADIN_HOLY, WoWClass.SHAMAN_ELEMENTAL)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)), WoWClass.SHAMAN_ELEMENTAL,
                Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.PRIEST_DISCIPLINE, WoWClass.ROGUE_ASSASINATION)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART)),
                WoWClass.ROGUE_ASSASINATION, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.DEMONHUNTER_HAVOC)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)), WoWClass.DEMONHUNTER_HAVOC,
                Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.MONK_MISTWEAVER, WoWClass.ROGUE_ASSASINATION)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART)),
                WoWClass.ROGUE_ASSASINATION, Result.WIN, "switched to monk later on");
        new Fight(new Combination(Arrays.asList(WoWClass.MONK_MISTWEAVER, WoWClass.HUNTER_SURVIVAL)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)), WoWClass.HUNTER_SURVIVAL,
                Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.MONK_MISTWEAVER, WoWClass.WARLOCK_AFFLICTION)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE, Talent.BEACON_OF_FAITH)),
                WoWClass.WARLOCK_AFFLICTION, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.MONK_MISTWEAVER, WoWClass.PALADIN_RETRIBUTION)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)), WoWClass.MONK_MISTWEAVER,
                Result.WIN, "often switched target; monk first down");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.DEMONHUNTER_HAVOC)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.DRUID_RESTORATION, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.HUNTER_SURVIVAL, WoWClass.PRIEST_DISCIPLINE)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)), WoWClass.PRIEST_DISCIPLINE,
                Result.DEFEAT, "not even with full crusader burst at the beginning of the game I was able to heal me up");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.DEMONHUNTER_HAVOC)),
                new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)),
                WoWClass.DRUID_RESTORATION, Result.DEFEAT, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.ROGUE_ASSASINATION)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART)),
                WoWClass.ROGUE_ASSASINATION, Result.WIN, "");
        new Fight(new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.DEMONHUNTER_HAVOC)),
                new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE)), WoWClass.DRUID_RESTORATION,
                Result.DEFEAT, "");
    }

    void test() {
        new DataProvider().fightService.storeFights(Fight.getAll());
    }
}

