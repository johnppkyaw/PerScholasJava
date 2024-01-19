SELECT customerNumber, customerName, orderNumber, orderDate, productCode, productName, buyPrice from products
inner join orderdetails using(productCode)
inner join orders using(orderNumber)
inner join customers using(customerNumber);





