package org.sdu.dk.frhou18;

import org.sdu.dk.frhou18.metamodel.*;

import java.util.HashMap;
import java.util.Map;

public class StateMachine {
	public StateMachine() {

	}
	public Machine machine = new Machine();
	public Transition currentTransition = null;
	public State currentState = null;

	public Machine build() {
		if (machine.initialState == null){
			machine.initialState = machine.states.get(0);
		}
		machine.currentState = machine.initialState;
		return machine;
	}

	public StateMachine state(String string) {
		currentState = new State(string);
		machine.states.add(currentState);
		return this;
	}

	public StateMachine initial() {
		machine.initialState = currentState;
		return this;
	}

	public StateMachine when(String string) {
		currentTransition = new Transition(string);
		currentState.transitions.add(currentTransition);
		return this;
	}

	public StateMachine to(String string) {
		currentTransition.targetState = new State(string);
		return this;
	}

	public StateMachine integer(String string) {
		machine.integers.put(string, 0);
		return this;
	}

	public StateMachine set(String string, int i) {
		currentTransition.hasSetOperation = true;
		currentTransition.setIntOperationValue = i;
		currentTransition.operandVariableName = string;
		return this;
	}

	public StateMachine increment(String string) {
		currentTransition.hasIncrementOption = true;
		currentTransition.operandVariableName = string;
		return this;
	}

	public StateMachine decrement(String string) {
		currentTransition.hasDecrementOption = true;
		currentTransition.operandVariableName = string;
		return this;
	}

	public StateMachine ifEquals(String string, int i) {
		currentTransition.conditionalVariableName = string;
		currentTransition.conditional = Transition.conditionals.EQUAL;
		currentTransition.conditionalCompareValue = i;
		return this;
	}

	public StateMachine ifGreaterThan(String string, int i) {
		currentTransition.conditionalVariableName = string;
		currentTransition.conditional = Transition.conditionals.GREATER;
		currentTransition.conditionalCompareValue = i;
		return this;
	}

	public StateMachine ifLessThan(String string, int i) {
		currentTransition.conditionalVariableName = string;
		currentTransition.conditional = Transition.conditionals.LESS;
		currentTransition.conditionalCompareValue = i;
		return this;
	}

}
