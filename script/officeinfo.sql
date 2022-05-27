CREATE DATABASE  IF NOT EXISTS `officeinfo` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `officeinfo`;
-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: officeinfo
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
-- Table structure for table `attendence`
--

DROP TABLE IF EXISTS `attendence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `attendence` (
  `department` varchar(20) DEFAULT NULL,
  `ID` varchar(20) DEFAULT NULL,
  `Date` varchar(20) DEFAULT NULL,
  `Time` varchar(20) DEFAULT NULL,
  `Month` varchar(20) DEFAULT NULL,
  `Year` varchar(20) DEFAULT NULL,
  `Status` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attendence`
--

LOCK TABLES `attendence` WRITE;
/*!40000 ALTER TABLE `attendence` DISABLE KEYS */;
INSERT INTO `attendence` VALUES ('ACCOUNTS','1','2021-05-30','11:43:16 AM','Jan','2015','1');
/*!40000 ALTER TABLE `attendence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `ID` varchar(20) NOT NULL,
  `Department` varchar(20) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Phone` varchar(20) NOT NULL,
  `Email` varchar(20) NOT NULL,
  `National_ID` varchar(20) NOT NULL,
  `Qualification` varchar(20) DEFAULT NULL,
  `Join_Date` varchar(40) NOT NULL,
  `Shift` varchar(20) NOT NULL,
  `Salary` varchar(20) NOT NULL,
  `Experience` varchar(20) NOT NULL,
  `Date_of_Birth` varchar(20) NOT NULL,
  `Gender` varchar(20) NOT NULL,
  `Person` varchar(20) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES ('1','ACCOUNTS','RAHUL','9876543210','gaba@gmail.com','987','bca','2-2-200','DAY','12000','NO','2-8-1995','MALE','1'),('2','ACCOUNTS','vikas','9876543210','vikas@gmail.com','12345','BCA','5-5-2021','DAY','22000','NO','2-2-1999','MALE','1');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `leave_apply`
--

DROP TABLE IF EXISTS `leave_apply`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `leave_apply` (
  `ID` int DEFAULT NULL,
  `Department` varchar(20) DEFAULT NULL,
  `Name` varchar(20) DEFAULT NULL,
  `Leave_Type` varchar(20) DEFAULT NULL,
  `No_Of_Days` varchar(20) DEFAULT NULL,
  `Leave_Start` varchar(20) DEFAULT NULL,
  `Leave_End` varchar(20) DEFAULT NULL,
  `Month` varchar(20) DEFAULT NULL,
  `Year` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `leave_apply`
--

LOCK TABLES `leave_apply` WRITE;
/*!40000 ALTER TABLE `leave_apply` DISABLE KEYS */;
INSERT INTO `leave_apply` VALUES (1,'ACCOUNTS','rahul','casual','2','30-5-2021','1-6-2021','May','2021');
/*!40000 ALTER TABLE `leave_apply` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `monthly_stat`
--

DROP TABLE IF EXISTS `monthly_stat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `monthly_stat` (
  `Earn` varchar(20) DEFAULT NULL,
  `Cost` varchar(20) DEFAULT NULL,
  `Month` varchar(20) DEFAULT NULL,
  `Year` varchar(20) DEFAULT NULL,
  `Profit` varchar(20) DEFAULT NULL,
  `Loss` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `monthly_stat`
--

LOCK TABLES `monthly_stat` WRITE;
/*!40000 ALTER TABLE `monthly_stat` DISABLE KEYS */;
INSERT INTO `monthly_stat` VALUES ('1200','1100','Jan','2021','100','0');
/*!40000 ALTER TABLE `monthly_stat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yearly_stat`
--

DROP TABLE IF EXISTS `yearly_stat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `yearly_stat` (
  `Yearly_Earn` varchar(20) DEFAULT NULL,
  `Yearly_Cost` varchar(20) DEFAULT NULL,
  `Year` varchar(20) DEFAULT NULL,
  `Profit` varchar(20) DEFAULT NULL,
  `Loss` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yearly_stat`
--

LOCK TABLES `yearly_stat` WRITE;
/*!40000 ALTER TABLE `yearly_stat` DISABLE KEYS */;
INSERT INTO `yearly_stat` VALUES ('12000','10000','2021','2000','0');
/*!40000 ALTER TABLE `yearly_stat` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-06-02 23:17:07
