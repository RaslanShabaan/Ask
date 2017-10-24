-- phpMyAdmin SQL Dump
-- version 3.2.0.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Oct 24, 2017 at 01:11 PM
-- Server version: 5.1.36
-- PHP Version: 5.3.0

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `asked`
--

-- --------------------------------------------------------

--
-- Table structure for table `answer`
--

CREATE TABLE IF NOT EXISTS `answer` (
  `AnswerId` int(11) NOT NULL AUTO_INCREMENT,
  `Answer` varchar(255) DEFAULT NULL,
  `QId` int(11) NOT NULL,
  `Question` varchar(255) DEFAULT NULL,
  `User` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`AnswerId`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `answer`
--

INSERT INTO `answer` (`AnswerId`, `Answer`, `QId`, `Question`, `User`) VALUES
(1, 'raslan', 1, 'what is your name?', 'e');

-- --------------------------------------------------------

--
-- Table structure for table `authorities`
--

CREATE TABLE IF NOT EXISTS `authorities` (
  `username` varchar(255) NOT NULL,
  `authority` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `authorities`
--

INSERT INTO `authorities` (`username`, `authority`) VALUES
('r', 'ROLE_USER'),
('e', 'ROLE_USER');

-- --------------------------------------------------------

--
-- Table structure for table `question`
--

CREATE TABLE IF NOT EXISTS `question` (
  `QId` int(11) NOT NULL AUTO_INCREMENT,
  `Question` varchar(255) DEFAULT NULL,
  `User` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`QId`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `question`
--

INSERT INTO `question` (`QId`, `Question`, `User`) VALUES
(1, 'what is your name?', 'r'),
(2, 'Egypt capital ?', 'e'),
(3, 'Your Age ?', 'r'),
(4, 'hi', 'r');

-- --------------------------------------------------------

--
-- Table structure for table `register`
--

CREATE TABLE IF NOT EXISTS `register` (
  `UserMail` varchar(255) NOT NULL,
  `UserName` varchar(255) DEFAULT NULL,
  `UserPassWord` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`UserMail`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `register`
--


-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `username` varchar(255) NOT NULL,
  `V_Code` varchar(255) DEFAULT NULL,
  `enabled` int(11) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`username`, `V_Code`, `enabled`, `password`) VALUES
('r', '000', 1, 'c4ca4238a0b923820dcc509a6f75849b'),
('e', '111', 1, 'c4ca4238a0b923820dcc509a6f75849b');
