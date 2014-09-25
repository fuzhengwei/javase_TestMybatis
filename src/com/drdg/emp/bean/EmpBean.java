package com.drdg.emp.bean;

import com.drdg.department.bean.DepartmentBean;

public class EmpBean {

	private Integer empId;
	private Integer fkDeparmentId;
	private String empName;
	private String empPwd;

	private DepartmentBean department;

	public DepartmentBean getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentBean department) {
		this.department = department;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public Integer getFkDeparmentId() {
		return fkDeparmentId;
	}

	public void setFkDeparmentId(Integer fkDeparmentId) {
		this.fkDeparmentId = fkDeparmentId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName == null ? null : empName.trim();
	}

	public String getEmpPwd() {
		return empPwd;
	}

	public void setEmpPwd(String empPwd) {
		this.empPwd = empPwd == null ? null : empPwd.trim();
	}

	@Override
	public String toString() {
		return "EmpBean [empId=" + empId + ", fkDeparmentId=" + fkDeparmentId
				+ ", empName=" + empName + ", empPwd=" + empPwd
				+ ", department=" + department + "]";
	}
	
	
}