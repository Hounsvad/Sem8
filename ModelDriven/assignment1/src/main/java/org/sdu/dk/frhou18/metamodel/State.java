package org.sdu.dk.frhou18.metamodel;

import java.util.ArrayList;
import java.util.List;

public class State {

	public String name;
	public List<Transition> transitions;

	public State(String name) {
		this.name = name;
		this.transitions = new ArrayList<>();
	}

	public State() {
	}

	public String getName() {
		return name;
	}

	public List<Transition> getTransitions() {
		return transitions;
	}

	public Transition getTransitionByEvent(String string) {
		return transitions.stream().filter(t -> t.getEvent().equals(string)).findFirst().get();
	}

}
