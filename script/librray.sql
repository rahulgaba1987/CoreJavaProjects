CREATE DATABASE  IF NOT EXISTS `javm_production_database` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `javm_production_database`;
-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: javm_production_database
-- ------------------------------------------------------
-- Server version	8.0.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `add_book_entry`
--

DROP TABLE IF EXISTS `add_book_entry`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `add_book_entry` (
  `Book_ID` int NOT NULL,
  `Book_Name` varchar(30) DEFAULT NULL,
  `Book_Author` varchar(20) DEFAULT NULL,
  `Book_Publication` varchar(20) DEFAULT NULL,
  `Book_Supplier` varchar(20) DEFAULT NULL,
  `Book_Cost` int DEFAULT NULL,
  `Department_Name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Book_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `add_book_entry`
--

LOCK TABLES `add_book_entry` WRITE;
/*!40000 ALTER TABLE `add_book_entry` DISABLE KEYS */;
INSERT INTO `add_book_entry` VALUES (101,'Java','Shyam Sunder','Kalayani Publication','Malhotra Book Depot',350,'Computer Science'),(102,'Java','Shyam Sunder','Kalayani Publication','Malhotra Book Depot',350,'Computer Science');
/*!40000 ALTER TABLE `add_book_entry` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `add_circulation_entry`
--

DROP TABLE IF EXISTS `add_circulation_entry`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `add_circulation_entry` (
  `Book_ID` int NOT NULL,
  `Book_Name` varchar(30) DEFAULT NULL,
  `Student_Name` varchar(20) DEFAULT NULL,
  `Student_Class` varchar(20) DEFAULT NULL,
  `Student_RollNo` int DEFAULT NULL,
  `Date_of_Issued` varchar(15) DEFAULT NULL,
  `Date_of_Return` varchar(20) DEFAULT NULL,
  `Total_Fine` int DEFAULT NULL,
  `Book_Received` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`Book_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `add_circulation_entry`
--

LOCK TABLES `add_circulation_entry` WRITE;
/*!40000 ALTER TABLE `add_circulation_entry` DISABLE KEYS */;
INSERT INTO `add_circulation_entry` VALUES (57,'vgy','vgh',' vh',75,'cfgh','v hj',57,'hvhj'),(123,'daa','asdas','dasas',21,'asad','sdad',21,'adad'),(298,'CSA','Akash','BCA',46,'1January2014','7February2014',50,'Yes'),(322,'asdas','asfa','asfd',423,'fdsa','sfa',3242,'fdsa'),(413,'java','vipul','bca',19,'12,june,2014','13,june,2014',0,'yes'),(1112,'asd','ads','ad',21,'4March2013','3March2012',232,'Yes'),(7765,'vhgcvhc','bv g gv','vvvv',867,'3February2014','3January2014',100,'No');
/*!40000 ALTER TABLE `add_circulation_entry` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `demo`
--

DROP TABLE IF EXISTS `demo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `demo` (
  `RollNo` int DEFAULT NULL,
  `Name` varchar(20) DEFAULT NULL,
  `Class1` varchar(7) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `demo`
--

LOCK TABLES `demo` WRITE;
/*!40000 ALTER TABLE `demo` DISABLE KEYS */;
INSERT INTO `demo` VALUES (101,'Jaggi','BCA'),(101,'Jaggi','BCA'),(2,'rajat gupta','bca'),(34,'zsw','zwsaz');
/*!40000 ALTER TABLE `demo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `facdetails`
--

DROP TABLE IF EXISTS `facdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `facdetails` (
  `fac_id` int NOT NULL,
  `fact_name` varchar(25) DEFAULT NULL,
  `f_name` varchar(25) DEFAULT NULL,
  `dob` varchar(10) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `ph_no` varchar(25) DEFAULT NULL,
  `email_id` varchar(25) DEFAULT NULL,
  `address` varchar(25) DEFAULT NULL,
  `dept` varchar(25) DEFAULT NULL,
  `salary` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`fac_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `facdetails`
--

LOCK TABLES `facdetails` WRITE;
/*!40000 ALTER TABLE `facdetails` DISABLE KEYS */;
INSERT INTO `facdetails` VALUES (99,'harshpreet','hrish','12-12-1994','','8855443322','fgg46y','patiala','Computer Science','10000'),(111,'kuljinder kaur','harmanjit singh','18/12/1994','','9781726213','poonam678@gmail.com','Computer Science','Computer Science','Computer Science'),(112,'neena devi','darshan singh','19/8/1994','Female','8146856189','biviaanneena@gmail.com','patiala','Computer Science','50,000'),(113,'navdeep singh',' sandeep singh','19/8/1993','Male','8146856654','navdeepsingh@gmail.com','patiala','Computer Science','50,000'),(114,'rohan','rohit','15/9/1994','','9834126754','rohan56@gmail.com','50,000','Sangrur','Computer Science'),(2343,'kuljinder kaur','harmanjit singh','18/12/1994','','9781726213','poonam678@gmail.com','Computer Science','patiala','Computer Science');
/*!40000 ALTER TABLE `facdetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `log_in`
--

DROP TABLE IF EXISTS `log_in`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `log_in` (
  `Username` varchar(20) DEFAULT NULL,
  `Password` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `log_in`
--

LOCK TABLES `log_in` WRITE;
/*!40000 ALTER TABLE `log_in` DISABLE KEYS */;
INSERT INTO `log_in` VALUES ('Admin','1111');
/*!40000 ALTER TABLE `log_in` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `login` (
  `username` varchar(25) DEFAULT NULL,
  `password` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

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

-- Dump completed on 2021-06-02 22:40:25
