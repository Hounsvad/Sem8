package org.sdu.dk.frhou18.metamodel;

public class Transition {

	public String transitionEvent;
	public State targetState;
	public boolean hasIncrementOption;
	public boolean hasDecrementOption;
	public String conditionalVariableName = null;
	public boolean hasSetOperation;
	public int setIntOperationValue;
	public String operandVariableName = null;
	public enum conditionals {GREATER, LESS, EQUAL}
	public conditionals conditional = null;
	public int conditionalCompareValue;

	public Transition() {
	}

	public Transition(String transitionEvent) {
		this.transitionEvent = transitionEvent;
	}

	public String getEvent() {
		return transitionEvent;
	}

	public State getTarget() {
		return targetState;
	}

	public boolean hasSetOperation() {
		return hasSetOperation;
	}

	public boolean hasIncrementOperation() {
		return hasIncrementOption;
	}

	public boolean hasDecrementOperation() {
		return hasDecrementOption;
	}

	public String getOperationVariableName() {
		return operandVariableName;
	}

	public boolean isConditional() {
		return conditional != null;
	}

	public String getConditionVariableName() {
		return conditionalVariableName;
	}

	public Integer getConditionComparedValue() {
		return conditionalCompareValue;
	}

	public boolean isConditionEqual() {
		return conditional.equals(conditionals.EQUAL);
	}

	public boolean isConditionGreaterThan() {
		return conditional.equals(conditionals.GREATER);
	}

	public boolean isConditionLessThan() {
		return conditional.equals(conditionals.LESS);
	}

	public boolean hasOperation() {
		return hasDecrementOption || hasIncrementOption;
	}
}
