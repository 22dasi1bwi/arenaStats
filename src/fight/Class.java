package fight;

import java.util.Collections;
import java.util.Set;

import com.google.common.collect.Sets;

import skill.Talent;

public enum Class {
	NONE(Collections.emptySet()), 
	DEMONHUNTER_HAVOC(Collections.emptySet()), 
	DEMONHUNTER_VENGEANCE(Collections.emptySet()), 
	WARRIOR_PROTECTION(Collections.emptySet()), 
	WARRIOR_FURY(Collections.emptySet()), 
	WARRIOR_ARMS(Collections.emptySet()), 
	DRUID_GUARDIAN(Collections.emptySet()), 
	DRUID_RESTORATION(Collections.emptySet()), 
	DRUID_BALANCE(Collections.emptySet()), 
	DRUID_FERAL(Collections.emptySet()), 
	PALADIN_PROTECTION(Collections.emptySet()), 
	PALADIN_HOLY(Sets.newHashSet(Talent.BEACON_OF_FAITH, Talent.BLESSED_HANDS, Talent.BLIND, Talent.CRUSADER, Talent.DIVINE_FAVOR, Talent.FIST_OF_JUSTICE, Talent.GLADIATOR, Talent.LIGHTS_GRACE, Talent.PURE_OF_HEART, Talent.RELENTLESS)), 
	PALADIN_RETRIBUTION(Collections.emptySet()), 
	MONK_BREWMASTER(Collections.emptySet()), 
	MONK_MISTWEAVER(Collections.emptySet()), 
	MONK_WINDWALKER(Collections.emptySet()), 
	DEATHKNIGHT_BLOOD(Collections.emptySet()), 
	DEATHKNIGHT_FROST(Collections.emptySet()), 
	DEATHKNIGHT_UNHOLY(Collections.emptySet()), 
	PRIEST_HOLY(Collections.emptySet()), 
	PRIEST_DISCIPLINE(Collections.emptySet()), 
	PRIEST_SHADOW(Collections.emptySet()), 
	HUNTER_MARKMANSHIP(Collections.emptySet()), 
	HUNTER_BEASTMASTERY(Collections.emptySet()), 
	HUNTER_SURVIVAL(Collections.emptySet()), 
	MAGE_ARCANE(Collections.emptySet()), 
	MAGE_FIRE(Collections.emptySet()), 
	MAGE_FROST(Collections.emptySet()), 
	ROGUE_SUBTLETY(Collections.emptySet()), 
	ROGUE_OUTLAW(Collections.emptySet()), 
	ROGUE_ASSASINATION(Collections.emptySet()), 
	SHAMAN_ELEMENTAL(Collections.emptySet()), 
	SHAMAN_ENHANCEMENT(Collections.emptySet()), 
	SHAMAN_RESTORATION(Collections.emptySet()), 
	WARLOCK_AFFLICTION(Collections.emptySet()), 
	WARLOCK_DESTRUCTION(Collections.emptySet()), 
	WARLOCK_DEMONOLOGY(Collections.emptySet());
	
	private Set<Talent> talents;
	
	private Class(Set<Talent> talents){
		this.talents = talents;
	}
	
	public Set<Talent> getTalents(){
		return talents;
	}
	
	
	
}
