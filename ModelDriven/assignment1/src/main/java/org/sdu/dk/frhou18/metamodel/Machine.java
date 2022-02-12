package org.sdu.dk.frhou18.metamodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Machine {

	public List<State> states = new ArrayList<>();
	public State initialState;
	public Map<String, Integer> integers = new HashMap<>();
	public State currentState;


	public List<State> getStates() {
		return states;
	}

	public State getInitialState() {
		return initialState;
	}

	public State getState(String string) {
		return states.stream().filter(state -> state.getName().equals(string)).findFirst().get();
	}

	public int numberOfIntegers() {
		return this.integers.keySet().size();
	}

	public boolean hasInteger(String string) {
		return this.integers.containsKey(string);
	}

}
