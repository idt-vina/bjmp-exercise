package com.mstar.training.beans;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Duty {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="DUTY")
	private String duty;
	
	@ManyToMany
	//@JoinColumn(name="OFFICER_ID")
	@JoinTable(name="DUTY_OFFICER",
			joinColumns=@JoinColumn(name="DUTY_ID"),
			inverseJoinColumns=@JoinColumn(name="OFFICER_ID"))
	private Collection<Officer> dutyOfficer;



	public Collection<Officer> getDutyOfficer() {
		return dutyOfficer;
	}

	public void setDutyOfficer(Collection<Officer> dutyOfficer) {
		this.dutyOfficer = dutyOfficer;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDuty() {
		return duty;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}
	

}
