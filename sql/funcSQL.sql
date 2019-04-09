select avg(buyPrice) from products;
select count(*) from products;
select max(buyprice) from products;
select min(buyprice) from products;
select sum(quantityInStock) from products;
select sum(quantityInStock) from products where productline = 'Motorcycles';
select ucase(productName) from products;
select lcase(productName) from products;
select len(productname) from products where productcode = 'S10_1678';

select productVendor, count(productcode) from products
where productline = 'Motorcycles'
group by productVendor
order by productVendor;







