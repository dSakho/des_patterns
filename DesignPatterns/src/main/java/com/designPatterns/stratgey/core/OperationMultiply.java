package com.designPatterns.stratgey.core;

public class OperationMultiply implements Strategy {

	/*
	 * (non-Javadoc)
	 * @see com.designPatterns.stratgey.core.Strategy#doOperation(int, int)
	 */
	@Override
	public int doOperation(int num1, int num2) {
		return num1 * num2;
	}

}
