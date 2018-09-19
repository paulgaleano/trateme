CREATE DATABASE trateme;
USE trateme;
CREATE USER 'trateme'@'localhost' IDENTIFIED BY 'trateme';
GRANT ALL PRIVILEGES ON  trateme. * TO 'trateme'@'localhost';
CREATE USER 'trateme'@'127.0.0.1' IDENTIFIED BY 'trateme';
GRANT ALL PRIVILEGES ON  trateme. * TO 'trateme'@'127.0.0.1';
FLUSH PRIVILEGES;

CREATE TABLE `recogida` (
  `codigo_recogidas` int(11) NOT NULL AUTO_INCREMENT,
  `codigo_operador` int(11) NOT NULL,
  `tipo_recogida` int(11) NOT NULL,
  `codigo_tripulacion` int(11) NOT NULL,
  `codigo_remitente` int(11) NOT NULL,
  `nombre_remitente` varchar(200) NOT NULL,
  `direccion_remitente` varchar(500) NOT NULL,
  `codigo_ciudad_remitente` varchar(10) NOT NULL,
  `telefono_remitente` varchar(50) NOT NULL,
  `codigo_destinatario` int(11) NOT NULL,
  `nombre_destinatario` varchar(200) NOT NULL,
  `direccion_destinatario` varchar(500) NOT NULL,
  `codigo_ciudad_destinatario` varchar(10) NOT NULL,
  `telefono_destinatario` varchar(50) NOT NULL,
  `fecha_llamada` date DEFAULT NULL,
  `hora_llamada` time DEFAULT NULL,
  `fecha_programacion` date DEFAULT NULL,
  `hora_programacion` time DEFAULT NULL,
  `fecha_recogida` date DEFAULT NULL,
  `hora_recogida` time DEFAULT NULL,
  `token` json DEFAULT NULL,
  PRIMARY KEY (`codigo_recogidas`));
  
CREATE TABLE `trateme`.`remision` (
  `codigo_remision` VARCHAR(50) NOT NULL,
  `codigo_operador` INT NOT NULL,
  `codigo_recogidas` INT NOT NULL,
  `codigo_tripulacion` INT NOT NULL,
  `numero_total_unidades` INT NOT NULL,
  `peso_total_unidades` DECIMAL NOT NULL,
  `volumen_total_unidades` DECIMAL NOT NULL,
  `flete_total` DECIMAL NOT NULL,
  `fecha_creacion_remision` date DEFAULT NULL,
  `hora_creacion_remision` time DEFAULT NULL,
  `token` JSON NOT NULL,
  PRIMARY KEY (`codigo_remision`));
  
  CREATE TABLE `trateme`.`transporte` (
  `codigo_transporte` int(11) NOT NULL AUTO_INCREMENT,
  `codigo_operador` int(11) NOT NULL,
  `tipo_transporte` int(11) NOT NULL,
  `codigo_remision` varchar(50) NOT NULL,
  `codigo_tripulacion` int(11) NOT NULL,
  `fecha_inicio_transporte` date DEFAULT NULL,
  `hora_inicio_transporte` time DEFAULT NULL,
  `fecha_fin_transporte` date DEFAULT NULL,
  `hora_fin_transporte` time DEFAULT NULL,
  `token` json NOT NULL,
  PRIMARY KEY (`codigo_transporte`));
  
  CREATE TABLE `trateme`.`entrega` (
  `codigo_entrega` int(11) NOT NULL AUTO_INCREMENT,
  `codigo_operador` int(11) NOT NULL,
  `tipo_entrega` int(11) NOT NULL,
  `codigo_remision` varchar(50) NOT NULL,
  `codigo_tripulacion` int(11) NOT NULL,
  `fecha_entrega` date DEFAULT NULL,
  `hora_entrega` time DEFAULT NULL,
  `token` json NOT NULL,
  PRIMARY KEY (`codigo_entrega`));
  
CREATE TABLE `trateme`.`rastreo` (
  `codigo_rastreo` int(11) NOT NULL AUTO_INCREMENT,
  `codigo_operador` int(11) NOT NULL,
  `codigo_sub_proceso` int(11) NOT NULL,
  `codigo_remision` varchar(50) NOT NULL,
  `codigo_tripulacion` int(11) NOT NULL,
  `fecha_rastreo` date DEFAULT NULL,
  `hora_rastreo` time DEFAULT NULL,
  `token` json NOT NULL,
  PRIMARY KEY (`codigo_rastreo`));