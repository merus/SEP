package edu.uts.sep.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import edu.uts.sep.Generator;

public class Person {
	
	private int id;
	private String firstname;
	private String lastname;
	private String othernames;
	private Calendar dob;
	private Gender gender;
	private ArrayList<Address> addresses;
	private ArrayList<Phone> phoneNumbers;
	private String email;
	private int salt;
	private String password_hash;
	private String resume_location;
	private ArrayList<Qualification> qualifications;
	private long tfn;
	private String bankName;
	private long bsb;
	private long accountNumber;
	private String accountName;
	private Calendar joinDate;
	private String emergencyContactName;
	private String emergencyRelation;
	private ArrayList<Phone> emergencyNumbers;
	

	

	public Person() {
		addresses = new ArrayList<Address>();
		phoneNumbers = new ArrayList<Phone>();
		qualifications = new ArrayList<Qualification>();
		emergencyNumbers = new ArrayList<Phone>();
	}
	
	

	public Person(int id, String firstname, String lastname, String othernames,
			Calendar dob, Gender gender, ArrayList<Address> addresses,
			ArrayList<Phone> phoneNumbers, String email, String password,
			String resume_location, ArrayList<Qualification> qualifications,
			long tfn, String bankName, long bsb, long accountNumber,
			String accountName, Calendar joinDate, String emergencyContactName,
			String emergencyRelation, ArrayList<Phone> emergencyNumbers) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.othernames = othernames;
		this.dob = dob;
		this.gender = gender;
		this.addresses = addresses;
		this.phoneNumbers = phoneNumbers;
		this.email = email;
		this.salt = getSalt();
		this.password_hash = Generator.md5Hash(salt, password);
		this.resume_location = resume_location;
		this.qualifications = qualifications;
		this.tfn = tfn;
		this.bankName = bankName;
		this.bsb = bsb;
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.joinDate = joinDate;
		this.emergencyContactName = emergencyContactName;
		this.emergencyRelation = emergencyRelation;
		this.emergencyNumbers = emergencyNumbers;
	}


	private int getSalt()
	{
		Random rand = new Random();
		int salt;
		
		do{
			salt = rand.nextInt(100);
		} while(salt < 10);
		
		return salt;
	}

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public String getOthernames() {
		return othernames;
	}



	public void setOthernames(String othernames) {
		this.othernames = othernames;
	}



	public Calendar getDob() {
		return dob;
	}



	public void setDob(Calendar dob) {
		this.dob = dob;
	}



	public Gender getGender() {
		return gender;
	}



	public void setGender(Gender gender) {
		this.gender = gender;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword_hash() {
		return password_hash;
	}



	public void setPassword(String newPassword) {
		this.password_hash = Generator.md5Hash(salt, newPassword);
	}



	public String getResume_location() {
		return resume_location;
	}



	public void setResume_location(String resume_location) {
		this.resume_location = resume_location;
	}



	public long getTfn() {
		return tfn;
	}



	public void setTfn(long tfn) {
		this.tfn = tfn;
	}



	public String getBankName() {
		return bankName;
	}



	public void setBankName(String bankName) {
		this.bankName = bankName;
	}



	public long getBsb() {
		return bsb;
	}



	public void setBsb(long bsb) {
		this.bsb = bsb;
	}



	public long getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}



	public String getAccountName() {
		return accountName;
	}



	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}



	public Calendar getJoinDate() {
		return joinDate;
	}



	public void setJoinDate(Calendar joinDate) {
		this.joinDate = joinDate;
	}



	public String getEmergencyContactName() {
		return emergencyContactName;
	}



	public void setEmergencyContactName(String emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
	}



	public String getEmergencyRelation() {
		return emergencyRelation;
	}



	public void setEmergencyRelation(String emergencyRelation) {
		this.emergencyRelation = emergencyRelation;
	}



	public ArrayList<Address> getAddresses() {
		return addresses;
	}
	
	public void addAddress(Address address) {
		addresses.add(address);
	}

	public void deleteAddress(Address address) {
		addresses.remove(address);
	}

	public ArrayList<Phone> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void addPhoneNumber(Phone phone) {
		phoneNumbers.add(phone);
	}

	public void deletePhoneNumber(Phone phone) {
		phoneNumbers.remove(phone);
	}

	public ArrayList<Qualification> getQualifications() {
		return qualifications;
	}

	public void addQualification(Qualification qualification) {
		qualifications.add(qualification);
	}

	public void deleteQualification(Qualification qualification) {
		qualifications.remove(qualification);
	}

	public ArrayList<Phone> getEmergencyNumbers() {
		return emergencyNumbers;
	}

	public void addEmergencyNumber(Phone phone) {
		emergencyNumbers.add(phone);
	}

	public void deleteEmergencyNumber(Phone phone) {
		emergencyNumbers.remove(phone);
	}

	public enum Gender {
		Female, Male, Transgender
	}
}
