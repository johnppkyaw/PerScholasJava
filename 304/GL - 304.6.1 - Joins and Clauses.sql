SELECT c.customerName as 'Customer Name', concat(e.lastName, ', ', e.firstName) as 'Sales Rep' from customers c JOIN employees e on c.salesRepEmployeeNumber = e.employeeNumber order by c.customerName ASC;

SELECT p.productName as 'Product Name', SUM(o.quantityOrdered) 'Total # Ordered', SUM(o.quantityOrdered * o.priceEach) 'Total Sale' from products p join orderdetails o on p.productCode = o.productCode group by p.productName order by 3 DESC;

select status as 'Order Status', count(status) as 'Total Orders'
from orders
group by status
order by status;

SELECT p.productLine 'Product Line', SUM(o.quantityOrdered) 'Total Sold' FROM products p Join orderdetails o on p.productCode =  o.productCode group by p.productLine order by 2 desc;

Select monthname(paymentDate) 'Month', Year(paymentDate) 'Year', SUM(amount) 'Payments Received' FROM payments group by Year, Month;

SELECT productName 'Name', productLine 'Product Line', productScale 'Scale', productVendor 'Vendor' from products where productLine = 'Classic Cars' or productLine = 'Vintage Cars' order by productLine DESC, Name;

