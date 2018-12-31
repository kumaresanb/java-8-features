package com.evolvus.java.practies.java8features.map;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8273194045877576653L;
	
	private Long id;
	
	private String name;
	
	private String srlNo;
	
	private Date dob;
	
	private String departName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSrlNo() {
		return srlNo;
	}

	public void setSrlNo(String srlNo) {
		this.srlNo = srlNo;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getDepartName() {
		return departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", srlNo=" + srlNo + ", dob=" + dob + ", departName="
				+ departName + "]";
	}

}
