package com.bmsm.common.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	@GeneratedValue
	@Column(name="ID")
	private Integer id;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="MIDDLE_NAME")
	private String middleName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="DRIVING_LICENSE")
	private String drivingLicense;
	
	@Column(name="VEHICLE")
	private String vehicle;
	
	@Column(name="DATE_OF_BIRTH")	
	private String dateOfBirth;
	
	@Column(name="EMAIL_ID")
	private String emailId;
	
	@Column(name="GENDER")
	private String sex;
	
	@Column(name="ADDRESS_LINE_1")
	private String address_line1;
	
	@Column(name="ADDRESS_LINE_2")
	private String address_line2;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="DISTRICT")
	private String district;
	
	@Column(name="STATE")
	private String state;
	
	@Column(name="MOBILE_NUMBER")
	private String mobileNumber;
	
	@Column(name="HOME_NUMBER")
	private String homeNumber;
	
	//TODO
	// Might need to add insurance id later
	
	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getHomeNumber() {
		return homeNumber;
	}

	public void setHomeNumber(String homeNumber) {
		this.homeNumber = homeNumber;
	}

	public String getAddress_line1() {
		return address_line1;
	}

	public void setAddress_line1(String address_line1) {
		this.address_line1 = address_line1;
	}

	public String getAddress_line2() {
		return address_line2;
	}

	public void setAddress_line2(String address_line2) {
		this.address_line2 = address_line2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getVehicle() {
		return vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/*@OneToMany(mappedBy="customer", fetch=FetchType.LAZY)
	private List<Address> addresses;*/
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getDrivingLicense() {
		return drivingLicense;
	}

	public void setDrivingLicense(String drivingLicense) {
		this.drivingLicense = drivingLicense;
	}
	
	/*public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}*/
	
	public String toString(){
		return "First Name: " + firstName + "\n" +
				"Middle Name: " + middleName + "\n" +
				"Last Name: " + lastName + "\n" +
				"Driving License: " + drivingLicense + "\n" +
				"Vehicle: " + vehicle + "\n" +
				"Dob: " + dateOfBirth + "\n" +
				"Email: " + emailId + "\n" +
				"Sex: " + sex + "\n" +
				"Address Line 1: " + address_line1 + "\n" +
				"Address Line 2:" + address_line2 + "\n" +
				"City: " + city + "\n" +
				"District: " + district + "\n" +
				"State: " + state + "\n" +
				"Home number: " + homeNumber + "\n" +
				"Mobile Number: " + mobileNumber;
	}
	
}
