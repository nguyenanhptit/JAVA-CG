-- MySQL Script generated by MySQL Workbench
-- Mon 08 Apr 2019 11:13:32 AM +07
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema rentbook
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema rentbook
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `rentbook` ;
USE `rentbook` ;

-- -----------------------------------------------------
-- Table `rentbook`.`categories`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `rentbook`.`categories` (
  `id_category` INT NOT NULL AUTO_INCREMENT,
  `name_category` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_category`),
  UNIQUE INDEX `id_category_UNIQUE` (`id_category` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `rentbook`.`students`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `rentbook`.`students` (
  `id_studen` INT NOT NULL AUTO_INCREMENT,
  `student_name` VARCHAR(45) NOT NULL,
  `address` VARCHAR(45) NOT NULL,
  `phone` INT NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_studen`),
  UNIQUE INDEX `id_studen_UNIQUE` (`id_studen` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `rentbook`.`BorrowOrders`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `rentbook`.`BorrowOrders` (
  `id_BorrowOrder` INT NOT NULL AUTO_INCREMENT,
  `name_borroworder` VARCHAR(45) NOT NULL,
  `numberOfbook` INT NOT NULL,
  `start_date` DATE NOT NULL,
  `end_date` DATE NOT NULL,
  `students_id_studen` INT NOT NULL,
  PRIMARY KEY (`id_BorrowOrder`),
  UNIQUE INDEX `id_BorrowOrder_UNIQUE` (`id_BorrowOrder` ASC),
  INDEX `fk_BorrowOrders_students1_idx` (`students_id_studen` ASC),
  CONSTRAINT `fk_BorrowOrders_students1`
    FOREIGN KEY (`students_id_studen`)
    REFERENCES `rentbook`.`students` (`id_studen`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `rentbook`.`books`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `rentbook`.`books` (
  `id_book` INT NOT NULL AUTO_INCREMENT,
  `book_name` VARCHAR(45) NOT NULL,
  `categories_id_category` INT NOT NULL,
  `BorrowOrders_id_BorrowOrder` INT NOT NULL,
  PRIMARY KEY (`id_book`),
  UNIQUE INDEX `id_book_UNIQUE` (`id_book` ASC),
  INDEX `fk_books_categories_idx` (`categories_id_category` ASC),
  INDEX `fk_books_BorrowOrders1_idx` (`BorrowOrders_id_BorrowOrder` ASC),
  CONSTRAINT `fk_books_categories`
    FOREIGN KEY (`categories_id_category`)
    REFERENCES `rentbook`.`categories` (`id_category`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_books_BorrowOrders1`
    FOREIGN KEY (`BorrowOrders_id_BorrowOrder`)
    REFERENCES `rentbook`.`BorrowOrders` (`id_BorrowOrder`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;