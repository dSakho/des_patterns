package com.designPatterns.behavioral.strategy;

import com.designPatterns.stratgey.core.Context;
import com.designPatterns.stratgey.core.OperationAdd;
import com.designPatterns.stratgey.core.OperationMultiply;
import com.designPatterns.stratgey.core.OperationSubtract;

/*
 * Define a family of algorithms, encapsulate each one, and make them interchangeable. 
 * Strategy lets the algorithm vary independently from the clients that use it.
 * 
 * Capture the abstraction in an interface, bury implementation details in derived classes.
 */
public class StrategyPatternDemo {

	public static void main(String[] args) {
		Context context = new Context(new OperationAdd());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationSubtract());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationMultiply());
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	}
}
