package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "Employee")
public class Employees {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "employeeId")
	private int employeeId;
	@NotEmpty
	@Column(name = "name")
	private String name;
	@NotEmpty
	@Column(name = "managerId")
	private int managerId;
	
	@NotEmpty
	@Column(name = "empType")
	private String empType;
	
	@NotEmpty
	@Column(name = "description")
	private String description;
	
	@NotEmpty
	@Column(name = "annualLeaveN")
	private int annualLeaveN;
	
	@NotEmpty
	@Column(name = "medicalLeaveN")
	private int medicalLeaveN;
	
	@NotEmpty
	@Column(name = "compLeaveN")
	private int compLeaveN;

	public Employees(int employeeId, @NotEmpty String name, @NotEmpty int managerId, @NotEmpty String empType,
			@NotEmpty String description, @NotEmpty int annualLeaveN, @NotEmpty int medicalLeaveN,
			@NotEmpty int compLeaveN) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.managerId = managerId;
		this.empType = empType;
		this.description = description;
		this.annualLeaveN = annualLeaveN;
		this.medicalLeaveN = medicalLeaveN;
		this.compLeaveN = compLeaveN;
	}

	public Employees() {
		super();
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getEmpType() {
		return empType;
	}

	public void setEmpType(String empType) {
		this.empType = empType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getAnnualLeaveN() {
		return annualLeaveN;
	}

	public void setAnnualLeaveN(int annualLeaveN) {
		this.annualLeaveN = annualLeaveN;
	}

	public int getMedicalLeaveN() {
		return medicalLeaveN;
	}

	public void setMedicalLeaveN(int medicalLeaveN) {
		this.medicalLeaveN = medicalLeaveN;
	}

	public int getCompLeaveN() {
		return compLeaveN;
	}

	public void setCompLeaveN(int compLeaveN) {
		this.compLeaveN = compLeaveN;
	}
	
}
