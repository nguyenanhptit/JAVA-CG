CREATE TABLE contacts
( contact_id INT(11) NOT NULL AUTO_INCREMENT,
  last_name VARCHAR(30) NOT NULL,
  first_name VARCHAR(25),
  birthday DATE,
  CONSTRAINT contacts_pk PRIMARY KEY (contact_id)
);

CREATE TABLE suppliers
( supplier_id INT(11) NOT NULL AUTO_INCREMENT,
  supplier_name VARCHAR(50) NOT NULL,
  account_rep VARCHAR(30) NOT NULL DEFAULT 'TBD',
  CONSTRAINT suppliers_pk PRIMARY KEY (supplier_id)
);

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


create table customers(
id int AUTO_INCREMENT primary key,
name varchar(40),
address varchar(225),
email varchar(255)
);

create table orders(
orderid int auto_increment primary key,
staff varchar(50),
customer_id int references customers(id)
);
-- ALTER TABLE table_name
--     ADD PRIMARY KEY(primary_key_column);