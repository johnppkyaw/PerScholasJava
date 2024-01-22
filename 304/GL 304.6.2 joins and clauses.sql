SELECT p.NAME 'Product', pt.NAME 'Type' from product p 
	join product_type pt on p.PRODUCT_TYPE_CD = pt.PRODUCT_TYPE_CD;
    
SELECT b.NAME 'Name', b.CITY 'City', e.LAST_NAME 'Last Name', e.TITLE 'Title' from branch b join employee e on b.BRANCH_ID = e.ASSIGNED_BRANCH_ID;

SELECT DISTINCT TITLE FROM employee;

SELECT e.LAST_NAME 'Last Name', e.TITLE 'Title', b.LAST_NAME 'Boss Name', b.TITLE 'Boss Title' from employee e LEFT JOIN employee b ON e.SUPERIOR_EMP_ID = b.EMP_ID;

SELECT p.NAME 'Product Name', a.AVAIL_BALANCE 'Available Balance', i.LAST_NAME 'Customer''s Last Name' from product p 
	join account a on p.PRODUCT_CD = a.PRODUCT_CD
    left join individual i on a.CUST_ID = i.CUST_ID;

SELECT at.*, i.LAST_NAME from acc_transaction at
	INNER JOIN account a on at.ACCOUNT_ID = a.ACCOUNT_ID
    LEFT JOIN individual i on a.CUST_ID = i.CUST_ID
    WHERE i.LAST_NAME Like 'T%';

SELECT ac.*, i.LAST_NAME FROM acc_transaction ac
INNER JOIN account a ON ac.ACCOUNT_ID = a.ACCOUNT_ID
INNER JOIN customer c ON a.CUST_ID = c.CUST_ID
INNER JOIN individual i ON c.CUST_ID = i.CUST_ID
WHERE i.LAST_NAME RLIKE "T.*";


