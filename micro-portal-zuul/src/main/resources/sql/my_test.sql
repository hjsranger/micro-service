/*
 Navicat Premium Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 50729
 Source Host           : 192.168.177.100:3306
 Source Schema         : my_test

 Target Server Type    : MySQL
 Target Server Version : 50729
 File Encoding         : 65001

 Date: 02/05/2020 23:59:02
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for leave_info
-- ----------------------------
DROP TABLE IF EXISTS `leave_info`;
CREATE TABLE `leave_info`  (
  `leave_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '请假ID',
  `user_account` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '请假人',
  `leave_days` double(5, 0) DEFAULT NULL COMMENT '请假天数',
  `leave_reason` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '请假理由',
  `approve_user` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '审批人',
  `leave_status` int(1) DEFAULT NULL COMMENT '请假状态，1审批中 2审批完成 3审批拒绝',
  `create_date` datetime(0) DEFAULT NULL COMMENT '请假时间',
  PRIMARY KEY (`leave_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
  `user_account` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '人员account',
  `user_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '人员姓名',
  `mobile` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '电话',
  `email` varchar(120) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '邮箱',
  `dept_head` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '部门负责人account',
  `dept_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '部门名称',
  PRIMARY KEY (`user_account`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('lisi', '李四', '18611033861', 'lisi@example.com', 'wangwu', 'IT');
INSERT INTO `sys_user` VALUES ('wangwu', '王五', '18611033861', 'wangwu@example.com', 'wangwu', 'IT');
INSERT INTO `sys_user` VALUES ('zhangsan', '张三', '18611033861', 'zhangsan@example.com', 'wangwu', 'IT');

SET FOREIGN_KEY_CHECKS = 1;
