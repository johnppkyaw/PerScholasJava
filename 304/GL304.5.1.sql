SELECT orderNumber, SUM(quantityOrdered) as Qty,
    IF(MOD(SUM(quantityOrdered),2),'Odd', 'Even') as oddOrEven
FROM    orderdetails
GROUP BY    orderNumber
ORDER BY    orderNumber; 

SELECT TRUNCATE(1.555,1);

SELECT productCode, AVG(quantityOrdered * priceEach) as avg_order_value
FROM orderDetails
GROUP BY productCode
Order by avg_order_value DESC;

SELECT productCode, Round(AVG(quantityOrdered * priceEach)) as avg_order_value
FROM orderDetails
GROUP BY productCode
Order by avg_order_value DESC;

SELECT   TRUNCATE(1.999,1),  ROUND(1.999,1);

SELECT productDescription from products WHERE productDescription LIKE 'This%';

Update products SET
	productDescription = replace(productDescription, 'This', 'That')
    where productDescription LIKE 'This%';
SELECT productDescription from products WHERE productDescription LIKE 'That%';

Update products SET
	productDescription = replace(productDescription, 'That', 'This')
    where productDescription LIKE 'That%';

SELECT DATEDIFF('2011-08-17','2011-08-17');  
SELECT DATEDIFF('2011-08-17','2011-08-08'); 
SELECT DATEDIFF('2011-08-08','2011-08-17');  

SELECT orderNumber, DATEDIFF(requiredDate, shippedDate) as  daysLeft
FROM     orders
ORDER BY  daysLeft DESC;

SELECT orderNumber, DATEDIFF(requiredDate, orderDate) as remaining_days
FROM    orders
WHERE    status = 'In Process'
ORDER BY remaining_days;

SELECT 
    orderNumber,
    ROUND(DATEDIFF(requiredDate, orderDate) / 7, 2),
    ROUND(DATEDIFF(requiredDate, orderDate) / 30,2)
FROM     orders 
WHERE    status = 'In Process';

SELECT 
    orderNumber,
    DATE_FORMAT(orderdate, '%Y-%m-%d') orderDate,
    DATE_FORMAT(requireddate, '%a %D %b %Y') requireddate,
    DATE_FORMAT(shippedDate, '%W %D %M %Y') shippedDate
FROM    orders;

SELECT     orderNumber,
    DATE_FORMAT(shippeddate, '%W %D %M %Y')  as 'Shipped date'
FROM    orders
ORDER BY 'Shipped date';

SELECT LPAD('hi',4,'??'); 
SELECT LPAD('hi',1,'??');

SELECT firstName, LPAD(firstName,10,'kk'), LPAD(firstName,5,'kk'), LPAD(firstName,4,'kk') FROM classicmodels.employees;

SELECT TRIM(' SQL TRIM Function ');
SELECT LTRIM('  MySQL LTRIM function');
SELECT CHAR_LENGTH('SQL RTRIM function   ') as 'Length of original string', LTRIM('SQL RTRIM function   ') as 'Trimmed', CHAR_LENGTH(RTRIM('SQL RTRIM function   ')) as 'Length of result string';

SELECT YEAR('2002-01-01');

SELECT YEAR(shippeddate) as year,  COUNT(ordernumber) as orderQty
FROM    orders 
GROUP BY YEAR(shippeddate)
ORDER BY YEAR(shippeddate);

SELECT DAY('2022-01-15');

SELECT  DAY(orderdate) as dayofmonth, COUNT(*)
FROM    orders WHERE    YEAR(orderdate) = 2004
GROUP BY dayofmonth
ORDER BY dayofmonth;














