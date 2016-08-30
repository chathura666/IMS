-- MySQL dump 10.13  Distrib 5.6.26, for Win64 (x86_64)
--
-- Host: localhost    Database: ims
-- ------------------------------------------------------
-- Server version	5.6.26-log

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
-- Current Database: `ims`
--

/*!40000 DROP DATABASE IF EXISTS `ims`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `ims` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `ims`;

--
-- Table structure for table `currentstocks`
--

DROP TABLE IF EXISTS `currentstocks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `currentstocks` (
  `productcode` varchar(100) NOT NULL,
  `quantity` int(11) NOT NULL,
  KEY `cuprodcode_idx` (`productcode`),
  CONSTRAINT `cupprdcode` FOREIGN KEY (`productcode`) REFERENCES `products` (`productcode`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `currentstocks`
--

LOCK TABLES `currentstocks` WRITE;
/*!40000 ALTER TABLE `currentstocks` DISABLE KEYS */;
INSERT INTO `currentstocks` VALUES ('prod1',3),('prod2',0),('prod3',12);
/*!40000 ALTER TABLE `currentstocks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customers`
--

DROP TABLE IF EXISTS `customers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customers` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `customercode` varchar(20) NOT NULL,
  `fullname` varchar(50) NOT NULL,
  `location` varchar(50) NOT NULL,
  `phone` varchar(50) NOT NULL,
  PRIMARY KEY (`cid`),
  UNIQUE KEY `customercode_UNIQUE` (`customercode`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customers`
--

LOCK TABLES `customers` WRITE;
/*!40000 ALTER TABLE `customers` DISABLE KEYS */;
INSERT INTO `customers` VALUES (3,'cus1','Priyama','Panadura','0711643465');
/*!40000 ALTER TABLE `customers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grninfo`
--

DROP TABLE IF EXISTS `grninfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `grninfo` (
  `GRNid` int(11) NOT NULL AUTO_INCREMENT,
  `grncode` varchar(20) NOT NULL,
  `suppliercode` varchar(20) NOT NULL,
  `productcode` varchar(20) NOT NULL,
  `date` varchar(200) NOT NULL,
  `quantity` int(11) NOT NULL,
  `totalcost` double NOT NULL,
  `enteredby` varchar(20) NOT NULL,
  PRIMARY KEY (`GRNid`),
  KEY `pcode_idx` (`productcode`),
  KEY `supcode_idx` (`suppliercode`),
  CONSTRAINT `prodcode` FOREIGN KEY (`productcode`) REFERENCES `products` (`productcode`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `supcode` FOREIGN KEY (`suppliercode`) REFERENCES `suppliers` (`suppliercode`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grninfo`
--

LOCK TABLES `grninfo` WRITE;
/*!40000 ALTER TABLE `grninfo` DISABLE KEYS */;
INSERT INTO `grninfo` VALUES (1,'p1','sup1','prod1','Tue Aug 09 22:40:37 IST 2016',5,1000,'user4'),(2,'p1','sup1','prod2','Mon Aug 08 16:49:03 IST 2016',6,19800,'user4'),(3,'p2','sup1','prod3','Wed Aug 24 16:49:42 IST 2016',6,324,'user4'),(4,'p1','sup1','prod3','Tue Aug 09 10:49:34 IST 2016',6,13800,'user4');
/*!40000 ALTER TABLE `grninfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `issues`
--

DROP TABLE IF EXISTS `issues`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `issues` (
  `salesid` int(11) NOT NULL AUTO_INCREMENT,
  `issuecode` varchar(20) NOT NULL,
  `date` varchar(40) NOT NULL,
  `productcode` varchar(20) NOT NULL,
  `customercode` varchar(20) NOT NULL,
  `quantity` int(11) NOT NULL,
  `revenue` double NOT NULL,
  `soldby` varchar(20) NOT NULL,
  PRIMARY KEY (`salesid`),
  KEY `salescuscode_idx` (`customercode`),
  KEY `salespcode_idx` (`productcode`),
  KEY `salesucode_idx` (`soldby`),
  CONSTRAINT `salescuscode` FOREIGN KEY (`customercode`) REFERENCES `customers` (`customercode`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `salespcode` FOREIGN KEY (`productcode`) REFERENCES `products` (`productcode`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `salesucode` FOREIGN KEY (`soldby`) REFERENCES `users` (`username`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `issues`
--

LOCK TABLES `issues` WRITE;
/*!40000 ALTER TABLE `issues` DISABLE KEYS */;
INSERT INTO `issues` VALUES (1,'i1','Sun Aug 07 19:06:15 IST 2016','prod1','cus1',2,420,'user4'),(2,'i1','Mon Aug 08 14:44:41 IST 2016','prod2','cus1',5,2750,'user4'),(3,'i2','Mon Aug 08 14:44:41 IST 2016','prod2','cus1',1,550,'user4');
/*!40000 ALTER TABLE `issues` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `products` (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `productcode` varchar(20) NOT NULL,
  `productname` varchar(100) NOT NULL,
  `costprice` double NOT NULL,
  `sellingprice` double NOT NULL,
  `brand` varchar(100) NOT NULL,
  `description` varchar(100) DEFAULT NULL,
  `enteredby` varchar(20) NOT NULL,
  PRIMARY KEY (`pid`),
  UNIQUE KEY `productcode_UNIQUE` (`productcode`),
  KEY `usrname_idx` (`enteredby`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (1,'prod1','BM2',200,210,'Angle','123dfg',''),(2,'prod2','newProduct',500,550,'Brand12','this s for test','user2'),(3,'prod3','Shoe',2300,2400,'DSI','Lether shoe','user4');
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `purchaseinfo`
--

DROP TABLE IF EXISTS `purchaseinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `purchaseinfo` (
  `poid` int(9) NOT NULL AUTO_INCREMENT,
  `purchasecode` varchar(20) NOT NULL,
  `suppliercode` varchar(20) NOT NULL,
  `productcode` varchar(20) NOT NULL,
  `date` varchar(200) NOT NULL,
  `quantity` int(11) NOT NULL,
  `totalcost` double NOT NULL,
  `enteredby` varchar(20) NOT NULL,
  PRIMARY KEY (`poid`),
  KEY `pcode_idx` (`productcode`),
  KEY `scode_idx` (`suppliercode`),
  CONSTRAINT `pcode` FOREIGN KEY (`productcode`) REFERENCES `products` (`productcode`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `scode` FOREIGN KEY (`suppliercode`) REFERENCES `suppliers` (`suppliercode`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `purchaseinfo`
--

LOCK TABLES `purchaseinfo` WRITE;
/*!40000 ALTER TABLE `purchaseinfo` DISABLE KEYS */;
INSERT INTO `purchaseinfo` VALUES (3,'p1','sup1','prod1','Wed Aug 03 21:45:12 IST 2016',5,1000,'user2'),(4,'p1','sup1','prod2','Wed Aug 03 22:16:08 IST 2016',4,2000,'user2'),(5,'p2','sup1','prod1','Wed Aug 03 22:20:19 IST 2016',7,1400,'user4'),(6,'p3','sup2','prod3','Tue Aug 16 11:02:24 IST 2016',5,11500,'user4'),(7,'p4','sup2','prod1','Wed Aug 03 11:45:22 IST 2016',8,1600,'user4'),(8,'p2','sup2','prod2','Thu Aug 04 00:00:00 IST 2016',4,2000,'user4');
/*!40000 ALTER TABLE `purchaseinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `suppliers`
--

DROP TABLE IF EXISTS `suppliers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `suppliers` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `suppliercode` varchar(20) NOT NULL,
  `fullname` varchar(100) NOT NULL,
  `location` varchar(50) NOT NULL,
  `phone` varchar(10) NOT NULL,
  PRIMARY KEY (`sid`),
  UNIQUE KEY `suppliercode_UNIQUE` (`suppliercode`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `suppliers`
--

LOCK TABLES `suppliers` WRITE;
/*!40000 ALTER TABLE `suppliers` DISABLE KEYS */;
INSERT INTO `suppliers` VALUES (1,'sup1','jonyyy','kurunegala','23432443'),(2,'sup2','Manoji','Panadura','0711234233');
/*!40000 ALTER TABLE `suppliers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fullname` varchar(50) NOT NULL,
  `location` varchar(50) NOT NULL,
  `phone` varchar(10) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(200) NOT NULL,
  `category` varchar(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username_UNIQUE` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (54,'AdminUser','Kandy','9849284991','user4','3f02ebe3d7929b091e3d8ccfde2f3bc6','ADMINISTRATOR'),(55,'ClerkUser','Colombo','0788354623','user1','24c9e15e52afc47c225b757e7bee1f9d','CLERK'),(56,'StockUser','Kurunegala','0711888333','user2','7e58d63b60197ceb55a1c487989a3720','STOCK MANAGER');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-08-31  1:07:19
