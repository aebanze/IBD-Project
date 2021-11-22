CREATE DATABASE  IF NOT EXISTS `db_pastelaria` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `db_pastelaria`;
-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: localhost    Database: db_pastelaria
-- ------------------------------------------------------
-- Server version	8.0.25

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
-- Table structure for table `categoria`
--

DROP TABLE IF EXISTS `categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categoria` (
  `cat_cod` int NOT NULL AUTO_INCREMENT,
  `cat_nome` varchar(30) NOT NULL,
  PRIMARY KEY (`cat_cod`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categoria`
--

LOCK TABLES `categoria` WRITE;
/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
/*!40000 ALTER TABLE `categoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `cli_cod` int NOT NULL AUTO_INCREMENT,
  `cli_sexo` enum('M','F') NOT NULL DEFAULT 'M',
  `cli_nome` varchar(15) NOT NULL,
  `cli_apelido` varchar(20) NOT NULL,
  PRIMARY KEY (`cli_cod`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contacto`
--

DROP TABLE IF EXISTS `contacto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contacto` (
  `cod_forn` int NOT NULL,
  `cell` int NOT NULL,
  PRIMARY KEY (`cod_forn`),
  CONSTRAINT `fk_cod_forn` FOREIGN KEY (`cod_forn`) REFERENCES `fornecedor` (`forn_cod`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contacto`
--

LOCK TABLES `contacto` WRITE;
/*!40000 ALTER TABLE `contacto` DISABLE KEYS */;
/*!40000 ALTER TABLE `contacto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contem`
--

DROP TABLE IF EXISTS `contem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contem` (
  `ped_cod` int NOT NULL,
  `prod_cod` int NOT NULL,
  PRIMARY KEY (`ped_cod`,`prod_cod`),
  KEY `fk_prod_cod` (`prod_cod`),
  CONSTRAINT `fk_ped_cod` FOREIGN KEY (`ped_cod`) REFERENCES `pedido` (`ped_cod`),
  CONSTRAINT `fk_prod_cod` FOREIGN KEY (`prod_cod`) REFERENCES `produto` (`prod_cod`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contem`
--

LOCK TABLES `contem` WRITE;
/*!40000 ALTER TABLE `contem` DISABLE KEYS */;
/*!40000 ALTER TABLE `contem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `data_fornecimento`
--

DROP TABLE IF EXISTS `data_fornecimento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `data_fornecimento` (
  `cod_forn` int NOT NULL,
  `forn_data` date DEFAULT NULL,
  PRIMARY KEY (`cod_forn`),
  CONSTRAINT `fk_cod_forn_data` FOREIGN KEY (`cod_forn`) REFERENCES `fornecedor` (`forn_cod`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `data_fornecimento`
--

LOCK TABLES `data_fornecimento` WRITE;
/*!40000 ALTER TABLE `data_fornecimento` DISABLE KEYS */;
/*!40000 ALTER TABLE `data_fornecimento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fornece`
--

DROP TABLE IF EXISTS `fornece`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fornece` (
  `cod_prod` int NOT NULL,
  `for_quant` int NOT NULL,
  PRIMARY KEY (`cod_prod`),
  CONSTRAINT `fk_cod_prod` FOREIGN KEY (`cod_prod`) REFERENCES `produto` (`prod_cod`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fornece`
--

LOCK TABLES `fornece` WRITE;
/*!40000 ALTER TABLE `fornece` DISABLE KEYS */;
/*!40000 ALTER TABLE `fornece` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fornecedor`
--

DROP TABLE IF EXISTS `fornecedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fornecedor` (
  `forn_cod` int NOT NULL AUTO_INCREMENT,
  `forn_nome` varchar(25) NOT NULL,
  `forn_bairro` varchar(30) NOT NULL,
  `forn_avenida` varchar(30) NOT NULL,
  `forn_nuit` int NOT NULL,
  `forn_tipo` varchar(20) DEFAULT NULL,
  `forn_email` varchar(40) NOT NULL,
  PRIMARY KEY (`forn_cod`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fornecedor`
--

LOCK TABLES `fornecedor` WRITE;
/*!40000 ALTER TABLE `fornecedor` DISABLE KEYS */;
/*!40000 ALTER TABLE `fornecedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcionario`
--

DROP TABLE IF EXISTS `funcionario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `funcionario` (
  `func_cod` int NOT NULL AUTO_INCREMENT,
  `func_nome` varchar(15) NOT NULL,
  `func_apelido` varchar(20) NOT NULL,
  `func_id_doc` enum('BI','DIRE','Passport') NOT NULL DEFAULT 'BI',
  `func_nr_doc` varchar(30) NOT NULL,
  `func_email` varchar(50) DEFAULT NULL,
  `func_nacionalidade` varchar(25) DEFAULT 'Moçambicana',
  `func_es_civil` enum('solteiro/a','casado/a','divorciado/a','viuvo/a') DEFAULT 'solteiro/a',
  `func_sexo` enum('M','F') DEFAULT 'M',
  `func_bairro` varchar(25) NOT NULL,
  `func_quarteirao` int DEFAULT NULL,
  `func_casa_nr` int DEFAULT NULL,
  PRIMARY KEY (`func_cod`),
  UNIQUE KEY `func_nr_doc` (`func_nr_doc`),
  UNIQUE KEY `func_email` (`func_email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionario`
--

LOCK TABLES `funcionario` WRITE;
/*!40000 ALTER TABLE `funcionario` DISABLE KEYS */;
/*!40000 ALTER TABLE `funcionario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedido`
--

DROP TABLE IF EXISTS `pedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pedido` (
  `ped_cod` int NOT NULL AUTO_INCREMENT,
  `func_cod` int NOT NULL,
  `cli_cod` int NOT NULL,
  `ped_estado` varchar(25) DEFAULT NULL,
  `ped_numero` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`ped_cod`),
  KEY `fk_cod_func_ped` (`func_cod`),
  KEY `fk_cod_cli` (`cli_cod`),
  CONSTRAINT `fk_cod_cli` FOREIGN KEY (`cli_cod`) REFERENCES `cliente` (`cli_cod`),
  CONSTRAINT `fk_cod_func_ped` FOREIGN KEY (`func_cod`) REFERENCES `funcionario` (`func_cod`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedido`
--

LOCK TABLES `pedido` WRITE;
/*!40000 ALTER TABLE `pedido` DISABLE KEYS */;
/*!40000 ALTER TABLE `pedido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `preco`
--

DROP TABLE IF EXISTS `preco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `preco` (
  `prec_cod` int NOT NULL AUTO_INCREMENT,
  `preco` double DEFAULT NULL,
  PRIMARY KEY (`prec_cod`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `preco`
--

LOCK TABLES `preco` WRITE;
/*!40000 ALTER TABLE `preco` DISABLE KEYS */;
/*!40000 ALTER TABLE `preco` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produto`
--

DROP TABLE IF EXISTS `produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `produto` (
  `prod_cod` int NOT NULL AUTO_INCREMENT,
  `cat_cod` int NOT NULL,
  `prod_marca` varchar(24) DEFAULT NULL,
  `prod_prazo` date DEFAULT NULL,
  PRIMARY KEY (`prod_cod`),
  KEY `fk_cod_cat` (`cat_cod`),
  CONSTRAINT `fk_cod_cat` FOREIGN KEY (`cat_cod`) REFERENCES `categoria` (`cat_cod`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produto`
--

LOCK TABLES `produto` WRITE;
/*!40000 ALTER TABLE `produto` DISABLE KEYS */;
/*!40000 ALTER TABLE `produto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `telefone`
--

DROP TABLE IF EXISTS `telefone`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `telefone` (
  `func_cod` int NOT NULL,
  `telefone` int NOT NULL,
  PRIMARY KEY (`func_cod`),
  CONSTRAINT `fk_cod_func` FOREIGN KEY (`func_cod`) REFERENCES `funcionario` (`func_cod`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `telefone`
--

LOCK TABLES `telefone` WRITE;
/*!40000 ALTER TABLE `telefone` DISABLE KEYS */;
/*!40000 ALTER TABLE `telefone` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-11-21 11:47:59
