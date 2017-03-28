package sda.ArenaStatisticTracker.build;

import java.util.Set;
import java.util.stream.Collectors;

import com.google.common.collect.Sets;

public class Build {

	private Set<Talent> build;

	public static final Build EMPTY_BUILD = new Build(Sets.newHashSet());

	public Build(Set<Talent> build) {
		this.build = build;
	}

	public Set<Talent> getBuild() {
		return build;
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
