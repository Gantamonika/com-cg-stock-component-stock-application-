package com.cg.stock.management.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int companyId;
	
	@Column
	private String companyName;
	
	
	public Company() {
		
		super();
	}


	public Company(int companyId, String companyName) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
	}


	public int getCompanyId() {
		return companyId;
	}


	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + "]";
	}

	

}
