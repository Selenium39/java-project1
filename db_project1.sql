/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : db_project1

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-05-19 11:15:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_criticism
-- ----------------------------
DROP TABLE IF EXISTS `tb_criticism`;
CREATE TABLE `tb_criticism` (
  `criticismId` int(11) NOT NULL AUTO_INCREMENT,
  `criticismContent` text,
  `employeeId` int(11) DEFAULT NULL,
  `criticismTime` datetime DEFAULT NULL,
  `messageId` int(11) DEFAULT NULL,
  PRIMARY KEY (`criticismId`),
  KEY `fk_criticism_message` (`messageId`),
  KEY `fk_criticism_employee` (`employeeId`),
  CONSTRAINT `fk_criticism_employee` FOREIGN KEY (`employeeId`) REFERENCES `tb_employee` (`employeeId`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_criticism_message` FOREIGN KEY (`messageId`) REFERENCES `tb_message` (`messageId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_criticism
-- ----------------------------

-- ----------------------------
-- Table structure for tb_employee
-- ----------------------------
DROP TABLE IF EXISTS `tb_employee`;
CREATE TABLE `tb_employee` (
  `employeeId` int(11) NOT NULL AUTO_INCREMENT,
  `employeeName` varchar(255) DEFAULT NULL,
  `employeeSex` varchar(255) DEFAULT NULL,
  `employeeBirth` date DEFAULT NULL,
  `employeePhone` varchar(255) DEFAULT NULL,
  `employeePlace` varchar(255) DEFAULT NULL,
  `joinTime` date DEFAULT NULL,
  `employeePassword` varchar(255) DEFAULT NULL,
  `isLead` bit(1) DEFAULT NULL,
  PRIMARY KEY (`employeeId`),
  KEY `employeeId` (`employeeId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_employee
-- ----------------------------
INSERT INTO `tb_employee` VALUES ('1', '万涛', 'male', '1997-12-31', '18221390332', '上海浦东新区', '2017-12-31', '123', '\0');
INSERT INTO `tb_employee` VALUES ('2', '万晓菲', 'female', '1993-12-31', '15773272278', '湖南常德', '2017-12-31', '123', '\0');

-- ----------------------------
-- Table structure for tb_message
-- ----------------------------
DROP TABLE IF EXISTS `tb_message`;
CREATE TABLE `tb_message` (
  `messageId` int(11) NOT NULL AUTO_INCREMENT,
  `messageTitle` varchar(255) DEFAULT NULL,
  `messageContent` text,
  `employeeId` int(11) DEFAULT NULL,
  `publishTime` datetime DEFAULT NULL,
  PRIMARY KEY (`messageId`),
  KEY `fk_message_employee` (`employeeId`),
  CONSTRAINT `fk_message_employee` FOREIGN KEY (`employeeId`) REFERENCES `tb_employee` (`employeeId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_message
-- ----------------------------
INSERT INTO `tb_message` VALUES ('1', '致橡树', '我如果爱你——\r\n绝不像攀援的凌霄花，\r\n借你的高枝炫耀自己；\r\n我如果爱你——\r\n绝不学痴情的鸟儿，\r\n为绿荫重复单调的歌曲；\r\n也不止像泉源，\r\n常年送来清凉的慰藉；\r\n也不止像险峰，\r\n增加你的高度，衬托你的威仪。', '1', '2018-05-09 00:00:00');

-- ----------------------------
-- Table structure for tb_reply
-- ----------------------------
DROP TABLE IF EXISTS `tb_reply`;
CREATE TABLE `tb_reply` (
  `replyId` int(11) NOT NULL AUTO_INCREMENT,
  `replyContent` text,
  `employeeId` int(11) DEFAULT NULL,
  `replyTime` datetime DEFAULT NULL,
  `messageId` int(11) DEFAULT NULL,
  PRIMARY KEY (`replyId`),
  KEY `fk_reply_employee` (`employeeId`),
  KEY `fk_reply_message` (`messageId`),
  CONSTRAINT `fk_reply_employee` FOREIGN KEY (`employeeId`) REFERENCES `tb_employee` (`employeeId`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_reply_message` FOREIGN KEY (`messageId`) REFERENCES `tb_message` (`messageId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_reply
-- ----------------------------
INSERT INTO `tb_reply` VALUES ('1', '这首诗写的太好了', '1', '2018-05-12 00:00:00', '1');
