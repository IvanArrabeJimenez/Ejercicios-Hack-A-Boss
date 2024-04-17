-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 17-04-2024 a las 12:49:12
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
-- Base de datos: `cursos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `curso`
--

CREATE TABLE `curso` (
  `id_curso` bigint(20) NOT NULL,
  `fecha_finalizacion` date DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `tipo_curso` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `curso`
--

INSERT INTO `curso` (`id_curso`, `fecha_finalizacion`, `nombre`, `tipo_curso`) VALUES
(1, '2024-02-28', 'Java Básico', 'Online'),
(3, '2024-03-26', 'Java Avanzado', 'Online'),
(52, '2024-04-05', 'Buenas Prácticas', 'Online'),
(102, '2024-04-25', 'Spring Boot', 'Online');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `curso_seq`
--

CREATE TABLE `curso_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `curso_seq`
--

INSERT INTO `curso_seq` (`next_val`) VALUES
(201);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `curso_temas`
--

CREATE TABLE `curso_temas` (
  `curso_id_curso` bigint(20) NOT NULL,
  `temas_id_tema` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `curso_temas`
--

INSERT INTO `curso_temas` (`curso_id_curso`, `temas_id_tema`) VALUES
(1, 1),
(1, 2),
(1, 3),
(3, 52),
(3, 53),
(52, 102),
(102, 152),
(102, 153);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tema`
--

CREATE TABLE `tema` (
  `id_tema` bigint(20) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `tema`
--

INSERT INTO `tema` (`id_tema`, `descripcion`, `nombre`) VALUES
(1, 'Las estructuras condicionales permiten que un programa tome decisiones basadas en condiciones específicas.', 'Estructuras de control'),
(2, 'La Programación Orientada a Objetos (POO) en Java es un paradigma de programación que se basa en la idea de que el mundo real puede ser modelado como una colección de objetos que interactúan entre sí.', 'Introducción a la POO'),
(3, 'En Java, las collections (colecciones) se refieren a estructuras de datos que se utilizan para almacenar y organizar grupos de objetos.', 'Collections en Java'),
(52, 'Las excepciones en programación son eventos o condiciones inusuales que pueden ocurrir durante la ejecución de un programa y que pueden interrumpir su flujo normal.', 'Manejo de Excepciones.'),
(53, 'La programación funcional es un paradigma de programación que se centra en el uso de funciones matemáticas y evita cambiar el estado y los datos mutables.', 'Lambdas y Streams'),
(102, 'Los patrones de diseño son soluciones generales y reutilizables a problemas comunes que surgen al diseñar software.', 'Patrones de diseño Creacionales'),
(152, 'Patrón MVC (Modelo Vista Controlador).', 'Patron MVC'),
(153, 'La arquitectura multicapa en proyectos de Java Spring Boot se organiza en distintas capas que tienen responsabilidades específicas.', 'Arquitectura Multicapas');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tema_seq`
--

CREATE TABLE `tema_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `tema_seq`
--

INSERT INTO `tema_seq` (`next_val`) VALUES
(251);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `curso`
--
ALTER TABLE `curso`
  ADD PRIMARY KEY (`id_curso`);

--
-- Indices de la tabla `curso_temas`
--
ALTER TABLE `curso_temas`
  ADD UNIQUE KEY `UK_k51c3o37w83hf4snk3kx8q3t9` (`temas_id_tema`),
  ADD KEY `FK7nop9fete9wtlhets7ejolsjf` (`curso_id_curso`);

--
-- Indices de la tabla `tema`
--
ALTER TABLE `tema`
  ADD PRIMARY KEY (`id_tema`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `curso_temas`
--
ALTER TABLE `curso_temas`
  ADD CONSTRAINT `FK270cjx5ep29nah0gsmu1vtr5s` FOREIGN KEY (`temas_id_tema`) REFERENCES `tema` (`id_tema`),
  ADD CONSTRAINT `FK7nop9fete9wtlhets7ejolsjf` FOREIGN KEY (`curso_id_curso`) REFERENCES `curso` (`id_curso`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
