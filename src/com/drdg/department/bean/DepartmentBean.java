package com.drdg.department.bean;

import java.util.List;

import com.drdg.emp.bean.EmpBean;

public class DepartmentBean {

	private Integer deparmentId;
	private String deparmentName;

	private List<EmpBean> empList;

	public List<EmpBean> getEmpList() {
		return empList;
	}

	public void setEmpList(List<EmpBean> empList) {
		this.empList = empList;
	}

	public Integer getDeparmentId() {
		return deparmentId;
	}

	public void setDeparmentId(Integer deparmentId) {
		this.deparmentId = deparmentId;
	}

	public String getDeparmentName() {
		return deparmentName;
	}

	public void setDeparmentName(String deparmentName) {
		this.deparmentName = deparmentName == null ? null : deparmentName
				.trim();
	}

	@Override
	public String toString() {
		return "DepartmentBean [deparmentId=" + deparmentId
				+ ", deparmentName=" + deparmentName + ", empList=" + empList
				+ "]";
	}
	
	
}