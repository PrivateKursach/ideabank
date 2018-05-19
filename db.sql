CREATE SCHEMA `ideabank` ;

CREATE TABLE `ideabank`.`ib_user` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(50) NOT NULL,
  `last_name` VARCHAR(50) NOT NULL,
  `email` VARCHAR(100) NOT NULL,
  `password` VARCHAR(100) NOT NULL,
  `role` INT NOT NULL DEFAULT 1,
  PRIMARY KEY (`id`));

CREATE TABLE `ideabank`.`ib_request` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `user_id` BIGINT(20) NOT NULL,
  `status` INT NOT NULL DEFAULT 0,
  `date_created` VARCHAR(45) NOT NULL,
  `question1_fio` VARCHAR(200) NULL,
  `question2_age` VARCHAR(50) NULL,
  `question3_address` VARCHAR(300) NULL,
  `question4_phone` VARCHAR(50) NULL,
  `question5_email` VARCHAR(100) NULL,
  `question6_reason` TEXT NULL,
  `question7_area` VARCHAR(100) NULL,
  `question8_unique` TEXT NULL,
  `question9_term` VARCHAR(50) NULL,
  `question10_money` VARCHAR(50) NULL,
  `question11_support` TEXT NULL,
  PRIMARY KEY (`id`),
  INDEX `ib_request_fk1_idx` (`user_id` ASC),
  CONSTRAINT `ib_request_fk1`
    FOREIGN KEY (`user_id`)
    REFERENCES `ideabank`.`ib_user` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);
