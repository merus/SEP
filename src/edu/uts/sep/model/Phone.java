package edu.uts.sep.model;

public class Phone {

	private int id;
	private PhoneType phoneType;
	private String number;
	
	public Phone() {
		
	}

	public Phone(int id, PhoneType phoneType, String number) {
		super();
		this.phoneType = phoneType;
		this.number = number;
	}
	
	public int getID() {
		return id;
	}
	
	public void setID(int ID) {
		this.id = ID;
	}

	public PhoneType getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(PhoneType phoneType) {
		this.phoneType = phoneType;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	
	public enum PhoneType {
		Home, Work, Mobile
	}
}
