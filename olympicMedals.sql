-- if the user "student" does not already exist, it will create it
CREATE USER 'student'@'localhost' IDENTIFIED BY 'student';
GRANT ALL PRIVILEGES ON * . * TO 'student'@'localhost';

CREATE DATABASE javaProject3;
USE javaProject3;

DROP TABLE IF EXISTS olympicMedalsList;

CREATE TABLE olympicMedalsList (
countryID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
country VARCHAR(30),
gold INT,
silver INT,
bronze INT,
totalMedals INT
);

INSERT INTO olympicMedalsList (countryID, country, gold, silver, bronze, totalMedals) VALUES (1, 'India', 159, 57, 201, 417);
INSERT INTO olympicMedalsList (countryID, country, gold, silver, bronze, totalMedals) VALUES (2, 'Canada', 100, 47, 101, 248);
INSERT INTO olympicMedalsList (countryID, country, gold, silver, bronze, totalMedals) VALUES (3, 'United States of America', 59, 7, 201, 267);
INSERT INTO olympicMedalsList (countryID, country, gold, silver, bronze, totalMedals) VALUES (4, 'Brazil', 15, 5, 20, 40);
INSERT INTO olympicMedalsList (countryID, country, gold, silver, bronze, totalMedals) VALUES (5, 'Pakistan', 189, 17, 301, 507);
INSERT INTO olympicMedalsList (countryID, country, gold, silver, bronze, totalMedals) VALUES (6, 'Australia', 19, 59, 10, 88);
INSERT INTO olympicMedalsList (countryID, country, gold, silver, bronze, totalMedals) VALUES (7, 'United Kingdom', 9, 5, 21, 35);
INSERT INTO olympicMedalsList (countryID, country, gold, silver, bronze, totalMedals) VALUES (8, 'New Zealand', 99, 37, 2, 138);
INSERT INTO olympicMedalsList (countryID, country, gold, silver, bronze, totalMedals) VALUES (9, 'South Africa', 59, 57, 54, 170);

SELECT *
FROM olympicMedalsList;

select country, totalMedals
from olympicMedalsList
group by countryID;