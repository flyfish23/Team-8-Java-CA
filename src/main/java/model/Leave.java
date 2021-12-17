package model;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Leave")
@Data
@NoArgsConstructor
public class Leave {

	@Id
	@Column(name = "leaveId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int leaveId;
	
	@Column(name = "employeeid")
	private String employeeId;
	@Column(name = "leaveType")
	private String leaveType;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "startdate")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date startdate;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "enddate")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date enddate;
	
	@Column(name = "addtnlReason")
	private String addtnlReason;
	
	@Column(name = "workDissemination")
	private String workDissemination;
	@Basic
	@Column(name = "contact")
	private String contact;
	
	@Column(name = "comments")
	private String comments;
	
	@Column(name = "status", columnDefinition = "ENUM('SUBMITTED', 'APPROVED', 'CANCELLED', 'REJECTED')")
	@Enumerated(EnumType.STRING)
	private String status;

	public Leave(int leaveId, String employeeId, String leaveType, Date startdate, Date enddate, String addtnlReason,
			String workDissemination, String contact, String comments, String status) {
		super();
		this.leaveId = leaveId;
		this.employeeId = employeeId;
		this.leaveType = leaveType;
		this.startdate = startdate;
		this.enddate = enddate;
		this.addtnlReason = addtnlReason;
		this.workDissemination = workDissemination;
		this.contact = contact;
		this.comments = comments;
		this.status = status;
	}

	public Leave() {
		super();
	}

	public int getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public String getAddtnlReason() {
		return addtnlReason;
	}

	public void setAddtnlReason(String addtnlReason) {
		this.addtnlReason = addtnlReason;
	}

	public String getWorkDissemination() {
		return workDissemination;
	}

	public void setWorkDissemination(String workDissemination) {
		this.workDissemination = workDissemination;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Leave [leaveId=" + leaveId + ", employeeId=" + employeeId + ", leaveType=" + leaveType + ", startdate="
				+ startdate + ", enddate=" + enddate + ", addtnlReason=" + addtnlReason + ", workDissemination="
				+ workDissemination + ", contact=" + contact + ", comments=" + comments + ", status=" + status + "]";
	}
	
}
