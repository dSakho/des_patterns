package com.desginPatterns.core.shapes;

public class Person {
	
	private String firstName;
	private String lastName;
	private String streetAddress;
	private String city;
	private String state;
	private String postalCode;
	private String telephoneNumber;
	private String occupation;
	
	public Person() { }
	
	public Person(String firstName, String lastName, String streetAddress, 
			String city, String state, String postalCode, String telephoneNumber, String occupation) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.telephoneNumber = telephoneNumber;
		this.occupation = occupation;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	public static class PersonBuilder {
		
		private String nestedFirstName;
		private String nestedLastName;  
	    private String nestedStreetAddress;
	    private String nestedCity;
	    private String nestedState;
	    private String nestedPostalCode;
	    private String nestedTelephoneNumber;
	    private String nestedOccupation;
	    
		public PersonBuilder(final String nestedFirstName, final String nestedLastName) {
			this.nestedFirstName = nestedFirstName;
			this.nestedLastName = nestedLastName;
		}

		public PersonBuilder setNestedFirstName(String nestedFirstName) {
			this.nestedFirstName = nestedFirstName;
			return this;
		}

		public void setNestedLastName(String nestedLastName) {
			this.nestedLastName = nestedLastName;
		}

		public PersonBuilder setNestedStreetAddress(String nestedStreetAddress) {
			this.nestedStreetAddress = nestedStreetAddress;
			return this;
		}

		public PersonBuilder setNestedCity(String nestedCity) {
			this.nestedCity = nestedCity;
			return this;
		}

		public PersonBuilder setNestedState(String nestedState) {
			this.nestedState = nestedState;
			return this;
		}

		public PersonBuilder setNestedPostalCode(String nestedPostalCode) {
			this.nestedPostalCode = nestedPostalCode;
			return this;
		}

		public PersonBuilder setNestedTelephoneNumber(String nestedTelephoneNumber) {
			this.nestedTelephoneNumber = nestedTelephoneNumber;
			return this;
		}

		public PersonBuilder setNestedOccupation(String nestedOccupation) {
			this.nestedOccupation = nestedOccupation;
			return this;
		}
	 
		public Person buildPerson() {
			return new Person(
					nestedFirstName, nestedLastName, 
					nestedStreetAddress, nestedCity, nestedState, 
					nestedPostalCode, nestedTelephoneNumber, nestedOccupation);
		}
	    
	}

	@Override
	public String toString() {
		return String.format(
				"Person [firstName=%s, lastName=%s, streetAddress=%s, city=%s, state=%s, postalCode=%s, telephoneNumber=%s, occupation=%s]",
				firstName, lastName, streetAddress, city, state, postalCode, telephoneNumber, occupation);
	}
}
