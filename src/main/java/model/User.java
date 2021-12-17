package model;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
public class User implements Serializable {
	
	private static final long serialVersionUID = 6529685098267757680L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userid")
	private int userId;
	@NotEmpty
	@Column(name = "name")
	private String name;
	@NotEmpty
	@Column(name = "password")
	private String password;
	@Column(name = "employeeid")
	private String employeeId;


	
	
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

	public User(int userId, String name, String password, String employeeId) {
		this.userId = userId;
		this.name = name;
		this.password = password;
		this.employeeId = employeeId;
	}

	public User(int userId) {
		this.userId = userId;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", password=" + password + ", employeeId=" + employeeId
				+ "]";
	}

}