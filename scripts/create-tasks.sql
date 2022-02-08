CREATE DATABASE  IF NOT EXISTS `todo_app`;
USE `todo_app`;

--
-- Table structure for table `task`
--

DROP TABLE IF EXISTS `task`;

CREATE TABLE `task` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(200) DEFAULT NULL,
  `completed` BIT DEFAULT 0 NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `task`
--

INSERT INTO `task` VALUES 
	(1,'finish up my assignment',1),
	(2,'write out my budget for next month',0),
	(3,'visit my friend',1);

