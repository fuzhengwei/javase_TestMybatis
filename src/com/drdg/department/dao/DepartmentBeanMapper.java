package com.drdg.department.dao;

import java.util.List;

import com.drdg.department.bean.DepartmentBean;

public interface DepartmentBeanMapper {
    int deleteByPrimaryKey(Integer deparmentId);

    int insert(DepartmentBean record);

    int insertSelective(DepartmentBean record);

    DepartmentBean selectByPrimaryKey(Integer deparmentId);

    List<DepartmentBean> queryByDpByName();
    
    int updateByPrimaryKeySelective(DepartmentBean record);

    int updateByPrimaryKey(DepartmentBean record);
}