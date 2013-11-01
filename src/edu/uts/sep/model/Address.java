package edu.uts.sep.model;

public class Address {

	private int id;
	private int unitNumber;
	private String streetNumber; //string because there may be letters in the street number e.g. 37A Wallaby Way
	private String streetAddress;
	private String suburb;
	private int postcode; //this system does not support UK-style postcodes at this time
	private String state;
	
	public Address() {
		
	}

	public Address(int id, int unitNumber, String streetNumber,
			String streetAddress, String suburb, int postcode, String state) {
		super();
		this.id = id;
		this.unitNumber = unitNumber;
		this.streetNumber = streetNumber;
		this.streetAddress = streetAddress;
		this.suburb = suburb;
		this.postcode = postcode;
		this.state = state;
	}

	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}

	public int getUnitNumber() {
		return unitNumber;
	}

	public void setUnitNumber(int unitNumber) {
		this.unitNumber = unitNumber;
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getSuburb() {
		return suburb;
	}

	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}

	public int getPostcode() {
		return postcode;
	}

	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	
}
