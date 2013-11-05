package edu.uts.sep.model;

public class Paygrade {

	private String level;
	private String type;
	private String description;
	private double rate;
	
	public Paygrade() {
	
		}

	public Paygrade(String level, String type, String description, double rate) {
		super();
		this.level = level;
		this.type = type;
		this.description = description;
		this.rate = rate;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	
}
