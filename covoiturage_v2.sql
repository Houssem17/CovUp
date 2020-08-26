-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 12, 2017 at 07:20 PM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `covoiturage_v2`
--

-- --------------------------------------------------------

--
-- Table structure for table `actualite`
--

CREATE DATABASE IF NOT EXISTS `covoiturage_v2` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `covoiturage_v2`;


CREATE TABLE `actualite` (
  `id` int(11) NOT NULL,
  `date_publication` date NOT NULL,
  `contenu` text NOT NULL,
  `id_utilisateur` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `agence`
--

CREATE TABLE `agence` (
  `id` int(11) NOT NULL,
  `login` varchar(30) NOT NULL,
  `password` varchar(50) NOT NULL,
  `nom` varchar(50) NOT NULL,
  `adresse` varchar(200) NOT NULL,
  `description` text NOT NULL,
  `email` varchar(50) NOT NULL,
  `tel` int(11) NOT NULL,
  `date_suspension` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `demande_covoiturage`
--

CREATE TABLE `demande_covoiturage` (
  `id_demandeur` int(11) NOT NULL,
  `id_covoiturage` int(11) NOT NULL,
  `est_accepte` tinyint(1) NOT NULL,
  `commentaire` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `demande_megavoiturage`
--

CREATE TABLE `demande_megavoiturage` (
  `id_demandeur` int(11) NOT NULL,
  `id_megavoiturage` int(11) NOT NULL,
  `commentaire` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `evaluation`
--

CREATE TABLE `evaluation` (
  `id` int(11) NOT NULL,
  `note` int(11) NOT NULL,
  `commentaire` text NOT NULL,
  `id_evaluateur` int(11) NOT NULL,
  `id_evalue` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `evenement`
--

CREATE TABLE `evenement` (
  `id` int(11) NOT NULL,
  `description` text NOT NULL,
  `date_pub` int(11) NOT NULL,
  `date_evenement` int(11) NOT NULL,
  `lieu` int(11) NOT NULL,
  `propose_par` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `offre_agence`
--

CREATE TABLE `offre_agence` (
  `id_agence` int(11) NOT NULL,
  `id_megavoiturage` int(11) NOT NULL,
  `prix` float NOT NULL,
  `description` text NOT NULL,
  `est_accepte` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `offre_covoiturage`
--

CREATE TABLE `offre_covoiturage` (
  `id` int(11) NOT NULL,
  `id_offreur` int(11) NOT NULL,
  `source` varchar(50) NOT NULL,
  `destination` varchar(50) NOT NULL,
  `nb_places` int(11) NOT NULL,
  `prix` float NOT NULL,
  `description` text NOT NULL,
  `est_regulier` tinyint(1) NOT NULL,
  `id_regularite` int(11) NOT NULL,
  `date_pub` date NOT NULL,
  `date_offre` date NOT NULL,
  `id_evenement` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `offre_megavoiturage`
--

CREATE TABLE `offre_megavoiturage` (
  `id` int(11) NOT NULL,
  `id_offreur` int(11) NOT NULL,
  `nb_places` int(11) NOT NULL,
  `source` varchar(50) NOT NULL,
  `destination` varchar(50) NOT NULL,
  `prix` float NOT NULL,
  `description` text NOT NULL,
  `date_pub` date NOT NULL,
  `offre_accepte` int(11) NOT NULL,
  `etat` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `regularite`
--

CREATE TABLE `regularite` (
  `id` int(11) NOT NULL,
  `lundi` tinyint(1) NOT NULL,
  `mardi` tinyint(1) NOT NULL,
  `mercredi` tinyint(1) NOT NULL,
  `jeudi` tinyint(1) NOT NULL,
  `vendredi` tinyint(1) NOT NULL,
  `samedi` tinyint(1) NOT NULL,
  `dimanche` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `shout`
--

CREATE TABLE `shout` (
  `id` int(11) NOT NULL,
  `text` text NOT NULL,
  `date_publication` date NOT NULL,
  `id_user` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `utilisateur`
--

CREATE TABLE `utilisateur` (
  `id` int(11) NOT NULL,
  `nom` varchar(30) NOT NULL,
  `prenom` varchar(30) NOT NULL,
  `genre` char(1) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(50) NOT NULL,
  `cin` int(11) NOT NULL,
  `date_naissance` date NOT NULL,
  `date_inscrit` date NOT NULL,
  `tel` int(11) NOT NULL,
  `est_bloque` tinyint(1) NOT NULL,
  `est_admin` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `actualite`
--
ALTER TABLE `actualite`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_utilisateur` (`id_utilisateur`);

--
-- Indexes for table `agence`
--
ALTER TABLE `agence`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `demande_covoiturage`
--
ALTER TABLE `demande_covoiturage`
  ADD PRIMARY KEY (`id_demandeur`,`id_covoiturage`),
  ADD KEY `fk_demandeur` (`id_demandeur`),
  ADD KEY `fk_covoiturage` (`id_covoiturage`);

--
-- Indexes for table `demande_megavoiturage`
--
ALTER TABLE `demande_megavoiturage`
  ADD PRIMARY KEY (`id_demandeur`,`id_megavoiturage`),
  ADD KEY `fk_demandeur` (`id_demandeur`),
  ADD KEY `fk_megavoiturage` (`id_megavoiturage`);

--
-- Indexes for table `evaluation`
--
ALTER TABLE `evaluation`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_evaluateur_utilisateur` (`id_evaluateur`),
  ADD KEY `fk_evalue_utilisateur` (`id_evalue`);

--
-- Indexes for table `evenement`
--
ALTER TABLE `evenement`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_utilisateur` (`propose_par`);

--
-- Indexes for table `offre_agence`
--
ALTER TABLE `offre_agence`
  ADD PRIMARY KEY (`id_agence`,`id_megavoiturage`),
  ADD KEY `fk_megavoiturage` (`id_megavoiturage`),
  ADD KEY `fk_agence` (`id_agence`);

--
-- Indexes for table `offre_covoiturage`
--
ALTER TABLE `offre_covoiturage`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_evenement` (`id_evenement`),
  ADD KEY `fk_utilisateur` (`id_offreur`),
  ADD KEY `fk_regularite` (`id_regularite`);

--
-- Indexes for table `offre_megavoiturage`
--
ALTER TABLE `offre_megavoiturage`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_utilisateur` (`id_offreur`),
  ADD KEY `fk_offre` (`offre_accepte`);

--
-- Indexes for table `regularite`
--
ALTER TABLE `regularite`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `shout`
--
ALTER TABLE `shout`
  ADD PRIMARY KEY (`id`),
  ADD KEY `shout_user` (`id_user`);

--
-- Indexes for table `utilisateur`
--
ALTER TABLE `utilisateur`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username_unique` (`username`),
  ADD UNIQUE KEY `cin_unique` (`cin`),
  ADD UNIQUE KEY `tel_unique` (`tel`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `actualite`
--
ALTER TABLE `actualite`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `agence`
--
ALTER TABLE `agence`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `evaluation`
--
ALTER TABLE `evaluation`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `evenement`
--
ALTER TABLE `evenement`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `offre_covoiturage`
--
ALTER TABLE `offre_covoiturage`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `offre_megavoiturage`
--
ALTER TABLE `offre_megavoiturage`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `regularite`
--
ALTER TABLE `regularite`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `shout`
--
ALTER TABLE `shout`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `utilisateur`
--
ALTER TABLE `utilisateur`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `evaluation`
--
ALTER TABLE `evaluation`
  ADD CONSTRAINT `fk_evaluateur` FOREIGN KEY (`id_evaluateur`) REFERENCES `utilisateur` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `fk_evalue` FOREIGN KEY (`id_evalue`) REFERENCES `utilisateur` (`id`) ON DELETE CASCADE;

--
-- Constraints for table `offre_covoiturage`
--
ALTER TABLE `offre_covoiturage`
  ADD CONSTRAINT `fk_demandeur` FOREIGN KEY (`id_offreur`) REFERENCES `utilisateur` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `fk_regularite` FOREIGN KEY (`id_regularite`) REFERENCES `regularite` (`id`);

--
-- Constraints for table `shout`
--
ALTER TABLE `shout`
  ADD CONSTRAINT `fk_shout_user` FOREIGN KEY (`id_user`) REFERENCES `utilisateur` (`id`) ON DELETE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
