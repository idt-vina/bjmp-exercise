package com.mstar.training.beans;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * 	Your score: (YES is 1 point)
 *
 *	Has Name: YES (as City)
 *	Has Address: YES (as Location)
 *	Has Type: NO
 *	Type is Enum: N/A
 *	Has Region: YES
 *	Region is Enum: NO
 *  Has Capacity: YES
 *  Has Officers: YES
 *  Correct Relationship w/ Officers: YES
 *  Has Inmates: NO
 *  Correct Relationship w/ Inmates: N/A
 *  
 *  Remarks: 
 *  1. The list of Regions in the Philippines is relatively static, an Enum would have been a better choice.
 *  2. The type of the Jail was specified in the first paragraph specifically, '...and operation of all district, city and municipal jails in the Philippines...'
 *  
 *  Final Score: 6 of 11
 *
 */

@Entity
public class Jail {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	
	@Column(name="BRANCH")
	private String branch;
	
	@Column(name="LOCATION")
	private String location;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="REGION")
	private String region;
	
	@Column(name="NO_OF_CAPACITY")
	private int capacity;
	
	@OneToMany(mappedBy="jail")
	private Collection<Officer> officersIncharged;
	
	public Collection<Officer> getOfficersIncharged() {
		return officersIncharged;
	}
	public void setOfficersIncharged(Collection<Officer> officersIncharged) {
		this.officersIncharged = officersIncharged;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	

}
