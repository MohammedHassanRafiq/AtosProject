CREATE DATABASE RoyalMail;
use RoyalMail;
CREATE TABLE person(
id INT NOT NULL UNIQUE AUTO_INCREMENT,
Firstname VARCHAR(200) NOT NULL,
Secondname VARCHAR(200) NOT NULL,
PhoneNumber INT NOT NULL,
Address VARCHAR(200) NOT NULL,
PRIMARY KEY(id));

INSERT INTO person(Firstname, Secondname, PhoneNumber, Address) VALUES("Hassan","Rafiq",07752270,"Erdington");

