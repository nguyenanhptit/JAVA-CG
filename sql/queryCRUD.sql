select customers.customerNumber, customers.contactLastName, customers.contactFirstName, customers.phone, customers.city 
from customers where customers.contactFirstName = 'Peter' and customers.city = 'Melbourne';


select customers.customerNumber, customers.contactLastName, customers.contactFirstName, customers.phone, customers.city 
from customers where customers.contactFirstName like '%A%'
or customers.customerNumber between 103 and 125
or customers.city in('USA' , 'France')
order by customers.contactFirstName desc;

-- insert into customers ( customers.customerNumber, customers.customerName, customers.contactFirstName, customers.contactLastName
-- ,customers.phone, customers.addressLine1, customers.city, customers.country)
-- values ( 500, 'AgileLead', 'Lan', 'Tran', '09690558996' , ' ham nghi', 'Hanoi', 'VietNam' );

select * from customers where customers.country = 'VietNam';

-- update customers set customers.customerName ="Baane Mini Import"
-- where customers.customerNumber =103;

-- delete from customers
-- where city = 'Nantes' ;
