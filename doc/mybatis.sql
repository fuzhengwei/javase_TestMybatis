/*
MySQL Data Transfer
Source Host: localhost
Source Database: mybatis
Target Host: localhost
Target Database: mybatis
Date: 2014-9-25 20:22:13
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for department
-- ----------------------------
CREATE TABLE `department` (
  `deparment_id` int(11) NOT NULL AUTO_INCREMENT,
  `deparment_name` varchar(20) NOT NULL COMMENT '部门名称',
  PRIMARY KEY (`deparment_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for emp
-- ----------------------------
CREATE TABLE `emp` (
  `emp_id` int(11) NOT NULL AUTO_INCREMENT,
  `fk_deparment_id` int(11) NOT NULL,
  `emp_name` varchar(20) NOT NULL,
  `emp_pwd` varchar(20) NOT NULL,
  PRIMARY KEY (`emp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `department` VALUES ('1', '物流与专销平台');
INSERT INTO `department` VALUES ('2', '政府事业部');
INSERT INTO `emp` VALUES ('1', '1', 'admin', '123');
INSERT INTO `emp` VALUES ('2', '1', 'root', '123');
INSERT INTO `emp` VALUES ('3', '2', 'sa', 'sa');
