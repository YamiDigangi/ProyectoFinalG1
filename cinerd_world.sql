-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 07-11-2022 a las 18:45:11
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `cinerd_world`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `butaca`
--

CREATE TABLE `butaca` (
  `idButaca` int(11) NOT NULL,
  `idSala` int(11) NOT NULL,
  `fila` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_estonian_ci NOT NULL,
  `columna` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `butaca`
--

INSERT INTO `butaca` (`idButaca`, `idSala`, `fila`, `columna`) VALUES
(1, 1, 'A', 1),
(2, 1, 'A', 2),
(3, 1, 'A', 3),
(4, 1, 'A', 4),
(5, 1, 'B', 1),
(6, 1, 'B', 2),
(7, 1, 'B', 3),
(8, 1, 'B', 4),
(9, 1, 'C', 1),
(10, 1, 'C', 2),
(11, 1, 'C', 3),
(12, 1, 'C', 4),
(13, 2, 'A', 1),
(14, 2, 'A', 2),
(15, 2, 'A', 3),
(16, 2, 'A', 4),
(17, 2, 'B', 1),
(18, 2, 'B', 2),
(19, 2, 'B', 3),
(20, 2, 'B', 4),
(21, 2, 'C', 1),
(22, 2, 'C', 2),
(23, 2, 'C', 3),
(24, 2, 'C', 4),
(25, 3, 'A', 1),
(26, 3, 'A', 2),
(27, 3, 'A', 3),
(28, 3, 'A', 4),
(29, 3, 'B', 1),
(30, 3, 'B', 2),
(31, 3, 'B', 3),
(32, 3, 'B', 4),
(33, 3, 'C', 1),
(34, 3, 'C', 2),
(35, 3, 'C', 3),
(36, 3, 'C', 4),
(37, 4, 'A', 1),
(38, 4, 'A', 2),
(39, 4, 'A', 3),
(40, 4, 'A', 4),
(41, 4, 'B', 1),
(42, 4, 'B', 2),
(43, 4, 'B', 3),
(44, 4, 'B', 4),
(45, 4, 'C', 1),
(46, 4, 'C', 2),
(47, 4, 'C', 3),
(48, 4, 'C', 4),
(49, 5, 'A', 1),
(50, 5, 'A', 2),
(51, 5, 'A', 3),
(52, 5, 'A', 4),
(53, 5, 'B', 1),
(54, 5, 'B', 2),
(55, 5, 'B', 3),
(56, 5, 'B', 4),
(57, 5, 'C', 1),
(58, 5, 'C', 2),
(59, 5, 'C', 3),
(60, 5, 'C', 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `idCliente` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `nombre` varchar(25) NOT NULL,
  `apellido` varchar(25) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`idCliente`, `dni`, `nombre`, `apellido`, `estado`) VALUES
(1, 33089673, 'Javier', 'Torres', 1),
(2, 33029917, 'Santiago', 'Farioli', 1),
(3, 39105927, 'Yamila Belen', 'Di Gangi', 1),
(4, 26455484, 'Nico', 'Perez', 1),
(5, 36548952, 'Roberto', 'Gimenez', 1),
(6, 40767217, 'Eduardo', 'Cinnaghi', 1),
(7, 35689451, 'Juan', 'Paez', 0),
(8, 30587412, 'Pablo', 'Rodriguez', 1),
(9, 39587412, 'Macarena', 'Palacio', 1),
(10, 42220518, 'David', 'Arce', 1),
(11, 29587461, 'Gabriela', 'Balbuena', 1),
(12, 31548975, 'Marianela', 'Quirga', 1),
(13, 20258745, 'Joaquina', 'Luna', 1),
(14, 21547985, 'Debora', 'Puglisi', 1),
(15, 34996255, 'Rocio', 'Olguin', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pelicula`
--

CREATE TABLE `pelicula` (
  `idPelicula` int(11) NOT NULL,
  `nombrePeli` varchar(50) NOT NULL,
  `estadoPeli` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pelicula`
--

INSERT INTO `pelicula` (`idPelicula`, `nombrePeli`, `estadoPeli`) VALUES
(1, 'Volver al Futuro', 1),
(2, 'Coco', 1),
(3, 'Hombre en Llamas', 1),
(4, 'Thor', 1),
(5, 'Una noche en el museo', 1),
(6, 'La ultima gran estafa', 1),
(7, 'Batman', 1),
(8, 'Piratas del Caribe', 1),
(9, 'Harry Potter', 1),
(10, 'Diario de una pasion', 1),
(11, 'El conjuro', 1),
(12, 'Annabelle', 1),
(13, 'Son como niños', 1),
(14, 'Rey Leon', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proyeccion`
--

CREATE TABLE `proyeccion` (
  `idProyeccion` int(11) NOT NULL,
  `idSala` int(11) NOT NULL,
  `idPelicula` int(11) NOT NULL,
  `inicioPro` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `finPro` timestamp NOT NULL DEFAULT current_timestamp(),
  `estadoPro` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `proyeccion`
--

INSERT INTO `proyeccion` (`idProyeccion`, `idSala`, `idPelicula`, `inicioPro`, `finPro`, `estadoPro`) VALUES
(1, 1, 8, '2022-11-04 19:30:00', '2022-11-04 22:08:00', 1),
(2, 1, 8, '2022-11-04 22:20:00', '2022-11-05 00:58:00', 1),
(3, 2, 8, '2022-11-04 23:10:00', '2022-11-05 01:48:00', 1),
(4, 1, 8, '2022-11-05 19:30:00', '2022-11-05 22:08:00', 1),
(5, 1, 8, '2022-11-05 22:20:00', '2022-11-06 00:58:00', 1),
(6, 2, 8, '2022-11-05 23:10:00', '2022-11-06 01:48:00', 1),
(7, 1, 8, '2022-11-06 19:30:00', '2022-11-06 22:08:00', 1),
(8, 1, 8, '2022-11-06 22:20:00', '2022-11-07 00:58:00', 1),
(9, 1, 8, '2022-11-07 19:30:00', '2022-11-07 22:08:00', 1),
(10, 2, 8, '2022-11-06 23:10:00', '2022-11-07 01:48:00', 1),
(11, 1, 8, '2022-11-07 22:20:00', '2022-11-08 00:58:00', 1),
(12, 2, 8, '2022-11-07 23:10:00', '2022-11-08 01:48:00', 1),
(13, 1, 8, '2022-11-08 19:30:00', '2022-11-08 22:08:00', 1),
(14, 1, 8, '2022-11-08 22:20:00', '2022-11-09 00:58:00', 1),
(15, 2, 8, '2022-11-08 23:10:00', '2022-11-09 01:48:00', 1),
(16, 1, 8, '2022-11-09 19:30:00', '2022-11-09 22:08:00', 1),
(17, 1, 8, '2022-11-09 22:20:00', '2022-11-10 00:58:00', 1),
(18, 2, 8, '2022-11-09 23:10:00', '2022-11-10 01:48:00', 1),
(19, 1, 8, '2022-11-10 19:30:00', '2022-11-10 22:08:00', 1),
(20, 1, 8, '2022-11-10 22:20:00', '2022-11-11 00:58:00', 1),
(21, 2, 8, '2022-11-10 23:10:00', '2022-11-11 01:48:00', 1),
(22, 1, 8, '2022-11-11 19:30:00', '2022-11-11 22:08:00', 1),
(23, 2, 8, '2022-11-11 23:10:00', '2022-11-12 01:48:00', 1),
(24, 2, 2, '2022-11-06 20:10:00', '2022-11-06 21:45:00', 1),
(25, 3, 2, '2022-11-06 22:30:00', '2022-11-07 00:05:00', 1),
(26, 2, 2, '2022-11-07 20:10:00', '2022-11-07 21:45:00', 1),
(27, 3, 2, '2022-11-07 22:30:00', '2022-11-08 00:05:00', 1),
(28, 2, 2, '2022-11-08 20:10:00', '2022-11-08 21:45:00', 1),
(29, 3, 2, '2022-11-08 22:30:00', '2022-11-09 00:05:00', 1),
(30, 2, 2, '2022-11-09 20:10:00', '2022-11-09 21:45:00', 1),
(31, 3, 2, '2022-11-09 22:30:00', '2022-11-10 00:05:00', 1),
(32, 2, 2, '2022-11-10 20:10:00', '2022-11-10 21:45:00', 1),
(33, 2, 2, '2022-11-12 20:10:00', '2022-11-12 21:45:00', 1),
(34, 2, 2, '2022-11-11 20:10:00', '2022-11-11 21:45:00', 1),
(35, 3, 2, '2022-11-10 22:30:00', '2022-11-11 00:05:00', 1),
(36, 3, 2, '2022-11-11 22:30:00', '2022-11-12 00:05:00', 1),
(37, 3, 2, '2022-11-12 22:30:00', '2022-11-13 00:05:00', 1),
(38, 1, 4, '2022-11-07 01:30:00', '2022-11-07 03:55:00', 1),
(39, 1, 4, '2022-11-08 01:30:00', '2022-11-08 03:55:00', 1),
(40, 1, 4, '2022-11-09 01:30:00', '2022-11-09 03:55:00', 1),
(41, 1, 4, '2022-11-10 01:30:00', '2022-11-10 03:55:00', 1),
(42, 1, 4, '2022-11-11 01:30:00', '2022-11-11 03:55:00', 1),
(43, 1, 4, '2022-11-12 01:30:00', '2022-11-12 03:55:00', 1),
(44, 1, 4, '2022-11-13 01:30:00', '2022-11-13 03:55:00', 1),
(45, 3, 13, '2022-11-06 20:10:00', '2022-11-06 22:07:00', 1),
(46, 3, 13, '2022-11-07 20:10:00', '2022-11-07 22:07:00', 1),
(47, 3, 13, '2022-11-08 20:10:00', '2022-11-08 22:07:00', 1),
(48, 3, 13, '2022-11-09 20:10:00', '2022-11-09 22:07:00', 1),
(49, 3, 13, '2022-11-10 20:10:00', '2022-11-10 22:07:00', 1),
(50, 3, 13, '2022-11-11 20:10:00', '2022-11-11 22:07:00', 1),
(51, 3, 13, '2022-11-12 20:10:00', '2022-11-12 22:07:00', 1),
(52, 3, 14, '2022-11-06 23:10:00', '2022-11-07 00:55:00', 1),
(53, 3, 14, '2022-11-07 23:10:00', '2022-11-08 00:55:00', 1),
(54, 3, 14, '2022-11-08 23:10:00', '2022-11-09 00:55:00', 1),
(55, 3, 14, '2022-11-09 23:10:00', '2022-11-10 00:55:00', 1),
(56, 3, 14, '2022-11-10 23:10:00', '2022-11-11 00:55:00', 1),
(57, 3, 14, '2022-11-11 23:10:00', '2022-11-12 00:55:00', 1),
(58, 3, 14, '2022-11-12 23:10:00', '2022-11-13 00:55:00', 1),
(59, 4, 14, '2022-11-06 20:30:00', '2022-11-06 22:15:00', 1),
(60, 4, 14, '2022-11-07 20:30:00', '2022-11-07 22:15:00', 1),
(61, 4, 14, '2022-11-08 20:30:00', '2022-11-08 22:15:00', 1),
(62, 4, 14, '2022-11-09 20:30:00', '2022-11-09 22:15:00', 1),
(63, 4, 14, '2022-11-10 20:30:00', '2022-11-10 22:15:00', 1),
(64, 4, 14, '2022-11-11 20:30:00', '2022-11-11 22:15:00', 1),
(65, 4, 4, '2022-11-06 22:50:00', '2022-11-07 01:15:00', 1),
(66, 4, 4, '2022-11-07 22:50:00', '2022-11-08 01:15:00', 1),
(67, 4, 4, '2022-11-08 22:50:00', '2022-11-09 01:15:00', 1),
(68, 4, 4, '2022-11-09 22:50:00', '2022-11-10 01:15:00', 1),
(69, 4, 4, '2022-11-10 22:50:00', '2022-11-11 01:15:00', 1),
(70, 4, 4, '2022-11-11 22:50:00', '2022-11-12 01:15:00', 1),
(71, 4, 11, '2022-11-07 02:00:00', '2022-11-07 04:17:00', 1),
(72, 4, 11, '2022-11-08 02:00:00', '2022-11-08 04:17:00', 1),
(73, 4, 11, '2022-11-09 02:00:00', '2022-11-09 04:17:00', 1),
(74, 4, 11, '2022-11-10 02:00:00', '2022-11-10 04:17:00', 1),
(75, 4, 11, '2022-11-11 02:00:00', '2022-11-11 04:17:00', 1),
(76, 4, 11, '2022-11-12 02:00:00', '2022-11-12 04:17:00', 1),
(77, 5, 9, '2022-11-06 19:00:00', '2022-11-06 21:52:00', 1),
(78, 5, 9, '2022-11-07 19:00:00', '2022-11-07 21:52:00', 1),
(79, 5, 9, '2022-11-08 19:00:00', '2022-11-08 21:52:00', 1),
(80, 5, 9, '2022-11-09 19:00:00', '2022-11-09 21:52:00', 1),
(81, 5, 9, '2022-11-10 19:00:00', '2022-11-10 21:52:00', 1),
(82, 5, 9, '2022-11-11 19:00:00', '2022-11-11 21:52:00', 1),
(83, 5, 10, '2022-11-06 22:30:00', '2022-11-07 00:49:00', 1),
(84, 5, 10, '2022-11-07 22:30:00', '2022-11-08 00:49:00', 1),
(85, 5, 10, '2022-11-08 22:30:00', '2022-11-09 00:49:00', 1),
(86, 5, 10, '2022-11-09 22:30:00', '2022-11-10 00:49:00', 1),
(87, 5, 10, '2022-11-10 22:30:00', '2022-11-11 00:49:00', 1),
(88, 5, 10, '2022-11-11 22:30:00', '2022-11-12 00:49:00', 1),
(89, 5, 12, '2022-11-07 02:00:00', '2022-11-07 03:54:00', 1),
(90, 5, 12, '2022-11-08 02:00:00', '2022-11-08 03:54:00', 1),
(91, 5, 12, '2022-11-09 02:00:00', '2022-11-09 03:54:00', 1),
(92, 5, 12, '2022-11-10 02:00:00', '2022-11-10 03:54:00', 1),
(93, 5, 12, '2022-11-11 02:00:00', '2022-11-11 03:54:00', 1),
(94, 5, 12, '2022-11-12 02:00:00', '2022-11-12 03:54:00', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sala`
--

CREATE TABLE `sala` (
  `idSala` int(11) NOT NULL,
  `ubicacion` varchar(35) NOT NULL,
  `localidad` varchar(50) NOT NULL,
  `estadoSala` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `sala`
--

INSERT INTO `sala` (`idSala`, `ubicacion`, `localidad`, `estadoSala`) VALUES
(1, 'Sala 1', 'San Luis', 1),
(2, 'Sala 2', 'San Luis', 1),
(3, 'Sala 4', 'San Luis', 1),
(4, 'Sala 4', 'San Luis', 1),
(5, 'Sala 5', 'San Luis', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ticket`
--

CREATE TABLE `ticket` (
  `idTicket` int(11) NOT NULL,
  `idCliente` int(11) NOT NULL,
  `idProyeccion` int(11) NOT NULL,
  `idButaca` int(11) NOT NULL,
  `fechaCompra` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `monto` double NOT NULL,
  `formaPago` varchar(50) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `ticket`
--

INSERT INTO `ticket` (`idTicket`, `idCliente`, `idProyeccion`, `idButaca`, `fechaCompra`, `monto`, `formaPago`, `estado`) VALUES
(1, 3, 15, 1, '2022-11-07 17:40:04', 500, 'Efectivo', 1),
(2, 1, 15, 2, '2022-11-07 17:40:04', 500, 'Efectivo', 1),
(3, 2, 15, 3, '2022-11-07 17:40:04', 500, 'Efectivo', 1),
(4, 15, 15, 4, '2022-11-07 17:40:04', 500, 'Efectivo', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `butaca`
--
ALTER TABLE `butaca`
  ADD PRIMARY KEY (`idButaca`),
  ADD KEY `idSala` (`idSala`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idCliente`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `pelicula`
--
ALTER TABLE `pelicula`
  ADD PRIMARY KEY (`idPelicula`);

--
-- Indices de la tabla `proyeccion`
--
ALTER TABLE `proyeccion`
  ADD PRIMARY KEY (`idProyeccion`),
  ADD KEY `idPelicula` (`idPelicula`),
  ADD KEY `idSala` (`idSala`);

--
-- Indices de la tabla `sala`
--
ALTER TABLE `sala`
  ADD PRIMARY KEY (`idSala`);

--
-- Indices de la tabla `ticket`
--
ALTER TABLE `ticket`
  ADD PRIMARY KEY (`idTicket`),
  ADD KEY `idProyeccion` (`idProyeccion`),
  ADD KEY `idCliente` (`idCliente`),
  ADD KEY `idButaca` (`idButaca`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `butaca`
--
ALTER TABLE `butaca`
  MODIFY `idButaca` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=62;

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT de la tabla `pelicula`
--
ALTER TABLE `pelicula`
  MODIFY `idPelicula` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de la tabla `proyeccion`
--
ALTER TABLE `proyeccion`
  MODIFY `idProyeccion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=95;

--
-- AUTO_INCREMENT de la tabla `sala`
--
ALTER TABLE `sala`
  MODIFY `idSala` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `ticket`
--
ALTER TABLE `ticket`
  MODIFY `idTicket` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `butaca`
--
ALTER TABLE `butaca`
  ADD CONSTRAINT `butaca_ibfk_1` FOREIGN KEY (`idSala`) REFERENCES `sala` (`idSala`);

--
-- Filtros para la tabla `proyeccion`
--
ALTER TABLE `proyeccion`
  ADD CONSTRAINT `proyeccion_ibfk_1` FOREIGN KEY (`idPelicula`) REFERENCES `pelicula` (`idPelicula`),
  ADD CONSTRAINT `proyeccion_ibfk_2` FOREIGN KEY (`idSala`) REFERENCES `sala` (`idSala`);

--
-- Filtros para la tabla `ticket`
--
ALTER TABLE `ticket`
  ADD CONSTRAINT `ticket_ibfk_1` FOREIGN KEY (`idProyeccion`) REFERENCES `proyeccion` (`idProyeccion`),
  ADD CONSTRAINT `ticket_ibfk_2` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`),
  ADD CONSTRAINT `ticket_ibfk_3` FOREIGN KEY (`idButaca`) REFERENCES `butaca` (`idButaca`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
