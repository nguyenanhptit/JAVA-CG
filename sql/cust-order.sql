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