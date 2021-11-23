package com.cg.stock.management.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Investor {
	@Id
	private int investorId;
	private String investorName;
	private String email;
	private String password;
	private String mobileNo;
    private String gender;
    @OneToOne
    @JoinColumn(name="accountNo")
	private BankAccount account;
	
	
	public Investor() {
		
		super();
	}


	public Investor(int investorId, String investorName, String email, String password, String mobileNo, String gender,
			BankAccount account) {
		super();
		this.investorId = investorId;
		this.investorName = investorName;
		this.email = email;
		this.password = password;
		this.mobileNo = mobileNo;
		this.gender = gender;
		this.account = account;
	}


	public int getInvestorId() {
		return investorId;
	}


	public void setInvestorId(int investorId) {
		this.investorId = investorId;
	}


	public String getInvestorName() {
		return investorName;
	}


	public void setInvestorName(String investorName) {
		this.investorName = investorName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public BankAccount getAccount() {
		return account;
	}


	public void setAccount(BankAccount account) {
		this.account = account;
	}


	@Override
	public String toString() {
		return "Investor [investorId=" + investorId + ", investorName=" + investorName + ", email=" + email
				+ ", password=" + password + ", mobileNo=" + mobileNo + ", gender=" + gender + "]";
	}


	
}
