-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 14, 2024 at 05:04 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `voters_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `admin_id` int(11) NOT NULL,
  `fname` varchar(100) NOT NULL,
  `mname` varchar(100) NOT NULL,
  `lname` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `uname` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`admin_id`, `fname`, `mname`, `lname`, `email`, `uname`, `password`) VALUES
(1, 'John', 'Smith', 'Doe', 'doe@yahoo.com', 'admin', '1234'),
(2, 'ssad', 'ssad', 'ssad', 'ssad@yahoo.com', 'ssad', 'ssad'),
(3, 'Joe', 'Smith', 'Doe', 'doe@yahoo.com', 'admin.doe', 'qwerty');

-- --------------------------------------------------------

--
-- Table structure for table `blocklist`
--

CREATE TABLE `blocklist` (
  `id` int(11) NOT NULL,
  `uname` varchar(100) NOT NULL,
  `role` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `blocklist`
--

INSERT INTO `blocklist` (`id`, `uname`, `role`) VALUES
(13, 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `register`
--

CREATE TABLE `register` (
  `voter_id` int(11) NOT NULL,
  `lname` varchar(100) NOT NULL,
  `mname` varchar(100) NOT NULL,
  `fname` varchar(100) NOT NULL,
  `age` varchar(100) NOT NULL,
  `sex` varchar(100) NOT NULL,
  `bday` varchar(100) NOT NULL,
  `birth_place` varchar(100) NOT NULL,
  `address` varchar(100) NOT NULL,
  `contact` varchar(100) NOT NULL,
  `occupation` varchar(100) NOT NULL,
  `civil_status` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `register`
--

INSERT INTO `register` (`voter_id`, `lname`, `mname`, `fname`, `age`, `sex`, `bday`, `birth_place`, `address`, `contact`, `occupation`, `civil_status`, `username`, `password`) VALUES
(5126, 'Santos', 'Garcia', 'Sofia', '23', 'Female', '03/06/2001', 'Nueva Ecija', 'Pampanga', '09233566478', 'Student', 'Single', 'sofia', 'asdf'),
(5127, 'Santos', 'Doe', 'Lian', '23', 'Female', '06/05/2000', 'Pasay', 'Loag', '09223154678', 'Student', 'Single', 'lian', 'lian@05'),
(5128, 'Reyes', 'Santos', 'Maria', '35', 'Female', '03/15/1989', 'Manila', 'Makati', '09123456789', 'Teacher', 'Single', 'maria.reyes', 'abc123'),
(5129, 'Cruz', 'Dela', 'Juan', '45', 'Male', '01/10/1979', ' Quezon ', 'Quezon', '09123456789', 'Engineer', 'Married', 'juan.cruz', 'qwerty'),
(5130, 'Garcia', 'Santos', 'Pedro', '28', 'Male', '05/20/1996', 'Cebu City', 'Cebu City', '0987456123', 'Accountant', 'Single', 'pedro.garcia', '123456'),
(5133, 'Smith', 'Sy', 'Johnny', '30', 'Male', '12/03/1995', 'Cebu', 'Bulacan', '0987654321', 'Teacher', 'Single', 'smith_johny', '1234'),
(5134, 'Reyes', 'Lee', 'Sonya', '30', 'Female', '11/25/1995', 'Makati', 'Cebu', '0987654321', 'Accountant', 'Married', 'sonya.reyes', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `voter_blocklist`
--

CREATE TABLE `voter_blocklist` (
  `id` int(11) NOT NULL,
  `uname` varchar(100) NOT NULL,
  `role` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `voter_blocklist`
--

INSERT INTO `voter_blocklist` (`id`, `uname`, `role`) VALUES
(3, 'lian', 'voter');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`admin_id`);

--
-- Indexes for table `blocklist`
--
ALTER TABLE `blocklist`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `register`
--
ALTER TABLE `register`
  ADD PRIMARY KEY (`voter_id`);

--
-- Indexes for table `voter_blocklist`
--
ALTER TABLE `voter_blocklist`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `admin_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `blocklist`
--
ALTER TABLE `blocklist`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `register`
--
ALTER TABLE `register`
  MODIFY `voter_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5135;

--
-- AUTO_INCREMENT for table `voter_blocklist`
--
ALTER TABLE `voter_blocklist`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
