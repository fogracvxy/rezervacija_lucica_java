-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 13, 2020 at 02:03 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rezervacijalucica`
--

-- --------------------------------------------------------

--
-- Table structure for table `recepcioner`
--

CREATE TABLE `recepcioner` (
  `idRecepcionera` int(11) NOT NULL,
  `imeRecepcionera` varchar(255) DEFAULT NULL,
  `prezimeRecepcionera` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `recepcioneradmin`
--

CREATE TABLE `recepcioneradmin` (
  `recepcionerID` int(11) NOT NULL,
  `recepcionerUserName` varchar(255) NOT NULL,
  `recepcionerPassword` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `recepcioneradmin`
--

INSERT INTO `recepcioneradmin` (`recepcionerID`, `recepcionerUserName`, `recepcionerPassword`) VALUES
(1, 'mspudic', '11');

-- --------------------------------------------------------

--
-- Table structure for table `rezervacija`
--

CREATE TABLE `rezervacija` (
  `rezervacijaID` int(11) NOT NULL,
  `imeRecepcionera` varchar(255) DEFAULT NULL,
  `idSmjestaja` varchar(255) DEFAULT NULL,
  `brojZauzetihMjesta` varchar(255) DEFAULT NULL,
  `imeTurista` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `rezervacija`
--

INSERT INTO `rezervacija` (`rezervacijaID`, `imeRecepcionera`, `idSmjestaja`, `brojZauzetihMjesta`, `imeTurista`) VALUES
(1, 'Marin Spudic', '10', '5', 'Marin'),
(2, 'Marin Spudic', '10', '5', 'Marijana'),
(3, 'Marin Spudic', '8', '10', 'Ivanka'),
(4, 'Marin Spudic', '7', '15', 'Spuda'),
(5, 'Marin Spudic', '7', '10', 'Test'),
(6, 'Marin Spudic', '79', '5', 'Testiranje'),
(7, 'Marin Spudic', '79', '10', 'Marti'),
(8, 'Marin Spudic', '36', '10', 'Ana'),
(9, 'Marin Spudic', '14', '5', '+imeTurista+'),
(10, 'Marin Spudic', '8', '5', 'Marin'),
(11, 'Marin Spudic', '7', '3', 'Marin');

-- --------------------------------------------------------

--
-- Table structure for table `smjestaj`
--

CREATE TABLE `smjestaj` (
  `idSmjestaja` int(11) NOT NULL,
  `imeSmjestaja` varchar(255) DEFAULT NULL,
  `datumSmjestaja` date DEFAULT NULL,
  `ukupniKapacitet` int(11) DEFAULT NULL,
  `slobodniKapacitet` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `smjestaj`
--

INSERT INTO `smjestaj` (`idSmjestaja`, `imeSmjestaja`, `datumSmjestaja`, `ukupniKapacitet`, `slobodniKapacitet`) VALUES
(1, 'kamp', '2020-06-01', 50, 50),
(2, 'Kamp', '2021-06-01', 50, 50),
(3, 'Kamp', '2021-06-02', 50, 50),
(4, 'Kamp', '2021-06-03', 50, 50),
(5, 'Kamp', '2021-06-04', 50, 50),
(6, 'Kamp', '2021-06-05', 50, 50),
(7, 'Kamp', '2021-06-06', 50, 22),
(8, 'Kamp', '2021-06-07', 50, 35),
(9, 'Kamp', '2021-06-08', 50, 50),
(10, 'Kamp', '2021-06-09', 50, 40),
(11, 'Kamp', '2021-06-10', 50, 50),
(12, 'Kamp', '2021-06-11', 50, 50),
(13, 'Kamp', '2021-06-12', 50, 50),
(14, 'Kamp', '2021-06-13', 50, 45),
(15, 'Kamp', '2021-06-14', 50, 50),
(16, 'Kamp', '2021-06-15', 50, 50),
(17, 'Kamp', '2021-06-16', 50, 50),
(18, 'Kamp', '2021-06-17', 50, 50),
(19, 'Kamp', '2021-06-18', 50, 50),
(20, 'Kamp', '2021-06-19', 50, 50),
(21, 'Kamp', '2021-06-20', 50, 50),
(22, 'Kamp', '2021-06-21', 50, 50),
(23, 'Kamp', '2021-06-22', 50, 50),
(24, 'Kamp', '2021-06-23', 50, 50),
(25, 'Kamp', '2021-06-24', 50, 50),
(26, 'Kamp', '2021-06-25', 50, 50),
(27, 'Kamp', '2021-06-26', 50, 50),
(28, 'Kamp', '2021-06-27', 50, 50),
(29, 'Kamp', '2021-06-28', 50, 50),
(30, 'Kamp', '2021-06-29', 50, 50),
(31, 'Kamp', '2021-06-30', 50, 50),
(32, 'Kamp', '2021-07-01', 50, 50),
(33, 'Kamp', '2021-07-02', 50, 50),
(34, 'Kamp', '2021-07-03', 50, 50),
(35, 'Kamp', '2021-07-04', 50, 50),
(36, 'Kamp', '2021-07-05', 50, 40),
(37, 'Kamp', '2021-07-06', 50, 50),
(38, 'Kamp', '2021-07-07', 50, 50),
(39, 'Kamp', '2021-07-08', 50, 50),
(40, 'Kamp', '2021-07-09', 50, 50),
(41, 'Kamp', '2021-07-10', 50, 50),
(42, 'Kamp', '2021-07-11', 50, 50),
(43, 'Kamp', '2021-07-12', 50, 50),
(44, 'Kamp', '2021-07-13', 50, 50),
(45, 'Kamp', '2021-07-14', 50, 50),
(46, 'Kamp', '2021-07-15', 50, 50),
(47, 'Kamp', '2021-07-16', 50, 50),
(48, 'Kamp', '2021-07-17', 50, 50),
(49, 'Kamp', '2021-07-18', 50, 50),
(50, 'Kamp', '2021-07-19', 50, 50),
(51, 'Kamp', '2021-07-20', 50, 50),
(52, 'Kamp', '2021-07-21', 50, 50),
(53, 'Kamp', '2021-07-22', 50, 50),
(54, 'Kamp', '2021-07-23', 50, 50),
(55, 'Kamp', '2021-07-24', 50, 50),
(56, 'Kamp', '2021-07-25', 50, 50),
(57, 'Kamp', '2021-07-26', 50, 50),
(58, 'Kamp', '2021-07-27', 50, 50),
(59, 'Kamp', '2021-07-28', 50, 50),
(60, 'Kamp', '2021-07-29', 50, 50),
(61, 'Kamp', '2021-07-30', 50, 50),
(62, 'Kamp', '2021-07-31', 50, 50),
(63, 'Kamp', '2021-08-01', 50, 50),
(64, 'Kamp', '2021-08-02', 50, 50),
(65, 'Kamp', '2021-08-03', 50, 50),
(66, 'Kamp', '2021-08-04', 50, 50),
(67, 'Kamp', '2021-08-05', 50, 50),
(68, 'Kamp', '2021-08-06', 50, 50),
(69, 'Kamp', '2021-08-07', 50, 50),
(70, 'Kamp', '2021-08-08', 50, 50),
(71, 'Kamp', '2021-08-09', 50, 50),
(72, 'Kamp', '2021-08-10', 50, 50),
(73, 'Kamp', '2021-08-11', 50, 50),
(74, 'Kamp', '2021-08-12', 50, 50),
(75, 'Kamp', '2021-08-13', 50, 50),
(76, 'Kamp', '2021-08-14', 50, 50),
(77, 'Kamp', '2021-08-15', 50, 50),
(78, 'Kamp', '2021-08-16', 50, 50),
(79, 'Kamp', '2021-08-17', 50, 35),
(80, 'Kamp', '2021-08-18', 50, 50),
(81, 'Kamp', '2021-08-19', 50, 50),
(82, 'Kamp', '2021-08-20', 50, 50),
(83, 'Kamp', '2021-08-21', 50, 50),
(84, 'Kamp', '2021-08-22', 50, 50),
(85, 'Kamp', '2021-08-23', 50, 50),
(86, 'Kamp', '2021-08-24', 50, 50),
(87, 'Kamp', '2021-08-25', 50, 50),
(88, 'Kamp', '2021-08-26', 50, 50),
(89, 'Kamp', '2021-08-27', 50, 50),
(90, 'Kamp', '2021-08-28', 50, 50),
(91, 'Kamp', '2021-08-29', 50, 50),
(92, 'Kamp', '2021-08-30', 50, 50),
(93, 'Kamp', '2021-08-31', 50, 50),
(94, 'Kamp', '2021-09-01', 50, 50),
(95, 'Kamp', '2021-09-02', 50, 50),
(96, 'Kamp', '2021-09-03', 50, 50),
(97, 'Kamp', '2021-09-04', 50, 50),
(98, 'Kamp', '2021-09-05', 50, 50),
(99, 'Kamp', '2021-09-06', 50, 50),
(100, 'Kamp', '2021-09-07', 50, 50),
(101, 'Kamp', '2021-09-08', 50, 50),
(102, 'Kamp', '2021-09-09', 50, 50),
(103, 'Kamp', '2021-09-10', 50, 50),
(104, 'Kamp', '2021-09-11', 50, 50),
(105, 'Kamp', '2021-09-12', 50, 50),
(106, 'Kamp', '2021-09-13', 50, 50),
(107, 'Kamp', '2021-09-14', 50, 50),
(108, 'Kamp', '2021-09-15', 50, 50),
(109, 'Kamp', '2021-09-16', 50, 50),
(110, 'Kamp', '2021-09-17', 50, 50),
(111, 'Kamp', '2021-09-18', 50, 50),
(112, 'Kamp', '2021-09-19', 50, 50),
(113, 'Kamp', '2021-09-20', 50, 50),
(114, 'Kamp', '2021-09-21', 50, 50),
(115, 'Kamp', '2021-09-22', 50, 50),
(116, 'Kamp', '2021-09-23', 50, 50),
(117, 'Kamp', '2021-09-24', 50, 50),
(118, 'Kamp', '2021-09-25', 50, 50),
(119, 'Kamp', '2021-09-26', 50, 50),
(120, 'Kamp', '2021-09-27', 50, 50),
(121, 'Kamp', '2021-09-28', 50, 50),
(122, 'Kamp', '2021-09-29', 50, 50),
(123, 'Kamp', '2021-09-30', 50, 50);

-- --------------------------------------------------------

--
-- Table structure for table `turist`
--

CREATE TABLE `turist` (
  `idTurista` int(11) NOT NULL,
  `imeTurista` varchar(255) DEFAULT NULL,
  `prezimeTurista` varchar(255) DEFAULT NULL,
  `oibTurista` varchar(255) DEFAULT NULL,
  `mailTurista` varchar(255) DEFAULT NULL,
  `mobTurista` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `turist`
--

INSERT INTO `turist` (`idTurista`, `imeTurista`, `prezimeTurista`, `oibTurista`, `mailTurista`, `mobTurista`) VALUES
(1, '+imeTurista+', '+prezimeTurista+', '+oibTurista+', '+mailTurista+', '+mobTurista+'),
(2, 'test', 'tes', 'test', 'test', 'test'),
(3, 'testiranjspuda', 'tes', 'test', 'test', 'test'),
(4, 'test', 'teste', '32312', '3213213', '312321'),
(5, 'Marin', 'Spudić', '2324241', 'marn1002000@gmail.com', '2324212'),
(6, 'Marin', 'Spudic', '4242424242', 'marin@gmail.com', '324242'),
(7, 'Test', 'test', 'tessssss', 'test@veleri.hr', '23232323'),
(8, 'Testt', 'Novo', '232424242', 'mspudic@veleri.hr', '2323232');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `recepcioner`
--
ALTER TABLE `recepcioner`
  ADD PRIMARY KEY (`idRecepcionera`);

--
-- Indexes for table `recepcioneradmin`
--
ALTER TABLE `recepcioneradmin`
  ADD PRIMARY KEY (`recepcionerID`);

--
-- Indexes for table `rezervacija`
--
ALTER TABLE `rezervacija`
  ADD PRIMARY KEY (`rezervacijaID`);

--
-- Indexes for table `smjestaj`
--
ALTER TABLE `smjestaj`
  ADD PRIMARY KEY (`idSmjestaja`);

--
-- Indexes for table `turist`
--
ALTER TABLE `turist`
  ADD PRIMARY KEY (`idTurista`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `recepcioner`
--
ALTER TABLE `recepcioner`
  MODIFY `idRecepcionera` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `recepcioneradmin`
--
ALTER TABLE `recepcioneradmin`
  MODIFY `recepcionerID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `rezervacija`
--
ALTER TABLE `rezervacija`
  MODIFY `rezervacijaID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `smjestaj`
--
ALTER TABLE `smjestaj`
  MODIFY `idSmjestaja` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=124;

--
-- AUTO_INCREMENT for table `turist`
--
ALTER TABLE `turist`
  MODIFY `idTurista` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
