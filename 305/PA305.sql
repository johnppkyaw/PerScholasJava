CREATE database IF NOT EXISTS PA305;

Use PA305;

CREATE TABLE Customer (
    id int PRIMARY KEY auto_increment,
    email VARCHAR(50) NOT NULL,
    fname VARCHAR(50) NOT NULL,
    lname VARCHAR(50) NOT NULL);

CREATE TABLE Item (
    id int PRIMARY KEY auto_increment,
    name VARCHAR(50) NOT NULL,
    price decimal(4, 2) NOT NULL);
    
