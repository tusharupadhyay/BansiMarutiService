package com.bmsm.common.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.Email;
import org.joda.time.LocalDate;

import com.bmsm.common.util.EmployeeStatus;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	private Integer id;
	
	@NotNull
	@Size(min=2, message = "First name must be atleast of length 2")
	@Column(name="FIRST_NAME", length = 25)	
	private String firstName;
	
	@Column(name="MIDDLE_NAME", length = 25)
	private String middleName;
	
	@NotNull
	@Size(min=2, message = "Last name must be atleast of length 2")
	@Column(name="LAST_NAME", length = 25)
	private String lastName;
	
	@NotNull
	@Column(name="DATE_OF_BIRTH", length = 12)
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
	private LocalDate dateOfBirth;
	
	@Email(message= "Invalid Email address")
	@Column(name="EMAIL_ID", length = 25)
	private String emailId;
	
	@NotNull
	@Column(name="GENDER", length = 10)
	private String sex;
	
	@NotNull
	@Size(min=6, message = "Address must be atleast of length 6")
	@Column(name="ADDRESS", length = 256)
	private String address;
	
	@NotNull
	@Pattern(regexp="\\D*", message="Only characters are allowed")
	@Size(min=2, message = "City must be atleast of length 2")
	@Column(name="CITY", length = 25)
	private String city;
	
	@NotNull
	@Pattern(regexp="\\D*", message="Only characters are allowed")
	@Size(min=2, message = "District must be atleast of length 2")
	@Column(name="DISTRICT", length = 25)
	private String district;
	
	@NotNull
	@Column(name="STATE", length = 30)
	private String state;
	
	@NotNull
	@Pattern(regexp="[0-9]+", message="Only number are allowed")
	@Size(max=10, message = "Contact number must be atleast of length 10")
	@Column(name="CONTACT_NUMBER", length = 10)
	private String contactNumber;
				
	@Column(name="DESIGNATION", length = 30)
	private String designation;
	
	@NotNull
	@Column(name="SALARY", length = 12)
	private Double salary;
	
	@Column(name="EMPLOYEE_STATUS", length = 1)
	@Enumerated(EnumType.ORDINAL)
	private EmployeeStatus status;
	
	@Column(name="START_DATE", length = 12)
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
	private LocalDate startDate;
	
	@Column(name="END_DATE", length = 12)
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
	private LocalDate endDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public EmployeeStatus getStatus() {
		return status;
	}

	public void setStatus(EmployeeStatus status) {
		this.status = status;
	}	
	
}
