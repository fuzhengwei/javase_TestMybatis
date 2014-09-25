package com.drdg.emp.dao;

import java.util.List;

import com.drdg.department.bean.DepartmentBean;
import com.drdg.emp.bean.EmpBean;

public interface EmpBeanMapper {
	int deleteByPrimaryKey(Integer empId);

	int insert(EmpBean record);

	int insertSelective(EmpBean record);

	EmpBean selectByPrimaryKey(Integer empId);

	List<EmpBean> queryByDpByName();
	
	int selectModelCount();

	int updateByPrimaryKeySelective(EmpBean record);

	int updateByPrimaryKey(EmpBean record);
}