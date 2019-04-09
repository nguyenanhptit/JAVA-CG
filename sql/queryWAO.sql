select productCode, productName, buyPrice, quantityInStock from products
where buyPrice > 56.76 and quantityInStock >10;

select productCode, productName, buyPrice, textDescription from products
join productlines
on products.productLine = productlines.productLine
where buyPrice > 56.76 AND buyprice < 95.59;

select productLine from productlines;
select productLine from products;

select productCode, productName, buyprice, quantityInStock, productVendor, productLine 
from products 
where productLine = 'Classic Cars' or productVendor = 'Min Lin Diecast'