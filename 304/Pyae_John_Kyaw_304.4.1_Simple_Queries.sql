SELECT productName 'Name', productLine 'Product Line', buyPrice 'Buy Price' FROM products;
SELECT contactFirstName 'First Name', contactLastName 'Last Name', city City FROM customers WHERE country='Germany' ORDER BY contactLastname DESC;
SELECT DISTINCT status FROM orders;
SELECT * FROM payments WHERE paymentDate >= '2005-01-01' ORDER BY paymentDate DESC;
SELECT lastName 'Last Name', firstName 'First Name', email 'Email Address', jobTitle 'Job Title' from employees WHERE officeCode=1 ORDER BY lastName; 
SELECT productName Name, productLine 'Product Line', productScale Scale, productVendor Vendor FROM products WHERE productLine = 'Vintage Cars' OR productLine = 'Classic Cars' ORDER BY productLine DESC, productName;