package bean;
//员工信息类

import java.util.Date;

public class Employee {
	private int employeeId;// 员工id
	private String employeeName;// 员工姓名
	private String employeeSex;// 员工性别
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSex=" + employeeSex
				+ ", employeeBirth=" + employeeBirth + ", employeePhone=" + employeePhone + ", employeePlace="
				+ employeePlace + ", joinTime=" + joinTime + ", employeePassword=" + employeePassword + ", isLead=" + isLead + "]";
	}

	private Date employeeBirth;// 员工生日
	private String employeePhone;// 员工电话
	private String employeePlace;// 员工住址
	private String employeePassword;// 密码
	private Date joinTime;// 录入时间
	private boolean isLead;// 是否为管理层领导

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeSex() {
		return employeeSex;
	}

	public void setEmployeeSex(String employeeSex) {
		this.employeeSex = employeeSex;
	}

	public Date getEmployeeBirth() {
		return employeeBirth;
	}

	public void setEmployeeBirth(Date employeeBirth) {
		this.employeeBirth = employeeBirth;
	}

	public String getEmployeePhone() {
		return employeePhone;
	}

	public void setEmployeePhone(String employeePhone) {
		this.employeePhone = employeePhone;
	}

	public String getEmployeePlace() {
		return employeePlace;
	}

	public void setEmployeePlace(String employeePlace) {
		this.employeePlace = employeePlace;
	}

	public Date getJoinTime() {
		return joinTime;
	}

	public void setJoinTime(Date joinTime) {
		this.joinTime = joinTime;
	}

	public String getEmployeePassword() {
		return employeePassword;
	}

	public void setEmployeePassword(String employeePassword) {
		this.employeePassword=employeePassword;
	}

	public boolean isLead() {
		return isLead;
	}

	public void setLead(boolean isLead) {
		this.isLead = isLead;
	}

}
