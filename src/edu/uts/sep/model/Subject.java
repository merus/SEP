package edu.uts.sep.model;

public class Subject {
	private long subjectNumber;
	private String subjectName;
	private Person coordinator;
	private String prerequisites;
	private String antirequisites;
	private String faculty;
	
	public Subject() {

	}

	public Subject(long subjectNumber, String subjectName, Person coordinator,
			String prerequisites, String antirequisites, String faculty) {
		super();
		this.subjectNumber = subjectNumber;
		this.subjectName = subjectName;
		this.coordinator = coordinator;
		this.prerequisites = prerequisites;
		this.antirequisites = antirequisites;
		this.faculty = faculty;
	}

	public long getSubjectNumber() {
		return subjectNumber;
	}

	public void setSubjectNumber(long subjectNumber) {
		this.subjectNumber = subjectNumber;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Person getCoordinator() {
		return coordinator;
	}

	public void setCoordinator(Person coordinator) {
		this.coordinator = coordinator;
	}

	public String getPrerequisites() {
		return prerequisites;
	}

	public void setPrerequisites(String prerequisites) {
		this.prerequisites = prerequisites;
	}

	public String getAntirequisites() {
		return antirequisites;
	}

	public void setAntirequisites(String antirequisites) {
		this.antirequisites = antirequisites;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	
}
