package com.cg.stock.management.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Manager implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1502607236168994846L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int managerId;
	
	@Column
	private String managerName;
	
	@OneToOne
	@JoinColumn
	private Company Company;
	
	@Column
	private String email;
	
	@Column
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
