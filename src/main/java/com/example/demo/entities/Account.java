package com.example.demo.entities;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotBlank;



@Entity
public class Account {
	
	@Id
	private int accountNo;
	private String accountType;
	@NotBlank(message = "Please enter Account Holder name")
	@Pattern(regexp="^[A-z][a-z]{3,15}",message = "length must be in between 3 to 15")
	private String accountHolderName;
	@NotBlank(message="Please enter Bank Name")
	private String bankName;
	@NotBlank(message="Please enter Branch Name")
	private String branchName;
	
	//@NotBlank(message = "Mobile Number is required")
	//@Pattern(regexp="^[7-9][0-9]{9}$",message = " Enter 10 digit mobile number")
	long citizenPhoneNumber;
	
	

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(int accountNo, String accountType,
			@NotBlank(message = "Please enter Account Holder name") String accountHolderName,
			@NotBlank(message = "Please enter Bank Name") String bankName,
			@NotBlank(message = "Please enter Branch Name") String branchName)
			//@NotBlank(message = "Mobile Number is required")  long citizenPhoneNumber) 
			{
		super();
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.accountHolderName = accountHolderName;
		this.bankName = bankName;
		this.branchName = branchName;
		this.citizenPhoneNumber = citizenPhoneNumber;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public long getCitizenPhoneNumber() {
		return citizenPhoneNumber;
	}

	public void setCitizenPhoneNumber(long citizenPhoneNumber) {
		this.citizenPhoneNumber = citizenPhoneNumber;
	}
	
	

}

