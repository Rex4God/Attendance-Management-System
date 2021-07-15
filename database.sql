-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 08, 2020 at 08:18 PM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 7.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `nccf management system`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `user_name` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `E_mail` varchar(100) NOT NULL,
  `Sec_Q` varchar(200) NOT NULL,
  `Answer` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `user_name`, `password`, `E_mail`, `Sec_Q`, `Answer`) VALUES
(0, '0', '0', '0', '0', '0'),
(0, '0', '0', '0', '0', '0');

-- --------------------------------------------------------

--
-- Table structure for table `attendance`
--

CREATE TABLE `attendance` (
  `id` int(11) NOT NULL,
  `serial_number` int(50) NOT NULL,
  `name` varchar(100) NOT NULL,
  `sex` varchar(50) NOT NULL,
  `batch` varchar(50) NOT NULL,
  `units` varchar(200) NOT NULL,
  `address` varchar(100) NOT NULL,
  `phone_number` varchar(100) NOT NULL,
  `Dob` varchar(20) NOT NULL,
  `attendance_status` varchar(100) NOT NULL,
  `date` varchar(20) NOT NULL,
  `time` varchar(20) NOT NULL,
  `days` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `attendance`
--

INSERT INTO `attendance` (`id`, `serial_number`, `name`, `sex`, `batch`, `units`, `address`, `phone_number`, `Dob`, `attendance_status`, `date`, `time`, `days`) VALUES
(0, 0, '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'),
(0, 0, '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'),
(0, 0, '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0');

-- --------------------------------------------------------

--
-- Table structure for table `membership`
--

CREATE TABLE `membership` (
  `id` int(100) NOT NULL,
  `name` varchar(200) NOT NULL,
  `sex` varchar(100) NOT NULL,
  `call_up_no` varchar(200) NOT NULL,
  `state_code` varchar(50) NOT NULL,
  `phone_no` varchar(200) NOT NULL,
  `e_mail` varchar(200) NOT NULL,
  `state_of_origin` varchar(200) NOT NULL,
  `lga` varchar(100) NOT NULL,
  `DOB` varchar(100) NOT NULL,
  `POB` varchar(50) NOT NULL,
  `perm_home_address` varchar(200) NOT NULL,
  `langaues_spoken` varchar(200) NOT NULL,
  `engagement_status` varchar(50) NOT NULL,
  `health_challenge` varchar(20) NOT NULL,
  `if_state_yes` varchar(500) NOT NULL,
  `name_kin` varchar(50) NOT NULL,
  `phone_kin_no` varchar(50) NOT NULL,
  `institutions_attended` varchar(100) NOT NULL,
  `course` varchar(50) NOT NULL,
  `date` varchar(50) NOT NULL,
  `name_secular_school` varchar(200) NOT NULL,
  `post_held` varchar(50) NOT NULL,
  `date_secular` varchar(50) NOT NULL,
  `born_again` varchar(100) NOT NULL,
  `if_yes_when` varchar(200) NOT NULL,
  `conversion_experience_yes` varchar(200) NOT NULL,
  `local_church_attended` varchar(100) NOT NULL,
  `fellowship` varchar(50) NOT NULL,
  `have_baptized` varchar(50) NOT NULL,
  `baptized_when` varchar(200) NOT NULL,
  `have_baptized_holy_spirit` varchar(200) NOT NULL,
  `walk_God_been` varchar(200) NOT NULL,
  `church_group` varchar(200) NOT NULL,
  `post_held_group` varchar(100) NOT NULL,
  `date_church_group` varchar(50) NOT NULL,
  `do_have_ministry_own` varchar(50) NOT NULL,
  `do_have_special_calling` varchar(50) NOT NULL,
  `if_yes_details` varchar(200) NOT NULL,
  `do_u_intend_serve_christian` varchar(50) NOT NULL,
  `if_yes_give_details` varchar(200) NOT NULL,
  `do_u_redeploy` varchar(50) NOT NULL,
  `if_yes_why` varchar(100) NOT NULL,
  `stay_family_house` varchar(100) NOT NULL,
  `willing_to_serve` varchar(200) NOT NULL,
  `name_leader` varchar(200) NOT NULL,
  `number_christian_leader` varchar(50) NOT NULL,
  `fellowship_church` varchar(100) NOT NULL,
  `unit_1` varchar(20) NOT NULL,
  `unit_2` varchar(20) NOT NULL,
  `unit_3` varchar(20) NOT NULL,
  `unit_4` varchar(200) NOT NULL,
  `use_computer` varchar(50) NOT NULL,
  `if_yes_how_well` varchar(20) NOT NULL,
  `do_drive` varchar(50) NOT NULL,
  `how_long` varchar(50) NOT NULL,
  `licensed` varchar(50) NOT NULL,
  `do_u_play_instrument` varchar(50) NOT NULL,
  `if_yes_list` varchar(100) NOT NULL,
  `talented_art_work` varchar(100) NOT NULL,
  `photo` longblob
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `membership`
--

INSERT INTO `membership` (`id`, `name`, `sex`, `call_up_no`, `state_code`, `phone_no`, `e_mail`, `state_of_origin`, `lga`, `DOB`, `POB`, `perm_home_address`, `langaues_spoken`, `engagement_status`, `health_challenge`, `if_state_yes`, `name_kin`, `phone_kin_no`, `institutions_attended`, `course`, `date`, `name_secular_school`, `post_held`, `date_secular`, `born_again`, `if_yes_when`, `conversion_experience_yes`, `local_church_attended`, `fellowship`, `have_baptized`, `baptized_when`, `have_baptized_holy_spirit`, `walk_God_been`, `church_group`, `post_held_group`, `date_church_group`, `do_have_ministry_own`, `do_have_special_calling`, `if_yes_details`, `do_u_intend_serve_christian`, `if_yes_give_details`, `do_u_redeploy`, `if_yes_why`, `stay_family_house`, `willing_to_serve`, `name_leader`, `number_christian_leader`, `fellowship_church`, `unit_1`, `unit_2`, `unit_3`, `unit_4`, `use_computer`, `if_yes_how_well`, `do_drive`, `how_long`, `licensed`, `do_u_play_instrument`, `if_yes_list`, `talented_art_work`, `photo`) VALUES
(0, '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0,0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0',0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0 ', '0 ', '0 ', '0 ', '0', '0', '0', '0', '0', '0',
 '0', '0',0 
--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `attendance`
--
ALTER TABLE `attendance`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UNIQUE` (`serial_number`);

--
-- Indexes for table `membership`
--
ALTER TABLE `membership`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `e_mail` (`e_mail`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `attendance`
--
ALTER TABLE `attendance`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `membership`
--
ALTER TABLE `membership`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;