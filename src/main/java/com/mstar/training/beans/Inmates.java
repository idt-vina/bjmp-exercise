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

/**
 *	Your score: (YES is 1 point)
 *
 *	Has Jail: NO
 *	Correct Relationship w/ Jail: N/A
 *	Has Type: YES
 *	Type is Enum: YES
 *	Has Name: NO
 *	Has Control Number: YES
 *	Control Number is Unique: YES
 *	Has Commitment Date: YES
 *	Commitment Date is Timestamp: NO
 *
 *	Remarks:
 *	1. The name of an inmate was not explicitly specified but its something that's intrinsic in all human beings
 *	2. The commitment date is required for budgeting meals for an inmate (breakfast, lunch & dinner), so on the commitment date itself it is important to know if the inmate has been served all 3 meals or not.
 *
 *	Final Score: 5 of 9
 */

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
