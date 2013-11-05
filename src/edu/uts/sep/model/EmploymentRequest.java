package edu.uts.sep.model;

import java.util.ArrayList;
import java.util.Calendar;

public class EmploymentRequest {
	private int formID;
	private int submitterID;
	private int supervisorID;
	private String bankName;
	private long BSB;
	private long accountNumber;
	private Residency residencyStatus;
	private String visaType;
	private String passportNumber;
	private String passportCountry;
	private String emergencyContactName;
	private String emergencyRelation;
	private ArrayList<Phone> emergencyNumbers;
	private long studentNumber;
	private String reasonForEmployment;
	private Calendar dateApproved;
	
	public EmploymentRequest() {
		
	}

	public EmploymentRequest(int formID, int submitterID, int supervisorID,
			String bankName, long bSB, long accountNumber,
			Residency residencyStatus, String visaType, String passportNumber,
			String passportCountry, String emergencyContactName,
			String emergencyRelation, ArrayList<Phone> emergencyNumbers,
			long studentNumber, String reasonForEmployment) {
		super();
		this.formID = formID;
		this.submitterID = submitterID;
		this.supervisorID = supervisorID;
		this.bankName = bankName;
		BSB = bSB;
		this.accountNumber = accountNumber;
		this.residencyStatus = residencyStatus;
		this.visaType = visaType;
		this.passportNumber = passportNumber;
		this.passportCountry = passportCountry;
		this.emergencyContactName = emergencyContactName;
		this.emergencyRelation = emergencyRelation;
		this.emergencyNumbers = emergencyNumbers;
		this.studentNumber = studentNumber;
		this.reasonForEmployment = reasonForEmployment;
	}



	public int getFormID() {
		return formID;
	}

	public void setFormID(int formID) {
		this.formID = formID;
	}

	public int getSubmitterID() {
		return submitterID;
	}

	public void setSubmitterID(int submitterID) {
		this.submitterID = submitterID;
	}

	public int getSupervisorID() {
		return supervisorID;
	}

	public void setSupervisorID(int supervisorID) {
		this.supervisorID = supervisorID;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public long getBSB() {
		return BSB;
	}

	public void setBSB(long bSB) {
		BSB = bSB;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Residency getResidencyStatus() {
		return residencyStatus;
	}

	public void setResidencyStatus(Residency residencyStatus) {
		this.residencyStatus = residencyStatus;
	}

	public String getVisaType() {
		return visaType;
	}

	public void setVisaType(String visaType) {
		this.visaType = visaType;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getPassportCountry() {
		return passportCountry;
	}

	public void setPassportCountry(String passportCountry) {
		this.passportCountry = passportCountry;
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

	public ArrayList<Phone> getEmergencyNumbers() {
		return emergencyNumbers;
	}

	public void setEmergencyNumbers(ArrayList<Phone> emergencyNumbers) {
		this.emergencyNumbers = emergencyNumbers;
	}

	public long getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(long studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getReasonForEmployment() {
		return reasonForEmployment;
	}

	public void setReasonForEmployment(String reasonForEmployment) {
		this.reasonForEmployment = reasonForEmployment;
	}

	public Calendar getDateApproved() {
		return dateApproved;
	}

	public void setDateApproved(Calendar dateApproved) {
		this.dateApproved = dateApproved;
	}



	public enum Residency {
		Citizen, PermanentResident, TemporaryResident
	}
}
