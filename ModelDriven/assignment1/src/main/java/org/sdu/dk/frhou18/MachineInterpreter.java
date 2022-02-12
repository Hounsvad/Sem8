package org.sdu.dk.frhou18;

import org.sdu.dk.frhou18.metamodel.Machine;
import org.sdu.dk.frhou18.metamodel.State;
import org.sdu.dk.frhou18.metamodel.Transition;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class MachineInterpreter {
	Machine machine;

	public void run(Machine m) {
		this.machine = m;
	}

	public State getCurrentState() {
		return machine.currentState;
	}

	public void processEvent(String string) {
		List<Transition> transitions;
		try {
			transitions = machine.currentState.transitions.stream()
					.filter(transition -> transition.getEvent().equals(string)).collect(Collectors.toList());
		}catch (NoSuchElementException e){
			return;
		}
		for (var transition : transitions) {
			if (transition.isConditional()) {
				var conditional = machine.integers.get(transition.conditionalVariableName);
				switch (transition.conditional) {
					case EQUAL:
						if (conditional != transition.conditionalCompareValue) continue;
						break;
					case GREATER:
						if (conditional <= transition.conditionalCompareValue) continue;
						break;
					case LESS:
						if (conditional >= transition.conditionalCompareValue) continue;
						break;
					default:
						continue;
				}
			}
			if (transition.hasSetOperation()) {
				machine.integers.put(transition.operandVariableName, transition.setIntOperationValue);
			} else if (transition.hasIncrementOperation()) {
				machine.integers.put(transition.operandVariableName, machine.integers.get(transition.operandVariableName) + 1);
			} else if (transition.hasDecrementOperation()) {
				machine.integers.put(transition.operandVariableName, machine.integers.get(transition.operandVariableName) - 1);
			}

			machine.currentState = machine.states.stream().filter(state -> state.getName().equals(transition.targetState.getName())).findFirst().get();
			return;
		}
	}

	public int getInteger(String string) {
		return machine.integers.get(string);
	}

}
