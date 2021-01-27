-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: mundial82
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
-- Table structure for table `manager`
--

DROP TABLE IF EXISTS `manager`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `manager` (
  `manager_id` int NOT NULL AUTO_INCREMENT,
  `day_of_birth` date DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `team_id` int NOT NULL,
  PRIMARY KEY (`manager_id`),
  KEY `FKdil9hd6t80irdaebtwvj49hy2` (`team_id`),
  CONSTRAINT `FKdil9hd6t80irdaebtwvj49hy2` FOREIGN KEY (`team_id`) REFERENCES `team` (`team_id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `manager`
--

LOCK TABLES `manager` WRITE;
/*!40000 ALTER TABLE `manager` DISABLE KEYS */;
INSERT INTO `manager` VALUES (1,'1942-05-03','Antoni Krzysztof Piechniczek',1),(2,'1927-09-26','Enzo Bearzot',2),(3,'1930-11-29','Jean Vincent',3),(4,'1915-02-20','Tim Elba de Padua Lima',4),(5,'1927-03-10','Josef Jupp Derwall',5),(6,'1942-02-01','Felix Latzke',6),(7,'1927-04-07','Georg Schmidt',6),(8,'1944-01-17','Mahieddine,Khalef',7),(9,'1936-08-12','Rachid,Mekhloufi',7),(10,'1936-02-07','Luis Alberto Santibáñez Díaz',8),(11,'1922-12-06','Guy Thys',9),(12,'1938-11-05','Cesar Luis Menotti',10),(13,'1941-07-16','Kálmán Mészöly',11),(14,'1945-09-12','Mauricio Alonso Pipo Rodríguez Lindo',12),(15,'1921-11-01','Ronald Ron Greenwood',13),(16,'1933-03-22','Michel Hidalgo',14),(17,'1935-02-18','Dr. Jozef Vengloš',15),(18,'1943-02-27','Carlos Alberto Gomes Parreira',16),(19,'1929-07-31','José Emilio\",\"Santamaría Iglesias',17),(20,'1931-08-05','William Billy Laurence Bingham',18),(21,'1930-05-04','Miljan Miljanic',19),(22,'1940-11-21','José de la Paz Chelato Herrera Uclés',20);
/*!40000 ALTER TABLE `manager` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `player`
--

DROP TABLE IF EXISTS `player`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `player` (
  `player_id` int NOT NULL AUTO_INCREMENT,
  `back_number` int NOT NULL,
  `day_of_birth` date DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `position` varchar(255) DEFAULT NULL,
  `team_id` int NOT NULL,
  PRIMARY KEY (`player_id`),
  KEY `FKdvd6ljes11r44igawmpm1mc5s` (`team_id`),
  CONSTRAINT `FKdvd6ljes11r44igawmpm1mc5s` FOREIGN KEY (`team_id`) REFERENCES `team` (`team_id`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `player`
--

LOCK TABLES `player` WRITE;
/*!40000 ALTER TABLE `player` DISABLE KEYS */;
INSERT INTO `player` VALUES (1,1,'1953-09-20','Józef Młynarczyk','GK',1),(2,10,'1956-01-31','Stefan Majewski','DF',1),(3,9,'1954-06-06','Władysław Żmuda','DF',1),(4,16,'1950-04-08','Grzegorz Lato','MF',1),(5,8,'1961-09-27','Waldemar Matysik','MF',1),(6,20,'1956-03-03','Zbigniew Boniek','FW',1),(7,11,'1957-07-16','Włodzimierz Smolarek','FW',1),(8,1,'1942-02-28','Dino Zoff','GK',2),(9,6,'1953-09-27','Claudio Gentile','DF',2),(10,7,'1953-05-25','Gaetano Scirea','DF',2),(11,14,'1954-09-24','Marco Tardelli','MF',2),(12,16,'1955-03-13','Bruno Conti','FW',2),(13,20,'1956-09-23','Paolo Rossi','FW',2),(14,11,'1955-09-25','Karl-Heinz Kalle Rummenigge','FW',5),(15,1,'1954-03-06','Harald Anton Toni Schumacher','GK',5),(16,15,'1954-11-15','Ulrich Uli Stielike','SW',5),(17,2,'1955-10-11','Hans-Peter Briegel','DF',5),(18,7,'1960-04-16','Pierre Michael Littbarski','MF',5),(19,8,'1949-12-27','Klaus Fischer','FW',5),(20,3,'1951-09-05','Paul Breitner','MF',5),(21,18,'1961-03-21','Lothar Herbert Matthäus','MF',5),(22,9,'1951-04-17','Horst Hrubesch','FW',5),(23,14,'1953-07-26','Wolfgang Felix Magath','MF',5),(24,20,'1953-01-06','Manfred Kaltz','DF',5),(25,4,'1958-07-25','Karlheinz Helmut Förster','DF',5),(26,6,'1954-07-12','Wolfgang Dremmler','MF',5),(27,16,'1959-11-17','Thomas Allofs','FW',5),(28,1,'1951-01-02','Waldir Peres de Arruda','GK',21),(29,2,'1959-03-17','Waldir Peres de Arruda','DF',21),(30,3,'1954-06-20','José Oscar Bernardi','DF',21),(31,4,'1958-10-22','Luizinho Luiz Carlos Ferreira','DF',21),(32,6,'1954-06-29','Leovegildo Lins da Gama Júnior','DF',21),(33,5,'1955-04-21',' Antônio Carlos Toninho Cerezo','MF',21),(34,8,'1954-02-19','Sócrates Brasileiro Sampaio de Souza Vieira de Oliveira','MF',21),(35,15,'1953-10-16','Paulo Roberto Falcão','MF',21),(36,10,'1953-03-03','Zico Arthur Antunes Coimbra','MF',21),(37,9,'1953-12-23','Sérgio Bernardino','FW',21),(38,11,'1957-05-25','Éder Aleixo de Assis','FW',21),(39,19,'1957-02-21','Carlos Renato Frederico','MF',21),(40,16,'1955-06-05','Edino Nazareth Filho','DF',21),(41,18,'1955-03-08','João Batista da Silva','MF',21);
/*!40000 ALTER TABLE `player` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `team`
--

DROP TABLE IF EXISTS `team`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `team` (
  `team_id` int NOT NULL AUTO_INCREMENT,
  `country` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`team_id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `team`
--

LOCK TABLES `team` WRITE;
/*!40000 ALTER TABLE `team` DISABLE KEYS */;
INSERT INTO `team` VALUES (1,'POLAND'),(2,'ITALY'),(3,'CAMEROON'),(4,'PERU'),(5,'WEST_GERMANY'),(6,'AUSTRIA'),(7,'ALGERIA'),(8,'CHILE'),(9,'BELGIUM'),(10,'ARGENTINA'),(11,'HUNGARY'),(12,'EL_SALVADOR'),(13,'ENGLAND'),(14,'FRANCE'),(15,'CZECHOSLOVAKIA'),(16,'KUWAIT'),(17,'SPAIN'),(18,'NORTHERN_IRELAND'),(19,'YUGOSLAVIA'),(20,'HONDURAS'),(21,'BRAZIL');
/*!40000 ALTER TABLE `team` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-26 21:46:05
