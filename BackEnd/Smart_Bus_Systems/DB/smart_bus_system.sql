-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 27, 2021 at 05:14 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `smart_bus_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `bus_info`
--

CREATE TABLE `bus_info` (
  `tb_id` int(11) NOT NULL COMMENT 'to identify uniquely each bus  ',
  `bus_name` varchar(70) NOT NULL,
  `bus_no` varchar(70) NOT NULL,
  `bus_condtions` enum('Ac','Non-Ac') NOT NULL,
  `bus_contact_number` int(10) NOT NULL,
  `bus_avb_seats` varchar(70) NOT NULL,
  `bus_img_path` text NOT NULL,
  `isCompleteRoute` enum('Complete','Not-Complete') NOT NULL,
  `route_id` int(70) NOT NULL,
  `time_id` int(70) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bus_info`
--

INSERT INTO `bus_info` (`tb_id`, `bus_name`, `bus_no`, `bus_condtions`, `bus_contact_number`, `bus_avb_seats`, `bus_img_path`, `isCompleteRoute`, `route_id`, `time_id`) VALUES
(1, 'abc', 'ewdsa', 'Ac', 12312312, '10', '', 'Complete', 1, 1),
(2, 'asd', 'asdasw42', 'Non-Ac', 342342312, '', '', 'Not-Complete', 1, 2),
(3, 'ghjghj', '2342', 'Ac', 452, '', '', 'Not-Complete', 1, 3),
(4, 'sdgs', 'sfds', 'Ac', 12312312, '', '', 'Not-Complete', 1, 4),
(5, 'gcvbc', '54', 'Non-Ac', 12312312, '', '', 'Not-Complete', 1, 5),
(6, 'dfsdf', '43535', 'Non-Ac', 12312312, '', '', 'Not-Complete', 1, 6),
(7, 'bxvb', '3463xx', 'Non-Ac', 12312312, '', '', 'Not-Complete', 1, 7),
(8, 'xcvxcv', '34534ss', 'Ac', 12312312, '', '', 'Not-Complete', 1, 1),
(9, 'cxvxcv', '546xcv', 'Ac', 12312312, '', '', 'Not-Complete', 1, 2),
(10, 'bn,mbnm', '45645 ', 'Non-Ac', 12312312, '', '', 'Not-Complete', 1, 3),
(11, 'vcbcv', '546456', 'Non-Ac', 12312312, '', '', 'Not-Complete', 1, 4),
(12, 'sdfsdf', 'sdfsd', 'Non-Ac', 12312312, '', '', 'Not-Complete', 1, 5);

-- --------------------------------------------------------

--
-- Table structure for table `route_info`
--

CREATE TABLE `route_info` (
  `route_id` int(11) NOT NULL,
  `start_point` varchar(70) NOT NULL,
  `end_point` varchar(70) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `route_info`
--

INSERT INTO `route_info` (`route_id`, `start_point`, `end_point`) VALUES
(1, 'Kaduwela', 'Malabe');

-- --------------------------------------------------------

--
-- Table structure for table `time_table`
--

CREATE TABLE `time_table` (
  `time_id` int(11) NOT NULL,
  `start_time` varchar(70) NOT NULL,
  `end_time` varchar(70) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `time_table`
--

INSERT INTO `time_table` (`time_id`, `start_time`, `end_time`) VALUES
(1, '10:00', '10:30'),
(2, '11:00', '11:30'),
(3, '12:00', '12:30'),
(4, '12:30', '1:00'),
(5, '1:00', '1:30'),
(6, '1:30', '2:00'),
(7, '2:00', '2:30');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bus_info`
--
ALTER TABLE `bus_info`
  ADD PRIMARY KEY (`tb_id`);

--
-- Indexes for table `route_info`
--
ALTER TABLE `route_info`
  ADD PRIMARY KEY (`route_id`);

--
-- Indexes for table `time_table`
--
ALTER TABLE `time_table`
  ADD PRIMARY KEY (`time_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bus_info`
--
ALTER TABLE `bus_info`
  MODIFY `tb_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'to identify uniquely each bus  ', AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `route_info`
--
ALTER TABLE `route_info`
  MODIFY `route_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `time_table`
--
ALTER TABLE `time_table`
  MODIFY `time_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;