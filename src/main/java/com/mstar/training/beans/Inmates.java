package com.mstar.training.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Inmates {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	
	@Column(unique = true, name="CONTROL_NO")
	private String controlNumber;
	
	@Enumerated(EnumType.STRING)
	private InmateTypes type;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DATE_OF_COMMIT")
	private Date commitmentDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DATE_OF_RELEASE")
	private Date releasedDate;
	
	@Column(name="NO_OF_DAYS_IN_JAIL")
	private int commitmentDuration;
	
	@Column(scale=2)
	private double budgetForMeal;
	
	@OneToOne(mappedBy="trustee")
	private Officer officer;

	public Officer getOfficer() {
		return officer;
	}

	public void setOfficer(Officer officer) {
		this.officer = officer;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getControlNumber() {
		return controlNumber;
	}

	public void setControlNumber(String controlNumber) {
		this.controlNumber = controlNumber;
	}

	public InmateTypes getType() {
		return type;
	}

	public void setType(InmateTypes type) {
		this.type = type;
	}

	public Date getCommitmentDate() {
		return commitmentDate;
	}

	public void setCommitmentDate(Date commitmentDate) {
		this.commitmentDate = commitmentDate;
	}

	public Date getReleasedDate() {
		return releasedDate;
	}

	public void setReleasedDate(Date releasedDate) {
		this.releasedDate = releasedDate;
	}

	public int getCommitmentDuration() {
		return commitmentDuration;
	}

	public void setCommitmentDuration(int commitmentDuration) {
		this.commitmentDuration = commitmentDuration;
	}

	public double getBudgetForMeal() {
		return budgetForMeal;
	}

	public void setBudgetForMeal(double budgetForMeal) {
		this.budgetForMeal = budgetForMeal;
	}
	
}
