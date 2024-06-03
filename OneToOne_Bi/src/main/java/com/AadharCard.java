package com;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class AadharCard {
	@Id
	private long adno;
	private String address;
	private String dob;
	private long mobile;
	
	@OneToOne
	private Person p;

	public long getAdno() {
		return adno;
	}

	public void setAdno(long adno) {
		this.adno = adno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public Person getP() {
		return p;
	}

	public void setP(Person p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "AadharCard [adno=" + adno + ", address=" + address + ", dob=" + dob + ", mobile=" + mobile + ", p=" + p
				+ "]";
	}
	
	
	
}
