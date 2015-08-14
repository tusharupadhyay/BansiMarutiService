package com.bmsm.common.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;

import com.bmsm.common.util.AttendenceStatus;
import com.bmsm.common.util.Day;

@Entity
@Table(name = "ATTENDANCE")
public class Attendance {
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	private Integer id;
	
	@Column(name="TIME_IN")
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalTime")
	private LocalTime timeIn;
	
	@Column(name="TIME_OUT")
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalTime")
	private LocalTime timeOut;
	
	@Column(name="DATE")
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
	private LocalDate date;
	
	@Column(name="OVERTIME")
	private Boolean overTime;
	
	@Column(name="DAY")
	@Enumerated(EnumType.ORDINAL)
	private Day day;
	
	@Column(name="ATTENDANCE_STATUS")
	@Enumerated(EnumType.ORDINAL)
	private AttendenceStatus status;
	
	@ManyToOne(fetch = FetchType.LAZY)	
	@JoinColumn(name = "EMPLOYEE_ID")
	private Employee employee;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Boolean getOverTime() {
		return overTime;
	}

	public void setOverTime(Boolean overTime) {
		this.overTime = overTime;
	}

	public Day getDay() {
		return day;
	}

	public LocalTime getTimeIn() {
		return timeIn;
	}

	public void setTimeIn(LocalTime timeIn) {
		this.timeIn = timeIn;
	}

	public LocalTime getTimeOut() {
		return timeOut;
	}

	public void setTimeOut(LocalTime timeOut) {
		this.timeOut = timeOut;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setDay(Day day) {
		this.day = day;
	}

	public AttendenceStatus getStatus() {
		return status;
	}

	public void setStatus(AttendenceStatus status) {
		this.status = status;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public String toString() {
		return "Time in: " + this.getTimeIn() + "\n" +
				"Time out: " + this.getTimeOut() + "\n" +
				"Date: " + this.getDate() + "\n" +
				"Day: " + this.getDay() + "\n" +
				"Status: " + this.getStatus() + "\n" +
				"Emp Id: " + this.employee.getId();
	}
}
