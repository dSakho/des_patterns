package com.designPatterns.creational.builder;

import com.desginPatterns.core.shapes.Person;

public class PersonBuilderTest {
	
	public static void main(String[] args) {
		
		Person johnSmith = 
				new Person("John", "Smith", "1122 Main St", "New York", 
						"NY", "00111", "212-123-4567", "Professional Pancake Maker");
		
//		johnSmith = new Person.PersonBuilder("John", "Smith")
//						.setNestedStreetAddress("1122 Main St")
//						.setNestedCity("New York")
//						.setNestedState("NY")
//						.setNestedPostalCode("00111")
//						.setNestedTelephoneNumber("212-123-4567")
//						.setNestedOccupation("Professional Pancake Maker")
//						.buildPerson();
		
		System.out.println(johnSmith);
	}

}
