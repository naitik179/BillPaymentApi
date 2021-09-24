CREATE DATABASE  IF NOT EXISTS `billpayment` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `billpayment`;
-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: billpayment
-- ------------------------------------------------------
-- Server version	8.0.26

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
-- Table structure for table `registered_billers`
--

DROP TABLE IF EXISTS `registered_billers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `registered_billers` (
  `billerid` bigint NOT NULL,
  `autopay` bit(1) DEFAULT NULL,
  `consumerno` varchar(255) DEFAULT NULL,
  `limitamount` bigint DEFAULT NULL,
  `billercode` bigint NOT NULL,
  `consumeraccountno` bigint DEFAULT NULL,
  PRIMARY KEY (`billerid`),
  KEY `FKr0ol32rwv0l0qfdy4dng4gamn` (`billercode`),
  KEY `FK83w15ygn9rv0tr5hjoa1d051k` (`consumeraccountno`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registered_billers`
--

LOCK TABLES `registered_billers` WRITE;
/*!40000 ALTER TABLE `registered_billers` DISABLE KEYS */;
INSERT INTO `registered_billers` VALUES (1,_binary '','8082576193',2000,1,4001),(2,_binary '\0','9999999999',4000,2,4002),(3,_binary '\0','7777777777',4000,3,4002),(4,_binary '\0','9999999991',4000,4,4002),(5,_binary '\0','8888888881',4000,1,4002),(6,_binary '\0','9999999992',4000,2,4001),(7,_binary '\0','9999999993',4000,1,4003),(8,_binary '\0','9999999993',4000,1,4003),(9,_binary '\0','9999999995',4000,1,4001),(10,_binary '\0','9999999996',4000,1,4004),(11,_binary '\0','9999999997',4000,2,4004),(12,_binary '\0','9999999777',4000,1,4006);
/*!40000 ALTER TABLE `registered_billers` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-09-23 10:59:23
