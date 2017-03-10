import com.google.common.collect.Lists;

public class DataProvider {

	public static void provideData() {
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.HUNTER_SURVIVAL),
				Lists.newArrayList(Talent.CRUSADER, Talent.FIST_OF_JUSTICE), Class.PRIEST_DISCIPLINE, Result.DEFEAT,
				"");
		new Fight(new Combination(Class.DRUID_FERAL, Class.PRIEST_DISCIPLINE),
				Lists.newArrayList(Talent.CRUSADER, Talent.FIST_OF_JUSTICE), Class.DRUID_FERAL, Result.DEFEAT, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.HUNTER_BEASTMASTERY),
				Lists.newArrayList(Talent.CRUSADER, Talent.FIST_OF_JUSTICE), Class.HUNTER_BEASTMASTERY, Result.WIN, "");
		new Fight(new Combination(Class.DRUID_BALANCE, Class.MAGE_FROST),
				Lists.newArrayList(Talent.CRUSADER, Talent.FIST_OF_JUSTICE), Class.MAGE_FROST, Result.WIN, "");
		new Fight(new Combination(Class.WARRIOR_FURY, Class.WARLOCK_AFFLICTION),
				Lists.newArrayList(Talent.CRUSADER, Talent.FIST_OF_JUSTICE), Class.WARLOCK_AFFLICTION, Result.WIN, "");
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.WARRIOR_ARMS),
				Lists.newArrayList(Talent.CRUSADER, Talent.FIST_OF_JUSTICE), Class.PRIEST_DISCIPLINE, Result.DEFEAT,
				"Next time blessed hands");
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.SHAMAN_ELEMENTAL),
				Lists.newArrayList(Talent.CRUSADER, Talent.FIST_OF_JUSTICE), Class.SHAMAN_ELEMENTAL, Result.WIN, "");
		new Fight(new Combination(Class.MONK_WINDWALKER, Class.WARRIOR_ARMS),
				Lists.newArrayList(Talent.CRUSADER, Talent.FIST_OF_JUSTICE), Class.WARRIOR_ARMS, Result.WIN, "");
		new Fight(new Combination(Class.PALADIN_RETRIBUTION, Class.MONK_MISTWEAVER),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE), Class.MONK_MISTWEAVER, Result.DEFEAT,
				"");
		new Fight(new Combination(Class.HUNTER_MARKMANSHIP, Class.WARRIOR_ARMS),
				Lists.newArrayList(Talent.CRUSADER, Talent.FIST_OF_JUSTICE), Class.HUNTER_MARKMANSHIP, Result.WIN,
				"Only vs 1 hunter");
		new Fight(new Combination(Class.MONK_WINDWALKER, Class.PRIEST_DISCIPLINE),
				Lists.newArrayList(Talent.CRUSADER, Talent.FIST_OF_JUSTICE), Class.PRIEST_DISCIPLINE, Result.DEFEAT,
				"vs WW blessed hands");
		new Fight(new Combination(Class.WARRIOR_PROTECTION, Class.WARRIOR_FURY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE), Class.WARRIOR_FURY, Result.WIN, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.ROGUE_ASSASINATION),
				Lists.newArrayList(Talent.CRUSADER, Talent.FIST_OF_JUSTICE), Class.DRUID_RESTORATION, Result.DEFEAT,
				"");
		new Fight(new Combination(Class.MONK_MISTWEAVER, Class.MONK_WINDWALKER),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE), Class.MONK_MISTWEAVER, Result.WIN,
				"first MW than WW");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.ROGUE_ASSASINATION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE), Class.DRUID_RESTORATION,
				Result.DEFEAT, "Change target more often?");
		new Fight(new Combination(Class.PALADIN_HOLY, Class.SHAMAN_ELEMENTAL),
				Lists.newArrayList(Talent.CRUSADER, Talent.FIST_OF_JUSTICE), Class.PALADIN_HOLY, Result.WIN, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.WARRIOR_FURY),
				Lists.newArrayList(Talent.CRUSADER, Talent.FIST_OF_JUSTICE), Class.DRUID_RESTORATION, Result.DEFEAT,
				"");
		new Fight(new Combination(Class.DRUID_FERAL, Class.MONK_WINDWALKER),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE), Class.DRUID_FERAL, Result.WIN, "");
		new Fight(new Combination(Class.PALADIN_HOLY, Class.ROGUE_SUBTLETY),
				Lists.newArrayList(Talent.CRUSADER, Talent.FIST_OF_JUSTICE), Class.PALADIN_HOLY, Result.DEFEAT, "");
		new Fight(new Combination(Class.ROGUE_ASSASINATION, Class.SHAMAN_RESTORATION),
				Lists.newArrayList(Talent.CRUSADER, Talent.FIST_OF_JUSTICE), Class.SHAMAN_RESTORATION, Result.WIN, "");
		new Fight(new Combination(Class.DEMONHUNTER_HAVOC, Class.PRIEST_DISCIPLINE),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE), Class.PRIEST_DISCIPLINE, Result.WIN,
				"");
		new Fight(new Combination(Class.HUNTER_SURVIVAL, Class.WARRIOR_FURY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE), Class.WARRIOR_FURY, Result.WIN, "");
		new Fight(new Combination(Class.MAGE_FIRE, Class.ROGUE_ASSASINATION),
				Lists.newArrayList(Talent.CRUSADER, Talent.FIST_OF_JUSTICE), Class.ROGUE_ASSASINATION, Result.WIN, "");
		new Fight(new Combination(Class.MONK_MISTWEAVER, Class.DEATHKNIGHT_UNHOLY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE), Class.MONK_MISTWEAVER, Result.DEFEAT,
				"");
		new Fight(new Combination(Class.MAGE_FIRE, Class.ROGUE_SUBTLETY),
				Lists.newArrayList(Talent.CRUSADER, Talent.FIST_OF_JUSTICE), Class.MAGE_FIRE, Result.DEFEAT, "");
		new Fight(new Combination(Class.PALADIN_RETRIBUTION, Class.DEMONHUNTER_HAVOC),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE), Class.DEMONHUNTER_HAVOC, Result.WIN,
				"");
		new Fight(new Combination(Class.DEMONHUNTER_HAVOC, Class.SHAMAN_RESTORATION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE), Class.SHAMAN_RESTORATION,
				Result.DEFEAT, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.DEMONHUNTER_HAVOC),
				Lists.newArrayList(Talent.CRUSADER, Talent.BLIND), Class.DEMONHUNTER_HAVOC, Result.DEFEAT, "");
		new Fight(new Combination(Class.MONK_MISTWEAVER, Class.DEMONHUNTER_HAVOC),
				Lists.newArrayList(Talent.CRUSADER, Talent.BLIND), Class.MONK_MISTWEAVER, Result.DEFEAT, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.DEMONHUNTER_HAVOC),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE), Class.DRUID_RESTORATION, Result.WIN,
				"");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.DEMONHUNTER_HAVOC),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE), Class.DRUID_RESTORATION,
				Result.DEFEAT, "");
		new Fight(new Combination(Class.WARRIOR_ARMS, Class.WARLOCK_DESTRUCTION),
				Lists.newArrayList(Talent.CRUSADER, Talent.FIST_OF_JUSTICE), Class.WARLOCK_DESTRUCTION, Result.WIN, "");
		new Fight(new Combination(Class.MONK_WINDWALKER, Class.DEMONHUNTER_HAVOC),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE), Class.DEMONHUNTER_HAVOC, Result.WIN,
				"");
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.MAGE_FIRE),
				Lists.newArrayList(Talent.CRUSADER, Talent.FIST_OF_JUSTICE), Class.MAGE_FIRE, Result.DEFEAT,
				"Mixed focus");
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.MAGE_FROST),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE), Class.MAGE_FROST, Result.DEFEAT, "");
		new Fight(new Combination(Class.SHAMAN_RESTORATION, Class.WARRIOR_FURY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND), Class.SHAMAN_RESTORATION, Result.WIN, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.ROGUE_ASSASINATION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND), Class.DRUID_RESTORATION, Result.DEFEAT, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.ROGUE_SUBTLETY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND), Class.DRUID_RESTORATION, Result.WIN, "");
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.ROGUE_ASSASINATION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND), Class.PRIEST_DISCIPLINE, Result.DEFEAT,
				"Mixed focus");
		new Fight(new Combination(Class.MONK_MISTWEAVER, Class.ROGUE_ASSASINATION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND), Class.ROGUE_ASSASINATION, Result.WIN, "");
		new Fight(new Combination(Class.DEMONHUNTER_HAVOC, Class.PRIEST_HOLY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND), Class.PRIEST_HOLY, Result.DEFEAT, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.DEATHKNIGHT_UNHOLY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND), Class.DRUID_RESTORATION, Result.WIN, "");
		new Fight(new Combination(Class.WARRIOR_PROTECTION, Class.WARRIOR_ARMS),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND), Class.WARRIOR_ARMS, Result.DEFEAT, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.DEMONHUNTER_HAVOC),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND), Class.DRUID_RESTORATION, Result.WIN, "");
		new Fight(new Combination(Class.MAGE_FIRE, Class.MAGE_FIRE), Lists.newArrayList(Talent.CRUSADER, Talent.BLIND),
				Class.MAGE_FIRE, Result.WIN, "2x Mage");
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.ROGUE_ASSASINATION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND), Class.PRIEST_DISCIPLINE, Result.DEFEAT, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.WARRIOR_FURY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND), Class.DRUID_RESTORATION, Result.DEFEAT, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.WARLOCK_AFFLICTION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND), Class.WARLOCK_AFFLICTION, Result.DEFEAT, "");
		new Fight(new Combination(Class.PALADIN_HOLY, Class.DEATHKNIGHT_UNHOLY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND), Class.PALADIN_HOLY, Result.DEFEAT, "");
		new Fight(new Combination(Class.DEATHKNIGHT_FROST, Class.PRIEST_HOLY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND), Class.PRIEST_HOLY, Result.WIN, "");
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.ROGUE_ASSASINATION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND), Class.PRIEST_DISCIPLINE, Result.DEFEAT, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.DEMONHUNTER_HAVOC),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND), Class.DRUID_RESTORATION, Result.DEFEAT, "");
		new Fight(new Combination(Class.DRUID_FERAL, Class.PRIEST_SHADOW),
				Lists.newArrayList(Talent.CRUSADER, Talent.BLIND), Class.PRIEST_SHADOW, Result.DEFEAT, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.DEMONHUNTER_HAVOC),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND), Class.DRUID_RESTORATION, Result.WIN, "");
		new Fight(new Combination(Class.PALADIN_RETRIBUTION, Class.DEMONHUNTER_HAVOC),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND), Class.PALADIN_RETRIBUTION, Result.WIN, "");
		new Fight(new Combination(Class.MONK_MISTWEAVER, Class.DEMONHUNTER_HAVOC),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND), Class.MONK_MISTWEAVER, Result.DEFEAT, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.DEMONHUNTER_HAVOC),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND), Class.DRUID_RESTORATION, Result.DEFEAT, "");
		new Fight(new Combination(Class.DEMONHUNTER_HAVOC, Class.DEMONHUNTER_HAVOC),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND), Class.WARLOCK_DESTRUCTION, Result.WIN, "");
		new Fight(new Combination(Class.PALADIN_RETRIBUTION, Class.HUNTER_BEASTMASTERY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND), Class.PALADIN_RETRIBUTION, Result.WIN, "");
		new Fight(new Combination(Class.WARRIOR_FURY, Class.WARLOCK_DESTRUCTION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND), Class.WARRIOR_FURY, Result.WIN, "");
		new Fight(new Combination(Class.DEMONHUNTER_HAVOC, Class.SHAMAN_RESTORATION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND), Class.SHAMAN_RESTORATION, Result.DEFEAT,
				"first Resto, than havoc");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.DEATHKNIGHT_UNHOLY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND), Class.DRUID_RESTORATION, Result.WIN, "");
		new Fight(new Combination(Class.DEMONHUNTER_HAVOC, Class.WARRIOR_FURY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND), Class.WARRIOR_FURY, Result.WIN, "");
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.ROGUE_ASSASINATION),
				Lists.newArrayList(Talent.CRUSADER, Talent.BLIND), Class.PRIEST_DISCIPLINE, Result.DEFEAT, "");
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.ROGUE_ASSASINATION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND), Class.PRIEST_DISCIPLINE, Result.DEFEAT, "");
		new Fight(new Combination(Class.DRUID_FERAL, Class.MONK_MISTWEAVER),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND), Class.DRUID_FERAL, Result.WIN, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.WARRIOR_ARMS),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND), Class.DRUID_RESTORATION, Result.WIN, "");
		new Fight(new Combination(Class.MAGE_FROST, Class.ROGUE_SUBTLETY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND), Class.MAGE_FROST, Result.WIN, "");
		new Fight(new Combination(Class.ROGUE_ASSASINATION, Class.SHAMAN_RESTORATION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND), Class.SHAMAN_RESTORATION, Result.DEFEAT, "");
		new Fight(new Combination(Class.DEATHKNIGHT_FROST, Class.MAGE_ARCANE),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND), Class.MAGE_ARCANE, Result.DEFEAT, "");
		new Fight(new Combination(Class.MONK_MISTWEAVER, Class.WARLOCK_AFFLICTION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND), Class.WARLOCK_AFFLICTION, Result.WIN, "");
		new Fight(new Combination(Class.DEMONHUNTER_HAVOC, Class.PRIEST_DISCIPLINE),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND), Class.PRIEST_DISCIPLINE, Result.DEFEAT, "");
		new Fight(new Combination(Class.MONK_MISTWEAVER, Class.WARRIOR_FURY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND), Class.MONK_MISTWEAVER, Result.DEFEAT, "");
		new Fight(new Combination(Class.HUNTER_SURVIVAL, Class.SHAMAN_RESTORATION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.RELENTLESS), Class.HUNTER_SURVIVAL,
				Result.DEFEAT, "pressure on hunter was good");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.MAGE_FIRE),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.RELENTLESS), Class.MAGE_FIRE, Result.WIN,
				"");
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.ROGUE_ASSASINATION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR), Class.ROGUE_ASSASINATION,
				Result.DEFEAT, "pressure on rogue was good");
		new Fight(new Combination(Class.MONK_MISTWEAVER, Class.DEATHKNIGHT_UNHOLY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR), Class.MONK_MISTWEAVER,
				Result.WIN, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.ROGUE_SUBTLETY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR), Class.DRUID_RESTORATION,
				Result.DEFEAT, "");
		new Fight(new Combination(Class.MONK_MISTWEAVER, Class.DEATHKNIGHT_UNHOLY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR), Class.MONK_MISTWEAVER,
				Result.DEFEAT, "");
		new Fight(new Combination(Class.MONK_MISTWEAVER, Class.DEMONHUNTER_HAVOC),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR), Class.DEMONHUNTER_HAVOC,
				Result.WIN, "");
		new Fight(new Combination(Class.PALADIN_RETRIBUTION, Class.SHAMAN_RESTORATION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR), Class.PALADIN_RETRIBUTION,
				Result.WIN, "");
		new Fight(new Combination(Class.PRIEST_HOLY, Class.ROGUE_ASSASINATION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR), Class.PRIEST_HOLY, Result.WIN,
				"Mixed pressure was good");
		new Fight(new Combination(Class.MONK_WINDWALKER, Class.PRIEST_DISCIPLINE),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR), Class.PRIEST_DISCIPLINE,
				Result.DEFEAT, "");
		new Fight(new Combination(Class.DRUID_BALANCE, Class.PRIEST_DISCIPLINE),
				Lists.newArrayList(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR), Class.PRIEST_DISCIPLINE,
				Result.WIN, "crusader was awesome");
		new Fight(new Combination(Class.MONK_WINDWALKER, Class.PRIEST_DISCIPLINE),
				Lists.newArrayList(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR), Class.PRIEST_DISCIPLINE,
				Result.DEFEAT, "crusader better than hands");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.DEATHKNIGHT_UNHOLY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR), Class.DRUID_RESTORATION,
				Result.DEFEAT, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.HUNTER_BEASTMASTERY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.RELENTLESS), Class.HUNTER_BEASTMASTERY,
				Result.WIN, "");
		new Fight(new Combination(Class.MONK_MISTWEAVER, Class.DEATHKNIGHT_UNHOLY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR), Class.MONK_MISTWEAVER,
				Result.WIN, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.ROGUE_ASSASINATION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART),
				Class.ROGUE_ASSASINATION, Result.WIN, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.MAGE_FIRE),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.RELENTLESS, Talent.LIGHTS_GRACE),
				Class.MAGE_FIRE, Result.WIN, "switched on resto later on");
		new Fight(new Combination(Class.DEMONHUNTER_HAVOC, Class.PRIEST_DISCIPLINE),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.PRIEST_DISCIPLINE, Result.DEFEAT, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.DEATHKNIGHT_UNHOLY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.DRUID_RESTORATION, Result.WIN, "");
		new Fight(new Combination(Class.PALADIN_HOLY, Class.DEATHKNIGHT_UNHOLY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.PALADIN_HOLY, Result.DEFEAT, "");
		new Fight(new Combination(Class.ROGUE_ASSASINATION, Class.WARLOCK_DEMONOLOGY),
				Lists.newArrayList(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.WARLOCK_DEMONOLOGY, Result.WIN, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.DEMONHUNTER_HAVOC),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.DEMONHUNTER_HAVOC, Result.DEFEAT, "");
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.ROGUE_ASSASINATION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART),
				Class.ROGUE_ASSASINATION, Result.DEFEAT, "maybe the next time");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.ROGUE_ASSASINATION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART),
				Class.ROGUE_ASSASINATION, Result.DEFEAT, "maybe the next time");
		new Fight(new Combination(Class.MONK_MISTWEAVER, Class.SHAMAN_ENHANCEMENT),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.SHAMAN_ENHANCEMENT, Result.DEFEAT, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.ROGUE_ASSASINATION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART),
				Class.DRUID_RESTORATION, Result.WIN, "good dmg on both");
		new Fight(new Combination(Class.DEMONHUNTER_HAVOC, Class.DEMONHUNTER_HAVOC),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.DEMONHUNTER_HAVOC, Result.WIN, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.SHAMAN_ENHANCEMENT),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.SHAMAN_ENHANCEMENT, Result.DEFEAT, "");
		new Fight(new Combination(Class.DEMONHUNTER_HAVOC, Class.PRIEST_DISCIPLINE),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.PRIEST_DISCIPLINE, Result.DEFEAT, "");
		new Fight(new Combination(Class.PALADIN_RETRIBUTION, Class.HUNTER_SURVIVAL),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.PALADIN_RETRIBUTION, Result.WIN, "");
		new Fight(new Combination(Class.ROGUE_SUBTLETY, Class.SHAMAN_ELEMENTAL),
				Lists.newArrayList(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.SHAMAN_ELEMENTAL, Result.WIN, "crusader was a good choice");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.PALADIN_RETRIBUTION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.DRUID_RESTORATION, Result.WIN, "switched later on to pala");
		new Fight(new Combination(Class.DEMONHUNTER_HAVOC, Class.PRIEST_DISCIPLINE),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.PRIEST_DISCIPLINE, Result.DEFEAT, "");
		new Fight(new Combination(Class.DEATHKNIGHT_FROST, Class.ROGUE_SUBTLETY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.ROGUE_SUBTLETY, Result.WIN, "");
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.ROGUE_SUBTLETY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.PRIEST_DISCIPLINE, Result.DEFEAT, "get something better for this combo");
		new Fight(new Combination(Class.PALADIN_HOLY, Class.DEMONHUNTER_HAVOC),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.DEMONHUNTER_HAVOC, Result.DEFEAT, "");
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.MAGE_FROST),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.RELENTLESS, Talent.LIGHTS_GRACE),
				Class.MAGE_FROST, Result.DEFEAT, "Fear is not affected by relentless");
		new Fight(new Combination(Class.PALADIN_RETRIBUTION, Class.DEMONHUNTER_HAVOC),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.PALADIN_RETRIBUTION, Result.DEFEAT, "");
		new Fight(new Combination(Class.SHAMAN_RESTORATION, Class.WARRIOR_FURY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.SHAMAN_RESTORATION, Result.DEFEAT, "");
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.WARRIOR_FURY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.PRIEST_DISCIPLINE, Result.WIN, "");
		new Fight(new Combination(Class.PRIEST_SHADOW, Class.DEMONHUNTER_HAVOC),
				Lists.newArrayList(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.PRIEST_SHADOW, Result.WIN, "");
		new Fight(new Combination(Class.ROGUE_ASSASINATION, Class.MAGE_FIRE),
				Lists.newArrayList(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART),
				Class.MAGE_FIRE, Result.WIN, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.DEATHKNIGHT_UNHOLY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.DEATHKNIGHT_UNHOLY, Result.DEFEAT, "");
		new Fight(new Combination(Class.MONK_WINDWALKER, Class.MAGE_ARCANE),
				Lists.newArrayList(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.MAGE_ARCANE, Result.WIN, "");
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.ROGUE_ASSASINATION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART),
				Class.ROGUE_ASSASINATION, Result.WIN, "disc disconnect");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.DEATHKNIGHT_UNHOLY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.DRUID_RESTORATION, Result.DEFEAT, "");
		new Fight(new Combination(Class.ROGUE_ASSASINATION, Class.MAGE_FIRE),
				Lists.newArrayList(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART),
				Class.MAGE_FIRE, Result.WIN, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.WARRIOR_ARMS),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.WARRIOR_ARMS, Result.DEFEAT, "");
		new Fight(new Combination(Class.MONK_WINDWALKER, Class.ROGUE_ASSASINATION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART),
				Class.ROGUE_ASSASINATION, Result.WIN, "");
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.PRIEST_DISCIPLINE),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.PRIEST_DISCIPLINE, Result.WIN, "second partner was not there");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.DEMONHUNTER_HAVOC),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.DRUID_RESTORATION, Result.WIN, "");
		new Fight(new Combination(Class.SHAMAN_RESTORATION, Class.WARRIOR_FURY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.SHAMAN_RESTORATION, Result.DEFEAT, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.PRIEST_SHADOW),
				Lists.newArrayList(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.PRIEST_SHADOW, Result.DEFEAT, "");
		new Fight(new Combination(Class.MONK_MISTWEAVER, Class.DEMONHUNTER_HAVOC),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.MONK_MISTWEAVER, Result.WIN, "");
		new Fight(new Combination(Class.PALADIN_HOLY, Class.WARRIOR_FURY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.PALADIN_HOLY, Result.DEFEAT, "");
		new Fight(new Combination(Class.PRIEST_SHADOW, Class.ROGUE_SUBTLETY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.PRIEST_SHADOW, Result.WIN, "");
		new Fight(new Combination(Class.PALADIN_HOLY, Class.MAGE_FROST),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.MAGE_FROST, Result.WIN, "");
		new Fight(new Combination(Class.PALADIN_HOLY, Class.WARLOCK_AFFLICTION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.WARLOCK_AFFLICTION, Result.DEFEAT, "");
		new Fight(new Combination(Class.SHAMAN_RESTORATION, Class.WARLOCK_AFFLICTION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.WARLOCK_AFFLICTION, Result.DEFEAT, "");
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.WARRIOR_FURY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.PRIEST_DISCIPLINE, Result.WIN, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.ROGUE_ASSASINATION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.ROGUE_ASSASINATION, Result.WIN, "druid first down");
		new Fight(new Combination(Class.DEMONHUNTER_HAVOC, Class.SHAMAN_RESTORATION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.ROGUE_ASSASINATION, Result.WIN, "druid first down");
		new Fight(new Combination(Class.ROGUE_SUBTLETY, Class.MAGE_FIRE),
				Lists.newArrayList(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.MAGE_FIRE, Result.DEFEAT, "");
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.ROGUE_ASSASINATION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART),
				Class.ROGUE_ASSASINATION, Result.WIN, "rogue is a good choice");
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.ROGUE_ASSASINATION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART),
				Class.ROGUE_ASSASINATION, Result.DEFEAT, "");
		new Fight(new Combination(Class.DRUID_FERAL, Class.SHAMAN_RESTORATION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.DRUID_FERAL, Result.WIN, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.DEMONHUNTER_HAVOC),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.DRUID_RESTORATION, Result.DEFEAT, "");
		new Fight(new Combination(Class.DEATHKNIGHT_UNHOLY, Class.SHAMAN_RESTORATION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.SHAMAN_RESTORATION, Result.WIN, "god bless you @more");
		new Fight(new Combination(Class.MONK_MISTWEAVER, Class.WARRIOR_FURY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.MONK_MISTWEAVER, Result.WIN, "");
		new Fight(new Combination(Class.SHAMAN_RESTORATION, Class.WARRIOR_ARMS),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.SHAMAN_RESTORATION, Result.WIN, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.HUNTER_SURVIVAL),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.DRUID_RESTORATION, Result.DEFEAT, "switch targets was good");
		new Fight(new Combination(Class.PALADIN_HOLY, Class.ROGUE_ASSASINATION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART),
				Class.ROGUE_ASSASINATION, Result.DEFEAT, "forced pala to BOP, than switched to rogue");
		new Fight(new Combination(Class.ROGUE_ASSASINATION, Class.MAGE_FROST),
				Lists.newArrayList(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART),
				Class.MAGE_FROST, Result.DEFEAT, "");
		new Fight(new Combination(Class.MONK_WINDWALKER, Class.MAGE_FROST),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.MAGE_FROST, Result.WIN, "switched to monk later on");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.WARLOCK_AFFLICTION),
				Lists.newArrayList(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE,
						Talent.BEACON_OF_FAITH),
				Class.WARLOCK_AFFLICTION, Result.WIN, "hold massiv pressure on affliction");
		new Fight(new Combination(Class.SHAMAN_RESTORATION, Class.WARRIOR_FURY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.SHAMAN_RESTORATION, Result.DEFEAT, "");
		new Fight(new Combination(Class.PALADIN_HOLY, Class.DEATHKNIGHT_FROST),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.PALADIN_HOLY, Result.DEFEAT, "");
		new Fight(
				new Combination(Class.ROGUE_SUBTLETY, Class.MAGE_FIRE), Lists.newArrayList(Talent.CRUSADER,
						Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE, Talent.BEACON_OF_FAITH),
				Class.MAGE_FIRE, Result.WIN, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.MAGE_FROST),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.MAGE_FROST, Result.WIN, "");
		new Fight(new Combination(Class.ROGUE_ASSASINATION, Class.SHAMAN_RESTORATION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART),
				Class.SHAMAN_RESTORATION, Result.DEFEAT, "");
		new Fight(
				new Combination(Class.ROGUE_ASSASINATION, Class.SHAMAN_RESTORATION), Lists.newArrayList(Talent.CRUSADER,
						Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART, Talent.BEACON_OF_FAITH),
				Class.SHAMAN_RESTORATION, Result.DEFEAT, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.DEMONHUNTER_HAVOC),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.DEMONHUNTER_HAVOC, Result.WIN, "");
		new Fight(new Combination(Class.MONK_WINDWALKER, Class.PRIEST_DISCIPLINE),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.MONK_WINDWALKER, Result.DEFEAT, "");
		new Fight(
				new Combination(Class.DRUID_RESTORATION, Class.SHAMAN_ELEMENTAL), Lists.newArrayList(Talent.CRUSADER,
						Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE, Talent.BEACON_OF_FAITH),
				Class.DRUID_RESTORATION, Result.WIN, "crusader was a good choice");
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.MAGE_FROST),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.MAGE_FROST, Result.WIN, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.DEMONHUNTER_HAVOC),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.DRUID_RESTORATION, Result.DEFEAT, "");
		new Fight(new Combination(Class.MONK_MISTWEAVER, Class.DEMONHUNTER_HAVOC),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.MONK_MISTWEAVER, Result.DEFEAT, "was really close");
		new Fight(new Combination(Class.PALADIN_HOLY, Class.ROGUE_ASSASINATION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.ROGUE_ASSASINATION, Result.WIN, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.WARRIOR_ARMS),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.WARRIOR_ARMS, Result.DEFEAT, "");
		new Fight(
				new Combination(Class.DEATHKNIGHT_UNHOLY, Class.MAGE_FIRE), Lists.newArrayList(Talent.CRUSADER,
						Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE, Talent.BEACON_OF_FAITH),
				Class.MAGE_FIRE, Result.WIN, "");
		new Fight(new Combination(Class.PALADIN_HOLY, Class.HUNTER_BEASTMASTERY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.HUNTER_BEASTMASTERY, Result.WIN, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.ROGUE_ASSASINATION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART),
				Class.DRUID_RESTORATION, Result.DEFEAT, "");
		new Fight(new Combination(Class.SHAMAN_RESTORATION, Class.WARRIOR_FURY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.SHAMAN_RESTORATION, Result.DEFEAT, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.SHAMAN_ENHANCEMENT),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.SHAMAN_ENHANCEMENT, Result.DEFEAT, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.HUNTER_SURVIVAL),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.DRUID_RESTORATION, Result.DEFEAT, "");
		new Fight(new Combination(Class.ROGUE_ASSASINATION, Class.ROGUE_ASSASINATION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART),
				Class.ROGUE_ASSASINATION, Result.WIN, "only one rogue there");
		new Fight(
				new Combination(Class.MAGE_FROST, Class.ROGUE_SUBTLETY), Lists.newArrayList(Talent.CRUSADER,
						Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE, Talent.BEACON_OF_FAITH),
				Class.MAGE_FROST, Result.DEFEAT, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.SHAMAN_ENHANCEMENT),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.DRUID_RESTORATION, Result.WIN, "");
		new Fight(new Combination(Class.MAGE_FIRE, Class.ROGUE_SUBTLETY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.MAGE_FIRE, Result.WIN, "");
		new Fight(new Combination(Class.MAGE_FIRE, Class.ROGUE_ASSASINATION),
				Lists.newArrayList(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART),
				Class.MAGE_FIRE, Result.WIN, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.ROGUE_ASSASINATION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART),
				Class.DRUID_RESTORATION, Result.WIN, "");
		new Fight(new Combination(Class.HUNTER_SURVIVAL, Class.PRIEST_DISCIPLINE),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.HUNTER_SURVIVAL, Result.DEFEAT, "");
		new Fight(new Combination(Class.MAGE_FROST, Class.PRIEST_SHADOW),
				Lists.newArrayList(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE,
						Talent.BEACON_OF_FAITH),
				Class.PRIEST_SHADOW, Result.WIN, "crusader was probably the better choice");
		new Fight(new Combination(Class.SHAMAN_RESTORATION, Class.PRIEST_SHADOW),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.PRIEST_SHADOW, Result.DEFEAT, "absolutly no chance; crusader + additional beacon");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.ROGUE_ASSASINATION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.ROGUE_ASSASINATION, Result.WIN, "");
		new Fight(new Combination(Class.DRUID_FERAL, Class.SHAMAN_RESTORATION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.SHAMAN_RESTORATION, Result.DEFEAT, "crusader?");
		new Fight(
				new Combination(Class.PALADIN_HOLY, Class.PRIEST_SHADOW), Lists.newArrayList(Talent.CRUSADER,
						Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE, Talent.BEACON_OF_FAITH),
				Class.PRIEST_SHADOW, Result.DEFEAT, "");
		new Fight(
				new Combination(Class.PALADIN_HOLY, Class.DEATHKNIGHT_UNHOLY), Lists.newArrayList(Talent.CRUSADER,
						Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE, Talent.BEACON_OF_FAITH),
				Class.PALADIN_HOLY, Result.DEFEAT, "");
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.ROGUE_ASSASINATION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART),
				Class.PRIEST_DISCIPLINE, Result.DEFEAT, "");
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.DEMONHUNTER_HAVOC),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.PRIEST_DISCIPLINE, Result.WIN, "");
		new Fight(
				new Combination(Class.MAGE_FIRE, Class.DEMONHUNTER_HAVOC), Lists.newArrayList(Talent.CRUSADER,
						Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE, Talent.BEACON_OF_FAITH),
				Class.MAGE_FIRE, Result.DEFEAT, "consider bubble rather than bop");
		new Fight(
				new Combination(Class.MAGE_FIRE, Class.MONK_MISTWEAVER), Lists.newArrayList(Talent.CRUSADER,
						Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE, Talent.BEACON_OF_FAITH),
				Class.MAGE_FIRE, Result.WIN, "");
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.DEATHKNIGHT_FROST),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.PRIEST_DISCIPLINE, Result.WIN, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.SHAMAN_ENHANCEMENT),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.DRUID_RESTORATION, Result.WIN, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.DEATHKNIGHT_UNHOLY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.DRUID_RESTORATION, Result.DEFEAT, "");
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.PALADIN_RETRIBUTION),
				Lists.newArrayList(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.PRIEST_DISCIPLINE, Result.DEFEAT, "");
		new Fight(new Combination(Class.DEMONHUNTER_HAVOC, Class.WARRIOR_FURY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.WARRIOR_FURY, Result.WIN, "");
		new Fight(new Combination(Class.MONK_MISTWEAVER, Class.SHAMAN_ENHANCEMENT),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.MONK_MISTWEAVER, Result.WIN, "");
		new Fight(new Combination(Class.MONK_MISTWEAVER, Class.DEMONHUNTER_HAVOC),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.DEMONHUNTER_HAVOC, Result.DEFEAT, "");
		new Fight(new Combination(Class.MONK_MISTWEAVER, Class.WARRIOR_FURY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.MONK_MISTWEAVER, Result.DEFEAT, "switched often; didn't reached both");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.ROGUE_ASSASINATION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART),
				Class.ROGUE_ASSASINATION, Result.DEFEAT, "");
		new Fight(new Combination(Class.WARRIOR_FURY, Class.DEMONHUNTER_HAVOC),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.WARRIOR_FURY, Result.WIN, "");
		new Fight(
				new Combination(Class.MAGE_FIRE, Class.ROGUE_ASSASINATION), Lists.newArrayList(Talent.CRUSADER,
						Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART, Talent.BEACON_OF_FAITH),
				Class.MAGE_FIRE, Result.WIN, "");
		new Fight(new Combination(Class.MAGE_FROST, Class.DEMONHUNTER_HAVOC),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.MAGE_FROST, Result.WIN, "");
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.ROGUE_ASSASINATION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART),
				Class.ROGUE_ASSASINATION, Result.DEFEAT, "");
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.ROGUE_ASSASINATION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART),
				Class.ROGUE_ASSASINATION, Result.DEFEAT, "");
		new Fight(new Combination(Class.DEMONHUNTER_HAVOC, Class.DEATHKNIGHT_UNHOLY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.DEMONHUNTER_HAVOC, Result.WIN, "");
		new Fight(new Combination(Class.MONK_MISTWEAVER, Class.WARRIOR_ARMS),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.MONK_MISTWEAVER, Result.DEFEAT, "changed target often");
		new Fight(new Combination(Class.MAGE_FROST, Class.PALADIN_HOLY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.MAGE_FROST, Result.WIN, "");
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.ROGUE_ASSASINATION),
				Lists.newArrayList(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART),
				Class.ROGUE_ASSASINATION, Result.WIN, "crusader!!!!");
		new Fight(new Combination(Class.SHAMAN_RESTORATION, Class.WARLOCK_DEMONOLOGY),
				Lists.newArrayList(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.WARLOCK_DEMONOLOGY, Result.DEFEAT, "");
		new Fight(
				new Combination(Class.PRIEST_DISCIPLINE, Class.WARLOCK_AFFLICTION), Lists.newArrayList(Talent.CRUSADER,
						Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE, Talent.BEACON_OF_FAITH),
				Class.WARLOCK_AFFLICTION, Result.WIN, "");
		new Fight(
				new Combination(Class.DRUID_FERAL, Class.PALADIN_HOLY), Lists.newArrayList(Talent.CRUSADER,
						Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE, Talent.BEACON_OF_FAITH),
				Class.DRUID_FERAL, Result.WIN, "crusader is good with beacon");
		new Fight(new Combination(Class.ROGUE_SUBTLETY, Class.ROGUE_SUBTLETY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.ROGUE_SUBTLETY, Result.WIN, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.DEMONHUNTER_HAVOC),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.DRUID_RESTORATION, Result.WIN, "burst on druid with touch of death on havoc; havoc died first");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.DEMONHUNTER_HAVOC),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.DRUID_RESTORATION, Result.DEFEAT, "");
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.ROGUE_ASSASINATION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.ROGUE_ASSASINATION, Result.DEFEAT, "");
		new Fight(new Combination(Class.MONK_WINDWALKER, Class.DEMONHUNTER_VENGEANCE),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.MONK_WINDWALKER, Result.DEFEAT, "");
		new Fight(
				new Combination(Class.WARLOCK_AFFLICTION, Class.SHAMAN_RESTORATION), Lists.newArrayList(Talent.CRUSADER,
						Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE, Talent.BEACON_OF_FAITH),
				Class.WARLOCK_AFFLICTION, Result.WIN, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.MAGE_FROST),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.MAGE_FROST, Result.DEFEAT, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.DEMONHUNTER_HAVOC),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.DRUID_RESTORATION, Result.WIN, "");
		new Fight(new Combination(Class.MONK_WINDWALKER, Class.WARRIOR_FURY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.MONK_WINDWALKER, Result.DEFEAT, "");
		new Fight(new Combination(Class.MAGE_FIRE, Class.ROGUE_SUBTLETY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.MAGE_FIRE, Result.DEFEAT, "");
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.ROGUE_SUBTLETY),
				Lists.newArrayList(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.ROGUE_SUBTLETY, Result.WIN, "");
		new Fight(new Combination(Class.MAGE_FIRE, Class.ROGUE_SUBTLETY),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.MAGE_FIRE, Result.DEFEAT, "play it with crusader next time");
		new Fight(new Combination(Class.ROGUE_ASSASINATION, Class.MAGE_FROST),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART),
				Class.ROGUE_ASSASINATION, Result.WIN, "");
		new Fight(new Combination(Class.ROGUE_ASSASINATION, Class.PRIEST_DISCIPLINE),
				Lists.newArrayList(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART),
				Class.ROGUE_ASSASINATION, Result.DEFEAT, "what the hell shall we do?");
		new Fight(
				new Combination(Class.PALADIN_HOLY, Class.PRIEST_SHADOW), Lists.newArrayList(Talent.CRUSADER,
						Talent.BLIND, Talent.GLADIATOR, Talent.BEACON_OF_FAITH, Talent.LIGHTS_GRACE),
				Class.PRIEST_SHADOW, Result.DEFEAT, "");
		new Fight(
				new Combination(Class.HUNTER_SURVIVAL, Class.DRUID_RESTORATION), Lists.newArrayList(Talent.CRUSADER,
						Talent.BLIND, Talent.GLADIATOR, Talent.BEACON_OF_FAITH, Talent.LIGHTS_GRACE),
				Class.HUNTER_SURVIVAL, Result.DEFEAT, "");
		new Fight(
				new Combination(Class.DEMONHUNTER_HAVOC, Class.MONK_MISTWEAVER), Lists.newArrayList(Talent.CRUSADER,
						Talent.BLIND, Talent.GLADIATOR, Talent.BEACON_OF_FAITH, Talent.LIGHTS_GRACE),
				Class.MONK_MISTWEAVER, Result.WIN, "splitted dmg");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.HUNTER_SURVIVAL),
				Lists.newArrayList(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.HUNTER_SURVIVAL, Result.DEFEAT, "");

		// started here today (18.02.17)
		new Fight(new Combination(Class.MONK_MISTWEAVER, Class.ROGUE_ASSASINATION),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART),
				Class.ROGUE_ASSASINATION, Result.DEFEAT, "");
		new Fight(new Combination(Class.HUNTER_SURVIVAL, Class.PRIEST_DISCIPLINE),
				Lists.newArrayList(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.HUNTER_SURVIVAL, Result.DEFEAT, "");
		new Fight(new Combination(Class.ROGUE_SUBTLETY, Class.MAGE_FIRE),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.MAGE_FIRE, Result.WIN, "");
		new Fight(new Combination(Class.ROGUE_ASSASINATION, Class.DEMONHUNTER_HAVOC),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART),
				Class.DEMONHUNTER_HAVOC, Result.WIN, "");
		new Fight(new Combination(Class.MAGE_FIRE, Class.PALADIN_RETRIBUTION),
				Lists.newArrayList(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.MAGE_FIRE, Result.DEFEAT, "");
		new Fight(
				new Combination(Class.WARLOCK_AFFLICTION, Class.MONK_WINDWALKER), Lists.newArrayList(Talent.CRUSADER,
						Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE, Talent.BEACON_OF_FAITH),
				Class.WARLOCK_AFFLICTION, Result.WIN, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.DEMONHUNTER_HAVOC),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.DRUID_RESTORATION, Result.DEFEAT, "");
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.ROGUE_ASSASINATION),
				Lists.newArrayList(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART),
				Class.ROGUE_ASSASINATION, Result.WIN,
				"high pressure on assa, so that disc cannot do any dmg to us. separate them from each other and burst on rogue");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.ROGUE_ASSASINATION),
				Lists.newArrayList(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART),
				Class.ROGUE_ASSASINATION, Result.WIN,
				"high pressure on assa, so that resto cannot do any dmg / stun to us. separate them from each other and burst on rogue");
		new Fight(new Combination(Class.PALADIN_HOLY, Class.SHAMAN_ELEMENTAL),
				Lists.newArrayList(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.SHAMAN_ELEMENTAL, Result.WIN, "");
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.ROGUE_ASSASINATION),
				Lists.newArrayList(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART),
				Class.ROGUE_ASSASINATION, Result.WIN, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.DEMONHUNTER_HAVOC),
				Lists.newArrayList(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.DEMONHUNTER_HAVOC, Result.WIN, "");
		new Fight(new Combination(Class.MONK_MISTWEAVER, Class.ROGUE_ASSASINATION),
				Lists.newArrayList(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART),
				Class.ROGUE_ASSASINATION, Result.WIN, "switched to monk later on");
		new Fight(new Combination(Class.MONK_MISTWEAVER, Class.HUNTER_SURVIVAL),
				Lists.newArrayList(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.HUNTER_SURVIVAL, Result.WIN, "");
		new Fight(
				new Combination(Class.MONK_MISTWEAVER, Class.WARLOCK_AFFLICTION), Lists.newArrayList(Talent.CRUSADER,
						Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE, Talent.BEACON_OF_FAITH),
				Class.WARLOCK_AFFLICTION, Result.DEFEAT, "");
		new Fight(new Combination(Class.MONK_MISTWEAVER, Class.PALADIN_RETRIBUTION),
				Lists.newArrayList(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.MONK_MISTWEAVER, Result.WIN, "often switched target; monk first down");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.DEMONHUNTER_HAVOC),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.DRUID_RESTORATION, Result.WIN, "");
		new Fight(new Combination(Class.HUNTER_SURVIVAL, Class.PRIEST_DISCIPLINE),
				Lists.newArrayList(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.PRIEST_DISCIPLINE, Result.DEFEAT,
				"not even with full crusader burst at the beginning of the game I was able to heal me up");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.DEMONHUNTER_HAVOC),
				Lists.newArrayList(Talent.BLESSED_HANDS, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.DRUID_RESTORATION, Result.DEFEAT, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.ROGUE_ASSASINATION),
				Lists.newArrayList(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.PURE_OF_HEART),
				Class.ROGUE_ASSASINATION, Result.WIN, "");
		new Fight(new Combination(Class.DRUID_RESTORATION, Class.DEMONHUNTER_HAVOC),
				Lists.newArrayList(Talent.CRUSADER, Talent.BLIND, Talent.GLADIATOR, Talent.LIGHTS_GRACE),
				Class.DRUID_RESTORATION, Result.DEFEAT, "");
	}
}
