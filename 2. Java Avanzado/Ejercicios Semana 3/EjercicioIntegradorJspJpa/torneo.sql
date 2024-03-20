-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-03-2024 a las 20:56:14
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `torneo`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipo`
--

CREATE TABLE `equipo` (
  `ID` bigint(20) NOT NULL,
  `CIUDAD` varchar(255) DEFAULT NULL,
  `NOMBRE` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `equipo`
--

INSERT INTO `equipo` (`ID`, `CIUDAD`, `NOMBRE`) VALUES
(1, 'Madrid', 'Equipo 1'),
(2, 'Barcelona', 'Equipo 2'),
(3, 'Bilbao', 'Equipo 3');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `partido`
--

CREATE TABLE `partido` (
  `ID` bigint(20) NOT NULL,
  `FECHA` date DEFAULT NULL,
  `RESULTADOEQUIPO1` int(11) DEFAULT NULL,
  `RESULTADOEQUIPO2` int(11) DEFAULT NULL,
  `EQUIPO1_ID` bigint(20) DEFAULT NULL,
  `EQUIPO2_ID` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `partido`
--

INSERT INTO `partido` (`ID`, `FECHA`, `RESULTADOEQUIPO1`, `RESULTADOEQUIPO2`, `EQUIPO1_ID`, `EQUIPO2_ID`) VALUES
(1, '2024-03-07', 98, 78, 1, 2),
(2, '2024-03-18', 85, 69, 1, 3),
(3, '2024-03-02', 78, 82, 2, 3);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `equipo`
--
ALTER TABLE `equipo`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `partido`
--
ALTER TABLE `partido`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `FK_PARTIDO_EQUIPO1_ID` (`EQUIPO1_ID`),
  ADD KEY `FK_PARTIDO_EQUIPO2_ID` (`EQUIPO2_ID`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `equipo`
--
ALTER TABLE `equipo`
  MODIFY `ID` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `partido`
--
ALTER TABLE `partido`
  MODIFY `ID` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `partido`
--
ALTER TABLE `partido`
  ADD CONSTRAINT `FK_PARTIDO_EQUIPO1_ID` FOREIGN KEY (`EQUIPO1_ID`) REFERENCES `equipo` (`ID`),
  ADD CONSTRAINT `FK_PARTIDO_EQUIPO2_ID` FOREIGN KEY (`EQUIPO2_ID`) REFERENCES `equipo` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
