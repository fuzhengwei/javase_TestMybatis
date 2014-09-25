package com.drdg.junit;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.drdg.department.bean.DepartmentBean;
import com.drdg.department.dao.DepartmentBeanMapper;
import com.drdg.emp.bean.EmpBean;
import com.drdg.emp.dao.EmpBeanMapper;
import com.drdg.util.MybatisSqlSession;
import com.mysql.jdbc.interceptors.SessionAssociationInterceptor;

public class MyJunit {

	@Test
	public void insert() {

		EmpBean emp = new EmpBean();
		emp.setEmpName("root");
		emp.setEmpPwd("123");
		emp.setFkDeparmentId(1);

		try {

			SqlSession session = MybatisSqlSession.getSqlSession();
			
			EmpBeanMapper empDao = session.getMapper(
					EmpBeanMapper.class);
			int r = empDao.insert(emp);
			System.out.println(r);
			session.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	@Test
	public void selectModelCount() {

		EmpBeanMapper empDao = MybatisSqlSession.getSqlSession().getMapper(
				EmpBeanMapper.class);

		int count = empDao.selectModelCount();

		System.out.println(count);
	}

	
	/**
	 * Department
	 **/
	
	//查询
	@Test
	public void Department_queryByDpByName(){
		
		SqlSession session = MybatisSqlSession.getSqlSession();
		
		DepartmentBeanMapper departmentDao = session.getMapper(DepartmentBeanMapper.class);
		
		List<DepartmentBean> model = departmentDao.queryByDpByName();
		
		System.out.println(model);
		
	}
	
	@Test
	public void Emp_queryByDpByName(){
		
		SqlSession session = MybatisSqlSession.getSqlSession();
		
		EmpBeanMapper empDao = session.getMapper(EmpBeanMapper.class);
		
		List<EmpBean> model = empDao.queryByDpByName();
		
		System.out.println(model);
		
	}
	
}
