package com.vendor.VendorService.OneToOne;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "VECHICLE")
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "VECHICLE_ID")
	private int vechicleId;
	@Column(name = "VECHICLE_NAME")
	private String VechicleName;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="USER_DETAILS")
	private UserDetails user;
	
	
	
	public UserDetails getUser() {
		return user;
	}
	public void setUser(UserDetails user) {
		this.user = user;
	}
	public int getVechicleId() {
		return vechicleId;
	}
	public void setVechicleId(int vechicleId) {
		this.vechicleId = vechicleId;
	}
	public String getVechicleName() {
		return VechicleName;
	}
	public void setVechicleName(String vechicleName) {
		VechicleName = vechicleName;
	}
	
	@Override
	public String toString() {
		return "Vehicle [vechicleId=" + vechicleId + ", VechicleName=" + VechicleName + "]";
	}
	
	

}
