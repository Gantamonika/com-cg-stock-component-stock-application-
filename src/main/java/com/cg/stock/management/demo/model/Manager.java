package com.cg.stock.management.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Manager {
	@Id
	private int managerId;
	private String managerName;
	@OneToOne
	@JoinColumn
	private Company Company;
	private String email;
	private String mobileNo;
	
	public Manager() {
		
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Manager(int managerId, String managerName,Company company, String email,
			String mobileNo) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
		Company = company;
		this.email = email;
		this.mobileNo = mobileNo;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public Company getCompany() {
		return Company;
	}
	public void setCompany(Company company) {
		Company = company;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", managerName=" + managerName + ", Company=" + Company + ", email="
				+ email + ", mobileNo=" + mobileNo + "]";
	}


}
