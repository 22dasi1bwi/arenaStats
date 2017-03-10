package skill;
import fight.Class;

public enum Talent {

	BLIND(Class.PALADIN_HOLY, 3, TalentType.PvP), CRUSADER(Class.PALADIN_HOLY, 6, TalentType.PvP), DIVINE_FAVOR(
			Class.PALADIN_HOLY, 2,
			TalentType.PvP), BLESSED_HANDS(Class.PALADIN_HOLY, 6, TalentType.PvP), FIST_OF_JUSTICE(Class.PALADIN_HOLY,
					3, TalentType.PvP), RELENTLESS(Class.PALADIN_HOLY, 1, TalentType.PvP), GLADIATOR(Class.PALADIN_HOLY,
							1, TalentType.PvP), PURE_OF_HEART(Class.PALADIN_HOLY, 4, TalentType.PvP), LIGHTS_GRACE(
									Class.PALADIN_HOLY, 4,
									TalentType.PvP), BEACON_OF_FAITH(Class.PALADIN_HOLY, 7, TalentType.PvE);

	private Class clazz;

	private int tier;

	private TalentType type;

	Talent(Class clazz, int tier, TalentType type) {
		this.clazz = clazz;
		this.tier = tier;
		this.type = type;
	}

	Class getClazz() {
		return clazz;
	}

	int getTier() {
		return tier;
	}

	TalentType getType() {
		return type;
	}
}
