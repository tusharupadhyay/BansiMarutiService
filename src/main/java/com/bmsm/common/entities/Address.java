package com.bmsm.common.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "ADDRESS")
public class Address implements java.io.Serializable{
	
	/*Query to create ADDRSS Table
	create table ADDRESS (
	   ID INT NOT NULL AUTO_INCREMENT,
	   LINE_1 VARCHAR(30) DEFAULT NULL,
	   LINE_2 VARCHAR(30) DEFAULT NULL,
	   LINE_3 VARCHAR(30) DEFAULT NULL,
	   CITY VARCHAR(20) DEFAULT NULL,
	   DISTRICT VARCHAR(20) DEFAULT NULL,
	   STATE VARCHAR(2) DEFAULT NULL,
	   EMPLOYEE_ID INT DEFAULT NULL,
	   PRIMARY KEY (ID)
	);*/
	
	private Long addressId;	
	private String line1;	
	private String line2;	
	private String line3;
	private String city;	
	private String district;
	private String state;
	private Employee employee;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EMPLOYEE_ID")
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getAddressId() {
		return addressId;
	}
	
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
	
	@Column(name = "LINE_1", length = 30)
	public String getLine1() {
		return line1;
	}
	
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	
	@Column(name = "LINE_2", length = 30)
	public String getLine2() {
		return line2;
	}
	
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	
	@Column(name = "LINE_3", length = 30)
	public String getLine3() {
		return line3;
	}
	public void setLine3(String line3) {
		this.line3 = line3;
	}
	
	@Column(name = "CITY", length = 30)
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	@Column(name = "DISTRICT", length = 30)
	public String getDistrict() {
		return district;
	}
	
	public void setDistrict(String district) {
		this.district = district;
	}
	
	@Column(name = "STATE", length = 30)
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	/*@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID", nullable = false, insertable = false, updatable = false)
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}*/
	
}
