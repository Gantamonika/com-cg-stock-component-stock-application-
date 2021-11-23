package com.cg.stock.management.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BankAccount {
	@Id
	private long accountNo;
	private String branchName;
	private String bankName;
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
