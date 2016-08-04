package com.designPatterns.behavioral.observer;

import com.desginPatterns.behavioral.core.Person;
import com.desginPatterns.behavioral.core.Product;

/*
 * Define a one-to-many dependency between objects so that when one object changes state, 
 * all its dependents are notified and updated automatically.
 * 
 * Encapsulate the core (or common or engine) components in a Subject abstraction, 
 * and the variable (or optional or user interface) components in an Observer hierarchy.
 * 
 * The "View" part of Model-View-Controller desgin.
 */
public class ObserverPatternDemo {

	public static void main(String[] args) {
		Person janePerson = new Person("Jane");
		Person johnPerson = new Person("John");

		Product samsungMobile = new Product("Apple", "Ipad", "Not available");

		// When you opt for option "Notify me when product is available".
		// Below registerObserver method get executed
		samsungMobile.registerObserver(janePerson);
		samsungMobile.registerObserver(johnPerson);

		// Now product is available
		samsungMobile.setAvailability("Available");
	}

}
