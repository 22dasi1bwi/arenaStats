package skill;

public enum Talent {

	RELENTLESS(1, TalentType.PvP), 
	GLADIATOR(1, TalentType.PvP), 
	DIVINE_FAVOR(2, TalentType.PvP), 
	BLIND(3, TalentType.PvP), 
	FIST_OF_JUSTICE(3, TalentType.PvP), 
	LIGHTS_GRACE(4, TalentType.PvP), 
	PURE_OF_HEART(4, TalentType.PvP), 
	CRUSADER(6, TalentType.PvP),
	BLESSED_HANDS(6, TalentType.PvP), 
	BEACON_OF_FAITH(7, TalentType.PvE);

	private int tier;

	private TalentType type;

	private Talent(int tier, TalentType type) {
		this.tier = tier;
		this.type = type;
	}
	
	public int getTier() {
		return tier;
	}

	public TalentType getType() {
		return type;
	}
}
