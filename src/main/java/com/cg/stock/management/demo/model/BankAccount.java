package com.cg.stock.management.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BankAccount implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8294101241960806968L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long accountNo;
	
	@Column
	private String branchName;
	
	@Column
	private String bankName;
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String ifscCode;
	
	public BankAccount() {
		
		super();
	}

	public BankAccount(long accountNo, String branchName, String bankName, String ifscCode) {
		super();
		this.accountNo = accountNo;
		this.branchName = branchName;
		this.bankName = bankName;
		this.ifscCode = ifscCode;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", branchName=" + branchName + ", bankName=" + bankName
				+ ", ifscCode=" + ifscCode + "]";
	}
	


}
