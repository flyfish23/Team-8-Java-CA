package model;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "overtimeHours")
@Data
@NoArgsConstructor
public class overtimeHours {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "overtimeId")
	private int overtimeId;
	@Temporal(TemporalType.DATE)
	@Column(name = "date")
	private Date date;
	
	@Column(name = "hours")
	private int hours;
	
	@Column(name = "employeeid")
	private String employeeId;

	public overtimeHours(int overtimeId, Date date, int hours, String employeeId) {
		super();
		this.overtimeId = overtimeId;
		this.date = date;
		this.hours = hours;
		this.employeeId = employeeId;
	}

	public overtimeHours() {
		super();
	}

	public int getOvertimeId() {
		return overtimeId;
	}

	public void setOvertimeId(int overtimeId) {
		this.overtimeId = overtimeId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		return "overtimeHours [overtimeId=" + overtimeId + ", date=" + date + ", hours=" + hours + ", employeeId="
				+ employeeId + "]";
	}
	
	
}
