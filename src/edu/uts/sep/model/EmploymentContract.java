package edu.uts.sep.model;

import java.util.ArrayList;

import org.joda.time.LocalDate;
import org.joda.time.LocalTime;

import edu.uts.sep.model.Person.Gender;

public class EmploymentContract {

	private ArrayList<ContractLine> classes;
	private int employeeID;
	private int coordinatorID;
	private String firstName;
	private String lastName;
	private ArrayList<Qualification> qualifications;
	private Address address;
	private LocalDate dob;
	private ArrayList<Phone> phoneNumbers;
	private Person.Gender gender;
	private LocalDate dateEmployeeSigned;
	private LocalDate dateCoordinatorSigned;
	private LocalDate dateSubmitted;
	
	public EmploymentContract() {
		this.classes = new ArrayList<ContractLine>();
		this.qualifications = new ArrayList<Qualification>();
		this.phoneNumbers = new ArrayList<Phone>();
	}

	public EmploymentContract(ArrayList<ContractLine> classes, int employeeID,
			int coordinatorID, String firstName, String lastName,
			ArrayList<Qualification> qualifications, Address address,
			LocalDate dob, ArrayList<Phone> phoneNumbers, Gender gender) {
		super();
		this.classes = classes;
		this.employeeID = employeeID;
		this.coordinatorID = coordinatorID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.qualifications = qualifications;
		this.address = address;
		this.dob = dob;
		this.phoneNumbers = phoneNumbers;
		this.gender = gender;
	}
	
	public EmploymentContract(Person employee) {
		this.employeeID = employee.getId();
		this.firstName = employee.getFirstname();
		this.lastName = employee.getLastname();
		this.qualifications = employee.getQualifications();
		this.address = employee.getAddresses().get(0);
		this.dob = employee.getDob();
		this.phoneNumbers = employee.getPhoneNumbers();
		this.gender = employee.getGender();
	}
	
	



	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public int getCoordinatorID() {
		return coordinatorID;
	}

	public void setCoordinatorID(int coordinatorID) {
		this.coordinatorID = coordinatorID;
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

	public ArrayList<Qualification> getQualifications() {
		return qualifications;
	}

	public void setQualifications(ArrayList<Qualification> qualifications) {
		this.qualifications = qualifications;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public ArrayList<Phone> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(ArrayList<Phone> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public Person.Gender getGender() {
		return gender;
	}

	public void setGender(Person.Gender gender) {
		this.gender = gender;
	}

	public LocalDate getDateEmployeeSigned() {
		return dateEmployeeSigned;
	}

	public void setDateEmployeeSigned(LocalDate dateEmployeeSigned) {
		this.dateEmployeeSigned = dateEmployeeSigned;
	}

	public LocalDate getDateCoordinatorSigned() {
		return dateCoordinatorSigned;
	}

	public void setDateCoordinatorSigned(LocalDate dateCoordinatorSigned) {
		this.dateCoordinatorSigned = dateCoordinatorSigned;
	}

	public LocalDate getDateSubmitted() {
		return dateSubmitted;
	}

	public void setDateSubmitted(LocalDate dateSubmitted) {
		this.dateSubmitted = dateSubmitted;
	}

	public ArrayList<ContractLine> getClasses() {
		return classes;
	}


	public void addClass(ContractLine newClass) {
		classes.add(newClass);
	}
	



	public class ContractLine {
		private Subject subject;
		private LocalDate startDate;
		private LocalDate endDate;
		private DayOfWeek scheduledDay;
		private LocalTime startTime;
		private LocalTime endTime;
		private Paygrade paygrade;
		
		public ContractLine() {
			
		}

		public ContractLine(Subject subject, LocalDate startDate,
				LocalDate endDate, DayOfWeek scheduledDay, LocalTime startTime,
				LocalTime endTime, Paygrade paygrade) {
			super();
			this.subject = subject;
			this.startDate = startDate;
			this.endDate = endDate;
			this.scheduledDay = scheduledDay;
			this.startTime = startTime;
			this.endTime = endTime;
			this.paygrade = paygrade;
		}

		public Subject getSubject() {
			return subject;
		}

		public void setSubject(Subject subject) {
			this.subject = subject;
		}

		public LocalDate getStartDate() {
			return startDate;
		}

		public void setStartDate(LocalDate startDate) {
			this.startDate = startDate;
		}

		public LocalDate getEndDate() {
			return endDate;
		}

		public void setEndDate(LocalDate endDate) {
			this.endDate = endDate;
		}

		public DayOfWeek getScheduledDay() {
			return scheduledDay;
		}

		public void setScheduledDay(DayOfWeek scheduledDay) {
			this.scheduledDay = scheduledDay;
		}

		public LocalTime getStartTime() {
			return startTime;
		}

		public void setStartTime(LocalTime startTime) {
			this.startTime = startTime;
		}

		public LocalTime getEndTime() {
			return endTime;
		}

		public void setEndTime(LocalTime endTime) {
			this.endTime = endTime;
		}

		public Paygrade getPaygrade() {
			return paygrade;
		}

		public void setPaygrade(Paygrade paygrade) {
			this.paygrade = paygrade;
		}
		
		
	}
	
	public enum DayOfWeek {
		Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
	}
}
