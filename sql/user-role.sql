CREATE TABLE `my_db`.`users` (
  `user_id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  `email` VARCHAR(255) NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE INDEX `user_id_UNIQUE` (`user_id` ASC));

CREATE TABLE roles(
   role_id INT AUTO_INCREMENT,
   role_name VARCHAR(50),
   PRIMARY KEY(role_id)
);

Create table userroles(
user_id int not null,
role_id int not null,
primary key(user_id, role_id),
foreign key (user_id) references users(user_id),
foreign key(role_id) references roles(role_id));

-- ALTER TABLE table_name
--     ADD PRIMARY KEY(primary_key_column);