-- MySQL dump 10.11
--
-- Host: localhost    Database: usermaintenance
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
-- Table structure for table `securityquestionmaster`
--

DROP DATABASE IF EXISTS `usermaintenance`;
CREATE DATABASE `usermaintenance`;
USE usermaintenance;

DROP TABLE IF EXISTS `securityquestionmaster`;
CREATE TABLE `securityquestionmaster` (
  `Security_Question_ID` int(11) NOT NULL auto_increment,
  `Security_Question` varchar(45) default NULL,
  PRIMARY KEY  (`Security_Question_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `securityquestionmaster`
--

LOCK TABLES `securityquestionmaster` WRITE;
/*!40000 ALTER TABLE `securityquestionmaster` DISABLE KEYS */;
INSERT INTO `securityquestionmaster` VALUES (1,'What is your favourite sport?'),(2,'What is your first mobile number?');
/*!40000 ALTER TABLE `securityquestionmaster` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usermaster`
--

DROP TABLE IF EXISTS `usermaster`;
CREATE TABLE `usermaster` (
  `User_ID` int(11) NOT NULL auto_increment,
  `Username` varchar(45) default NULL,
  `Password` varchar(45) default NULL,
  `User_Type` varchar(20) default NULL,
  `User_Status` varchar(20) default NULL,
  `Security_Question_ID` int(11) default NULL,
  `Security_Answer` varchar(45) default NULL,
  PRIMARY KEY  (`User_ID`),
  KEY `fk_UserMaster_SecurityQuestionMaster` (`Security_Question_ID`),
  CONSTRAINT `fk_UserMaster_SecurityQuestionMaster` FOREIGN KEY (`Security_Question_ID`) REFERENCES `securityquestionmaster` (`Security_Question_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `usermaster`
--

LOCK TABLES `usermaster` WRITE;
/*!40000 ALTER TABLE `usermaster` DISABLE KEYS */;
INSERT INTO `usermaster` VALUES (1,'admin','admin','Administrator','Active',2,'98881333411'),(2,'vinay','vinay','Employee','Active',1,'cricket'),(3,'Akhil','akhil','Employee','Active',1,'hockey'),(4,'Anil','anil','Employee','Active',1,'sport'),(5,'Rohit','rohit','Employee','InActive',2,'9909090909'),(6,'Pratyush12','praytyush','Employee','InActive',2,'99885566332'),(7,'sudhanshu','sudhanshu','Employee','Active',1,'34534534'),(8,'Deepan1','Deepan','Administrator','Active',2,'34234');
/*!40000 ALTER TABLE `usermaster` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2009-07-31  4:11:28
