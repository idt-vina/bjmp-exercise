package com.mstar.training.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Officer {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="OFFICER_RANK")
	private String rank;
	
	@OneToOne
	@JoinColumn(name="TRUSTEE")
	private Inmates trustee;
	
	@ManyToOne
	@JoinColumn(name="JAIL_ASSIGNEE")
	private Jail jail;
	
	public Inmates getTrustee() {
		return trustee;
	}
	public void setTrustee(Inmates trustee) {
		this.trustee = trustee;
	}
	public Jail getJail() {
		return jail;
	}
	public void setJail(Jail jail) {
		this.jail = jail;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	
}

