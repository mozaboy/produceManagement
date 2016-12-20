/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50710
Source Host           : localhost:3306
Source Database       : produce_db

Target Server Type    : MYSQL
Target Server Version : 50710
File Encoding         : 65001

Date: 2016-12-20 10:12:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `person`
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_name` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `user_password` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `age` int(10) DEFAULT NULL,
  `create_time` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_index` (`id`) USING HASH
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES ('1', 'test1', 'test1', '1', '2016-12-20');
INSERT INTO `person` VALUES ('2', 'test2', 'test2', '0', '2016-12-20');
