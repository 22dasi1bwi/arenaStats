package sda.ArenaStatisticTracker.build;

import java.io.Serializable;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.google.common.collect.Sets;

import sda.ArenaStatisticTracker.fight.Fight;

@Entity
@Table(name = "BUILD")
public class Build implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private long id;
	
	@ElementCollection(targetClass = Talent.class)
	@Enumerated(EnumType.STRING)
	@Column(name = "BUILD")
	private Set<Talent> build;
	
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	private Fight fight;

	public static final Build EMPTY_BUILD = new Build(Sets.newHashSet());

	public Build(){
		
	}
	
	public Build(Set<Talent> build) {
		this.build = build;
	}

	public Set<Talent> getBuild() {
		return build;
	}
	
	public long getId(){
		return id;
	}
	
	public Fight getFight(){
		return fight;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!this.getClass().equals(obj.getClass())) {
			return false;
		}
		Build other = (Build) obj;

		if (this.build.containsAll(other.build) && this.build.size() == other.build.size()) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return build.stream().map(talent -> talent.name()).collect(Collectors.toList()).toString();
	}

}
