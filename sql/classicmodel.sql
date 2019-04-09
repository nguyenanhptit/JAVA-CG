 -- SELECT * FROM classicmodels.customers;
-- UPDATE `classicmodels`.`customers` SET `addressLine2` = 'hanoi' WHERE (`customerNumber` = '103');
-- DELETE FROM `classicmodels`.`customers` WHERE (`customerNumber` = '103');
-- INSERT INTO `classicmodels`.`customers` (`customerNumber`, `customerName`, `contactLastName`, `contactFirstName`, `phone`, `addressLine1`, `addressLine2`, `city`, `state`, `postalCode`, `salesRepEmployeeNumber`, `creditLimit`) VALUES ('345', 'bibi', 'lo', 'sdf', '6996', 'dsfsdf', 'fdfdf', 'sdgdfg', 'sdfsdd', '', '215', '1655');

select customerName, customerNumber, phone, city, country from customers
where  customers.customerName =  'Atelier graphique' 
-- or customers.customerName like '%A%' 
or customers.city in ('Las Vegas', 'NYC' );
select orderNumber, orderDate , status from orders 
where -- orders.orderNumber between 10100 and 10110
		orders.orderDate <= 2003-03-03 or orders.status like '%shipped%';
