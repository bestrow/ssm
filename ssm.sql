/*
Navicat MySQL Data Transfer

Source Server         : demo
Source Server Version : 50620
Source Host           : localhost:3306
Source Database       : ssm

Target Server Type    : MYSQL
Target Server Version : 50620
File Encoding         : 65001

Date: 2018-08-01 11:52:25
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `login_id` varchar(20) NOT NULL COMMENT '登陆ID',
  `pwd` varchar(20) NOT NULL COMMENT '用户密码',
  `name` varchar(100) NOT NULL COMMENT '用户姓名',
  `age` int(3) NOT NULL COMMENT '用户年龄',
  `sex` varchar(3) NOT NULL COMMENT '性别',
  `duty` varchar(15) DEFAULT NULL COMMENT '职务',
  `cell_number` varchar(15) DEFAULT NULL COMMENT '手机号',
  `photo_url` varchar(75) DEFAULT NULL COMMENT '头像地址',
  `used` tinyint(1) NOT NULL COMMENT '账号是否可用',
  PRIMARY KEY (`login_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('111111', '123456', '手拉手系列教程', '22', '女', null, null, null, '1');
INSERT INTO `user` VALUES ('pangpang', '123456', '余下一整夜', '25', '男', null, null, null, '1');
INSERT INTO `user` VALUES ('pc228568859', '123456', 'chengcheng', '20', '女', null, null, null, '1');
INSERT INTO `user` VALUES ('pc859107393', '123456', '阿程', '20', '男', null, null, null, '1');
