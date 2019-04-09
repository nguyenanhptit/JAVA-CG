select orders.status from orders group by orders.status;

select orders.status, count(*) as 'so luong status' from orders group by orders.status 	;

select distinct orders.status from orders;

select orders.status , sum(orderdetails.quantityOrdered * orderdetails.priceEach) as amout
from orders join orderdetails on orders.orderNumber = orderdetails.orderNumber
group by orders.status;

select orderdetails.orderNumber, sum(orderdetails.quantityOrdered * orderdetails.priceEach) as total
from orderdetails group by orderdetails.orderNumber;

select year(orders.orderDate)as year, sum(orderdetails.quantityOrdered * orderdetails.priceEach) as total 
from orders join orderdetails on orders.orderDate = orderdetails.orderNumber
where orders.status = 'shipped'
group by year
having year >2003;
