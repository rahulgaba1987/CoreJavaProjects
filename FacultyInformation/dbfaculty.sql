-- MySQL dump 10.11
--
-- Host: localhost    Database: facinfo
-- ------------------------------------------------------
-- Server version	5.0.37-community-nt

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `facdetails`
--
DROP DATABASE IF EXISTS `facinfo`;
CREATE DATABASE `facinfo` 


DROP TABLE IF EXISTS `facdetails`;
CREATE TABLE `facdetails` (
  `fac_id` int(11) NOT NULL,
  `fact_name` varchar(25) default NULL,
  `f_name` varchar(25) default NULL,
  `dob` varchar(10) default NULL,
  `gender` varchar(10) default NULL,
  `ph_no` varchar(25) default NULL,
  `email_id` varchar(25) default NULL,
  `address` varchar(25) default NULL,
  `dept` varchar(25) default NULL,
  `salary` varchar(25) default NULL,
  PRIMARY KEY  (`fac_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `facdetails`
--

LOCK TABLES `facdetails` WRITE;
/*!40000 ALTER TABLE `facdetails` DISABLE KEYS */;
INSERT INTO `facdetails` VALUES (99,'harshpreet','hrish','12-12-1994','','8855443322','fgg46y','patiala','Computer Science','10000'),(111,'kuljinder kaur','harmanjit singh','18/12/1994','','9781726213','poonam678@gmail.com','Computer Science','Computer Science','Computer Science'),(112,'neena devi','darshan singh','19/8/1994','Female','8146856189','biviaanneena@gmail.com','patiala','Computer Science','50,000'),(113,'navdeep singh',' sandeep singh','19/8/1993','Male','8146856654','navdeepsingh@gmail.com','patiala','Computer Science','50,000'),(114,'rohan','rohit','15/9/1994','','9834126754','rohan56@gmail.com','50,000','Sangrur','Computer Science'),(2343,'kuljinder kaur','harmanjit singh','18/12/1994','','9781726213','poonam678@gmail.com','Computer Science','patiala','Computer Science');
/*!40000 ALTER TABLE `facdetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
CREATE TABLE `login` (
  `username` varchar(25) default NULL,
  `password` varchar(25) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES ('admin','admin');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-11-15  7:38:40
