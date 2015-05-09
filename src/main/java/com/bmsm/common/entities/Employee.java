package com.bmsm.common.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@SuppressWarnings("serial")
@Entity
@Table(name = "EMPLOYEE")
public class Employee implements java.io.Serializable{
	
	/*SQL Query to create Employee table
	create table EMPLOYEE (
			   ID INT NOT NULL AUTO_INCREMENT,
			   FIRST_NAME VARCHAR(20) DEFAULT NULL,
			   MIDDLE_NAME VARCHAR(20) DEFAULT NULL,
			   LAST_NAME  VARCHAR(20) DEFAULT NULL,
			   POSITION VARCHAR(30) DEFAULT NULL,
			   DOB DATE DEFAULT NULL,
			   JOB_START DATE DEFAULT NULL,
			   JOB_END DATE DEFAULT NULL,
			   SALARY INT DEFAULT NULL,
			   PRIMARY KEY (ID)
			);*/
	
	private Long employeeId;

	private String firstName;
	
	private String middleName;

	private String lastName;
	
	private String position;
	
	private Date dateOfBirth;
	
	private Date jobStart;
	
	private Date jobEnd;

	private int salary;
	
	private Set<Address> addresses = new HashSet<Address>();

	@Id
	@Column(name = "ID", unique = true, nullable = false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	
	@Column(name = "FIRST_NAME", length = 20)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Column(name = "MIDDLE_NAME", length = 20)
	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	@Column(name = "LAST_NAME", length = 20)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Column(name = "SALARY")
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Column(name = "POSITION", length = 30)
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Column(name = "DOB", length = 20)
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	@Column(name = "JOB_START", length = 20)
	public Date getJobStart() {
		return jobStart;
	}

	public void setJobStart(Date jobStart) {
		this.jobStart = jobStart;
	}

	@Column(name = "JOB_END", length = 20)
	public Date getJobEnd() {
		return jobEnd;
	}

	public void setJobEnd(Date jobEnd) {
		this.jobEnd = jobEnd;
	}
	
	@Cascade( {CascadeType.ALL})
	@OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
	public Set<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}
	

}
