/*
MySQL Data Transfer
Source Host: 127.0.0.1
Source Database: mybatis
Target Host: 127.0.0.1
Target Database: mybatis
Date: 2014/9/24 16:15:09
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for department
-- ----------------------------
CREATE TABLE `department` (
  `deparment_id` int(11) NOT NULL AUTO_INCREMENT,
  `deparment_name` varchar(20) NOT NULL COMMENT '部门名称',
  PRIMARY KEY (`deparment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for emp
-- ----------------------------
CREATE TABLE `emp` (
  `emp_id` int(11) NOT NULL AUTO_INCREMENT,
  `fk_deparment_id` int(11) NOT NULL,
  `emp_name` varchar(20) NOT NULL,
  `emp_pwd` varchar(20) NOT NULL,
  PRIMARY KEY (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records 
-- ----------------------------
