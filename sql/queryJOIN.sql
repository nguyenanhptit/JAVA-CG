select customers.customerNumber, customers.customerName, customers.phone,payments.paymentDate ,payments.amount 
from customers
join payments
on customers.customerNumber = payments.customerNumber
where customers.phone like '%38%';

select customers.customerNumber, customers.customerName, orders.orderNumber, orders.status 
from customers left join orders
on customers.customerNumber = orders.customerNumber
where orders.orderNumber is null;