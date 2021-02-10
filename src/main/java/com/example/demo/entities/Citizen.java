package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
@Entity
public class Citizen {
	
	
	
	@Id
	private int citizenId;
	
	public Citizen(int citizenId) {
		super();
		this.citizenId = citizenId;
	}

	@NotBlank(message = "Name is required")
	//@Pattern(regexp="^[A-z][a-z]{3,15}",message = "length must be in between 3 to 15")
	//@Column(name="citizen_name")
	String citizenName;
	
    @NotNull(message = "Age is required")
    @Min(18)
    //@Column(name="citizen_age")
	int citizenAge;
	
	@NotBlank(message = "Address is required")
	//@Column(name="citizen_address")
	String citizenAddress;
	
	@NotBlank(message = "Email is required")
	@Pattern(regexp="^[a-zA-Z0-9+_.-]+@[a-zA-Z]+.[a-zA-A]+",message = "Please enter valid email address")
	//@Column(name="citizen_email")
	String citizenEmail;
	
	@NotNull(message = "Mobile Number is required")
	//@Pattern(regexp="^[7-9][0-9]{9}$",message = " Enter 10 digit mobile number")
	//@Column(name="citizen_Phone_Number")
	long citizenPhoneNumber;
	
	@NotBlank(message = "Father's Name is required")
	@Pattern(regexp="^[A-z][a-z]{3,15}",message = "length must be in between 3 to 15")
	//@Column(name="citizen_father's_name")
	String citizenFatherName;
	
	@NotBlank(message = "Mother's Name is required")
	@Pattern(regexp="^[A-z][a-z]{3,15}",message = "length must be in between 3 to 15")
	//@Column(name="citizen_mother's_name")
	String citizenMotherName;
	
	public Citizen( ) {
		super();
	}
	
	public Citizen(int citizenId, String citizenName, int citizenAge, String citizenAddress, String citizenEmail,
			long citizenPhoneNumber, String citizenFatherName, String citizenMotherName) {
		super();
		this.citizenId = citizenId;
		this.citizenName = citizenName;
		this.citizenAge = citizenAge;
		this.citizenAddress = citizenAddress;
		this.citizenEmail = citizenEmail;
		this.citizenPhoneNumber = citizenPhoneNumber;
		this.citizenFatherName = citizenFatherName;
		this.citizenMotherName = citizenMotherName;
	}

	
	  
	
	
	
	public int getCitizenId() {
		return citizenId;
	}

	public void setCitizenId(int citizenId) {
		this.citizenId = citizenId;
	}

	public String getCitizenName() {
		return citizenName;
	}

	public void setCitizenName(String citizenName) {
		this.citizenName = citizenName;
	}

	public int getCitizenAge() {
		return citizenAge;
	}

	public void setCitizenAge(int citizenAge) {
		this.citizenAge = citizenAge;
	}

	public String getCitizenAddress() {
		return citizenAddress;
	}

	public void setCitizenAddress(String citizenAddress) {
		this.citizenAddress = citizenAddress;
	}

	public String getCitizenEmail() {
		return citizenEmail;
	}

	public void setCitizenEmail(String citizenEmail) {
		this.citizenEmail = citizenEmail;
	}

	public long getCitizenPhoneNumber() {
		return citizenPhoneNumber;
	}

	public void setCitizenPhoneNumber(long citizenPhoneNumber) {
		this.citizenPhoneNumber = citizenPhoneNumber;
	}

	public String getCitizenFatherName() {
		return citizenFatherName;
	}

	public void setCitizenFatherName(String citizenFatherName) {
		this.citizenFatherName = citizenFatherName;
	}

	public String getCitizenMotherName() {
		return citizenMotherName;
	}

	public void setCitizenMotherName(String citizenMotherName) {
		this.citizenMotherName = citizenMotherName;
	}

	@Override
	public String toString() {
		return "Citizen [citizenName=" + citizenName + ", citizenAge=" + citizenAge + ", citizenAddress="
				+ citizenAddress + ", citizenEmail=" + citizenEmail + ", citizenPhoneNumber=" + citizenPhoneNumber
				+ ", citizenFatherName=" + citizenFatherName + ", citizenMotherName=" + citizenMotherName + "]";
	}

	public Object thenReturn(Citizen citizen) {
		// TODO Auto-generated method stub
		return null;
	}



	

}
